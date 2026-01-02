package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j extends o {
    @Override // x.d
    public final void a(d dVar) {
        w.a aVar = (w.a) this.f6532b;
        int i = aVar.f6320s0;
        f fVar = this.f6538h;
        ArrayList arrayList = fVar.f6517l;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = -1;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = ((f) obj).f6514g;
            if (i10 == -1 || i12 < i10) {
                i10 = i12;
            }
            if (i9 < i12) {
                i9 = i12;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i10 + aVar.f6322u0);
        } else {
            fVar.d(i9 + aVar.f6322u0);
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar = this.f6532b;
        if (dVar instanceof w.a) {
            f fVar = this.f6538h;
            fVar.f6509b = true;
            ArrayList arrayList = fVar.f6517l;
            w.a aVar = (w.a) dVar;
            int i = aVar.f6320s0;
            boolean z9 = aVar.f6321t0;
            int i9 = 0;
            if (i == 0) {
                fVar.f6512e = 4;
                while (i9 < aVar.f6422r0) {
                    w.d dVar2 = aVar.f6421q0[i9];
                    if (z9 || dVar2.f6358g0 != 8) {
                        f fVar2 = dVar2.f6352d.f6538h;
                        fVar2.f6516k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i9++;
                }
                m(this.f6532b.f6352d.f6538h);
                m(this.f6532b.f6352d.i);
            } else if (i == 1) {
                fVar.f6512e = 5;
                while (i9 < aVar.f6422r0) {
                    w.d dVar3 = aVar.f6421q0[i9];
                    if (z9 || dVar3.f6358g0 != 8) {
                        f fVar3 = dVar3.f6352d.i;
                        fVar3.f6516k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i9++;
                }
                m(this.f6532b.f6352d.f6538h);
                m(this.f6532b.f6352d.i);
            } else if (i == 2) {
                fVar.f6512e = 6;
                while (i9 < aVar.f6422r0) {
                    w.d dVar4 = aVar.f6421q0[i9];
                    if (z9 || dVar4.f6358g0 != 8) {
                        f fVar4 = dVar4.f6354e.f6538h;
                        fVar4.f6516k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i9++;
                }
                m(this.f6532b.f6354e.f6538h);
                m(this.f6532b.f6354e.i);
            } else if (i != 3) {
            } else {
                fVar.f6512e = 7;
                while (i9 < aVar.f6422r0) {
                    w.d dVar5 = aVar.f6421q0[i9];
                    if (z9 || dVar5.f6358g0 != 8) {
                        f fVar5 = dVar5.f6354e.i;
                        fVar5.f6516k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i9++;
                }
                m(this.f6532b.f6354e.f6538h);
                m(this.f6532b.f6354e.i);
            }
        }
    }

    @Override // x.o
    public final void e() {
        w.d dVar = this.f6532b;
        if (dVar instanceof w.a) {
            int i = ((w.a) dVar).f6320s0;
            f fVar = this.f6538h;
            if (i == 0 || i == 1) {
                dVar.Y = fVar.f6514g;
            } else {
                dVar.Z = fVar.f6514g;
            }
        }
    }

    @Override // x.o
    public final void f() {
        this.f6533c = null;
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
