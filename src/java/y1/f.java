package y1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f6748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6749b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6750c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6751d;

    public f(int i, int i9, long j, long j8) {
        this.f6748a = i;
        this.f6749b = i9;
        this.f6750c = j;
        this.f6751d = j8;
    }

    public static f a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            f fVar = new f(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return fVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6748a);
            dataOutputStream.writeInt(this.f6749b);
            dataOutputStream.writeLong(this.f6750c);
            dataOutputStream.writeLong(this.f6751d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f)) {
            f fVar = (f) obj;
            if (this.f6749b == fVar.f6749b && this.f6750c == fVar.f6750c && this.f6748a == fVar.f6748a && this.f6751d == fVar.f6751d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6749b), Long.valueOf(this.f6750c), Integer.valueOf(this.f6748a), Long.valueOf(this.f6751d));
    }
}
