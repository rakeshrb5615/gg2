package z3;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import n.b1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class y extends q0.b {

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f7301d;

    public y(TextInputLayout textInputLayout) {
        this.f7301d = textInputLayout;
    }

    @Override // q0.b
    public final void d(View view, r0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        this.f5094a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f7301d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z9 = textInputLayout.B0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        w wVar = textInputLayout.b;
        b1 b1Var = wVar.f7289b;
        if (b1Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(b1Var);
            accessibilityNodeInfo.setTraversalAfter(b1Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(wVar.f7291d);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (!z9 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        accessibilityNodeInfo.setMaxTextLength((text == null || text.length() != counterMaxLength) ? -1 : -1);
        if (z10) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        b1 b1Var2 = textInputLayout.q.f7273y;
        if (b1Var2 != null) {
            accessibilityNodeInfo.setLabelFor(b1Var2);
        }
        textInputLayout.c.b().m(cVar);
    }

    @Override // q0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f7301d.c.b().n(accessibilityEvent);
    }
}
