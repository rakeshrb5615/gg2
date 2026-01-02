package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class r0 extends b2 {

    /* renamed from: a  reason: collision with root package name */
    public final List f3130a;

    /* renamed from: b  reason: collision with root package name */
    public final x1 f3131b;

    /* renamed from: c  reason: collision with root package name */
    public final p1 f3132c;

    /* renamed from: d  reason: collision with root package name */
    public final u0 f3133d;

    /* renamed from: e  reason: collision with root package name */
    public final List f3134e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f3130a = list;
        this.f3131b = t0Var;
        this.f3132c = p1Var;
        this.f3133d = u0Var;
        this.f3134e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            List list = this.f3130a;
            if (list == null) {
                if (((r0) b2Var).f3130a != null) {
                    return false;
                }
            } else if (!list.equals(((r0) b2Var).f3130a)) {
                return false;
            }
            x1 x1Var = this.f3131b;
            if (x1Var == null) {
                if (((r0) b2Var).f3131b != null) {
                    return false;
                }
            } else if (!x1Var.equals(((r0) b2Var).f3131b)) {
                return false;
            }
            p1 p1Var = this.f3132c;
            if (p1Var == null) {
                if (((r0) b2Var).f3132c != null) {
                    return false;
                }
            } else if (!p1Var.equals(((r0) b2Var).f3132c)) {
                return false;
            }
            r0 r0Var = (r0) b2Var;
            return this.f3133d.equals(r0Var.f3133d) && this.f3134e.equals(r0Var.f3134e);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f3130a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f3131b;
        int hashCode2 = (hashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f3132c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.f3133d.hashCode()) * 1000003) ^ this.f3134e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f3130a + ", exception=" + this.f3131b + ", appExitInfo=" + this.f3132c + ", signal=" + this.f3133d + ", binaries=" + this.f3134e + "}";
    }
}
