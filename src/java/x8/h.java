package x8;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public interface h extends f0, WritableByteChannel {
    g a();

    h d(long j);

    @Override // x8.f0, java.io.Flushable
    void flush();

    h j(j jVar);

    h n(int i, byte[] bArr);

    h q(String str);

    OutputStream r();

    h write(byte[] bArr);

    h writeByte(int i);

    h writeInt(int i);

    h writeShort(int i);
}
