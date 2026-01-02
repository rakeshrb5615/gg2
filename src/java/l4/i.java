package l4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final h f3781c = new h(0);

    /* renamed from: a  reason: collision with root package name */
    public volatile f f3782a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3783b;

    @Override // l4.f
    public final Object get() {
        f fVar = this.f3782a;
        h hVar = f3781c;
        if (fVar != hVar) {
            synchronized (this) {
                try {
                    if (this.f3782a != hVar) {
                        Object obj = this.f3782a.get();
                        this.f3783b = obj;
                        this.f3782a = hVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3783b;
    }

    public final String toString() {
        Object obj = this.f3782a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f3781c) {
            obj = "<supplier that returned " + this.f3783b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
