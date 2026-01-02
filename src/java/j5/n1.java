package j5;

import android.os.Build;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3089a;

    public n1(boolean z9) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f3089a = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            String str = Build.VERSION.RELEASE;
            if (str.equals(str)) {
                String str2 = Build.VERSION.CODENAME;
                return str2.equals(str2) && this.f3089a == n1Var.f3089a;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f3089a ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f3089a + "}";
    }
}
