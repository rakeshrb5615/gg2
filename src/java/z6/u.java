package z6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class u extends r {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f7450e;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f7451b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7452c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7453d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f7450e = hashMap;
    }

    public u(Class cls, t tVar) {
        super(tVar);
        this.f7453d = new HashMap();
        q4.b bVar = b7.c.f765a;
        Constructor t7 = bVar.t(cls);
        this.f7451b = t7;
        b7.c.f(t7);
        String[] w8 = bVar.w(cls);
        for (int i = 0; i < w8.length; i++) {
            this.f7453d.put(w8[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f7451b.getParameterTypes();
        this.f7452c = new Object[parameterTypes.length];
        for (int i9 = 0; i9 < parameterTypes.length; i9++) {
            this.f7452c[i9] = f7450e.get(parameterTypes[i9]);
        }
    }

    @Override // z6.r
    public final Object d() {
        return (Object[]) this.f7452c.clone();
    }

    @Override // z6.r
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f7451b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e9) {
            q4.b bVar = b7.c.f765a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + b7.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + b7.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + b7.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // z6.r
    public final void f(Object obj, e7.a aVar, q qVar) {
        Object[] objArr = (Object[]) obj;
        String str = qVar.f7433c;
        Integer num = (Integer) this.f7453d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + b7.c.b(this.f7451b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object b10 = qVar.f7436f.b(aVar);
        if (b10 != null || !qVar.f7437g) {
            objArr[intValue] = b10;
            return;
        }
        StringBuilder q = v1.a.q("null is not allowed as value for record component '", str, "' of primitive type; at path ");
        q.append(aVar.A(false));
        throw new RuntimeException(q.toString());
    }
}
