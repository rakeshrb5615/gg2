package a2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public int f306a;

    /* renamed from: b  reason: collision with root package name */
    public int f307b;

    /* renamed from: c  reason: collision with root package name */
    public int f308c;

    /* renamed from: d  reason: collision with root package name */
    public int f309d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f310e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f311f;

    /* renamed from: g  reason: collision with root package name */
    public int f312g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f309d;
        if (i >= 0) {
            this.f309d = -1;
            recyclerView.Q(i);
            this.f311f = false;
        } else if (!this.f311f) {
            this.f312g = 0;
        } else {
            Interpolator interpolator = this.f310e;
            if (interpolator != null && this.f308c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i9 = this.f308c;
            if (i9 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.h0.c(this.f306a, this.f307b, i9, interpolator);
            int i10 = this.f312g + 1;
            this.f312g = i10;
            if (i10 > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f311f = false;
        }
    }
}
