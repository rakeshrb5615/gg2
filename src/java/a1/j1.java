package a1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class j1 extends n7.i implements u7.p {
    @Override // n7.a
    public final l7.c create(Object obj, l7.c cVar) {
        return new n7.i(2, cVar);
    }

    @Override // u7.p
    public final Object invoke(Object obj, Object obj2) {
        h7.l lVar = h7.l.f2236a;
        ((j1) create((g8.d) obj, (l7.c) obj2)).invokeSuspend(lVar);
        return lVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        m7.a aVar = m7.a.f4049a;
        c4.b.e0(obj);
        return h7.l.f2236a;
    }
}
