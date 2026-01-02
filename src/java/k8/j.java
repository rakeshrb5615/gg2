package k8;

import d8.f0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j extends i {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f3459c;

    public j(Runnable runnable, long j, boolean z9) {
        super(j, z9);
        this.f3459c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3459c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3459c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(f0.j(runnable));
        sb.append(", ");
        sb.append(this.f3457a);
        sb.append(", ");
        sb.append(this.f3458b ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
