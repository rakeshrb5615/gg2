package f8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f1560a;

    public h(Throwable th) {
        this.f1560a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.j.a(this.f1560a, ((h) obj).f1560a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1560a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // f8.i
    public final String toString() {
        return "Closed(" + this.f1560a + ')';
    }
}
