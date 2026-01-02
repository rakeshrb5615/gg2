package u;

import b8.g;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public final a f5999d;

    /* renamed from: a  reason: collision with root package name */
    public f f5996a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f5997b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5998c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f6000e = false;

    public b(g gVar) {
        this.f5999d = new a(this, gVar);
    }

    public final void a(c cVar, int i) {
        this.f5999d.g(cVar.j(i), 1.0f);
        this.f5999d.g(cVar.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z9 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z9 = true;
            }
            this.f5997b = i;
        }
        if (z9) {
            this.f5999d.g(fVar, 1.0f);
            this.f5999d.g(fVar2, -1.0f);
            this.f5999d.g(fVar3, -1.0f);
            return;
        }
        this.f5999d.g(fVar, -1.0f);
        this.f5999d.g(fVar2, 1.0f);
        this.f5999d.g(fVar3, 1.0f);
    }

    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z9 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z9 = true;
            }
            this.f5997b = i;
        }
        if (z9) {
            this.f5999d.g(fVar, 1.0f);
            this.f5999d.g(fVar2, -1.0f);
            this.f5999d.g(fVar3, 1.0f);
            return;
        }
        this.f5999d.g(fVar, -1.0f);
        this.f5999d.g(fVar2, 1.0f);
        this.f5999d.g(fVar3, -1.0f);
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f5996a == null && this.f5997b == 0.0f && this.f5999d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int d9 = this.f5999d.d();
        f fVar2 = null;
        float f9 = 0.0f;
        for (int i9 = 0; i9 < d9; i9++) {
            float f10 = this.f5999d.f(i9);
            if (f10 < 0.0f) {
                f e9 = this.f5999d.e(i9);
                if ((zArr == null || !zArr[e9.f6020b]) && e9 != fVar && (((i = e9.f6029r) == 3 || i == 4) && f10 < f9)) {
                    f9 = f10;
                    fVar2 = e9;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f5996a;
        if (fVar2 != null) {
            this.f5999d.g(fVar2, -1.0f);
            this.f5996a.f6021c = -1;
            this.f5996a = null;
        }
        float h9 = this.f5999d.h(fVar, true) * (-1.0f);
        this.f5996a = fVar;
        if (h9 == 1.0f) {
            return;
        }
        this.f5997b /= h9;
        a aVar = this.f5999d;
        int i = aVar.f5995h;
        for (int i9 = 0; i != -1 && i9 < aVar.f5988a; i9++) {
            float[] fArr = aVar.f5994g;
            fArr[i] = fArr[i] / h9;
            i = aVar.f5993f[i];
        }
    }

    public final void h(c cVar, f fVar, boolean z9) {
        if (fVar.f6024f) {
            float c9 = this.f5999d.c(fVar);
            this.f5997b = (fVar.f6023e * c9) + this.f5997b;
            this.f5999d.h(fVar, z9);
            if (z9) {
                fVar.b(this);
            }
            if (this.f5999d.d() == 0) {
                this.f6000e = true;
                cVar.f6002b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z9) {
        a aVar = this.f5999d;
        aVar.getClass();
        float c9 = aVar.c(bVar.f5996a);
        aVar.h(bVar.f5996a, z9);
        a aVar2 = bVar.f5999d;
        int d9 = aVar2.d();
        for (int i = 0; i < d9; i++) {
            f e9 = aVar2.e(i);
            aVar.a(e9, aVar2.c(e9) * c9, z9);
        }
        this.f5997b = (bVar.f5997b * c9) + this.f5997b;
        if (z9) {
            bVar.f5996a.b(this);
        }
        if (this.f5996a == null || this.f5999d.d() != 0) {
            return;
        }
        this.f6000e = true;
        cVar.f6002b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            u.f r0 = r10.f5996a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            u.f r1 = r10.f5996a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = g2.g.d(r0, r1)
            float r1 = r10.f5997b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = u.e.b(r0)
            float r1 = r10.f5997b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            u.a r5 = r10.f5999d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            u.a r6 = r10.f5999d
            u.f r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            u.a r7 = r10.f5999d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = g2.g.d(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = g2.g.d(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = g2.g.d(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = g2.g.d(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = g2.g.d(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.b.toString():java.lang.String");
    }
}
