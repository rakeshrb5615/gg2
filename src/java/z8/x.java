package z8;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class x extends ResponseBody {

    /* renamed from: d  reason: collision with root package name */
    public final ResponseBody f7580d;

    /* renamed from: e  reason: collision with root package name */
    public final x8.b0 f7581e;

    /* renamed from: f  reason: collision with root package name */
    public IOException f7582f;

    public x(ResponseBody responseBody) {
        this.f7580d = responseBody;
        this.f7581e = x8.b.c(new w(this, responseBody.i()));
    }

    public final long c() {
        return this.f7580d.c();
    }

    public final void close() {
        this.f7580d.close();
    }

    public final MediaType f() {
        return this.f7580d.f();
    }

    public final x8.i i() {
        return this.f7581e;
    }
}
