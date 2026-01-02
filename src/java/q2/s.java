package q2;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5287a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f5288b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f5289c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5290d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f5291e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5292f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5293g;

    /* renamed from: h  reason: collision with root package name */
    public final i0 f5294h;
    public final b0 i;

    public s(long j, Integer num, a0 a0Var, long j8, byte[] bArr, String str, long j9, i0 i0Var, b0 b0Var) {
        this.f5287a = j;
        this.f5288b = num;
        this.f5289c = a0Var;
        this.f5290d = j8;
        this.f5291e = bArr;
        this.f5292f = str;
        this.f5293g = j9;
        this.f5294h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.i;
            i0 i0Var2 = sVar.f5294h;
            String str2 = sVar.f5292f;
            a0 a0Var2 = sVar.f5289c;
            Integer num2 = sVar.f5288b;
            if (this.f5287a == sVar.f5287a && ((num = this.f5288b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f5289c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f5290d == sVar.f5290d) {
                if (Arrays.equals(this.f5291e, e0Var instanceof s ? ((s) e0Var).f5291e : sVar.f5291e) && ((str = this.f5292f) != null ? str.equals(str2) : str2 == null) && this.f5293g == sVar.f5293g && ((i0Var = this.f5294h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5287a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f5288b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f5289c;
        int hashCode2 = a0Var == null ? 0 : a0Var.hashCode();
        long j8 = this.f5290d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5291e)) * 1000003;
        String str = this.f5292f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j9 = this.f5293g;
        int i9 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        i0 i0Var = this.f5294h;
        int hashCode5 = (i9 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.i;
        return hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5287a + ", eventCode=" + this.f5288b + ", complianceData=" + this.f5289c + ", eventUptimeMs=" + this.f5290d + ", sourceExtension=" + Arrays.toString(this.f5291e) + ", sourceExtensionJsonProto3=" + this.f5292f + ", timezoneOffsetSeconds=" + this.f5293g + ", networkConnectionInfo=" + this.f5294h + ", experimentIds=" + this.i + "}";
    }
}
