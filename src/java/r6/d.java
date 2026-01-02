package r6;

import android.os.Build;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d implements t5.d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f5624a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final t5.c f5625b = t5.c.a("appId");

    /* renamed from: c  reason: collision with root package name */
    public static final t5.c f5626c = t5.c.a("deviceModel");

    /* renamed from: d  reason: collision with root package name */
    public static final t5.c f5627d = t5.c.a("sessionSdkVersion");

    /* renamed from: e  reason: collision with root package name */
    public static final t5.c f5628e = t5.c.a("osVersion");

    /* renamed from: f  reason: collision with root package name */
    public static final t5.c f5629f = t5.c.a("logEnvironment");

    /* renamed from: g  reason: collision with root package name */
    public static final t5.c f5630g = t5.c.a("androidAppInfo");

    @Override // t5.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        t5.e eVar = (t5.e) obj2;
        eVar.f(f5625b, bVar.f5594a);
        eVar.f(f5626c, Build.MODEL);
        eVar.f(f5627d, "3.0.3");
        eVar.f(f5628e, Build.VERSION.RELEASE);
        eVar.f(f5629f, x.f5757b);
        eVar.f(f5630g, bVar.f5595b);
    }
}
