package z4;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zze;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final i f7365a;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, z4.i] */
    public s(q4.f fVar) {
        fVar.a();
        Context context = fVar.f5386a;
        ?? obj = new Object();
        i.f7350e.v("Initializing TokenRefresher", new Object[0]);
        q4.f fVar2 = (q4.f) Preconditions.checkNotNull(fVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        obj.f7353c = new zze(handlerThread.getLooper());
        fVar2.a();
        obj.f7354d = new b5.l((i) obj, fVar2.f5387b);
        this.f7365a = obj;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new u(this));
    }
}
