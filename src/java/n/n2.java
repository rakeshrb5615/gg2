package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n2 {

    /* renamed from: g  reason: collision with root package name */
    public static n2 f4228g;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f4230a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f4231b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f4232c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4233d;

    /* renamed from: e  reason: collision with root package name */
    public a5.z f4234e;

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f4227f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    public static final m2 f4229h = new r.i(6);

    public static synchronized n2 b() {
        n2 n2Var;
        synchronized (n2.class) {
            try {
                if (f4228g == null) {
                    f4228g = new n2();
                }
                n2Var = f4228g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            m2 m2Var = f4229h;
            m2Var.getClass();
            int i9 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m2Var.get(Integer.valueOf(mode.hashCode() + i9));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) m2Var.put(Integer.valueOf(mode.hashCode() + i9), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawable;
        if (this.f4232c == null) {
            this.f4232c = new TypedValue();
        }
        TypedValue typedValue = this.f4232c;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            r.g gVar = (r.g) this.f4231b.get(context);
            drawable = null;
            if (gVar != null) {
                WeakReference weakReference = (WeakReference) gVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b10 = s.a.b(gVar.f5464b, gVar.f5466d, j);
                        if (b10 >= 0) {
                            Object[] objArr = gVar.f5465c;
                            Object obj = objArr[b10];
                            Object obj2 = r.h.f5467a;
                            if (obj != obj2) {
                                objArr[b10] = obj2;
                                gVar.f5463a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f4234e != null) {
            if (i == 2131230996) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, 2131230995), c(context, 2131230997)});
            } else if (i == 2131231031) {
                layerDrawable = a5.z.p(this, context, 2131165243);
            } else if (i == 2131231030) {
                layerDrawable = a5.z.p(this, context, 2131165244);
            } else if (i == 2131231032) {
                layerDrawable = a5.z.p(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        r.g gVar2 = (r.g) this.f4231b.get(context);
                        if (gVar2 == null) {
                            gVar2 = new r.g();
                            this.f4231b.put(context, gVar2);
                        }
                        gVar2.e(j, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return layerDrawable;
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z9) {
        Drawable a10;
        try {
            if (!this.f4233d) {
                this.f4233d = true;
                Drawable c9 = c(context, 2131231058);
                if (c9 == null || (!(c9 instanceof g2.q) && !"android.graphics.drawable.VectorDrawable".equals(c9.getClass().getName()))) {
                    this.f4233d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a10 = a(context, i);
            if (a10 == null) {
                a10 = e0.c.getDrawable(context, i);
            }
            if (a10 != null) {
                a10 = g(context, i, z9, a10);
            }
            if (a10 != null) {
                n1.a(a10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a10;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        r.k kVar;
        WeakHashMap weakHashMap = this.f4230a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kVar = (r.k) weakHashMap.get(context)) == null) ? null : (ColorStateList) kVar.b(i);
        if (colorStateList == null) {
            a5.z zVar = this.f4234e;
            if (zVar != null) {
                colorStateList2 = zVar.r(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f4230a == null) {
                    this.f4230a = new WeakHashMap();
                }
                r.k kVar2 = (r.k) this.f4230a.get(context);
                if (kVar2 == null) {
                    kVar2 = new r.k();
                    this.f4230a.put(context, kVar2);
                }
                kVar2.a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.n2.g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
