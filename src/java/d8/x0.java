package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class x0 extends a0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f1261f = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f1262c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1263d;

    /* renamed from: e  reason: collision with root package name */
    public i7.g f1264e;

    public final void A(boolean z9) {
        this.f1262c = (z9 ? 4294967296L : 1L) + this.f1262c;
        if (z9) {
            return;
        }
        this.f1263d = true;
    }

    public abstract long B();

    public final boolean C() {
        i7.g gVar = this.f1264e;
        if (gVar == null) {
            return false;
        }
        m0 m0Var = (m0) (gVar.isEmpty() ? null : gVar.removeFirst());
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void D(long j, u0 u0Var) {
        g0.f1197p.I(j, u0Var);
    }

    public abstract void shutdown();

    public final void y(boolean z9) {
        long j = this.f1262c - (z9 ? 4294967296L : 1L);
        this.f1262c = j;
        if (j <= 0 && this.f1263d) {
            shutdown();
        }
    }

    public abstract Thread z();
}
