package a2;

import android.view.View;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f536a;

    /* renamed from: b  reason: collision with root package name */
    public int f537b;

    /* renamed from: c  reason: collision with root package name */
    public int f538c;

    /* renamed from: d  reason: collision with root package name */
    public int f539d;

    /* renamed from: e  reason: collision with root package name */
    public int f540e;

    /* renamed from: f  reason: collision with root package name */
    public int f541f;

    /* renamed from: g  reason: collision with root package name */
    public int f542g;

    /* renamed from: h  reason: collision with root package name */
    public int f543h;
    public int i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public List f544k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f545l;

    public final void a(View view) {
        int b10;
        int size = this.f544k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < size; i9++) {
            View view3 = ((k1) this.f544k.get(i9)).f376a;
            u0 u0Var = (u0) view3.getLayoutParams();
            if (view3 != view && !u0Var.f507a.h() && (b10 = (u0Var.f507a.b() - this.f539d) * this.f540e) >= 0 && b10 < i) {
                view2 = view3;
                if (b10 == 0) {
                    break;
                }
                i = b10;
            }
        }
        if (view2 == null) {
            this.f539d = -1;
        } else {
            this.f539d = ((u0) view2.getLayoutParams()).f507a.b();
        }
    }

    public final View b(z0 z0Var) {
        List list = this.f544k;
        if (list == null) {
            View d9 = z0Var.d(this.f539d);
            this.f539d += this.f540e;
            return d9;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((k1) this.f544k.get(i)).f376a;
            u0 u0Var = (u0) view.getLayoutParams();
            if (!u0Var.f507a.h() && this.f539d == u0Var.f507a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
