package k4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends a0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3376m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f3377n;

    public /* synthetic */ c(Object obj, int i) {
        this.f3376m = i;
        this.f3377n = obj;
    }

    @Override // k4.a0
    public final void b() {
        switch (this.f3376m) {
            case 0:
                d dVar = (d) ((d4.q) this.f3377n).f1106b;
                dVar.f3380b.b("unlinkToDeath", new Object[0]);
                dVar.f3390n.asBinder().unlinkToDeath(dVar.f3387k, 0);
                dVar.f3390n = null;
                dVar.f3385g = false;
                return;
            default:
                synchronized (((d) this.f3377n).f3384f) {
                    try {
                        if (((d) this.f3377n).f3388l.get() > 0 && ((d) this.f3377n).f3388l.decrementAndGet() > 0) {
                            ((d) this.f3377n).f3380b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f3377n;
                        if (dVar2.f3390n != null) {
                            dVar2.f3380b.b("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f3377n;
                            dVar3.f3379a.unbindService(dVar3.f3389m);
                            d dVar4 = (d) this.f3377n;
                            dVar4.f3385g = false;
                            dVar4.f3390n = null;
                            dVar4.f3389m = null;
                        }
                        ((d) this.f3377n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
