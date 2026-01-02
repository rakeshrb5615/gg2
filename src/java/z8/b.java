package z8;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class b extends l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7469a;

    public /* synthetic */ b(int i) {
        this.f7469a = i;
    }

    @Override // z8.l
    public m a(Type type) {
        switch (this.f7469a) {
            case 0:
                if (RequestBody.class.isAssignableFrom(z0.h(type))) {
                    return a.f7462d;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // z8.l
    public final m b(Type type, Annotation[] annotationArr, s0 s0Var) {
        switch (this.f7469a) {
            case 0:
                if (type == ResponseBody.class) {
                    return z0.l(annotationArr, b9.w.class) ? a.f7463e : a.f7461c;
                } else if (type == Void.class) {
                    return a.f7465m;
                } else {
                    if (z0.f7600b && type == h7.l.class) {
                        return a.f7464f;
                    }
                    return null;
                }
            default:
                if (z0.h(type) != Optional.class) {
                    return null;
                }
                return new j6.o(s0Var.c(z0.g(0, (ParameterizedType) type), annotationArr), 26);
        }
    }
}
