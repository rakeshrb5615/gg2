package q0;

import android.view.WindowInsets;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class f1 extends i1 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f5123c;

    public f1() {
        this.f5123c = e1.a();
    }

    @Override // q0.i1
    public s1 b() {
        a();
        s1 g3 = s1.g(null, this.f5123c.build());
        g3.f5183a.o(this.f5137b);
        return g3;
    }

    @Override // q0.i1
    public void d(h0.b bVar) {
        this.f5123c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // q0.i1
    public void e(h0.b bVar) {
        this.f5123c.setStableInsets(bVar.d());
    }

    @Override // q0.i1
    public void f(h0.b bVar) {
        this.f5123c.setSystemGestureInsets(bVar.d());
    }

    @Override // q0.i1
    public void g(h0.b bVar) {
        this.f5123c.setSystemWindowInsets(bVar.d());
    }

    @Override // q0.i1
    public void h(h0.b bVar) {
        this.f5123c.setTappableElementInsets(bVar.d());
    }

    public f1(s1 s1Var) {
        super(s1Var);
        WindowInsets.Builder a10;
        WindowInsets f9 = s1Var.f();
        if (f9 != null) {
            a10 = e1.b(f9);
        } else {
            a10 = e1.a();
        }
        this.f5123c = a10;
    }
}
