package a5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class r implements c6.b {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f604c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f605a = f604c;

    /* renamed from: b  reason: collision with root package name */
    public volatile c6.b f606b;

    public r(c6.b bVar) {
        this.f606b = bVar;
    }

    @Override // c6.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f605a;
        Object obj3 = f604c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f605a;
                    if (obj == obj3) {
                        obj = this.f606b.get();
                        this.f605a = obj;
                        this.f606b = null;
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
