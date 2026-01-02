package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import x.o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final x.b L0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f6383q0 = new ArrayList();

    /* renamed from: r0  reason: collision with root package name */
    public final b8.g f6384r0 = new b8.g(this);

    /* renamed from: s0  reason: collision with root package name */
    public final x.e f6385s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f6386t0;

    /* renamed from: u0  reason: collision with root package name */
    public z.f f6387u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f6388v0;

    /* renamed from: w0  reason: collision with root package name */
    public final u.c f6389w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6390x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6391y0;
    public int z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x.e] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, x.b] */
    public e() {
        ?? obj = new Object();
        obj.f6501b = true;
        obj.f6502c = true;
        obj.f6504e = new ArrayList();
        new ArrayList();
        obj.f6505f = null;
        obj.f6506g = new Object();
        obj.f6507h = new ArrayList();
        obj.f6500a = this;
        obj.f6503d = this;
        this.f6385s0 = obj;
        this.f6387u0 = null;
        this.f6388v0 = false;
        this.f6389w0 = new u.c();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new Object();
    }

    public static void V(d dVar, z.f fVar, x.b bVar) {
        int i;
        int i9;
        if (fVar == null) {
            return;
        }
        int i10 = dVar.f6358g0;
        int[] iArr = dVar.f6376t;
        if (i10 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f6494e = 0;
            bVar.f6495f = 0;
            return;
        }
        int[] iArr2 = dVar.f6373p0;
        bVar.f6490a = iArr2[0];
        bVar.f6491b = iArr2[1];
        bVar.f6492c = dVar.q();
        bVar.f6493d = dVar.k();
        bVar.i = false;
        bVar.j = 0;
        boolean z9 = bVar.f6490a == 3;
        boolean z10 = bVar.f6491b == 3;
        boolean z11 = z9 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z9 && dVar.t(0) && dVar.f6374r == 0 && !z11) {
            bVar.f6490a = 2;
            if (z10 && dVar.f6375s == 0) {
                bVar.f6490a = 1;
            }
            z9 = false;
        }
        if (z10 && dVar.t(1) && dVar.f6375s == 0 && !z12) {
            bVar.f6491b = 2;
            if (z9 && dVar.f6374r == 0) {
                bVar.f6491b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.f6490a = 1;
            z9 = false;
        }
        if (dVar.B()) {
            bVar.f6491b = 1;
            z10 = false;
        }
        if (z11) {
            if (iArr[0] == 4) {
                bVar.f6490a = 1;
            } else if (!z10) {
                if (bVar.f6491b == 1) {
                    i9 = bVar.f6493d;
                } else {
                    bVar.f6490a = 2;
                    fVar.b(dVar, bVar);
                    i9 = bVar.f6495f;
                }
                bVar.f6490a = 1;
                bVar.f6492c = (int) (dVar.W * i9);
            }
        }
        if (z12) {
            if (iArr[1] == 4) {
                bVar.f6491b = 1;
            } else if (!z9) {
                if (bVar.f6490a == 1) {
                    i = bVar.f6492c;
                } else {
                    bVar.f6491b = 2;
                    fVar.b(dVar, bVar);
                    i = bVar.f6494e;
                }
                bVar.f6491b = 1;
                if (dVar.X == -1) {
                    bVar.f6493d = (int) (i / dVar.W);
                } else {
                    bVar.f6493d = (int) (dVar.W * i);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f6494e);
        dVar.L(bVar.f6495f);
        dVar.E = bVar.f6497h;
        dVar.I(bVar.f6496g);
        bVar.j = 0;
    }

    @Override // w.d
    public final void C() {
        this.f6389w0.t();
        this.f6390x0 = 0;
        this.f6391y0 = 0;
        this.f6383q0.clear();
        super.C();
    }

    @Override // w.d
    public final void F(b8.g gVar) {
        super.F(gVar);
        int size = this.f6383q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f6383q0.get(i)).F(gVar);
        }
    }

    @Override // w.d
    public final void P(boolean z9, boolean z10) {
        super.P(z9, z10);
        int size = this.f6383q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f6383q0.get(i)).P(z9, z10);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i9 = this.z0 + 1;
            b[] bVarArr = this.C0;
            if (i9 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i10 = this.z0;
            bVarArr2[i10] = new b(dVar, 0, this.f6388v0);
            this.z0 = i10 + 1;
        } else if (i == 1) {
            int i11 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i11 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i12 = this.A0;
            bVarArr4[i12] = new b(dVar, 1, this.f6388v0);
            this.A0 = i12 + 1;
        }
    }

    public final void S(u.c cVar) {
        e eVar;
        u.c cVar2;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f6383q0.size();
        boolean z9 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f6383q0.get(i);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z9 = true;
            }
        }
        if (z9) {
            for (int i9 = 0; i9 < size; i9++) {
                d dVar2 = (d) this.f6383q0.get(i9);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i10 = 0; i10 < aVar.f6422r0; i10++) {
                        d dVar3 = aVar.f6421q0[i10];
                        if (aVar.f6321t0 || dVar3.c()) {
                            int i11 = aVar.f6320s0;
                            if (i11 == 0 || i11 == 1) {
                                dVar3.S[0] = true;
                            } else if (i11 == 2 || i11 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar4 = (d) this.f6383q0.get(i12);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i13 = 0; i13 < gVar.f6422r0; i13++) {
                    if (hashSet.contains(gVar.f6421q0[i13])) {
                        gVar.b(cVar, W);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, W);
                }
                hashSet.clear();
            }
        }
        if (u.c.q) {
            HashSet hashSet2 = new HashSet();
            for (int i14 = 0; i14 < size; i14++) {
                d dVar5 = (d) this.f6383q0.get(i14);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f6373p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i15 = 0; i15 < size; i15++) {
                d dVar7 = (d) eVar.f6383q0.get(i15);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f6373p0;
                    int i16 = iArr[0];
                    int i17 = iArr[1];
                    if (i16 == 2) {
                        dVar7.M(1);
                    }
                    if (i17 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i16 == 2) {
                        dVar7.M(i16);
                    }
                    if (i17 == 2) {
                        dVar7.N(i17);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z9) {
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        x.e eVar = this.f6385s0;
        ArrayList arrayList = eVar.f6504e;
        e eVar2 = eVar.f6500a;
        int j = eVar2.j(0);
        int[] iArr = eVar2.f6373p0;
        int j8 = eVar2.j(1);
        int r8 = eVar2.r();
        int s5 = eVar2.s();
        if (z9 && (j == 2 || j8 == 2)) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = z9;
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                o oVar = (o) obj;
                if (oVar.f6536f == i && !oVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z11 && j == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f6352d.f6535e.d(eVar2.q());
                }
            } else if (z11 && j8 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f6354e.f6535e.d(eVar2.k());
            }
        }
        if (i == 0) {
            i9 = 0;
            int i12 = iArr[0];
            if (i12 == 1 || i12 == 4) {
                int q = eVar2.q() + r8;
                eVar2.f6352d.i.d(q);
                eVar2.f6352d.f6535e.d(q - r8);
                i10 = 1;
            }
            i10 = i9;
        } else {
            i9 = 0;
            int i13 = iArr[1];
            if (i13 == 1 || i13 == 4) {
                int k9 = eVar2.k() + s5;
                eVar2.f6354e.i.d(k9);
                eVar2.f6354e.f6535e.d(k9 - s5);
                i10 = 1;
            }
            i10 = i9;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i14 = i9;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            o oVar2 = (o) obj2;
            if (oVar2.f6536f == i && (oVar2.f6532b != eVar2 || oVar2.f6537g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i15 = i9;
        while (i15 < size3) {
            Object obj3 = arrayList.get(i15);
            i15++;
            o oVar3 = (o) obj3;
            if (oVar3.f6536f == i && (i10 != 0 || oVar3.f6532b != eVar2)) {
                if (!oVar3.f6538h.j || !oVar3.i.j || (!(oVar3 instanceof x.c) && !oVar3.f6535e.j)) {
                    z10 = i9;
                    break;
                }
            }
        }
        z10 = 1;
        eVar2.M(j);
        eVar2.N(j8);
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x090b  */
    /* JADX WARN: Type inference failed for: r6v89, types: [java.lang.Object, x.b] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // w.d
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.f6383q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
