package i1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f2262a;

    /* renamed from: b  reason: collision with root package name */
    public c f2263b;

    public d(TextView textView) {
        this.f2262a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i9, Spanned spanned, int i10, int i11) {
        TextView textView = this.f2262a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = g1.i.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                if ((i11 == 0 && i10 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i9 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i9);
                }
                return g1.i.a().e(charSequence, 0, charSequence.length());
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        g1.i a10 = g1.i.a();
        if (this.f2263b == null) {
            this.f2263b = new c(textView, this);
        }
        a10.f(this.f2263b);
        return charSequence;
    }
}
