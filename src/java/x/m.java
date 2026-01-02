package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m extends o {

    /* renamed from: k  reason: collision with root package name */
    public f f6523k;

    /* renamed from: l  reason: collision with root package name */
    public a f6524l;

    @Override // x.d
    public final void a(d dVar) {
        g gVar;
        float f9;
        float f10;
        float f11;
        int i;
        if (u.e.c(this.j) == 3) {
            w.d dVar2 = this.f6532b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar2 = this.f6535e;
        if (gVar2.f6510c && !gVar2.j && this.f6534d == 3) {
            w.d dVar3 = this.f6532b;
            int i9 = dVar3.f6375s;
            if (i9 == 2) {
                w.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f6354e.f6535e.j) {
                        gVar2.d((int) ((gVar.f6514g * dVar3.f6382z) + 0.5f));
                    }
                }
            } else if (i9 == 3) {
                g gVar3 = dVar3.f6352d.f6535e;
                if (gVar3.j) {
                    int i10 = dVar3.X;
                    if (i10 == -1) {
                        f9 = gVar3.f6514g;
                        f10 = dVar3.W;
                    } else if (i10 == 0) {
                        f11 = gVar3.f6514g * dVar3.W;
                        i = (int) (f11 + 0.5f);
                        gVar2.d(i);
                    } else if (i10 != 1) {
                        i = 0;
                        gVar2.d(i);
                    } else {
                        f9 = gVar3.f6514g;
                        f10 = dVar3.W;
                    }
                    f11 = f9 / f10;
                    i = (int) (f11 + 0.5f);
                    gVar2.d(i);
                }
            }
        }
        f fVar = this.f6538h;
        boolean z9 = fVar.f6510c;
        ArrayList arrayList = fVar.f6517l;
        if (z9) {
            f fVar2 = this.i;
            boolean z10 = fVar2.f6510c;
            ArrayList arrayList2 = fVar2.f6517l;
            if (z10) {
                if (fVar.j && fVar2.j && gVar2.j) {
                    return;
                }
                if (!gVar2.j && this.f6534d == 3) {
                    w.d dVar5 = this.f6532b;
                    if (dVar5.f6374r == 0 && !dVar5.y()) {
                        int i11 = ((f) arrayList.get(0)).f6514g + fVar.f6513f;
                        int i12 = ((f) arrayList2.get(0)).f6514g + fVar2.f6513f;
                        fVar.d(i11);
                        fVar2.d(i12);
                        gVar2.d(i12 - i11);
                        return;
                    }
                }
                if (!gVar2.j && this.f6534d == 3 && this.f6531a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    int i13 = (((f) arrayList2.get(0)).f6514g + fVar2.f6513f) - (((f) arrayList.get(0)).f6514g + fVar.f6513f);
                    int i14 = gVar2.f6518m;
                    if (i13 < i14) {
                        gVar2.d(i13);
                    } else {
                        gVar2.d(i14);
                    }
                }
                if (gVar2.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar3 = (f) arrayList.get(0);
                    f fVar4 = (f) arrayList2.get(0);
                    int i15 = fVar3.f6514g;
                    int i16 = fVar.f6513f + i15;
                    int i17 = fVar4.f6514g;
                    int i18 = fVar2.f6513f + i17;
                    float f12 = this.f6532b.f6355e0;
                    if (fVar3 == fVar4) {
                        f12 = 0.5f;
                    } else {
                        i15 = i16;
                        i17 = i18;
                    }
                    fVar.d((int) ((((i17 - i15) - gVar2.f6514g) * f12) + i15 + 0.5f));
                    fVar2.d(fVar.f6514g + gVar2.f6514g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v120, types: [x.g, x.a] */
    @Override // x.o
    public final void d() {
        w.d dVar;
        w.d dVar2;
        w.d dVar3;
        w.d dVar4;
        f fVar = this.f6523k;
        w.d dVar5 = this.f6532b;
        boolean z9 = dVar5.f6346a;
        g gVar = this.f6535e;
        if (z9) {
            gVar.d(dVar5.k());
        }
        boolean z10 = gVar.j;
        ArrayList arrayList = gVar.f6516k;
        ArrayList arrayList2 = gVar.f6517l;
        f fVar2 = this.i;
        f fVar3 = this.f6538h;
        if (!z10) {
            w.d dVar6 = this.f6532b;
            this.f6534d = dVar6.f6373p0[1];
            if (dVar6.E) {
                this.f6524l = new g(this);
            }
            int i = this.f6534d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f6532b.T) != null && dVar4.f6373p0[1] == 1) {
                    int k9 = (dVar4.k() - this.f6532b.J.e()) - this.f6532b.L.e();
                    o.b(fVar3, dVar4.f6354e.f6538h, this.f6532b.J.e());
                    o.b(fVar2, dVar4.f6354e.i, -this.f6532b.L.e());
                    gVar.d(k9);
                    return;
                } else if (i == 1) {
                    gVar.d(this.f6532b.k());
                }
            }
        } else if (this.f6534d == 4 && (dVar2 = (dVar = this.f6532b).T) != null && dVar2.f6373p0[1] == 1) {
            o.b(fVar3, dVar2.f6354e.f6538h, dVar.J.e());
            o.b(fVar2, dVar2.f6354e.i, -this.f6532b.L.e());
            return;
        }
        boolean z11 = gVar.j;
        if (z11) {
            w.d dVar7 = this.f6532b;
            if (dVar7.f6346a) {
                w.c[] cVarArr = dVar7.Q;
                w.c cVar = cVarArr[2];
                w.c cVar2 = cVar.f6343f;
                if (cVar2 != null && cVarArr[3].f6343f != null) {
                    if (dVar7.y()) {
                        fVar3.f6513f = this.f6532b.Q[2].e();
                        fVar2.f6513f = -this.f6532b.Q[3].e();
                    } else {
                        f h9 = o.h(this.f6532b.Q[2]);
                        if (h9 != null) {
                            o.b(fVar3, h9, this.f6532b.Q[2].e());
                        }
                        f h10 = o.h(this.f6532b.Q[3]);
                        if (h10 != null) {
                            o.b(fVar2, h10, -this.f6532b.Q[3].e());
                        }
                        fVar3.f6509b = true;
                        fVar2.f6509b = true;
                    }
                    w.d dVar8 = this.f6532b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.f6347a0);
                        return;
                    }
                    return;
                } else if (cVar2 != null) {
                    f h11 = o.h(cVar);
                    if (h11 != null) {
                        o.b(fVar3, h11, this.f6532b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f6514g);
                        w.d dVar9 = this.f6532b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.f6347a0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    w.c cVar3 = cVarArr[3];
                    if (cVar3.f6343f != null) {
                        f h12 = o.h(cVar3);
                        if (h12 != null) {
                            o.b(fVar2, h12, -this.f6532b.Q[3].e());
                            o.b(fVar3, fVar2, -gVar.f6514g);
                        }
                        w.d dVar10 = this.f6532b;
                        if (dVar10.E) {
                            o.b(fVar, fVar3, dVar10.f6347a0);
                            return;
                        }
                        return;
                    }
                    w.c cVar4 = cVarArr[4];
                    if (cVar4.f6343f != null) {
                        f h13 = o.h(cVar4);
                        if (h13 != null) {
                            o.b(fVar, h13, 0);
                            o.b(fVar3, fVar, -this.f6532b.f6347a0);
                            o.b(fVar2, fVar3, gVar.f6514g);
                            return;
                        }
                        return;
                    } else if ((dVar7 instanceof w.i) || dVar7.T == null || dVar7.i(7).f6343f != null) {
                        return;
                    } else {
                        w.d dVar11 = this.f6532b;
                        o.b(fVar3, dVar11.T.f6354e.f6538h, dVar11.s());
                        o.b(fVar2, fVar3, gVar.f6514g);
                        w.d dVar12 = this.f6532b;
                        if (dVar12.E) {
                            o.b(fVar, fVar3, dVar12.f6347a0);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (z11 || this.f6534d != 3) {
            gVar.b(this);
        } else {
            w.d dVar13 = this.f6532b;
            int i9 = dVar13.f6375s;
            if (i9 == 2) {
                w.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f6354e.f6535e;
                    arrayList2.add(gVar2);
                    gVar2.f6516k.add(gVar);
                    gVar.f6509b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i9 == 3 && !dVar13.y()) {
                w.d dVar15 = this.f6532b;
                if (dVar15.f6374r != 3) {
                    g gVar3 = dVar15.f6352d.f6535e;
                    arrayList2.add(gVar3);
                    gVar3.f6516k.add(gVar);
                    gVar.f6509b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        w.d dVar16 = this.f6532b;
        w.c[] cVarArr2 = dVar16.Q;
        w.c cVar5 = cVarArr2[2];
        w.c cVar6 = cVar5.f6343f;
        if (cVar6 != null && cVarArr2[3].f6343f != null) {
            if (dVar16.y()) {
                fVar3.f6513f = this.f6532b.Q[2].e();
                fVar2.f6513f = -this.f6532b.Q[3].e();
            } else {
                f h14 = o.h(this.f6532b.Q[2]);
                f h15 = o.h(this.f6532b.Q[3]);
                if (h14 != null) {
                    h14.b(this);
                }
                if (h15 != null) {
                    h15.b(this);
                }
                this.j = 4;
            }
            if (this.f6532b.E) {
                c(fVar, fVar3, 1, this.f6524l);
            }
        } else if (cVar6 != null) {
            f h16 = o.h(cVar5);
            if (h16 != null) {
                o.b(fVar3, h16, this.f6532b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f6532b.E) {
                    c(fVar, fVar3, 1, this.f6524l);
                }
                if (this.f6534d == 3) {
                    w.d dVar17 = this.f6532b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.f6352d;
                        if (kVar.f6534d == 3) {
                            kVar.f6535e.f6516k.add(gVar);
                            arrayList2.add(this.f6532b.f6352d.f6535e);
                            gVar.f6508a = this;
                        }
                    }
                }
            }
        } else {
            w.c cVar7 = cVarArr2[3];
            if (cVar7.f6343f != null) {
                f h17 = o.h(cVar7);
                if (h17 != null) {
                    o.b(fVar2, h17, -this.f6532b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f6532b.E) {
                        c(fVar, fVar3, 1, this.f6524l);
                    }
                }
            } else {
                w.c cVar8 = cVarArr2[4];
                if (cVar8.f6343f != null) {
                    f h18 = o.h(cVar8);
                    if (h18 != null) {
                        o.b(fVar, h18, 0);
                        c(fVar3, fVar, -1, this.f6524l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof w.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.f6354e.f6538h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f6532b.E) {
                        c(fVar, fVar3, 1, this.f6524l);
                    }
                    if (this.f6534d == 3) {
                        w.d dVar18 = this.f6532b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.f6352d;
                            if (kVar2.f6534d == 3) {
                                kVar2.f6535e.f6516k.add(gVar);
                                arrayList2.add(this.f6532b.f6352d.f6535e);
                                gVar.f6508a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f6510c = true;
        }
    }

    @Override // x.o
    public final void e() {
        f fVar = this.f6538h;
        if (fVar.j) {
            this.f6532b.Z = fVar.f6514g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f6533c = null;
        this.f6538h.c();
        this.i.c();
        this.f6523k.c();
        this.f6535e.c();
        this.f6537g = false;
    }

    @Override // x.o
    public final boolean k() {
        return this.f6534d != 3 || this.f6532b.f6375s == 0;
    }

    public final void m() {
        this.f6537g = false;
        f fVar = this.f6538h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.f6523k;
        fVar3.c();
        fVar3.j = false;
        this.f6535e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f6532b.f6360h0;
    }
}
