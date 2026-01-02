package d8;

import java.util.concurrent.ScheduledFuture;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledFuture f1231a;

    public o0(ScheduledFuture scheduledFuture) {
        this.f1231a = scheduledFuture;
    }

    @Override // d8.p0
    public final void a() {
        this.f1231a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f1231a + ']';
    }
}
