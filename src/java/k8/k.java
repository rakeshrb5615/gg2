package k8;

import i8.t;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3460a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f3461b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3462c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3463d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f3464e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f3465f;

    static {
        String str;
        int i = t.f2801a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3460a = str;
        f3461b = i8.a.i(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i9 = t.f2801a;
        if (i9 < 2) {
            i9 = 2;
        }
        f3462c = i8.a.j(i9, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f3463d = i8.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f3464e = TimeUnit.SECONDS.toNanos(i8.a.i(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f3465f = g.f3455a;
    }
}
