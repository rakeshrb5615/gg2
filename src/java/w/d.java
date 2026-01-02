package w;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import x.k;
import x.m;
import x.o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f6347a0;

    /* renamed from: b  reason: collision with root package name */
    public x.c f6348b;

    /* renamed from: b0  reason: collision with root package name */
    public int f6349b0;

    /* renamed from: c  reason: collision with root package name */
    public x.c f6350c;

    /* renamed from: c0  reason: collision with root package name */
    public int f6351c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f6353d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f6355e0;
    public View f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6358g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f6360h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f6361i0;
    public String j;

    /* renamed from: j0  reason: collision with root package name */
    public int f6362j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6363k;

    /* renamed from: k0  reason: collision with root package name */
    public final float[] f6364k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6365l;
    public final d[] l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6366m;

    /* renamed from: m0  reason: collision with root package name */
    public final d[] f6367m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6368n;

    /* renamed from: n0  reason: collision with root package name */
    public int f6369n0;

    /* renamed from: o  reason: collision with root package name */
    public int f6370o;

    /* renamed from: o0  reason: collision with root package name */
    public int f6371o0;

    /* renamed from: p  reason: collision with root package name */
    public int f6372p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f6373p0;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public int f6374r;

    /* renamed from: s  reason: collision with root package name */
    public int f6375s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f6376t;

    /* renamed from: u  reason: collision with root package name */
    public int f6377u;

    /* renamed from: v  reason: collision with root package name */
    public int f6378v;

    /* renamed from: w  reason: collision with root package name */
    public float f6379w;

    /* renamed from: x  reason: collision with root package name */
    public int f6380x;

    /* renamed from: y  reason: collision with root package name */
    public int f6381y;

    /* renamed from: z  reason: collision with root package name */
    public float f6382z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6346a = false;

    /* renamed from: d  reason: collision with root package name */
    public k f6352d = null;

    /* renamed from: e  reason: collision with root package name */
    public m f6354e = null;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f6356f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f6357g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f6359h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f6363k = false;
        this.f6365l = false;
        this.f6366m = false;
        this.f6368n = false;
        this.f6370o = -1;
        this.f6372p = -1;
        this.q = 0;
        this.f6374r = 0;
        this.f6375s = 0;
        this.f6376t = new int[2];
        this.f6377u = 0;
        this.f6378v = 0;
        this.f6379w = 1.0f;
        this.f6380x = 0;
        this.f6381y = 0;
        this.f6382z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f6373p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f6347a0 = 0;
        this.f6353d0 = 0.5f;
        this.f6355e0 = 0.5f;
        this.f6358g0 = 0;
        this.f6360h0 = null;
        this.f6361i0 = 0;
        this.f6362j0 = 0;
        this.f6364k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new d[]{null, null};
        this.f6367m0 = new d[]{null, null};
        this.f6369n0 = -1;
        this.f6371o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i, int i9, String str, StringBuilder sb) {
        if (i == i9) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f9, float f10) {
        if (f9 == f10) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f9);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i9, int i10, int i11, int i12, float f9, int i13) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i13 == 1) {
            str2 = "FIXED";
        } else if (i13 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i13 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else if (i13 != 4) {
            throw null;
        } else {
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i, 0, "      size", sb);
        G(i9, 0, "      min", sb);
        G(i10, Integer.MAX_VALUE, "      max", sb);
        G(i11, 0, "      matchMin", sb);
        G(i12, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f9, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f6343f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f6343f);
        sb.append("'");
        if (cVar.f6345h != Integer.MIN_VALUE || cVar.f6344g != 0) {
            sb.append(",");
            sb.append(cVar.f6344g);
            if (cVar.f6345h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f6345h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f6363k) {
            return true;
        }
        return this.I.f6340c && this.K.f6340c;
    }

    public boolean B() {
        if (this.f6365l) {
            return true;
        }
        return this.J.f6340c && this.L.f6340c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f6347a0 = 0;
        this.f6349b0 = 0;
        this.f6351c0 = 0;
        this.f6353d0 = 0.5f;
        this.f6355e0 = 0.5f;
        int[] iArr = this.f6373p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.f6358g0 = 0;
        this.f6361i0 = 0;
        this.f6362j0 = 0;
        float[] fArr = this.f6364k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f6370o = -1;
        this.f6372p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f6374r = 0;
        this.f6375s = 0;
        this.f6379w = 1.0f;
        this.f6382z = 1.0f;
        this.f6378v = Integer.MAX_VALUE;
        this.f6381y = Integer.MAX_VALUE;
        this.f6377u = 0;
        this.f6380x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f6356f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f6357g = true;
        int[] iArr3 = this.f6376t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f6359h = -1;
        this.i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.f6363k = false;
        this.f6365l = false;
        this.f6366m = false;
        this.f6368n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f6340c = false;
            cVar.f6339b = 0;
        }
    }

    public void F(b8.g gVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.f6347a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i9) {
        if (this.f6363k) {
            return;
        }
        this.I.l(i);
        this.K.l(i9);
        this.Y = i;
        this.U = i9 - i;
        this.f6363k = true;
    }

    public final void K(int i, int i9) {
        if (this.f6365l) {
            return;
        }
        this.J.l(i);
        this.L.l(i9);
        this.Z = i;
        this.V = i9 - i;
        if (this.E) {
            this.M.l(i + this.f6347a0);
        }
        this.f6365l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i9 = this.f6351c0;
        if (i < i9) {
            this.V = i9;
        }
    }

    public final void M(int i) {
        this.f6373p0[0] = i;
    }

    public final void N(int i) {
        this.f6373p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i9 = this.f6349b0;
        if (i < i9) {
            this.U = i9;
        }
    }

    public void P(boolean z9, boolean z10) {
        int i;
        int i9;
        k kVar = this.f6352d;
        boolean z11 = z9 & kVar.f6537g;
        m mVar = this.f6354e;
        boolean z12 = z10 & mVar.f6537g;
        int i10 = kVar.f6538h.f6514g;
        int i11 = mVar.f6538h.f6514g;
        int i12 = kVar.i.f6514g;
        int i13 = mVar.i.f6514g;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i13 = 0;
            i10 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (z11) {
            this.Y = i10;
        }
        if (z12) {
            this.Z = i11;
        }
        if (this.f6358g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f6373p0;
        if (z11) {
            if (iArr[0] == 1 && i15 < (i9 = this.U)) {
                i15 = i9;
            }
            this.U = i15;
            int i17 = this.f6349b0;
            if (i15 < i17) {
                this.U = i17;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i16 < (i = this.V)) {
                i16 = i;
            }
            this.V = i16;
            int i18 = this.f6351c0;
            if (i16 < i18) {
                this.V = i18;
            }
        }
    }

    public void Q(u.c cVar, boolean z9) {
        int i;
        int i9;
        m mVar;
        k kVar;
        cVar.getClass();
        int n9 = u.c.n(this.I);
        int n10 = u.c.n(this.J);
        int n11 = u.c.n(this.K);
        int n12 = u.c.n(this.L);
        if (z9 && (kVar = this.f6352d) != null) {
            x.f fVar = kVar.f6538h;
            if (fVar.j) {
                x.f fVar2 = kVar.i;
                if (fVar2.j) {
                    n9 = fVar.f6514g;
                    n11 = fVar2.f6514g;
                }
            }
        }
        if (z9 && (mVar = this.f6354e) != null) {
            x.f fVar3 = mVar.f6538h;
            if (fVar3.j) {
                x.f fVar4 = mVar.i;
                if (fVar4.j) {
                    n10 = fVar3.f6514g;
                    n12 = fVar4.f6514g;
                }
            }
        }
        int i10 = n12 - n10;
        if (n11 - n9 < 0 || i10 < 0 || n9 == Integer.MIN_VALUE || n9 == Integer.MAX_VALUE || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE) {
            n9 = 0;
            n10 = 0;
            n11 = 0;
            n12 = 0;
        }
        int i11 = n11 - n9;
        int i12 = n12 - n10;
        this.Y = n9;
        this.Z = n10;
        if (this.f6358g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f6373p0;
        int i13 = iArr[0];
        if (i13 == 1 && i11 < (i9 = this.U)) {
            i11 = i9;
        }
        if (iArr[1] == 1 && i12 < (i = this.V)) {
            i12 = i;
        }
        this.U = i11;
        this.V = i12;
        int i14 = this.f6351c0;
        if (i12 < i14) {
            this.V = i14;
        }
        int i15 = this.f6349b0;
        if (i11 < i15) {
            this.U = i15;
        }
        int i16 = this.f6378v;
        if (i16 > 0 && i13 == 3) {
            this.U = Math.min(this.U, i16);
        }
        int i17 = this.f6381y;
        if (i17 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i17);
        }
        int i18 = this.U;
        if (i11 != i18) {
            this.f6359h = i18;
        }
        int i19 = this.V;
        if (i12 != i19) {
            this.i = i19;
        }
    }

    public final void a(e eVar, u.c cVar, HashSet hashSet, int i, boolean z9) {
        if (z9) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.f6338a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f6341d.a(eVar, cVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.f6338a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f6341d.a(eVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f6338a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f6341d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.f6338a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f6341d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f6338a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f6341d.a(eVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r12 != 3) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(u.c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.b(u.c, boolean):void");
    }

    public boolean c() {
        return this.f6358g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(u.c r30, boolean r31, boolean r32, boolean r33, boolean r34, u.f r35, u.f r36, int r37, boolean r38, w.c r39, w.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.d(u.c, boolean, boolean, boolean, boolean, u.f, u.f, int, boolean, w.c, w.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, d dVar, int i9, int i10) {
        boolean z9;
        if (i == 7) {
            if (i9 != 7) {
                if (i9 == 2 || i9 == 4) {
                    e(2, dVar, i9, 0);
                    e(4, dVar, i9, 0);
                    i(7).a(dVar.i(i9), 0);
                    return;
                } else if (i9 == 3 || i9 == 5) {
                    e(3, dVar, i9, 0);
                    e(5, dVar, i9, 0);
                    i(7).a(dVar.i(i9), 0);
                    return;
                } else {
                    return;
                }
            }
            c i11 = i(2);
            c i12 = i(4);
            c i13 = i(3);
            c i14 = i(5);
            boolean z10 = true;
            if ((i11 == null || !i11.h()) && (i12 == null || !i12.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i13 == null || !i13.h()) && (i14 == null || !i14.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z10 = false;
            }
            if (z9 && z10) {
                i(7).a(dVar.i(7), 0);
            } else if (z9) {
                i(8).a(dVar.i(8), 0);
            } else if (z10) {
                i(9).a(dVar.i(9), 0);
            }
        } else if (i == 8 && (i9 == 2 || i9 == 4)) {
            c i15 = i(2);
            c i16 = dVar.i(i9);
            c i17 = i(4);
            i15.a(i16, 0);
            i17.a(i16, 0);
            i(8).a(i16, 0);
        } else if (i == 9 && (i9 == 3 || i9 == 5)) {
            c i18 = dVar.i(i9);
            i(3).a(i18, 0);
            i(5).a(i18, 0);
            i(9).a(i18, 0);
        } else if (i == 8 && i9 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i9), 0);
        } else if (i == 9 && i9 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i9), 0);
        } else {
            c i19 = i(i);
            c i20 = dVar.i(i9);
            if (i19.i(i20)) {
                if (i == 6) {
                    c i21 = i(3);
                    c i22 = i(5);
                    if (i21 != null) {
                        i21.j();
                    }
                    if (i22 != null) {
                        i22.j();
                    }
                } else if (i == 3 || i == 5) {
                    c i23 = i(6);
                    if (i23 != null) {
                        i23.j();
                    }
                    c i24 = i(7);
                    if (i24.f6343f != i20) {
                        i24.j();
                    }
                    c f9 = i(i).f();
                    c i25 = i(9);
                    if (i25.h()) {
                        f9.j();
                        i25.j();
                    }
                } else if (i == 2 || i == 4) {
                    c i26 = i(7);
                    if (i26.f6343f != i20) {
                        i26.j();
                    }
                    c f10 = i(i).f();
                    c i27 = i(8);
                    if (i27.h()) {
                        f10.j();
                        i27.j();
                    }
                }
                i19.a(i20, i10);
            }
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.f6341d == this) {
            e(cVar.f6342e, cVar2.f6341d, cVar2.f6342e, i);
        }
    }

    public final void g(u.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f6347a0 > 0) {
            cVar.k(this.M);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [x.m, x.o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [x.k, x.o] */
    public final void h() {
        if (this.f6352d == null) {
            ?? oVar = new o(this);
            oVar.f6538h.f6512e = 4;
            oVar.i.f6512e = 5;
            oVar.f6536f = 0;
            this.f6352d = oVar;
        }
        if (this.f6354e == null) {
            ?? oVar2 = new o(this);
            x.f fVar = new x.f(oVar2);
            oVar2.f6523k = fVar;
            oVar2.f6524l = null;
            oVar2.f6538h.f6512e = 6;
            oVar2.i.f6512e = 7;
            fVar.f6512e = 8;
            oVar2.f6536f = 1;
            this.f6354e = oVar2;
        }
    }

    public c i(int i) {
        switch (u.e.c(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return this.K;
            case 4:
                return this.L;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return this.M;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.P;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.N;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return this.O;
            default:
                throw new AssertionError(g2.g.m(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f6373p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f6358g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.L).f6343f) != null && cVar2.f6343f == cVar) {
                return cVar2.f6341d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f6343f;
        if (cVar4 == null || cVar4.f6343f != cVar3) {
            return null;
        }
        return cVar4.f6341d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.J).f6343f) != null && cVar2.f6343f == cVar) {
                return cVar2.f6341d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f6343f;
        if (cVar4 == null || cVar4.f6343f != cVar3) {
            return null;
        }
        return cVar4.f6341d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i9 = this.f6349b0;
        int[] iArr = this.C;
        int i10 = iArr[0];
        int i11 = this.f6377u;
        int i12 = this.f6374r;
        float f9 = this.f6379w;
        int[] iArr2 = this.f6373p0;
        int i13 = iArr2[0];
        float[] fArr = this.f6364k0;
        float f10 = fArr[0];
        o(sb, "    width", i, i9, i10, i11, i12, f9, i13);
        int i14 = this.V;
        int i15 = this.f6351c0;
        int i16 = iArr[1];
        int i17 = this.f6380x;
        int i18 = this.f6375s;
        float f11 = this.f6382z;
        int i19 = iArr2[1];
        float f12 = fArr[1];
        o(sb, "    height", i14, i15, i16, i17, i18, f11, i19);
        float f13 = this.W;
        int i20 = this.X;
        if (f13 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f13);
            sb.append(",");
            sb.append(i20);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f6353d0, 0.5f);
        H(sb, "    verticalBias", this.f6355e0, 0.5f);
        G(this.f6361i0, 0, "    horizontalChainStyle", sb);
        G(this.f6362j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f6358g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f6390x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f6391y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            w.c r5 = r4.I
            w.c r5 = r5.f6343f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            w.c r3 = r4.K
            w.c r3 = r3.f6343f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            w.c r5 = r4.J
            w.c r5 = r5.f6343f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            w.c r3 = r4.L
            w.c r3 = r3.f6343f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            w.c r3 = r4.M
            w.c r3 = r3.f6343f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.d.t(int):boolean");
    }

    public String toString() {
        StringBuilder b10 = u.e.b("");
        b10.append(this.f6360h0 != null ? v1.a.n(new StringBuilder("id: "), this.f6360h0, " ") : "");
        b10.append("(");
        b10.append(this.Y);
        b10.append(", ");
        b10.append(this.Z);
        b10.append(") - (");
        b10.append(this.U);
        b10.append(" x ");
        b10.append(this.V);
        b10.append(")");
        return b10.toString();
    }

    public final boolean u(int i, int i9) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f6343f;
            if (cVar6 == null || !cVar6.f6340c || (cVar4 = (cVar3 = this.K).f6343f) == null || !cVar4.f6340c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f6343f.d()) >= i9;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f6343f;
        if (cVar8 == null || !cVar8.f6340c || (cVar2 = (cVar = this.L).f6343f) == null || !cVar2.f6340c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f6343f.d()) >= i9;
    }

    public final void v(int i, int i9, int i10, int i11, d dVar) {
        i(i).b(dVar.i(i9), i10, i11, true);
    }

    public final boolean w(int i) {
        c cVar;
        c cVar2;
        int i9 = i * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i9];
        c cVar4 = cVar3.f6343f;
        return (cVar4 == null || cVar4.f6343f == cVar3 || (cVar2 = (cVar = cVarArr[i9 + 1]).f6343f) == null || cVar2.f6343f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f6343f;
        if (cVar2 == null || cVar2.f6343f != cVar) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f6343f;
            return cVar4 != null && cVar4.f6343f == cVar3;
        }
        return true;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f6343f;
        if (cVar2 == null || cVar2.f6343f != cVar) {
            c cVar3 = this.L;
            c cVar4 = cVar3.f6343f;
            return cVar4 != null && cVar4.f6343f == cVar3;
        }
        return true;
    }

    public final boolean z() {
        return this.f6357g && this.f6358g0 != 8;
    }
}
