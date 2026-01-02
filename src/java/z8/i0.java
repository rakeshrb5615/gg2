package z8;

import okhttp3.MultipartBody;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class i0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final i0 f7499d = new Object();

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            MultipartBody.Builder builder = n0Var.i;
            builder.getClass();
            builder.c.add(part);
        }
    }
}
