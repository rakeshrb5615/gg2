package c4;

import android.content.Context;
import java.io.File;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f927a;

    public m(Context context) {
        this.f927a = context;
    }

    public static long a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            long j = 0;
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j += a(file2);
                }
            }
            return j;
        }
        return file.length();
    }
}
