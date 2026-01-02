package p;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d extends e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c f5050a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5051b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f5052c;

    public d(f fVar) {
        this.f5052c = fVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2 = this.f5050a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f5049d;
            this.f5050a = cVar3;
            this.f5051b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5051b) {
            return this.f5052c.f5053a != null;
        }
        c cVar = this.f5050a;
        return (cVar == null || cVar.f5048c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5051b) {
            this.f5051b = false;
            this.f5050a = this.f5052c.f5053a;
        } else {
            c cVar = this.f5050a;
            this.f5050a = cVar != null ? cVar.f5048c : null;
        }
        return this.f5050a;
    }
}
