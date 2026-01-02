package x;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public w.e f6500a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6501b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6502c;

    /* renamed from: d  reason: collision with root package name */
    public w.e f6503d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f6504e;

    /* renamed from: f  reason: collision with root package name */
    public z.f f6505f;

    /* renamed from: g  reason: collision with root package name */
    public b f6506g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f6507h;

    /* JADX WARN: Type inference failed for: r13v2, types: [x.l, java.lang.Object] */
    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.f6511d;
        l lVar2 = oVar.f6533c;
        f fVar2 = oVar.i;
        f fVar3 = oVar.f6538h;
        if (lVar2 == null) {
            w.e eVar = this.f6500a;
            if (oVar != eVar.f6352d) {
                l lVar3 = lVar;
                if (oVar == eVar.f6354e) {
                    return;
                }
                if (lVar == null) {
                    ?? obj = new Object();
                    obj.f6521a = null;
                    obj.f6522b = new ArrayList();
                    obj.f6521a = oVar;
                    arrayList.add(obj);
                    lVar3 = obj;
                }
                oVar.f6533c = lVar3;
                lVar3.f6522b.add(oVar);
                ArrayList arrayList2 = fVar3.f6516k;
                int size = arrayList2.size();
                int i9 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    d dVar = (d) obj2;
                    if (dVar instanceof f) {
                        a((f) dVar, i, arrayList, lVar3);
                    }
                }
                ArrayList arrayList3 = fVar2.f6516k;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList3.get(i11);
                    i11++;
                    d dVar2 = (d) obj3;
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i, arrayList, lVar3);
                    }
                }
                if (i == 1 && (oVar instanceof m)) {
                    ArrayList arrayList4 = ((m) oVar).f6523k.f6516k;
                    int size3 = arrayList4.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj4 = arrayList4.get(i12);
                        i12++;
                        d dVar3 = (d) obj4;
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i, arrayList, lVar3);
                        }
                    }
                }
                ArrayList arrayList5 = fVar3.f6517l;
                int size4 = arrayList5.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj5 = arrayList5.get(i13);
                    i13++;
                    a((f) obj5, i, arrayList, lVar3);
                }
                ArrayList arrayList6 = fVar2.f6517l;
                int size5 = arrayList6.size();
                int i14 = 0;
                while (i14 < size5) {
                    Object obj6 = arrayList6.get(i14);
                    i14++;
                    a((f) obj6, i, arrayList, lVar3);
                }
                if (i == 1 && (oVar instanceof m)) {
                    ArrayList arrayList7 = ((m) oVar).f6523k.f6517l;
                    int size6 = arrayList7.size();
                    while (i9 < size6) {
                        Object obj7 = arrayList7.get(i9);
                        i9++;
                        a((f) obj7, i, arrayList, lVar3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b4, code lost:
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b8, code lost:
        if (r10 != r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
        if (r13 == r8) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bc, code lost:
        if (r13 != r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bf, code lost:
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c7, code lost:
        if (r1 != r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c9, code lost:
        if (r13 != r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cb, code lost:
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d3, code lost:
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01dc, code lost:
        if (r12.X != (-1)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01de, code lost:
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e0, code lost:
        f(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
        if (r1 != 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020a, code lost:
        f(r13, 0, r8, 0, r12);
        r12.f6354e.f6535e.f6518m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021f, code lost:
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
        if (r1 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0224, code lost:
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0226, code lost:
        if (r7 == r6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0229, code lost:
        if (r7 != 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022c, code lost:
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0231, code lost:
        f(r8, r12.q(), r6, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025f, code lost:
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0267, code lost:
        if (r7[2].f6343f == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026f, code lost:
        if (r7[3].f6343f != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0272, code lost:
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0274, code lost:
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0277, code lost:
        f(r11, 0, r10, 0, r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x029a, code lost:
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029f, code lost:
        if (r0 != r9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a1, code lost:
        if (r7 != r9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a3, code lost:
        if (r15 == r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a5, code lost:
        if (r1 != r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a9, code lost:
        if (r1 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ab, code lost:
        if (r15 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02af, code lost:
        if (r2[r16] != r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b3, code lost:
        if (r2[r6] != r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b5, code lost:
        f(r8, (int) ((r4 * r25.q()) + 0.5f), r8, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e8, code lost:
        f(r10, 0, r10, 0, r12);
        r12.f6352d.f6535e.f6518m = r12.q();
        r12.f6354e.f6535e.f6518m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c0, code lost:
        if (r13 == 2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
        if (r6 == 2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
        if (r13 != 3) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d6, code lost:
        if (r6 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d9, code lost:
        if (r6 != 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e8, code lost:
        if (r15 != 3) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ea, code lost:
        if (r6 != r0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ec, code lost:
        f(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f5, code lost:
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012c, code lost:
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
        if (r15 != 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0131, code lost:
        f(r8, 0, r6, 0, r12);
        r12.f6352d.f6535e.f6518m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
        if (r15 != 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0147, code lost:
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0149, code lost:
        if (r0 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014c, code lost:
        if (r0 != 4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014f, code lost:
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0152, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0154, code lost:
        f(1, (int) ((r4 * r25.q()) + 0.5f), r6, r12.k(), r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0182, code lost:
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018a, code lost:
        if (r7[r16].f6343f == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0190, code lost:
        if (r7[1].f6343f != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0192, code lost:
        f(r8, 0, r10, 0, r12);
        r12.f6352d.f6535e.d(r12.q());
        r12.f6354e.f6535e.d(r12.k());
        r12.f6346a = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w.e r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.e.b(w.e):void");
    }

    public final void c() {
        w.e eVar = this.f6500a;
        ArrayList arrayList = this.f6507h;
        ArrayList arrayList2 = this.f6504e;
        arrayList2.clear();
        w.e eVar2 = this.f6503d;
        eVar2.f6352d.f();
        eVar2.f6354e.f();
        arrayList2.add(eVar2.f6352d);
        arrayList2.add(eVar2.f6354e);
        ArrayList arrayList3 = eVar2.f6383q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            w.d dVar = (w.d) obj;
            if (dVar instanceof w.h) {
                o oVar = new o(dVar);
                dVar.f6352d.f();
                dVar.f6354e.f();
                oVar.f6536f = ((w.h) dVar).f6419u0;
                arrayList2.add(oVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f6348b == null) {
                        dVar.f6348b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f6348b);
                } else {
                    arrayList2.add(dVar.f6352d);
                }
                if (dVar.y()) {
                    if (dVar.f6350c == null) {
                        dVar.f6350c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f6350c);
                } else {
                    arrayList2.add(dVar.f6354e);
                }
                if (dVar instanceof w.i) {
                    arrayList2.add(new o(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            o oVar2 = (o) obj3;
            if (oVar2.f6532b != eVar2) {
                oVar2.d();
            }
        }
        arrayList.clear();
        e(eVar.f6352d, 0, arrayList);
        e(eVar.f6354e, 1, arrayList);
        this.f6501b = false;
    }

    public final int d(w.e eVar, int i) {
        ArrayList arrayList;
        int i9;
        long max;
        float f9;
        w.e eVar2 = eVar;
        ArrayList arrayList2 = this.f6507h;
        int size = arrayList2.size();
        long j = 0;
        int i10 = 0;
        long j8 = 0;
        while (i10 < size) {
            o oVar = ((l) arrayList2.get(i10)).f6521a;
            if (!(oVar instanceof c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f6536f != i) {
                f fVar = (i == 0 ? eVar2.f6352d : eVar2.f6354e).f6538h;
                f fVar2 = (i == 0 ? eVar2.f6352d : eVar2.f6354e).i;
                f fVar3 = oVar.f6538h;
                f fVar4 = oVar.i;
                boolean contains = fVar3.f6517l.contains(fVar);
                boolean contains2 = fVar4.f6517l.contains(fVar2);
                long j9 = oVar.j();
                if (contains && contains2) {
                    long b10 = l.b(fVar3, j);
                    long a10 = l.a(fVar4, j);
                    long j10 = b10 - j9;
                    int i11 = fVar4.f6513f;
                    arrayList = arrayList2;
                    i9 = size;
                    if (j10 >= (-i11)) {
                        j10 += i11;
                    }
                    long j11 = fVar3.f6513f;
                    long j12 = ((-a10) - j9) - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    w.d dVar = oVar.f6532b;
                    if (i == 0) {
                        f9 = dVar.f6353d0;
                    } else if (i == 1) {
                        f9 = dVar.f6355e0;
                    } else {
                        dVar.getClass();
                        f9 = -1.0f;
                    }
                    float f10 = (float) (f9 > 0.0f ? (((float) j10) / (1.0f - f9)) + (((float) j12) / f9) : 0L);
                    max = (fVar3.f6513f + ((((f10 * f9) + 0.5f) + j9) + g2.g.b(1.0f, f9, f10, 0.5f))) - fVar4.f6513f;
                } else {
                    arrayList = arrayList2;
                    i9 = size;
                    max = contains ? Math.max(l.b(fVar3, fVar3.f6513f), fVar3.f6513f + j9) : contains2 ? Math.max(-l.a(fVar4, fVar4.f6513f), (-fVar4.f6513f) + j9) : (oVar.j() + fVar3.f6513f) - fVar4.f6513f;
                }
            } else {
                arrayList = arrayList2;
                i9 = size;
                max = j;
            }
            j8 = Math.max(j8, max);
            i10++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i9;
            j = 0;
        }
        return (int) j8;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        f fVar = oVar.f6538h;
        f fVar2 = oVar.i;
        ArrayList arrayList2 = fVar.f6516k;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f6538h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f6516k;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m) oVar).f6523k.f6516k;
            int size3 = arrayList4.size();
            while (i9 < size3) {
                Object obj3 = arrayList4.get(i9);
                i9++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i9, int i10, int i11, w.d dVar) {
        b bVar = this.f6506g;
        bVar.f6490a = i;
        bVar.f6491b = i10;
        bVar.f6492c = i9;
        bVar.f6493d = i11;
        this.f6505f.b(dVar, bVar);
        dVar.O(bVar.f6494e);
        dVar.L(bVar.f6495f);
        dVar.E = bVar.f6497h;
        dVar.I(bVar.f6496g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f6500a.f6383q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i9 = i + 1;
            w.d dVar = (w.d) arrayList.get(i);
            if (!dVar.f6346a) {
                int[] iArr = dVar.f6373p0;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = dVar.f6374r;
                int i13 = dVar.f6375s;
                boolean z9 = i10 == 2 || (i10 == 3 && i12 == 1);
                boolean z10 = i11 == 2 || (i11 == 3 && i13 == 1);
                g gVar = dVar.f6352d.f6535e;
                boolean z11 = gVar.j;
                g gVar2 = dVar.f6354e.f6535e;
                boolean z12 = gVar2.j;
                boolean z13 = z9;
                if (z11 && z12) {
                    eVar.f(1, gVar.f6514g, 1, gVar2.f6514g, dVar);
                    dVar.f6346a = true;
                } else if (z11 && z10) {
                    f(1, gVar.f6514g, 2, gVar2.f6514g, dVar);
                    if (i11 == 3) {
                        dVar.f6354e.f6535e.f6518m = dVar.k();
                    } else {
                        dVar.f6354e.f6535e.d(dVar.k());
                        dVar.f6346a = true;
                    }
                } else if (z12 && z13) {
                    f(2, gVar.f6514g, 1, gVar2.f6514g, dVar);
                    if (i10 == 3) {
                        dVar.f6352d.f6535e.f6518m = dVar.q();
                    } else {
                        dVar.f6352d.f6535e.d(dVar.q());
                        dVar.f6346a = true;
                    }
                }
                if (dVar.f6346a && (aVar = dVar.f6354e.f6524l) != null) {
                    aVar.d(dVar.f6347a0);
                }
                eVar = this;
            }
            i = i9;
        }
    }
}
