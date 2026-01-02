package j6;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d0 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    public final l6.c f3240a;

    public d0(l6.c cVar) {
        this.f3240a = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(e0 e0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = e0Var.f3242a;
        g gVar = (g) this.f3240a.f3791b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.f3251a.execute(new androidx.fragment.app.l(gVar, intent, taskCompletionSource, 4));
        taskCompletionSource.getTask().addOnCompleteListener((Executor) new Object(), new a5.a(e0Var, 12));
    }
}
