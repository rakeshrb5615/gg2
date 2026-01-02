package j3;

import android.view.View;
import androidx.lifecycle.g0;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f2856a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 - i == i14 - i12 && i11 - i9 == i15 - i13) {
            return;
        }
        view.post(new g0(this.f2856a, 9));
    }
}
