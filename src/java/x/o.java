package x;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f6531a;

    /* renamed from: b  reason: collision with root package name */
    public w.d f6532b;

    /* renamed from: c  reason: collision with root package name */
    public l f6533c;

    /* renamed from: d  reason: collision with root package name */
    public int f6534d;

    /* renamed from: e  reason: collision with root package name */
    public final g f6535e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f6536f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6537g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f6538h = new f(this);
    public final f i = new f(this);
    public int j = 1;

    public o(w.d dVar) {
        this.f6532b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f6517l.add(fVar2);
        fVar.f6513f = i;
        fVar2.f6516k.add(fVar);
    }

    public static f h(w.c cVar) {
        w.c cVar2 = cVar.f6343f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f6341d;
        int c9 = u.e.c(cVar2.f6342e);
        if (c9 != 1) {
            if (c9 != 2) {
                if (c9 != 3) {
                    if (c9 != 4) {
                        if (c9 != 5) {
                            return null;
                        }
                        return dVar.f6354e.f6523k;
                    }
                    return dVar.f6354e.i;
                }
                return dVar.f6352d.i;
            }
            return dVar.f6354e.f6538h;
        }
        return dVar.f6352d.f6538h;
    }

    public static f i(w.c cVar, int i) {
        w.c cVar2 = cVar.f6343f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f6341d;
        o oVar = i == 0 ? dVar.f6352d : dVar.f6354e;
        int c9 = u.e.c(cVar2.f6342e);
        if (c9 == 1 || c9 == 2) {
            return oVar.f6538h;
        }
        if (c9 == 3 || c9 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f6517l.add(fVar2);
        fVar.f6517l.add(this.f6535e);
        fVar.f6515h = i;
        fVar.i = gVar;
        fVar2.f6516k.add(fVar);
        gVar.f6516k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i9) {
        if (i9 == 0) {
            w.d dVar = this.f6532b;
            int i10 = dVar.f6378v;
            int max = Math.max(dVar.f6377u, i);
            if (i10 > 0) {
                max = Math.min(i10, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            w.d dVar2 = this.f6532b;
            int i11 = dVar2.f6381y;
            int max2 = Math.max(dVar2.f6380x, i);
            if (i11 > 0) {
                max2 = Math.min(i11, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        g gVar = this.f6535e;
        if (gVar.j) {
            return gVar.f6514g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.f6531a == 3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(w.c r12, w.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.o.l(w.c, w.c, int):void");
    }
}
