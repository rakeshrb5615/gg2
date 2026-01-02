package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class s0 extends u0 {

    /* renamed from: c  reason: collision with root package name */
    public final n f1243c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w0 f1244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(w0 w0Var, long j, n nVar) {
        super(j);
        this.f1244d = w0Var;
        this.f1243c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1243c.B(this.f1244d);
    }

    @Override // d8.u0
    public final String toString() {
        return super.toString() + this.f1243c;
    }
}
