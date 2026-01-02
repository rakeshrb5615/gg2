package z3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class v extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f7285e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f7286f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.material.datepicker.o f7287g;

    public v(o oVar, int i) {
        super(oVar);
        this.f7285e = 2131231168;
        this.f7287g = new com.google.android.material.datepicker.o(this, 4);
        if (i != 0) {
            this.f7285e = i;
        }
    }

    @Override // z3.p
    public final void b() {
        p();
    }

    @Override // z3.p
    public final int c() {
        return 2131952217;
    }

    @Override // z3.p
    public final int d() {
        return this.f7285e;
    }

    @Override // z3.p
    public final View.OnClickListener f() {
        return this.f7287g;
    }

    @Override // z3.p
    public final boolean j() {
        return true;
    }

    @Override // z3.p
    public final boolean k() {
        EditText editText = this.f7286f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // z3.p
    public final void l(EditText editText) {
        this.f7286f = editText;
        p();
    }

    @Override // z3.p
    public final void q() {
        EditText editText = this.f7286f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f7286f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // z3.p
    public final void r() {
        EditText editText = this.f7286f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
