package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.loader.content.f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final Object f4978f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Handler f4979g;

    public b() {
        super(20);
        this.f4978f = new Object();
        Executors.newFixedThreadPool(4, new f(1));
    }

    public static Handler V(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e0.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
