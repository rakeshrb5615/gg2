package u8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f6148a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6149b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + a(i >> 12) + a(i >> 8) + a(i >> 4) + a(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f6148a = strArr;
        byte[] bArr = new byte[93];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr[i9] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f6149b = bArr;
    }

    public static final char a(int i) {
        int i9 = i & 15;
        return (char) (i9 < 10 ? i9 + 48 : i9 + 87);
    }
}
