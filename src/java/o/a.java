package o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends q4.b {

    /* renamed from: g  reason: collision with root package name */
    public static volatile a f4976g;

    /* renamed from: f  reason: collision with root package name */
    public final b f4977f;

    public a() {
        super(20);
        this.f4977f = new b();
    }

    public static a V() {
        if (f4976g != null) {
            return f4976g;
        }
        synchronized (a.class) {
            try {
                if (f4976g == null) {
                    f4976g = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4976g;
    }
}
