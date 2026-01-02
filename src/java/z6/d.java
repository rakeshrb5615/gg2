package z6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d implements w6.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7406a;

    /* renamed from: b  reason: collision with root package name */
    public final y6.c f7407b;

    public /* synthetic */ d(y6.c cVar, int i) {
        this.f7406a = i;
        this.f7407b = cVar;
    }

    @Override // w6.a0
    public final w6.z a(w6.m mVar, d7.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.f7406a;
        y6.c cVar = this.f7407b;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = aVar.f1154b;
                Class cls2 = aVar.f1153a;
                if (Collection.class.isAssignableFrom(cls2)) {
                    Type h9 = y6.i.h(type, cls2, Collection.class);
                    cls = h9 instanceof ParameterizedType ? ((ParameterizedType) h9).getActualTypeArguments()[0] : Object.class;
                    return new c(new m(mVar, mVar.b(new d7.a(cls)), cls), cVar.b(aVar, false));
                }
                return null;
            default:
                Type type2 = aVar.f1154b;
                Class cls3 = aVar.f1153a;
                if (Map.class.isAssignableFrom(cls3)) {
                    if (Properties.class.isAssignableFrom(cls3)) {
                        actualTypeArguments = new Type[]{String.class, String.class};
                    } else {
                        Type h10 = y6.i.h(type2, cls3, Map.class);
                        actualTypeArguments = h10 instanceof ParameterizedType ? ((ParameterizedType) h10).getActualTypeArguments() : new Type[]{cls, cls};
                    }
                    Type type3 = actualTypeArguments[0];
                    Type type4 = actualTypeArguments[1];
                    return new m(this, new m(mVar, (type3 == Boolean.TYPE || type3 == Boolean.class) ? a1.f7379c : mVar.b(new d7.a(type3)), type3), new m(mVar, mVar.b(new d7.a(type4)), type4), cVar.b(aVar, false));
                }
                return null;
        }
    }
}
