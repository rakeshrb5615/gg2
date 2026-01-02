package c;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f800a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f801b;

    public /* synthetic */ b(n nVar, int i) {
        this.f800a = i;
        this.f801b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f800a) {
            case 0:
                this.f801b.invalidateMenu();
                return;
            default:
                n.e(this.f801b);
                return;
        }
    }
}
