package n;

import android.widget.AbsListView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e2 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f4113a;

    public e2(g2 g2Var) {
        this.f4113a = g2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i9, int i10) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        g2 g2Var = this.f4113a;
        c2 c2Var = g2Var.f4160x;
        b0 b0Var = g2Var.F;
        if (i != 1 || b0Var.getInputMethodMode() == 2 || b0Var.getContentView() == null) {
            return;
        }
        g2Var.B.removeCallbacks(c2Var);
        c2Var.run();
    }
}
