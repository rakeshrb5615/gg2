package e6;

import g2.g;
import u.e;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f1319h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f1320a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1321b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1322c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1323d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1324e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1325f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1326g;

    static {
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(g.g("Missing required properties:", sb));
    }

    public b(String str, int i, String str2, String str3, long j, long j8, String str4) {
        this.f1320a = str;
        this.f1321b = i;
        this.f1322c = str2;
        this.f1323d = str3;
        this.f1324e = j;
        this.f1325f = j8;
        this.f1326g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e6.a] */
    public final a a() {
        ?? obj = new Object();
        obj.f1311a = this.f1320a;
        obj.f1312b = this.f1321b;
        obj.f1313c = this.f1322c;
        obj.f1314d = this.f1323d;
        obj.f1315e = this.f1324e;
        obj.f1316f = this.f1325f;
        obj.f1317g = this.f1326g;
        obj.f1318h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.f1326g;
            String str2 = bVar.f1323d;
            String str3 = bVar.f1322c;
            String str4 = bVar.f1320a;
            String str5 = this.f1320a;
            if (str5 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str5.equals(str4)) {
                return false;
            }
            if (e.a(this.f1321b, bVar.f1321b)) {
                String str6 = this.f1322c;
                if (str6 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str6.equals(str3)) {
                    return false;
                }
                String str7 = this.f1323d;
                if (str7 == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str7.equals(str2)) {
                    return false;
                }
                if (this.f1324e == bVar.f1324e && this.f1325f == bVar.f1325f) {
                    String str8 = this.f1326g;
                    return str8 == null ? str == null : str8.equals(str);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1320a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.c(this.f1321b)) * 1000003;
        String str2 = this.f1322c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1323d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f1324e;
        long j8 = this.f1325f;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f1326g;
        return (str4 != null ? str4.hashCode() : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f1320a);
        sb.append(", registrationStatus=");
        int i = this.f1321b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f1322c);
        sb.append(", refreshToken=");
        sb.append(this.f1323d);
        sb.append(", expiresInSecs=");
        sb.append(this.f1324e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f1325f);
        sb.append(", fisError=");
        return v1.a.n(sb, this.f1326g, "}");
    }
}
