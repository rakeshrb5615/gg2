package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class p1 implements l7.f {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f177a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f178b;

    public p1(p1 p1Var, g0 g0Var) {
        this.f177a = p1Var;
        this.f178b = g0Var;
    }

    public final void a(g0 g0Var) {
        if (this.f178b == g0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        p1 p1Var = this.f177a;
        if (p1Var != null) {
            p1Var.a(g0Var);
        }
    }

    @Override // l7.h
    public final Object fold(Object obj, u7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // l7.h
    public final l7.f get(l7.g gVar) {
        return q4.b.r(this, gVar);
    }

    @Override // l7.f
    public final l7.g getKey() {
        return o1.f168a;
    }

    @Override // l7.h
    public final l7.h minusKey(l7.g gVar) {
        return q4.b.G(this, gVar);
    }

    @Override // l7.h
    public final l7.h plus(l7.h hVar) {
        return q4.b.L(this, hVar);
    }
}
