package a5;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class s implements c6.b {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set f607a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Set f608b;

    @Override // c6.b
    public final Object get() {
        if (this.f608b == null) {
            synchronized (this) {
                try {
                    if (this.f608b == null) {
                        this.f608b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            for (c6.b bVar : this.f607a) {
                                this.f608b.add(bVar.get());
                            }
                            this.f607a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f608b);
    }
}
