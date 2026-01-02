package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6519a = new Object();

    public static boolean a(w.d dVar) {
        int[] iArr = dVar.f6373p0;
        int i = iArr[0];
        int i9 = iArr[1];
        w.d dVar2 = dVar.T;
        w.e eVar = dVar2 != null ? (w.e) dVar2 : null;
        if (eVar != null) {
            int i10 = eVar.f6373p0[0];
        }
        if (eVar != null) {
            int i11 = eVar.f6373p0[1];
        }
        boolean z9 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f6374r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f6374r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i9 == 1 || dVar.B() || i9 == 2 || (i9 == 3 && dVar.f6375s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i9 == 3 && dVar.f6375s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z9 || z10)) || (z9 && z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [x.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static n b(w.d dVar, int i, ArrayList arrayList, n nVar) {
        int i9;
        int i10 = i == 0 ? dVar.f6369n0 : dVar.f6371o0;
        if (i10 != -1 && (nVar == 0 || i10 != nVar.f6527b)) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i11);
                if (nVar2.f6527b == i10) {
                    if (nVar != 0) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i11++;
                }
            }
        } else if (i10 != -1) {
            return nVar;
        }
        n nVar3 = nVar;
        if (nVar == null) {
            if (dVar instanceof w.i) {
                w.i iVar = (w.i) dVar;
                int i12 = 0;
                while (true) {
                    if (i12 >= iVar.f6422r0) {
                        i9 = -1;
                        break;
                    }
                    w.d dVar2 = iVar.f6421q0[i12];
                    if ((i == 0 && (i9 = dVar2.f6369n0) != -1) || (i == 1 && (i9 = dVar2.f6371o0) != -1)) {
                        break;
                    }
                    i12++;
                }
                if (i9 != -1) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList.size()) {
                            break;
                        }
                        n nVar4 = (n) arrayList.get(i13);
                        if (nVar4.f6527b == i9) {
                            nVar = nVar4;
                            break;
                        }
                        i13++;
                    }
                }
            }
            if (nVar == 0) {
                nVar = new Object();
                nVar.f6526a = new ArrayList();
                nVar.f6529d = null;
                nVar.f6530e = -1;
                int i14 = n.f6525f;
                n.f6525f = i14 + 1;
                nVar.f6527b = i14;
                nVar.f6528c = i;
            }
            arrayList.add(nVar);
            nVar3 = nVar;
        }
        int i15 = nVar3.f6527b;
        ArrayList arrayList2 = nVar3.f6526a;
        if (arrayList2.contains(dVar)) {
            return nVar3;
        }
        arrayList2.add(dVar);
        if (dVar instanceof w.h) {
            w.h hVar = (w.h) dVar;
            hVar.f6418t0.c(hVar.f6419u0 == 0 ? 1 : 0, arrayList, nVar3);
        }
        if (i == 0) {
            dVar.f6369n0 = i15;
            dVar.I.c(i, arrayList, nVar3);
            dVar.K.c(i, arrayList, nVar3);
        } else {
            dVar.f6371o0 = i15;
            dVar.J.c(i, arrayList, nVar3);
            dVar.M.c(i, arrayList, nVar3);
            dVar.L.c(i, arrayList, nVar3);
        }
        dVar.P.c(i, arrayList, nVar3);
        return nVar3;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, x.b] */
    public static void c(int i, w.d dVar, z.f fVar, boolean z9) {
        w.c cVar;
        w.c cVar2;
        boolean z10;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f6366m) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, fVar, new Object());
        }
        w.c i9 = dVar.i(2);
        w.c i10 = dVar.i(4);
        int d9 = i9.d();
        int d10 = i10.d();
        HashSet hashSet = i9.f6338a;
        if (hashSet != null && i9.f6340c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.c cVar5 = (w.c) it.next();
                w.d dVar2 = cVar5.f6341d;
                int i11 = i + 1;
                boolean a10 = a(dVar2);
                w.c cVar6 = dVar2.I;
                w.c cVar7 = dVar2.K;
                if (dVar2.z() && a10) {
                    z10 = true;
                    w.e.V(dVar2, fVar, new Object());
                } else {
                    z10 = true;
                }
                boolean z11 = ((cVar5 == cVar6 && (cVar4 = cVar7.f6343f) != null && cVar4.f6340c) || (cVar5 == cVar7 && (cVar3 = cVar6.f6343f) != null && cVar3.f6340c)) ? z10 : false;
                int i12 = dVar2.f6373p0[0];
                if (i12 != 3 || a10) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f6343f == null) {
                            int e9 = cVar6.e() + d9;
                            dVar2.J(e9, dVar2.q() + e9);
                            c(i11, dVar2, fVar, z9);
                        } else if (cVar5 == cVar7 && cVar6.f6343f == null) {
                            int e10 = d9 - cVar7.e();
                            dVar2.J(e10 - dVar2.q(), e10);
                            c(i11, dVar2, fVar, z9);
                        } else if (z11 && !dVar2.x()) {
                            d(i11, dVar2, fVar, z9);
                        }
                    }
                } else if (i12 == 3 && dVar2.f6378v >= 0 && dVar2.f6377u >= 0 && (dVar2.f6358g0 == 8 || (dVar2.f6374r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z11 && !dVar2.x()) {
                        e(i11, dVar, fVar, dVar2, z9);
                    }
                }
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i10.f6338a;
        if (hashSet2 != null && i10.f6340c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.c cVar8 = (w.c) it2.next();
                w.d dVar3 = cVar8.f6341d;
                int i13 = i + 1;
                boolean a11 = a(dVar3);
                w.c cVar9 = dVar3.I;
                w.c cVar10 = dVar3.K;
                if (dVar3.z() && a11) {
                    w.e.V(dVar3, fVar, new Object());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f6343f) != null && cVar2.f6340c) || (cVar8 == cVar10 && (cVar = cVar9.f6343f) != null && cVar.f6340c);
                int i14 = dVar3.f6373p0[0];
                if (i14 != 3 || a11) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f6343f == null) {
                            int e11 = cVar9.e() + d10;
                            dVar3.J(e11, dVar3.q() + e11);
                            c(i13, dVar3, fVar, z9);
                        } else if (cVar8 == cVar10 && cVar9.f6343f == null) {
                            int e12 = d10 - cVar10.e();
                            dVar3.J(e12 - dVar3.q(), e12);
                            c(i13, dVar3, fVar, z9);
                        } else if (z12 && !dVar3.x()) {
                            d(i13, dVar3, fVar, z9);
                        }
                    }
                } else if (i14 == 3 && dVar3.f6378v >= 0 && dVar3.f6377u >= 0) {
                    if (dVar3.f6358g0 == 8 || (dVar3.f6374r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z12 && !dVar3.x()) {
                            e(i13, dVar, fVar, dVar3, z9);
                        }
                    }
                }
            }
        }
        dVar.f6366m = true;
    }

    public static void d(int i, w.d dVar, z.f fVar, boolean z9) {
        float f9 = dVar.f6353d0;
        w.c cVar = dVar.I;
        int d9 = cVar.f6343f.d();
        w.c cVar2 = dVar.K;
        int d10 = cVar2.f6343f.d();
        int e9 = cVar.e() + d9;
        int e10 = d10 - cVar2.e();
        if (d9 == d10) {
            f9 = 0.5f;
        } else {
            d9 = e9;
            d10 = e10;
        }
        int q = dVar.q();
        int i9 = (d10 - d9) - q;
        if (d9 > d10) {
            i9 = (d9 - d10) - q;
        }
        int i10 = ((int) (i9 > 0 ? (f9 * i9) + 0.5f : f9 * i9)) + d9;
        int i11 = i10 + q;
        if (d9 > d10) {
            i11 = i10 - q;
        }
        dVar.J(i10, i11);
        c(i + 1, dVar, fVar, z9);
    }

    public static void e(int i, w.d dVar, z.f fVar, w.d dVar2, boolean z9) {
        float f9 = dVar2.f6353d0;
        w.c cVar = dVar2.I;
        int e9 = cVar.e() + cVar.f6343f.d();
        w.c cVar2 = dVar2.K;
        int d9 = cVar2.f6343f.d() - cVar2.e();
        if (d9 >= e9) {
            int q = dVar2.q();
            if (dVar2.f6358g0 != 8) {
                int i9 = dVar2.f6374r;
                if (i9 == 2) {
                    q = (int) (dVar2.f6353d0 * 0.5f * (dVar instanceof w.e ? dVar.q() : dVar.T.q()));
                } else if (i9 == 0) {
                    q = d9 - e9;
                }
                q = Math.max(dVar2.f6377u, q);
                int i10 = dVar2.f6378v;
                if (i10 > 0) {
                    q = Math.min(i10, q);
                }
            }
            int i11 = e9 + ((int) ((f9 * ((d9 - e9) - q)) + 0.5f));
            dVar2.J(i11, q + i11);
            c(i + 1, dVar2, fVar, z9);
        }
    }

    public static void f(int i, w.d dVar, z.f fVar) {
        float f9 = dVar.f6355e0;
        w.c cVar = dVar.J;
        int d9 = cVar.f6343f.d();
        w.c cVar2 = dVar.L;
        int d10 = cVar2.f6343f.d();
        int e9 = cVar.e() + d9;
        int e10 = d10 - cVar2.e();
        if (d9 == d10) {
            f9 = 0.5f;
        } else {
            d9 = e9;
            d10 = e10;
        }
        int k9 = dVar.k();
        int i9 = (d10 - d9) - k9;
        if (d9 > d10) {
            i9 = (d9 - d10) - k9;
        }
        int i10 = (int) (i9 > 0 ? (f9 * i9) + 0.5f : f9 * i9);
        int i11 = d9 + i10;
        int i12 = i11 + k9;
        if (d9 > d10) {
            i11 = d9 - i10;
            i12 = i11 - k9;
        }
        dVar.K(i11, i12);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, w.d dVar, z.f fVar, w.d dVar2) {
        float f9 = dVar2.f6355e0;
        w.c cVar = dVar2.J;
        int e9 = cVar.e() + cVar.f6343f.d();
        w.c cVar2 = dVar2.L;
        int d9 = cVar2.f6343f.d() - cVar2.e();
        if (d9 >= e9) {
            int k9 = dVar2.k();
            if (dVar2.f6358g0 != 8) {
                int i9 = dVar2.f6375s;
                if (i9 == 2) {
                    k9 = (int) (f9 * 0.5f * (dVar instanceof w.e ? dVar.k() : dVar.T.k()));
                } else if (i9 == 0) {
                    k9 = d9 - e9;
                }
                k9 = Math.max(dVar2.f6380x, k9);
                int i10 = dVar2.f6381y;
                if (i10 > 0) {
                    k9 = Math.min(i10, k9);
                }
            }
            int i11 = e9 + ((int) ((f9 * ((d9 - e9) - k9)) + 0.5f));
            dVar2.K(i11, k9 + i11);
            i(i + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i, int i9, int i10, int i11) {
        return (i10 == 1 || i10 == 2 || (i10 == 4 && i != 2)) || (i11 == 1 || i11 == 2 || (i11 == 4 && i9 != 2));
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, x.b] */
    public static void i(int i, w.d dVar, z.f fVar) {
        boolean z9;
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f6368n) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, fVar, new Object());
        }
        w.c i9 = dVar.i(3);
        w.c i10 = dVar.i(5);
        int d9 = i9.d();
        int d10 = i10.d();
        HashSet hashSet = i9.f6338a;
        if (hashSet != null && i9.f6340c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.c cVar5 = (w.c) it.next();
                w.d dVar2 = cVar5.f6341d;
                int i11 = i + 1;
                boolean a10 = a(dVar2);
                w.c cVar6 = dVar2.J;
                w.c cVar7 = dVar2.L;
                if (dVar2.z() && a10) {
                    w.e.V(dVar2, fVar, new Object());
                }
                boolean z10 = (cVar5 == cVar6 && (cVar4 = cVar7.f6343f) != null && cVar4.f6340c) || (cVar5 == cVar7 && (cVar3 = cVar6.f6343f) != null && cVar3.f6340c);
                int i12 = dVar2.f6373p0[1];
                if (i12 != 3 || a10) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f6343f == null) {
                            int e9 = cVar6.e() + d9;
                            dVar2.K(e9, dVar2.k() + e9);
                            i(i11, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f6343f == null) {
                            int e10 = d9 - cVar7.e();
                            dVar2.K(e10 - dVar2.k(), e10);
                            i(i11, dVar2, fVar);
                        } else if (z10 && !dVar2.y()) {
                            f(i11, dVar2, fVar);
                        }
                    }
                } else if (i12 == 3 && dVar2.f6381y >= 0 && dVar2.f6380x >= 0 && (dVar2.f6358g0 == 8 || (dVar2.f6375s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z10 && !dVar2.y()) {
                        g(i11, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z11 = true;
        z11 = true;
        z11 = true;
        if (dVar instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i10.f6338a;
        if (hashSet2 != null && i10.f6340c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.c cVar8 = (w.c) it2.next();
                w.d dVar3 = cVar8.f6341d;
                int i13 = i + 1;
                boolean a11 = a(dVar3);
                w.c cVar9 = dVar3.J;
                w.c cVar10 = dVar3.L;
                if (dVar3.z() && a11) {
                    w.e.V(dVar3, fVar, new Object());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f6343f) != null && cVar2.f6340c) || (cVar8 == cVar10 && (cVar = cVar9.f6343f) != null && cVar.f6340c);
                int i14 = dVar3.f6373p0[1];
                if (i14 != 3 || a11) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f6343f == null) {
                            int e11 = cVar9.e() + d10;
                            dVar3.K(e11, dVar3.k() + e11);
                            i(i13, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f6343f == null) {
                            int e12 = d10 - cVar10.e();
                            dVar3.K(e12 - dVar3.k(), e12);
                            i(i13, dVar3, fVar);
                        } else if (z12 && !dVar3.y()) {
                            f(i13, dVar3, fVar);
                        }
                    }
                } else if (i14 == 3 && dVar3.f6381y >= 0 && dVar3.f6380x >= 0 && (dVar3.f6358g0 == 8 || (dVar3.f6375s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z12 && !dVar3.y()) {
                        g(i13, dVar, fVar, dVar3);
                    }
                }
            }
        }
        w.c i15 = dVar.i(6);
        if (i15.f6338a != null && i15.f6340c) {
            int d11 = i15.d();
            Iterator it3 = i15.f6338a.iterator();
            while (it3.hasNext()) {
                w.c cVar11 = (w.c) it3.next();
                w.d dVar4 = cVar11.f6341d;
                int i16 = i + 1;
                boolean a12 = a(dVar4);
                w.c cVar12 = dVar4.M;
                if (dVar4.z() && a12) {
                    w.e.V(dVar4, fVar, new Object());
                }
                if (dVar4.f6373p0[z11 ? 1 : 0] != 3 || a12) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int e13 = cVar11.e() + d11;
                            if (dVar4.E) {
                                int i17 = e13 - dVar4.f6347a0;
                                int i18 = dVar4.V + i17;
                                dVar4.Z = i17;
                                dVar4.J.l(i17);
                                dVar4.L.l(i18);
                                cVar12.l(e13);
                                z9 = z11 ? 1 : 0;
                                dVar4.f6365l = z9;
                            } else {
                                z9 = z11 ? 1 : 0;
                            }
                            i(i16, dVar4, fVar);
                            z11 = z9;
                        }
                    }
                }
                z9 = z11 ? 1 : 0;
                z11 = z9;
            }
        }
        dVar.f6368n = z11;
    }
}
