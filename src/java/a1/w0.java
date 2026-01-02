package a1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class w0 extends kotlin.jvm.internal.k implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z0 f220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(z0 z0Var, int i) {
        super(0);
        this.f219a = i;
        this.f220b = z0Var;
    }

    @Override // u7.a
    public final Object invoke() {
        ParcelFileDescriptor parcelFileDescriptor;
        switch (this.f219a) {
            case 0:
                z0 z0Var = this.f220b;
                String str = z0Var.f252e;
                File file = new File(z0Var.f249b.getAbsolutePath() + str);
                z0.f(z0Var, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open((File) new w0(this.f220b, 0).invoke(), 939524096);
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptor = null;
                }
                try {
                    int fd = parcelFileDescriptor.getFd();
                    NativeSharedCounter nativeSharedCounter = g1.f82b;
                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (nativeCreateSharedCounter >= 0) {
                            g1 g1Var = new g1(nativeCreateSharedCounter);
                            parcelFileDescriptor.close();
                            return g1Var;
                        }
                        throw new IOException("Failed to mmap counter file");
                    }
                    throw new IOException("Failed to truncate counter file");
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            default:
                z0 z0Var2 = this.f220b;
                String str2 = z0Var2.f251d;
                File file2 = new File(z0Var2.f249b.getAbsolutePath() + str2);
                z0.f(z0Var2, file2);
                return file2;
        }
    }
}
