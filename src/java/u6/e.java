package u6;

import android.net.Uri;
import java.net.URL;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final r6.b f6106a;

    /* renamed from: b  reason: collision with root package name */
    public final l7.h f6107b;

    public e(r6.b bVar, l7.h hVar) {
        kotlin.jvm.internal.j.e(bVar, "appInfo");
        kotlin.jvm.internal.j.e(hVar, "blockingDispatcher");
        this.f6106a = bVar;
        this.f6107b = hVar;
    }

    public static final URL a(e eVar) {
        eVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        r6.b bVar = eVar.f6106a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.f5594a).appendPath("settings");
        r6.a aVar = bVar.f5595b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.f5586c).appendQueryParameter("display_version", aVar.f5585b).build().toString());
    }
}
