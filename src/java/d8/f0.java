package d8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d4.l f1185a = new d4.l("RESUME_TOKEN", 4, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d4.l f1186b = new d4.l("REMOVED_TASK", 4, false);

    /* renamed from: c  reason: collision with root package name */
    public static final d4.l f1187c = new d4.l("CLOSED_EMPTY", 4, false);

    /* renamed from: d  reason: collision with root package name */
    public static final d4.l f1188d = new d4.l("COMPLETING_ALREADY", 4, false);

    /* renamed from: e  reason: collision with root package name */
    public static final d4.l f1189e = new d4.l("COMPLETING_WAITING_CHILDREN", 4, false);

    /* renamed from: f  reason: collision with root package name */
    public static final d4.l f1190f = new d4.l("COMPLETING_RETRY", 4, false);

    /* renamed from: g  reason: collision with root package name */
    public static final d4.l f1191g = new d4.l("TOO_LATE_TO_CANCEL", 4, false);

    /* renamed from: h  reason: collision with root package name */
    public static final d4.l f1192h = new d4.l("SEALED", 4, false);
    public static final r0 i = new r0(false);
    public static final r0 j = new r0(true);

    /* JADX WARN: Type inference failed for: r0v0, types: [d8.r1, d8.u] */
    public static u a() {
        ?? r1Var = new r1(true);
        r1Var.x(null);
        return r1Var;
    }

    public static final i8.c b(l7.h hVar) {
        if (hVar.get(b0.f1162b) == null) {
            hVar = hVar.plus(new g1());
        }
        return new i8.c(hVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [d8.a, d8.j0] */
    public static j0 c(c0 c0Var, u7.p pVar) {
        d0 d0Var = d0.f1171a;
        l7.h q = q(c0Var, l7.i.f3796a);
        d0 d0Var2 = d0.f1171a;
        ?? aVar = new a(q, true);
        aVar.Q(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(i0[] i0VarArr, n7.i iVar) {
        if (i0VarArr.length == 0) {
            return i7.n.f2745a;
        }
        e eVar = new e(i0VarArr);
        n nVar = new n(1, q4.b.C(iVar));
        nVar.r();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i9 = 0; i9 < length; i9++) {
            i0 i0Var = i0VarArr[i9];
            i0Var.start();
            c cVar = new c(eVar, nVar);
            cVar.f1166f = m(i0Var, true, cVar);
            cVarArr[i9] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.f1164n.set(cVar2, dVar);
        }
        if (n.f1220m.get(nVar) instanceof u1) {
            nVar.u(dVar);
        } else {
            dVar.b();
        }
        Object q = nVar.q();
        m7.a aVar = m7.a.f4049a;
        return q;
    }

    public static final Object e(u7.p pVar, l7.c cVar) {
        i8.q qVar = new i8.q(cVar, cVar.getContext());
        Object S = q4.b.S(qVar, qVar, pVar);
        m7.a aVar = m7.a.f4049a;
        return S;
    }

    public static final Object f(long j8, n7.c cVar) {
        if (j8 > 0) {
            n nVar = new n(1, q4.b.C(cVar));
            nVar.r();
            if (j8 < Long.MAX_VALUE) {
                i(nVar.f1223e).f(j8, nVar);
            }
            Object q = nVar.q();
            if (q == m7.a.f4049a) {
                return q;
            }
        }
        return h7.l.f2236a;
    }

    public static final void g(l7.h hVar) {
        e1 e1Var = (e1) hVar.get(b0.f1162b);
        if (e1Var != null && !e1Var.isActive()) {
            throw e1Var.getCancellationException();
        }
    }

    public static final l7.h h(l7.h hVar, l7.h hVar2, boolean z9) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.fold(bool, new x(0))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, new x(0))).booleanValue();
        if (booleanValue || booleanValue2) {
            x xVar = new x(1);
            l7.i iVar = l7.i.f3796a;
            l7.h hVar3 = (l7.h) hVar.fold(iVar, xVar);
            l7.h hVar4 = hVar2;
            if (booleanValue2) {
                hVar4 = hVar2.fold(iVar, new x(2));
            }
            return hVar3.plus(hVar4);
        }
        return hVar.plus(hVar2);
    }

    public static final k0 i(l7.h hVar) {
        l7.f fVar = hVar.get(l7.d.f3795a);
        k0 k0Var = fVar instanceof k0 ? (k0) fVar : null;
        return k0Var == null ? h0.f1201a : k0Var;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final n k(l7.c cVar) {
        n nVar;
        n nVar2;
        if (cVar instanceof i8.f) {
            i8.f fVar = (i8.f) cVar;
            d4.l lVar = i8.a.f2761c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i8.f.f2771n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                nVar = null;
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(fVar, lVar);
                    nVar2 = null;
                    break;
                } else if (obj instanceof n) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            break;
                        }
                    }
                    nVar2 = (n) obj;
                    break loop0;
                } else if (obj != lVar && !(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (nVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n.f1220m;
                Object obj2 = atomicReferenceFieldUpdater2.get(nVar2);
                if (!(obj2 instanceof v) || ((v) obj2).f1252d == null) {
                    n.f1219f.set(nVar2, 536870911);
                    atomicReferenceFieldUpdater2.set(nVar2, b.f1160a);
                    nVar = nVar2;
                } else {
                    nVar2.n();
                }
                if (nVar != null) {
                    return nVar;
                }
            }
            return new n(2, cVar);
        }
        return new n(1, cVar);
    }

    public static final void l(Throwable th, l7.h hVar) {
        try {
            e8.b bVar = (e8.b) hVar.get(b0.f1161a);
            if (bVar != null) {
                bVar.i(th);
            } else {
                i8.a.d(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                q4.b.a(runtimeException, th);
                th = runtimeException;
            }
            i8.a.d(th, hVar);
        }
    }

    public static final p0 m(e1 e1Var, boolean z9, i1 i1Var) {
        return e1Var instanceof r1 ? ((r1) e1Var).y(z9, i1Var) : e1Var.invokeOnCompletion(i1Var.j(), z9, new kotlin.jvm.internal.h(1, i1Var, i1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(java.util.List r4, n7.c r5) {
        /*
            boolean r0 = r5 instanceof d8.g
            if (r0 == 0) goto L13
            r0 = r5
            d8.g r0 = (d8.g) r0
            int r1 = r0.f1196c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1196c = r1
            goto L18
        L13:
            d8.g r0 = new d8.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1195b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1196c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f1194a
            c4.b.e0(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            c4.b.e0(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            d8.e1 r5 = (d8.e1) r5
            r0.f1194a = r4
            r0.f1196c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            h7.l r4 = h7.l.f2236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f0.n(java.util.List, n7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(d8.e1[] r6, n7.c r7) {
        /*
            boolean r0 = r7 instanceof d8.f
            if (r0 == 0) goto L13
            r0 = r7
            d8.f r0 = (d8.f) r0
            int r1 = r0.f1184e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1184e = r1
            goto L18
        L13:
            d8.f r0 = new d8.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1183d
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1184e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f1182c
            int r2 = r0.f1181b
            java.lang.Object[] r4 = r0.f1180a
            d8.e1[] r4 = (d8.e1[]) r4
            c4.b.e0(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            c4.b.e0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f1180a = r7
            r0.f1181b = r2
            r0.f1182c = r6
            r0.f1184e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            h7.l r6 = h7.l.f2236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f0.o(d8.e1[], n7.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [d8.a, d8.w1] */
    public static w1 p(c0 c0Var, u7.p pVar) {
        d0 d0Var = d0.f1171a;
        l7.h q = q(c0Var, l7.i.f3796a);
        d0 d0Var2 = d0.f1171a;
        ?? aVar = new a(q, true);
        aVar.Q(d0Var, aVar, pVar);
        return aVar;
    }

    public static final l7.h q(c0 c0Var, l7.h hVar) {
        l7.h h9 = h(c0Var.a(), hVar, true);
        k8.e eVar = n0.f1224a;
        return (h9 == eVar || h9.get(l7.d.f3795a) != null) ? h9 : h9.plus(eVar);
    }

    public static final Object r(Object obj) {
        return obj instanceof w ? c4.b.p(((w) obj).f1256a) : obj;
    }

    public static final void s(n nVar, l7.c cVar, boolean z9) {
        Object obj = n.f1220m.get(nVar);
        Throwable f9 = nVar.f(obj);
        Object p8 = f9 != null ? c4.b.p(f9) : nVar.g(obj);
        if (!z9) {
            cVar.resumeWith(p8);
            return;
        }
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        i8.f fVar = (i8.f) cVar;
        n7.c cVar2 = fVar.f2773e;
        Object obj2 = fVar.f2775m;
        l7.h context = cVar2.getContext();
        Object l5 = i8.a.l(context, obj2);
        d2 w8 = l5 != i8.a.f2762d ? w(cVar2, context, l5) : null;
        try {
            cVar2.resumeWith(p8);
            if (w8 == null || w8.R()) {
                i8.a.g(context, l5);
            }
        } catch (Throwable th) {
            if (w8 == null || w8.R()) {
                i8.a.g(context, l5);
            }
            throw th;
        }
    }

    public static Object t(u7.p pVar) {
        Thread currentThread = Thread.currentThread();
        x0 a10 = z1.a();
        l7.h h9 = h(l7.i.f3796a, a10, true);
        k8.e eVar = n0.f1224a;
        if (h9 != eVar && h9.get(l7.d.f3795a) == null) {
            h9 = h9.plus(eVar);
        }
        h hVar = new h(h9, currentThread, a10);
        hVar.Q(d0.f1171a, hVar, pVar);
        x0 x0Var = hVar.f1200e;
        if (x0Var != null) {
            int i9 = x0.f1261f;
            x0Var.A(false);
        }
        while (!Thread.interrupted()) {
            try {
                long B = x0Var != null ? x0Var.B() : Long.MAX_VALUE;
                if (hVar.isCompleted()) {
                    if (x0Var != null) {
                        int i10 = x0.f1261f;
                        x0Var.y(false);
                    }
                    Object v2 = v(r1.f1241a.get(hVar));
                    w wVar = v2 instanceof w ? (w) v2 : null;
                    if (wVar == null) {
                        return v2;
                    }
                    throw wVar.f1256a;
                }
                LockSupport.parkNanos(hVar, B);
            } catch (Throwable th) {
                if (x0Var != null) {
                    int i11 = x0.f1261f;
                    x0Var.y(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar.i(interruptedException);
        throw interruptedException;
    }

    public static final String u(l7.c cVar) {
        Object p8;
        if (cVar instanceof i8.f) {
            return ((i8.f) cVar).toString();
        }
        try {
            p8 = cVar + '@' + j(cVar);
        } catch (Throwable th) {
            p8 = c4.b.p(th);
        }
        if (h7.h.a(p8) != null) {
            p8 = cVar.getClass().getName() + '@' + j(cVar);
        }
        return (String) p8;
    }

    public static final Object v(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f1168a) == null) ? obj : b1Var;
    }

    public static final d2 w(l7.c cVar, l7.h hVar, Object obj) {
        d2 d2Var = null;
        if ((cVar instanceof n7.d) && hVar.get(e2.f1179a) != null) {
            n7.d dVar = (n7.d) cVar;
            while (true) {
                if (!(dVar instanceof l0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof d2) {
                        d2Var = (d2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (d2Var != null) {
                d2Var.S(hVar, obj);
            }
        }
        return d2Var;
    }

    public static final Object x(l7.h hVar, u7.p pVar, l7.c cVar) {
        Object v2;
        l7.h context = cVar.getContext();
        l7.h plus = !((Boolean) hVar.fold(Boolean.FALSE, new x(0))).booleanValue() ? context.plus(hVar) : h(context, hVar, false);
        g(plus);
        if (plus == context) {
            i8.q qVar = new i8.q(cVar, plus);
            v2 = q4.b.S(qVar, qVar, pVar);
        } else {
            l7.d dVar = l7.d.f3795a;
            if (kotlin.jvm.internal.j.a(plus.get(dVar), context.get(dVar))) {
                d2 d2Var = new d2(cVar, plus);
                l7.h hVar2 = d2Var.f1156c;
                Object l5 = i8.a.l(hVar2, null);
                try {
                    Object S = q4.b.S(d2Var, d2Var, pVar);
                    i8.a.g(hVar2, l5);
                    v2 = S;
                } catch (Throwable th) {
                    i8.a.g(hVar2, l5);
                    throw th;
                }
            } else {
                i8.q qVar2 = new i8.q(cVar, plus);
                try {
                    i8.a.h(h7.l.f2236a, q4.b.C(q4.b.k(qVar2, qVar2, pVar)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.f1211e;
                    while (true) {
                        int i9 = atomicIntegerFieldUpdater.get(qVar2);
                        if (i9 == 0) {
                            if (atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1)) {
                                v2 = m7.a.f4049a;
                                break;
                            }
                        } else if (i9 != 2) {
                            throw new IllegalStateException("Already suspended");
                        } else {
                            v2 = v(r1.f1241a.get(qVar2));
                            if (v2 instanceof w) {
                                throw ((w) v2).f1256a;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    qVar2.resumeWith(c4.b.p(th2));
                    throw th2;
                }
            }
        }
        m7.a aVar = m7.a.f4049a;
        return v2;
    }

    public static final Object y(long j8, u7.p pVar, n7.c cVar) {
        Object wVar;
        Object B;
        if (j8 > 0) {
            b2 b2Var = new b2(j8, cVar);
            m(b2Var, true, new q0(i(b2Var.f2797d.getContext()).c(b2Var.f1163e, b2Var, b2Var.f1156c), 0));
            try {
                kotlin.jvm.internal.u.a(2, pVar);
                wVar = pVar.invoke(b2Var, b2Var);
            } catch (Throwable th) {
                wVar = new w(false, th);
            }
            Object obj = m7.a.f4049a;
            if (wVar == obj || (B = b2Var.B(wVar)) == f1189e) {
                return obj;
            }
            if (B instanceof w) {
                Throwable th2 = ((w) B).f1256a;
                if (!(th2 instanceof a2) || ((a2) th2).f1159a != b2Var) {
                    throw th2;
                }
                if (wVar instanceof w) {
                    throw ((w) wVar).f1256a;
                }
            } else {
                wVar = v(B);
            }
            return wVar;
        }
        throw new a2("Timed out immediately", null);
    }
}
