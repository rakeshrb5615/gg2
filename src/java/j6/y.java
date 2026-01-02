package j6;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f3301a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f3302b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3303c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h3.k f3304d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a5.z f3305e;

    public /* synthetic */ y(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, h3.k kVar, a5.z zVar) {
        this.f3301a = context;
        this.f3302b = scheduledThreadPoolExecutor;
        this.f3303c = firebaseMessaging;
        this.f3304d = kVar;
        this.f3305e = zVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [j6.x, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        x xVar;
        Context context = this.f3301a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f3302b;
        FirebaseMessaging firebaseMessaging = this.f3303c;
        h3.k kVar = this.f3304d;
        a5.z zVar = this.f3305e;
        synchronized (x.class) {
            try {
                WeakReference weakReference = x.f3299b;
                xVar = weakReference != null ? (x) weakReference.get() : null;
                if (xVar == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    ?? obj = new Object();
                    synchronized (obj) {
                        obj.f3300a = a2.b.c(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    x.f3299b = new WeakReference(obj);
                    xVar = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new z(firebaseMessaging, kVar, xVar, zVar, context, scheduledThreadPoolExecutor);
    }
}
