package d8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class n extends m0 implements l, n7.d, f2 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1219f = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decisionAndIndex$volatile");

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1220m = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1221n = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final l7.c f1222d;

    /* renamed from: e  reason: collision with root package name */
    public final l7.h f1223e;

    public n(int i, l7.c cVar) {
        super(i);
        this.f1222d = cVar;
        this.f1223e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f1160a;
    }

    public static Object C(u1 u1Var, Object obj, int i, u7.q qVar) {
        if (obj instanceof w) {
            return obj;
        }
        if (i == 1 || i == 2) {
            if (qVar != null || (u1Var instanceof k)) {
                return new v(obj, u1Var instanceof k ? (k) u1Var : null, qVar, (Throwable) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void w(u1 u1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + u1Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, u7.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1220m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof u1) {
                Object C = C((u1) obj2, obj, i, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof o) {
                o oVar = (o) obj2;
                if (o.f1230c.compareAndSet(oVar, 0, 1)) {
                    if (qVar != null) {
                        k(qVar, oVar.f1256a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(a0 a0Var) {
        l7.c cVar = this.f1222d;
        i8.f fVar = cVar instanceof i8.f ? (i8.f) cVar : null;
        A(h7.l.f2236a, (fVar != null ? fVar.f2772d : null) == a0Var ? 4 : this.f1218c, null);
    }

    public final d4.l D(Object obj, u7.q qVar) {
        d4.l lVar = f0.f1185a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1220m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof u1) {
                Object C = C((u1) obj2, obj, this.f1218c, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                return lVar;
            }
            return null;
        }
    }

    @Override // d8.f2
    public final void a(i8.r rVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f1219f;
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i));
        u(rVar);
    }

    @Override // d8.m0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1220m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof u1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof w) {
                return;
            }
            if (!(obj instanceof v)) {
                cancellationException2 = cancellationException;
                v vVar = new v(obj, (k) null, (u7.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            v vVar2 = (v) obj;
            if (vVar2.f1253e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            v a10 = v.a(vVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            k kVar = vVar2.f1250b;
            if (kVar != null) {
                j(kVar, cancellationException);
            }
            u7.q qVar = vVar2.f1251c;
            if (qVar != null) {
                k(qVar, cancellationException, vVar2.f1249a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // d8.l
    public final d4.l c(Object obj, u7.q qVar) {
        return D(obj, qVar);
    }

    @Override // d8.m0
    public final l7.c d() {
        return this.f1222d;
    }

    @Override // d8.l
    public final void e(Object obj) {
        o(this.f1218c);
    }

    @Override // d8.m0
    public final Throwable f(Object obj) {
        Throwable f9 = super.f(obj);
        if (f9 != null) {
            return f9;
        }
        return null;
    }

    @Override // d8.m0
    public final Object g(Object obj) {
        return obj instanceof v ? ((v) obj).f1249a : obj;
    }

    @Override // n7.d
    public final n7.d getCallerFrame() {
        l7.c cVar = this.f1222d;
        if (cVar instanceof n7.d) {
            return (n7.d) cVar;
        }
        return null;
    }

    @Override // l7.c
    public final l7.h getContext() {
        return this.f1223e;
    }

    @Override // d8.m0
    public final Object i() {
        return f1220m.get(this);
    }

    public final void j(k kVar, Throwable th) {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            f0.l(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.f1223e);
        }
    }

    public final void k(u7.q qVar, Throwable th, Object obj) {
        l7.h hVar = this.f1223e;
        try {
            qVar.b(th, obj, hVar);
        } catch (Throwable th2) {
            f0.l(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), hVar);
        }
    }

    public final void l(i8.r rVar, Throwable th) {
        l7.h hVar = this.f1223e;
        int i = f1219f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i, hVar);
        } catch (Throwable th2) {
            f0.l(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), hVar);
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1220m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = false;
            if (obj instanceof u1) {
                if ((obj instanceof k) || (obj instanceof i8.r)) {
                    z9 = true;
                }
                o oVar = new o(this, th, z9);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                u1 u1Var = (u1) obj;
                if (u1Var instanceof k) {
                    j((k) obj, th);
                } else if (u1Var instanceof i8.r) {
                    l((i8.r) obj, th);
                }
                if (!v()) {
                    n();
                }
                o(this.f1218c);
                return true;
            }
            return false;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1221n;
        p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var == null) {
            return;
        }
        p0Var.a();
        atomicReferenceFieldUpdater.set(this, t1.f1246a);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f1219f;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z9 = false;
                boolean z10 = i == 4;
                l7.c cVar = this.f1222d;
                if (!z10 && (cVar instanceof i8.f)) {
                    boolean z11 = i == 1 || i == 2;
                    int i11 = this.f1218c;
                    if (i11 == 1 || i11 == 2) {
                        z9 = true;
                    }
                    if (z11 == z9) {
                        i8.f fVar = (i8.f) cVar;
                        a0 a0Var = fVar.f2772d;
                        l7.h context = fVar.f2773e.getContext();
                        if (a0Var.s(context)) {
                            a0Var.i(context, this);
                            return;
                        }
                        x0 a10 = z1.a();
                        if (a10.f1262c >= 4294967296L) {
                            i7.g gVar = a10.f1264e;
                            if (gVar == null) {
                                gVar = new i7.g();
                                a10.f1264e = gVar;
                            }
                            gVar.addLast(this);
                            return;
                        }
                        a10.A(true);
                        try {
                            f0.s(this, cVar, true);
                            do {
                            } while (a10.C());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                f0.s(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1073741824 + (536870911 & i9)));
    }

    public Throwable p(r1 r1Var) {
        return r1Var.getCancellationException();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        e1 e1Var;
        boolean v2 = v();
        do {
            atomicIntegerFieldUpdater = f1219f;
            i = atomicIntegerFieldUpdater.get(this);
            int i9 = i >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    if (v2) {
                        y();
                    }
                    Object obj = f1220m.get(this);
                    if (obj instanceof w) {
                        throw ((w) obj).f1256a;
                    }
                    int i10 = this.f1218c;
                    if ((i10 != 1 && i10 != 2) || (e1Var = (e1) this.f1223e.get(b0.f1162b)) == null || e1Var.isActive()) {
                        return g(obj);
                    }
                    CancellationException cancellationException = e1Var.getCancellationException();
                    b(cancellationException);
                    throw cancellationException;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((p0) f1221n.get(this)) == null) {
            s();
        }
        if (v2) {
            y();
        }
        return m7.a.f4049a;
    }

    public final void r() {
        p0 s5 = s();
        if (s5 == null || (f1220m.get(this) instanceof u1)) {
            return;
        }
        s5.a();
        f1221n.set(this, t1.f1246a);
    }

    @Override // l7.c
    public final void resumeWith(Object obj) {
        Throwable a10 = h7.h.a(obj);
        if (a10 != null) {
            obj = new w(false, a10);
        }
        A(obj, this.f1218c, null);
    }

    public final p0 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = (e1) this.f1223e.get(b0.f1162b);
        if (e1Var == null) {
            return null;
        }
        p0 m9 = f0.m(e1Var, true, new p(this, 0));
        do {
            atomicReferenceFieldUpdater = f1221n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m9)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m9;
    }

    public final void t(u7.l lVar) {
        u(new j(lVar, 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(f0.u(this.f1222d));
        sb.append("){");
        Object obj = f1220m.get(this);
        sb.append(obj instanceof u1 ? "Active" : obj instanceof o ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(f0.j(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(d8.u1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d8.n.f1220m
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof d8.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof d8.k
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof i8.r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof d8.w
            if (r1 == 0) goto L4d
            r0 = r2
            d8.w r0 = (d8.w) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = d8.w.f1255b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof d8.o
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f1256a
            boolean r1 = r8 instanceof d8.k
            if (r1 == 0) goto L43
            d8.k r8 = (d8.k) r8
            r7.j(r8, r0)
            return
        L43:
            i8.r r8 = (i8.r) r8
            r7.l(r8, r0)
            return
        L49:
            w(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof d8.v
            if (r1 == 0) goto L80
            r1 = r2
            d8.v r1 = (d8.v) r1
            d8.k r4 = r1.f1250b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof i8.r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            d8.k r4 = (d8.k) r4
            java.lang.Throwable r5 = r1.f1253e
            if (r5 == 0) goto L68
            r7.j(r4, r5)
            return
        L68:
            r5 = 29
            d8.v r1 = d8.v.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            w(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof i8.r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            d8.k r3 = (d8.k) r3
            d8.v r1 = new d8.v
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            w(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.n.u(d8.u1):void");
    }

    public final boolean v() {
        if (this.f1218c == 2) {
            l7.c cVar = this.f1222d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            return i8.f.f2771n.get((i8.f) cVar) != null;
        }
        return false;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        l7.c cVar = this.f1222d;
        Throwable th = null;
        i8.f fVar = cVar instanceof i8.f ? (i8.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i8.f.f2771n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                d4.l lVar = i8.a.f2761c;
                if (obj == lVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, lVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != lVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            m(th);
        }
    }

    public final void z(Object obj, u7.q qVar) {
        A(obj, this.f1218c, qVar);
    }
}
