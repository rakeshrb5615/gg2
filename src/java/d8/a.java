package d8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class a extends r1 implements l7.c, c0 {

    /* renamed from: c  reason: collision with root package name */
    public final l7.h f1156c;

    public a(l7.h hVar, boolean z9) {
        super(z9);
        x((e1) hVar.get(b0.f1162b));
        this.f1156c = hVar.plus(this);
    }

    @Override // d8.r1
    public final void F(Object obj) {
        if (!(obj instanceof w)) {
            P(obj);
            return;
        }
        w wVar = (w) obj;
        O(w.f1255b.get(wVar) != 0, wVar.f1256a);
    }

    public void O(boolean z9, Throwable th) {
    }

    public void P(Object obj) {
    }

    public final void Q(d0 d0Var, a aVar, u7.p pVar) {
        Object invoke;
        int ordinal = d0Var.ordinal();
        h7.l lVar = h7.l.f2236a;
        if (ordinal == 0) {
            try {
                i8.a.h(lVar, q4.b.C(q4.b.k(aVar, this, pVar)));
            } finally {
                resumeWith(c4.b.p(th));
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.j.e(pVar, "<this>");
                q4.b.C(q4.b.k(aVar, this, pVar)).resumeWith(lVar);
            } else if (ordinal != 3) {
                throw new RuntimeException();
            } else {
                try {
                    l7.h hVar = this.f1156c;
                    Object l5 = i8.a.l(hVar, null);
                    if (pVar instanceof n7.a) {
                        kotlin.jvm.internal.u.a(2, pVar);
                        invoke = pVar.invoke(aVar, this);
                    } else {
                        invoke = q4.b.U(pVar, aVar, this);
                    }
                    i8.a.g(hVar, l5);
                    if (invoke != m7.a.f4049a) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    @Override // d8.c0
    public final l7.h a() {
        return this.f1156c;
    }

    @Override // l7.c
    public final l7.h getContext() {
        return this.f1156c;
    }

    @Override // d8.r1
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // l7.c
    public final void resumeWith(Object obj) {
        Throwable a10 = h7.h.a(obj);
        if (a10 != null) {
            obj = new w(false, a10);
        }
        Object B = B(obj);
        if (B == f0.f1189e) {
            return;
        }
        g(B);
    }

    @Override // d8.r1
    public final void w(a5.o oVar) {
        f0.l(oVar, this.f1156c);
    }
}
