package j5;

import android.os.Build;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3069a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3070b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3071c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3072d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3073e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3074f;

    public m1(int i, int i9, long j, long j8, boolean z9, int i10) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f3069a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f3070b = i9;
        this.f3071c = j;
        this.f3072d = j8;
        this.f3073e = z9;
        this.f3074f = i10;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f3069a == m1Var.f3069a) {
                String str = Build.MODEL;
                if (str.equals(str) && this.f3070b == m1Var.f3070b && this.f3071c == m1Var.f3071c && this.f3072d == m1Var.f3072d && this.f3073e == m1Var.f3073e && this.f3074f == m1Var.f3074f) {
                    String str2 = Build.MANUFACTURER;
                    if (str2.equals(str2)) {
                        String str3 = Build.PRODUCT;
                        return str3.equals(str3);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3071c;
        long j8 = this.f3072d;
        return ((((((((((((((((this.f3069a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f3070b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f3073e ? 1231 : 1237)) * 1000003) ^ this.f3074f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f3069a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f3070b);
        sb.append(", totalRam=");
        sb.append(this.f3071c);
        sb.append(", diskSpace=");
        sb.append(this.f3072d);
        sb.append(", isEmulator=");
        sb.append(this.f3073e);
        sb.append(", state=");
        sb.append(this.f3074f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return v1.a.n(sb, Build.PRODUCT, "}");
    }
}
