package s2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f5808a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5809b;

    public a(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f5808a = i;
        this.f5809b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return u.e.a(this.f5808a, aVar.f5808a) && this.f5809b == aVar.f5809b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5809b;
        return ((u.e.c(this.f5808a) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f5808a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f5809b);
        sb.append("}");
        return sb.toString();
    }
}
