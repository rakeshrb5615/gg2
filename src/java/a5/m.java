package a5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final x f598a;

    /* renamed from: b  reason: collision with root package name */
    public final int f599b;

    /* renamed from: c  reason: collision with root package name */
    public final int f600c;

    public m(int i, int i9, Class cls) {
        this(x.a(cls), i, i9);
    }

    public static m a(Class cls) {
        return new m(0, 1, cls);
    }

    public static m b(x xVar) {
        return new m(xVar, 1, 0);
    }

    public static m c(Class cls) {
        return new m(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f598a.equals(mVar.f598a) && this.f599b == mVar.f599b && this.f600c == mVar.f600c;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f598a.hashCode() ^ 1000003) * 1000003) ^ this.f599b) * 1000003) ^ this.f600c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f598a);
        sb.append(", type=");
        int i = this.f599b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i9 = this.f600c;
        if (i9 == 0) {
            str = "direct";
        } else if (i9 == 1) {
            str = "provider";
        } else if (i9 != 2) {
            throw new AssertionError(g2.g.c(i9, "Unsupported injection: "));
        } else {
            str = "deferred";
        }
        return v1.a.n(sb, str, "}");
    }

    public m(x xVar, int i, int i9) {
        q4.b.f(xVar, "Null dependency anInterface.");
        this.f598a = xVar;
        this.f599b = i;
        this.f600c = i9;
    }
}
