package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import q0.u0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1447a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1448b;

    public /* synthetic */ o(Object obj, int i) {
        this.f1447a = i;
        this.f1448b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1447a) {
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1448b;
                actionBarOverlayLayout.C = null;
                actionBarOverlayLayout.p = false;
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((u0) this.f1448b).b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1447a) {
            case 0:
                ((s) this.f1448b).p();
                animator.removeListener(this);
                return;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f1448b).k = null;
                return;
            case 2:
                ((HideViewOnScrollBehavior) this.f1448b).k = null;
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                g2.f fVar = (g2.f) this.f1448b;
                ArrayList arrayList = new ArrayList(fVar.f1707e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((k3.a) arrayList.get(i)).f3366b.u;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                return;
            case 4:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1448b;
                bottomSheetBehavior.I(5);
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) bottomSheetBehavior.W.get()).requestLayout();
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1448b;
                actionBarOverlayLayout.C = null;
                actionBarOverlayLayout.p = false;
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((u0) this.f1448b).a();
                return;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                r3.f fVar2 = (r3.f) this.f1448b;
                fVar2.f5559b.setTranslationY(0.0f);
                fVar2.b(0.0f);
                return;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1448b;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.p.get()).requestLayout();
                return;
            case 9:
                super.onAnimationEnd(animator);
                x3.e eVar = (x3.e) this.f1448b;
                ViewGroup d9 = q3.k.d(eVar);
                ViewOverlay overlay = d9 == null ? null : d9.getOverlay();
                if (overlay == null) {
                    return;
                }
                ArrayList arrayList2 = eVar.f6595r;
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    overlay.remove((b4.b) obj);
                }
                return;
            default:
                z3.k kVar = (z3.k) this.f1448b;
                kVar.p();
                kVar.f7216r.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1447a) {
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                g2.f fVar = (g2.f) this.f1448b;
                ArrayList arrayList = new ArrayList(fVar.f1707e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    MaterialCheckBox materialCheckBox = ((k3.a) arrayList.get(i)).f3366b;
                    ColorStateList colorStateList = materialCheckBox.u;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(materialCheckBox.y, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((u0) this.f1448b).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public o(u0 u0Var, View view) {
        this.f1447a = 6;
        this.f1448b = u0Var;
    }
}
