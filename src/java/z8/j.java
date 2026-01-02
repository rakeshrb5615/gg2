package z8;

import java.util.concurrent.CompletableFuture;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class j extends CompletableFuture {

    /* renamed from: a  reason: collision with root package name */
    public final z f7500a;

    public j(z zVar) {
        this.f7500a = zVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        if (z9) {
            this.f7500a.cancel();
        }
        return super.cancel(z9);
    }
}
