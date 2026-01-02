package x;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i extends o {
    @Override // x.d
    public final void a(d dVar) {
        f fVar = this.f6538h;
        if (fVar.f6510c && !fVar.j) {
            fVar.d((int) ((((f) fVar.f6517l.get(0)).f6514g * ((w.h) this.f6532b).f6415q0) + 0.5f));
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar = this.f6532b;
        w.h hVar = (w.h) dVar;
        int i = hVar.f6416r0;
        int i9 = hVar.f6417s0;
        int i10 = hVar.f6419u0;
        f fVar = this.f6538h;
        if (i10 == 1) {
            if (i != -1) {
                fVar.f6517l.add(dVar.T.f6352d.f6538h);
                this.f6532b.T.f6352d.f6538h.f6516k.add(fVar);
                fVar.f6513f = i;
            } else if (i9 != -1) {
                fVar.f6517l.add(dVar.T.f6352d.i);
                this.f6532b.T.f6352d.i.f6516k.add(fVar);
                fVar.f6513f = -i9;
            } else {
                fVar.f6509b = true;
                fVar.f6517l.add(dVar.T.f6352d.i);
                this.f6532b.T.f6352d.i.f6516k.add(fVar);
            }
            m(this.f6532b.f6352d.f6538h);
            m(this.f6532b.f6352d.i);
            return;
        }
        if (i != -1) {
            fVar.f6517l.add(dVar.T.f6354e.f6538h);
            this.f6532b.T.f6354e.f6538h.f6516k.add(fVar);
            fVar.f6513f = i;
        } else if (i9 != -1) {
            fVar.f6517l.add(dVar.T.f6354e.i);
            this.f6532b.T.f6354e.i.f6516k.add(fVar);
            fVar.f6513f = -i9;
        } else {
            fVar.f6509b = true;
            fVar.f6517l.add(dVar.T.f6354e.i);
            this.f6532b.T.f6354e.i.f6516k.add(fVar);
        }
        m(this.f6532b.f6354e.f6538h);
        m(this.f6532b.f6354e.i);
    }

    @Override // x.o
    public final void e() {
        w.d dVar = this.f6532b;
        int i = ((w.h) dVar).f6419u0;
        f fVar = this.f6538h;
        if (i == 1) {
            dVar.Y = fVar.f6514g;
        } else {
            dVar.Z = fVar.f6514g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f6538h.c();
    }

    @Override // x.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f6538h;
        fVar2.f6516k.add(fVar);
        fVar.f6517l.add(fVar2);
    }
}
