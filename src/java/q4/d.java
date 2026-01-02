package q4;

import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f5381a = new AtomicReference();

    public final void onBackgroundStateChanged(boolean z9) {
        synchronized (f.f5384k) {
            try {
                ArrayList arrayList = new ArrayList(f.f5385l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    f fVar = (f) obj;
                    if (fVar.f5390e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.i.iterator();
                        while (it.hasNext()) {
                            f fVar2 = ((c) it.next()).f5380a;
                            if (!z9) {
                                ((a6.d) fVar2.f5393h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
