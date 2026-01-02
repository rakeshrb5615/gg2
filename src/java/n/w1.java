package n;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class w1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f4325a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4326b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4327c;

    /* renamed from: d  reason: collision with root package name */
    public final View f4328d;

    /* renamed from: e  reason: collision with root package name */
    public v1 f4329e;

    /* renamed from: f  reason: collision with root package name */
    public v1 f4330f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4331m;

    /* renamed from: n  reason: collision with root package name */
    public int f4332n;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f4333o = new int[2];

    public w1(View view) {
        this.f4328d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4325a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4326b = tapTimeout;
        this.f4327c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        v1 v1Var = this.f4330f;
        View view = this.f4328d;
        if (v1Var != null) {
            view.removeCallbacks(v1Var);
        }
        v1 v1Var2 = this.f4329e;
        if (v1Var2 != null) {
            view.removeCallbacks(v1Var2);
        }
    }

    public abstract m.c0 b();

    public abstract boolean c();

    public boolean d() {
        m.c0 b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r4 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.w1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4331m = false;
        this.f4332n = -1;
        v1 v1Var = this.f4329e;
        if (v1Var != null) {
            this.f4328d.removeCallbacks(v1Var);
        }
    }
}
