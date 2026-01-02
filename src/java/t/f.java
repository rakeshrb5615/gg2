package t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f extends q4.b {
    @Override // q4.b
    public final void M(g gVar, g gVar2) {
        gVar.f5910b = gVar2;
    }

    @Override // q4.b
    public final void N(g gVar, Thread thread) {
        gVar.f5909a = thread;
    }

    @Override // q4.b
    public final boolean b(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5916b == dVar) {
                    hVar.f5916b = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q4.b
    public final boolean c(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f5915a == obj) {
                    hVar.f5915a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q4.b
    public final boolean d(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5917c == gVar) {
                    hVar.f5917c = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
