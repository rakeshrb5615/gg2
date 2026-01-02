package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class r0 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1240a;

    public r0(boolean z9) {
        this.f1240a = z9;
    }

    @Override // d8.b1
    public final s1 c() {
        return null;
    }

    @Override // d8.b1
    public final boolean isActive() {
        return this.f1240a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f1240a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
