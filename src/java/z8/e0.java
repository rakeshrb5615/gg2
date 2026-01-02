package z8;

import java.lang.reflect.Method;
import okhttp3.Headers;
import okhttp3.internal._HeadersCommonKt;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class e0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7481d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f7482e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7483f;

    public /* synthetic */ e0(Method method, int i, int i9) {
        this.f7481d = i9;
        this.f7482e = method;
        this.f7483f = i;
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        switch (this.f7481d) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers == null) {
                    throw z0.n(this.f7482e, this.f7483f, "Headers parameter must not be null.", new Object[0]);
                }
                Headers.Builder builder = n0Var.f7517f;
                builder.getClass();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    _HeadersCommonKt.a(builder, headers.c(i), headers.e(i));
                }
                return;
            default:
                if (obj != null) {
                    n0Var.f7514c = obj.toString();
                    return;
                }
                throw z0.n(this.f7482e, this.f7483f, "@Url parameter is null.", new Object[0]);
        }
    }
}
