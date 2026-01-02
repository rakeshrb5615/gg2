package x8;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public interface f0 extends Closeable, Flushable {
    j0 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    void flush();

    void k(g gVar, long j);
}
