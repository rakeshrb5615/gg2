package a2;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class n1 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f402a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c0 f403b;

    public n1(c0 c0Var) {
        this.f403b = c0Var;
    }

    @Override // a2.w0
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f402a) {
            this.f402a = false;
            this.f403b.l();
        }
    }

    @Override // a2.w0
    public final void b(RecyclerView recyclerView, int i, int i9) {
        if (i == 0 && i9 == 0) {
            return;
        }
        this.f402a = true;
    }
}
