package o2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f5004a;

    public b(Integer num) {
        this.f5004a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            Integer num = ((b) obj).f5004a;
            Integer num2 = this.f5004a;
            return num2 == null ? num == null : num2.equals(num);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f5004a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f5004a + "}";
    }
}
