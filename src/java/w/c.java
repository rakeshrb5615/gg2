package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import x.n;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public int f6339b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6340c;

    /* renamed from: d  reason: collision with root package name */
    public final d f6341d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6342e;

    /* renamed from: f  reason: collision with root package name */
    public c f6343f;
    public u.f i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet f6338a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f6344g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f6345h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.f6341d = dVar;
        this.f6342e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i9, boolean z9) {
        if (cVar == null) {
            j();
            return true;
        } else if (z9 || i(cVar)) {
            this.f6343f = cVar;
            if (cVar.f6338a == null) {
                cVar.f6338a = new HashSet();
            }
            HashSet hashSet = this.f6343f.f6338a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f6344g = i;
            this.f6345h = i9;
            return true;
        } else {
            return false;
        }
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f6338a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                x.h.b(((c) it.next()).f6341d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f6340c) {
            return this.f6339b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f6341d.f6358g0 == 8) {
            return 0;
        }
        int i = this.f6345h;
        return (i == Integer.MIN_VALUE || (cVar = this.f6343f) == null || cVar.f6341d.f6358g0 != 8) ? this.f6344g : i;
    }

    public final c f() {
        int i = this.f6342e;
        int c9 = u.e.c(i);
        d dVar = this.f6341d;
        switch (c9) {
            case 0:
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(g2.g.m(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f6338a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f6343f != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(w.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            w.d r1 = r11.f6341d
            int r11 = r11.f6342e
            r2 = 6
            int r3 = r10.f6342e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.E
            if (r11 == 0) goto L65
            w.d r11 = r10.f6341d
            boolean r11 = r11.E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = u.e.c(r3)
            r6 = 4
            r7 = 2
            r8 = 9
            r9 = 8
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = g2.g.m(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r9) goto L65
            if (r11 == r8) goto L65
            goto L63
        L3a:
            if (r11 == r7) goto L65
            if (r11 != r6) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof w.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r8) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r7) goto L5a
            if (r11 != r6) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof w.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r9) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.i(w.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f6343f;
        if (cVar != null && (hashSet = cVar.f6338a) != null) {
            hashSet.remove(this);
            if (this.f6343f.f6338a.size() == 0) {
                this.f6343f.f6338a = null;
            }
        }
        this.f6338a = null;
        this.f6343f = null;
        this.f6344g = 0;
        this.f6345h = Integer.MIN_VALUE;
        this.f6340c = false;
        this.f6339b = 0;
    }

    public final void k() {
        u.f fVar = this.i;
        if (fVar == null) {
            this.i = new u.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i) {
        this.f6339b = i;
        this.f6340c = true;
    }

    public final String toString() {
        return this.f6341d.f6360h0 + ":" + g2.g.m(this.f6342e);
    }
}
