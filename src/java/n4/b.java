package n4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends d {

    /* renamed from: d  reason: collision with root package name */
    public final char[] f4860d;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f4860d = new char[512];
        char[] cArr = aVar.f4856b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f4860d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }
}
