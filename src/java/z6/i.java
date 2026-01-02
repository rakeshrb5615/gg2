package z6;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i extends w6.z {

    /* renamed from: d  reason: collision with root package name */
    public static final h f7412d = new h();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7413a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7414b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7415c = new HashMap();

    public i(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                x6.b bVar = (x6.b) field2.getAnnotation(x6.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f7413a.put(str2, r42);
                    }
                }
                this.f7413a.put(name, r42);
                this.f7414b.put(str, r42);
                this.f7415c.put(r42, name);
            }
        } catch (IllegalAccessException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // w6.z
    public final Object b(e7.a aVar) {
        if (aVar.O() == 9) {
            aVar.K();
            return null;
        }
        String M = aVar.M();
        Enum r02 = (Enum) this.f7413a.get(M);
        return r02 == null ? (Enum) this.f7414b.get(M) : r02;
    }

    @Override // w6.z
    public final void c(e7.b bVar, Object obj) {
        Enum r32 = (Enum) obj;
        bVar.I(r32 == null ? null : (String) this.f7415c.get(r32));
    }
}
