package z8;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class y extends ResponseBody {

    /* renamed from: d  reason: collision with root package name */
    public final MediaType f7586d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7587e;

    public y(MediaType mediaType, long j) {
        this.f7586d = mediaType;
        this.f7587e = j;
    }

    public final long c() {
        return this.f7587e;
    }

    public final MediaType f() {
        return this.f7586d;
    }

    public final x8.i i() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
