package g5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1765a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1766b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1767c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1768d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1769e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1770f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1771g;

    /* renamed from: h  reason: collision with root package name */
    public final k2.c f1772h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, k2.c cVar) {
        this.f1765a = str;
        this.f1766b = str2;
        this.f1767c = arrayList;
        this.f1768d = str3;
        this.f1769e = str4;
        this.f1770f = str5;
        this.f1771g = str6;
        this.f1772h = cVar;
    }

    public static a a(Context context, y yVar, String str, String str2, ArrayList arrayList, k2.c cVar) {
        String packageName = context.getPackageName();
        String d9 = yVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String l5 = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, d9, packageName, l5, str3, cVar);
    }
}
