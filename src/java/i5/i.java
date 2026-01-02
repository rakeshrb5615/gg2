package i5;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f2716a;

    /* renamed from: b  reason: collision with root package name */
    public int f2717b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2718c;

    public i(k kVar, h hVar) {
        this.f2718c = kVar;
        this.f2716a = kVar.D(hVar.f2714a + 4);
        this.f2717b = hVar.f2715b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i9) {
        if (bArr != null) {
            if ((i | i9) >= 0 && i9 <= bArr.length - i) {
                int i10 = this.f2717b;
                if (i10 > 0) {
                    if (i9 > i10) {
                        i9 = i10;
                    }
                    int i11 = this.f2716a;
                    k kVar = this.f2718c;
                    kVar.A(i11, bArr, i, i9);
                    this.f2716a = kVar.D(this.f2716a + i9);
                    this.f2717b -= i9;
                    return i9;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f2717b == 0) {
            return -1;
        }
        k kVar = this.f2718c;
        kVar.f2720a.seek(this.f2716a);
        int read = kVar.f2720a.read();
        this.f2716a = kVar.D(this.f2716a + 1);
        this.f2717b--;
        return read;
    }
}
