package d4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1086c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile c f1087a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f1088b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, d4.b, d4.c] */
    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        ?? obj = new Object();
        obj.f1088b = f1086c;
        obj.f1087a = cVar;
        return obj;
    }

    @Override // d4.c
    public final Object zza() {
        Object obj;
        Object obj2 = this.f1088b;
        Object obj3 = f1086c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f1088b;
                    if (obj == obj3) {
                        obj = this.f1087a.zza();
                        Object obj4 = this.f1088b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f1088b = obj;
                        this.f1087a = null;
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
