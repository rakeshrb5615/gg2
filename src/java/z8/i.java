package z8;

import java.lang.reflect.Type;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7497a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f7498b;

    public /* synthetic */ i(int i, Type type) {
        this.f7497a = i;
        this.f7498b = type;
    }

    @Override // z8.f
    public final Object a(z zVar) {
        switch (this.f7497a) {
            case 0:
                j jVar = new j(zVar);
                zVar.f(new h(jVar, 0));
                return jVar;
            default:
                j jVar2 = new j(zVar);
                zVar.f(new h(jVar2, 1));
                return jVar2;
        }
    }

    @Override // z8.f
    public final Type c() {
        switch (this.f7497a) {
            case 0:
                return this.f7498b;
            default:
                return this.f7498b;
        }
    }
}
