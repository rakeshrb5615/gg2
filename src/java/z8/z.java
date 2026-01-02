package z8;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class z implements d {

    /* renamed from: a  reason: collision with root package name */
    public final p0 f7590a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7591b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7592c;

    /* renamed from: d  reason: collision with root package name */
    public final Call.Factory f7593d;

    /* renamed from: e  reason: collision with root package name */
    public final m f7594e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f7595f;

    /* renamed from: m  reason: collision with root package name */
    public Call f7596m;

    /* renamed from: n  reason: collision with root package name */
    public Throwable f7597n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7598o;

    public z(p0 p0Var, Object obj, Object[] objArr, Call.Factory factory, m mVar) {
        this.f7590a = p0Var;
        this.f7591b = obj;
        this.f7592c = objArr;
        this.f7593d = factory;
        this.f7594e = mVar;
    }

    public final Call a() {
        HttpUrl a10;
        p0 p0Var = this.f7590a;
        z0[] z0VarArr = p0Var.j;
        Object[] objArr = this.f7592c;
        int length = objArr.length;
        if (length != z0VarArr.length) {
            StringBuilder p8 = v1.a.p("Argument count (", length, ") doesn't match expected count (");
            p8.append(z0VarArr.length);
            p8.append(")");
            throw new IllegalArgumentException(p8.toString());
        }
        n0 n0Var = new n0(p0Var.f7547c, p0Var.f7546b, p0Var.f7548d, p0Var.f7549e, p0Var.f7550f, p0Var.f7551g, p0Var.f7552h, p0Var.i);
        if (p0Var.f7553k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            z0VarArr[i].a(n0Var, objArr[i]);
        }
        HttpUrl.Builder builder = n0Var.f7515d;
        if (builder != null) {
            a10 = builder.a();
        } else {
            String str = n0Var.f7514c;
            HttpUrl httpUrl = n0Var.f7513b;
            httpUrl.getClass();
            kotlin.jvm.internal.j.e(str, "link");
            HttpUrl.Builder f9 = httpUrl.f(str);
            a10 = f9 != null ? f9.a() : null;
            if (a10 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + n0Var.f7514c);
            }
        }
        FormBody formBody = n0Var.f7520k;
        if (formBody == null) {
            FormBody.Builder builder2 = n0Var.j;
            if (builder2 != null) {
                formBody = new FormBody(builder2.a, builder2.b);
            } else {
                MultipartBody.Builder builder3 = n0Var.i;
                if (builder3 != null) {
                    ArrayList arrayList2 = builder3.c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    formBody = new MultipartBody(builder3.a, builder3.b, _UtilJvmKt.i(arrayList2));
                } else if (n0Var.f7519h) {
                    RequestBody.a.getClass();
                    long j = 0;
                    _UtilCommonKt.a(j, j, j);
                    formBody = new RequestBody.Companion.toRequestBody.3(0, new byte[0]);
                }
            }
        }
        MediaType mediaType = n0Var.f7518g;
        Headers.Builder builder4 = n0Var.f7517f;
        if (mediaType != null) {
            if (formBody != null) {
                formBody = new m0(formBody, mediaType);
            } else {
                builder4.a("Content-Type", mediaType.a);
            }
        }
        Request.Builder builder5 = n0Var.f7516e;
        builder5.getClass();
        builder5.a = a10;
        builder5.c = builder4.c().d();
        builder5.b(n0Var.f7512a, formBody);
        builder5.e = builder5.e.b(kotlin.jvm.internal.s.a(t.class), new t(this.f7591b, p0Var.f7545a, arrayList));
        return this.f7593d.a(new Request(builder5));
    }

    public final Call b() {
        Call call = this.f7596m;
        if (call != null) {
            return call;
        }
        Throwable th = this.f7597n;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call a10 = a();
            this.f7596m = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e9) {
            z0.r(e9);
            this.f7597n = e9;
            throw e9;
        }
    }

    @Override // z8.d
    public final synchronized Request c() {
        try {
        } catch (IOException e9) {
            throw new RuntimeException("Unable to create request.", e9);
        }
        return b().c();
    }

    @Override // z8.d
    public final void cancel() {
        Call call;
        this.f7595f = true;
        synchronized (this) {
            call = this.f7596m;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new z(this.f7590a, this.f7591b, this.f7592c, this.f7593d, this.f7594e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, x8.g] */
    public final q0 d(Response response) {
        ResponseBody responseBody = response.m;
        Response.Builder c9 = response.c();
        c9.g = new y(responseBody.f(), responseBody.c());
        Response a10 = c9.a();
        boolean z9 = a10.v;
        int i = a10.d;
        if (i < 200 || i >= 300) {
            try {
                ?? obj = new Object();
                responseBody.i().p(obj);
                MediaType f9 = responseBody.f();
                long c10 = responseBody.c();
                ResponseBody.b.getClass();
                ResponseBody.Companion.asResponseBody.1 r72 = new ResponseBody.Companion.asResponseBody.1(f9, c10, (x8.g) obj);
                if (z9) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new q0(a10, null, r72);
            } finally {
                responseBody.close();
            }
        } else if (i == 204 || i == 205) {
            if (z9) {
                return new q0(a10, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            x xVar = new x(responseBody);
            try {
                Object e9 = this.f7594e.e(xVar);
                if (z9) {
                    return new q0(a10, e9, null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e10) {
                IOException iOException = xVar.f7582f;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    @Override // z8.d
    public final void f(g gVar) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f7598o) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f7598o = true;
                call = this.f7596m;
                th = this.f7597n;
                if (call == null && th == null) {
                    Call a10 = a();
                    this.f7596m = a10;
                    call = a10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            gVar.b(this, th);
            return;
        }
        if (this.f7595f) {
            call.cancel();
        }
        call.i(new n0.a(this, gVar, 18, false));
    }

    @Override // z8.d
    public final boolean isCanceled() {
        boolean z9 = true;
        if (this.f7595f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f7596m;
                if (call == null || !call.isCanceled()) {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // z8.d
    /* renamed from: clone */
    public final d mo7clone() {
        return new z(this.f7590a, this.f7591b, this.f7592c, this.f7593d, this.f7594e);
    }
}
