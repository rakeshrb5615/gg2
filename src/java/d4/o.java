package d4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o extends m {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1102c;

    public /* synthetic */ o(Object obj, int i) {
        this.f1101b = i;
        this.f1102c = obj;
    }

    @Override // d4.m
    public final void a() {
        switch (this.f1101b) {
            case 0:
                synchronized (((r) this.f1102c).f1113f) {
                    try {
                        if (((r) this.f1102c).f1116k.get() > 0 && ((r) this.f1102c).f1116k.decrementAndGet() > 0) {
                            ((r) this.f1102c).f1109b.h("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        r rVar = (r) this.f1102c;
                        if (rVar.f1118m != null) {
                            rVar.f1109b.h("Unbind from service.", new Object[0]);
                            r rVar2 = (r) this.f1102c;
                            rVar2.f1108a.unbindService(rVar2.f1117l);
                            r rVar3 = (r) this.f1102c;
                            rVar3.f1114g = false;
                            rVar3.f1118m = null;
                            rVar3.f1117l = null;
                        }
                        ((r) this.f1102c).d();
                        return;
                    } finally {
                    }
                }
            default:
                r rVar4 = (r) ((q) this.f1102c).f1106b;
                rVar4.f1109b.h("unlinkToDeath", new Object[0]);
                rVar4.f1118m.asBinder().unlinkToDeath(rVar4.j, 0);
                rVar4.f1118m = null;
                rVar4.f1114g = false;
                return;
        }
    }
}
