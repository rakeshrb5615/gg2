package i8;

import d8.a0;
import d8.b0;
import d8.d2;
import d8.e1;
import d8.f0;
import d8.w;
import d8.x;
import d8.x0;
import d8.y1;
import d8.z1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d4.l f2759a = new d4.l("CLOSED", 4, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d4.l f2760b = new d4.l("UNDEFINED", 4, false);

    /* renamed from: c  reason: collision with root package name */
    public static final d4.l f2761c = new d4.l("REUSABLE_CLAIMED", 4, false);

    /* renamed from: d  reason: collision with root package name */
    public static final d4.l f2762d = new d4.l("NO_THREAD_ELEMENTS", 4, false);

    /* renamed from: e  reason: collision with root package name */
    public static final x f2763e = new x(4);

    /* renamed from: f  reason: collision with root package name */
    public static final x f2764f = new x(5);

    /* renamed from: g  reason: collision with root package name */
    public static final x f2765g = new x(6);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(g2.g.c(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j, u7.p pVar) {
        while (true) {
            if (rVar.f2799c >= j && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f2766a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            d4.l lVar = f2759a;
            if (obj == lVar) {
                return lVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.f2799c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f2759a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, l7.h hVar) {
        Throwable runtimeException;
        for (e8.b bVar : d.f2769a) {
            try {
                bVar.i(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    q4.b.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            q4.b.a(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f2759a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(l7.h hVar, Object obj) {
        if (obj == f2762d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object fold = hVar.fold(null, f2764f);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            v1.a.t(fold);
            throw null;
        }
        v vVar = (v) obj;
        y1[] y1VarArr = vVar.f2805b;
        int length = y1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        y1 y1Var = y1VarArr[length];
        kotlin.jvm.internal.j.b((Object) null);
        Object obj2 = vVar.f2804a[length];
        throw null;
    }

    public static final void h(Object obj, l7.c cVar) {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        a0 a0Var = fVar.f2772d;
        n7.c cVar2 = fVar.f2773e;
        Throwable a10 = h7.h.a(obj);
        Object wVar = a10 == null ? obj : new w(false, a10);
        if (a0Var.s(cVar2.getContext())) {
            fVar.f2774f = wVar;
            fVar.f1218c = 1;
            a0Var.i(cVar2.getContext(), fVar);
            return;
        }
        x0 a11 = z1.a();
        if (a11.f1262c >= 4294967296L) {
            fVar.f2774f = wVar;
            fVar.f1218c = 1;
            i7.g gVar = a11.f1264e;
            if (gVar == null) {
                gVar = new i7.g();
                a11.f1264e = gVar;
            }
            gVar.addLast(fVar);
            return;
        }
        a11.A(true);
        try {
            e1 e1Var = (e1) cVar2.getContext().get(b0.f1162b);
            if (e1Var == null || e1Var.isActive()) {
                Object obj2 = fVar.f2775m;
                l7.h context = cVar2.getContext();
                Object l5 = l(context, obj2);
                d2 w8 = l5 != f2762d ? f0.w(cVar2, context, l5) : null;
                cVar2.resumeWith(obj);
                if (w8 == null || w8.R()) {
                    g(context, l5);
                }
            } else {
                fVar.resumeWith(c4.b.p(e1Var.getCancellationException()));
            }
            do {
            } while (a11.C());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long i(long r23, long r25, long r27, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.a.i(long, long, long, java.lang.String):long");
    }

    public static int j(int i, int i9, String str) {
        return (int) i(i, 1, (i9 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final Object k(l7.h hVar) {
        Object fold = hVar.fold(0, f2763e);
        kotlin.jvm.internal.j.b(fold);
        return fold;
    }

    public static final Object l(l7.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f2762d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new v(((Number) obj).intValue(), hVar), f2765g);
        }
        v1.a.t(obj);
        throw null;
    }
}
