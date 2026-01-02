package x8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class n implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f6663a;

    public n(f0 f0Var) {
        kotlin.jvm.internal.j.e(f0Var, "delegate");
        this.f6663a = f0Var;
    }

    @Override // x8.f0
    public final j0 b() {
        return this.f6663a.b();
    }

    @Override // x8.f0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f6663a.close();
    }

    @Override // x8.f0, java.io.Flushable
    public void flush() {
        this.f6663a.flush();
    }

    @Override // x8.f0
    public void k(g gVar, long j) {
        this.f6663a.k(gVar, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f6663a + ')';
    }
}
