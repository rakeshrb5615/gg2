package i1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f2271a;

    /* renamed from: b  reason: collision with root package name */
    public h f2272b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2273c = true;

    public i(EditText editText) {
        this.f2271a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            g1.i a10 = g1.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        EditText editText = this.f2271a;
        if (editText.isInEditMode() || !this.f2273c || g1.i.f1647k == null || i9 > i10 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b10 = g1.i.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                g1.i.a().e((Spannable) charSequence, i, i10 + i);
                return;
            } else if (b10 != 3) {
                return;
            }
        }
        g1.i a10 = g1.i.a();
        if (this.f2272b == null) {
            this.f2272b = new h(editText);
        }
        a10.f(this.f2272b);
    }
}
