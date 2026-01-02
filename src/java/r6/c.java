package r6;

import android.os.Build;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c implements t5.d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5603a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final t5.c f5604b = t5.c.a("packageName");

    /* renamed from: c  reason: collision with root package name */
    public static final t5.c f5605c = t5.c.a("versionName");

    /* renamed from: d  reason: collision with root package name */
    public static final t5.c f5606d = t5.c.a("appBuildVersion");

    /* renamed from: e  reason: collision with root package name */
    public static final t5.c f5607e = t5.c.a("deviceManufacturer");

    /* renamed from: f  reason: collision with root package name */
    public static final t5.c f5608f = t5.c.a("currentProcessDetails");

    /* renamed from: g  reason: collision with root package name */
    public static final t5.c f5609g = t5.c.a("appProcessDetails");

    @Override // t5.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        t5.e eVar = (t5.e) obj2;
        eVar.f(f5604b, aVar.f5584a);
        eVar.f(f5605c, aVar.f5585b);
        eVar.f(f5606d, aVar.f5586c);
        eVar.f(f5607e, Build.MANUFACTURER);
        eVar.f(f5608f, aVar.f5587d);
        eVar.f(f5609g, aVar.f5588e);
    }
}
