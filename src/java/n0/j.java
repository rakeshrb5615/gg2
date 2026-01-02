package n0;

import android.os.Process;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final int f4403a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f4403a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f4403a);
        super.run();
    }
}
