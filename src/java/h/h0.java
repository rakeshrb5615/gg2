package h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import n.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f2048b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2049c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2050d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2051e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2052f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2053g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final r.j f2054h = new r.j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2055a = new Object[2];

    public n.o a(Context context, AttributeSet attributeSet) {
        return new n.o(context, attributeSet);
    }

    public n.q b(Context context, AttributeSet attributeSet) {
        return new n.q(context, attributeSet, 2130968740);
    }

    public n.r c(Context context, AttributeSet attributeSet) {
        return new n.r(context, attributeSet, 2130968770);
    }

    public n.d0 d(Context context, AttributeSet attributeSet) {
        return new n.d0(context, attributeSet);
    }

    public b1 e(Context context, AttributeSet attributeSet) {
        return new b1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        r.j jVar = f2054h;
        Constructor constructor = (Constructor) jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2048b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2055a);
    }
}
