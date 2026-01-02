package r6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f5707a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final j6.o f5708b;

    /* JADX WARN: Type inference failed for: r0v0, types: [r6.o0, java.lang.Object] */
    static {
        v5.d dVar = new v5.d();
        dVar.a(n0.class, g.f5649a);
        dVar.a(v0.class, h.f5654a);
        dVar.a(k.class, e.f5636a);
        dVar.a(b.class, d.f5624a);
        dVar.a(a.class, c.f5603a);
        dVar.a(d0.class, f.f5640a);
        dVar.f6312d = true;
        f5708b = new j6.o(dVar, 19);
    }

    public static b a(q4.f fVar) {
        fVar.a();
        Context context = fVar.f5386a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        fVar.a();
        String str = fVar.f5388c.f5400b;
        kotlin.jvm.internal.j.d(str, "getApplicationId(...)");
        kotlin.jvm.internal.j.d(Build.MODEL, "MODEL");
        kotlin.jvm.internal.j.d(Build.VERSION.RELEASE, "RELEASE");
        x xVar = x.f5757b;
        kotlin.jvm.internal.j.b(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? valueOf : str2;
        kotlin.jvm.internal.j.d(Build.MANUFACTURER, "MANUFACTURER");
        fVar.a();
        d0 b10 = e0.b(context);
        fVar.a();
        return new b(str, new a(packageName, str3, valueOf, b10, e0.a(context)));
    }
}
