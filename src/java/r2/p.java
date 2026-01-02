package r2;

import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p implements o2.g {

    /* renamed from: a  reason: collision with root package name */
    public final Set f5549a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5550b;

    /* renamed from: c  reason: collision with root package name */
    public final r f5551c;

    public p(Set set, j jVar, r rVar) {
        this.f5549a = set;
        this.f5550b = jVar;
        this.f5551c = rVar;
    }

    public final a2.b a(String str, o2.c cVar, o2.e eVar) {
        Set set = this.f5549a;
        if (set.contains(cVar)) {
            return new a2.b(this.f5550b, str, cVar, eVar, this.f5551c, 3);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
