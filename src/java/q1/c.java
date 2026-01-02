package q1;

import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c extends d0 implements androidx.loader.content.d {

    /* renamed from: l  reason: collision with root package name */
    public final androidx.loader.content.e f5208l;

    /* renamed from: m  reason: collision with root package name */
    public Object f5209m;

    /* renamed from: n  reason: collision with root package name */
    public d f5210n;

    public c(androidx.loader.content.e eVar) {
        this.f5208l = eVar;
        eVar.registerListener(0, this);
    }

    public final void e() {
        this.f5208l.startLoading();
    }

    public final void f() {
        this.f5208l.stopLoading();
    }

    public final void g(e0 e0Var) {
        super/*androidx.lifecycle.c0*/.g(e0Var);
        this.f5209m = null;
        this.f5210n = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.u, java.lang.Object] */
    public final void i() {
        ?? r02 = this.f5209m;
        d dVar = this.f5210n;
        if (r02 == 0 || dVar == null) {
            return;
        }
        super/*androidx.lifecycle.c0*/.g(dVar);
        d((u) r02, dVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        p0.e.a(this.f5208l, sb);
        sb.append("}}");
        return sb.toString();
    }
}
