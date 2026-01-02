package a2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class d0 extends e0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(t0 t0Var, int i) {
        super(t0Var);
        this.f298d = i;
    }

    @Override // a2.e0
    public final int b(View view) {
        int right;
        int i;
        switch (this.f298d) {
            case 0:
                ((t0) this.f304b).getClass();
                right = view.getRight() + ((u0) view.getLayoutParams()).f508b.right;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((t0) this.f304b).getClass();
                right = view.getBottom() + ((u0) view.getLayoutParams()).f508b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // a2.e0
    public final int c(View view) {
        int A;
        int i;
        switch (this.f298d) {
            case 0:
                u0 u0Var = (u0) view.getLayoutParams();
                ((t0) this.f304b).getClass();
                A = t0.A(view) + ((ViewGroup.MarginLayoutParams) u0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) u0Var).rightMargin;
                break;
            default:
                u0 u0Var2 = (u0) view.getLayoutParams();
                ((t0) this.f304b).getClass();
                A = t0.z(view) + ((ViewGroup.MarginLayoutParams) u0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) u0Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // a2.e0
    public final int d(View view) {
        int z9;
        int i;
        switch (this.f298d) {
            case 0:
                u0 u0Var = (u0) view.getLayoutParams();
                ((t0) this.f304b).getClass();
                z9 = t0.z(view) + ((ViewGroup.MarginLayoutParams) u0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) u0Var).bottomMargin;
                break;
            default:
                u0 u0Var2 = (u0) view.getLayoutParams();
                ((t0) this.f304b).getClass();
                z9 = t0.A(view) + ((ViewGroup.MarginLayoutParams) u0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) u0Var2).rightMargin;
                break;
        }
        return z9 + i;
    }

    @Override // a2.e0
    public final int e(View view) {
        int left;
        int i;
        switch (this.f298d) {
            case 0:
                ((t0) this.f304b).getClass();
                left = view.getLeft() - ((u0) view.getLayoutParams()).f508b.left;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((t0) this.f304b).getClass();
                left = view.getTop() - ((u0) view.getLayoutParams()).f508b.top;
                i = ((ViewGroup.MarginLayoutParams) ((u0) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    @Override // a2.e0
    public final int f() {
        switch (this.f298d) {
            case 0:
                return ((t0) this.f304b).f498n;
            default:
                return ((t0) this.f304b).f499o;
        }
    }

    @Override // a2.e0
    public final int g() {
        int i;
        int E;
        switch (this.f298d) {
            case 0:
                t0 t0Var = (t0) this.f304b;
                i = t0Var.f498n;
                E = t0Var.E();
                break;
            default:
                t0 t0Var2 = (t0) this.f304b;
                i = t0Var2.f499o;
                E = t0Var2.C();
                break;
        }
        return i - E;
    }

    @Override // a2.e0
    public final int h() {
        switch (this.f298d) {
            case 0:
                return ((t0) this.f304b).E();
            default:
                return ((t0) this.f304b).C();
        }
    }

    @Override // a2.e0
    public final int i() {
        switch (this.f298d) {
            case 0:
                return ((t0) this.f304b).f496l;
            default:
                return ((t0) this.f304b).f497m;
        }
    }

    @Override // a2.e0
    public final int j() {
        switch (this.f298d) {
            case 0:
                return ((t0) this.f304b).f497m;
            default:
                return ((t0) this.f304b).f496l;
        }
    }

    @Override // a2.e0
    public final int k() {
        switch (this.f298d) {
            case 0:
                return ((t0) this.f304b).D();
            default:
                return ((t0) this.f304b).F();
        }
    }

    @Override // a2.e0
    public final int l() {
        int D;
        int E;
        switch (this.f298d) {
            case 0:
                t0 t0Var = (t0) this.f304b;
                D = t0Var.f498n - t0Var.D();
                E = t0Var.E();
                break;
            default:
                t0 t0Var2 = (t0) this.f304b;
                D = t0Var2.f499o - t0Var2.F();
                E = t0Var2.C();
                break;
        }
        return D - E;
    }

    @Override // a2.e0
    public final int m(View view) {
        switch (this.f298d) {
            case 0:
                Rect rect = (Rect) this.f305c;
                ((t0) this.f304b).J(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f305c;
                ((t0) this.f304b).J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // a2.e0
    public final int n(View view) {
        switch (this.f298d) {
            case 0:
                Rect rect = (Rect) this.f305c;
                ((t0) this.f304b).J(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f305c;
                ((t0) this.f304b).J(view, rect2);
                return rect2.top;
        }
    }

    @Override // a2.e0
    public final void o(int i) {
        switch (this.f298d) {
            case 0:
                ((t0) this.f304b).O(i);
                return;
            default:
                ((t0) this.f304b).P(i);
                return;
        }
    }
}
