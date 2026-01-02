package y3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import j6.o;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            h hVar = (h) message.obj;
            g gVar = hVar.i;
            if (gVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                if (layoutParams instanceof b0.d) {
                    b0.d dVar = (b0.d) layoutParams;
                    b0.a behavior = new BaseTransientBottomBar.Behavior();
                    o oVar = ((BaseTransientBottomBar.Behavior) behavior).i;
                    oVar.getClass();
                    oVar.f3275b = hVar.f6824t;
                    ((SwipeDismissBehavior) behavior).b = new e(hVar);
                    b0.a aVar = dVar.f683a;
                    if (aVar != behavior) {
                        if (aVar != null) {
                            aVar.i();
                        }
                        dVar.f683a = behavior;
                        dVar.f684b = true;
                    }
                    dVar.f689g = 80;
                }
                ViewGroup viewGroup = hVar.f6814g;
                gVar.q = true;
                viewGroup.addView(gVar);
                gVar.q = false;
                hVar.f();
                gVar.setVisibility(4);
            }
            if (gVar.isLaidOut()) {
                hVar.e();
                return true;
            }
            hVar.f6822r = true;
            return true;
        } else if (i != 1) {
            return false;
        } else {
            h hVar2 = (h) message.obj;
            int i9 = message.arg1;
            g gVar2 = hVar2.i;
            AccessibilityManager accessibilityManager = hVar2.f6823s;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || gVar2.getVisibility() != 0) {
                hVar2.c();
                return true;
            } else if (gVar2.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setInterpolator(hVar2.f6811d);
                ofFloat.addUpdateListener(new b(hVar2, 0));
                ofFloat.setDuration(hVar2.f6809b);
                ofFloat.addListener(new a(hVar2, i9, 0));
                ofFloat.start();
                return true;
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                g gVar3 = hVar2.i;
                int height = gVar3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = gVar3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(hVar2.f6812e);
                valueAnimator.setDuration(hVar2.f6810c);
                valueAnimator.addListener(new a(hVar2, i9, 2));
                valueAnimator.addUpdateListener(new b(hVar2, 3));
                valueAnimator.start();
                return true;
            }
        }
    }
}
