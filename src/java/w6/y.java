package w6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class y extends z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f6487a;

    public y(z zVar) {
        this.f6487a = zVar;
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        return this.f6487a.b(aVar);
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        if (obj == null) {
            bVar.B();
        } else {
            this.f6487a.c(bVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f6487a + "]";
    }
}
