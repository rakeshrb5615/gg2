package y0;

import a2.g0;
import a2.l;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e {

    /* renamed from: v  reason: collision with root package name */
    public static final g0 f6713v = new g0(1);

    /* renamed from: a  reason: collision with root package name */
    public int f6714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6715b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f6717d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f6718e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f6719f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f6720g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f6721h;
    public int[] i;
    public int[] j;

    /* renamed from: k  reason: collision with root package name */
    public int f6722k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f6723l;

    /* renamed from: m  reason: collision with root package name */
    public final float f6724m;

    /* renamed from: n  reason: collision with root package name */
    public final float f6725n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6726o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f6727p;
    public final w0.a q;

    /* renamed from: r  reason: collision with root package name */
    public View f6728r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6729s;

    /* renamed from: t  reason: collision with root package name */
    public final CoordinatorLayout f6730t;

    /* renamed from: c  reason: collision with root package name */
    public int f6716c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final l f6731u = new l(this, 9);

    public e(Context context, CoordinatorLayout coordinatorLayout, w0.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f6730t = coordinatorLayout;
        this.q = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6726o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6715b = viewConfiguration.getScaledTouchSlop();
        this.f6724m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6725n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6727p = new OverScroller(context, f6713v);
    }

    public final void a() {
        this.f6716c = -1;
        float[] fArr = this.f6717d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6718e, 0.0f);
            Arrays.fill(this.f6719f, 0.0f);
            Arrays.fill(this.f6720g, 0.0f);
            Arrays.fill(this.f6721h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.f6722k = 0;
        }
        VelocityTracker velocityTracker = this.f6723l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6723l = null;
        }
    }

    public final void b(View view, int i) {
        CoordinatorLayout parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f6730t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f6728r = view;
        this.f6716c = i;
        this.q.f(view, i);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            w0.a r1 = r3.q
            int r4 = r1.d(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.e()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f6715b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f6715b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f6715b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.e.c(android.view.View, float, float):boolean");
    }

    public final void d(int i) {
        float[] fArr = this.f6717d;
        if (fArr != null) {
            int i9 = this.f6722k;
            int i10 = 1 << i;
            if ((i9 & i10) != 0) {
                fArr[i] = 0.0f;
                this.f6718e[i] = 0.0f;
                this.f6719f[i] = 0.0f;
                this.f6720g[i] = 0.0f;
                this.f6721h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.f6722k = (~i10) & i9;
            }
        }
    }

    public final int e(int i, int i9, int i10) {
        int width;
        if (i == 0) {
            return 0;
        }
        float width2 = this.f6730t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i9);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i10) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f6714a == 2) {
            OverScroller overScroller = this.f6727p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f6728r.getLeft();
            int top = currY - this.f6728r.getTop();
            if (left != 0) {
                View view = this.f6728r;
                WeakHashMap weakHashMap = q0.f5172a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f6728r;
                WeakHashMap weakHashMap2 = q0.f5172a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.q.h(this.f6728r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f6730t.post(this.f6731u);
            }
        }
        return this.f6714a == 2;
    }

    public final View g(int i, int i9) {
        CoordinatorLayout coordinatorLayout = this.f6730t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i9, int i10, int i11) {
        float f9;
        float f10;
        float f11;
        float f12;
        int left = this.f6728r.getLeft();
        int top = this.f6728r.getTop();
        int i12 = i - left;
        int i13 = i9 - top;
        OverScroller overScroller = this.f6727p;
        if (i12 == 0 && i13 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f6728r;
        int i14 = (int) this.f6725n;
        int i15 = (int) this.f6724m;
        int abs = Math.abs(i10);
        if (abs < i14) {
            i10 = 0;
        } else if (abs > i15) {
            i10 = i10 > 0 ? i15 : -i15;
        }
        int abs2 = Math.abs(i11);
        if (abs2 < i14) {
            i11 = 0;
        } else if (abs2 > i15) {
            i11 = i11 > 0 ? i15 : -i15;
        }
        int abs3 = Math.abs(i12);
        int abs4 = Math.abs(i13);
        int abs5 = Math.abs(i10);
        int abs6 = Math.abs(i11);
        int i16 = abs5 + abs6;
        int i17 = abs3 + abs4;
        if (i10 != 0) {
            f9 = abs5;
            f10 = i16;
        } else {
            f9 = abs3;
            f10 = i17;
        }
        float f13 = f9 / f10;
        if (i11 != 0) {
            f11 = abs6;
            f12 = i16;
        } else {
            f11 = abs4;
            f12 = i17;
        }
        float f14 = f11 / f12;
        w0.a aVar = this.q;
        overScroller.startScroll(left, top, i12, i13, (int) ((e(i13, i11, aVar.e()) * f14) + (e(i12, i10, aVar.d(view)) * f13)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f6722k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f6723l == null) {
            this.f6723l = VelocityTracker.obtain();
        }
        this.f6723l.addMovement(motionEvent);
        int i9 = 0;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g3 = g((int) x9, (int) y9);
            l(x9, y9, pointerId);
            q(g3, pointerId);
            int i10 = this.f6721h[pointerId];
        } else if (actionMasked == 1) {
            if (this.f6714a == 1) {
                k();
            }
            a();
        } else {
            w0.a aVar = this.q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f6714a == 1) {
                        this.f6729s = true;
                        aVar.i(this.f6728r, 0.0f, 0.0f);
                        this.f6729s = false;
                        if (this.f6714a == 1) {
                            n(0);
                        }
                    }
                    a();
                } else if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x10 = motionEvent.getX(actionIndex);
                    float y10 = motionEvent.getY(actionIndex);
                    l(x10, y10, pointerId2);
                    if (this.f6714a == 0) {
                        q(g((int) x10, (int) y10), pointerId2);
                        int i11 = this.f6721h[pointerId2];
                        return;
                    }
                    int i12 = (int) x10;
                    int i13 = (int) y10;
                    View view = this.f6728r;
                    if (view != null && i12 >= view.getLeft() && i12 < view.getRight() && i13 >= view.getTop() && i13 < view.getBottom()) {
                        i9 = 1;
                    }
                    if (i9 != 0) {
                        q(this.f6728r, pointerId2);
                    }
                } else if (actionMasked != 6) {
                } else {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f6714a == 1 && pointerId3 == this.f6716c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i9 >= pointerCount) {
                                i = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i9);
                            if (pointerId4 != this.f6716c) {
                                View g4 = g((int) motionEvent.getX(i9), (int) motionEvent.getY(i9));
                                View view2 = this.f6728r;
                                if (g4 == view2 && q(view2, pointerId4)) {
                                    i = this.f6716c;
                                    break;
                                }
                            }
                            i9++;
                        }
                        if (i == -1) {
                            k();
                        }
                    }
                    d(pointerId3);
                }
            } else if (this.f6714a == 1) {
                if (i(this.f6716c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6716c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f6719f;
                    int i14 = this.f6716c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f6720g[i14]);
                    int left = this.f6728r.getLeft() + i15;
                    int top = this.f6728r.getTop() + i16;
                    int left2 = this.f6728r.getLeft();
                    int top2 = this.f6728r.getTop();
                    if (i15 != 0) {
                        left = aVar.b(this.f6728r, left);
                        WeakHashMap weakHashMap = q0.f5172a;
                        this.f6728r.offsetLeftAndRight(left - left2);
                    }
                    if (i16 != 0) {
                        top = aVar.c(this.f6728r, top);
                        WeakHashMap weakHashMap2 = q0.f5172a;
                        this.f6728r.offsetTopAndBottom(top - top2);
                    }
                    if (i15 != 0 || i16 != 0) {
                        aVar.h(this.f6728r, left, top);
                    }
                    m(motionEvent);
                }
            } else {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i9 < pointerCount2) {
                    int pointerId5 = motionEvent.getPointerId(i9);
                    if (i(pointerId5)) {
                        float x12 = motionEvent.getX(i9);
                        float y12 = motionEvent.getY(i9);
                        float f9 = x12 - this.f6717d[pointerId5];
                        float f10 = y12 - this.f6718e[pointerId5];
                        Math.abs(f9);
                        Math.abs(f10);
                        int i17 = this.f6721h[pointerId5];
                        Math.abs(f10);
                        Math.abs(f9);
                        int i18 = this.f6721h[pointerId5];
                        Math.abs(f9);
                        Math.abs(f10);
                        int i19 = this.f6721h[pointerId5];
                        Math.abs(f10);
                        Math.abs(f9);
                        int i20 = this.f6721h[pointerId5];
                        if (this.f6714a != 1) {
                            View g6 = g((int) x12, (int) y12);
                            if (c(g6, f9, f10) && q(g6, pointerId5)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i9++;
                }
                m(motionEvent);
            }
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f6723l;
        float f9 = this.f6724m;
        velocityTracker.computeCurrentVelocity(1000, f9);
        float xVelocity = this.f6723l.getXVelocity(this.f6716c);
        float abs = Math.abs(xVelocity);
        float f10 = this.f6725n;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f9) {
            xVelocity = xVelocity > 0.0f ? f9 : -f9;
        }
        float yVelocity = this.f6723l.getYVelocity(this.f6716c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f9 = 0.0f;
        } else if (abs2 <= f9) {
            f9 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f9 = -f9;
        }
        this.f6729s = true;
        this.q.i(this.f6728r, xVelocity, f9);
        this.f6729s = false;
        if (this.f6714a == 1) {
            n(0);
        }
    }

    public final void l(float f9, float f10, int i) {
        float[] fArr = this.f6717d;
        if (fArr == null || fArr.length <= i) {
            int i9 = i + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6718e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6719f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6720g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6721h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6717d = fArr2;
            this.f6718e = fArr3;
            this.f6719f = fArr4;
            this.f6720g = fArr5;
            this.f6721h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f6717d;
        this.f6719f[i] = f9;
        fArr9[i] = f9;
        float[] fArr10 = this.f6718e;
        this.f6720g[i] = f10;
        fArr10[i] = f10;
        int[] iArr7 = this.f6721h;
        int i10 = (int) f9;
        int i11 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f6730t;
        int left = coordinatorLayout.getLeft();
        int i12 = this.f6726o;
        int i13 = i10 < left + i12 ? 1 : 0;
        if (i11 < coordinatorLayout.getTop() + i12) {
            i13 |= 4;
        }
        if (i10 > coordinatorLayout.getRight() - i12) {
            i13 |= 2;
        }
        if (i11 > coordinatorLayout.getBottom() - i12) {
            i13 |= 8;
        }
        iArr7[i] = i13;
        this.f6722k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x9 = motionEvent.getX(i);
                float y9 = motionEvent.getY(i);
                this.f6719f[pointerId] = x9;
                this.f6720g[pointerId] = y9;
            }
        }
    }

    public final void n(int i) {
        this.f6730t.removeCallbacks(this.f6731u);
        if (this.f6714a != i) {
            this.f6714a = i;
            this.q.g(i);
            if (this.f6714a == 0) {
                this.f6728r = null;
            }
        }
    }

    public final boolean o(int i, int i9) {
        if (this.f6729s) {
            return h(i, i9, (int) this.f6723l.getXVelocity(this.f6716c), (int) this.f6723l.getYVelocity(this.f6716c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i) {
        if (view == this.f6728r && this.f6716c == i) {
            return true;
        }
        if (view == null || !this.q.j(view, i)) {
            return false;
        }
        this.f6716c = i;
        b(view, i);
        return true;
    }
}
