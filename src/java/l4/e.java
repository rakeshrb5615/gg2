package l4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3776a;

    public e(Object obj) {
        this.f3776a = obj;
    }

    @Override // l4.d
    public final Object a() {
        return this.f3776a;
    }

    @Override // l4.d
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f3776a.equals(((e) obj).f3776a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3776a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f3776a + ")";
    }
}
