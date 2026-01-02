package d0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f1013a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f1014b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1015c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1016d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1017e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f1018f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f1019g;

    public j(int i, String str, PendingIntent pendingIntent) {
        IconCompat a10 = i == 0 ? null : IconCompat.a(i);
        Bundle bundle = new Bundle();
        this.f1016d = true;
        this.f1014b = a10;
        if (a10 != null && a10.c() == 2) {
            this.f1017e = a10.b();
        }
        this.f1018f = p.b(str);
        this.f1019g = pendingIntent;
        this.f1013a = bundle;
        this.f1015c = true;
        this.f1016d = true;
    }
}
