package i1;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class c extends g1.g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f2260a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f2261b;

    public c(TextView textView, d dVar) {
        this.f2260a = new WeakReference(textView);
        this.f2261b = new WeakReference(dVar);
    }

    @Override // g1.g
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f2260a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2260a.get();
        InputFilter inputFilter = (InputFilter) this.f2261b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    g1.i a10 = g1.i.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a10.getClass();
                        length = text.length();
                    }
                    CharSequence e9 = a10.e(text, 0, length);
                    if (text == e9) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e9);
                    int selectionEnd = Selection.getSelectionEnd(e9);
                    textView.setText(e9);
                    if (e9 instanceof Spannable) {
                        Spannable spannable = (Spannable) e9;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
