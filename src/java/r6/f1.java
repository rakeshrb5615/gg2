package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f1 {
    public static final e1 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f5646a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5647b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5648c;

    public /* synthetic */ f1(int i, long j, long j8, long j9) {
        if (1 != (i & 1)) {
            s8.k.a(i, 1, d1.f5635a.d());
            throw null;
        }
        this.f5646a = j;
        this.f5647b = (i & 2) == 0 ? 1000 * j : j8;
        if ((i & 4) == 0) {
            this.f5648c = j / 1000;
        } else {
            this.f5648c = j9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.f5646a == ((f1) obj).f5646a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5646a);
    }

    public final String toString() {
        return "Time(ms=" + this.f5646a + ')';
    }

    public f1(long j) {
        this.f5646a = j;
        long j8 = 1000;
        this.f5647b = j * j8;
        this.f5648c = j / j8;
    }
}
