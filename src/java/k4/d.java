package k4;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f3378o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f3379a;

    /* renamed from: b  reason: collision with root package name */
    public final z f3380b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3381c;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3385g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f3386h;
    public final c0 i;

    /* renamed from: m  reason: collision with root package name */
    public d4.q f3389m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f3390n;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f3382d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f3383e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f3384f = new Object();

    /* renamed from: k  reason: collision with root package name */
    public final d4.n f3387k = new d4.n(this, 2);

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f3388l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    public d(Context context, z zVar, String str, Intent intent, c0 c0Var) {
        this.f3379a = context;
        this.f3380b = zVar;
        this.f3381c = str;
        this.f3386h = intent;
        this.i = c0Var;
    }

    public static void b(d dVar, a0 a0Var) {
        IInterface iInterface = dVar.f3390n;
        z zVar = dVar.f3380b;
        ArrayList arrayList = dVar.f3382d;
        int i = 0;
        if (iInterface != null || dVar.f3385g) {
            if (!dVar.f3385g) {
                a0Var.run();
                return;
            }
            zVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(a0Var);
            return;
        }
        zVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(a0Var);
        d4.q qVar = new d4.q(dVar, 2);
        dVar.f3389m = qVar;
        dVar.f3385g = true;
        if (dVar.f3379a.bindService(dVar.f3386h, qVar, 1)) {
            return;
        }
        zVar.b("Failed to bind to the service.", new Object[0]);
        dVar.f3385g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a0) obj).a(new RuntimeException("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f3378o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f3381c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f3381c, 10);
                    handlerThread.start();
                    hashMap.put(this.f3381c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f3381c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(a0 a0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new b0(this, a0Var.c(), taskCompletionSource, a0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f3384f) {
            this.f3383e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f3383e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f3381c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
