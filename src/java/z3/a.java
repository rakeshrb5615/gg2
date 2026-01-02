package z3;

import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7186a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f7187b;

    public /* synthetic */ a(p pVar, int i) {
        this.f7186a = i;
        this.f7187b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f7186a) {
            case 0:
                d dVar = (d) this.f7187b;
                dVar.s(dVar.t());
                return;
            default:
                k kVar = (k) this.f7187b;
                kVar.f7211l = z9;
                kVar.p();
                if (z9) {
                    return;
                }
                kVar.s(false);
                kVar.f7212m = false;
                return;
        }
    }
}
