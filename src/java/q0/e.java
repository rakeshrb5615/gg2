package q0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e implements d, f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5115a = 0;

    /* renamed from: b  reason: collision with root package name */
    public ClipData f5116b;

    /* renamed from: c  reason: collision with root package name */
    public int f5117c;

    /* renamed from: d  reason: collision with root package name */
    public int f5118d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f5119e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f5120f;

    public /* synthetic */ e() {
    }

    @Override // q0.f
    public int a() {
        return this.f5117c;
    }

    @Override // q0.f
    public ClipData b() {
        return this.f5116b;
    }

    @Override // q0.d
    public g build() {
        return new g(new e(this));
    }

    @Override // q0.f
    public int c() {
        return this.f5118d;
    }

    @Override // q0.f
    public ContentInfo d() {
        return null;
    }

    @Override // q0.d
    public void e(Uri uri) {
        this.f5119e = uri;
    }

    @Override // q0.d
    public void f(int i) {
        this.f5118d = i;
    }

    @Override // q0.d
    public void setExtras(Bundle bundle) {
        this.f5120f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f5115a) {
            case 1:
                Uri uri = this.f5119e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f5116b.getDescription());
                sb.append(", source=");
                int i = this.f5117c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i9 = this.f5118d;
                sb.append((i9 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i9));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return v1.a.n(sb, this.f5120f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f5116b;
        clipData.getClass();
        this.f5116b = clipData;
        int i = eVar.f5117c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i <= 5) {
            this.f5117c = i;
            int i9 = eVar.f5118d;
            if ((i9 & 1) == i9) {
                this.f5118d = i9;
                this.f5119e = eVar.f5119e;
                this.f5120f = eVar.f5120f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i9) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
