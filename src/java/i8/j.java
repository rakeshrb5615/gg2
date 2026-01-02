package i8;

import d8.f0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2783a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2784b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2785c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean d(j jVar, int i) {
        while (true) {
            j e9 = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2784b;
            if (e9 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    e9 = (j) obj;
                    if (!e9.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e9);
                }
            }
            if (e9 instanceof h) {
                return (((h) e9).f2782d & i) == 0 && e9.d(jVar, i);
            }
            atomicReferenceFieldUpdater.set(jVar, e9);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2783a;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(e9, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(e9) != this) {
                    break;
                }
            }
            jVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r6 = ((i8.o) r6).f2796a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r5.get(r4) == r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i8.j e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i8.j.f2784b
            java.lang.Object r1 = r0.get(r9)
            i8.j r1 = (i8.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = i8.j.f2783a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof i8.o
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            i8.o r6 = (i8.o) r6
            i8.j r6 = r6.f2796a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            i8.j r3 = (i8.j) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.j.c(r6, r4)
            r4 = r6
            i8.j r4 = (i8.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.j.e():i8.j");
    }

    public final void f(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2784b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f2783a.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (h()) {
                jVar.e();
                return;
            }
            return;
        }
    }

    public final j g() {
        j jVar;
        Object obj = f2783a.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar == null || (jVar = oVar.f2796a) == null) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            return (j) obj;
        }
        return jVar;
    }

    public boolean h() {
        return f2783a.get(this) instanceof o;
    }

    public String toString() {
        return new kotlin.jvm.internal.n(this, f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + f0.j(this);
    }
}
