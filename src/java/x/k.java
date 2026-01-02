package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k extends o {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f6520k = new int[2];

    public static void m(int[] iArr, int i, int i9, int i10, int i11, float f9, int i12) {
        int i13 = i9 - i;
        int i14 = i11 - i10;
        if (i12 != -1) {
            if (i12 == 0) {
                iArr[0] = (int) ((i14 * f9) + 0.5f);
                iArr[1] = i14;
                return;
            } else if (i12 != 1) {
                return;
            } else {
                iArr[0] = i13;
                iArr[1] = (int) ((i13 * f9) + 0.5f);
                return;
            }
        }
        int i15 = (int) ((i14 * f9) + 0.5f);
        int i16 = (int) ((i13 / f9) + 0.5f);
        if (i15 <= i13) {
            iArr[0] = i15;
            iArr[1] = i14;
        } else if (i16 <= i14) {
            iArr[0] = i13;
            iArr[1] = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0243, code lost:
        if (r5 != 1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k.a(x.d):void");
    }

    @Override // x.o
    public final void d() {
        w.d dVar;
        w.d dVar2;
        int i;
        w.d dVar3;
        w.d dVar4;
        int i9;
        w.d dVar5 = this.f6532b;
        boolean z9 = dVar5.f6346a;
        g gVar = this.f6535e;
        if (z9) {
            gVar.d(dVar5.q());
        }
        boolean z10 = gVar.j;
        ArrayList arrayList = gVar.f6516k;
        ArrayList arrayList2 = gVar.f6517l;
        f fVar = this.i;
        f fVar2 = this.f6538h;
        if (!z10) {
            w.d dVar6 = this.f6532b;
            int i10 = dVar6.f6373p0[0];
            this.f6534d = i10;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = dVar6.T) != null && ((i9 = dVar4.f6373p0[0]) == 1 || i9 == 4)) {
                    int q = (dVar4.q() - this.f6532b.I.e()) - this.f6532b.K.e();
                    o.b(fVar2, dVar4.f6352d.f6538h, this.f6532b.I.e());
                    o.b(fVar, dVar4.f6352d.i, -this.f6532b.K.e());
                    gVar.d(q);
                    return;
                } else if (i10 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f6534d == 4 && (dVar2 = (dVar = this.f6532b).T) != null && ((i = dVar2.f6373p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.f6352d.f6538h, dVar.I.e());
            o.b(fVar, dVar2.f6352d.i, -this.f6532b.K.e());
            return;
        }
        if (gVar.j) {
            w.d dVar7 = this.f6532b;
            if (dVar7.f6346a) {
                w.c[] cVarArr = dVar7.Q;
                w.c cVar = cVarArr[0];
                w.c cVar2 = cVar.f6343f;
                if (cVar2 != null && cVarArr[1].f6343f != null) {
                    if (dVar7.x()) {
                        fVar2.f6513f = this.f6532b.Q[0].e();
                        fVar.f6513f = -this.f6532b.Q[1].e();
                        return;
                    }
                    f h9 = o.h(this.f6532b.Q[0]);
                    if (h9 != null) {
                        o.b(fVar2, h9, this.f6532b.Q[0].e());
                    }
                    f h10 = o.h(this.f6532b.Q[1]);
                    if (h10 != null) {
                        o.b(fVar, h10, -this.f6532b.Q[1].e());
                    }
                    fVar2.f6509b = true;
                    fVar.f6509b = true;
                    return;
                } else if (cVar2 != null) {
                    f h11 = o.h(cVar);
                    if (h11 != null) {
                        o.b(fVar2, h11, this.f6532b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f6514g);
                        return;
                    }
                    return;
                } else {
                    w.c cVar3 = cVarArr[1];
                    if (cVar3.f6343f != null) {
                        f h12 = o.h(cVar3);
                        if (h12 != null) {
                            o.b(fVar, h12, -this.f6532b.Q[1].e());
                            o.b(fVar2, fVar, -gVar.f6514g);
                            return;
                        }
                        return;
                    } else if ((dVar7 instanceof w.i) || dVar7.T == null || dVar7.i(7).f6343f != null) {
                        return;
                    } else {
                        w.d dVar8 = this.f6532b;
                        o.b(fVar2, dVar8.T.f6352d.f6538h, dVar8.r());
                        o.b(fVar, fVar2, gVar.f6514g);
                        return;
                    }
                }
            }
        }
        if (this.f6534d == 3) {
            w.d dVar9 = this.f6532b;
            int i11 = dVar9.f6374r;
            if (i11 == 2) {
                w.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f6354e.f6535e;
                    arrayList2.add(gVar2);
                    gVar2.f6516k.add(gVar);
                    gVar.f6509b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i11 == 3) {
                if (dVar9.f6375s == 3) {
                    fVar2.f6508a = this;
                    fVar.f6508a = this;
                    m mVar = dVar9.f6354e;
                    mVar.f6538h.f6508a = this;
                    mVar.i.f6508a = this;
                    gVar.f6508a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f6532b.f6354e.f6535e);
                        this.f6532b.f6354e.f6535e.f6516k.add(gVar);
                        m mVar2 = this.f6532b.f6354e;
                        mVar2.f6535e.f6508a = this;
                        arrayList2.add(mVar2.f6538h);
                        arrayList2.add(this.f6532b.f6354e.i);
                        this.f6532b.f6354e.f6538h.f6516k.add(gVar);
                        this.f6532b.f6354e.i.f6516k.add(gVar);
                    } else if (this.f6532b.x()) {
                        this.f6532b.f6354e.f6535e.f6517l.add(gVar);
                        arrayList.add(this.f6532b.f6354e.f6535e);
                    } else {
                        this.f6532b.f6354e.f6535e.f6517l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f6354e.f6535e;
                    arrayList2.add(gVar3);
                    gVar3.f6516k.add(gVar);
                    this.f6532b.f6354e.f6538h.f6516k.add(gVar);
                    this.f6532b.f6354e.i.f6516k.add(gVar);
                    gVar.f6509b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f6517l.add(gVar);
                    fVar.f6517l.add(gVar);
                }
            }
        }
        w.d dVar11 = this.f6532b;
        w.c[] cVarArr2 = dVar11.Q;
        w.c cVar4 = cVarArr2[0];
        w.c cVar5 = cVar4.f6343f;
        if (cVar5 != null && cVarArr2[1].f6343f != null) {
            if (dVar11.x()) {
                fVar2.f6513f = this.f6532b.Q[0].e();
                fVar.f6513f = -this.f6532b.Q[1].e();
                return;
            }
            f h13 = o.h(this.f6532b.Q[0]);
            f h14 = o.h(this.f6532b.Q[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.j = 4;
        } else if (cVar5 != null) {
            f h15 = o.h(cVar4);
            if (h15 != null) {
                o.b(fVar2, h15, this.f6532b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
            }
        } else {
            w.c cVar6 = cVarArr2[1];
            if (cVar6.f6343f != null) {
                f h16 = o.h(cVar6);
                if (h16 != null) {
                    o.b(fVar, h16, -this.f6532b.Q[1].e());
                    c(fVar2, fVar, -1, gVar);
                }
            } else if ((dVar11 instanceof w.i) || (dVar3 = dVar11.T) == null) {
            } else {
                o.b(fVar2, dVar3.f6352d.f6538h, dVar11.r());
                c(fVar, fVar2, 1, gVar);
            }
        }
    }

    @Override // x.o
    public final void e() {
        f fVar = this.f6538h;
        if (fVar.j) {
            this.f6532b.Y = fVar.f6514g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f6533c = null;
        this.f6538h.c();
        this.i.c();
        this.f6535e.c();
        this.f6537g = false;
    }

    @Override // x.o
    public final boolean k() {
        return this.f6534d != 3 || this.f6532b.f6374r == 0;
    }

    public final void n() {
        this.f6537g = false;
        f fVar = this.f6538h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.j = false;
        this.f6535e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f6532b.f6360h0;
    }
}
