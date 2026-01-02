package d8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class g1 extends r1 {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1() {
        super(true);
        boolean z9 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f1242b;
        q qVar = (q) atomicReferenceFieldUpdater.get(this);
        r rVar = qVar instanceof r ? (r) qVar : null;
        if (rVar != null) {
            r1 i = rVar.i();
            while (!i.s()) {
                q qVar2 = (q) atomicReferenceFieldUpdater.get(i);
                r rVar2 = qVar2 instanceof r ? (r) qVar2 : null;
                if (rVar2 != null) {
                    i = rVar2.i();
                }
            }
            this.f1198c = z9;
        }
        z9 = false;
        this.f1198c = z9;
    }

    @Override // d8.r1
    public final boolean s() {
        return this.f1198c;
    }

    @Override // d8.r1
    public final boolean t() {
        return true;
    }
}
