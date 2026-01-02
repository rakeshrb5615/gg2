package a2;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f455b;

    public /* synthetic */ r0(t0 t0Var, int i) {
        this.f454a = i;
        this.f455b = t0Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.f454a) {
            case 0:
                right = view.getRight() + ((u0) view.getLayoutParams()).f508b.right;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).rightMargin;
                break;
            default:
                right = view.getBottom() + ((u0) view.getLayoutParams()).f508b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.f454a) {
            case 0:
                left = view.getLeft() - ((u0) view.getLayoutParams()).f508b.left;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).leftMargin;
                break;
            default:
                left = view.getTop() - ((u0) view.getLayoutParams()).f508b.top;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int E;
        switch (this.f454a) {
            case 0:
                t0 t0Var = this.f455b;
                i = t0Var.f498n;
                E = t0Var.E();
                break;
            default:
                t0 t0Var2 = this.f455b;
                i = t0Var2.f499o;
                E = t0Var2.C();
                break;
        }
        return i - E;
    }

    public final int d() {
        switch (this.f454a) {
            case 0:
                return this.f455b.D();
            default:
                return this.f455b.F();
        }
    }
}
