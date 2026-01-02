package t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j extends h {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ k f5922n;

    public j(k kVar) {
        this.f5922n = kVar;
    }

    @Override // t.h
    public final String h() {
        i iVar = (i) this.f5922n.f5923a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f5918a + "]";
    }
}
