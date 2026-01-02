package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j0 extends m2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3016a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3017b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3018c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3019d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f3020e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3021f;

    /* renamed from: g  reason: collision with root package name */
    public final u1 f3022g;

    /* renamed from: h  reason: collision with root package name */
    public final l2 f3023h;
    public final k2 i;
    public final v1 j;

    /* renamed from: k  reason: collision with root package name */
    public final List f3024k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3025l;

    public j0(String str, String str2, String str3, long j, Long l5, boolean z9, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i) {
        this.f3016a = str;
        this.f3017b = str2;
        this.f3018c = str3;
        this.f3019d = j;
        this.f3020e = l5;
        this.f3021f = z9;
        this.f3022g = u1Var;
        this.f3023h = l2Var;
        this.i = k2Var;
        this.j = v1Var;
        this.f3024k = list;
        this.f3025l = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j5.i0, java.lang.Object] */
    @Override // j5.m2
    public final i0 a() {
        ?? obj = new Object();
        obj.f2990a = this.f3016a;
        obj.f2991b = this.f3017b;
        obj.f2992c = this.f3018c;
        obj.f2993d = this.f3019d;
        obj.f2994e = this.f3020e;
        obj.f2995f = this.f3021f;
        obj.f2996g = this.f3022g;
        obj.f2997h = this.f3023h;
        obj.i = this.i;
        obj.j = this.j;
        obj.f2998k = this.f3024k;
        obj.f2999l = this.f3025l;
        obj.f3000m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l5;
        l2 l2Var;
        k2 k2Var;
        v1 v1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            List list2 = j0Var.f3024k;
            v1 v1Var2 = j0Var.j;
            k2 k2Var2 = j0Var.i;
            l2 l2Var2 = j0Var.f3023h;
            Long l9 = j0Var.f3020e;
            String str2 = j0Var.f3018c;
            if (this.f3016a.equals(j0Var.f3016a) && this.f3017b.equals(j0Var.f3017b) && ((str = this.f3018c) != null ? str.equals(str2) : str2 == null) && this.f3019d == j0Var.f3019d && ((l5 = this.f3020e) != null ? l5.equals(l9) : l9 == null) && this.f3021f == j0Var.f3021f && this.f3022g.equals(j0Var.f3022g) && ((l2Var = this.f3023h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.f3024k) != null ? list.equals(list2) : list2 == null) && this.f3025l == j0Var.f3025l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f3016a.hashCode() ^ 1000003) * 1000003) ^ this.f3017b.hashCode()) * 1000003;
        String str = this.f3018c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f3019d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l5 = this.f3020e;
        int hashCode3 = (((((i ^ (l5 == null ? 0 : l5.hashCode())) * 1000003) ^ (this.f3021f ? 1231 : 1237)) * 1000003) ^ this.f3022g.hashCode()) * 1000003;
        l2 l2Var = this.f3023h;
        int hashCode4 = (hashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.i;
        int hashCode5 = (hashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.j;
        int hashCode6 = (hashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.f3024k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f3025l;
    }

    public final String toString() {
        return "Session{generator=" + this.f3016a + ", identifier=" + this.f3017b + ", appQualitySessionId=" + this.f3018c + ", startedAt=" + this.f3019d + ", endedAt=" + this.f3020e + ", crashed=" + this.f3021f + ", app=" + this.f3022g + ", user=" + this.f3023h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.f3024k + ", generatorType=" + this.f3025l + "}";
    }
}
