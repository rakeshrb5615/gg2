package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d2 extends i8.q {

    /* renamed from: e  reason: collision with root package name */
    public final ThreadLocal f1176e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d2(l7.c r3, l7.h r4) {
        /*
            r2 = this;
            d8.e2 r0 = d8.e2.f1179a
            l7.f r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            l7.h r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f1176e = r0
            l7.h r3 = r3.getContext()
            l7.d r0 = l7.d.f3795a
            l7.f r3 = r3.get(r0)
            boolean r3 = r3 instanceof d8.a0
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = i8.a.l(r4, r3)
            i8.a.g(r4, r3)
            r2.S(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.d2.<init>(l7.c, l7.h):void");
    }

    public final boolean R() {
        boolean z9 = this.threadLocalIsSet && this.f1176e.get() == null;
        this.f1176e.remove();
        return !z9;
    }

    public final void S(l7.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1176e.set(new h7.f(hVar, obj));
    }

    @Override // i8.q, d8.r1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            h7.f fVar = (h7.f) this.f1176e.get();
            if (fVar != null) {
                i8.a.g((l7.h) fVar.f2225a, fVar.f2226b);
            }
            this.f1176e.remove();
        }
        Object r8 = f0.r(obj);
        l7.c cVar = this.f2797d;
        l7.h context = cVar.getContext();
        Object l5 = i8.a.l(context, null);
        d2 w8 = l5 != i8.a.f2762d ? f0.w(cVar, context, l5) : null;
        try {
            this.f2797d.resumeWith(r8);
            if (w8 == null || w8.R()) {
                i8.a.g(context, l5);
            }
        } catch (Throwable th) {
            if (w8 == null || w8.R()) {
                i8.a.g(context, l5);
            }
            throw th;
        }
    }
}
