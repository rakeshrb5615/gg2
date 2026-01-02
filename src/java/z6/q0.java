package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class q0 implements w6.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7439a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7440b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w6.z f7441c;

    public /* synthetic */ q0(Class cls, w6.z zVar, int i) {
        this.f7439a = i;
        this.f7440b = cls;
        this.f7441c = zVar;
    }

    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        switch (this.f7439a) {
            case 0:
                if (aVar.f1153a == this.f7440b) {
                    return this.f7441c;
                }
                return null;
            default:
                Class<?> cls = aVar.f1153a;
                if (this.f7440b.isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f7439a) {
            case 0:
                return "Factory[type=" + this.f7440b.getName() + ",adapter=" + this.f7441c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f7440b.getName() + ",adapter=" + this.f7441c + "]";
        }
    }
}
