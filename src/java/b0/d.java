package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public a f683a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f684b;

    /* renamed from: c  reason: collision with root package name */
    public final int f685c;

    /* renamed from: d  reason: collision with root package name */
    public final int f686d;

    /* renamed from: e  reason: collision with root package name */
    public final int f687e;

    /* renamed from: f  reason: collision with root package name */
    public final int f688f;

    /* renamed from: g  reason: collision with root package name */
    public int f689g;

    /* renamed from: h  reason: collision with root package name */
    public int f690h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public View f691k;

    /* renamed from: l  reason: collision with root package name */
    public View f692l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f693m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f694n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f695o;

    public d() {
        super(-2, -2);
        this.f684b = false;
        this.f685c = 0;
        this.f686d = 0;
        this.f687e = -1;
        this.f688f = -1;
        this.f689g = 0;
        this.f690h = 0;
        this.f695o = new Rect();
    }

    public final boolean a(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.f694n;
        }
        return this.f693m;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f684b = false;
        this.f685c = 0;
        this.f686d = 0;
        this.f687e = -1;
        this.f688f = -1;
        this.f689g = 0;
        this.f690h = 0;
        this.f695o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f2b);
        this.f685c = obtainStyledAttributes.getInteger(0, 0);
        this.f688f = obtainStyledAttributes.getResourceId(1, -1);
        this.f686d = obtainStyledAttributes.getInteger(2, 0);
        this.f687e = obtainStyledAttributes.getInteger(6, -1);
        this.f689g = obtainStyledAttributes.getInt(5, 0);
        this.f690h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f684b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.z;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.z;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.B;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.A);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e9) {
                    throw new RuntimeException(g2.g.l("Could not inflate Behavior subclass ", string), e9);
                }
            }
            this.f683a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f683a;
        if (aVar2 != null) {
            aVar2.g(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f684b = false;
        this.f685c = 0;
        this.f686d = 0;
        this.f687e = -1;
        this.f688f = -1;
        this.f689g = 0;
        this.f690h = 0;
        this.f695o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f684b = false;
        this.f685c = 0;
        this.f686d = 0;
        this.f687e = -1;
        this.f688f = -1;
        this.f689g = 0;
        this.f690h = 0;
        this.f695o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f684b = false;
        this.f685c = 0;
        this.f686d = 0;
        this.f687e = -1;
        this.f688f = -1;
        this.f689g = 0;
        this.f690h = 0;
        this.f695o = new Rect();
    }
}
