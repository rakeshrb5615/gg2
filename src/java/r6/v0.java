package r6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5746a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5747b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5748c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5749d;

    /* renamed from: e  reason: collision with root package name */
    public final k f5750e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5751f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5752g;

    public v0(String str, String str2, int i, long j, k kVar, String str3, String str4) {
        kotlin.jvm.internal.j.e(str, "sessionId");
        kotlin.jvm.internal.j.e(str2, "firstSessionId");
        kotlin.jvm.internal.j.e(str4, "firebaseAuthenticationToken");
        this.f5746a = str;
        this.f5747b = str2;
        this.f5748c = i;
        this.f5749d = j;
        this.f5750e = kVar;
        this.f5751f = str3;
        this.f5752g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return kotlin.jvm.internal.j.a(this.f5746a, v0Var.f5746a) && kotlin.jvm.internal.j.a(this.f5747b, v0Var.f5747b) && this.f5748c == v0Var.f5748c && this.f5749d == v0Var.f5749d && kotlin.jvm.internal.j.a(this.f5750e, v0Var.f5750e) && kotlin.jvm.internal.j.a(this.f5751f, v0Var.f5751f) && kotlin.jvm.internal.j.a(this.f5752g, v0Var.f5752g);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5747b.hashCode();
        int hashCode2 = Integer.hashCode(this.f5748c);
        int hashCode3 = Long.hashCode(this.f5749d);
        int hashCode4 = this.f5750e.hashCode();
        int hashCode5 = this.f5751f.hashCode();
        return this.f5752g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f5746a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f5746a + ", firstSessionId=" + this.f5747b + ", sessionIndex=" + this.f5748c + ", eventTimestampUs=" + this.f5749d + ", dataCollectionStatus=" + this.f5750e + ", firebaseInstallationId=" + this.f5751f + ", firebaseAuthenticationToken=" + this.f5752g + ')';
    }
}
