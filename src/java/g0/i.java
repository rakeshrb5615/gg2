package g0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f1623a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f1624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1625c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1623a = colorStateList;
        this.f1624b = configuration;
        this.f1625c = theme == null ? 0 : theme.hashCode();
    }
}
