package f2;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends s {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public final int H;

    public h(int i) {
        this();
        this.H = i;
    }

    public static void M(a0 a0Var) {
        View view = a0Var.f1400b;
        int visibility = view.getVisibility();
        HashMap hashMap = a0Var.f1399a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float O(a0 a0Var, float f9) {
        Float f10;
        return (a0Var == null || (f10 = (Float) a0Var.f1399a.get("android:fade:transitionAlpha")) == null) ? f9 : f10.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f2.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f2.h0 P(f2.a0 r8, f2.a0 r9) {
        /*
            f2.h0 r0 = new f2.h0
            r0.<init>()
            r1 = 0
            r0.f1430a = r1
            r0.f1431b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1399a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f1432c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1434e = r6
            goto L33
        L2f:
            r0.f1432c = r3
            r0.f1434e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1399a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f1433d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1435f = r2
            goto L56
        L52:
            r0.f1433d = r3
            r0.f1435f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f1432c
            int r9 = r0.f1433d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f1434e
            android.view.ViewGroup r4 = r0.f1435f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f1431b = r1
            r0.f1430a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f1431b = r2
            r0.f1430a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f1435f
            if (r8 != 0) goto L81
            r0.f1431b = r1
            r0.f1430a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f1434e
            if (r8 != 0) goto L9f
            r0.f1431b = r2
            r0.f1430a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f1433d
            if (r8 != 0) goto L95
            r0.f1431b = r2
            r0.f1430a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f1432c
            if (r8 != 0) goto L9f
            r0.f1431b = r1
            r0.f1430a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.P(f2.a0, f2.a0):f2.h0");
    }

    public final ObjectAnimator N(View view, float f9, float f10) {
        if (f9 == f10) {
            return null;
        }
        c0.f1403a.S(view, f9);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f1404b, f10);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        r().a(gVar);
        return ofFloat;
    }

    @Override // f2.s
    public final void e(a0 a0Var) {
        M(a0Var);
    }

    @Override // f2.s
    public final void j(a0 a0Var) {
        M(a0Var);
        View view = a0Var.f1400b;
        Float f9 = (Float) view.getTag(2131362552);
        if (f9 == null) {
            f9 = view.getVisibility() == 0 ? Float.valueOf(c0.f1403a.G(view)) : Float.valueOf(0.0f);
        }
        a0Var.f1399a.put("android:fade:transitionAlpha", f9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (P(q(r3, false), u(r3, false)).f1430a != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    @Override // f2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator n(android.view.ViewGroup r25, f2.a0 r26, f2.a0 r27) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.n(android.view.ViewGroup, f2.a0, f2.a0):android.animation.Animator");
    }

    @Override // f2.s
    public final String[] t() {
        return I;
    }

    @Override // f2.s
    public final boolean v(a0 a0Var, a0 a0Var2) {
        if (a0Var == null && a0Var2 == null) {
            return false;
        }
        if (a0Var == null || a0Var2 == null || a0Var2.f1399a.containsKey("android:visibility:visibility") == a0Var.f1399a.containsKey("android:visibility:visibility")) {
            h0 P = P(a0Var, a0Var2);
            if (P.f1430a) {
                return P.f1432c == 0 || P.f1433d == 0;
            }
            return false;
        }
        return false;
    }

    public h() {
        this.H = 3;
    }
}
