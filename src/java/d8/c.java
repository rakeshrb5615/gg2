package d8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends i1 {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1164n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e  reason: collision with root package name */
    public final n f1165e;

    /* renamed from: f  reason: collision with root package name */
    public p0 f1166f;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e f1167m;

    public c(e eVar, n nVar) {
        this.f1167m = eVar;
        this.f1165e = nVar;
    }

    @Override // d8.i1
    public final boolean j() {
        return false;
    }

    @Override // d8.i1
    public final void k(Throwable th) {
        n nVar = this.f1165e;
        if (th != null) {
            nVar.getClass();
            d4.l D = nVar.D(new w(false, th), null);
            if (D != null) {
                nVar.e(D);
                d dVar = (d) f1164n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f1177b;
        e eVar = this.f1167m;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f1178a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.getCompleted());
            }
            nVar.resumeWith(arrayList);
        }
    }
}
