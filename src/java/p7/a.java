package p7;

import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f5090a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.d(parameterTypes, "getParameterTypes(...)");
                if (j.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f5090a = method;
        int length2 = methods.length;
        for (int i9 = 0; i9 < length2 && !j.a(methods[i9].getName(), "getSuppressed"); i9++) {
        }
    }
}
