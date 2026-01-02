package f2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f extends s {
    public static final String[] H = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b I = new b("topLeft", 0, PointF.class);
    public static final b J = new b("bottomRight", 1, PointF.class);
    public static final b K = new b("bottomRight", 2, PointF.class);
    public static final b L = new b("topLeft", 3, PointF.class);
    public static final b M = new b("position", 4, PointF.class);

    public static void M(a0 a0Var) {
        View view = a0Var.f1400b;
        HashMap hashMap = a0Var.f1399a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // f2.s
    public final void e(a0 a0Var) {
        M(a0Var);
    }

    @Override // f2.s
    public final void j(a0 a0Var) {
        M(a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.s
    public final Animator n(ViewGroup viewGroup, a0 a0Var, a0 a0Var2) {
        int i;
        f fVar;
        ObjectAnimator ofObject;
        if (a0Var != null) {
            HashMap hashMap = a0Var.f1399a;
            if (a0Var2 != null) {
                HashMap hashMap2 = a0Var2.f1399a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = a0Var2.f1400b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i9 = rect.left;
                    int i10 = rect2.left;
                    int i11 = rect.top;
                    int i12 = rect2.top;
                    int i13 = rect.right;
                    int i14 = rect2.right;
                    int i15 = rect.bottom;
                    int i16 = rect2.bottom;
                    int i17 = i13 - i9;
                    int i18 = i15 - i11;
                    int i19 = i14 - i10;
                    int i20 = i16 - i12;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i17 == 0 || i18 == 0) && (i19 == 0 || i20 == 0)) {
                        i = 0;
                    } else {
                        i = (i9 == i10 && i11 == i12) ? 0 : 1;
                        if (i13 != i14 || i15 != i16) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i21 = i;
                    if (i21 > 0) {
                        c0.a(view, i9, i11, i13, i15);
                        if (i21 != 2) {
                            fVar = this;
                            if (i9 == i10 && i11 == i12) {
                                fVar.C.getClass();
                                ofObject = ObjectAnimator.ofObject(view, K, (TypeConverter) null, a6.e.e(i13, i15, i14, i16));
                            } else {
                                fVar.C.getClass();
                                ofObject = ObjectAnimator.ofObject(view, L, (TypeConverter) null, a6.e.e(i9, i11, i10, i12));
                            }
                        } else if (i17 == i19 && i18 == i20) {
                            fVar = this;
                            fVar.C.getClass();
                            ofObject = ObjectAnimator.ofObject(view, M, (TypeConverter) null, a6.e.e(i9, i11, i10, i12));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.C.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(eVar, I, (TypeConverter) null, a6.e.e(i9, i11, i10, i12));
                            fVar.C.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(eVar, J, (TypeConverter) null, a6.e.e(i13, i15, i14, i16));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new c(eVar));
                            ofObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            c4.b.d0(viewGroup4, true);
                            fVar.r().a(new d(viewGroup4));
                        }
                        return ofObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // f2.s
    public final String[] t() {
        return H;
    }
}
