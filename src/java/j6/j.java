package j6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3262c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static f0 f3263d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3264a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3265b;

    public j(ExecutorService executorService) {
        this.f3265b = new r.j(0);
        this.f3264a = executorService;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static Task a(Context context, Intent intent, boolean z9) {
        f0 f0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f3262c) {
            try {
                if (f3263d == null) {
                    f3263d = new f0(context);
                }
                f0Var = f3263d;
            } finally {
            }
        }
        if (z9) {
            if (s.g().k(context)) {
                synchronized (c0.f3236b) {
                    try {
                        if (c0.f3237c == null) {
                            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                            c0.f3237c = wakeLock;
                            wakeLock.setReferenceCounted(true);
                        }
                        boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                        if (!booleanExtra) {
                            c0.f3237c.acquire(c0.f3235a);
                        }
                        f0Var.b(intent).addOnCompleteListener(new a5.a(intent, 11));
                    } finally {
                    }
                }
            } else {
                f0Var.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return f0Var.b(intent).continueWith((Executor) new Object(), new a5.t(21));
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f3264a;
        x1.d dVar = (x1.d) this.f3265b;
        boolean z9 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z9 || z10) ? Tasks.call(dVar, new h(0, context, intent)).continueWithTask(dVar, new Continuation() { // from class: j6.i
            /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
            public final Object then(Task task) {
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? j.a(context, intent, z10).continueWith((Executor) new Object(), new a5.t(20)) : task;
            }
        }) : a(context, intent, z10);
    }

    public j(Context context) {
        this.f3264a = context;
        this.f3265b = new Object();
    }

    public j(o oVar) {
        this.f3264a = oVar.A("gcm.n.title");
        oVar.x("gcm.n.title");
        Object[] w8 = oVar.w("gcm.n.title");
        if (w8 != null) {
            String[] strArr = new String[w8.length];
            for (int i = 0; i < w8.length; i++) {
                strArr[i] = String.valueOf(w8[i]);
            }
        }
        this.f3265b = oVar.A("gcm.n.body");
        oVar.x("gcm.n.body");
        Object[] w9 = oVar.w("gcm.n.body");
        if (w9 != null) {
            String[] strArr2 = new String[w9.length];
            for (int i9 = 0; i9 < w9.length; i9++) {
                strArr2[i9] = String.valueOf(w9[i9]);
            }
        }
        oVar.A("gcm.n.icon");
        if (TextUtils.isEmpty(oVar.A("gcm.n.sound2"))) {
            oVar.A("gcm.n.sound");
        }
        oVar.A("gcm.n.tag");
        oVar.A("gcm.n.color");
        oVar.A("gcm.n.click_action");
        oVar.A("gcm.n.android_channel_id");
        String A = oVar.A("gcm.n.link_android");
        A = TextUtils.isEmpty(A) ? oVar.A("gcm.n.link") : A;
        if (!TextUtils.isEmpty(A)) {
            Uri.parse(A);
        }
        oVar.A("gcm.n.image");
        oVar.A("gcm.n.ticker");
        oVar.t("gcm.n.notification_priority");
        oVar.t("gcm.n.visibility");
        oVar.t("gcm.n.notification_count");
        oVar.s("gcm.n.sticky");
        oVar.s("gcm.n.local_only");
        oVar.s("gcm.n.default_sound");
        oVar.s("gcm.n.default_vibrate_timings");
        oVar.s("gcm.n.default_light_settings");
        oVar.y();
        oVar.v();
        oVar.B();
    }
}
