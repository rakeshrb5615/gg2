package z3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class x implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f7298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f7299b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7300c;

    public x(TextInputLayout textInputLayout, EditText editText) {
        this.f7300c = textInputLayout;
        this.f7299b = editText;
        this.f7298a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f7300c;
        textInputLayout.w(!textInputLayout.H0, false);
        if (textInputLayout.r) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.z) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f7299b;
        int lineCount = editText.getLineCount();
        int i = this.f7298a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i9 = textInputLayout.A0;
                if (minimumHeight != i9) {
                    editText.setMinimumHeight(i9);
                }
            }
            this.f7298a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }
}
