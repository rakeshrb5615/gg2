package m6;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f4038a = new AtomicReference();

    public final void onBackgroundStateChanged(boolean z9) {
        Clock clock = j.j;
        synchronized (j.class) {
            for (b bVar : j.f4040l.values()) {
                bVar.b(z9);
            }
        }
    }
}
