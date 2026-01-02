package f1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import h.k;
import java.util.Random;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1363a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1364b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f1363a) {
            case 0:
                ((Runnable) this.f1364b).run();
                return;
            default:
                Context context = (Context) this.f1364b;
                (Build.VERSION.SDK_INT >= 28 ? y1.d.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new k(context, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
