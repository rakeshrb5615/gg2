package w1;

import a1.d;
import a1.t;
import android.net.Uri;
import android.view.InputEvent;
import d8.f0;
import d8.n0;
import kotlin.jvm.internal.j;
import x1.f;
import x1.g;
import x1.h;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final x1.b f6425a;

    public a(x1.b bVar) {
        this.f6425a = bVar;
    }

    @Override // w1.b
    public p4.b a() {
        return a.a.d(f0.c(f0.b(n0.f1224a), new q5.b(this, null, 1)));
    }

    @Override // w1.b
    public p4.b b(Uri uri) {
        j.e(uri, "trigger");
        return a.a.d(f0.c(f0.b(n0.f1224a), new d(this, uri, null, 13)));
    }

    public p4.b c(x1.a aVar) {
        j.e(aVar, "deletionRequest");
        throw null;
    }

    public p4.b d(Uri uri, InputEvent inputEvent) {
        j.e(uri, "attributionSource");
        return a.a.d(f0.c(f0.b(n0.f1224a), new t(this, uri, inputEvent, null, 5)));
    }

    public p4.b e(f fVar) {
        j.e(fVar, "request");
        throw null;
    }

    public p4.b f(g gVar) {
        j.e(gVar, "request");
        throw null;
    }

    public p4.b g(h hVar) {
        j.e(hVar, "request");
        throw null;
    }
}
