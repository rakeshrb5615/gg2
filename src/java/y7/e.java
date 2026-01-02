package y7;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final e f6970d = new d(1, 0, 1);

    @Override // y7.d
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (isEmpty() && ((e) obj).isEmpty()) {
                return true;
            }
            e eVar = (e) obj;
            return this.f6967a == eVar.f6967a && this.f6968b == eVar.f6968b;
        }
        return false;
    }

    @Override // y7.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6967a * 31) + this.f6968b;
    }

    @Override // y7.d
    public final boolean isEmpty() {
        return this.f6967a > this.f6968b;
    }

    @Override // y7.d
    public final String toString() {
        return this.f6967a + ".." + this.f6968b;
    }
}
