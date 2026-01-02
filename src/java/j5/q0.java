package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class q0 extends d2 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f3118a;

    /* renamed from: b  reason: collision with root package name */
    public final List f3119b;

    /* renamed from: c  reason: collision with root package name */
    public final List f3120c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f3121d;

    /* renamed from: e  reason: collision with root package name */
    public final c2 f3122e;

    /* renamed from: f  reason: collision with root package name */
    public final List f3123f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3124g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, c2 c2Var, List list3, int i) {
        this.f3118a = r0Var;
        this.f3119b = list;
        this.f3120c = list2;
        this.f3121d = bool;
        this.f3122e = c2Var;
        this.f3123f = list3;
        this.f3124g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            q0 q0Var = (q0) ((d2) obj);
            List list = q0Var.f3123f;
            c2 c2Var = q0Var.f3122e;
            Boolean bool = q0Var.f3121d;
            List list2 = q0Var.f3120c;
            List list3 = q0Var.f3119b;
            if (this.f3118a.equals(q0Var.f3118a)) {
                List list4 = this.f3119b;
                if (list4 == null) {
                    if (list3 != null) {
                        return false;
                    }
                } else if (!list4.equals(list3)) {
                    return false;
                }
                List list5 = this.f3120c;
                if (list5 == null) {
                    if (list2 != null) {
                        return false;
                    }
                } else if (!list5.equals(list2)) {
                    return false;
                }
                Boolean bool2 = this.f3121d;
                if (bool2 == null) {
                    if (bool != null) {
                        return false;
                    }
                } else if (!bool2.equals(bool)) {
                    return false;
                }
                c2 c2Var2 = this.f3122e;
                if (c2Var2 == null) {
                    if (c2Var != null) {
                        return false;
                    }
                } else if (!c2Var2.equals(c2Var)) {
                    return false;
                }
                List list6 = this.f3123f;
                if (list6 == null) {
                    if (list != null) {
                        return false;
                    }
                } else if (!list6.equals(list)) {
                    return false;
                }
                return this.f3124g == q0Var.f3124g;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3118a.hashCode() ^ 1000003) * 1000003;
        List list = this.f3119b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f3120c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f3121d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c2 c2Var = this.f3122e;
        int hashCode5 = (hashCode4 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list3 = this.f3123f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f3124g;
    }

    public final String toString() {
        return "Application{execution=" + this.f3118a + ", customAttributes=" + this.f3119b + ", internalKeys=" + this.f3120c + ", background=" + this.f3121d + ", currentProcessDetails=" + this.f3122e + ", appProcessDetails=" + this.f3123f + ", uiOrientation=" + this.f3124g + "}";
    }
}
