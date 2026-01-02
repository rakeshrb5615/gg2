package h5;

import a5.t;
import a5.u;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import j6.o;
import j6.s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.l;
import r2.i;
import r2.j;
import y2.h;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class a implements Continuation, OnCompleteListener, SuccessContinuation, OnSuccessListener, z2.b, y2.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2209c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2210d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f2207a = i;
        this.f2208b = obj;
        this.f2209c = obj2;
        this.f2210d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, r2.h] */
    @Override // y2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override // z2.b
    public Object b() {
        w2.a aVar = (w2.a) this.f2208b;
        j jVar = (j) this.f2209c;
        i iVar = (i) this.f2210d;
        h hVar = (h) aVar.f6430d;
        hVar.getClass();
        o2.d dVar = jVar.f5538c;
        String str = iVar.f5528a;
        String str2 = jVar.f5536a;
        String concat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar.i(new a(hVar, iVar, jVar, 7))).getClass();
        aVar.f6427a.s(jVar, 1, false);
        return null;
    }

    public void onComplete(Task task) {
        Task task2;
        k2.c cVar = (k2.c) this.f2208b;
        Activity activity = (Activity) this.f2209c;
        Context context = (Context) this.f2210d;
        if (!task.isSuccessful()) {
            c4.b.F(context);
            return;
        }
        h4.b bVar = (h4.b) ((h4.a) task.getResult());
        if (bVar.f2195b) {
            task2 = Tasks.forResult((Object) null);
        } else {
            Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", bVar.f2194a);
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            intent.putExtra("result_receiver", new h4.c((Handler) cVar.f3364c, taskCompletionSource));
            activity.startActivity(intent);
            task2 = taskCompletionSource.getTask();
        }
        task2.addOnCompleteListener(new t(17));
    }

    public void onSuccess(Object obj) {
        s sVar = (s) this.f2208b;
        Task task = (Task) this.f2209c;
        d5.c cVar = (d5.c) this.f2210d;
        n6.f fVar = (n6.f) obj;
        try {
            n6.f fVar2 = (n6.f) task.getResult();
            if (fVar2 != null) {
                ((Executor) sVar.f3284d).execute(new o6.a(cVar, ((n0.a) sVar.f3283c).g(fVar2), 1));
            }
        } catch (m6.d e9) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e9);
        }
    }

    public Object then(Task task) {
        n6.f fVar;
        URL url;
        switch (this.f2207a) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2208b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2209c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f2210d;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult((Object) null);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                m6.b bVar = (m6.b) this.f2208b;
                Task task2 = (Task) this.f2209c;
                Task task3 = (Task) this.f2210d;
                bVar.getClass();
                if (task2.isSuccessful() && task2.getResult() != null) {
                    n6.f fVar2 = (n6.f) task2.getResult();
                    if (task3.isSuccessful() && (fVar = (n6.f) task3.getResult()) != null && fVar2.f4912c.equals(fVar.f4912c)) {
                        return Tasks.forResult(Boolean.FALSE);
                    }
                    n6.d dVar = bVar.f4030d;
                    Executor executor = dVar.f4900a;
                    return Tasks.call(executor, new j6.h(2, dVar, fVar2)).onSuccessTask(executor, new u(5, dVar, fVar2)).continueWith(bVar.f4028b, new m6.a(bVar));
                }
                return Tasks.forResult(Boolean.FALSE);
            default:
                l lVar = (l) this.f2208b;
                Task task4 = (Task) this.f2209c;
                Task task5 = (Task) this.f2210d;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new q4.h("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new q4.h("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(lVar.c(lVar.f4954n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    lVar.i(httpURLConnection, (String) task5.getResult(), ((d6.a) task4.getResult()).f1128a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e9) {
                    return Tasks.forException(new q4.h("Failed to open HTTP stream connection", e9));
                }
        }
    }

    public Task then(Object obj) {
        String f9;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2208b;
        String str = (String) this.f2209c;
        j6.t tVar = (j6.t) this.f2210d;
        String str2 = (String) obj;
        o c9 = FirebaseMessaging.c(firebaseMessaging.b);
        q4.f fVar = firebaseMessaging.a;
        fVar.a();
        if ("[DEFAULT]".equals(fVar.f5387b)) {
            f9 = "";
        } else {
            f9 = fVar.f();
        }
        String a10 = firebaseMessaging.h.a();
        synchronized (c9) {
            String a11 = j6.t.a(str2, a10, System.currentTimeMillis());
            if (a11 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c9.f3275b).edit();
                edit.putString(f9 + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f3287a)) {
            q4.f fVar2 = firebaseMessaging.a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f5387b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    fVar2.a();
                    sb.append(fVar2.f5387b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new j6.j(firebaseMessaging.b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
