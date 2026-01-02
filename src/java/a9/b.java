package a9;

import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import w6.z;
import x8.j;
import z8.m;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b implements m {

    /* renamed from: c  reason: collision with root package name */
    public static final MediaType f676c;

    /* renamed from: a  reason: collision with root package name */
    public final w6.m f677a;

    /* renamed from: b  reason: collision with root package name */
    public final z f678b;

    static {
        MediaType.e.getClass();
        f676c = MediaType.Companion.a("application/json; charset=UTF-8");
    }

    public b(w6.m mVar, z zVar) {
        this.f677a = mVar;
        this.f678b = zVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x8.h, x8.g] */
    @Override // z8.m
    public final Object e(Object obj) {
        ?? obj2 = new Object();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(obj2.r(), StandardCharsets.UTF_8);
        w6.m mVar = this.f677a;
        mVar.getClass();
        e7.b bVar = new e7.b(outputStreamWriter);
        bVar.D(mVar.f6478g);
        bVar.f1355o = mVar.f6477f;
        bVar.f1354n = 2;
        bVar.q = false;
        this.f678b.c(bVar, obj);
        bVar.close();
        j e9 = obj2.e(obj2.f6642b);
        RequestBody.a.getClass();
        kotlin.jvm.internal.j.e(e9, "content");
        return new RequestBody.Companion.toRequestBody.1(f676c, e9);
    }
}
