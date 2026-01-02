package d8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class r1 implements e1, s, v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1241a = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_state$volatile");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1242b = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public r1(boolean z9) {
        this._state$volatile = z9 ? f0.j : f0.i;
    }

    public static r D(i8.j jVar) {
        while (jVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i8.j.f2784b;
            i8.j e9 = jVar.e();
            if (e9 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (i8.j) obj;
                    if (!jVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = e9;
            }
        }
        while (true) {
            jVar = jVar.g();
            if (!jVar.h()) {
                if (jVar instanceof r) {
                    return (r) jVar;
                }
                if (jVar instanceof s1) {
                    return null;
                }
            }
        }
    }

    public static String K(Object obj) {
        if (!(obj instanceof l1)) {
            return obj instanceof b1 ? ((b1) obj).isActive() ? "Active" : "New" : obj instanceof w ? "Cancelled" : "Completed";
        }
        l1 l1Var = (l1) obj;
        return l1Var.d() ? "Cancelling" : l1.f1212b.get(l1Var) != 0 ? "Completing" : "Active";
    }

    public static CancellationException L(r1 r1Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new f1(r1Var.l(), th, r1Var) : cancellationException;
    }

    public final boolean A(Object obj) {
        Object M;
        do {
            M = M(f1241a.get(this), obj);
            if (M == f0.f1188d) {
                return false;
            }
            if (M == f0.f1189e) {
                return true;
            }
        } while (M == f0.f1190f);
        f(M);
        return true;
    }

    public final Object B(Object obj) {
        Object M;
        do {
            M = M(f1241a.get(this), obj);
            if (M == f0.f1188d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                w wVar = obj instanceof w ? (w) obj : null;
                throw new IllegalStateException(str, wVar != null ? wVar.f1256a : null);
            }
        } while (M == f0.f1190f);
        return M;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable, a5.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [d8.r1, java.lang.Object] */
    public final void E(s1 s1Var, Throwable th) {
        s1Var.d(new i8.h(4), 4);
        Object obj = i8.j.f2783a.get(s1Var);
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        i8.j jVar = (i8.j) obj;
        ?? r12 = 0;
        while (!jVar.equals(s1Var)) {
            if ((jVar instanceof i1) && ((i1) jVar).j()) {
                try {
                    ((i1) jVar).k(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        q4.b.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + jVar + " for " + ((Object) this), th2);
                    }
                }
            }
            jVar = jVar.g();
            r12 = r12;
        }
        if (r12 != 0) {
            w(r12);
        }
        k(th);
    }

    public void F(Object obj) {
    }

    public void G() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d8.s1, i8.j] */
    public final void H(r0 r0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? jVar = new i8.j();
        a1 a1Var = jVar;
        if (!r0Var.f1240a) {
            a1Var = new a1(jVar);
        }
        do {
            atomicReferenceFieldUpdater = f1241a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, r0Var, a1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == r0Var);
    }

    public final void I(i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i8.j jVar = new i8.j();
        i1Var.getClass();
        i8.j.f2784b.set(jVar, i1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i8.j.f2783a;
        atomicReferenceFieldUpdater2.set(jVar, i1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(i1Var) == i1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(i1Var, i1Var, jVar)) {
                    if (atomicReferenceFieldUpdater2.get(i1Var) != i1Var) {
                        break;
                    }
                }
                jVar.f(i1Var);
                break loop0;
            }
            break;
        }
        i8.j g3 = i1Var.g();
        do {
            atomicReferenceFieldUpdater = f1241a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i1Var, g3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i1Var);
    }

    public final int J(Object obj) {
        boolean z9 = obj instanceof r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1241a;
        if (z9) {
            if (((r0) obj).f1240a) {
                return 0;
            }
            r0 r0Var = f0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else if (obj instanceof a1) {
            s1 s1Var = ((a1) obj).f1158a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final Object M(Object obj, Object obj2) {
        if (obj instanceof b1) {
            if (((obj instanceof r0) || (obj instanceof i1)) && !(obj instanceof r) && !(obj2 instanceof w)) {
                b1 b1Var = (b1) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1241a;
                c1 c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                        return f0.f1190f;
                    }
                }
                F(obj2);
                n(b1Var, obj2);
                return obj2;
            }
            b1 b1Var2 = (b1) obj;
            s1 u9 = u(b1Var2);
            if (u9 == null) {
                return f0.f1190f;
            }
            l1 l1Var = b1Var2 instanceof l1 ? (l1) b1Var2 : null;
            if (l1Var == null) {
                l1Var = new l1(u9, null);
            }
            synchronized (l1Var) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l1.f1212b;
                if (atomicIntegerFieldUpdater.get(l1Var) != 0) {
                    return f0.f1188d;
                }
                atomicIntegerFieldUpdater.set(l1Var, 1);
                if (l1Var != b1Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1241a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, l1Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                            return f0.f1190f;
                        }
                    }
                }
                boolean d9 = l1Var.d();
                w wVar = obj2 instanceof w ? (w) obj2 : null;
                if (wVar != null) {
                    l1Var.a(wVar.f1256a);
                }
                Throwable b10 = d9 ? null : l1Var.b();
                if (b10 != null) {
                    E(u9, b10);
                }
                r D = D(u9);
                if (D == null || !N(l1Var, D, obj2)) {
                    u9.d(new i8.h(2), 2);
                    r D2 = D(u9);
                    return (D2 == null || !N(l1Var, D2, obj2)) ? p(l1Var, obj2) : f0.f1189e;
                }
                return f0.f1189e;
            }
        }
        return f0.f1188d;
    }

    public final boolean N(l1 l1Var, r rVar, Object obj) {
        while (f0.m(rVar.f1239e, false, new k1(this, l1Var, rVar, obj)) == t1.f1246a) {
            rVar = D(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // d8.e1
    public final q attachChild(s sVar) {
        r rVar = new r(sVar);
        rVar.f1203d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1241a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (r0Var.f1240a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                H(r0Var);
            } else {
                boolean z9 = obj instanceof b1;
                t1 t1Var = t1.f1246a;
                if (!z9) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    w wVar = obj2 instanceof w ? (w) obj2 : null;
                    rVar.k(wVar != null ? wVar.f1256a : null);
                    return t1Var;
                }
                s1 c9 = ((b1) obj).c();
                if (c9 == null) {
                    I((i1) obj);
                } else if (!c9.d(rVar, 7)) {
                    boolean d9 = c9.d(rVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof l1) {
                        r4 = ((l1) obj3).b();
                    } else {
                        w wVar2 = obj3 instanceof w ? (w) obj3 : null;
                        if (wVar2 != null) {
                            r4 = wVar2.f1256a;
                        }
                    }
                    rVar.k(r4);
                    if (d9) {
                        break loop0;
                    }
                    return t1Var;
                }
            }
        }
        return rVar;
    }

    @Override // d8.e1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new f1(l(), null, this);
        }
        j(cancellationException);
    }

    public void f(Object obj) {
    }

    @Override // l7.h
    public final Object fold(Object obj, u7.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // l7.h
    public final l7.f get(l7.g gVar) {
        return q4.b.r(this, gVar);
    }

    @Override // d8.e1
    public final CancellationException getCancellationException() {
        Object obj = f1241a.get(this);
        if (!(obj instanceof l1)) {
            if (!(obj instanceof b1)) {
                return obj instanceof w ? L(this, ((w) obj).f1256a) : new f1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable b10 = ((l1) obj).b();
        if (b10 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = b10 instanceof CancellationException ? (CancellationException) b10 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = l();
            }
            return new f1(concat, b10, this);
        }
        return cancellationException;
    }

    @Override // d8.e1
    public final a8.f getChildren() {
        return new a8.i(new n1(this, null));
    }

    public Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f1241a.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar != null) {
            return wVar.f1256a;
        }
        return null;
    }

    @Override // l7.f
    public final l7.g getKey() {
        return b0.f1162b;
    }

    public final Object h(l7.c cVar) {
        Object obj;
        do {
            obj = f1241a.get(this);
            if (!(obj instanceof b1)) {
                if (obj instanceof w) {
                    throw ((w) obj).f1256a;
                }
                return f0.v(obj);
            }
        } while (J(obj) < 0);
        j1 j1Var = new j1(this, q4.b.C(cVar));
        j1Var.r();
        j1Var.u(new j(f0.m(this, true, new q0(j1Var, 3)), 2));
        Object q = j1Var.q();
        m7.a aVar = m7.a.f4049a;
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 == d8.f0.f1189e) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.r1.i(java.lang.Object):boolean");
    }

    @Override // d8.e1
    public final p0 invokeOnCompletion(u7.l lVar) {
        return y(true, new q0(lVar, 1));
    }

    @Override // d8.e1
    public boolean isActive() {
        Object obj = f1241a.get(this);
        return (obj instanceof b1) && ((b1) obj).isActive();
    }

    @Override // d8.e1
    public final boolean isCancelled() {
        Object obj = f1241a.get(this);
        if (obj instanceof w) {
            return true;
        }
        return (obj instanceof l1) && ((l1) obj).d();
    }

    @Override // d8.e1
    public final boolean isCompleted() {
        return !(f1241a.get(this) instanceof b1);
    }

    public void j(CancellationException cancellationException) {
        i(cancellationException);
    }

    @Override // d8.e1
    public final Object join(l7.c cVar) {
        Object obj;
        h7.l lVar;
        do {
            obj = f1241a.get(this);
            boolean z9 = obj instanceof b1;
            lVar = h7.l.f2236a;
            if (!z9) {
                f0.g(cVar.getContext());
                return lVar;
            }
        } while (J(obj) < 0);
        n nVar = new n(1, q4.b.C(cVar));
        nVar.r();
        nVar.u(new j(f0.m(this, true, new p(nVar, 1)), 2));
        Object q = nVar.q();
        m7.a aVar = m7.a.f4049a;
        if (q != aVar) {
            q = lVar;
        }
        return q == aVar ? q : lVar;
    }

    public final boolean k(Throwable th) {
        if (z()) {
            return true;
        }
        boolean z9 = th instanceof CancellationException;
        q qVar = (q) f1242b.get(this);
        return (qVar == null || qVar == t1.f1246a) ? z9 : qVar.b(th) || z9;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && s();
    }

    @Override // l7.h
    public final l7.h minusKey(l7.g gVar) {
        return q4.b.G(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a5.o, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, a5.o] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [d8.r1, java.lang.Object] */
    public final void n(b1 b1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1242b;
        q qVar = (q) atomicReferenceFieldUpdater.get(this);
        if (qVar != null) {
            qVar.a();
            atomicReferenceFieldUpdater.set(this, t1.f1246a);
        }
        ?? r12 = 0;
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar != null ? wVar.f1256a : null;
        if (b1Var instanceof i1) {
            try {
                ((i1) b1Var).k(th);
                return;
            } catch (Throwable th2) {
                w(new RuntimeException("Exception in completion handler " + b1Var + " for " + ((Object) this), th2));
                return;
            }
        }
        s1 c9 = b1Var.c();
        if (c9 != null) {
            c9.d(new i8.h(1), 1);
            Object obj2 = i8.j.f2783a.get(c9);
            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            i8.j jVar = (i8.j) obj2;
            while (!jVar.equals(c9)) {
                if (jVar instanceof i1) {
                    try {
                        ((i1) jVar).k(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            q4.b.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + jVar + " for " + ((Object) this), th3);
                        }
                    }
                }
                jVar = jVar.g();
                r12 = r12;
            }
            if (r12 != 0) {
                w(r12);
            }
        }
    }

    public final Throwable o(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        r1 r1Var = (r1) ((v1) obj);
        Object obj2 = f1241a.get(r1Var);
        if (obj2 instanceof l1) {
            th = ((l1) obj2).b();
        } else if (obj2 instanceof w) {
            th = ((w) obj2).f1256a;
        } else if (obj2 instanceof b1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new f1("Parent job is ".concat(K(obj2)), th, r1Var) : cancellationException;
    }

    public final Object p(l1 l1Var, Object obj) {
        Throwable r8;
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar != null ? wVar.f1256a : null;
        synchronized (l1Var) {
            l1Var.d();
            ArrayList e9 = l1Var.e(th);
            r8 = r(l1Var, e9);
            if (r8 != null && e9.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e9.size()));
                int size = e9.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = e9.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != r8 && th2 != r8 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        q4.b.a(r8, th2);
                    }
                }
            }
        }
        if (r8 != null && r8 != th) {
            obj = new w(false, r8);
        }
        if (r8 != null && (k(r8) || v(r8))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            w.f1255b.compareAndSet((w) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1241a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, l1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == l1Var) {
        }
        n(l1Var, obj);
        return obj;
    }

    @Override // l7.h
    public final l7.h plus(l7.h hVar) {
        return q4.b.L(this, hVar);
    }

    public final Object q() {
        Object obj = f1241a.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof w) {
            throw ((w) obj).f1256a;
        }
        return f0.v(obj);
    }

    public final Throwable r(l1 l1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (l1Var.d()) {
                return new f1(l(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i9);
            i9++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof a2) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof a2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean s() {
        return true;
    }

    @Override // d8.e1
    public final boolean start() {
        int J;
        do {
            J = J(f1241a.get(this));
            if (J == 0) {
                return false;
            }
        } while (J != 1);
        return true;
    }

    public boolean t() {
        return this instanceof u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C() + '{' + K(f1241a.get(this)) + '}');
        sb.append('@');
        sb.append(f0.j(this));
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [d8.s1, i8.j] */
    public final s1 u(b1 b1Var) {
        s1 c9 = b1Var.c();
        if (c9 == null) {
            if (b1Var instanceof r0) {
                return new i8.j();
            }
            if (b1Var instanceof i1) {
                I((i1) b1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + b1Var).toString());
        }
        return c9;
    }

    public boolean v(Throwable th) {
        return false;
    }

    public void w(a5.o oVar) {
        throw oVar;
    }

    public final void x(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1242b;
        t1 t1Var = t1.f1246a;
        if (e1Var == null) {
            atomicReferenceFieldUpdater.set(this, t1Var);
            return;
        }
        e1Var.start();
        q attachChild = e1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (isCompleted()) {
            attachChild.a();
            atomicReferenceFieldUpdater.set(this, t1Var);
        }
    }

    public final p0 y(boolean z9, i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t1 t1Var;
        boolean z10;
        boolean d9;
        i1Var.f1203d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f1241a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof r0;
            t1Var = t1.f1246a;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof b1)) {
                    z10 = false;
                    break;
                }
                b1 b1Var = (b1) obj;
                s1 c9 = b1Var.c();
                if (c9 == null) {
                    I((i1) obj);
                } else {
                    if (i1Var.j()) {
                        l1 l1Var = b1Var instanceof l1 ? (l1) b1Var : null;
                        Throwable b10 = l1Var != null ? l1Var.b() : null;
                        if (b10 == null) {
                            d9 = c9.d(i1Var, 5);
                        } else if (z9) {
                            i1Var.k(b10);
                            return t1Var;
                        }
                    } else {
                        d9 = c9.d(i1Var, 1);
                    }
                    if (d9) {
                        break;
                    }
                }
            } else {
                r0 r0Var = (r0) obj;
                if (r0Var.f1240a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                H(r0Var);
            }
        }
        if (z10) {
            return i1Var;
        }
        if (z9) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            w wVar = obj2 instanceof w ? (w) obj2 : null;
            i1Var.k(wVar != null ? wVar.f1256a : null);
        }
        return t1Var;
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override // d8.e1
    public final p0 invokeOnCompletion(boolean z9, boolean z10, u7.l lVar) {
        i1 q0Var;
        if (z9) {
            q0Var = new d1(lVar);
        } else {
            q0Var = new q0(lVar, 1);
        }
        return y(z10, q0Var);
    }
}
