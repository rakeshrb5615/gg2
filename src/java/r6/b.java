package r6;

import android.os.Build;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5594a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5595b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        x xVar = x.f5757b;
        kotlin.jvm.internal.j.e(str, "appId");
        kotlin.jvm.internal.j.e(str2, "deviceModel");
        kotlin.jvm.internal.j.e(str3, "osVersion");
        this.f5594a = str;
        this.f5595b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (kotlin.jvm.internal.j.a(this.f5594a, bVar.f5594a)) {
                String str = Build.MODEL;
                if (kotlin.jvm.internal.j.a(str, str)) {
                    String str2 = Build.VERSION.RELEASE;
                    if (kotlin.jvm.internal.j.a(str2, str2)) {
                        x xVar = x.f5757b;
                        return this.f5595b.equals(bVar.f5595b);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Build.MODEL.hashCode();
        int hashCode2 = Build.VERSION.RELEASE.hashCode();
        int hashCode3 = x.f5757b.hashCode();
        return this.f5595b.hashCode() + ((hashCode3 + ((hashCode2 + ((((hashCode + (this.f5594a.hashCode() * 31)) * 31) + 48517562) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f5594a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + x.f5757b + ", androidAppInfo=" + this.f5595b + ')';
    }
}
