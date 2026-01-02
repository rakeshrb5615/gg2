package n;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f3 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f4117a;

    /* renamed from: b  reason: collision with root package name */
    public int f4118b;

    /* renamed from: c  reason: collision with root package name */
    public View f4119c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f4120d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f4121e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4122f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4123g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f4124h;
    public CharSequence i;
    public CharSequence j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f4125k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4126l;

    /* renamed from: m  reason: collision with root package name */
    public k f4127m;

    /* renamed from: n  reason: collision with root package name */
    public int f4128n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f4129o;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f4117a;
        int i9 = this.f4118b ^ i;
        this.f4118b = i;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f4118b & 4) != 0) {
                    Drawable drawable = this.f4122f;
                    if (drawable == null) {
                        drawable = this.f4129o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i9 & 3) != 0) {
                c();
            }
            if ((i9 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f4124h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) == 0 || (view = this.f4119c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f4117a;
        if ((this.f4118b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                toolbar.setNavigationContentDescription(this.f4128n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f4118b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f4121e;
            if (drawable == null) {
                drawable = this.f4120d;
            }
        } else {
            drawable = this.f4120d;
        }
        this.f4117a.setLogo(drawable);
    }
}
