package j5;

import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g0 extends s1 {

    /* renamed from: a  reason: collision with root package name */
    public final List f2971a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2972b;

    public g0(List list, String str) {
        this.f2971a = list;
        this.f2972b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            g0 g0Var = (g0) ((s1) obj);
            String str2 = g0Var.f2972b;
            if (this.f2971a.equals(g0Var.f2971a) && ((str = this.f2972b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2971a.hashCode() ^ 1000003) * 1000003;
        String str = this.f2972b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f2971a);
        sb.append(", orgId=");
        return v1.a.n(sb, this.f2972b, "}");
    }
}
