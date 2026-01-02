package j6;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference f3299b;

    /* renamed from: a  reason: collision with root package name */
    public a2.b f3300a;

    public final synchronized w a() {
        String str;
        w wVar;
        a2.b bVar = this.f3300a;
        synchronized (((ArrayDeque) bVar.f266e)) {
            str = (String) ((ArrayDeque) bVar.f266e).peek();
        }
        Pattern pattern = w.f3295d;
        wVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                wVar = new w(split[0], split[1]);
            }
        }
        return wVar;
    }
}
