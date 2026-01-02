package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class t0 extends x1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3154b;

    /* renamed from: c  reason: collision with root package name */
    public final List f3155c;

    /* renamed from: d  reason: collision with root package name */
    public final x1 f3156d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3157e;

    public t0(String str, String str2, List list, x1 x1Var, int i) {
        this.f3153a = str;
        this.f3154b = str2;
        this.f3155c = list;
        this.f3156d = x1Var;
        this.f3157e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.f3156d;
            String str2 = t0Var.f3154b;
            if (this.f3153a.equals(t0Var.f3153a) && ((str = this.f3154b) != null ? str.equals(str2) : str2 == null) && this.f3155c.equals(t0Var.f3155c) && ((x1Var = this.f3156d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.f3157e == t0Var.f3157e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3153a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3154b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3155c.hashCode()) * 1000003;
        x1 x1Var = this.f3156d;
        return ((hashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.f3157e;
    }

    public final String toString() {
        return "Exception{type=" + this.f3153a + ", reason=" + this.f3154b + ", frames=" + this.f3155c + ", causedBy=" + this.f3156d + ", overflowCount=" + this.f3157e + "}";
    }
}
