package z8;

import okhttp3.Call;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class q extends s {

    /* renamed from: d  reason: collision with root package name */
    public final f f7554d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7555e;

    public q(p0 p0Var, Call.Factory factory, m mVar, f fVar, boolean z9) {
        super(p0Var, factory, mVar);
        this.f7554d = fVar;
        this.f7555e = z9;
    }

    @Override // z8.s
    public final Object b(z zVar, Object[] objArr) {
        d dVar = (d) this.f7554d.a(zVar);
        l7.c cVar = (l7.c) objArr[objArr.length - 1];
        try {
            if (this.f7555e) {
                kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
                return z0.c(dVar, cVar);
            }
            return z0.b(dVar, cVar);
        } catch (LinkageError e9) {
            throw e9;
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (VirtualMachineError e11) {
            throw e11;
        } catch (Throwable th) {
            z0.q(th, cVar);
            return m7.a.f4049a;
        }
    }
}
