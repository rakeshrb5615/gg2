package m0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3942a;

    /* renamed from: b  reason: collision with root package name */
    public c f3943b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3944c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f3944c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f3943b == cVar) {
                return;
            }
            this.f3943b = cVar;
            if (this.f3942a) {
                cVar.onCancel();
            }
        }
    }
}
