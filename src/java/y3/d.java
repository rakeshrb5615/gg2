package y3;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import q3.n;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f6788b;

    public /* synthetic */ d(h hVar, int i) {
        this.f6787a = i;
        this.f6788b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i = this.f6787a;
        h hVar = this.f6788b;
        switch (i) {
            case 0:
                g gVar = hVar.i;
                if (gVar != null) {
                    WindowManager windowManager = (WindowManager) hVar.f6815h.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = n.a(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    gVar.getLocationInWindow(iArr);
                    int height2 = (height - (gVar.getHeight() + iArr[1])) + ((int) gVar.getTranslationY());
                    int i9 = hVar.f6821p;
                    if (height2 >= i9) {
                        hVar.q = i9;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(h.f6807z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i10 = hVar.f6821p;
                    hVar.q = i10;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i10 - height2) + marginLayoutParams.bottomMargin;
                    gVar.requestLayout();
                    return;
                }
                return;
            case 1:
                hVar.c();
                return;
            default:
                g gVar2 = hVar.i;
                if (gVar2 == null) {
                    return;
                }
                if (gVar2.getParent() != null) {
                    gVar2.setVisibility(0);
                }
                if (gVar2.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setInterpolator(hVar.f6811d);
                    ofFloat.addUpdateListener(new b(hVar, 0));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat2.setInterpolator(hVar.f6813f);
                    ofFloat2.addUpdateListener(new b(hVar, 1));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(hVar.f6808a);
                    animatorSet.addListener(new a(hVar, 3));
                    animatorSet.start();
                    return;
                }
                int height3 = gVar2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = gVar2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                gVar2.setTranslationY(height3);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(height3, 0);
                valueAnimator.setInterpolator(hVar.f6812e);
                valueAnimator.setDuration(hVar.f6810c);
                valueAnimator.addListener(new a(hVar, 1));
                valueAnimator.addUpdateListener(new b(hVar, 2));
                valueAnimator.start();
                return;
        }
    }
}
