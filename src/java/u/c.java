package u;

import b8.g;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c {
    public static boolean q;

    /* renamed from: d  reason: collision with root package name */
    public final d f6004d;

    /* renamed from: m  reason: collision with root package name */
    public final g f6011m;

    /* renamed from: p  reason: collision with root package name */
    public b f6014p;

    /* renamed from: a  reason: collision with root package name */
    public int f6001a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6002b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f6003c = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f6005e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f6006f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6008h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f6009k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f6010l = 32;

    /* renamed from: n  reason: collision with root package name */
    public f[] f6012n = new f[1000];

    /* renamed from: o  reason: collision with root package name */
    public int f6013o = 0;

    /* renamed from: g  reason: collision with root package name */
    public b[] f6007g = new b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [u.b, u.d] */
    public c() {
        s();
        g gVar = new g(16);
        gVar.f789b = new p0.c();
        gVar.f790c = new p0.c();
        gVar.f791d = new f[32];
        this.f6011m = gVar;
        ?? bVar = new b(gVar);
        bVar.f6015f = new f[128];
        bVar.f6016g = new f[128];
        bVar.f6017h = 0;
        bVar.i = new n0.a((d) bVar);
        this.f6004d = bVar;
        this.f6014p = new b(gVar);
    }

    public static int n(Object obj) {
        f fVar = ((w.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.f6023e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i) {
        p0.c cVar = (p0.c) this.f6011m.f790c;
        int i9 = cVar.f5060b;
        f fVar = null;
        if (i9 > 0) {
            int i10 = i9 - 1;
            ?? r32 = cVar.f5059a;
            ?? r42 = r32[i10];
            r32[i10] = 0;
            cVar.f5060b = i10;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i);
            fVar2.f6029r = i;
        } else {
            fVar2.c();
            fVar2.f6029r = i;
        }
        int i11 = this.f6013o;
        int i12 = this.f6001a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f6001a = i13;
            this.f6012n = (f[]) Arrays.copyOf(this.f6012n, i13);
        }
        f[] fVarArr = this.f6012n;
        int i14 = this.f6013o;
        this.f6013o = i14 + 1;
        fVarArr[i14] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i, float f9, f fVar3, f fVar4, int i9, int i10) {
        b l5 = l();
        if (fVar2 == fVar3) {
            l5.f5999d.g(fVar, 1.0f);
            l5.f5999d.g(fVar4, 1.0f);
            l5.f5999d.g(fVar2, -2.0f);
        } else if (f9 == 0.5f) {
            l5.f5999d.g(fVar, 1.0f);
            l5.f5999d.g(fVar2, -1.0f);
            l5.f5999d.g(fVar3, -1.0f);
            l5.f5999d.g(fVar4, 1.0f);
            if (i > 0 || i9 > 0) {
                l5.f5997b = (-i) + i9;
            }
        } else if (f9 <= 0.0f) {
            l5.f5999d.g(fVar, -1.0f);
            l5.f5999d.g(fVar2, 1.0f);
            l5.f5997b = i;
        } else if (f9 >= 1.0f) {
            l5.f5999d.g(fVar4, -1.0f);
            l5.f5999d.g(fVar3, 1.0f);
            l5.f5997b = -i9;
        } else {
            float f10 = 1.0f - f9;
            l5.f5999d.g(fVar, f10 * 1.0f);
            l5.f5999d.g(fVar2, f10 * (-1.0f));
            l5.f5999d.g(fVar3, (-1.0f) * f9);
            l5.f5999d.g(fVar4, 1.0f * f9);
            if (i > 0 || i9 > 0) {
                l5.f5997b = (i9 * f9) + ((-i) * f10);
            }
        }
        if (i10 != 8) {
            l5.a(this, i10);
        }
        c(l5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
        if (r4.q <= 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
        if (r4.q <= 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f5, code lost:
        if (r4.q <= 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f8, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0102, code lost:
        if (r4.q <= 1) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(u.b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.c(u.b):void");
    }

    public final void d(f fVar, int i) {
        int i9 = fVar.f6021c;
        if (i9 == -1) {
            fVar.d(this, i);
            for (int i10 = 0; i10 < this.f6003c + 1; i10++) {
                f fVar2 = ((f[]) this.f6011m.f791d)[i10];
            }
        } else if (i9 == -1) {
            b l5 = l();
            l5.f5996a = fVar;
            float f9 = i;
            fVar.f6023e = f9;
            l5.f5997b = f9;
            l5.f6000e = true;
            c(l5);
        } else {
            b bVar = this.f6007g[i9];
            if (bVar.f6000e) {
                bVar.f5997b = i;
            } else if (bVar.f5999d.d() == 0) {
                bVar.f6000e = true;
                bVar.f5997b = i;
            } else {
                b l9 = l();
                if (i < 0) {
                    l9.f5997b = i * (-1);
                    l9.f5999d.g(fVar, 1.0f);
                } else {
                    l9.f5997b = i;
                    l9.f5999d.g(fVar, -1.0f);
                }
                c(l9);
            }
        }
    }

    public final void e(f fVar, f fVar2, int i, int i9) {
        if (i9 == 8 && fVar2.f6024f && fVar.f6021c == -1) {
            fVar.d(this, fVar2.f6023e + i);
            return;
        }
        b l5 = l();
        boolean z9 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z9 = true;
            }
            l5.f5997b = i;
        }
        if (z9) {
            l5.f5999d.g(fVar, 1.0f);
            l5.f5999d.g(fVar2, -1.0f);
        } else {
            l5.f5999d.g(fVar, -1.0f);
            l5.f5999d.g(fVar2, 1.0f);
        }
        if (i9 != 8) {
            l5.a(this, i9);
        }
        c(l5);
    }

    public final void f(f fVar, f fVar2, int i, int i9) {
        b l5 = l();
        f m9 = m();
        m9.f6022d = 0;
        l5.b(fVar, fVar2, m9, i);
        if (i9 != 8) {
            l5.f5999d.g(j(i9), (int) (l5.f5999d.c(m9) * (-1.0f)));
        }
        c(l5);
    }

    public final void g(f fVar, f fVar2, int i, int i9) {
        b l5 = l();
        f m9 = m();
        m9.f6022d = 0;
        l5.c(fVar, fVar2, m9, i);
        if (i9 != 8) {
            l5.f5999d.g(j(i9), (int) (l5.f5999d.c(m9) * (-1.0f)));
        }
        c(l5);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.f6000e) {
            bVar.f5996a.d(this, bVar.f5997b);
        } else {
            b[] bVarArr = this.f6007g;
            int i9 = this.f6009k;
            bVarArr[i9] = bVar;
            f fVar = bVar.f5996a;
            fVar.f6021c = i9;
            this.f6009k = i9 + 1;
            fVar.e(this, bVar);
        }
        if (this.f6002b) {
            int i10 = 0;
            while (i10 < this.f6009k) {
                if (this.f6007g[i10] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f6007g[i10];
                if (bVar2 != null && bVar2.f6000e) {
                    bVar2.f5996a.d(this, bVar2.f5997b);
                    ((p0.c) this.f6011m.f789b).b(bVar2);
                    this.f6007g[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i = this.f6009k;
                        if (i11 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f6007g;
                        int i13 = i11 - 1;
                        b bVar3 = bVarArr2[i11];
                        bVarArr2[i13] = bVar3;
                        f fVar2 = bVar3.f5996a;
                        if (fVar2.f6021c == i11) {
                            fVar2.f6021c = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i) {
                        this.f6007g[i12] = null;
                    }
                    this.f6009k = i - 1;
                    i10--;
                }
                i10++;
            }
            this.f6002b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f6009k; i++) {
            b bVar = this.f6007g[i];
            bVar.f5996a.f6023e = bVar.f5997b;
        }
    }

    public final f j(int i) {
        if (this.j + 1 >= this.f6006f) {
            o();
        }
        f a10 = a(4);
        float[] fArr = a10.f6026n;
        int i9 = this.f6003c + 1;
        this.f6003c = i9;
        this.j++;
        a10.f6020b = i9;
        a10.f6022d = i;
        ((f[]) this.f6011m.f791d)[i9] = a10;
        d dVar = this.f6004d;
        dVar.i.f4373b = a10;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f6022d] = 1.0f;
        dVar.j(a10);
        return a10;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f6006f) {
            o();
        }
        if (obj instanceof w.c) {
            w.c cVar = (w.c) obj;
            f fVar = cVar.i;
            if (fVar == null) {
                cVar.k();
                fVar = cVar.i;
            }
            int i = fVar.f6020b;
            g gVar = this.f6011m;
            if (i == -1 || i > this.f6003c || ((f[]) gVar.f791d)[i] == null) {
                if (i != -1) {
                    fVar.c();
                }
                int i9 = this.f6003c + 1;
                this.f6003c = i9;
                this.j++;
                fVar.f6020b = i9;
                fVar.f6029r = 1;
                ((f[]) gVar.f791d)[i9] = fVar;
                return fVar;
            }
            return fVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b l() {
        b bVar;
        g gVar = this.f6011m;
        p0.c cVar = (p0.c) gVar.f789b;
        int i = cVar.f5060b;
        if (i > 0) {
            int i9 = i - 1;
            ?? r42 = cVar.f5059a;
            ?? r52 = r42[i9];
            r42[i9] = 0;
            cVar.f5060b = i9;
            bVar = r52;
        } else {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 == null) {
            return new b(gVar);
        }
        bVar2.f5996a = null;
        bVar2.f5999d.b();
        bVar2.f5997b = 0.0f;
        bVar2.f6000e = false;
        return bVar2;
    }

    public final f m() {
        if (this.j + 1 >= this.f6006f) {
            o();
        }
        f a10 = a(3);
        int i = this.f6003c + 1;
        this.f6003c = i;
        this.j++;
        a10.f6020b = i;
        ((f[]) this.f6011m.f791d)[i] = a10;
        return a10;
    }

    public final void o() {
        int i = this.f6005e * 2;
        this.f6005e = i;
        this.f6007g = (b[]) Arrays.copyOf(this.f6007g, i);
        g gVar = this.f6011m;
        gVar.f791d = (f[]) Arrays.copyOf((f[]) gVar.f791d, this.f6005e);
        int i9 = this.f6005e;
        this.i = new boolean[i9];
        this.f6006f = i9;
        this.f6010l = i9;
    }

    public final void p() {
        d dVar = this.f6004d;
        if (dVar.e()) {
            i();
        } else if (!this.f6008h) {
            q(dVar);
        } else {
            for (int i = 0; i < this.f6009k; i++) {
                if (!this.f6007g[i].f6000e) {
                    q(dVar);
                    return;
                }
            }
            i();
        }
    }

    public final void q(d dVar) {
        int i = 0;
        while (true) {
            if (i >= this.f6009k) {
                break;
            }
            b bVar = this.f6007g[i];
            int i9 = 1;
            if (bVar.f5996a.f6029r != 1) {
                float f9 = 0.0f;
                if (bVar.f5997b < 0.0f) {
                    boolean z9 = false;
                    int i10 = 0;
                    while (!z9) {
                        i10 += i9;
                        float f10 = Float.MAX_VALUE;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < this.f6009k) {
                            b bVar2 = this.f6007g[i13];
                            if (bVar2.f5996a.f6029r != i9 && !bVar2.f6000e && bVar2.f5997b < f9) {
                                int d9 = bVar2.f5999d.d();
                                int i15 = 0;
                                while (i15 < d9) {
                                    f e9 = bVar2.f5999d.e(i15);
                                    float c9 = bVar2.f5999d.c(e9);
                                    if (c9 > f9) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f11 = e9.f6025m[i16] / c9;
                                            if ((f11 < f10 && i16 == i14) || i16 > i14) {
                                                i14 = i16;
                                                i12 = e9.f6020b;
                                                i11 = i13;
                                                f10 = f11;
                                            }
                                        }
                                    }
                                    i15++;
                                    f9 = 0.0f;
                                }
                            }
                            i13++;
                            f9 = 0.0f;
                            i9 = 1;
                        }
                        if (i11 != -1) {
                            b bVar3 = this.f6007g[i11];
                            bVar3.f5996a.f6021c = -1;
                            bVar3.g(((f[]) this.f6011m.f791d)[i12]);
                            f fVar = bVar3.f5996a;
                            fVar.f6021c = i11;
                            fVar.e(this, bVar3);
                        } else {
                            z9 = true;
                        }
                        if (i10 > this.j / 2) {
                            z9 = true;
                        }
                        f9 = 0.0f;
                        i9 = 1;
                    }
                }
            }
            i++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z9;
        int i = 0;
        for (int i9 = 0; i9 < this.j; i9++) {
            this.i[i9] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int i11 = 1;
            i10++;
            if (i10 >= this.j * 2) {
                return;
            }
            f fVar = bVar.f5996a;
            if (fVar != null) {
                this.i[fVar.f6020b] = true;
            }
            f d9 = bVar.d(this.i);
            if (d9 != null) {
                boolean[] zArr = this.i;
                int i12 = d9.f6020b;
                if (zArr[i12]) {
                    return;
                }
                zArr[i12] = true;
            }
            if (d9 != null) {
                float f9 = Float.MAX_VALUE;
                int i13 = i;
                int i14 = -1;
                while (i13 < this.f6009k) {
                    b bVar2 = this.f6007g[i13];
                    if (bVar2.f5996a.f6029r != i11 && !bVar2.f6000e) {
                        a aVar = bVar2.f5999d;
                        int i15 = aVar.f5995h;
                        if (i15 != -1) {
                            for (int i16 = 0; i15 != -1 && i16 < aVar.f5988a; i16++) {
                                if (aVar.f5992e[i15] == d9.f6020b) {
                                    z9 = true;
                                    break;
                                }
                                i15 = aVar.f5993f[i15];
                            }
                        }
                        z9 = false;
                        if (z9) {
                            float c9 = bVar2.f5999d.c(d9);
                            if (c9 < 0.0f) {
                                float f10 = (-bVar2.f5997b) / c9;
                                if (f10 < f9) {
                                    f9 = f10;
                                    i14 = i13;
                                }
                            }
                        }
                    }
                    i13++;
                    i11 = 1;
                }
                if (i14 > -1) {
                    b bVar3 = this.f6007g[i14];
                    bVar3.f5996a.f6021c = -1;
                    bVar3.g(d9);
                    f fVar2 = bVar3.f5996a;
                    fVar2.f6021c = i14;
                    fVar2.e(this, bVar3);
                }
            } else {
                z10 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f6009k; i++) {
            b bVar = this.f6007g[i];
            if (bVar != null) {
                ((p0.c) this.f6011m.f789b).b(bVar);
            }
            this.f6007g[i] = null;
        }
    }

    public final void t() {
        g gVar;
        int i = 0;
        while (true) {
            gVar = this.f6011m;
            f[] fVarArr = (f[]) gVar.f791d;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        p0.c cVar = (p0.c) gVar.f790c;
        f[] fVarArr2 = this.f6012n;
        int i9 = this.f6013o;
        cVar.getClass();
        if (i9 > fVarArr2.length) {
            i9 = fVarArr2.length;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            f fVar2 = fVarArr2[i10];
            int i11 = cVar.f5060b;
            Object[] objArr = cVar.f5059a;
            if (i11 < objArr.length) {
                objArr[i11] = fVar2;
                cVar.f5060b = i11 + 1;
            }
        }
        this.f6013o = 0;
        Arrays.fill((f[]) gVar.f791d, (Object) null);
        this.f6003c = 0;
        d dVar = this.f6004d;
        dVar.f6017h = 0;
        dVar.f5997b = 0.0f;
        this.j = 1;
        for (int i12 = 0; i12 < this.f6009k; i12++) {
            b bVar = this.f6007g[i12];
        }
        s();
        this.f6009k = 0;
        this.f6014p = new b(gVar);
    }
}
