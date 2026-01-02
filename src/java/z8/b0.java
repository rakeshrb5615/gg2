package z8;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class b0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final Method f7470d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7471e;

    /* renamed from: f  reason: collision with root package name */
    public final m f7472f;

    public b0(Method method, int i, m mVar) {
        this.f7470d = method;
        this.f7471e = i;
        this.f7472f = mVar;
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        int i = this.f7471e;
        Method method = this.f7470d;
        if (obj == null) {
            throw z0.n(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            n0Var.f7520k = (RequestBody) this.f7472f.e(obj);
        } catch (IOException e9) {
            throw z0.o(method, e9, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
