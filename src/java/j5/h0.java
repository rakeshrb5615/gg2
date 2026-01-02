package j5;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h0 extends r1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f2975a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2976b;

    public h0(String str, byte[] bArr) {
        this.f2975a = str;
        this.f2976b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r1 r1Var = (r1) obj;
            h0 h0Var = (h0) r1Var;
            if (this.f2975a.equals(h0Var.f2975a)) {
                if (Arrays.equals(this.f2976b, r1Var instanceof h0 ? ((h0) r1Var).f2976b : h0Var.f2976b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2975a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2976b);
    }

    public final String toString() {
        return "File{filename=" + this.f2975a + ", contents=" + Arrays.toString(this.f2976b) + "}";
    }
}
