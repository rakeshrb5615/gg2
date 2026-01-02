package l2;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class u implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3733b;

    public u(a0 a0Var, int i) {
        this.f3733b = a0Var;
        this.f3732a = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        a0 a0Var = this.f3733b;
        a0Var.f3567h2.removeOnLayoutChangeListener(this);
        LinearLayoutManager linearLayoutManager = a0Var.f3570i2;
        int i16 = this.f3732a;
        View q = linearLayoutManager.q(i16);
        if (q == null) {
            a0Var.f3570i2.d1(i16, 0);
            a0Var.f3567h2.post(new g0.k(this, i16, 4));
            return;
        }
        int width = q.getWidth();
        a0Var.f3570i2.d1(i16, (a0Var.f3567h2.getWidth() / 2) - ((int) (width * 0.38f)));
    }
}
