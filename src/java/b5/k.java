package b5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f748a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f749b;

    public /* synthetic */ k(Runnable runnable, int i) {
        this.f748a = i;
        this.f749b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f748a) {
            case 0:
                this.f749b.run();
                return;
            default:
                try {
                    this.f749b.run();
                    return;
                } catch (Exception e9) {
                    c4.b.w(e9, "Executor", "Background execution failure.");
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f748a) {
            case 0:
                return this.f749b.toString();
            default:
                return super.toString();
        }
    }
}
