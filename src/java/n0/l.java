package n0;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import q0.c1;
import q0.x0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4404a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f4405b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4406c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4407d;

    public /* synthetic */ l() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        g5.b bVar;
        switch (this.f4404a) {
            case 0:
                try {
                    obj = ((e) this.f4405b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f4407d).post(new b5.l(8, (f) this.f4406c, obj));
                return;
            case 1:
                n5.c cVar = (n5.c) this.f4407d;
                cVar.b((g5.b) this.f4405b, (TaskCompletionSource) this.f4406c);
                ((AtomicInteger) cVar.i.f3364c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.f4874b, cVar.a()) * (60000.0d / cVar.f4873a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.f1774b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            default:
                x0.h((View) this.f4405b, (a) this.f4406c);
                ((ValueAnimator) this.f4407d).start();
                return;
        }
    }

    public l(n5.c cVar, g5.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f4407d = cVar;
        this.f4405b = bVar;
        this.f4406c = taskCompletionSource;
    }

    public l(View view, c1 c1Var, a aVar, ValueAnimator valueAnimator) {
        this.f4405b = view;
        this.f4406c = aVar;
        this.f4407d = valueAnimator;
    }
}
