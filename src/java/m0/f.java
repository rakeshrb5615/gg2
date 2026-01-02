package m0;

import android.os.Handler;
import android.os.Looper;
import b5.k;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3946a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3947b;

    public /* synthetic */ f(Object obj, int i) {
        this.f3946a = i;
        this.f3947b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3946a) {
            case 0:
                Handler handler = (Handler) this.f3947b;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                Handler handler2 = (Handler) this.f3947b;
                runnable.getClass();
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            case 2:
                ((Handler) this.f3947b).post(runnable);
                return;
            default:
                ((Executor) this.f3947b).execute(new k(runnable, 1));
                return;
        }
    }

    public f() {
        this.f3946a = 2;
        this.f3947b = new Handler(Looper.getMainLooper());
    }
}
