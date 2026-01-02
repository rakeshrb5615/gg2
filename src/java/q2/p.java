package q2;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5283a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5284b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f5283a = bArr;
        this.f5284b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z9 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f5283a, z9 ? pVar.f5283a : pVar.f5283a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f5284b, z9 ? pVar2.f5284b : pVar2.f5284b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f5283a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5284b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f5283a) + ", encryptedBlob=" + Arrays.toString(this.f5284b) + "}";
    }
}
