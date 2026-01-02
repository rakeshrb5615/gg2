package z6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class s0 implements w6.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7444a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7445b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w6.z f7446c;

    public s0(Class cls, Class cls2, w6.z zVar) {
        this.f7444a = cls;
        this.f7445b = cls2;
        this.f7446c = zVar;
    }

    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        Class cls = aVar.f1153a;
        if (cls == this.f7444a || cls == this.f7445b) {
            return this.f7446c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f7445b.getName() + "+" + this.f7444a.getName() + ",adapter=" + this.f7446c + "]";
    }
}
