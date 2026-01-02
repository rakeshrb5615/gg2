package w;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a extends i {

    /* renamed from: s0  reason: collision with root package name */
    public int f6320s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f6321t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6322u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f6323v0;

    @Override // w.d
    public final boolean A() {
        return this.f6323v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f6323v0;
    }

    public final boolean T() {
        int i;
        int i9;
        int i10;
        boolean z9 = true;
        int i11 = 0;
        while (true) {
            i = this.f6422r0;
            if (i11 >= i) {
                break;
            }
            d dVar = this.f6421q0[i11];
            if ((this.f6321t0 || dVar.c()) && ((((i9 = this.f6320s0) == 0 || i9 == 1) && !dVar.A()) || (((i10 = this.f6320s0) == 2 || i10 == 3) && !dVar.B()))) {
                z9 = false;
            }
            i11++;
        }
        if (!z9 || i <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.f6422r0; i13++) {
            d dVar2 = this.f6421q0[i13];
            if (this.f6321t0 || dVar2.c()) {
                if (!z10) {
                    int i14 = this.f6320s0;
                    if (i14 == 0) {
                        i12 = dVar2.i(2).d();
                    } else if (i14 == 1) {
                        i12 = dVar2.i(4).d();
                    } else if (i14 == 2) {
                        i12 = dVar2.i(3).d();
                    } else if (i14 == 3) {
                        i12 = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i15 = this.f6320s0;
                if (i15 == 0) {
                    i12 = Math.min(i12, dVar2.i(2).d());
                } else if (i15 == 1) {
                    i12 = Math.max(i12, dVar2.i(4).d());
                } else if (i15 == 2) {
                    i12 = Math.min(i12, dVar2.i(3).d());
                } else if (i15 == 3) {
                    i12 = Math.max(i12, dVar2.i(5).d());
                }
            }
        }
        int i16 = i12 + this.f6322u0;
        int i17 = this.f6320s0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.f6323v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f6320s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.d
    public final void b(u.c cVar, boolean z9) {
        boolean z10;
        int i;
        int i9;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i10 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.i = cVar.k(cVar6);
        }
        int i11 = this.f6320s0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i11];
        if (!this.f6323v0) {
            T();
        }
        if (this.f6323v0) {
            this.f6323v0 = false;
            int i12 = this.f6320s0;
            if (i12 == 0 || i12 == 1) {
                cVar.d(cVar2.i, this.Y);
                cVar.d(cVar4.i, this.Y);
                return;
            } else if (i12 == 2 || i12 == 3) {
                cVar.d(cVar3.i, this.Z);
                cVar.d(cVar5.i, this.Z);
                return;
            } else {
                return;
            }
        }
        for (int i13 = 0; i13 < this.f6422r0; i13++) {
            d dVar = this.f6421q0[i13];
            if ((this.f6321t0 || dVar.c()) && ((((i9 = this.f6320s0) == 0 || i9 == 1) && dVar.f6373p0[0] == 3 && dVar.I.f6343f != null && dVar.K.f6343f != null) || ((i9 == 2 || i9 == 3) && dVar.f6373p0[1] == 3 && dVar.J.f6343f != null && dVar.L.f6343f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i14 = !(!z10 && (((i = this.f6320s0) == 0 && z11) || ((i == 2 && z12) || ((i == 1 && z11) || (i == 3 && z12))))) ? 4 : 5;
        int i15 = 0;
        while (i15 < this.f6422r0) {
            d dVar2 = this.f6421q0[i15];
            if (this.f6321t0 || dVar2.c()) {
                u.f k9 = cVar.k(dVar2.Q[this.f6320s0]);
                c[] cVarArr2 = dVar2.Q;
                int i16 = this.f6320s0;
                c cVar8 = cVarArr2[i16];
                cVar8.i = k9;
                c cVar9 = cVar8.f6343f;
                int i17 = (cVar9 == null || cVar9.f6341d != this) ? 0 : cVar8.f6344g;
                if (i16 == 0 || i16 == i10) {
                    u.b l5 = cVar.l();
                    u.f m9 = cVar.m();
                    m9.f6022d = 0;
                    l5.c(cVar7.i, k9, m9, this.f6322u0 - i17);
                    cVar.c(l5);
                } else {
                    u.b l9 = cVar.l();
                    u.f m10 = cVar.m();
                    m10.f6022d = 0;
                    l9.b(cVar7.i, k9, m10, this.f6322u0 + i17);
                    cVar.c(l9);
                }
                cVar.e(cVar7.i, k9, this.f6322u0 + i17, i14);
            }
            i15++;
            i10 = 2;
        }
        int i18 = this.f6320s0;
        if (i18 == 0) {
            cVar.e(cVar4.i, cVar2.i, 0, 8);
            cVar.e(cVar2.i, this.T.K.i, 0, 4);
            cVar.e(cVar2.i, this.T.I.i, 0, 0);
        } else if (i18 == 1) {
            cVar.e(cVar2.i, cVar4.i, 0, 8);
            cVar.e(cVar2.i, this.T.I.i, 0, 4);
            cVar.e(cVar2.i, this.T.K.i, 0, 0);
        } else if (i18 == 2) {
            cVar.e(cVar5.i, cVar3.i, 0, 8);
            cVar.e(cVar3.i, this.T.L.i, 0, 4);
            cVar.e(cVar3.i, this.T.J.i, 0, 0);
        } else if (i18 == 3) {
            cVar.e(cVar3.i, cVar5.i, 0, 8);
            cVar.e(cVar3.i, this.T.J.i, 0, 4);
            cVar.e(cVar3.i, this.T.L.i, 0, 0);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final String toString() {
        String n9 = v1.a.n(new StringBuilder("[Barrier] "), this.f6360h0, " {");
        for (int i = 0; i < this.f6422r0; i++) {
            d dVar = this.f6421q0[i];
            if (i > 0) {
                n9 = g2.g.d(n9, ", ");
            }
            StringBuilder b10 = u.e.b(n9);
            b10.append(dVar.f6360h0);
            n9 = b10.toString();
        }
        return g2.g.d(n9, "}");
    }
}
