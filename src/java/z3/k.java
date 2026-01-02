package z3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.lifecycle.g0;
import com.google.android.material.textfield.TextInputLayout;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f7206e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7207f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f7208g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f7209h;
    public final com.google.android.material.datepicker.o i;
    public final a j;

    /* renamed from: k  reason: collision with root package name */
    public final j f7210k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7211l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7212m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7213n;

    /* renamed from: o  reason: collision with root package name */
    public long f7214o;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f7215p;
    public ValueAnimator q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f7216r;

    /* JADX WARN: Type inference failed for: r0v2, types: [z3.j] */
    public k(o oVar) {
        super(oVar);
        this.i = new com.google.android.material.datepicker.o(this, 3);
        this.j = new a(this, 1);
        this.f7210k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: z3.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z9) {
                k kVar = k.this;
                AutoCompleteTextView autoCompleteTextView = kVar.f7209h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                kVar.f7245d.setImportantForAccessibility(z9 ? 2 : 1);
            }
        };
        this.f7214o = Long.MAX_VALUE;
        this.f7207f = t1.P(oVar.getContext(), 2130969532, 67);
        this.f7206e = t1.P(oVar.getContext(), 2130969532, 50);
        this.f7208g = t1.Q(oVar.getContext(), 2130969541, d3.a.f1073a);
    }

    @Override // z3.p
    public final void a() {
        if (this.f7215p.isTouchExplorationEnabled() && this.f7209h.getInputType() != 0 && !this.f7245d.hasFocus()) {
            this.f7209h.dismissDropDown();
        }
        this.f7209h.post(new g0(this, 17));
    }

    @Override // z3.p
    public final int c() {
        return 2131951837;
    }

    @Override // z3.p
    public final int d() {
        return 2131231319;
    }

    @Override // z3.p
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // z3.p
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // z3.p
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f7210k;
    }

    @Override // z3.p
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // z3.p
    public final boolean k() {
        return this.f7213n;
    }

    @Override // z3.p
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f7209h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: z3.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    k kVar = k.this;
                    long j = uptimeMillis - kVar.f7214o;
                    if (j < 0 || j > 300) {
                        kVar.f7212m = false;
                    }
                    kVar.t();
                    kVar.f7212m = true;
                    kVar.f7214o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f7209h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: z3.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f7212m = true;
                kVar.f7214o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.f7209h.setThreshold(0);
        TextInputLayout textInputLayout = this.f7242a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f7215p.isTouchExplorationEnabled()) {
            this.f7245d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // z3.p
    public final void m(r0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        if (this.f7209h.getInputType() == 0) {
            cVar.i(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // z3.p
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f7215p.isEnabled() && this.f7209h.getInputType() == 0) {
            boolean z9 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f7213n && !this.f7209h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z9) {
                t();
                this.f7212m = true;
                this.f7214o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // z3.p
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7208g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f7207f);
        ofFloat.addUpdateListener(new i2.j(this, 4));
        this.f7216r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f7206e);
        ofFloat2.addUpdateListener(new i2.j(this, 4));
        this.q = ofFloat2;
        ofFloat2.addListener(new f2.o(this, 10));
        this.f7215p = (AccessibilityManager) this.f7244c.getSystemService("accessibility");
    }

    @Override // z3.p
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f7209h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f7209h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z9) {
        if (this.f7213n != z9) {
            this.f7213n = z9;
            this.f7216r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.f7209h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f7214o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f7212m = false;
        }
        if (this.f7212m) {
            this.f7212m = false;
            return;
        }
        s(!this.f7213n);
        if (!this.f7213n) {
            this.f7209h.dismissDropDown();
            return;
        }
        this.f7209h.requestFocus();
        this.f7209h.showDropDown();
    }
}
