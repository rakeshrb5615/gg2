package g5;

import j5.f0;
import j5.q1;
import java.io.File;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class i implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1790a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1790a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                return ((f0) ((q1) obj)).f2959a.compareTo(((f0) ((q1) obj2)).f2959a);
            case 2:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                String name = ((File) obj).getName();
                int i = m5.a.f4010f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    byte b10 = bArr[i9];
                    byte b11 = bArr2[i9];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                return Float.compare(((n2.c) obj).f4449c, ((n2.c) obj2).f4449c);
        }
    }
}
