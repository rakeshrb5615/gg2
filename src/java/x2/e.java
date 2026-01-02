package x2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import r2.j;
import y2.h;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o5.d f6551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f6552b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6553c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f6554d;

    public /* synthetic */ e(o5.d dVar, j jVar, int i, Runnable runnable) {
        this.f6551a = dVar;
        this.f6552b = jVar;
        this.f6553c = i;
        this.f6554d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final j jVar = this.f6552b;
        final int i = this.f6553c;
        Runnable runnable = this.f6554d;
        final o5.d dVar = this.f6551a;
        z2.c cVar = (z2.c) dVar.f5026f;
        try {
            try {
                y2.d dVar2 = (y2.d) dVar.f5023c;
                Objects.requireNonNull(dVar2);
                ((h) cVar).y(new a5.a(dVar2, 23));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) dVar.f5021a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((h) cVar).y(new z2.b() { // from class: x2.f
                        @Override // z2.b
                        public final Object b() {
                            ((b8.g) o5.d.this.f5024d).s(jVar, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    dVar.c(jVar, i);
                }
                runnable.run();
            } catch (z2.a unused) {
                ((b8.g) dVar.f5024d).s(jVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
