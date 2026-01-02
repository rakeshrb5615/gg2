package i4;

import d4.q;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g extends e {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2679b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2680c;

    public /* synthetic */ g(Object obj, int i) {
        this.f2679b = i;
        this.f2680c = obj;
    }

    @Override // i4.e
    public final void a() {
        switch (this.f2679b) {
            case 0:
                synchronized (((h) this.f2680c).f2687f) {
                    try {
                        if (((h) this.f2680c).f2690k.get() > 0 && ((h) this.f2680c).f2690k.decrementAndGet() > 0) {
                            ((h) this.f2680c).f2683b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        h hVar = (h) this.f2680c;
                        if (hVar.f2692m != null) {
                            hVar.f2683b.g("Unbind from service.", new Object[0]);
                            h hVar2 = (h) this.f2680c;
                            hVar2.f2682a.unbindService(hVar2.f2691l);
                            h hVar3 = (h) this.f2680c;
                            hVar3.f2688g = false;
                            hVar3.f2692m = null;
                            hVar3.f2691l = null;
                        }
                        ((h) this.f2680c).c();
                        return;
                    } finally {
                    }
                }
            default:
                h hVar4 = (h) ((q) this.f2680c).f1106b;
                hVar4.f2683b.g("unlinkToDeath", new Object[0]);
                hVar4.f2692m.asBinder().unlinkToDeath(hVar4.j, 0);
                hVar4.f2692m = null;
                hVar4.f2688g = false;
                return;
        }
    }
}
