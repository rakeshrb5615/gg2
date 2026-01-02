package j3;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f2859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2860b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f2861c;

    public c(int i) {
        this.f2859a = i;
    }

    public final int a() {
        switch (this.f2860b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2861c;
                if (carouselLayoutManager.F0()) {
                    return carouselLayoutManager.f498n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f2860b = i;
        switch (i) {
            case 1:
                this.f2861c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f2861c = carouselLayoutManager;
                return;
        }
    }
}
