package r2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f5528a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f5529b;

    /* renamed from: c  reason: collision with root package name */
    public final m f5530c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5531d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5532e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f5533f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f5534g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5535h;
    public final byte[] i;
    public final byte[] j;

    public i(String str, Integer num, m mVar, long j, long j8, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f5528a = str;
        this.f5529b = num;
        this.f5530c = mVar;
        this.f5531d = j;
        this.f5532e = j8;
        this.f5533f = hashMap;
        this.f5534g = num2;
        this.f5535h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f5533f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f5533f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r2.h] */
    public final h c() {
        ?? obj = new Object();
        String str = this.f5528a;
        if (str != null) {
            obj.f5520a = str;
            obj.f5521b = this.f5529b;
            obj.f5526g = this.f5534g;
            obj.f5527h = this.f5535h;
            obj.i = this.i;
            obj.j = this.j;
            m mVar = this.f5530c;
            if (mVar != null) {
                obj.f5522c = mVar;
                obj.f5523d = Long.valueOf(this.f5531d);
                obj.f5524e = Long.valueOf(this.f5532e);
                obj.f5525f = new HashMap(this.f5533f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str2 = iVar.f5535h;
            Integer num3 = iVar.f5534g;
            Integer num4 = iVar.f5529b;
            if (this.f5528a.equals(iVar.f5528a) && ((num = this.f5529b) != null ? num.equals(num4) : num4 == null) && this.f5530c.equals(iVar.f5530c) && this.f5531d == iVar.f5531d && this.f5532e == iVar.f5532e && this.f5533f.equals(iVar.f5533f) && ((num2 = this.f5534g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f5535h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.i, iVar.i) && Arrays.equals(this.j, iVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f5528a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5529b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f5531d;
        long j8 = this.f5532e;
        int hashCode3 = (((((((((hashCode ^ hashCode2) * 1000003) ^ this.f5530c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f5533f.hashCode()) * 1000003;
        Integer num2 = this.f5534g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f5535h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f5528a + ", code=" + this.f5529b + ", encodedPayload=" + this.f5530c + ", eventMillis=" + this.f5531d + ", uptimeMillis=" + this.f5532e + ", autoMetadata=" + this.f5533f + ", productId=" + this.f5534g + ", pseudonymousId=" + this.f5535h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
