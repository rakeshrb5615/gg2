package k4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b0 extends a0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3373m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ a0 f3374n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f3375o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, a0 a0Var) {
        super(taskCompletionSource);
        this.f3375o = dVar;
        this.f3373m = taskCompletionSource2;
        this.f3374n = a0Var;
    }

    @Override // k4.a0
    public final void b() {
        synchronized (this.f3375o.f3384f) {
            try {
                d dVar = this.f3375o;
                TaskCompletionSource taskCompletionSource = this.f3373m;
                dVar.f3383e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new k2.c(27, dVar, taskCompletionSource));
                if (this.f3375o.f3388l.getAndIncrement() > 0) {
                    this.f3375o.f3380b.b("Already connected to the service.", new Object[0]);
                }
                d.b(this.f3375o, this.f3374n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
