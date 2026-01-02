package b7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final Method f762f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f763g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f764h;
    public final Method i;

    public b() {
        super(3);
        this.f762f = Class.class.getMethod("isRecord", null);
        this.f763g = Class.class.getMethod("getRecordComponents", null);
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f764h = cls.getMethod("getName", null);
        this.i = cls.getMethod("getType", null);
    }

    @Override // q4.b
    public final boolean E(Class cls) {
        try {
            return ((Boolean) this.f762f.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e9) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e9);
        }
    }

    @Override // q4.b
    public final Method s(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e9) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e9);
        }
    }

    @Override // q4.b
    public final Constructor t(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f763g.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.i.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e9) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e9);
        }
    }

    @Override // q4.b
    public final String[] w(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f763g.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f764h.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e9) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e9);
        }
    }
}
