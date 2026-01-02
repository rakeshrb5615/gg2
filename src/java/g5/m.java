package g5;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f1803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f1804b;

    public m(n nVar, long j) {
        this.f1804b = nVar;
        this.f1803a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f1803a);
        this.f1804b.f1815k.g(bundle);
        return null;
    }
}
