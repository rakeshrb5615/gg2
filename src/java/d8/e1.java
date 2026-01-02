package d8;

import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public interface e1 extends l7.f {
    q attachChild(s sVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    a8.f getChildren();

    p0 invokeOnCompletion(u7.l lVar);

    p0 invokeOnCompletion(boolean z9, boolean z10, u7.l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(l7.c cVar);

    boolean start();
}
