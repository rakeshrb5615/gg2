package r2;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final o2.c f5545a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5546b;

    public m(o2.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f5545a = cVar;
        this.f5546b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f5545a.equals(mVar.f5545a)) {
                return Arrays.equals(this.f5546b, mVar.f5546b);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5545a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5546b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f5545a + ", bytes=[...]}";
    }
}
