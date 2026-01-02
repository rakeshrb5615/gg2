package h;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class w {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, c0 c0Var) {
        Objects.requireNonNull(c0Var);
        v vVar = new v(c0Var, 0);
        a5.t.d(obj).registerOnBackInvokedCallback(1000000, vVar);
        return vVar;
    }

    public static void c(Object obj, Object obj2) {
        a5.t.d(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
