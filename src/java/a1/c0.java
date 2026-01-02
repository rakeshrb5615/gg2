package a1;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c0 extends n7.i implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f27b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f28c;

    /* renamed from: d  reason: collision with root package name */
    public Object f29d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f30e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Serializable f31f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, l7.h hVar, u7.p pVar, l7.c cVar) {
        super(1, cVar);
        this.f28c = g0Var;
        this.f30e = hVar;
        this.f31f = (n7.i) pVar;
    }

    @Override // n7.a
    public final l7.c create(l7.c cVar) {
        switch (this.f26a) {
            case 0:
                return new c0((kotlin.jvm.internal.r) this.f30e, this.f28c, this.f31f, cVar);
            default:
                return new c0(this.f28c, (l7.h) this.f30e, (u7.p) ((n7.i) this.f31f), cVar);
        }
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        l7.c cVar = (l7.c) obj;
        switch (this.f26a) {
            case 0:
                return ((c0) create(cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((c0) create(cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kotlin.jvm.internal.r rVar, g0 g0Var, kotlin.jvm.internal.p pVar, l7.c cVar) {
        super(1, cVar);
        this.f30e = rVar;
        this.f28c = g0Var;
        this.f31f = pVar;
    }
}
