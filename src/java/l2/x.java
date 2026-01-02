package l2;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class x implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f3739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f3740b;

    public x(a0 a0Var, EditText editText) {
        this.f3740b = a0Var;
        this.f3739a = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable.toString().trim())) {
            return;
        }
        EditText editText = this.f3739a;
        editText.removeTextChangedListener(this);
        String trim = editable.toString().trim();
        a0 a0Var = this.f3740b;
        EditText editText2 = a0Var.R1;
        if (editText == editText2) {
            a0Var.S1.setText("");
            a0Var.T1.setText("");
            a0Var.S1.setError(null);
            a0Var.T1.setError(null);
            if (trim.matches("[\\p{L} .,'-]+")) {
                a0Var.O1.setError((CharSequence) null);
            } else {
                a0Var.O1.setError(a0Var.getString(2131952203));
            }
        } else if (editText == a0Var.S1) {
            editText2.setText("");
            a0Var.O1.setError((CharSequence) null);
            try {
                double parseDouble = Double.parseDouble(trim);
                if (parseDouble >= -90.0d && parseDouble <= 90.0d) {
                    a0Var.P1.setError((CharSequence) null);
                }
                a0Var.P1.setError(a0Var.getString(2131951830));
            } catch (NumberFormatException unused) {
                a0Var.P1.setError(a0Var.getString(2131951830));
            }
        } else if (editText == a0Var.T1) {
            editText2.setText("");
            a0Var.O1.setError((CharSequence) null);
            try {
                double parseDouble2 = Double.parseDouble(trim);
                if (parseDouble2 >= -180.0d && parseDouble2 <= 180.0d) {
                    a0Var.Q1.setError((CharSequence) null);
                }
                a0Var.Q1.setError(a0Var.getString(2131951829));
            } catch (NumberFormatException unused2) {
                a0Var.Q1.setError(a0Var.getString(2131951829));
            }
        }
        editText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }
}
