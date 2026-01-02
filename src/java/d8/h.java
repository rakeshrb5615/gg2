package d8;

import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends a {

    /* renamed from: d  reason: collision with root package name */
    public final Thread f1199d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f1200e;

    public h(l7.h hVar, Thread thread, x0 x0Var) {
        super(hVar, true);
        this.f1199d = thread;
        this.f1200e = x0Var;
    }

    @Override // d8.r1
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1199d;
        if (kotlin.jvm.internal.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
