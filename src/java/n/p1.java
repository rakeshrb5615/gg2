package n;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f4246a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f4247b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f4248c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4249d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f4246a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4247b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4248c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4249d = true;
        } catch (NoSuchMethodException e9) {
            e9.printStackTrace();
        }
    }
}
