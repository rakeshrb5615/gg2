package d3;

import android.animation.TimeInterpolator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f1080a;

    /* renamed from: b  reason: collision with root package name */
    public long f1081b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f1082c;

    /* renamed from: d  reason: collision with root package name */
    public int f1083d;

    /* renamed from: e  reason: collision with root package name */
    public int f1084e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f1082c;
        return timeInterpolator != null ? timeInterpolator : a.f1074b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1080a == cVar.f1080a && this.f1081b == cVar.f1081b && this.f1083d == cVar.f1083d && this.f1084e == cVar.f1084e) {
                return a().getClass().equals(cVar.a().getClass());
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1080a;
        long j8 = this.f1081b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31)) * 31) + this.f1083d) * 31) + this.f1084e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1080a + " duration: " + this.f1081b + " interpolator: " + a().getClass() + " repeatCount: " + this.f1083d + " repeatMode: " + this.f1084e + "}\n";
    }
}
