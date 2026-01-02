package g1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class p implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1665a;

    /* renamed from: b  reason: collision with root package name */
    public final n0.d f1666b;

    /* renamed from: c  reason: collision with root package name */
    public final c5.c f1667c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1668d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler f1669e;

    /* renamed from: f  reason: collision with root package name */
    public ThreadPoolExecutor f1670f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadPoolExecutor f1671g;

    /* renamed from: h  reason: collision with root package name */
    public q4.b f1672h;

    public p(Context context, n0.d dVar) {
        p0.e.d(context, "Context cannot be null");
        this.f1665a = context.getApplicationContext();
        this.f1666b = dVar;
        this.f1667c = q.f1673d;
    }

    @Override // g1.h
    public final void a(q4.b bVar) {
        synchronized (this.f1668d) {
            this.f1672h = bVar;
        }
        synchronized (this.f1668d) {
            try {
                if (this.f1672h == null) {
                    return;
                }
                if (this.f1670f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1671g = threadPoolExecutor;
                    this.f1670f = threadPoolExecutor;
                }
                this.f1670f.execute(new g0(this, 5));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f1668d) {
            try {
                this.f1672h = null;
                Handler handler = this.f1669e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1669e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1671g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1670f = null;
                this.f1671g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n0.i c() {
        try {
            c5.c cVar = this.f1667c;
            Context context = this.f1665a;
            n0.d dVar = this.f1666b;
            cVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            h.f a10 = n0.c.a(context, Collections.unmodifiableList(arrayList));
            int i = a10.f2040b;
            if (i == 0) {
                n0.i[] iVarArr = (n0.i[]) ((List) a10.f2041c).get(0);
                if (iVarArr == null || iVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return iVarArr[0];
            }
            throw new RuntimeException(v1.a.j("fetchFonts failed (", i, ")"));
        } catch (PackageManager.NameNotFoundException e9) {
            throw new RuntimeException("provider not found", e9);
        }
    }
}
