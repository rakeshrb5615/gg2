package z3;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f7242a;

    /* renamed from: b  reason: collision with root package name */
    public final o f7243b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7244c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f7245d;

    public p(o oVar) {
        this.f7242a = oVar.f7223a;
        this.f7243b = oVar;
        this.f7244c = oVar.getContext();
        this.f7245d = oVar.f7229m;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof k;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(r0.c cVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z9) {
    }

    public final void p() {
        this.f7243b.f(false);
    }

    public void q() {
    }

    public void r() {
    }
}
