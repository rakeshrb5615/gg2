package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class y extends s {
    public int J;
    public s[] M;
    public ArrayList H = new ArrayList();
    public boolean I = true;
    public boolean K = false;
    public int L = 0;

    @Override // f2.s
    public final s A(q qVar) {
        super.A(qVar);
        return this;
    }

    @Override // f2.s
    public final void B(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((s) this.H.get(i)).B(view);
        }
        this.f1463f.remove(view);
    }

    @Override // f2.s
    public final void C(View view) {
        super.C(view);
        s[] sVarArr = this.M;
        this.M = null;
        if (sVarArr == null) {
            sVarArr = new s[this.H.size()];
        }
        s[] sVarArr2 = (s[]) this.H.toArray(sVarArr);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            sVarArr2[i].C(view);
        }
        Arrays.fill(sVarArr2, (Object) null);
        this.M = sVarArr2;
    }

    @Override // f2.s
    public final void D() {
        if (this.H.isEmpty()) {
            K();
            p();
            return;
        }
        x xVar = new x();
        xVar.f1485b = this;
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((s) obj).a(xVar);
        }
        this.J = this.H.size();
        if (this.I) {
            ArrayList arrayList2 = this.H;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((s) obj2).D();
            }
            return;
        }
        for (int i10 = 1; i10 < this.H.size(); i10++) {
            ((s) this.H.get(i10 - 1)).a(new x((s) this.H.get(i10)));
        }
        s sVar = (s) this.H.get(0);
        if (sVar != null) {
            sVar.D();
        }
    }

    @Override // f2.s
    public final void E(long j) {
        ArrayList arrayList;
        this.f1460c = j;
        if (j < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((s) this.H.get(i)).E(j);
        }
    }

    @Override // f2.s
    public final void F(a.a aVar) {
        this.B = aVar;
        this.L |= 8;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((s) this.H.get(i)).F(aVar);
        }
    }

    @Override // f2.s
    public final void G(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((s) this.H.get(i)).G(timeInterpolator);
            }
        }
        this.f1461d = timeInterpolator;
    }

    @Override // f2.s
    public final void H(a6.e eVar) {
        super.H(eVar);
        this.L |= 4;
        if (this.H != null) {
            for (int i = 0; i < this.H.size(); i++) {
                ((s) this.H.get(i)).H(eVar);
            }
        }
    }

    @Override // f2.s
    public final void I() {
        this.L |= 2;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((s) this.H.get(i)).I();
        }
    }

    @Override // f2.s
    public final void J(long j) {
        this.f1459b = j;
    }

    @Override // f2.s
    public final String L(String str) {
        String L = super.L(str);
        for (int i = 0; i < this.H.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(L);
            sb.append("\n");
            sb.append(((s) this.H.get(i)).L(str + "  "));
            L = sb.toString();
        }
        return L;
    }

    public final void M(s sVar) {
        this.H.add(sVar);
        sVar.f1466o = this;
        long j = this.f1460c;
        if (j >= 0) {
            sVar.E(j);
        }
        if ((this.L & 1) != 0) {
            sVar.G(this.f1461d);
        }
        if ((this.L & 2) != 0) {
            sVar.I();
        }
        if ((this.L & 4) != 0) {
            sVar.H(this.C);
        }
        if ((this.L & 8) != 0) {
            sVar.F(this.B);
        }
    }

    @Override // f2.s
    public final void b(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((s) this.H.get(i)).b(view);
        }
        this.f1463f.add(view);
    }

    @Override // f2.s
    public final void cancel() {
        super.cancel();
        s[] sVarArr = this.M;
        this.M = null;
        if (sVarArr == null) {
            sVarArr = new s[this.H.size()];
        }
        s[] sVarArr2 = (s[]) this.H.toArray(sVarArr);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            sVarArr2[i].cancel();
        }
        Arrays.fill(sVarArr2, (Object) null);
        this.M = sVarArr2;
    }

    @Override // f2.s
    public final void e(a0 a0Var) {
        View view = a0Var.f1400b;
        if (w(view)) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s sVar = (s) obj;
                if (sVar.w(view)) {
                    sVar.e(a0Var);
                    a0Var.f1401c.add(sVar);
                }
            }
        }
    }

    @Override // f2.s
    public final void h(a0 a0Var) {
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((s) this.H.get(i)).h(a0Var);
        }
    }

    @Override // f2.s
    public final void j(a0 a0Var) {
        View view = a0Var.f1400b;
        if (w(view)) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s sVar = (s) obj;
                if (sVar.w(view)) {
                    sVar.j(a0Var);
                    a0Var.f1401c.add(sVar);
                }
            }
        }
    }

    @Override // f2.s
    /* renamed from: m */
    public final s clone() {
        y yVar = (y) super.clone();
        yVar.H = new ArrayList();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            s clone = ((s) this.H.get(i)).clone();
            yVar.H.add(clone);
            clone.f1466o = yVar;
        }
        return yVar;
    }

    @Override // f2.s
    public final void o(ViewGroup viewGroup, j6.s sVar, j6.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f1459b;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            s sVar3 = (s) this.H.get(i);
            if (j > 0 && (this.I || i == 0)) {
                long j8 = sVar3.f1459b;
                if (j8 > 0) {
                    sVar3.J(j8 + j);
                } else {
                    sVar3.J(j);
                }
            }
            sVar3.o(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    @Override // f2.s
    public final void z(View view) {
        super.z(view);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((s) this.H.get(i)).z(view);
        }
    }
}
