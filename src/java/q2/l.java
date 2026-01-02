package q2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f5270a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5271b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5272c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5273d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5274e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5275f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5276g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5277h;
    public final String i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5278k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5279l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5270a = num;
        this.f5271b = str;
        this.f5272c = str2;
        this.f5273d = str3;
        this.f5274e = str4;
        this.f5275f = str5;
        this.f5276g = str6;
        this.f5277h = str7;
        this.i = str8;
        this.j = str9;
        this.f5278k = str10;
        this.f5279l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f5270a;
            if (num != null ? num.equals(((l) aVar).f5270a) : ((l) aVar).f5270a == null) {
                String str = this.f5271b;
                if (str != null ? str.equals(((l) aVar).f5271b) : ((l) aVar).f5271b == null) {
                    String str2 = this.f5272c;
                    if (str2 != null ? str2.equals(((l) aVar).f5272c) : ((l) aVar).f5272c == null) {
                        String str3 = this.f5273d;
                        if (str3 != null ? str3.equals(((l) aVar).f5273d) : ((l) aVar).f5273d == null) {
                            String str4 = this.f5274e;
                            if (str4 != null ? str4.equals(((l) aVar).f5274e) : ((l) aVar).f5274e == null) {
                                String str5 = this.f5275f;
                                if (str5 != null ? str5.equals(((l) aVar).f5275f) : ((l) aVar).f5275f == null) {
                                    String str6 = this.f5276g;
                                    if (str6 != null ? str6.equals(((l) aVar).f5276g) : ((l) aVar).f5276g == null) {
                                        String str7 = this.f5277h;
                                        if (str7 != null ? str7.equals(((l) aVar).f5277h) : ((l) aVar).f5277h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((l) aVar).i) : ((l) aVar).i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) aVar).j) : ((l) aVar).j == null) {
                                                    String str10 = this.f5278k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f5278k) : ((l) aVar).f5278k == null) {
                                                        String str11 = this.f5279l;
                                                        if (str11 != null ? str11.equals(((l) aVar).f5279l) : ((l) aVar).f5279l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f5270a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f5271b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f5272c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5273d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f5274e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f5275f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f5276g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f5277h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f5278k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f5279l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f5270a);
        sb.append(", model=");
        sb.append(this.f5271b);
        sb.append(", hardware=");
        sb.append(this.f5272c);
        sb.append(", device=");
        sb.append(this.f5273d);
        sb.append(", product=");
        sb.append(this.f5274e);
        sb.append(", osBuild=");
        sb.append(this.f5275f);
        sb.append(", manufacturer=");
        sb.append(this.f5276g);
        sb.append(", fingerprint=");
        sb.append(this.f5277h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.f5278k);
        sb.append(", applicationBuild=");
        return v1.a.n(sb, this.f5279l, "}");
    }
}
