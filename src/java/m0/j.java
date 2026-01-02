package m0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import f2.b0;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f3952a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f3953b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3952a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3953b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e9) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e9);
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b0.g();
        }
        try {
            return ((Boolean) f3953b.invoke(null, Long.valueOf(f3952a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
