package b5;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class i extends t.h implements ScheduledFuture {

    /* renamed from: n  reason: collision with root package name */
    public final ScheduledFuture f745n;

    public i(h hVar) {
        this.f745n = hVar.a(new l6.c(this, 8));
    }

    @Override // t.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f745n;
        Object obj = this.f5915a;
        scheduledFuture.cancel((obj instanceof t.a) && ((t.a) obj).f5897a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f745n.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f745n.getDelay(timeUnit);
    }
}
