package r6;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5584a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5585b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5586c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f5587d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5588e;

    public a(String str, String str2, String str3, d0 d0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(str2, "versionName");
        kotlin.jvm.internal.j.e(str3, "appBuildVersion");
        kotlin.jvm.internal.j.e(str4, "deviceManufacturer");
        this.f5584a = str;
        this.f5585b = str2;
        this.f5586c = str3;
        this.f5587d = d0Var;
        this.f5588e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5584a.equals(aVar.f5584a) && kotlin.jvm.internal.j.a(this.f5585b, aVar.f5585b) && kotlin.jvm.internal.j.a(this.f5586c, aVar.f5586c)) {
                String str = Build.MANUFACTURER;
                return kotlin.jvm.internal.j.a(str, str) && this.f5587d.equals(aVar.f5587d) && this.f5588e.equals(aVar.f5588e);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5585b.hashCode();
        int hashCode2 = this.f5586c.hashCode();
        int hashCode3 = Build.MANUFACTURER.hashCode();
        int hashCode4 = this.f5587d.hashCode();
        return this.f5588e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f5584a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f5584a + ", versionName=" + this.f5585b + ", appBuildVersion=" + this.f5586c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f5587d + ", appProcessDetails=" + this.f5588e + ')';
    }
}
