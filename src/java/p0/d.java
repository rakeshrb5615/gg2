package p0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d extends c {

    /* renamed from: c  reason: collision with root package name */
    public final Object f5061c;

    public d() {
        super(12);
        this.f5061c = new Object();
    }

    @Override // p0.c
    public final Object a() {
        Object a10;
        synchronized (this.f5061c) {
            a10 = super.a();
        }
        return a10;
    }

    @Override // p0.c
    public final boolean c(Object obj) {
        boolean c9;
        synchronized (this.f5061c) {
            c9 = super.c(obj);
        }
        return c9;
    }
}
