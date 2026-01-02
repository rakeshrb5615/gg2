package z8;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class m0 extends RequestBody {

    /* renamed from: b  reason: collision with root package name */
    public final RequestBody f7506b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaType f7507c;

    public m0(RequestBody requestBody, MediaType mediaType) {
        this.f7506b = requestBody;
        this.f7507c = mediaType;
    }

    public final long a() {
        return this.f7506b.a();
    }

    public final MediaType b() {
        return this.f7507c;
    }

    public final void d(x8.h hVar) {
        this.f7506b.d(hVar);
    }
}
