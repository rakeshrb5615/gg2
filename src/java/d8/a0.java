package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class a0 extends l7.a implements l7.e {

    /* renamed from: b  reason: collision with root package name */
    public static final z f1157b = new z(l7.d.f3795a, new y(0));

    public a0() {
        super(l7.d.f3795a);
    }

    @Override // l7.a, l7.h
    public final l7.f get(l7.g gVar) {
        l7.f fVar;
        kotlin.jvm.internal.j.e(gVar, "key");
        if (gVar instanceof z) {
            z zVar = (z) gVar;
            l7.g gVar2 = this.f3792a;
            if ((gVar2 == zVar || zVar.f1267b == gVar2) && (fVar = (l7.f) zVar.f1266a.invoke(this)) != null) {
                return fVar;
            }
        } else if (l7.d.f3795a == gVar) {
            return this;
        }
        return null;
    }

    public abstract void i(l7.h hVar, Runnable runnable);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (((l7.f) r3.f1266a.invoke(r2)) == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (l7.d.f3795a == r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        return l7.i.f3796a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        return r2;
     */
    @Override // l7.a, l7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l7.h minusKey(l7.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.j.e(r3, r0)
            boolean r0 = r3 instanceof d8.z
            if (r0 == 0) goto L20
            d8.z r3 = (d8.z) r3
            l7.g r0 = r2.f3792a
            if (r0 == r3) goto L15
            l7.g r1 = r3.f1267b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            u7.l r3 = r3.f1266a
            java.lang.Object r3 = r3.invoke(r2)
            l7.f r3 = (l7.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            l7.d r0 = l7.d.f3795a
            if (r0 != r3) goto L27
        L24:
            l7.i r3 = l7.i.f3796a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a0.minusKey(l7.g):l7.h");
    }

    public boolean s(l7.h hVar) {
        return !(this instanceof c2);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f0.j(this);
    }

    public a0 x(int i) {
        i8.a.a(i);
        return new i8.g(this, i);
    }
}
