package z8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class l0 extends a {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7505n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i) {
        super(7);
        this.f7505n = i;
    }

    @Override // z8.a
    public String c(Method method, int i) {
        switch (this.f7505n) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (parameter.isNamePresent()) {
                    return "parameter '" + parameter.getName() + '\'';
                }
                return super.c(method, i);
            default:
                return super.c(method, i);
        }
    }

    @Override // z8.a
    public final Object d(Method method, Object obj, Object[] objArr) {
        switch (this.f7505n) {
            case 0:
                return z0.k(method, obj, objArr);
            default:
                return z0.k(method, obj, objArr);
        }
    }

    @Override // z8.a
    public final boolean f(Method method) {
        switch (this.f7505n) {
            case 0:
                return method.isDefault();
            default:
                return method.isDefault();
        }
    }
}
