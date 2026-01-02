package c;

import androidx.fragment.app.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final s f832a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f833b;

    /* renamed from: c  reason: collision with root package name */
    public s1.c f834c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f835d;

    public r(t0 t0Var, s sVar) {
        kotlin.jvm.internal.j.e(t0Var, "onBackPressedCallback");
        boolean z9 = t0Var.b;
        this.f832a = sVar;
        this.f833b = z9;
        this.f835d = t0Var;
    }

    public final void a() {
        s1.c cVar = this.f834c;
        if (cVar == null || !cVar.f5783c.remove(this)) {
            return;
        }
        s1.f fVar = cVar.f5782b;
        fVar.getClass();
        if (equals(fVar.f5794f)) {
            if (fVar.f5795g == -1) {
                this.f835d.getClass();
            }
            fVar.f5794f = null;
            fVar.f5795g = 0;
            fVar.f5796h = null;
        }
        fVar.f5792d.remove(this);
        fVar.f5793e.remove(this);
        this.f834c = null;
        fVar.b();
    }

    public final void b(boolean z9) {
        s1.f fVar;
        if (this.f833b == z9) {
            return;
        }
        this.f833b = z9;
        s1.c cVar = this.f834c;
        if (cVar == null || (fVar = cVar.f5782b) == null) {
            return;
        }
        fVar.b();
    }
}
