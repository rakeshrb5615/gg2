package c4;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.r;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class h extends d4.m {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f913b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f914c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f915d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i) {
        super(taskCompletionSource);
        this.f913b = i;
        this.f916e = obj;
        this.f914c = taskCompletionSource2;
        this.f915d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [c4.j, c4.i] */
    @Override // d4.m
    public final void a() {
        switch (this.f913b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f914c;
                l lVar = (l) this.f916e;
                String str = (String) this.f915d;
                try {
                    lVar.f923a.f1118m.c(lVar.f924b, l.a(lVar, str), new k(lVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e9) {
                    l.f921e.f(e9, "requestUpdateInfo(%s)", str);
                    taskCompletionSource.trySetException(new RuntimeException(e9));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.f914c;
                l lVar2 = (l) this.f916e;
                try {
                    lVar2.f923a.f1118m.b(lVar2.f924b, l.b(), new i(lVar2, new d4.l("OnCompleteUpdateCallback", 0), taskCompletionSource2));
                    return;
                } catch (RemoteException e10) {
                    l.f921e.f(e10, "completeUpdate(%s)", (String) this.f915d);
                    taskCompletionSource2.trySetException(new RuntimeException(e10));
                    return;
                }
            default:
                synchronized (((r) this.f916e).f1113f) {
                    try {
                        r rVar = (r) this.f916e;
                        TaskCompletionSource taskCompletionSource3 = this.f914c;
                        rVar.f1112e.add(taskCompletionSource3);
                        taskCompletionSource3.getTask().addOnCompleteListener(new k2.c(7, rVar, taskCompletionSource3));
                        if (((r) this.f916e).f1116k.getAndIncrement() > 0) {
                            ((r) this.f916e).f1109b.h("Already connected to the service.", new Object[0]);
                        }
                        r.b((r) this.f916e, (d4.m) this.f915d);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f913b = 0;
        this.f916e = lVar;
        this.f915d = str;
        this.f914c = taskCompletionSource2;
    }
}
