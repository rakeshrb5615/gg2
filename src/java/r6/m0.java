package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class m0 {
    public static final l0 Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f5696a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5697b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5698c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5699d;

    public /* synthetic */ m0(long j, String str, int i, int i9, String str2) {
        if (15 != (i & 15)) {
            s8.k.a(i, 15, k0.f5692a.d());
            throw null;
        }
        this.f5696a = str;
        this.f5697b = str2;
        this.f5698c = i9;
        this.f5699d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return kotlin.jvm.internal.j.a(this.f5696a, m0Var.f5696a) && kotlin.jvm.internal.j.a(this.f5697b, m0Var.f5697b) && this.f5698c == m0Var.f5698c && this.f5699d == m0Var.f5699d;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5697b.hashCode();
        int hashCode2 = Integer.hashCode(this.f5698c);
        return Long.hashCode(this.f5699d) + ((hashCode2 + ((hashCode + (this.f5696a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f5696a + ", firstSessionId=" + this.f5697b + ", sessionIndex=" + this.f5698c + ", sessionStartTimestampUs=" + this.f5699d + ')';
    }

    public m0(int i, String str, String str2, long j) {
        this.f5696a = str;
        this.f5697b = str2;
        this.f5698c = i;
        this.f5699d = j;
    }
}
