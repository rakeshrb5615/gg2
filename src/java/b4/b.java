package b4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import q3.h;
import q3.i;
import v3.g;
import v3.k;
import v3.l;
import v3.o;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b extends k implements h {
    public CharSequence M;
    public final Context N;
    public final Paint.FontMetrics O;
    public final i P;
    public final a Q;
    public final Rect R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f713a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f714b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f715c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f716d0;

    public b(Context context, int i) {
        super(context, null, 0, i);
        this.O = new Paint.FontMetrics();
        i iVar = new i(this);
        this.P = iVar;
        this.Q = new a(this, 0);
        this.R = new Rect();
        this.Z = 1.0f;
        this.f713a0 = 1.0f;
        this.f714b0 = 0.5f;
        this.f715c0 = 0.5f;
        this.f716d0 = 1.0f;
        this.N = context;
        float f9 = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = iVar.f5360a;
        textPaint.density = f9;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float w8 = w();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.Z, this.f713a0, (getBounds().width() * this.f714b0) + getBounds().left, (getBounds().height() * this.f715c0) + getBounds().top);
        canvas.translate(w8, (float) (-((sqrt * this.X) - this.X)));
        super.draw(canvas);
        if (this.M == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            i iVar = this.P;
            TextPaint textPaint = iVar.f5360a;
            Paint.FontMetrics fontMetrics = this.O;
            textPaint.getFontMetrics(fontMetrics);
            int centerY = (int) (bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (iVar.f5365f != null) {
                textPaint.drawableState = getState();
                iVar.f5365f.d(this.N, iVar.f5360a, iVar.f5361b);
                textPaint.setAlpha((int) (this.f716d0 * 255.0f));
            }
            CharSequence charSequence = this.M;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), centerY, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.P.f5360a.getTextSize(), this.U);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f9 = this.S * 2;
        CharSequence charSequence = this.M;
        return (int) Math.max(f9 + (charSequence == null ? 0.0f : this.P.a(charSequence.toString())), this.T);
    }

    @Override // v3.k, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.W) {
            o f9 = this.f6213b.f6196a.f();
            f9.f6242k = x();
            setShapeAppearanceModel(f9.a());
        }
    }

    public final float w() {
        int i;
        Rect rect = this.R;
        if (((rect.right - getBounds().right) - this.Y) - this.V < 0) {
            i = ((rect.right - getBounds().right) - this.Y) - this.V;
        } else if (((rect.left - getBounds().left) - this.Y) + this.V <= 0) {
            return 0.0f;
        } else {
            i = ((rect.left - getBounds().left) - this.Y) + this.V;
        }
        return i;
    }

    public final l x() {
        float width = (float) ((getBounds().width() - (Math.sqrt(2.0d) * this.X)) / 2.0d);
        return new l(new g(this.X), Math.min(Math.max(-w(), -width), width));
    }
}
