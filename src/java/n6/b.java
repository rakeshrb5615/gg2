package n6;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f4888b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f4889c;

    public b(c cVar, int i, long j) {
        this.f4889c = cVar;
        this.f4887a = i;
        this.f4888b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f4889c;
        int i = this.f4887a;
        final long j = this.f4888b;
        synchronized (cVar) {
            final int i9 = i - 1;
            final Task c9 = cVar.f4892c.c(3 - i9);
            final Task b10 = cVar.f4893d.b();
            Tasks.whenAllComplete(new Task[]{c9, b10}).continueWithTask(cVar.f4895f, new Continuation() { // from class: n6.a
                public final Object then(Task task) {
                    c cVar2 = c.this;
                    Task task2 = c9;
                    Task task3 = b10;
                    long j8 = j;
                    int i10 = i9;
                    if (task2.isSuccessful()) {
                        if (task3.isSuccessful()) {
                            h hVar = (h) task2.getResult();
                            f fVar = (f) task3.getResult();
                            f fVar2 = hVar.f4923b;
                            if (!(fVar2 != null ? Boolean.valueOf(fVar2.f4915f >= j8) : Boolean.valueOf(hVar.f4922a == 1)).booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                cVar2.a(i10, j8);
                                return Tasks.forResult((Object) null);
                            } else if (hVar.f4923b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return Tasks.forResult((Object) null);
                            } else {
                                if (fVar == null) {
                                    e c10 = f.c();
                                    fVar = new f(c10.f4903a, c10.f4904b, c10.f4905c, c10.f4906d, c10.f4907e, c10.f4908f);
                                }
                                f fVar3 = hVar.f4923b;
                                JSONObject jSONObject = fVar.f4914e;
                                JSONObject jSONObject2 = fVar3.f4910a;
                                JSONObject jSONObject3 = fVar3.f4911b;
                                JSONObject jSONObject4 = fVar3.f4914e;
                                JSONObject jSONObject5 = f.a(new JSONObject(jSONObject2.toString())).f4911b;
                                HashMap b11 = fVar.b();
                                HashMap b12 = fVar3.b();
                                HashSet hashSet = new HashSet();
                                JSONObject jSONObject6 = fVar.f4911b;
                                Iterator<String> keys = jSONObject6.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    if (!jSONObject3.has(next)) {
                                        hashSet.add(next);
                                    } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                        hashSet.add(next);
                                    } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                        hashSet.add(next);
                                    } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                        hashSet.add(next);
                                    } else if (b11.containsKey(next) != b12.containsKey(next)) {
                                        hashSet.add(next);
                                    } else if (b11.containsKey(next) && b12.containsKey(next) && !((Map) b11.get(next)).equals(b12.get(next))) {
                                        hashSet.add(next);
                                    } else {
                                        jSONObject5.remove(next);
                                    }
                                }
                                Iterator<String> keys2 = jSONObject5.keys();
                                while (keys2.hasNext()) {
                                    hashSet.add(keys2.next());
                                }
                                if (hashSet.isEmpty()) {
                                    Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                    return Tasks.forResult((Object) null);
                                }
                                synchronized (cVar2) {
                                    for (k kVar : cVar2.f4890a) {
                                        kVar.getClass();
                                    }
                                }
                                return Tasks.forResult((Object) null);
                            }
                        }
                        return Tasks.forException(new q4.h("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    return Tasks.forException(new q4.h("Failed to auto-fetch config update.", task2.getException()));
                }
            });
        }
    }
}
