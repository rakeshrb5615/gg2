package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b2 extends i8.q implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f1163e;

    public b2(long j, n7.c cVar) {
        super(cVar, cVar.getContext());
        this.f1163e = j;
    }

    @Override // d8.r1
    public final String C() {
        return super.C() + "(timeMillis=" + this.f1163e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0.i(this.f1156c);
        i(new a2("Timed out waiting for " + this.f1163e + " ms", this));
    }
}
