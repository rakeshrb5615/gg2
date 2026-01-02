package z3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7218a;

    public m(o oVar) {
        this.f7218a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f7218a;
        l lVar = oVar.B;
        if (oVar.f7240y == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f7240y;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (oVar.f7240y.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f7240y.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f7240y = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        oVar.b().l(oVar.f7240y);
        oVar.j(oVar.b());
    }
}
