package s7;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] c() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        j.d(bArr, "buf");
        return bArr;
    }
}
