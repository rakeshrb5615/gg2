package q0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class w implements x {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollFeedbackProvider f5196a;

    public w(NestedScrollView nestedScrollView) {
        this.f5196a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // q0.x
    public final void onScrollLimit(int i, int i9, int i10, boolean z9) {
        this.f5196a.onScrollLimit(i, i9, i10, z9);
    }

    @Override // q0.x
    public final void onScrollProgress(int i, int i9, int i10, int i11) {
        this.f5196a.onScrollProgress(i, i9, i10, i11);
    }
}
