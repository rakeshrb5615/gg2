package g1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class x implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1689a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f1690b;

    public x(Spannable spannable) {
        this.f1690b = spannable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [v3.f] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void a() {
        Spannable spannable = this.f1690b;
        if (!this.f1689a) {
            if ((Build.VERSION.SDK_INT < 28 ? new Object() : new Object()).n(spannable)) {
                this.f1690b = new SpannableString(spannable);
            }
        }
        this.f1689a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1690b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1690b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1690b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1690b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1690b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1690b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i9, Class cls) {
        return this.f1690b.getSpans(i, i9, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1690b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i9, Class cls) {
        return this.f1690b.nextSpanTransition(i, i9, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1690b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i9, int i10) {
        a();
        this.f1690b.setSpan(obj, i, i9, i10);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i9) {
        return this.f1690b.subSequence(i, i9);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1690b.toString();
    }
}
