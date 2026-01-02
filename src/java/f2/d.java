package f2;

import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d extends t {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1405a = false;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f1406b;

    public d(ViewGroup viewGroup) {
        this.f1406b = viewGroup;
    }

    @Override // f2.t, f2.q
    public final void b() {
        c4.b.d0(this.f1406b, false);
    }

    @Override // f2.t, f2.q
    public final void c(s sVar) {
        c4.b.d0(this.f1406b, false);
        this.f1405a = true;
    }

    @Override // f2.t, f2.q
    public final void d() {
        c4.b.d0(this.f1406b, true);
    }

    @Override // f2.q
    public final void f(s sVar) {
        if (!this.f1405a) {
            c4.b.d0(this.f1406b, false);
        }
        sVar.A(this);
    }
}
