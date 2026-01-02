package r2;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public String f5520a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f5521b;

    /* renamed from: c  reason: collision with root package name */
    public m f5522c;

    /* renamed from: d  reason: collision with root package name */
    public Long f5523d;

    /* renamed from: e  reason: collision with root package name */
    public Long f5524e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f5525f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f5526g;

    /* renamed from: h  reason: collision with root package name */
    public String f5527h;
    public byte[] i;
    public byte[] j;

    public final void a(String str, String str2) {
        HashMap hashMap = this.f5525f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public final i b() {
        String str = this.f5520a == null ? " transportName" : "";
        if (this.f5522c == null) {
            str = str.concat(" encodedPayload");
        }
        if (this.f5523d == null) {
            str = g2.g.d(str, " eventMillis");
        }
        if (this.f5524e == null) {
            str = g2.g.d(str, " uptimeMillis");
        }
        if (this.f5525f == null) {
            str = g2.g.d(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i(this.f5520a, this.f5521b, this.f5522c, this.f5523d.longValue(), this.f5524e.longValue(), this.f5525f, this.f5526g, this.f5527h, this.i, this.j);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
