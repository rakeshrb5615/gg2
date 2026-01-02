package k4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3392c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile j f3393a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f3394b;

    /* JADX WARN: Type inference failed for: r0v1, types: [k4.g, java.lang.Object] */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        ?? obj = new Object();
        obj.f3394b = f3392c;
        obj.f3393a = hVar;
        return obj;
    }

    @Override // k4.j
    public final Object a() {
        Object obj;
        Object obj2 = this.f3394b;
        Object obj3 = f3392c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f3394b;
                    if (obj == obj3) {
                        obj = this.f3393a.a();
                        Object obj4 = this.f3394b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f3394b = obj;
                        this.f3393a = null;
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
