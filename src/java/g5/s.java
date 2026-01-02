package g5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1831a;

    /* renamed from: b  reason: collision with root package name */
    public final v f1832b;

    /* renamed from: c  reason: collision with root package name */
    public final k2.c f1833c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1834d;

    /* renamed from: e  reason: collision with root package name */
    public k2.c f1835e;

    /* renamed from: f  reason: collision with root package name */
    public k2.c f1836f;

    /* renamed from: g  reason: collision with root package name */
    public n f1837g;

    /* renamed from: h  reason: collision with root package name */
    public final y f1838h;
    public final m5.c i;
    public final c5.a j;

    /* renamed from: k  reason: collision with root package name */
    public final c5.a f1839k;

    /* renamed from: l  reason: collision with root package name */
    public final k f1840l;

    /* renamed from: m  reason: collision with root package name */
    public final d5.b f1841m;

    /* renamed from: n  reason: collision with root package name */
    public final l6.c f1842n;

    /* renamed from: o  reason: collision with root package name */
    public final h5.f f1843o;

    public s(q4.f fVar, y yVar, d5.b bVar, v vVar, c5.a aVar, c5.a aVar2, m5.c cVar, k kVar, l6.c cVar2, h5.f fVar2) {
        this.f1832b = vVar;
        fVar.a();
        this.f1831a = fVar.f5386a;
        this.f1838h = yVar;
        this.f1841m = bVar;
        this.j = aVar;
        this.f1839k = aVar2;
        this.i = cVar;
        this.f1840l = kVar;
        this.f1842n = cVar2;
        this.f1843o = fVar2;
        this.f1834d = System.currentTimeMillis();
        this.f1833c = new k2.c(17);
    }

    public final void a(o5.d dVar) {
        h5.f.a();
        h5.f.a();
        this.f1835e.k();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.b(new q(this));
                this.f1837g.f();
                if (!dVar.b().f5016b.f5011a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f1837g.d(dVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f1837g.g(((TaskCompletionSource) ((AtomicReference) dVar.i).get()).getTask());
                c();
            } catch (Exception e9) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e9);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(o5.d dVar) {
        Future<?> submit = this.f1843o.f2217a.f2212a.submit(new o(this, dVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e9);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        h5.f.a();
        try {
            k2.c cVar = this.f1835e;
            m5.c cVar2 = (m5.c) cVar.f3364c;
            cVar2.getClass();
            if (new File((File) cVar2.f4021d, (String) cVar.f3363b).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e9) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e9);
        }
    }
}
