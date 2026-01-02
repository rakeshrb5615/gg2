package l2;

import android.widget.Toast;
import com.google.android.material.slider.Slider;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class i implements i3.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3699b;

    public /* synthetic */ i(a0 a0Var, int i) {
        this.f3698a = i;
        this.f3699b = a0Var;
    }

    @Override // i3.g
    public final void a(int i, boolean z9) {
        boolean z10;
        switch (this.f3698a) {
            case 0:
                a0 a0Var = this.f3699b;
                if (!z9) {
                    a0Var.getClass();
                    return;
                }
                boolean z11 = a0Var.f3613v.getBoolean(a0Var.H0, false);
                boolean z12 = a0Var.f3613v.getBoolean(a0Var.I0, false);
                if (!z11) {
                    a0Var.H();
                    return;
                } else if (!z12 && (a0Var.B2.isVisible() || a0Var.D2.isVisible())) {
                    Toast.makeText(a0Var.f3540a, 2131952458, 0).show();
                    return;
                } else if (i == 2131362350 && !a0Var.n1) {
                    a0Var.I();
                    return;
                } else if (i == 2131362347 && !a0Var.f3572j1 && !a0Var.n1) {
                    a0Var.I();
                    return;
                } else {
                    a0Var.f3613v.edit().putInt(a0Var.J0, i == 2131362350 ? 5 : i == 2131362347 ? 30 : i == 2131362345 ? 60 : i == 2131362346 ? 120 : i == 2131362348 ? 180 : 240).apply();
                    if (a0Var.B2.isVisible()) {
                        a0Var.B2.f();
                    }
                    if (a0Var.D2.isVisible()) {
                        a0Var.D2.f();
                        return;
                    }
                    return;
                }
            default:
                a0 a0Var2 = this.f3699b;
                if (a0Var2.O2 || !z9) {
                    return;
                }
                Slider[] sliderArr = a0Var2.C2.f3536b;
                boolean z13 = true;
                if (i == 2131362315) {
                    z10 = true;
                    z13 = false;
                } else if (i == 2131362311) {
                    z10 = false;
                } else {
                    z10 = false;
                    z13 = false;
                }
                sliderArr[0].setEnabled(z13);
                a0Var2.f3613v.edit().putBoolean(a0Var2.P0, z10).putBoolean(a0Var2.Q0, z13).apply();
                a0Var2.g(a0Var2.f3585n2, i);
                a0Var2.i(sliderArr);
                return;
        }
    }
}
