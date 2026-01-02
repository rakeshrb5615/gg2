package x8;

import java.io.FileInputStream;
import java.io.RandomAccessFile;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class v extends m {
    @Override // x8.m
    public final u c(y yVar) {
        return new u(new RandomAccessFile(yVar.toFile(), "r"));
    }

    @Override // x8.m
    public final h0 f(y yVar) {
        kotlin.jvm.internal.j.e(yVar, "file");
        return new t(new FileInputStream(yVar.toFile()), j0.f6647d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
