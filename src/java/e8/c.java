package e8;

import a1.a1;
import a6.j;
import android.os.Handler;
import android.os.Looper;
import b5.l;
import d8.a0;
import d8.b0;
import d8.b2;
import d8.e1;
import d8.k0;
import d8.n;
import d8.n0;
import d8.p0;
import d8.t1;
import g2.g;
import java.util.concurrent.CancellationException;
import k8.e;
import l7.h;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends a0 implements k0 {

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1357c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1358d;

    /* renamed from: e  reason: collision with root package name */
    public final c f1359e;

    public c(Handler handler, boolean z9) {
        this.f1357c = handler;
        this.f1358d = z9;
        this.f1359e = z9 ? this : new c(handler, true);
    }

    @Override // d8.k0
    public final p0 c(long j, b2 b2Var, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f1357c.postDelayed(b2Var, j)) {
            return new a1(1, this, b2Var);
        }
        y(hVar, b2Var);
        return t1.f1246a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return cVar.f1357c == this.f1357c && cVar.f1358d == this.f1358d;
        }
        return false;
    }

    @Override // d8.k0
    public final void f(long j, n nVar) {
        l lVar = new l(5, nVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f1357c.postDelayed(lVar, j)) {
            nVar.t(new j(1, this, lVar));
        } else {
            y(nVar.f1223e, lVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1357c) ^ (this.f1358d ? 1231 : 1237);
    }

    @Override // d8.a0
    public final void i(h hVar, Runnable runnable) {
        if (this.f1357c.post(runnable)) {
            return;
        }
        y(hVar, runnable);
    }

    @Override // d8.a0
    public final boolean s(h hVar) {
        return (this.f1358d && kotlin.jvm.internal.j.a(Looper.myLooper(), this.f1357c.getLooper())) ? false : true;
    }

    @Override // d8.a0
    public final String toString() {
        c cVar;
        String str;
        e eVar = n0.f1224a;
        c cVar2 = i8.n.f2795a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f1359e;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str == null) {
            String handler = this.f1357c.toString();
            return this.f1358d ? g.d(handler, ".immediate") : handler;
        }
        return str;
    }

    public final void y(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        e1 e1Var = (e1) hVar.get(b0.f1162b);
        if (e1Var != null) {
            e1Var.cancel(cancellationException);
        }
        e eVar = n0.f1224a;
        k8.d.f3452c.i(hVar, runnable);
    }
}
