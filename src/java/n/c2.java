package n;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4103a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g2 f4104b;

    public /* synthetic */ c2(g2 g2Var, int i) {
        this.f4103a = i;
        this.f4104b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4103a) {
            case 0:
                t1 t1Var = this.f4104b.f4146c;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                    return;
                }
                return;
            default:
                g2 g2Var = this.f4104b;
                t1 t1Var2 = g2Var.f4146c;
                if (t1Var2 == null || !t1Var2.isAttachedToWindow() || g2Var.f4146c.getCount() <= g2Var.f4146c.getChildCount() || g2Var.f4146c.getChildCount() > g2Var.f4155s) {
                    return;
                }
                g2Var.F.setInputMethodMode(2);
                g2Var.c();
                return;
        }
    }
}
