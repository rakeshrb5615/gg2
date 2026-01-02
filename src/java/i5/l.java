package i5;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class l implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f2726c = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f2727a;

    /* renamed from: b  reason: collision with root package name */
    public k f2728b;

    public l(File file) {
        this.f2727a = file;
    }

    @Override // i5.c
    public final void a() {
        g5.g.b(this.f2728b, "There was a problem closing the Crashlytics log file.");
        this.f2728b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    @Override // i5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.f2727a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L39
        Lc:
            r7.c()
            i5.k r0 = r7.f2728b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.C()
            byte[] r0 = new byte[r0]
            i5.k r4 = r7.f2728b     // Catch: java.io.IOException -> L29
            i5.e r5 = new i5.e     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.i(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.e(r6, r5, r4)
        L31:
            h.f r4 = new h.f
            r3 = r3[r1]
            r5 = 2
            r4.<init>(r0, r3, r5)
        L39:
            if (r4 != 0) goto L3d
            r3 = r2
            goto L48
        L3d:
            int r0 = r4.f2040b
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f2041c
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L48:
            if (r3 == 0) goto L52
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = i5.l.f2726c
            r0.<init>(r3, r1)
            return r0
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.l.b():java.lang.String");
    }

    public final void c() {
        File file = this.f2727a;
        if (this.f2728b == null) {
            try {
                this.f2728b = new k(file);
            } catch (IOException e9) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e9);
            }
        }
    }

    @Override // i5.c
    public final void g(long j, String str) {
        c();
        if (this.f2728b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f2728b.c(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f2726c));
            while (!this.f2728b.s() && this.f2728b.C() > 65536) {
                this.f2728b.z();
            }
        } catch (IOException e9) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e9);
        }
    }
}
