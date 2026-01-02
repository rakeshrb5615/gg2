package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a0 {
    public static final z Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f5589a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5590b;

    public /* synthetic */ a0(int i, int i9, String str) {
        if (3 != (i & 3)) {
            s8.k.a(i, 3, y.f5764a.d());
            throw null;
        }
        this.f5589a = i9;
        this.f5590b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f5589a == a0Var.f5589a && kotlin.jvm.internal.j.a(this.f5590b, a0Var.f5590b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5590b.hashCode() + (Integer.hashCode(this.f5589a) * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f5589a + ", uuid=" + this.f5590b + ')';
    }

    public a0(int i, String str) {
        kotlin.jvm.internal.j.e(str, "uuid");
        this.f5589a = i;
        this.f5590b = str;
    }
}
