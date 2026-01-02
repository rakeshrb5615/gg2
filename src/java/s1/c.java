package s1;

import c.r;
import g8.y;
import java.util.LinkedHashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a5.a f5781a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5782b = new f();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f5783c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f5784d;

    public c(a5.a aVar) {
        this.f5781a = aVar;
        new LinkedHashSet();
        this.f5783c = new LinkedHashSet();
        this.f5784d = new LinkedHashSet();
    }

    public final void a(e eVar) {
        if (this.f5784d.add(eVar)) {
            this.f5782b.a(this, eVar, -1);
        }
    }

    public final void b(l lVar, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(g2.g.c(i, "Unsupported priority value: ").toString());
        }
        if (this.f5784d.add(lVar)) {
            this.f5782b.a(this, lVar, i);
        }
    }

    public final void c(e eVar, b bVar) {
        f fVar = this.f5782b;
        fVar.getClass();
        if (fVar.f5795g != 0) {
            return;
        }
        r c9 = fVar.c(-1);
        fVar.f5794f = c9;
        fVar.f5795g = -1;
        fVar.f5796h = eVar;
        if (bVar != null) {
            if (c9 != null) {
                c9.f835d.getClass();
            }
            y yVar = fVar.f5789a;
            h hVar = new h(bVar);
            yVar.getClass();
            yVar.e(null, hVar);
        }
    }
}
