package f8;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k extends i8.r {

    /* renamed from: e  reason: collision with root package name */
    public final c f1563e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1564f;

    public k(long j, k kVar, c cVar, int i) {
        super(j, kVar, i);
        this.f1563e = cVar;
        this.f1564f = new AtomicReferenceArray(e.f1542b * 2);
    }

    @Override // i8.r
    public final int g() {
        return e.f1542b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        kotlin.jvm.internal.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // i8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, l7.h r6) {
        /*
            r4 = this;
            int r6 = f8.e.f1542b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f1564f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof d8.f2
            f8.c r2 = r4.f1563e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof f8.t
            if (r1 == 0) goto L21
            goto L62
        L21:
            d4.l r1 = f8.e.j
            if (r6 == r1) goto L59
            d4.l r1 = f8.e.f1549k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            d4.l r1 = f8.e.f1547g
            if (r6 == r1) goto L11
            d4.l r1 = f8.e.f1546f
            if (r6 != r1) goto L33
            goto L11
        L33:
            d4.l r5 = f8.e.i
            if (r6 == r5) goto L7c
            d4.l r5 = f8.e.f1544d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            d4.l r5 = f8.e.f1550l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.j.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            d4.l r1 = f8.e.j
            goto L69
        L67:
            d4.l r1 = f8.e.f1549k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.j.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.k.h(int, l7.h):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i9 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f1564f;
            if (atomicReferenceArray.compareAndSet(i9, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i9) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f1564f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z9) {
        if (z9) {
            c cVar = this.f1563e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.f2799c * e.f1542b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f1564f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f1564f.set((i * 2) + 1, obj);
    }
}
