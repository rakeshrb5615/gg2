package d8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class i1 extends i8.j implements p0, b1 {

    /* renamed from: d  reason: collision with root package name */
    public r1 f1203d;

    @Override // d8.p0
    public final void a() {
        r1 i = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f1241a;
            Object obj = atomicReferenceFieldUpdater.get(i);
            if (obj instanceof i1) {
                if (obj != this) {
                    return;
                }
                r0 r0Var = f0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(i, obj, r0Var)) {
                    if (atomicReferenceFieldUpdater.get(i) != obj) {
                        break;
                    }
                }
                return;
            } else if (!(obj instanceof b1) || ((b1) obj).c() == null) {
                return;
            } else {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i8.j.f2783a;
                    Object obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (obj2 instanceof i8.o) {
                        return;
                    }
                    if (obj2 == this) {
                        i8.j jVar = (i8.j) obj2;
                        return;
                    }
                    kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    i8.j jVar2 = (i8.j) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = i8.j.f2785c;
                    i8.o oVar = (i8.o) atomicReferenceFieldUpdater3.get(jVar2);
                    if (oVar == null) {
                        oVar = new i8.o(jVar2);
                        atomicReferenceFieldUpdater3.set(jVar2, oVar);
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    jVar2.e();
                    return;
                }
            }
        }
    }

    @Override // d8.b1
    public final s1 c() {
        return null;
    }

    public e1 getParent() {
        return i();
    }

    public final r1 i() {
        r1 r1Var = this.f1203d;
        if (r1Var != null) {
            return r1Var;
        }
        kotlin.jvm.internal.j.i("job");
        throw null;
    }

    @Override // d8.b1
    public final boolean isActive() {
        return true;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // i8.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.j(this) + "[job@" + f0.j(i()) + ']';
    }
}
