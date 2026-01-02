package h3;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f2.b0;
import j5.t1;
import q0.s1;
import q0.u1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f2175a;

    /* renamed from: b  reason: collision with root package name */
    public final s1 f2176b;

    /* renamed from: c  reason: collision with root package name */
    public Window f2177c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2178d;

    public h(View view, s1 s1Var) {
        this.f2176b = s1Var;
        v3.k kVar = BottomSheetBehavior.A(view).i;
        ColorStateList backgroundTintList = kVar != null ? kVar.f6213b.f6199d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f2175a = Boolean.valueOf(t1.H(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList d9 = b0.d(view.getBackground());
        Integer valueOf = d9 != null ? Integer.valueOf(d9.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f2175a = Boolean.valueOf(t1.H(valueOf.intValue()));
        } else {
            this.f2175a = null;
        }
    }

    @Override // h3.c
    public final void a(View view) {
        d(view);
    }

    @Override // h3.c
    public final void b(View view) {
        d(view);
    }

    @Override // h3.c
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        s1 s1Var = this.f2176b;
        if (top < s1Var.d()) {
            Window window = this.f2177c;
            if (window != null) {
                Boolean bool = this.f2175a;
                boolean booleanValue = bool == null ? this.f2178d : bool.booleanValue();
                v3.f fVar = new v3.f(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new u1(window, fVar) : i >= 30 ? new u1(window, fVar) : new q0.t1(window, fVar)).Q(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), s1Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.f2177c;
            if (window2 != null) {
                boolean z9 = this.f2178d;
                v3.f fVar2 = new v3.f(window2.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                (i9 >= 35 ? new u1(window2, fVar2) : i9 >= 30 ? new u1(window2, fVar2) : new q0.t1(window2, fVar2)).Q(z9);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f2177c == window) {
            return;
        }
        this.f2177c = window;
        if (window != null) {
            v3.f fVar = new v3.f(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.f2178d = (i >= 35 ? new u1(window, fVar) : i >= 30 ? new u1(window, fVar) : new q0.t1(window, fVar)).A();
        }
    }
}
