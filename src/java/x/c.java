package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends o {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f6498k;

    /* renamed from: l  reason: collision with root package name */
    public int f6499l;

    public c(w.d dVar, int i) {
        super(dVar);
        w.d dVar2;
        ArrayList arrayList = new ArrayList();
        this.f6498k = arrayList;
        this.f6536f = i;
        w.d dVar3 = this.f6532b;
        w.d m9 = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m9;
            if (dVar3 == null) {
                break;
            }
            m9 = dVar3.m(this.f6536f);
        }
        this.f6532b = dVar2;
        int i9 = this.f6536f;
        arrayList.add(i9 == 0 ? dVar2.f6352d : i9 == 1 ? dVar2.f6354e : null);
        w.d l5 = dVar2.l(this.f6536f);
        while (l5 != null) {
            int i10 = this.f6536f;
            arrayList.add(i10 == 0 ? l5.f6352d : i10 == 1 ? l5.f6354e : null);
            l5 = l5.l(this.f6536f);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            o oVar = (o) obj;
            int i12 = this.f6536f;
            if (i12 == 0) {
                oVar.f6532b.f6348b = this;
            } else if (i12 == 1) {
                oVar.f6532b.f6350c = this;
            }
        }
        if (this.f6536f == 0 && ((w.e) this.f6532b.T).f6388v0 && arrayList.size() > 1) {
            this.f6532b = ((o) arrayList.get(arrayList.size() - 1)).f6532b;
        }
        this.f6499l = this.f6536f == 0 ? this.f6532b.f6361i0 : this.f6532b.f6362j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0392, code lost:
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.a(x.d):void");
    }

    @Override // x.o
    public final void d() {
        ArrayList arrayList = this.f6498k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        w.d dVar = ((o) arrayList.get(0)).f6532b;
        w.d dVar2 = ((o) arrayList.get(size2 - 1)).f6532b;
        int i9 = this.f6536f;
        f fVar = this.i;
        f fVar2 = this.f6538h;
        if (i9 == 0) {
            w.c cVar = dVar.I;
            w.c cVar2 = dVar2.K;
            f i10 = o.i(cVar, 0);
            int e9 = cVar.e();
            w.d m9 = m();
            if (m9 != null) {
                e9 = m9.I.e();
            }
            if (i10 != null) {
                o.b(fVar2, i10, e9);
            }
            f i11 = o.i(cVar2, 0);
            int e10 = cVar2.e();
            w.d n9 = n();
            if (n9 != null) {
                e10 = n9.K.e();
            }
            if (i11 != null) {
                o.b(fVar, i11, -e10);
            }
        } else {
            w.c cVar3 = dVar.J;
            w.c cVar4 = dVar2.L;
            f i12 = o.i(cVar3, 1);
            int e11 = cVar3.e();
            w.d m10 = m();
            if (m10 != null) {
                e11 = m10.J.e();
            }
            if (i12 != null) {
                o.b(fVar2, i12, e11);
            }
            f i13 = o.i(cVar4, 1);
            int e12 = cVar4.e();
            w.d n10 = n();
            if (n10 != null) {
                e12 = n10.L.e();
            }
            if (i13 != null) {
                o.b(fVar, i13, -e12);
            }
        }
        fVar2.f6508a = this;
        fVar.f6508a = this;
    }

    @Override // x.o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6498k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // x.o
    public final void f() {
        this.f6533c = null;
        ArrayList arrayList = this.f6498k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).f();
        }
    }

    @Override // x.o
    public final long j() {
        ArrayList arrayList = this.f6498k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            j = oVar.i.f6513f + oVar.j() + j + oVar.f6538h.f6513f;
        }
        return j;
    }

    @Override // x.o
    public final boolean k() {
        ArrayList arrayList = this.f6498k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final w.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6498k;
            if (i >= arrayList.size()) {
                return null;
            }
            w.d dVar = ((o) arrayList.get(i)).f6532b;
            if (dVar.f6358g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final w.d n() {
        ArrayList arrayList = this.f6498k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w.d dVar = ((o) arrayList.get(size)).f6532b;
            if (dVar.f6358g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f6536f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f6498k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
