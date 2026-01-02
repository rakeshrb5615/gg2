package x8;

import java.io.Closeable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public g f6636a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6636a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f6636a = null;
    }
}
