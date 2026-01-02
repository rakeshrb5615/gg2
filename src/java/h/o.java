package h;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ o f2094b = new o(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2095a;

    public /* synthetic */ o(int i) {
        this.f2095a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2095a) {
            case 0:
                new Thread(runnable).start();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
