package i4;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.l;
import d4.n;
import d4.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f2681n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2682a;

    /* renamed from: b  reason: collision with root package name */
    public final l f2683b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2688g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f2689h;

    /* renamed from: l  reason: collision with root package name */
    public q f2691l;

    /* renamed from: m  reason: collision with root package name */
    public d f2692m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2685d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f2686e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f2687f = new Object();
    public final n j = new n(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f2690k = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f2684c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public h(Context context, l lVar, Intent intent) {
        this.f2682a = context;
        this.f2683b = lVar;
        this.f2689h = intent;
    }

    public static void b(h hVar, h4.d dVar) {
        d dVar2 = hVar.f2692m;
        l lVar = hVar.f2683b;
        ArrayList arrayList = hVar.f2685d;
        int i = 0;
        if (dVar2 != null || hVar.f2688g) {
            if (!hVar.f2688g) {
                dVar.run();
                return;
            }
            lVar.g("Waiting to bind to the service.", new Object[0]);
            arrayList.add(dVar);
            return;
        }
        lVar.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(dVar);
        q qVar = new q(hVar, 1);
        hVar.f2691l = qVar;
        hVar.f2688g = true;
        if (hVar.f2682a.bindService(hVar.f2689h, qVar, 1)) {
            return;
        }
        lVar.g("Failed to bind to the service.", new Object[0]);
        hVar.f2688g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RuntimeException runtimeException = new RuntimeException("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((e) obj).f2675a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(runtimeException);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f2681n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f2684c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f2684c, 10);
                    handlerThread.start();
                    hashMap.put(this.f2684c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f2684c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f2686e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f2684c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
