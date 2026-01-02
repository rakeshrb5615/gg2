package c;

import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f841a;

    /* renamed from: b  reason: collision with root package name */
    public final s1.c f842b;

    /* renamed from: c  reason: collision with root package name */
    public final t f843c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s1.e, c.t, java.lang.Object] */
    public v(Runnable runnable) {
        this.f841a = runnable;
        s1.c cVar = new s1.c(new a5.a(this, 1));
        this.f842b = cVar;
        ?? obj = new Object();
        this.f843c = obj;
        cVar.a(obj);
    }

    public final void a(t0 t0Var, androidx.lifecycle.u uVar) {
        kotlin.jvm.internal.j.e(t0Var, "onBackPressedCallback");
        androidx.lifecycle.w lifecycle = uVar.getLifecycle();
        if (lifecycle.c == androidx.lifecycle.o.a) {
            return;
        }
        r rVar = new r(t0Var, new s(t0Var, uVar));
        t0Var.a.add(rVar);
        rVar.b(false);
        s1.c cVar = this.f842b;
        cVar.getClass();
        if (cVar.f5783c.add(rVar)) {
            s1.f fVar = cVar.f5782b;
            fVar.getClass();
            if (rVar.f834c != null) {
                throw new IllegalArgumentException(("Handler '" + rVar + "' is already registered with a dispatcher").toString());
            }
            fVar.f5793e.addFirst(rVar);
            rVar.f834c = cVar;
            fVar.b();
        }
        u uVar2 = new u(rVar, t0Var, this, lifecycle);
        lifecycle.a(uVar2);
        t0Var.c.add(uVar2);
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        s1.l lVar = new s1.l(onBackInvokedDispatcher, 0);
        s1.c cVar = this.f842b;
        cVar.b(lVar, 1);
        cVar.b(new s1.l(onBackInvokedDispatcher, 1000000), 0);
    }
}
