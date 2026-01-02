package i4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2676b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h4.d f2677c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f2678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h4.d dVar) {
        super(taskCompletionSource);
        this.f2676b = taskCompletionSource2;
        this.f2677c = dVar;
        this.f2678d = hVar;
    }

    @Override // i4.e
    public final void a() {
        synchronized (this.f2678d.f2687f) {
            try {
                h hVar = this.f2678d;
                TaskCompletionSource taskCompletionSource = this.f2676b;
                hVar.f2686e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new k2.c(25, hVar, taskCompletionSource));
                if (this.f2678d.f2690k.getAndIncrement() > 0) {
                    this.f2678d.f2683b.g("Already connected to the service.", new Object[0]);
                }
                h.b(this.f2678d, this.f2677c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
