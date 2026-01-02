package z8;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class d0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7477d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f7478e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7479f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7480g;

    public /* synthetic */ d0(Method method, int i, boolean z9, int i9) {
        this.f7477d = i9;
        this.f7478e = method;
        this.f7479f = i;
        this.f7480g = z9;
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        switch (this.f7477d) {
            case 0:
                Map map = (Map) obj;
                int i = this.f7479f;
                Method method = this.f7478e;
                if (map == null) {
                    throw z0.n(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw z0.n(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw z0.n(method, i, v1.a.l("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String obj2 = value.toString();
                    if (obj2 == null) {
                        throw z0.n(method, i, "Field map value '" + value + "' converted to null by " + a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    n0Var.a(str, obj2, this.f7480g);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i9 = this.f7479f;
                Method method2 = this.f7478e;
                if (map2 == null) {
                    throw z0.n(method2, i9, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw z0.n(method2, i9, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw z0.n(method2, i9, v1.a.l("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    n0Var.b(str2, value2.toString(), this.f7480g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i10 = this.f7479f;
                Method method3 = this.f7478e;
                if (map3 == null) {
                    throw z0.n(method3, i10, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw z0.n(method3, i10, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw z0.n(method3, i10, v1.a.l("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String obj3 = value3.toString();
                    if (obj3 == null) {
                        throw z0.n(method3, i10, "Query map value '" + value3 + "' converted to null by " + a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    n0Var.d(str3, obj3, this.f7480g);
                }
                return;
        }
    }
}
