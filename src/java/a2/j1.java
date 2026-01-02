package a2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class j1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public int f358a;

    /* renamed from: b  reason: collision with root package name */
    public int f359b;

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f360c;

    /* renamed from: d  reason: collision with root package name */
    public Interpolator f361d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f362e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f363f;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f364m;

    public j1(RecyclerView recyclerView) {
        this.f364m = recyclerView;
        g0 g0Var = RecyclerView.M0;
        this.f361d = g0Var;
        this.f362e = false;
        this.f363f = false;
        this.f360c = new OverScroller(recyclerView.getContext(), g0Var);
    }

    public final void a(int i, int i9) {
        RecyclerView recyclerView = this.f364m;
        recyclerView.setScrollState(2);
        this.f359b = 0;
        this.f358a = 0;
        Interpolator interpolator = this.f361d;
        g0 g0Var = RecyclerView.M0;
        if (interpolator != g0Var) {
            this.f361d = g0Var;
            this.f360c = new OverScroller(recyclerView.getContext(), g0Var);
        }
        this.f360c.fling(0, 0, i, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f362e) {
            this.f363f = true;
            return;
        }
        RecyclerView recyclerView = this.f364m;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = q0.q0.f5172a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i9, int i10, Interpolator interpolator) {
        RecyclerView recyclerView = this.f364m;
        if (i10 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i9);
            boolean z9 = abs > abs2;
            int width = z9 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z9) {
                abs = abs2;
            }
            i10 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i11 = i10;
        if (interpolator == null) {
            interpolator = RecyclerView.M0;
        }
        if (this.f361d != interpolator) {
            this.f361d = interpolator;
            this.f360c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f359b = 0;
        this.f358a = 0;
        recyclerView.setScrollState(2);
        this.f360c.startScroll(0, 0, i, i9, i11);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f364m;
        int[] iArr = recyclerView.w0;
        if (recyclerView.s == null) {
            recyclerView.removeCallbacks(this);
            this.f360c.abortAnimation();
            return;
        }
        this.f363f = false;
        this.f362e = true;
        recyclerView.p();
        OverScroller overScroller = this.f360c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i12 = currY - this.f359b;
            this.f358a = currX;
            this.f359b = currY;
            int o9 = RecyclerView.o(currX - this.f358a, recyclerView.L, recyclerView.N, recyclerView.getWidth());
            int o10 = RecyclerView.o(i12, recyclerView.M, recyclerView.O, recyclerView.getHeight());
            int[] iArr2 = recyclerView.w0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(o9, o10, 1, iArr2, (int[]) null)) {
                o9 -= iArr[0];
                o10 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o9, o10);
            }
            if (recyclerView.r != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.e0(o9, o10, iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                int i15 = o9 - i13;
                int i16 = o10 - i14;
                b0 b0Var = recyclerView.s.f491e;
                if (b0Var != null && !b0Var.f271d && b0Var.f272e) {
                    int b10 = recyclerView.k0.b();
                    if (b10 == 0) {
                        b0Var.i();
                    } else if (b0Var.f268a >= b10) {
                        b0Var.f268a = b10 - 1;
                        b0Var.g(i13, i14);
                    } else {
                        b0Var.g(i13, i14);
                    }
                }
                i = i15;
                i10 = i13;
                i9 = i16;
                i11 = i14;
            } else {
                i = o9;
                i9 = o10;
                i10 = 0;
                i11 = 0;
            }
            if (!recyclerView.u.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i10, i11, i, i9, (int[]) null, 1, iArr3);
            int i17 = i - iArr[0];
            int i18 = i9 - iArr[1];
            if (i10 != 0 || i11 != 0) {
                recyclerView.w(i10, i11);
            }
            if (!RecyclerView.d(recyclerView)) {
                recyclerView.invalidate();
            }
            boolean z9 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i17 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i18 != 0));
            b0 b0Var2 = recyclerView.s.f491e;
            if ((b0Var2 == null || !b0Var2.f271d) && z9) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i19 = i17 < 0 ? -currVelocity : i17 > 0 ? currVelocity : 0;
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i19 < 0) {
                        recyclerView.y();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-i19);
                        }
                    } else if (i19 > 0) {
                        recyclerView.z();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(i19);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.O.isFinished()) {
                            recyclerView.O.onAbsorb(currVelocity);
                        }
                    }
                    if (i19 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.K0) {
                    r rVar = recyclerView.j0;
                    int[] iArr4 = (int[]) rVar.f453d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    rVar.f452c = 0;
                }
            } else {
                b();
                t tVar = recyclerView.i0;
                if (tVar != null) {
                    tVar.a(recyclerView, i10, i11);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                l0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        b0 b0Var3 = recyclerView.s.f491e;
        if (b0Var3 != null && b0Var3.f271d) {
            b0Var3.g(0, 0);
        }
        this.f362e = false;
        if (!this.f363f) {
            recyclerView.setScrollState(0);
            recyclerView.m0(1);
            return;
        }
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = q0.q0.f5172a;
        recyclerView.postOnAnimation(this);
    }
}
