package a2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class h0 implements q0.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f343a;

    public void a(a aVar) {
        int i = aVar.f256a;
        RecyclerView recyclerView = this.f343a;
        if (i == 1) {
            recyclerView.s.Y(aVar.f257b, aVar.f258c);
        } else if (i == 2) {
            recyclerView.s.b0(aVar.f257b, aVar.f258c);
        } else if (i == 4) {
            recyclerView.s.c0(aVar.f257b, aVar.f258c);
        } else if (i != 8) {
        } else {
            recyclerView.s.a0(aVar.f257b, aVar.f258c);
        }
    }

    public k1 b(int i) {
        RecyclerView recyclerView = this.f343a;
        int u9 = recyclerView.f.u();
        int i9 = 0;
        k1 k1Var = null;
        while (true) {
            if (i9 >= u9) {
                break;
            }
            k1 M = RecyclerView.M(recyclerView.f.t(i9));
            if (M != null && !M.h() && M.f378c == i) {
                if (!((ArrayList) recyclerView.f.f296e).contains(M.f376a)) {
                    k1Var = M;
                    break;
                }
                k1Var = M;
            }
            i9++;
        }
        if (k1Var != null) {
            if (!((ArrayList) recyclerView.f.f296e).contains(k1Var.f376a)) {
                return k1Var;
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i, int i9) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f343a;
        int u9 = recyclerView.f.u();
        int i12 = i9 + i;
        for (int i13 = 0; i13 < u9; i13++) {
            View t7 = recyclerView.f.t(i13);
            k1 M = RecyclerView.M(t7);
            if (M != null && !M.o() && (i11 = M.f378c) >= i && i11 < i12) {
                M.a(2);
                M.a(1024);
                ((u0) t7.getLayoutParams()).f509c = true;
            }
        }
        z0 z0Var = recyclerView.c;
        ArrayList arrayList = z0Var.f552c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k1 k1Var = (k1) arrayList.get(size);
            if (k1Var != null && (i10 = k1Var.f378c) >= i && i10 < i12) {
                k1Var.a(2);
                z0Var.h(size);
            }
        }
        recyclerView.o0 = true;
    }

    public void d(int i, int i9) {
        RecyclerView recyclerView = this.f343a;
        int u9 = recyclerView.f.u();
        for (int i10 = 0; i10 < u9; i10++) {
            k1 M = RecyclerView.M(recyclerView.f.t(i10));
            if (M != null && !M.o() && M.f378c >= i) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i10 + " holder " + M + " now at position " + (M.f378c + i9));
                }
                M.l(i9, false);
                recyclerView.k0.f331f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.f552c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            k1 k1Var = (k1) arrayList.get(i11);
            if (k1Var != null && k1Var.f378c >= i) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i11 + " holder " + k1Var + " now at position " + (k1Var.f378c + i9));
                }
                k1Var.l(i9, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.n0 = true;
    }

    public void e(int i, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f343a;
        int u9 = recyclerView.f.u();
        if (i < i9) {
            i11 = i;
            i10 = i9;
            i12 = -1;
        } else {
            i10 = i;
            i11 = i9;
            i12 = 1;
        }
        boolean z9 = false;
        for (int i18 = 0; i18 < u9; i18++) {
            k1 M = RecyclerView.M(recyclerView.f.t(i18));
            if (M != null && (i17 = M.f378c) >= i11 && i17 <= i10) {
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i18 + " holder " + M);
                }
                if (M.f378c == i) {
                    M.l(i9 - i, false);
                } else {
                    M.l(i12, false);
                }
                recyclerView.k0.f331f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.f552c;
        if (i < i9) {
            i14 = i;
            i13 = i9;
            i15 = -1;
        } else {
            i13 = i;
            i14 = i9;
            i15 = 1;
        }
        int size = arrayList.size();
        int i19 = 0;
        while (i19 < size) {
            k1 k1Var = (k1) arrayList.get(i19);
            if (k1Var != null && (i16 = k1Var.f378c) >= i14 && i16 <= i13) {
                if (i16 == i) {
                    k1Var.l(i9 - i, z9);
                } else {
                    k1Var.l(i15, z9);
                }
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i19 + " holder " + k1Var);
                }
            }
            i19++;
            z9 = false;
        }
        recyclerView.requestLayout();
        recyclerView.n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(a2.k1 r9, a2.o0 r10, a2.o0 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f343a
            r0.getClass()
            r1 = 0
            r9.n(r1)
            a2.p0 r1 = r0.P
            r2 = r1
            a2.k r2 = (a2.k) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f406a
            int r6 = r11.f406a
            if (r4 != r6) goto L22
            int r1 = r10.f407b
            int r3 = r11.f407b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f407b
            int r7 = r11.f407b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.f376a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.W()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.h0.f(a2.k1, a2.o0, a2.o0):void");
    }

    @Override // q0.i
    public boolean g(float f9) {
        int i;
        int i9;
        RecyclerView recyclerView = this.f343a;
        if (recyclerView.s.e()) {
            i9 = (int) f9;
            i = 0;
        } else if (recyclerView.s.d()) {
            i = (int) f9;
            i9 = 0;
        } else {
            i = 0;
            i9 = 0;
        }
        if (i == 0 && i9 == 0) {
            return false;
        }
        recyclerView.n0();
        return recyclerView.I(i, i9, 0, Integer.MAX_VALUE);
    }

    public void h(k1 k1Var, o0 o0Var, o0 o0Var2) {
        boolean z9;
        RecyclerView recyclerView = this.f343a;
        recyclerView.c.m(k1Var);
        recyclerView.h(k1Var);
        k1Var.n(false);
        k kVar = (k) recyclerView.P;
        kVar.getClass();
        int i = o0Var.f406a;
        int i9 = o0Var.f407b;
        View view = k1Var.f376a;
        int left = o0Var2 == null ? view.getLeft() : o0Var2.f406a;
        int top = o0Var2 == null ? view.getTop() : o0Var2.f407b;
        if (k1Var.h() || (i == left && i9 == top)) {
            kVar.l(k1Var);
            kVar.f367h.add(k1Var);
            z9 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z9 = kVar.g(k1Var, i, i9, left, top);
        }
        if (z9) {
            recyclerView.W();
        }
    }

    public void i(int i) {
        RecyclerView recyclerView = this.f343a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // q0.i
    public float l() {
        float f9;
        RecyclerView recyclerView = this.f343a;
        if (recyclerView.s.e()) {
            f9 = recyclerView.f0;
        } else if (!recyclerView.s.d()) {
            return 0.0f;
        } else {
            f9 = recyclerView.e0;
        }
        return -f9;
    }

    @Override // q0.i
    public void o() {
        this.f343a.n0();
    }
}
