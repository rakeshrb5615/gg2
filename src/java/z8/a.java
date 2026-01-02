package z8;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public class a implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7460b = new a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final a f7461c = new a(1);

    /* renamed from: d  reason: collision with root package name */
    public static final a f7462d = new a(2);

    /* renamed from: e  reason: collision with root package name */
    public static final a f7463e = new a(3);

    /* renamed from: f  reason: collision with root package name */
    public static final a f7464f = new a(4);

    /* renamed from: m  reason: collision with root package name */
    public static final a f7465m = new a(5);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7466a;

    public /* synthetic */ a(int i) {
        this.f7466a = i;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new o(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object d(Method method, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x8.g] */
    @Override // z8.m
    public Object e(Object obj) {
        switch (this.f7466a) {
            case 0:
                return obj.toString();
            case 1:
                ResponseBody responseBody = (ResponseBody) obj;
                try {
                    ?? obj2 = new Object();
                    responseBody.i().p(obj2);
                    MediaType f9 = responseBody.f();
                    long c9 = responseBody.c();
                    ResponseBody.b.getClass();
                    ResponseBody.Companion.asResponseBody.1 r42 = new ResponseBody.Companion.asResponseBody.1(f9, c9, (x8.g) obj2);
                    responseBody.close();
                    return r42;
                } catch (Throwable th) {
                    responseBody.close();
                    throw th;
                }
            case 2:
                return (RequestBody) obj;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return (ResponseBody) obj;
            case 4:
                ((ResponseBody) obj).close();
                return h7.l.f2236a;
            default:
                ((ResponseBody) obj).close();
                return null;
        }
    }

    public boolean f(Method method) {
        return false;
    }
}
