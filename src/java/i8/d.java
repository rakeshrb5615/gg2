package i8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List f2769a;

    static {
        try {
            Iterator it = Arrays.asList(new e8.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f2769a = a8.h.X(new a8.a(new a8.i(it, 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
