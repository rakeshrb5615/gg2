package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d0 extends p1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f2933a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2934b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2935c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2936d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2937e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2938f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2939g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2940h;
    public final List i;

    public d0(int i, String str, int i9, int i10, long j, long j8, long j9, String str2, List list) {
        this.f2933a = i;
        this.f2934b = str;
        this.f2935c = i9;
        this.f2936d = i10;
        this.f2937e = j;
        this.f2938f = j8;
        this.f2939g = j9;
        this.f2940h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            List list2 = d0Var.i;
            String str2 = d0Var.f2940h;
            if (this.f2933a == d0Var.f2933a && this.f2934b.equals(d0Var.f2934b) && this.f2935c == d0Var.f2935c && this.f2936d == d0Var.f2936d && this.f2937e == d0Var.f2937e && this.f2938f == d0Var.f2938f && this.f2939g == d0Var.f2939g && ((str = this.f2940h) != null ? str.equals(str2) : str2 == null) && ((list = this.i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2937e;
        long j8 = this.f2938f;
        long j9 = this.f2939g;
        int hashCode = (((((((((((((this.f2933a ^ 1000003) * 1000003) ^ this.f2934b.hashCode()) * 1000003) ^ this.f2935c) * 1000003) ^ this.f2936d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str = this.f2940h;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f2933a + ", processName=" + this.f2934b + ", reasonCode=" + this.f2935c + ", importance=" + this.f2936d + ", pss=" + this.f2937e + ", rss=" + this.f2938f + ", timestamp=" + this.f2939g + ", traceFile=" + this.f2940h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
