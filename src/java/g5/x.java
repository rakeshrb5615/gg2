package g5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final String f1864a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1865b;

    public x(String str, String str2) {
        this.f1864a = str;
        this.f1865b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return kotlin.jvm.internal.j.a(this.f1864a, xVar.f1864a) && kotlin.jvm.internal.j.a(this.f1865b, xVar.f1865b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1864a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1865b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f1864a + ", authToken=" + this.f1865b + ')';
    }
}
