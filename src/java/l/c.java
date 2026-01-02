package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f3474f;

    /* renamed from: a  reason: collision with root package name */
    public int f3475a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f3476b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f3477c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f3478d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f3479e;

    public c(Context context, int i) {
        super(context);
        this.f3475a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f3479e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3478d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3478d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f3476b == null) {
            this.f3476b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3476b.setTo(theme);
            }
        }
        this.f3476b.applyStyle(this.f3475a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f3479e == null) {
            Configuration configuration = this.f3478d;
            if (configuration != null) {
                if (f3474f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f3474f = configuration2;
                }
                if (!configuration.equals(f3474f)) {
                    this.f3479e = createConfigurationContext(this.f3478d).getResources();
                }
            }
            this.f3479e = super.getResources();
        }
        return this.f3479e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f3477c == null) {
                this.f3477c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f3477c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3476b;
        if (theme != null) {
            return theme;
        }
        if (this.f3475a == 0) {
            this.f3475a = 2132017803;
        }
        b();
        return this.f3476b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3475a != i) {
            this.f3475a = i;
            b();
        }
    }
}
