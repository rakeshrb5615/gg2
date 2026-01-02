package b5;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f737b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f738c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l6.c f739d;

    public /* synthetic */ e(g gVar, Runnable runnable, l6.c cVar, int i) {
        this.f736a = i;
        this.f737b = gVar;
        this.f738c = runnable;
        this.f739d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f736a) {
            case 0:
                ExecutorService executorService = this.f737b.f743a;
                final Runnable runnable = this.f738c;
                final l6.c cVar = this.f739d;
                executorService.execute(new Runnable() { // from class: b5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((i) cVar.f3791b).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar.f3791b).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) cVar.f3791b;
                                try {
                                    runnable2.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f737b.f743a;
                final Runnable runnable2 = this.f738c;
                final l6.c cVar2 = this.f739d;
                executorService2.execute(new Runnable() { // from class: b5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((i) cVar2.f3791b).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar2.f3791b).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) cVar2.f3791b;
                                try {
                                    runnable22.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f737b.f743a;
                final Runnable runnable3 = this.f738c;
                final l6.c cVar3 = this.f739d;
                executorService3.execute(new Runnable() { // from class: b5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((i) cVar3.f3791b).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar3.f3791b).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) cVar3.f3791b;
                                try {
                                    runnable22.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
