package n;

import android.database.DataSetObserver;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d2 extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f4109a;

    public d2(g2 g2Var) {
        this.f4109a = g2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        g2 g2Var = this.f4109a;
        if (g2Var.F.isShowing()) {
            g2Var.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f4109a.dismiss();
    }
}
