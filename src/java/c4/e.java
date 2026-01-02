package c4;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import i2.e0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final l f908a;

    /* renamed from: b  reason: collision with root package name */
    public final c f909b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f910c;

    public e(l lVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f908a = lVar;
        this.f909b = cVar;
        this.f910c = context;
    }

    public final synchronized void a(e0 e0Var) {
        c cVar = this.f909b;
        synchronized (cVar) {
            cVar.f901a.h("unregisterListener", new Object[0]);
            if (e0Var == null) {
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
            cVar.f904d.remove(e0Var);
            cVar.a();
        }
    }
}
