package x8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class o implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f6664a;

    public o(h0 h0Var) {
        kotlin.jvm.internal.j.e(h0Var, "delegate");
        this.f6664a = h0Var;
    }

    @Override // x8.h0
    public final j0 b() {
        return this.f6664a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6664a.close();
    }

    @Override // x8.h0
    public long t(g gVar, long j) {
        kotlin.jvm.internal.j.e(gVar, "sink");
        return this.f6664a.t(gVar, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f6664a + ')';
    }
}
