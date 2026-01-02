package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import n.f3;
import n.h3;
import n.n2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class i extends androidx.fragment.app.j0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public c0 f2056a;

    /* JADX WARN: Multi-variable type inference failed */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        c0 c0Var = (c0) h();
        c0Var.z();
        ((ViewGroup) c0Var.H.findViewById(16908290)).addView(view, layoutParams);
        c0Var.f2008s.a(c0Var.f2007r.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        c0 c0Var = (c0) h();
        c0Var.V = true;
        int i = c0Var.Z;
        if (i == -100) {
            i = p.f2097b;
        }
        int F = c0Var.F(context, i);
        if (p.g(context)) {
            p.p(context);
        }
        m0.h s5 = c0.s(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(c0.w(context, F, s5, null, false));
            } catch (IllegalStateException unused) {
            }
            super/*android.content.ContextWrapper*/.attachBaseContext(context);
        }
        if (context instanceof l.c) {
            try {
                ((l.c) context).a(c0.w(context, F, s5, null, false));
            } catch (IllegalStateException unused2) {
            }
            super/*android.content.ContextWrapper*/.attachBaseContext(context);
        }
        if (c0.f1993q0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f9 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f9 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i9 = configuration3.mcc;
                    int i10 = configuration4.mcc;
                    if (i9 != i10) {
                        configuration.mcc = i10;
                    }
                    int i11 = configuration3.mnc;
                    int i12 = configuration4.mnc;
                    if (i11 != i12) {
                        configuration.mnc = i12;
                    }
                    u.a(configuration3, configuration4, configuration);
                    int i13 = configuration3.touchscreen;
                    int i14 = configuration4.touchscreen;
                    if (i13 != i14) {
                        configuration.touchscreen = i14;
                    }
                    int i15 = configuration3.keyboard;
                    int i16 = configuration4.keyboard;
                    if (i15 != i16) {
                        configuration.keyboard = i16;
                    }
                    int i17 = configuration3.keyboardHidden;
                    int i18 = configuration4.keyboardHidden;
                    if (i17 != i18) {
                        configuration.keyboardHidden = i18;
                    }
                    int i19 = configuration3.navigation;
                    int i20 = configuration4.navigation;
                    if (i19 != i20) {
                        configuration.navigation = i20;
                    }
                    int i21 = configuration3.navigationHidden;
                    int i22 = configuration4.navigationHidden;
                    if (i21 != i22) {
                        configuration.navigationHidden = i22;
                    }
                    int i23 = configuration3.orientation;
                    int i24 = configuration4.orientation;
                    if (i23 != i24) {
                        configuration.orientation = i24;
                    }
                    int i25 = configuration3.screenLayout & 15;
                    int i26 = configuration4.screenLayout & 15;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.screenLayout & 192;
                    int i28 = configuration4.screenLayout & 192;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 48;
                    int i30 = configuration4.screenLayout & 48;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 768;
                    int i32 = configuration4.screenLayout & 768;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.colorMode & 3;
                    int i34 = configuration4.colorMode & 3;
                    if (i33 != i34) {
                        configuration.colorMode |= i34;
                    }
                    int i35 = configuration3.colorMode & 12;
                    int i36 = configuration4.colorMode & 12;
                    if (i35 != i36) {
                        configuration.colorMode |= i36;
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration w8 = c0.w(context, F, s5, configuration, true);
            l.c cVar = new l.c(context, 2132017802);
            cVar.a(w8);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        g0.l.a(theme);
                    } else {
                        synchronized (g0.b.f1603e) {
                            if (!g0.b.f1605g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    g0.b.f1604f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e9) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e9);
                                }
                                g0.b.f1605g = true;
                            }
                            Method method = g0.b.f1604f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e10) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e10);
                                    g0.b.f1604f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super/*android.content.ContextWrapper*/.attachBaseContext(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void closeOptionsMenu() {
        ((c0) h()).D();
        if (getWindow().hasFeature(0)) {
            super/*android.app.Activity*/.closeOptionsMenu();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((c0) h()).D();
        return super/*d0.g*/.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i) {
        c0 c0Var = (c0) h();
        c0Var.z();
        return c0Var.f2007r.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        c0 c0Var = (c0) h();
        if (c0Var.f2011v == null) {
            c0Var.D();
            n0 n0Var = c0Var.f2010u;
            c0Var.f2011v = new l.h(n0Var != null ? n0Var.X() : c0Var.q);
        }
        return c0Var.f2011v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Resources getResources() {
        int i = h3.f4171a;
        return super/*android.content.Context*/.getResources();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p h() {
        if (this.f2056a == null) {
            n nVar = p.f2096a;
            this.f2056a = new c0(this, null, this, this);
        }
        return this.f2056a;
    }

    public final void invalidateOptionsMenu() {
        h().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*c.n*/.onConfigurationChanged(configuration);
        c0 c0Var = (c0) h();
        if (c0Var.M && c0Var.G) {
            c0Var.D();
            n0 n0Var = c0Var.f2010u;
            if (n0Var != null) {
                n0Var.a0(n0Var.f2076f.getResources().getBoolean(2131034112));
            }
        }
        n.u a10 = n.u.a();
        Context context = c0Var.q;
        synchronized (a10) {
            n2 n2Var = a10.f4310a;
            synchronized (n2Var) {
                r.g gVar = (r.g) n2Var.f4231b.get(context);
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        c0Var.Y = new Configuration(c0Var.q.getResources().getConfiguration());
        c0Var.q(false, false);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        h().i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a10;
        if (!super.onMenuItemSelected(i, menuItem)) {
            c0 c0Var = (c0) h();
            c0Var.D();
            n0 n0Var = c0Var.f2010u;
            if (menuItem.getItemId() != 16908332 || n0Var == null || (((f3) n0Var.j).f4118b & 4) == 0 || (a10 = d0.d.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(a10)) {
                navigateUpTo(a10);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent a11 = d0.d.a(this);
            if (a11 == null) {
                a11 = d0.d.a(this);
            }
            if (a11 != null) {
                ComponentName component = a11.getComponent();
                if (component == null) {
                    component = a11.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b10 = d0.d.b(this, component);
                    while (b10 != null) {
                        arrayList.add(size, b10);
                        b10 = d0.d.b(this, b10.getComponent());
                    }
                    arrayList.add(a11);
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e9);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!e0.c.startActivities(this, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPostCreate(Bundle bundle) {
        super/*android.app.Activity*/.onPostCreate(bundle);
        ((c0) h()).z();
    }

    public final void onPostResume() {
        super.onPostResume();
        c0 c0Var = (c0) h();
        c0Var.D();
        n0 n0Var = c0Var.f2010u;
        if (n0Var != null) {
            n0Var.f2092y = true;
        }
    }

    public final void onStart() {
        super.onStart();
        ((c0) h()).q(true, false);
    }

    public void onStop() {
        super.onStop();
        c0 c0Var = (c0) h();
        c0Var.D();
        n0 n0Var = c0Var.f2010u;
        if (n0Var != null) {
            n0Var.f2092y = false;
            l.j jVar = n0Var.f2091x;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super/*android.app.Activity*/.onTitleChanged(charSequence, i);
        h().o(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void openOptionsMenu() {
        ((c0) h()).D();
        if (getWindow().hasFeature(0)) {
            super/*android.app.Activity*/.openOptionsMenu();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContentView(int i) {
        initializeViewTreeOwners();
        h().l(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTheme(int i) {
        super/*android.content.Context*/.setTheme(i);
        ((c0) h()).f1994a0 = i;
    }

    public final void supportInvalidateOptionsMenu() {
        h().e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setContentView(View view) {
        initializeViewTreeOwners();
        h().m(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        h().n(view, layoutParams);
    }
}
