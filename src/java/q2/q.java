package q2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class q extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f5285a;

    public q(Integer num) {
        this.f5285a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            Integer num = this.f5285a;
            q qVar = (q) ((c0) obj);
            return num == null ? qVar.f5285a == null : num.equals(qVar.f5285a);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f5285a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f5285a + "}";
    }
}
