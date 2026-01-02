package q0;

import android.view.animation.Interpolator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5097a;

    /* renamed from: b  reason: collision with root package name */
    public float f5098b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f5099c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5100d;

    public b1(int i, Interpolator interpolator, long j) {
        this.f5097a = i;
        this.f5099c = interpolator;
        this.f5100d = j;
    }

    public long a() {
        return this.f5100d;
    }

    public float b() {
        Interpolator interpolator = this.f5099c;
        return interpolator != null ? interpolator.getInterpolation(this.f5098b) : this.f5098b;
    }

    public int c() {
        return this.f5097a;
    }

    public void d(float f9) {
        this.f5098b = f9;
    }
}
