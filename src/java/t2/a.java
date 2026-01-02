package t2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a implements g7.a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f5966c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile b f5967a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f5968b;

    /* JADX WARN: Type inference failed for: r0v1, types: [t2.a, java.lang.Object, g7.a] */
    public static g7.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f5968b = f5966c;
        obj.f5967a = bVar;
        return obj;
    }

    @Override // g7.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f5968b;
        Object obj3 = f5966c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f5968b;
                    if (obj == obj3) {
                        obj = this.f5967a.get();
                        Object obj4 = this.f5968b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f5968b = obj;
                        this.f5967a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
