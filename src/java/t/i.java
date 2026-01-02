package t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Object f5918a;

    /* renamed from: b  reason: collision with root package name */
    public k f5919b;

    /* renamed from: c  reason: collision with root package name */
    public l f5920c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5921d;

    public final void finalize() {
        l lVar;
        k kVar = this.f5919b;
        if (kVar != null) {
            j jVar = kVar.f5924b;
            if (!jVar.isDone()) {
                jVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5918a, 1));
            }
        }
        if (this.f5921d || (lVar = this.f5920c) == null) {
            return;
        }
        lVar.j(null);
    }
}
