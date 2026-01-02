package h3;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b extends w0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0.a f2162b;

    public /* synthetic */ b(b0.a aVar, int i) {
        this.f2161a = i;
        this.f2162b = aVar;
    }

    @Override // w0.a
    public final int b(View view, int i) {
        int i9;
        int i10;
        switch (this.f2161a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = this.f2162b;
                w3.a aVar = sideSheetBehavior.a;
                switch (aVar.f6432a) {
                    case 0:
                        i9 = -aVar.f6433b.l;
                        break;
                    default:
                        i9 = aVar.a();
                        break;
                }
                w3.a aVar2 = sideSheetBehavior.a;
                switch (aVar2.f6432a) {
                    case 0:
                        i10 = aVar2.f6433b.o;
                        break;
                    default:
                        i10 = aVar2.f6433b.m;
                        break;
                }
                return c4.b.h(i, i9, i10);
        }
    }

    @Override // w0.a
    public final int c(View view, int i) {
        switch (this.f2161a) {
            case 0:
                return c4.b.h(i, this.f2162b.C(), e());
            default:
                return view.getTop();
        }
    }

    @Override // w0.a
    public int d(View view) {
        switch (this.f2161a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = this.f2162b;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.d(view);
        }
    }

    @Override // w0.a
    public int e() {
        switch (this.f2161a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = this.f2162b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.e();
        }
    }

    @Override // w0.a
    public final void g(int i) {
        switch (this.f2161a) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = this.f2162b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.I(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = this.f2162b;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.w(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // w0.a
    public final void h(View view, int i, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f2161a) {
            case 0:
                this.f2162b.y(i9);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = this.f2162b;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    w3.a aVar = sideSheetBehavior.a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (aVar.f6432a) {
                        case 0:
                            if (left <= aVar.f6433b.m) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i10 = aVar.f6433b.m;
                            if (left <= i10) {
                                marginLayoutParams.rightMargin = i10 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                w3.a aVar2 = sideSheetBehavior.a;
                switch (aVar2.f6432a) {
                    case 0:
                        aVar2.b();
                        aVar2.a();
                        break;
                    default:
                        int i11 = aVar2.f6433b.m;
                        aVar2.a();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw v1.a.e(it);
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01be, code lost:
        if (java.lang.Math.abs(r7 - r0.D) < java.lang.Math.abs(r7 - r0.G)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 > 0.0f) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
        r1 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        switch(r1.f6432a) {
            case 0: goto L48;
            default: goto L11;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        r1 = r1.f6433b;
        r2 = java.lang.Math.abs((r1.k * r7) + r6.getRight());
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r2 <= 0.5f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r1 = r1.f6433b;
        r2 = java.lang.Math.abs((r1.k * r7) + r6.getLeft());
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r2 <= 0.5f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r1 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        switch(r0.a.f6432a) {
            case 0: goto L37;
            default: goto L17;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (java.lang.Math.abs(r7) <= java.lang.Math.abs(r8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (java.lang.Math.abs(r7) <= 500) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (java.lang.Math.abs(r7) <= java.lang.Math.abs(r8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (java.lang.Math.abs(r7) <= 500) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        if (r7 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        r7 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        switch(r7.f6432a) {
            case 0: goto L30;
            default: goto L25;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (r6.getLeft() <= ((r7.a() + r7.f6433b.m) / 2)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r6.getRight() >= ((r7.a() - r7.b()) / 2)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r7 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
        if (r7 == 0.0f) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (java.lang.Math.abs(r7) <= java.lang.Math.abs(r8)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
        r7 = r6.getLeft();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (java.lang.Math.abs(r7 - r0.a.a()) >= java.lang.Math.abs(r7 - r0.a.b())) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
        r0.y(r6, r7, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0104, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
        if (r7 > r0.E) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r7 < 0.0f) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
        if (java.lang.Math.abs(r6.getTop() - r0.C()) < java.lang.Math.abs(r6.getTop() - r0.E)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        r1 = false;
     */
    @Override // w0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.b.i(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
        if (r6.canScrollVertically(-1) != false) goto L35;
     */
    @Override // w0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f2161a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            b0.a r6 = r4.f2162b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            b0.a r0 = r4.f2162b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.d0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.b0
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.b.j(android.view.View, int):boolean");
    }
}
