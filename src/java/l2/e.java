package l2;

import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3678a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3679b;

    public /* synthetic */ e(a0 a0Var, int i) {
        this.f3678a = i;
        this.f3679b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3678a) {
            case 0:
                a0 a0Var = this.f3679b;
                long j = a0Var.G2 + 350;
                a0Var.G2 = j;
                boolean z9 = j > 1000;
                if (a0Var.f3613v.getBoolean(a0Var.G0, false) && z9) {
                    float a10 = m2.a.a();
                    a0Var.H.setValue((int) (a10 / 0.016666668f));
                    a0Var.F(a10);
                }
                a0Var.f3613v.edit().putInt(a0Var.F0, (int) a0Var.H.getValue()).apply();
                a0Var.K1.postDelayed(a0Var.L1, 350L);
                return;
            case 1:
                a0 a0Var2 = this.f3679b;
                if (a0Var2.f3573j2) {
                    a0Var2.L();
                    a0Var2.f3573j2 = false;
                }
                a0Var2.M1.postDelayed(a0Var2.N1, 33L);
                return;
            case 2:
                a0 a0Var3 = this.f3679b;
                boolean isSelected = a0Var3.C.isSelected();
                boolean isSelected2 = a0Var3.D.isSelected();
                ViewGroup viewGroup = (ViewGroup) a0Var3.requireView().findViewById(2131362342);
                if (isSelected || isSelected2) {
                    viewGroup.removeView(a0Var3.f3551d);
                    viewGroup.addView(a0Var3.f3551d, 0);
                    i2.y.f(a0Var3.f3551d);
                    return;
                }
                return;
            default:
                this.f3679b.f3573j2 = true;
                return;
        }
    }
}
