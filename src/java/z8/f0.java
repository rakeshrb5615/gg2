package z8;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class f0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7484d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Method f7485e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7486f;

    /* renamed from: g  reason: collision with root package name */
    public final m f7487g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f7488h;

    public f0(Method method, int i, Headers headers, m mVar) {
        this.f7485e = method;
        this.f7486f = i;
        this.f7488h = headers;
        this.f7487g = mVar;
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        switch (this.f7484d) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    n0Var.c((Headers) this.f7488h, (RequestBody) this.f7487g.e(obj));
                    return;
                } catch (IOException e9) {
                    throw z0.n(this.f7485e, this.f7486f, "Unable to convert " + obj + " to RequestBody", e9);
                }
            default:
                Map map = (Map) obj;
                int i = this.f7486f;
                Method method = this.f7485e;
                if (map == null) {
                    throw z0.n(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw z0.n(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw z0.n(method, i, v1.a.l("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", v1.a.l("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.f7488h};
                    Headers.b.getClass();
                    n0Var.c(Headers.Companion.a(strArr), (RequestBody) this.f7487g.e(value));
                }
                return;
        }
    }

    public f0(Method method, int i, m mVar, String str) {
        this.f7485e = method;
        this.f7486f = i;
        this.f7487g = mVar;
        this.f7488h = str;
    }
}
