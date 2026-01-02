package h5;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final e f2216d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final c f2217a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2218b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2219c;

    public f(ExecutorService executorService, ExecutorService executorService2) {
        j.e(executorService, "backgroundExecutorService");
        j.e(executorService2, "blockingExecutorService");
        this.f2217a = new c(executorService);
        this.f2218b = new c(executorService);
        Tasks.forResult((Object) null);
        this.f2219c = new c(executorService2);
    }

    public static final void a() {
        if (((Boolean) new d(0, f2216d, e.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new d(0, f2216d, e.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
