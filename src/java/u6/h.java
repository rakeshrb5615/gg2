package u6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h {
    public static final g Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f6109a;

    /* renamed from: b  reason: collision with root package name */
    public final Double f6110b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f6111c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f6112d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f6113e;

    public /* synthetic */ h(int i, Boolean bool, Double d9, Integer num, Integer num2, Long l5) {
        if (31 != (i & 31)) {
            s8.k.a(i, 31, f.f6108a.d());
            throw null;
        }
        this.f6109a = bool;
        this.f6110b = d9;
        this.f6111c = num;
        this.f6112d = num2;
        this.f6113e = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return kotlin.jvm.internal.j.a(this.f6109a, hVar.f6109a) && kotlin.jvm.internal.j.a(this.f6110b, hVar.f6110b) && kotlin.jvm.internal.j.a(this.f6111c, hVar.f6111c) && kotlin.jvm.internal.j.a(this.f6112d, hVar.f6112d) && kotlin.jvm.internal.j.a(this.f6113e, hVar.f6113e);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f6109a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d9 = this.f6110b;
        int hashCode2 = (hashCode + (d9 == null ? 0 : d9.hashCode())) * 31;
        Integer num = this.f6111c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6112d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.f6113e;
        return hashCode4 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f6109a + ", sessionSamplingRate=" + this.f6110b + ", sessionTimeoutSeconds=" + this.f6111c + ", cacheDurationSeconds=" + this.f6112d + ", cacheUpdatedTimeSeconds=" + this.f6113e + ')';
    }

    public h(Boolean bool, Double d9, Integer num, Integer num2, Long l5) {
        this.f6109a = bool;
        this.f6110b = d9;
        this.f6111c = num;
        this.f6112d = num2;
        this.f6113e = l5;
    }
}
