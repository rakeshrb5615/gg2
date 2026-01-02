package z8;

import okhttp3.Request;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class j0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final Class f7501d;

    public j0(Class cls) {
        this.f7501d = cls;
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        Request.Builder builder = n0Var.f7516e;
        builder.getClass();
        Class cls = this.f7501d;
        kotlin.jvm.internal.j.e(cls, "type");
        builder.e = builder.e.b(kotlin.jvm.internal.s.a(cls), obj);
    }
}
