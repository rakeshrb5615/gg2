package a1;

import java.io.File;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class j0 extends kotlin.jvm.internal.k implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f114a = new kotlin.jvm.internal.k(1);

    @Override // u7.l
    public final Object invoke(Object obj) {
        File file = (File) obj;
        kotlin.jvm.internal.j.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new k1(absolutePath);
    }
}
