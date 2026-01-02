package z6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class a implements w6.a0 {
    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        Type type = aVar.f1154b;
        boolean z9 = type instanceof GenericArrayType;
        if (z9 || ((type instanceof Class) && ((Class) type).isArray())) {
            Type genericComponentType = z9 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new b(mVar, mVar.b(new d7.a(genericComponentType)), y6.i.g(genericComponentType));
        }
        return null;
    }
}
