package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import m.o;
import m.p;
import m.t;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f3491a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3498h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3499k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f3500l;

    /* renamed from: m  reason: collision with root package name */
    public int f3501m;

    /* renamed from: n  reason: collision with root package name */
    public char f3502n;

    /* renamed from: o  reason: collision with root package name */
    public int f3503o;

    /* renamed from: p  reason: collision with root package name */
    public char f3504p;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public int f3505r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3506s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3507t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3508u;

    /* renamed from: v  reason: collision with root package name */
    public int f3509v;

    /* renamed from: w  reason: collision with root package name */
    public int f3510w;

    /* renamed from: x  reason: collision with root package name */
    public String f3511x;

    /* renamed from: y  reason: collision with root package name */
    public String f3512y;

    /* renamed from: z  reason: collision with root package name */
    public p f3513z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b  reason: collision with root package name */
    public int f3492b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3493c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3494d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f3495e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3496f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3497g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f3491a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f3518c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e9) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e9);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.MenuItem$OnMenuItemClickListener, l.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f3518c;
        boolean z9 = false;
        menuItem.setChecked(this.f3506s).setVisible(this.f3507t).setEnabled(this.f3508u).setCheckable(this.f3505r >= 1).setTitleCondensed(this.f3500l).setIcon(this.f3501m);
        int i = this.f3509v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f3512y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f3519d == null) {
                hVar.f3519d = h.a(context);
            }
            Object obj = hVar.f3519d;
            String str = this.f3512y;
            ?? obj2 = new Object();
            obj2.f3489a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f3490b = cls.getMethod(str, f.f3488c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e9) {
                StringBuilder q = v1.a.q("Couldn't resolve menu item onClick handler ", str, " in class ");
                q.append(cls.getName());
                InflateException inflateException = new InflateException(q.toString());
                inflateException.initCause(e9);
                throw inflateException;
            }
        }
        if (this.f3505r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f3918x = (oVar.f3918x & (-5)) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                j0.a aVar = tVar.f3928c;
                try {
                    if (tVar.f3929d == null) {
                        tVar.f3929d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f3929d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f3511x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f3514e, hVar.f3516a));
            z9 = true;
        }
        int i9 = this.f3510w;
        if (i9 > 0) {
            if (z9) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i9);
            }
        }
        p pVar = this.f3513z;
        if (pVar != null) {
            if (menuItem instanceof j0.a) {
                ((j0.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z10 = menuItem instanceof j0.a;
        if (z10) {
            ((j0.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z10) {
            ((j0.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c9 = this.f3502n;
        int i10 = this.f3503o;
        if (z10) {
            ((j0.a) menuItem).setAlphabeticShortcut(c9, i10);
        } else {
            menuItem.setAlphabeticShortcut(c9, i10);
        }
        char c10 = this.f3504p;
        int i11 = this.q;
        if (z10) {
            ((j0.a) menuItem).setNumericShortcut(c10, i11);
        } else {
            menuItem.setNumericShortcut(c10, i11);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z10) {
                ((j0.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z10) {
                ((j0.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
