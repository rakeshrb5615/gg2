package w;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f6423a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0290, code lost:
        if (r7.f6341d == r6) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0112, code lost:
        if (r4.f6341d == r12) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(w.e r40, u.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.a(w.e, u.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, u.c cVar, d dVar) {
        dVar.f6370o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f6373p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f6372p = -1;
        int[] iArr2 = eVar.f6373p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.f6344g;
            int q = eVar.q() - cVar5.f6344g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, q);
            dVar.f6370o = 2;
            dVar.Y = i;
            int i9 = q - i;
            dVar.U = i9;
            int i10 = dVar.f6349b0;
            if (i9 < i10) {
                dVar.U = i10;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i11 = cVar4.f6344g;
        int k9 = eVar.k() - cVar3.f6344g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i11);
        cVar.d(cVar3.i, k9);
        if (dVar.f6347a0 > 0 || dVar.f6358g0 == 8) {
            u.f k10 = cVar.k(cVar2);
            cVar2.i = k10;
            cVar.d(k10, dVar.f6347a0 + i11);
        }
        dVar.f6372p = 2;
        dVar.Z = i11;
        int i12 = k9 - i11;
        dVar.V = i12;
        int i13 = dVar.f6351c0;
        if (i12 < i13) {
            dVar.V = i13;
        }
    }

    public static final boolean c(int i, int i9) {
        return (i & i9) == i9;
    }
}
