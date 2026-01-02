package g2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class m extends l {

    /* renamed from: a  reason: collision with root package name */
    public h0.d[] f1728a;

    /* renamed from: b  reason: collision with root package name */
    public String f1729b;

    /* renamed from: c  reason: collision with root package name */
    public int f1730c;

    public m() {
        this.f1728a = null;
        this.f1730c = 0;
    }

    public h0.d[] getPathData() {
        return this.f1728a;
    }

    public String getPathName() {
        return this.f1729b;
    }

    public void setPathData(h0.d[] dVarArr) {
        h0.d[] dVarArr2 = this.f1728a;
        boolean z9 = false;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= dVarArr2.length) {
                    z9 = true;
                    break;
                }
                h0.d dVar = dVarArr2[i];
                char c9 = dVar.f2130a;
                h0.d dVar2 = dVarArr[i];
                if (c9 != dVar2.f2130a || dVar.f2131b.length != dVar2.f2131b.length) {
                    break;
                }
                i++;
            }
        }
        if (!z9) {
            this.f1728a = a.a.p(dVarArr);
            return;
        }
        h0.d[] dVarArr3 = this.f1728a;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            dVarArr3[i9].f2130a = dVarArr[i9].f2130a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i9].f2131b;
                if (i10 < fArr.length) {
                    dVarArr3[i9].f2131b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f1728a = null;
        this.f1730c = 0;
        this.f1729b = mVar.f1729b;
        this.f1728a = a.a.p(mVar.f1728a);
    }
}
