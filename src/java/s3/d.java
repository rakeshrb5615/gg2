package s3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import g0.m;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f5824a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5825b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5826c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5827d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5828e;

    /* renamed from: f  reason: collision with root package name */
    public final float f5829f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5830g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5831h;
    public final boolean i;
    public final float j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5832k;

    /* renamed from: l  reason: collision with root package name */
    public float f5833l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5834m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5835n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5836o = false;

    /* renamed from: p  reason: collision with root package name */
    public Typeface f5837p;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, g.a.f1589w);
        this.f5833l = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f5832k = t1.v(context, obtainStyledAttributes, 3);
        t1.v(context, obtainStyledAttributes, 4);
        t1.v(context, obtainStyledAttributes, 5);
        this.f5827d = obtainStyledAttributes.getInt(2, 0);
        this.f5828e = obtainStyledAttributes.getInt(1, 1);
        int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f5834m = obtainStyledAttributes.getResourceId(i9, 0);
        this.f5825b = obtainStyledAttributes.getString(i9);
        obtainStyledAttributes.getBoolean(14, false);
        this.f5824a = t1.v(context, obtainStyledAttributes, 6);
        this.f5829f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f5830g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f5831h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, c3.a.f890u);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, 0.0f);
        this.f5826c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f5837p;
        int i = this.f5827d;
        if (typeface == null && (str = this.f5825b) != null) {
            this.f5837p = Typeface.create(str, i);
        }
        if (this.f5837p == null) {
            int i9 = this.f5828e;
            if (i9 == 1) {
                this.f5837p = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.f5837p = Typeface.SERIF;
            } else if (i9 != 3) {
                this.f5837p = Typeface.DEFAULT;
            } else {
                this.f5837p = Typeface.MONOSPACE;
            }
            this.f5837p = Typeface.create(this.f5837p, i);
        }
    }

    public final void b(Context context, q4.b bVar) {
        if (!c(context)) {
            a();
        }
        int i = this.f5834m;
        if (i == 0) {
            this.f5835n = true;
        }
        if (this.f5835n) {
            bVar.J(this.f5837p, true);
            return;
        }
        try {
            b bVar2 = new b(this, bVar);
            ThreadLocal threadLocal = m.f1631a;
            if (context.isRestricted()) {
                bVar2.a(-4);
            } else {
                m.a(context, i, new TypedValue(), 0, bVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f5835n = true;
            bVar.I(1);
        } catch (Exception e9) {
            Log.d("TextAppearance", "Error loading font " + this.f5825b, e9);
            this.f5835n = true;
            bVar.I(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface a10;
        String str;
        Typeface create;
        if (this.f5835n) {
            return true;
        }
        int i = this.f5834m;
        if (i != 0) {
            ThreadLocal threadLocal = m.f1631a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                a10 = null;
            } else {
                context2 = context;
                a10 = m.a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (a10 != null) {
                this.f5837p = a10;
                this.f5835n = true;
                return true;
            }
            if (!this.f5836o) {
                this.f5836o = true;
                Resources resources = context2.getResources();
                int i9 = this.f5834m;
                if (i9 != 0 && resources.getResourceTypeName(i9).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i9);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), c0.a.f845b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.f5827d);
                }
            }
            if (typeface != null) {
                this.f5837p = typeface;
                this.f5835n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, q4.b bVar) {
        e(context, textPaint, bVar);
        ColorStateList colorStateList = this.f5832k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f5824a;
        textPaint.setShadowLayer(this.f5831h, this.f5829f, this.f5830g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, q4.b bVar) {
        Typeface typeface;
        if (c(context) && this.f5835n && (typeface = this.f5837p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f5837p);
        b(context, new c(this, context, textPaint, bVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface b10 = k0.a.b(context.getResources().getConfiguration(), typeface);
        if (b10 != null) {
            typeface = b10;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f5827d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f5833l);
        textPaint.setFontVariationSettings(this.f5826c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
