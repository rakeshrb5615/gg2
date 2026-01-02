package a1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class i0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final File f98a;

    /* renamed from: b  reason: collision with root package name */
    public final f1 f99b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f100c;

    public i0(File file, f1 f1Var) {
        kotlin.jvm.internal.j.e(f1Var, "serializer");
        this.f98a = file;
        this.f99b = f1Var;
        this.f100c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(2:35|(6:39|40|41|42|(1:44)|45)(2:37|38))|30|31))|64|6|7|(0)(0)|30|31|(2:(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(a1.i0 r7, n7.c r8) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.i0.a(a1.i0, n7.c):java.lang.Object");
    }

    @Override // a1.a
    public final void close() {
        this.f100c.set(true);
    }
}
