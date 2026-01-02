package j6;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class z {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3306a;

    /* renamed from: b  reason: collision with root package name */
    public final h3.k f3307b;

    /* renamed from: c  reason: collision with root package name */
    public final a5.z f3308c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f3309d;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3311f;

    /* renamed from: h  reason: collision with root package name */
    public final x f3313h;

    /* renamed from: e  reason: collision with root package name */
    public final r.e f3310e = new r.j(0);

    /* renamed from: g  reason: collision with root package name */
    public boolean f3312g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [r.e, r.j] */
    public z(FirebaseMessaging firebaseMessaging, h3.k kVar, x xVar, a5.z zVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f3309d = firebaseMessaging;
        this.f3307b = kVar;
        this.f3313h = xVar;
        this.f3308c = zVar;
        this.f3306a = context;
        this.f3311f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e9) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e9);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) {
        String a10 = this.f3309d.a();
        a5.z zVar = this.f3308c;
        zVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(zVar.o(zVar.v(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a10 = this.f3309d.a();
        a5.z zVar = this.f3308c;
        zVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(zVar.o(zVar.v(a10, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z9) {
        this.f3312g = z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.z.e():boolean");
    }

    public final void f(long j8) {
        this.f3311f.schedule(new b0(this, this.f3306a, this.f3307b, Math.min(Math.max(30L, 2 * j8), i)), j8, TimeUnit.SECONDS);
        d(true);
    }
}
