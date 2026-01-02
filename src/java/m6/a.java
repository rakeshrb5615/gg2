package m6;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j6.s;
import java.util.Set;
import java.util.concurrent.Executor;
import n6.o;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4026a;

    public /* synthetic */ a(b bVar) {
        this.f4026a = bVar;
    }

    public Task then(Object obj) {
        Void r72 = (Void) obj;
        b bVar = this.f4026a;
        Task b10 = bVar.f4029c.b();
        Task b11 = bVar.f4030d.b();
        return Tasks.whenAllComplete(new Task[]{b10, b11}).continueWithTask(bVar.f4028b, new h5.a(bVar, b10, b11, 3));
    }

    public Object then(Task task) {
        boolean z9;
        b bVar = this.f4026a;
        bVar.getClass();
        if (task.isSuccessful()) {
            n6.d dVar = bVar.f4029c;
            synchronized (dVar) {
                dVar.f4902c = Tasks.forResult((Object) null);
            }
            o oVar = dVar.f4901b;
            synchronized (oVar) {
                oVar.f4967a.deleteFile(oVar.f4968b);
            }
            n6.f fVar = (n6.f) task.getResult();
            if (fVar != null) {
                JSONArray jSONArray = fVar.f4913d;
                r4.c cVar = bVar.f4027a;
                if (cVar != null) {
                    try {
                        cVar.c(b.c(jSONArray));
                    } catch (JSONException e9) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e9);
                    } catch (r4.a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    }
                }
                s sVar = bVar.i;
                try {
                    q6.d g3 = ((n0.a) sVar.f3283c).g(fVar);
                    for (d5.c cVar2 : (Set) sVar.f3285e) {
                        ((Executor) sVar.f3284d).execute(new o6.a(cVar2, g3, 0));
                    }
                } catch (d e11) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
