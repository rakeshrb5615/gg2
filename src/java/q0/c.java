package q0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c implements d, f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5101a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5102b;

    public c(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f5102b = contentInfo;
    }

    @Override // q0.f
    public int a() {
        return ((ContentInfo) this.f5102b).getSource();
    }

    @Override // q0.f
    public ClipData b() {
        return ((ContentInfo) this.f5102b).getClip();
    }

    @Override // q0.d
    public g build() {
        return new g(new c(((ContentInfo.Builder) this.f5102b).build()));
    }

    @Override // q0.f
    public int c() {
        return ((ContentInfo) this.f5102b).getFlags();
    }

    @Override // q0.f
    public ContentInfo d() {
        return (ContentInfo) this.f5102b;
    }

    @Override // q0.d
    public void e(Uri uri) {
        ((ContentInfo.Builder) this.f5102b).setLinkUri(uri);
    }

    @Override // q0.d
    public void f(int i) {
        ((ContentInfo.Builder) this.f5102b).setFlags(i);
    }

    @Override // q0.d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f5102b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f5101a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f5102b) + "}";
            default:
                return super.toString();
        }
    }

    public c(ClipData clipData, int i) {
        this.f5102b = i2.u0.b(clipData, i);
    }
}
