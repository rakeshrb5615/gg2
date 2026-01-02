package a2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b1 extends k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f282a;

    public b1(RecyclerView recyclerView) {
        this.f282a = recyclerView;
    }

    @Override // a2.k0
    public final void a() {
        RecyclerView recyclerView = this.f282a;
        recyclerView.k((String) null);
        recyclerView.k0.f331f = true;
        recyclerView.X(true);
        if (recyclerView.e.h()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
