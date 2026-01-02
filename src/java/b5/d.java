package b5;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f730a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f731b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f732c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f733d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f734e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f735f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j8, TimeUnit timeUnit, int i) {
        this.f730a = i;
        this.f731b = gVar;
        this.f732c = runnable;
        this.f733d = j;
        this.f734e = j8;
        this.f735f = timeUnit;
    }

    @Override // b5.h
    public final ScheduledFuture a(l6.c cVar) {
        switch (this.f730a) {
            case 0:
                g gVar = this.f731b;
                return gVar.f744b.scheduleAtFixedRate(new e(gVar, this.f732c, cVar, 0), this.f733d, this.f734e, this.f735f);
            default:
                g gVar2 = this.f731b;
                return gVar2.f744b.scheduleWithFixedDelay(new e(gVar2, this.f732c, cVar, 2), this.f733d, this.f734e, this.f735f);
        }
    }
}
