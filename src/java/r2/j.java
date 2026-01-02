package r2;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f5536a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5537b;

    /* renamed from: c  reason: collision with root package name */
    public final o2.d f5538c;

    public j(String str, byte[] bArr, o2.d dVar) {
        this.f5536a = str;
        this.f5537b = bArr;
        this.f5538c = dVar;
    }

    public static b8.g a() {
        b8.g gVar = new b8.g(11);
        gVar.f791d = o2.d.f5006a;
        return gVar;
    }

    public final j b(o2.d dVar) {
        b8.g a10 = a();
        a10.t(this.f5536a);
        if (dVar != null) {
            a10.f791d = dVar;
            a10.f790c = this.f5537b;
            return a10.a();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f5536a.equals(jVar.f5536a) && Arrays.equals(this.f5537b, jVar.f5537b) && this.f5538c.equals(jVar.f5538c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5536a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5537b)) * 1000003) ^ this.f5538c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f5537b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f5536a);
        sb.append(", ");
        sb.append(this.f5538c);
        sb.append(", ");
        return v1.a.n(sb, encodeToString, ")");
    }
}
