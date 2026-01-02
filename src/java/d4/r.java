package d4;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class r {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f1107n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f1108a;

    /* renamed from: b  reason: collision with root package name */
    public final l f1109b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1114g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f1115h;

    /* renamed from: l  reason: collision with root package name */
    public q f1117l;

    /* renamed from: m  reason: collision with root package name */
    public h f1118m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1111d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f1112e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f1113f = new Object();
    public final n j = new n(this, 0);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f1116k = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f1110c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public r(Context context, l lVar, Intent intent) {
        this.f1108a = context;
        this.f1109b = lVar;
        this.f1115h = intent;
    }

    public static void b(r rVar, m mVar) {
        h hVar = rVar.f1118m;
        l lVar = rVar.f1109b;
        ArrayList arrayList = rVar.f1111d;
        int i = 0;
        if (hVar != null || rVar.f1114g) {
            if (!rVar.f1114g) {
                mVar.run();
                return;
            }
            lVar.h("Waiting to bind to the service.", new Object[0]);
            arrayList.add(mVar);
            return;
        }
        lVar.h("Initiate binding to the service.", new Object[0]);
        arrayList.add(mVar);
        q qVar = new q(rVar, 0);
        rVar.f1117l = qVar;
        rVar.f1114g = true;
        if (rVar.f1108a.bindService(rVar.f1115h, qVar, 1)) {
            return;
        }
        lVar.h("Failed to bind to the service.", new Object[0]);
        rVar.f1114g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RuntimeException runtimeException = new RuntimeException("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((m) obj).f1098a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(runtimeException);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f1107n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f1110c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1110c, 10);
                    handlerThread.start();
                    hashMap.put(this.f1110c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f1110c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f1113f) {
            this.f1112e.remove(taskCompletionSource);
        }
        a().post(new o(this, 0));
    }

    public final void d() {
        HashSet hashSet = this.f1112e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f1110c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
