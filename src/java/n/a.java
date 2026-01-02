package n;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a implements q0.u0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4076a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f4077b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f4078c;

    public a(ActionBarContextView actionBarContextView) {
        this.f4078c = actionBarContextView;
    }

    @Override // q0.u0
    public final void a() {
        if (this.f4076a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f4078c;
        actionBarContextView.f = null;
        ActionBarContextView.b(actionBarContextView, this.f4077b);
    }

    @Override // q0.u0
    public final void b() {
        this.f4076a = true;
    }

    @Override // q0.u0
    public final void c() {
        ActionBarContextView.a(this.f4078c);
        this.f4076a = false;
    }
}
