package f6;

import u.e;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1501a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1502b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1503c;

    /* renamed from: d  reason: collision with root package name */
    public final b f1504d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1505e;

    public a(String str, String str2, String str3, b bVar, int i) {
        this.f1501a = str;
        this.f1502b = str2;
        this.f1503c = str3;
        this.f1504d = bVar;
        this.f1505e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i = aVar.f1505e;
            b bVar = aVar.f1504d;
            String str = aVar.f1503c;
            String str2 = aVar.f1502b;
            String str3 = aVar.f1501a;
            String str4 = this.f1501a;
            if (str4 == null) {
                if (str3 != null) {
                    return false;
                }
            } else if (!str4.equals(str3)) {
                return false;
            }
            String str5 = this.f1502b;
            if (str5 == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str5.equals(str2)) {
                return false;
            }
            String str6 = this.f1503c;
            if (str6 == null) {
                if (str != null) {
                    return false;
                }
            } else if (!str6.equals(str)) {
                return false;
            }
            b bVar2 = this.f1504d;
            if (bVar2 == null) {
                if (bVar != null) {
                    return false;
                }
            } else if (!bVar2.equals(bVar)) {
                return false;
            }
            int i9 = this.f1505e;
            return i9 == 0 ? i == 0 : e.a(i9, i);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1501a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1502b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1503c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f1504d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i = this.f1505e;
        return (i != 0 ? e.c(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f1501a);
        sb.append(", fid=");
        sb.append(this.f1502b);
        sb.append(", refreshToken=");
        sb.append(this.f1503c);
        sb.append(", authToken=");
        sb.append(this.f1504d);
        sb.append(", responseCode=");
        int i = this.f1505e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
