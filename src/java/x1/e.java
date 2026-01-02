package x1;

import a1.p;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import d8.f0;
import d8.n;
import h7.l;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public final MeasurementManager f6541a;

    public e(MeasurementManager measurementManager) {
        this.f6541a = measurementManager;
    }

    public static Object h(e eVar, a aVar, l7.c<? super l> cVar) {
        new n(1, q4.b.C(cVar)).r();
        MeasurementManager measurementManager = eVar.f6541a;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static Object i(e eVar, l7.c<? super Integer> cVar) {
        n nVar = new n(1, q4.b.C(cVar));
        nVar.r();
        eVar.f6541a.getMeasurementApiStatus((Executor) new Object(), new m0.e(nVar));
        Object q = nVar.q();
        m7.a aVar = m7.a.f4049a;
        return q;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static Object k(e eVar, Uri uri, InputEvent inputEvent, l7.c<? super l> cVar) {
        n nVar = new n(1, q4.b.C(cVar));
        nVar.r();
        eVar.f6541a.registerSource(uri, inputEvent, (Executor) new Object(), new m0.e(nVar));
        Object q = nVar.q();
        return q == m7.a.f4049a ? q : l.f2236a;
    }

    public static Object l(e eVar, f fVar, l7.c<? super l> cVar) {
        Object e9 = f0.e(new p(eVar, null, 3), cVar);
        return e9 == m7.a.f4049a ? e9 : l.f2236a;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static Object m(e eVar, Uri uri, l7.c<? super l> cVar) {
        n nVar = new n(1, q4.b.C(cVar));
        nVar.r();
        eVar.f6541a.registerTrigger(uri, (Executor) new Object(), new m0.e(nVar));
        Object q = nVar.q();
        return q == m7.a.f4049a ? q : l.f2236a;
    }

    public static Object o(e eVar, g gVar, l7.c<? super l> cVar) {
        new n(1, q4.b.C(cVar)).r();
        MeasurementManager measurementManager = eVar.f6541a;
        throw null;
    }

    public static Object q(e eVar, h hVar, l7.c<? super l> cVar) {
        new n(1, q4.b.C(cVar)).r();
        MeasurementManager measurementManager = eVar.f6541a;
        throw null;
    }

    @Override // x1.b
    public Object b(l7.c<? super Integer> cVar) {
        return i(this, cVar);
    }

    @Override // x1.b
    public Object c(Uri uri, InputEvent inputEvent, l7.c<? super l> cVar) {
        return k(this, uri, inputEvent, cVar);
    }

    @Override // x1.b
    public Object d(Uri uri, l7.c<? super l> cVar) {
        return m(this, uri, cVar);
    }

    public Object g(a aVar, l7.c<? super l> cVar) {
        return h(this, aVar, cVar);
    }

    public Object j(f fVar, l7.c<? super l> cVar) {
        return l(this, fVar, cVar);
    }

    public Object n(g gVar, l7.c<? super l> cVar) {
        return o(this, gVar, cVar);
    }

    public Object p(h hVar, l7.c<? super l> cVar) {
        return q(this, hVar, cVar);
    }
}
