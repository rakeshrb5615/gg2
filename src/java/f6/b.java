package f6;

import u.e;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1506a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1507b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1508c;

    public b(String str, long j, int i) {
        this.f1506a = str;
        this.f1507b = j;
        this.f1508c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i = bVar.f1508c;
            String str = bVar.f1506a;
            String str2 = this.f1506a;
            if (str2 == null) {
                if (str != null) {
                    return false;
                }
            } else if (!str2.equals(str)) {
                return false;
            }
            if (this.f1507b == bVar.f1507b) {
                int i9 = this.f1508c;
                return i9 == 0 ? i == 0 : e.a(i9, i);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1506a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f1507b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i9 = this.f1508c;
        return (i9 != 0 ? e.c(i9) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f1506a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f1507b);
        sb.append(", responseCode=");
        int i = this.f1508c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
