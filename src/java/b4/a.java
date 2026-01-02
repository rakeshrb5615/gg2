package b4;

import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f711a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f712b;

    public /* synthetic */ a(Object obj, int i) {
        this.f711a = i;
        this.f712b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (this.f711a) {
            case 0:
                b bVar = (b) this.f712b;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                bVar.Y = iArr[0];
                view.getWindowVisibleDisplayFrame(bVar.R);
                return;
            default:
                throw null;
        }
    }
}
