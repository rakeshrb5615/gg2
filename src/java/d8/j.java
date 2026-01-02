package d8;

import java.util.concurrent.ScheduledFuture;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1204a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1205b;

    public /* synthetic */ j(Object obj, int i) {
        this.f1204a = i;
        this.f1205b = obj;
    }

    @Override // d8.k
    public final void a(Throwable th) {
        switch (this.f1204a) {
            case 0:
                ((ScheduledFuture) this.f1205b).cancel(false);
                return;
            case 1:
                ((u7.l) this.f1205b).invoke(th);
                return;
            default:
                ((p0) this.f1205b).a();
                return;
        }
    }

    public final String toString() {
        switch (this.f1204a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1205b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((u7.l) this.f1205b).getClass().getSimpleName() + '@' + f0.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f1205b) + ']';
        }
    }
}
