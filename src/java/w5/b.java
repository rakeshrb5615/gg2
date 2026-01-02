package w5;

import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f6442a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f6442a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f6442a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i9) {
        int i10;
        if (i >= 0 && i <= bArr.length && i9 >= 0 && (i10 = i + i9) <= bArr.length && i10 >= 0) {
            this.f6442a += i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
