package m;

import android.view.ActionProvider;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a  reason: collision with root package name */
    public j6.o f3921a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionProvider f3922b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f3922b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z9) {
        j6.o oVar = this.f3921a;
        if (oVar != null) {
            m mVar = ((o) oVar.f3275b).f3909n;
            mVar.f3881h = true;
            mVar.p(true);
        }
    }
}
