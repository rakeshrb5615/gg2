package n7;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class g extends a {
    public g(l7.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != l7.i.f3796a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // l7.c
    public final l7.h getContext() {
        return l7.i.f3796a;
    }
}
