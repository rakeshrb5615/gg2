package z8;

import java.util.ArrayList;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.url._UrlKt;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class n0 {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f7510l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f7511m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f7512a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpUrl f7513b;

    /* renamed from: c  reason: collision with root package name */
    public String f7514c;

    /* renamed from: d  reason: collision with root package name */
    public HttpUrl.Builder f7515d;

    /* renamed from: e  reason: collision with root package name */
    public final Request.Builder f7516e = new Request.Builder();

    /* renamed from: f  reason: collision with root package name */
    public final Headers.Builder f7517f;

    /* renamed from: g  reason: collision with root package name */
    public MediaType f7518g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7519h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;

    /* renamed from: k  reason: collision with root package name */
    public RequestBody f7520k;

    public n0(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z9, boolean z10, boolean z11) {
        this.f7512a = str;
        this.f7513b = httpUrl;
        this.f7514c = str2;
        this.f7518g = mediaType;
        this.f7519h = z9;
        if (headers != null) {
            this.f7517f = headers.d();
        } else {
            this.f7517f = new Headers.Builder();
        }
        if (z10) {
            this.j = new FormBody.Builder();
        } else if (z11) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            MediaType mediaType2 = MultipartBody.g;
            kotlin.jvm.internal.j.e(mediaType2, "type");
            if (mediaType2.b.equals("multipart")) {
                builder.b = mediaType2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType2).toString());
        }
    }

    public final void a(String str, String str2, boolean z9) {
        FormBody.Builder builder = this.j;
        if (z9) {
            builder.getClass();
            kotlin.jvm.internal.j.e(str, "name");
            builder.a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            builder.b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        builder.getClass();
        kotlin.jvm.internal.j.e(str, "name");
        builder.a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        builder.b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z9) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                MediaType.e.getClass();
                this.f7518g = MediaType.Companion.a(str2);
                return;
            } catch (IllegalArgumentException e9) {
                throw new IllegalArgumentException(g2.g.l("Malformed content type: ", str2), e9);
            }
        }
        Headers.Builder builder = this.f7517f;
        if (!z9) {
            builder.a(str, str2);
            return;
        }
        builder.getClass();
        kotlin.jvm.internal.j.e(str, "name");
        kotlin.jvm.internal.j.e(str2, "value");
        _HeadersCommonKt.b(str);
        builder.b(str, str2);
    }

    public final void c(Headers headers, RequestBody requestBody) {
        MultipartBody.Builder builder = this.i;
        builder.getClass();
        kotlin.jvm.internal.j.e(requestBody, "body");
        MultipartBody.Part.c.getClass();
        if (headers.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        builder.c.add(new MultipartBody.Part(headers, requestBody));
    }

    public final void d(String str, String str2, boolean z9) {
        String str3 = this.f7514c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f7513b;
            HttpUrl.Builder f9 = httpUrl.f(str3);
            this.f7515d = f9;
            if (f9 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f7514c);
            }
            this.f7514c = null;
        }
        if (z9) {
            HttpUrl.Builder builder = this.f7515d;
            builder.getClass();
            kotlin.jvm.internal.j.e(str, "encodedName");
            if (builder.g == null) {
                builder.g = new ArrayList();
            }
            ArrayList arrayList = builder.g;
            kotlin.jvm.internal.j.b(arrayList);
            arrayList.add(_UrlKt.a(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = builder.g;
            kotlin.jvm.internal.j.b(arrayList2);
            arrayList2.add(str2 != null ? _UrlKt.a(str2, 0, 0, " \"'<>#&=", 83) : null);
            return;
        }
        HttpUrl.Builder builder2 = this.f7515d;
        builder2.getClass();
        kotlin.jvm.internal.j.e(str, "name");
        if (builder2.g == null) {
            builder2.g = new ArrayList();
        }
        ArrayList arrayList3 = builder2.g;
        kotlin.jvm.internal.j.b(arrayList3);
        arrayList3.add(_UrlKt.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = builder2.g;
        kotlin.jvm.internal.j.b(arrayList4);
        arrayList4.add(str2 != null ? _UrlKt.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }
}
