package t6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f5974c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile b f5975a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f5976b;

    /* JADX WARN: Type inference failed for: r0v1, types: [t6.a, t6.c, java.lang.Object] */
    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f5976b = f5974c;
        obj.f5975a = bVar;
        return obj;
    }

    @Override // g7.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f5976b;
        Object obj3 = f5974c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f5976b;
                    if (obj == obj3) {
                        obj = this.f5975a.get();
                        Object obj4 = this.f5976b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f5976b = obj;
                        this.f5975a = null;
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
