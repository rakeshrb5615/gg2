package a8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f651a;

    public a(f fVar) {
        this.f651a = new AtomicReference(fVar);
    }

    @Override // a8.f
    public final Iterator iterator() {
        f fVar = (f) this.f651a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
