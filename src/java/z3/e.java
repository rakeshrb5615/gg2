package z3;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e extends p {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f7201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i) {
        super(oVar);
        this.f7201e = i;
    }

    @Override // z3.p
    public void q() {
        switch (this.f7201e) {
            case 0:
                o oVar = this.f7243b;
                oVar.f7236u = null;
                CheckableImageButton checkableImageButton = oVar.f7229m;
                checkableImageButton.setOnLongClickListener(null);
                y0.d.i(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
