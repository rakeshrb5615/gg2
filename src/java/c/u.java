package c;

import androidx.fragment.app.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class u implements androidx.lifecycle.s, AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f838a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f839b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.p f840c;

    public u(r rVar, t0 t0Var, v vVar, androidx.lifecycle.p pVar) {
        this.f838a = rVar;
        this.f839b = t0Var;
        this.f840c = pVar;
    }

    public final void c(androidx.lifecycle.u uVar, androidx.lifecycle.n nVar) {
        boolean z9 = nVar.a().compareTo(androidx.lifecycle.o.d) >= 0 && this.f839b.b;
        r rVar = this.f838a;
        rVar.b(z9);
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            rVar.a();
            this.f840c.b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f840c.b(this);
    }
}
