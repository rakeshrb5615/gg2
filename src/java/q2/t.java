package q2;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class t extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5295a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5296b;

    /* renamed from: c  reason: collision with root package name */
    public final n f5297c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f5298d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5299e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f5300f;

    public t(long j, long j8, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f5265a;
        this.f5295a = j;
        this.f5296b = j8;
        this.f5297c = nVar;
        this.f5298d = num;
        this.f5299e = str;
        this.f5300f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            t tVar = (t) ((f0) obj);
            Object obj2 = j0.f5265a;
            ArrayList arrayList = tVar.f5300f;
            String str = tVar.f5299e;
            Integer num = tVar.f5298d;
            n nVar = tVar.f5297c;
            if (this.f5295a == tVar.f5295a && this.f5296b == tVar.f5296b && this.f5297c.equals(nVar)) {
                Integer num2 = this.f5298d;
                if (num2 == null) {
                    if (num != null) {
                        return false;
                    }
                } else if (!num2.equals(num)) {
                    return false;
                }
                String str2 = this.f5299e;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                return this.f5300f.equals(arrayList) && obj2.equals(obj2);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5295a;
        long j8 = this.f5296b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f5297c.hashCode()) * 1000003;
        Integer num = this.f5298d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f5299e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f5300f.hashCode()) * 1000003) ^ j0.f5265a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5295a + ", requestUptimeMs=" + this.f5296b + ", clientInfo=" + this.f5297c + ", logSource=" + this.f5298d + ", logSourceName=" + this.f5299e + ", logEvents=" + this.f5300f + ", qosTier=" + j0.f5265a + "}";
    }
}
