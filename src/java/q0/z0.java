package q0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class z0 extends WindowInsetsAnimation.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final h3.k f5204a;

    /* renamed from: b  reason: collision with root package name */
    public List f5205b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f5206c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5207d;

    public z0(h3.k kVar) {
        super(0);
        this.f5207d = new HashMap();
        this.f5204a = kVar;
    }

    public final c1 a(WindowInsetsAnimation windowInsetsAnimation) {
        c1 c1Var = (c1) this.f5207d.get(windowInsetsAnimation);
        if (c1Var == null) {
            c1Var = new c1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c1Var.f5108a = new a1(windowInsetsAnimation);
            }
            this.f5207d.put(windowInsetsAnimation, c1Var);
        }
        return c1Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.f5204a.f2192d).setTranslationY(0.0f);
        this.f5207d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        h3.k kVar = this.f5204a;
        int[] iArr = (int[]) kVar.f2193e;
        ((View) kVar.f2192d).getLocationOnScreen(iArr);
        kVar.f2189a = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f5206c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f5206c = arrayList2;
            this.f5205b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            c1 a10 = a(windowInsetsAnimation);
            a10.f5108a.d(windowInsetsAnimation.getFraction());
            this.f5206c.add(a10);
        }
        s1 g3 = s1.g(null, windowInsets);
        this.f5204a.e(g3, this.f5205b);
        return g3.f();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        h0.b f9 = a1.f(bounds);
        h0.b e9 = a1.e(bounds);
        h3.k kVar = this.f5204a;
        View view = (View) kVar.f2192d;
        int[] iArr = (int[]) kVar.f2193e;
        view.getLocationOnScreen(iArr);
        int i = kVar.f2189a - iArr[1];
        kVar.f2190b = i;
        view.setTranslationY(i);
        y0.c();
        return y0.a(f9.d(), e9.d());
    }
}
