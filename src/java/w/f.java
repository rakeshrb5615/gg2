package w;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f6392a;

    /* renamed from: d  reason: collision with root package name */
    public c f6395d;

    /* renamed from: e  reason: collision with root package name */
    public c f6396e;

    /* renamed from: f  reason: collision with root package name */
    public c f6397f;

    /* renamed from: g  reason: collision with root package name */
    public c f6398g;

    /* renamed from: h  reason: collision with root package name */
    public int f6399h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f6400k;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f6406r;

    /* renamed from: b  reason: collision with root package name */
    public d f6393b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f6394c = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f6401l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f6402m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f6403n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f6404o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f6405p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i9) {
        this.f6406r = gVar;
        this.f6392a = i;
        this.f6395d = cVar;
        this.f6396e = cVar2;
        this.f6397f = cVar3;
        this.f6398g = cVar4;
        this.f6399h = gVar.f6412w0;
        this.i = gVar.f6408s0;
        this.j = gVar.f6413x0;
        this.f6400k = gVar.f6409t0;
        this.q = i9;
    }

    public final void a(d dVar) {
        int i = this.f6392a;
        g gVar = this.f6406r;
        if (i == 0) {
            int U = gVar.U(dVar, this.q);
            if (dVar.f6373p0[0] == 3) {
                this.f6405p++;
                U = 0;
            }
            this.f6401l = U + (dVar.f6358g0 != 8 ? gVar.P0 : 0) + this.f6401l;
            int T = gVar.T(dVar, this.q);
            if (this.f6393b == null || this.f6394c < T) {
                this.f6393b = dVar;
                this.f6394c = T;
                this.f6402m = T;
            }
        } else {
            int U2 = gVar.U(dVar, this.q);
            int T2 = gVar.T(dVar, this.q);
            if (dVar.f6373p0[1] == 3) {
                this.f6405p++;
                T2 = 0;
            }
            this.f6402m = T2 + (dVar.f6358g0 != 8 ? gVar.Q0 : 0) + this.f6402m;
            if (this.f6393b == null || this.f6394c < U2) {
                this.f6393b = dVar;
                this.f6394c = U2;
                this.f6401l = U2;
            }
        }
        this.f6404o++;
    }

    public final void b(int i, boolean z9, boolean z10) {
        g gVar;
        int i9;
        int i10;
        int i11;
        d dVar;
        boolean z11;
        int i12;
        int i13;
        char c9;
        float f9;
        float f10;
        float f11;
        int i14;
        float f12;
        float f13;
        int i15;
        int i16 = this.f6404o;
        int i17 = 0;
        while (true) {
            gVar = this.f6406r;
            if (i17 >= i16 || (i15 = this.f6403n + i17) >= gVar.b1) {
                break;
            }
            d dVar2 = gVar.f6407a1[i15];
            if (dVar2 != null) {
                dVar2.D();
            }
            i17++;
        }
        if (i16 == 0 || this.f6393b == null) {
            return;
        }
        boolean z12 = z10 && i == 0;
        int i18 = -1;
        int i19 = -1;
        for (int i20 = 0; i20 < i16; i20++) {
            int i21 = this.f6403n + (z9 ? (i16 - 1) - i20 : i20);
            if (i21 >= gVar.b1) {
                break;
            }
            d dVar3 = gVar.f6407a1[i21];
            if (dVar3 != null && dVar3.f6358g0 == 0) {
                if (i18 == -1) {
                    i18 = i20;
                }
                i19 = i20;
            }
        }
        if (this.f6392a == 0) {
            d dVar4 = this.f6393b;
            dVar4.f6362j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i22 = this.i;
            if (i > 0) {
                i22 += gVar.Q0;
            }
            cVar2.a(this.f6396e, i22);
            if (z10) {
                cVar.a(this.f6398g, this.f6400k);
            }
            if (i > 0) {
                this.f6396e.f6341d.L.a(cVar2, 0);
            }
            if (gVar.S0 == 3 && !dVar4.E) {
                for (int i23 = 0; i23 < i16; i23++) {
                    int i24 = this.f6403n + (z9 ? (i16 - 1) - i23 : i23);
                    if (i24 >= gVar.b1) {
                        break;
                    }
                    dVar = gVar.f6407a1[i24];
                    if (dVar.E) {
                        break;
                    }
                }
            }
            dVar = dVar4;
            int i25 = 0;
            d dVar5 = null;
            while (i25 < i16) {
                int i26 = z9 ? (i16 - 1) - i25 : i25;
                int i27 = this.f6403n + i26;
                if (i27 >= gVar.b1) {
                    return;
                }
                d dVar6 = gVar.f6407a1[i27];
                if (dVar6 == null) {
                    i13 = i16;
                    z11 = z12;
                    i12 = i19;
                    c9 = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z11 = z12;
                    if (i25 == 0) {
                        i12 = i19;
                        dVar6.f(cVar5, this.f6395d, this.f6399h);
                    } else {
                        i12 = i19;
                    }
                    if (i26 == 0) {
                        int i28 = gVar.D0;
                        if (z9) {
                            f9 = 1.0f;
                            f10 = 1.0f - gVar.J0;
                        } else {
                            f9 = 1.0f;
                            f10 = gVar.J0;
                        }
                        if (this.f6403n == 0) {
                            i14 = gVar.F0;
                            f11 = f10;
                            if (i14 != -1) {
                                if (z9) {
                                    f13 = gVar.L0;
                                    f12 = f9 - f13;
                                    dVar6.f6361i0 = i14;
                                    dVar6.f6353d0 = f12;
                                } else {
                                    f12 = gVar.L0;
                                    dVar6.f6361i0 = i14;
                                    dVar6.f6353d0 = f12;
                                }
                            }
                        } else {
                            f11 = f10;
                        }
                        if (!z10 || (i14 = gVar.H0) == -1) {
                            i14 = i28;
                            f12 = f11;
                        } else if (z9) {
                            f13 = gVar.N0;
                            f12 = f9 - f13;
                        } else {
                            f12 = gVar.N0;
                        }
                        dVar6.f6361i0 = i14;
                        dVar6.f6353d0 = f12;
                    }
                    if (i25 == i16 - 1) {
                        i13 = i16;
                        dVar6.f(dVar6.K, this.f6397f, this.j);
                    } else {
                        i13 = i16;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i25 == i18) {
                            int i29 = this.f6399h;
                            if (cVar5.h()) {
                                cVar5.f6345h = i29;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i25 == i12 + 1) {
                            int i30 = this.j;
                            if (cVar6.h()) {
                                cVar6.f6345h = i30;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i31 = gVar.S0;
                        c9 = 3;
                        if (i31 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i31 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i31 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z11) {
                            cVar4.a(this.f6396e, this.i);
                            cVar3.a(this.f6398g, this.f6400k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c9 = 3;
                    }
                    dVar5 = dVar6;
                }
                i25++;
                z12 = z11;
                i19 = i12;
                i16 = i13;
            }
            return;
        }
        int i32 = i16;
        boolean z13 = z12;
        int i33 = i19;
        d dVar7 = this.f6393b;
        dVar7.f6361i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i34 = this.f6399h;
        if (i > 0) {
            i34 += gVar.P0;
        }
        if (z9) {
            cVar8.a(this.f6397f, i34);
            if (z10) {
                cVar7.a(this.f6395d, this.j);
            }
            if (i > 0) {
                this.f6397f.f6341d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f6395d, i34);
            if (z10) {
                cVar8.a(this.f6397f, this.j);
            }
            if (i > 0) {
                this.f6395d.f6341d.K.a(cVar7, 0);
            }
        }
        int i35 = 0;
        d dVar8 = null;
        while (true) {
            int i36 = i32;
            if (i35 >= i36 || (i9 = this.f6403n + i35) >= gVar.b1) {
                return;
            }
            d dVar9 = gVar.f6407a1[i9];
            if (dVar9 == null) {
                i32 = i36;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i35 == 0) {
                    dVar9.f(cVar9, this.f6396e, this.i);
                    int i37 = gVar.E0;
                    float f14 = gVar.K0;
                    if (this.f6403n == 0) {
                        i11 = gVar.G0;
                        i32 = i36;
                        i10 = -1;
                        if (i11 != -1) {
                            f14 = gVar.M0;
                            i37 = i11;
                            dVar9.f6362j0 = i37;
                            dVar9.f6355e0 = f14;
                        }
                    } else {
                        i32 = i36;
                        i10 = -1;
                    }
                    if (z10 && (i11 = gVar.I0) != i10) {
                        f14 = gVar.O0;
                        i37 = i11;
                    }
                    dVar9.f6362j0 = i37;
                    dVar9.f6355e0 = f14;
                } else {
                    i32 = i36;
                }
                if (i35 == i32 - 1) {
                    dVar9.f(dVar9.L, this.f6398g, this.f6400k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i35 == i18) {
                        int i38 = this.i;
                        if (cVar9.h()) {
                            cVar9.f6345h = i38;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i35 == i33 + 1) {
                        int i39 = this.f6400k;
                        if (cVar12.h()) {
                            cVar12.f6345h = i39;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    if (z9) {
                        int i40 = gVar.R0;
                        if (i40 == 0) {
                            cVar10.a(cVar8, 0);
                        } else if (i40 == 1) {
                            cVar11.a(cVar7, 0);
                        } else if (i40 == 2) {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    } else {
                        int i41 = gVar.R0;
                        if (i41 == 0) {
                            cVar11.a(cVar7, 0);
                        } else if (i41 == 1) {
                            cVar10.a(cVar8, 0);
                        } else if (i41 == 2) {
                            if (z13) {
                                cVar11.a(this.f6395d, this.f6399h);
                                cVar10.a(this.f6397f, this.j);
                            } else {
                                cVar11.a(cVar7, 0);
                                cVar10.a(cVar8, 0);
                            }
                        }
                        dVar8 = dVar9;
                    }
                }
                dVar8 = dVar9;
            }
            i35++;
        }
    }

    public final int c() {
        return this.f6392a == 1 ? this.f6402m - this.f6406r.Q0 : this.f6402m;
    }

    public final int d() {
        return this.f6392a == 0 ? this.f6401l - this.f6406r.P0 : this.f6401l;
    }

    public final void e(int i) {
        g gVar;
        int i9;
        int i10 = this.f6405p;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f6404o;
        int i12 = i / i10;
        int i13 = 0;
        while (true) {
            gVar = this.f6406r;
            if (i13 >= i11 || (i9 = this.f6403n + i13) >= gVar.b1) {
                break;
            }
            d dVar = gVar.f6407a1[i9];
            if (this.f6392a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f6373p0;
                    if (iArr[0] == 3 && dVar.f6374r == 0) {
                        gVar.V(1, i12, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f6373p0;
                if (iArr2[1] == 3 && dVar.f6375s == 0) {
                    int i14 = i12;
                    gVar.V(iArr2[0], dVar.q(), 1, i14, dVar);
                    i12 = i14;
                }
            }
            i13++;
        }
        this.f6401l = 0;
        this.f6402m = 0;
        this.f6393b = null;
        this.f6394c = 0;
        int i15 = this.f6404o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f6403n + i16;
            if (i17 >= gVar.b1) {
                return;
            }
            d dVar2 = gVar.f6407a1[i17];
            if (this.f6392a == 0) {
                int q = dVar2.q();
                int i18 = gVar.P0;
                if (dVar2.f6358g0 == 8) {
                    i18 = 0;
                }
                this.f6401l = q + i18 + this.f6401l;
                int T = gVar.T(dVar2, this.q);
                if (this.f6393b == null || this.f6394c < T) {
                    this.f6393b = dVar2;
                    this.f6394c = T;
                    this.f6402m = T;
                }
            } else {
                int U = gVar.U(dVar2, this.q);
                int T2 = gVar.T(dVar2, this.q);
                int i19 = gVar.Q0;
                if (dVar2.f6358g0 == 8) {
                    i19 = 0;
                }
                this.f6402m = T2 + i19 + this.f6402m;
                if (this.f6393b == null || this.f6394c < U) {
                    this.f6393b = dVar2;
                    this.f6394c = U;
                    this.f6401l = U;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i9, int i10, int i11, int i12, int i13) {
        this.f6392a = i;
        this.f6395d = cVar;
        this.f6396e = cVar2;
        this.f6397f = cVar3;
        this.f6398g = cVar4;
        this.f6399h = i9;
        this.i = i10;
        this.j = i11;
        this.f6400k = i12;
        this.q = i13;
    }
}
