package x8;

import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class p extends j0 {

    /* renamed from: e  reason: collision with root package name */
    public j0 f6665e;

    public p(j0 j0Var) {
        kotlin.jvm.internal.j.e(j0Var, "delegate");
        this.f6665e = j0Var;
    }

    @Override // x8.j0
    public final j0 a() {
        return this.f6665e.a();
    }

    @Override // x8.j0
    public final j0 b() {
        return this.f6665e.b();
    }

    @Override // x8.j0
    public final long c() {
        return this.f6665e.c();
    }

    @Override // x8.j0
    public final j0 d(long j) {
        return this.f6665e.d(j);
    }

    @Override // x8.j0
    public final boolean e() {
        return this.f6665e.e();
    }

    @Override // x8.j0
    public final void f() {
        this.f6665e.f();
    }

    @Override // x8.j0
    public final j0 g(long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.j.e(timeUnit, "unit");
        return this.f6665e.g(j, timeUnit);
    }
}
