package v3;

import com.google.android.material.button.MaterialButton;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final int f6211f;

    public j(int i) {
        super(5);
        this.f6211f = i;
    }

    @Override // q4.b
    public final void R(a0 a0Var, float f9) {
        k kVar = (k) a0Var;
        float[] fArr = kVar.H;
        if (fArr != null) {
            int i = this.f6211f;
            if (fArr[i] != f9) {
                fArr[i] = f9;
                a5.a aVar = kVar.J;
                if (aVar != null) {
                    float i9 = kVar.i();
                    MaterialButton materialButton = (MaterialButton) aVar.f561b;
                    int i10 = (int) (i9 * 0.11f);
                    if (materialButton.D != i10) {
                        materialButton.D = i10;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                kVar.invalidateSelf();
            }
        }
    }

    @Override // q4.b
    public final float y(a0 a0Var) {
        float[] fArr = ((k) a0Var).H;
        if (fArr != null) {
            return fArr[this.f6211f];
        }
        return 0.0f;
    }
}
