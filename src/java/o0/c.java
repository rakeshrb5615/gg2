package o0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f4990a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f4991b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4992c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4993d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i9).setTextDirection(textDirectionHeuristic).build();
        }
        this.f4990a = textPaint;
        this.f4991b = textDirectionHeuristic;
        this.f4992c = i;
        this.f4993d = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f4992c == cVar.f4992c && this.f4993d == cVar.f4993d) {
                TextPaint textPaint = this.f4990a;
                float textSize = textPaint.getTextSize();
                TextPaint textPaint2 = cVar.f4990a;
                if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                    if (textPaint.getTypeface() == null) {
                        if (textPaint2.getTypeface() != null) {
                            return false;
                        }
                    } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                        return false;
                    }
                    return this.f4991b == cVar.f4991b;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f4990a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4991b, Integer.valueOf(this.f4992c), Integer.valueOf(this.f4993d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4990a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f4991b);
        sb.append(", breakStrategy=" + this.f4992c);
        sb.append(", hyphenationFrequency=" + this.f4993d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f4990a = params.getTextPaint();
        this.f4991b = params.getTextDirection();
        this.f4992c = params.getBreakStrategy();
        this.f4993d = params.getHyphenationFrequency();
    }
}
