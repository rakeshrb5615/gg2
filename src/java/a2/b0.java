package a2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public int f268a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f269b;

    /* renamed from: c  reason: collision with root package name */
    public t0 f270c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f271d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f272e;

    /* renamed from: f  reason: collision with root package name */
    public View f273f;

    /* renamed from: g  reason: collision with root package name */
    public final e1 f274g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f275h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f276k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f277l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f278m;

    /* renamed from: n  reason: collision with root package name */
    public float f279n;

    /* renamed from: o  reason: collision with root package name */
    public int f280o;

    /* renamed from: p  reason: collision with root package name */
    public int f281p;

    /* JADX WARN: Type inference failed for: r1v0, types: [a2.e1, java.lang.Object] */
    public b0(Context context) {
        ?? obj = new Object();
        obj.f309d = -1;
        obj.f311f = false;
        obj.f312g = 0;
        obj.f306a = 0;
        obj.f307b = 0;
        obj.f308c = Integer.MIN_VALUE;
        obj.f310e = null;
        this.f274g = obj;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f278m = false;
        this.f280o = 0;
        this.f281p = 0;
        this.f277l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i9, int i10, int i11, int i12) {
        if (i12 != -1) {
            if (i12 != 0) {
                if (i12 == 1) {
                    return i11 - i9;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i13 = i10 - i;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i11 - i9;
            if (i14 < 0) {
                return i14;
            }
            return 0;
        }
        return i10 - i;
    }

    public int b(View view, int i) {
        t0 t0Var = this.f270c;
        if (t0Var == null || !t0Var.d()) {
            return 0;
        }
        u0 u0Var = (u0) view.getLayoutParams();
        return a((view.getLeft() - ((u0) view.getLayoutParams()).f508b.left) - ((ViewGroup.MarginLayoutParams) u0Var).leftMargin, view.getRight() + ((u0) view.getLayoutParams()).f508b.right + ((ViewGroup.MarginLayoutParams) u0Var).rightMargin, t0Var.D(), t0Var.f498n - t0Var.E(), i);
    }

    public int c(View view, int i) {
        t0 t0Var = this.f270c;
        if (t0Var == null || !t0Var.e()) {
            return 0;
        }
        u0 u0Var = (u0) view.getLayoutParams();
        return a((view.getTop() - ((u0) view.getLayoutParams()).f508b.top) - ((ViewGroup.MarginLayoutParams) u0Var).topMargin, view.getBottom() + ((u0) view.getLayoutParams()).f508b.bottom + ((ViewGroup.MarginLayoutParams) u0Var).bottomMargin, t0Var.F(), t0Var.f499o - t0Var.C(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.f278m) {
            this.f279n = d(this.f277l);
            this.f278m = true;
        }
        return (int) Math.ceil(abs * this.f279n);
    }

    public PointF f(int i) {
        t0 t0Var = this.f270c;
        if (t0Var instanceof f1) {
            return ((f1) t0Var).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + f1.class.getCanonicalName());
        return null;
    }

    public final void g(int i, int i9) {
        float f9;
        PointF f10;
        RecyclerView recyclerView = this.f269b;
        if (this.f268a == -1 || recyclerView == null) {
            i();
        }
        if (this.f271d && this.f273f == null && this.f270c != null && (f10 = f(this.f268a)) != null) {
            float f11 = f10.x;
            if (f11 != 0.0f || f10.y != 0.0f) {
                recyclerView.e0((int) Math.signum(f11), (int) Math.signum(f10.y), (int[]) null);
            }
        }
        this.f271d = false;
        View view = this.f273f;
        e1 e1Var = this.f274g;
        if (view != null) {
            this.f269b.getClass();
            k1 M = RecyclerView.M(view);
            if ((M != null ? M.b() : -1) == this.f268a) {
                View view2 = this.f273f;
                g1 g1Var = recyclerView.k0;
                h(view2, e1Var);
                e1Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f273f = null;
            }
        }
        if (this.f272e) {
            g1 g1Var2 = recyclerView.k0;
            if (this.f269b.s.v() == 0) {
                i();
            } else {
                int i10 = this.f280o;
                int i11 = i10 - i;
                if (i10 * i11 <= 0) {
                    i11 = 0;
                }
                this.f280o = i11;
                int i12 = this.f281p;
                int i13 = i12 - i9;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f281p = i13;
                if (i11 == 0 && i13 == 0) {
                    PointF f12 = f(this.f268a);
                    if (f12 != null) {
                        if (f12.x != 0.0f || f12.y != 0.0f) {
                            float f13 = f12.y;
                            float sqrt = (float) Math.sqrt((f13 * f13) + (f9 * f9));
                            float f14 = f12.x / sqrt;
                            f12.x = f14;
                            float f15 = f12.y / sqrt;
                            f12.y = f15;
                            this.f276k = f12;
                            this.f280o = (int) (f14 * 10000.0f);
                            this.f281p = (int) (f15 * 10000.0f);
                            int e9 = e(10000);
                            e1Var.f306a = (int) (this.f280o * 1.2f);
                            e1Var.f307b = (int) (this.f281p * 1.2f);
                            e1Var.f308c = (int) (e9 * 1.2f);
                            e1Var.f310e = this.i;
                            e1Var.f311f = true;
                        }
                    }
                    e1Var.f309d = this.f268a;
                    i();
                }
            }
            boolean z9 = e1Var.f309d >= 0;
            e1Var.a(recyclerView);
            if (z9 && this.f272e) {
                this.f271d = true;
                recyclerView.h0.b();
            }
        }
    }

    public void h(View view, e1 e1Var) {
        int i;
        int i9;
        PointF pointF = this.f276k;
        int i10 = 0;
        int b10 = b(view, (pointF == null || pointF.x == 0.0f) ? 0 : i9 > 0 ? 1 : -1);
        PointF pointF2 = this.f276k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            i10 = i > 0 ? 1 : -1;
        }
        int c9 = c(view, i10);
        int ceil = (int) Math.ceil(e((int) Math.sqrt((c9 * c9) + (b10 * b10))) / 0.3356d);
        if (ceil > 0) {
            e1Var.f306a = -b10;
            e1Var.f307b = -c9;
            e1Var.f308c = ceil;
            e1Var.f310e = this.j;
            e1Var.f311f = true;
        }
    }

    public final void i() {
        if (this.f272e) {
            this.f272e = false;
            this.f281p = 0;
            this.f280o = 0;
            this.f276k = null;
            this.f269b.k0.f326a = -1;
            this.f273f = null;
            this.f268a = -1;
            this.f271d = false;
            t0 t0Var = this.f270c;
            if (t0Var.f491e == this) {
                t0Var.f491e = null;
            }
            this.f270c = null;
            this.f269b = null;
        }
    }
}
