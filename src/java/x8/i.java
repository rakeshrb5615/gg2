package x8;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public interface i extends h0, ReadableByteChannel {
    g a();

    j e(long j);

    String g();

    boolean h();

    String l(long j);

    int m(x xVar);

    void o(long j);

    long p(g gVar);

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j);

    void skip(long j);

    long u();

    String v(Charset charset);

    InputStream w();
}
