package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final n f2096a = new n(new o(0));

    /* renamed from: b  reason: collision with root package name */
    public static final int f2097b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static m0.h f2098c = null;

    /* renamed from: d  reason: collision with root package name */
    public static m0.h f2099d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f2100e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2101f = false;

    /* renamed from: m  reason: collision with root package name */
    public static final r.f f2102m = new r.f(0);

    /* renamed from: n  reason: collision with root package name */
    public static final Object f2103n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public static final Object f2104o = new Object();

    public static void a() {
        m0.h hVar;
        r.f fVar = f2102m;
        fVar.getClass();
        r.a aVar = new r.a(fVar);
        while (aVar.hasNext()) {
            p pVar = (p) ((WeakReference) aVar.next()).get();
            if (pVar != null) {
                c0 c0Var = (c0) pVar;
                Context context = c0Var.q;
                if (g(context) && (hVar = f2098c) != null && !hVar.equals(f2099d)) {
                    f2096a.execute(new k(context, 1));
                }
                c0Var.q(true, true);
            }
        }
    }

    public static Object c() {
        Context context;
        r.f fVar = f2102m;
        fVar.getClass();
        r.a aVar = new r.a(fVar);
        while (aVar.hasNext()) {
            p pVar = (p) ((WeakReference) aVar.next()).get();
            if (pVar != null && (context = ((c0) pVar).q) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean g(Context context) {
        if (f2100e == null) {
            try {
                int i = AppLocalesMetadataHolderService.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), i0.a() | 128).metaData;
                if (bundle != null) {
                    f2100e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2100e = Boolean.FALSE;
            }
        }
        return f2100e.booleanValue();
    }

    public static void j(c0 c0Var) {
        synchronized (f2103n) {
            try {
                r.f fVar = f2102m;
                fVar.getClass();
                r.a aVar = new r.a(fVar);
                while (aVar.hasNext()) {
                    p pVar = (p) ((WeakReference) aVar.next()).get();
                    if (pVar == c0Var || pVar == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(Context context) {
        if (g(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f2101f) {
                    return;
                }
                f2096a.execute(new k(context, 0));
                return;
            }
            synchronized (f2104o) {
                try {
                    m0.h hVar = f2098c;
                    if (hVar == null) {
                        if (f2099d == null) {
                            f2099d = m0.h.a(d0.d.e(context));
                        }
                        if (f2099d.b()) {
                            return;
                        }
                        f2098c = f2099d;
                    } else if (!hVar.equals(f2099d)) {
                        m0.h hVar2 = f2098c;
                        f2099d = hVar2;
                        d0.d.d(context, hVar2.f3950a.f3951a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void d();

    public abstract void e();

    public abstract void h();

    public abstract void i();

    public abstract boolean k(int i);

    public abstract void l(int i);

    public abstract void m(View view);

    public abstract void n(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);
}
