package p;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c f5043a;

    /* renamed from: b  reason: collision with root package name */
    public c f5044b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5045c;

    public b(c cVar, c cVar2, int i) {
        this.f5045c = i;
        this.f5043a = cVar2;
        this.f5044b = cVar;
    }

    @Override // p.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f5043a == cVar && cVar == this.f5044b) {
            this.f5044b = null;
            this.f5043a = null;
        }
        c cVar4 = this.f5043a;
        if (cVar4 == cVar) {
            switch (this.f5045c) {
                case 0:
                    cVar2 = cVar4.f5049d;
                    break;
                default:
                    cVar2 = cVar4.f5048c;
                    break;
            }
            this.f5043a = cVar2;
        }
        c cVar5 = this.f5044b;
        if (cVar5 == cVar) {
            c cVar6 = this.f5043a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f5044b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f5045c) {
            case 0:
                return cVar.f5048c;
            default:
                return cVar.f5049d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5044b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f5044b;
        c cVar2 = this.f5043a;
        this.f5044b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
