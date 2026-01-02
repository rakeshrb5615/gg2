package a2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public h0 f438a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f439b;

    /* renamed from: c  reason: collision with root package name */
    public long f440c;

    /* renamed from: d  reason: collision with root package name */
    public long f441d;

    /* renamed from: e  reason: collision with root package name */
    public long f442e;

    /* renamed from: f  reason: collision with root package name */
    public long f443f;

    public static void b(k1 k1Var) {
        RecyclerView recyclerView;
        int i = k1Var.j;
        if (k1Var.f() || (i & 4) != 0 || (recyclerView = k1Var.f390r) == null) {
            return;
        }
        recyclerView.J(k1Var);
    }

    public abstract boolean a(k1 k1Var, k1 k1Var2, o0 o0Var, o0 o0Var2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(a2.k1 r11) {
        /*
            r10 = this;
            a2.h0 r0 = r10.f438a
            if (r0 == 0) goto Lb5
            androidx.recyclerview.widget.RecyclerView r0 = r0.f343a
            r1 = 1
            r11.n(r1)
            android.view.View r2 = r11.f376a
            a2.k1 r3 = r11.f383h
            r4 = 0
            if (r3 == 0) goto L17
            a2.k1 r3 = r11.i
            if (r3 != 0) goto L17
            r11.f383h = r4
        L17:
            r11.i = r4
            int r3 = r11.j
            r3 = r3 & 16
            if (r3 == 0) goto L21
            goto Lb5
        L21:
            a2.z0 r3 = r0.c
            r0.j0()
            a2.d r4 = r0.f
            java.lang.Object r5 = r4.f295d
            a2.c r5 = (a2.c) r5
            java.lang.Object r6 = r4.f294c
            a2.h0 r6 = (a2.h0) r6
            int r7 = r4.f293b
            r8 = 0
            if (r7 != r1) goto L45
            java.lang.Object r1 = r4.f297f
            android.view.View r1 = (android.view.View) r1
            if (r1 != r2) goto L3d
        L3b:
            r1 = r8
            goto L6e
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r11.<init>(r0)
            throw r11
        L45:
            r9 = 2
            if (r7 == r9) goto Lad
            r4.f293b = r9     // Catch: java.lang.Throwable -> L59
            androidx.recyclerview.widget.RecyclerView r7 = r6.f343a     // Catch: java.lang.Throwable -> L59
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L59
            r9 = -1
            if (r7 != r9) goto L5b
            r4.A(r2)     // Catch: java.lang.Throwable -> L59
        L56:
            r4.f293b = r8
            goto L6e
        L59:
            r11 = move-exception
            goto Laa
        L5b:
            boolean r9 = r5.d(r7)     // Catch: java.lang.Throwable -> L59
            if (r9 == 0) goto L6b
            r5.f(r7)     // Catch: java.lang.Throwable -> L59
            r4.A(r2)     // Catch: java.lang.Throwable -> L59
            r6.i(r7)     // Catch: java.lang.Throwable -> L59
            goto L56
        L6b:
            r4.f293b = r8
            goto L3b
        L6e:
            if (r1 == 0) goto L99
            a2.k1 r4 = androidx.recyclerview.widget.RecyclerView.M(r2)
            r3.m(r4)
            r3.j(r4)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.G0
            if (r3 == 0) goto L99
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "RecyclerView"
            android.util.Log.d(r4, r3)
        L99:
            r3 = r1 ^ 1
            r0.l0(r3)
            if (r1 != 0) goto Lb5
            boolean r11 = r11.j()
            if (r11 == 0) goto Lb5
            r0.removeDetachedView(r2, r8)
            return
        Laa:
            r4.f293b = r8
            throw r11
        Lad:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r11.<init>(r0)
            throw r11
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.p0.c(a2.k1):void");
    }

    public abstract void d(k1 k1Var);

    public abstract void e();

    public abstract boolean f();
}
