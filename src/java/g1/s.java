package g1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1676a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f1677b = new AtomicInteger(0);

    public s(Object obj) {
        this.f1676a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1676a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        ((TextWatcher) this.f1676a).beforeTextChanged(charSequence, i, i9, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i9) {
        if (this.f1677b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f1676a).onSpanAdded(spannable, obj, i, i9);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i9, int i10, int i11) {
        int i12;
        int i13;
        if (this.f1677b.get() <= 0 || !(obj instanceof v)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i9) {
                    i = 0;
                }
                if (i10 > i11) {
                    i12 = i;
                    i13 = 0;
                    ((SpanWatcher) this.f1676a).onSpanChanged(spannable, obj, i12, i9, i13, i11);
                }
            }
            i12 = i;
            i13 = i10;
            ((SpanWatcher) this.f1676a).onSpanChanged(spannable, obj, i12, i9, i13, i11);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i9) {
        if (this.f1677b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f1676a).onSpanRemoved(spannable, obj, i, i9);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        ((TextWatcher) this.f1676a).onTextChanged(charSequence, i, i9, i10);
    }
}
