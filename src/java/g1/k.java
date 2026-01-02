package g1;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q4.b f1657f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1658g;

    public k(q4.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        super(7);
        this.f1657f = bVar;
        this.f1658g = threadPoolExecutor;
    }

    @Override // q4.b
    public final void H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1658g;
        try {
            this.f1657f.H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // q4.b
    public final void K(j6.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1658g;
        try {
            this.f1657f.K(sVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
