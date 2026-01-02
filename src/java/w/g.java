package w;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g extends i {
    public int A0;
    public x.b B0;
    public z.f C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* renamed from: a1  reason: collision with root package name */
    public d[] f6407a1;
    public int b1;

    /* renamed from: s0  reason: collision with root package name */
    public int f6408s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f6409t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6410u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f6411v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f6412w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6413x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f6414y0;
    public int z0;

    @Override // w.i
    public final void S() {
        for (int i = 0; i < this.f6422r0; i++) {
            d dVar = this.f6421q0[i];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f6373p0;
            if (iArr[1] == 3) {
                int i9 = dVar.f6375s;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int i10 = (int) (dVar.f6382z * i);
                        if (i10 != dVar.k()) {
                            dVar.f6357g = true;
                            V(iArr[0], dVar.q(), 1, i10, dVar);
                        }
                        return i10;
                    }
                    dVar2 = dVar;
                    if (i9 == 1) {
                        return dVar2.k();
                    }
                    if (i9 == 3) {
                        return (int) ((dVar2.q() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int U(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f6373p0;
            if (iArr[0] == 3) {
                int i9 = dVar.f6374r;
                if (i9 != 0) {
                    if (i9 == 2) {
                        int i10 = (int) (dVar.f6379w * i);
                        if (i10 != dVar.q()) {
                            dVar.f6357g = true;
                            V(1, i10, iArr[1], dVar.k(), dVar);
                        }
                        return i10;
                    }
                    dVar2 = dVar;
                    if (i9 == 1) {
                        return dVar2.q();
                    }
                    if (i9 == 3) {
                        return (int) ((dVar2.k() * dVar2.W) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i9, int i10, int i11, d dVar) {
        z.f fVar;
        d dVar2;
        x.b bVar = this.B0;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.T) == null) {
                break;
            }
            this.C0 = ((e) dVar2).f6387u0;
        }
        bVar.f6490a = i;
        bVar.f6491b = i10;
        bVar.f6492c = i9;
        bVar.f6493d = i11;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f6494e);
        dVar.L(bVar.f6495f);
        dVar.E = bVar.f6497h;
        dVar.I(bVar.f6496g);
    }

    @Override // w.d
    public final void b(u.c cVar, boolean z9) {
        d dVar;
        float f9;
        int i;
        ArrayList arrayList = this.W0;
        super.b(cVar, z9);
        d dVar2 = this.T;
        boolean z10 = dVar2 != null && ((e) dVar2).f6388v0;
        int i9 = this.T0;
        if (i9 != 0) {
            if (i9 == 1) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    ((f) arrayList.get(i10)).b(i10, z10, i10 == size + (-1));
                    i10++;
                }
            } else if (i9 != 2) {
                if (i9 == 3) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        ((f) arrayList.get(i11)).b(i11, z10, i11 == size2 + (-1));
                        i11++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i12 = 0; i12 < this.b1; i12++) {
                    this.f6407a1[i12].D();
                }
                int[] iArr = this.Z0;
                int i13 = iArr[0];
                int i14 = iArr[1];
                float f10 = this.J0;
                d dVar3 = null;
                int i15 = 0;
                while (i15 < i13) {
                    if (z10) {
                        i = (i13 - i15) - 1;
                        f9 = 1.0f - this.J0;
                    } else {
                        f9 = f10;
                        i = i15;
                    }
                    d dVar4 = this.Y0[i];
                    if (dVar4 != null) {
                        c cVar2 = dVar4.I;
                        if (dVar4.f6358g0 != 8) {
                            if (i15 == 0) {
                                dVar4.f(cVar2, this.I, this.f6412w0);
                                dVar4.f6361i0 = this.D0;
                                dVar4.f6353d0 = f9;
                            }
                            if (i15 == i13 - 1) {
                                dVar4.f(dVar4.K, this.K, this.f6413x0);
                            }
                            if (i15 > 0 && dVar3 != null) {
                                c cVar3 = dVar3.K;
                                dVar4.f(cVar2, cVar3, this.P0);
                                dVar3.f(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i15++;
                    f10 = f9;
                }
                for (int i16 = 0; i16 < i14; i16++) {
                    d dVar5 = this.X0[i16];
                    if (dVar5 != null) {
                        c cVar4 = dVar5.J;
                        if (dVar5.f6358g0 != 8) {
                            if (i16 == 0) {
                                dVar5.f(cVar4, this.J, this.f6408s0);
                                dVar5.f6362j0 = this.E0;
                                dVar5.f6355e0 = this.K0;
                            }
                            if (i16 == i14 - 1) {
                                dVar5.f(dVar5.L, this.L, this.f6409t0);
                            }
                            if (i16 > 0 && dVar3 != null) {
                                c cVar5 = dVar3.L;
                                dVar5.f(cVar4, cVar5, this.Q0);
                                dVar3.f(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i17 = 0; i17 < i13; i17++) {
                    for (int i18 = 0; i18 < i14; i18++) {
                        int i19 = (i18 * i13) + i17;
                        if (this.V0 == 1) {
                            i19 = (i17 * i14) + i18;
                        }
                        d[] dVarArr = this.f6407a1;
                        if (i19 < dVarArr.length && (dVar = dVarArr[i19]) != null && dVar.f6358g0 != 8) {
                            d dVar6 = this.Y0[i17];
                            d dVar7 = this.X0[i18];
                            if (dVar != dVar6) {
                                dVar.f(dVar.I, dVar6.I, 0);
                                dVar.f(dVar.K, dVar6.K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.J, dVar7.J, 0);
                                dVar.f(dVar.L, dVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f6414y0 = false;
    }
}
