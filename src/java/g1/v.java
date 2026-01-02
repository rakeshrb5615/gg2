package g1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final u f1685b;

    /* renamed from: e  reason: collision with root package name */
    public TextPaint f1688e;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1684a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public short f1686c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f1687d = 1.0f;

    public v(u uVar) {
        p0.e.d(uVar, "rasterizer cannot be null");
        this.f1685b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i9, float f9, int i10, int i11, int i12, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i9, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1688e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1688e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f9, i10, f9 + this.f1686c, i12, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        i.a().getClass();
        float f10 = i11;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f1685b;
        j6.s sVar = uVar.f1682b;
        Typeface typeface = paint2.getTypeface();
        paint2.setTypeface((Typeface) sVar.f3285e);
        canvas.drawText((char[]) sVar.f3283c, uVar.f1681a * 2, 2, f9, f10, paint2);
        paint2.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i9, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1684a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f1685b;
        h1.a b10 = uVar.b();
        int b11 = b10.b(14);
        this.f1687d = abs / (b11 != 0 ? ((ByteBuffer) b10.f2147d).getShort(b11 + b10.f2144a) : (short) 0);
        h1.a b12 = uVar.b();
        int b13 = b12.b(14);
        if (b13 != 0) {
            ((ByteBuffer) b12.f2147d).getShort(b13 + b12.f2144a);
        }
        h1.a b14 = uVar.b();
        int b15 = b14.b(12);
        short s5 = (short) ((b15 != 0 ? ((ByteBuffer) b14.f2147d).getShort(b15 + b14.f2144a) : (short) 0) * this.f1687d);
        this.f1686c = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}
