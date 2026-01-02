package w;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h extends d {

    /* renamed from: q0  reason: collision with root package name */
    public float f6415q0 = -1.0f;

    /* renamed from: r0  reason: collision with root package name */
    public int f6416r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public int f6417s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public c f6418t0 = this.J;

    /* renamed from: u0  reason: collision with root package name */
    public int f6419u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f6420v0;

    public h() {
        this.R.clear();
        this.R.add(this.f6418t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.f6418t0;
        }
    }

    @Override // w.d
    public final boolean A() {
        return this.f6420v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f6420v0;
    }

    @Override // w.d
    public final void Q(u.c cVar, boolean z9) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f6418t0;
        cVar.getClass();
        int n9 = u.c.n(cVar2);
        if (this.f6419u0 == 1) {
            this.Y = n9;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n9;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.f6418t0.l(i);
        this.f6420v0 = true;
    }

    public final void S(int i) {
        if (this.f6419u0 == i) {
            return;
        }
        this.f6419u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f6419u0 == 1) {
            this.f6418t0 = this.I;
        } else {
            this.f6418t0 = this.J;
        }
        arrayList.add(this.f6418t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            cVarArr[i9] = this.f6418t0;
        }
    }

    @Override // w.d
    public final void b(u.c cVar, boolean z9) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i9 = eVar.i(4);
        d dVar = this.T;
        boolean z10 = true;
        boolean z11 = dVar != null && dVar.f6373p0[0] == 2;
        if (this.f6419u0 == 0) {
            i = eVar.i(3);
            i9 = eVar.i(5);
            d dVar2 = this.T;
            if (dVar2 == null || dVar2.f6373p0[1] != 2) {
                z10 = false;
            }
            z11 = z10;
        }
        if (this.f6420v0) {
            c cVar2 = this.f6418t0;
            if (cVar2.f6340c) {
                u.f k9 = cVar.k(cVar2);
                cVar.d(k9, this.f6418t0.d());
                if (this.f6416r0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(i9), k9, 0, 5);
                    }
                } else if (this.f6417s0 != -1 && z11) {
                    u.f k10 = cVar.k(i9);
                    cVar.f(k9, cVar.k(i), 0, 5);
                    cVar.f(k10, k9, 0, 5);
                }
                this.f6420v0 = false;
                return;
            }
        }
        if (this.f6416r0 != -1) {
            u.f k11 = cVar.k(this.f6418t0);
            cVar.e(k11, cVar.k(i), this.f6416r0, 8);
            if (z11) {
                cVar.f(cVar.k(i9), k11, 0, 5);
            }
        } else if (this.f6417s0 != -1) {
            u.f k12 = cVar.k(this.f6418t0);
            u.f k13 = cVar.k(i9);
            cVar.e(k12, k13, -this.f6417s0, 8);
            if (z11) {
                cVar.f(k12, cVar.k(i), 0, 5);
                cVar.f(k13, k12, 0, 5);
            }
        } else if (this.f6415q0 != -1.0f) {
            u.f k14 = cVar.k(this.f6418t0);
            u.f k15 = cVar.k(i9);
            float f9 = this.f6415q0;
            u.b l5 = cVar.l();
            l5.f5999d.g(k14, -1.0f);
            l5.f5999d.g(k15, f9);
            cVar.c(l5);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final c i(int i) {
        int c9 = u.e.c(i);
        if (c9 != 1) {
            if (c9 != 2) {
                if (c9 != 3) {
                    if (c9 != 4) {
                        return null;
                    }
                }
            }
            if (this.f6419u0 == 0) {
                return this.f6418t0;
            }
            return null;
        }
        if (this.f6419u0 == 1) {
            return this.f6418t0;
        }
        return null;
    }
}
