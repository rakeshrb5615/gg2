package z8;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class n implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7508a;

    /* renamed from: b  reason: collision with root package name */
    public final d f7509b;

    public n(Executor executor, d dVar) {
        this.f7508a = executor;
        this.f7509b = dVar;
    }

    @Override // z8.d
    public final Request c() {
        return this.f7509b.c();
    }

    @Override // z8.d
    public final void cancel() {
        this.f7509b.cancel();
    }

    @Override // z8.d
    public final void f(g gVar) {
        this.f7509b.f(new n0.a(this, gVar, 17, false));
    }

    @Override // z8.d
    public final boolean isCanceled() {
        return this.f7509b.isCanceled();
    }

    @Override // z8.d
    public final d clone() {
        return new n(this.f7508a, this.f7509b.mo7clone());
    }
}
