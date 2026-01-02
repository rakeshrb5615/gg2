package i8;

import d8.a0;
import d8.f0;
import d8.m0;
import d8.w;
import d8.x0;
import d8.z1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f extends m0 implements n7.d, l7.c {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2771n = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f2772d;

    /* renamed from: e  reason: collision with root package name */
    public final n7.c f2773e;

    /* renamed from: f  reason: collision with root package name */
    public Object f2774f;

    /* renamed from: m  reason: collision with root package name */
    public final Object f2775m;

    public f(a0 a0Var, n7.c cVar) {
        super(-1);
        this.f2772d = a0Var;
        this.f2773e = cVar;
        this.f2774f = a.f2760b;
        this.f2775m = a.k(cVar.getContext());
    }

    @Override // d8.m0
    public final l7.c d() {
        return this;
    }

    @Override // n7.d
    public final n7.d getCallerFrame() {
        return this.f2773e;
    }

    @Override // l7.c
    public final l7.h getContext() {
        return this.f2773e.getContext();
    }

    @Override // d8.m0
    public final Object i() {
        Object obj = this.f2774f;
        this.f2774f = a.f2760b;
        return obj;
    }

    @Override // l7.c
    public final void resumeWith(Object obj) {
        Throwable a10 = h7.h.a(obj);
        Object wVar = a10 == null ? obj : new w(false, a10);
        n7.c cVar = this.f2773e;
        l7.h context = cVar.getContext();
        a0 a0Var = this.f2772d;
        if (a0Var.s(context)) {
            this.f2774f = wVar;
            this.f1218c = 0;
            a0Var.i(cVar.getContext(), this);
            return;
        }
        x0 a11 = z1.a();
        if (a11.f1262c >= 4294967296L) {
            this.f2774f = wVar;
            this.f1218c = 0;
            i7.g gVar = a11.f1264e;
            if (gVar == null) {
                gVar = new i7.g();
                a11.f1264e = gVar;
            }
            gVar.addLast(this);
            return;
        }
        a11.A(true);
        try {
            l7.h context2 = cVar.getContext();
            Object l5 = a.l(context2, this.f2775m);
            cVar.resumeWith(obj);
            a.g(context2, l5);
            do {
            } while (a11.C());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2772d + ", " + f0.u(this.f2773e) + ']';
    }
}
