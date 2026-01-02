package c1;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f863a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f864b;

    public f(SharedPreferences sharedPreferences, Set set) {
        j.e(sharedPreferences, "prefs");
        this.f863a = sharedPreferences;
        this.f864b = set;
    }
}
