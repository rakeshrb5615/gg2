package g2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class q extends h {

    /* renamed from: p  reason: collision with root package name */
    public static final PorterDuff.Mode f1756p = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public o f1757b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f1758c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f1759d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1760e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1761f;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f1762m;

    /* renamed from: n  reason: collision with root package name */
    public final Matrix f1763n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f1764o;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, g2.o] */
    public q() {
        this.f1761f = true;
        this.f1762m = new float[9];
        this.f1763n = new Matrix();
        this.f1764o = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f1747c = null;
        constantState.f1748d = f1756p;
        constantState.f1746b = new n();
        this.f1757b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1764o;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1759d;
        if (colorFilter == null) {
            colorFilter = this.f1758c;
        }
        Matrix matrix = this.f1763n;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1762m;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (rect.width() * abs));
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f1757b;
        Bitmap bitmap = oVar.f1750f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f1750f.getHeight()) {
            oVar.f1750f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            oVar.f1753k = true;
        }
        if (this.f1761f) {
            o oVar2 = this.f1757b;
            if (oVar2.f1753k || oVar2.f1751g != oVar2.f1747c || oVar2.f1752h != oVar2.f1748d || oVar2.j != oVar2.f1749e || oVar2.i != oVar2.f1746b.getRootAlpha()) {
                o oVar3 = this.f1757b;
                oVar3.f1750f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f1750f);
                n nVar = oVar3.f1746b;
                nVar.a(nVar.f1738g, n.f1731p, canvas2, min, min2);
                o oVar4 = this.f1757b;
                oVar4.f1751g = oVar4.f1747c;
                oVar4.f1752h = oVar4.f1748d;
                oVar4.i = oVar4.f1746b.getRootAlpha();
                oVar4.j = oVar4.f1749e;
                oVar4.f1753k = false;
            }
        } else {
            o oVar5 = this.f1757b;
            oVar5.f1750f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f1750f);
            n nVar2 = oVar5.f1746b;
            nVar2.a(nVar2.f1738g, n.f1731p, canvas3, min, min2);
        }
        o oVar6 = this.f1757b;
        if (oVar6.f1746b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f1754l == null) {
                Paint paint2 = new Paint();
                oVar6.f1754l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f1754l.setAlpha(oVar6.f1746b.getRootAlpha());
            oVar6.f1754l.setColorFilter(colorFilter);
            paint = oVar6.f1754l;
        }
        canvas.drawBitmap(oVar6.f1750f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getAlpha() : this.f1757b.f1746b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1757b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getColorFilter() : this.f1759d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1709a != null) {
            return new p(this.f1709a.getConstantState());
        }
        this.f1757b.f1745a = getChangingConfigurations();
        return this.f1757b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1757b.f1746b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1757b.f1746b.f1739h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.isAutoMirrored() : this.f1757b.f1749e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f1757b;
        if (oVar != null) {
            n nVar = oVar.f1746b;
            if (nVar.f1743n == null) {
                nVar.f1743n = Boolean.valueOf(nVar.f1738g.a());
            }
            if (nVar.f1743n.booleanValue()) {
                return true;
            }
            ColorStateList colorStateList = this.f1757b.f1747c;
            return colorStateList != null && colorStateList.isStateful();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, g2.o] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1760e && super.mutate() == this) {
            o oVar = this.f1757b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f1747c = null;
            constantState.f1748d = f1756p;
            if (oVar != null) {
                constantState.f1745a = oVar.f1745a;
                n nVar = new n(oVar.f1746b);
                constantState.f1746b = nVar;
                if (oVar.f1746b.f1736e != null) {
                    nVar.f1736e = new Paint(oVar.f1746b.f1736e);
                }
                if (oVar.f1746b.f1735d != null) {
                    constantState.f1746b.f1735d = new Paint(oVar.f1746b.f1735d);
                }
                constantState.f1747c = oVar.f1747c;
                constantState.f1748d = oVar.f1748d;
                constantState.f1749e = oVar.f1749e;
            }
            this.f1757b = constantState;
            this.f1760e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f1757b;
        ColorStateList colorStateList = oVar.f1747c;
        if (colorStateList == null || (mode = oVar.f1748d) == null) {
            z9 = false;
        } else {
            this.f1758c = a(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        n nVar = oVar.f1746b;
        if (nVar.f1743n == null) {
            nVar.f1743n = Boolean.valueOf(nVar.f1738g.a());
        }
        if (nVar.f1743n.booleanValue()) {
            boolean b10 = oVar.f1746b.f1738g.b(iArr);
            oVar.f1753k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1757b.f1746b.getRootAlpha() != i) {
            this.f1757b.f1746b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.f1757b.f1749e = z9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1759d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            q4.b.Q(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f1757b;
        if (oVar.f1747c != colorStateList) {
            oVar.f1747c = colorStateList;
            this.f1758c = a(colorStateList, oVar.f1748d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f1757b;
        if (oVar.f1748d != mode) {
            oVar.f1748d = mode;
            this.f1758c = a(oVar.f1747c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [g2.m, g2.j, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c9;
        int i9;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f1757b;
        oVar.f1746b = new n();
        TypedArray g3 = g0.b.g(resources, theme, attributeSet, a.f1691a);
        o oVar2 = this.f1757b;
        n nVar = oVar2.f1746b;
        int i10 = !g0.b.d(xmlPullParser, "tintMode") ? -1 : g3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f1748d = mode;
        ColorStateList colorStateList = null;
        int i11 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            g3.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i12 >= 28 && i12 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = g3.getResources();
                int resourceId = g3.getResourceId(1, 0);
                ThreadLocal threadLocal = g0.c.f1606a;
                try {
                    colorStateList = g0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e9) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e9);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f1747c = colorStateList2;
        }
        boolean z9 = oVar2.f1749e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z9 = g3.getBoolean(5, z9);
        }
        oVar2.f1749e = z9;
        float f9 = nVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f9 = g3.getFloat(7, f9);
        }
        nVar.j = f9;
        float f10 = nVar.f1740k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = g3.getFloat(8, f10);
        }
        nVar.f1740k = f10;
        if (nVar.j <= 0.0f) {
            throw new XmlPullParserException(g3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            nVar.f1739h = g3.getDimension(3, nVar.f1739h);
            float dimension = g3.getDimension(2, nVar.i);
            nVar.i = dimension;
            if (nVar.f1739h <= 0.0f) {
                throw new XmlPullParserException(g3.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = g3.getFloat(4, alpha);
                }
                nVar.setAlpha(alpha);
                String string = g3.getString(0);
                if (string != null) {
                    nVar.f1742m = string;
                    nVar.f1744o.put(string, nVar);
                }
                g3.recycle();
                oVar.f1745a = getChangingConfigurations();
                oVar.f1753k = true;
                o oVar3 = this.f1757b;
                n nVar2 = oVar3.f1746b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k kVar = nVar2.f1738g;
                r.e eVar = nVar2.f1744o;
                arrayDeque.push(kVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar2 = (k) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            ?? mVar = new m();
                            mVar.f1711e = 0.0f;
                            mVar.f1713g = 1.0f;
                            mVar.f1714h = 1.0f;
                            mVar.i = 0.0f;
                            mVar.j = 1.0f;
                            mVar.f1715k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mVar.f1716l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            mVar.f1717m = join2;
                            mVar.f1718n = 4.0f;
                            TypedArray g4 = g0.b.g(resources, theme, attributeSet, a.f1693c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = g4.getString(0);
                                if (string2 != null) {
                                    mVar.f1729b = string2;
                                }
                                String string3 = g4.getString(2);
                                if (string3 != null) {
                                    mVar.f1728a = a.a.m(string3);
                                }
                                mVar.f1712f = g0.b.c(g4, xmlPullParser, theme, "fillColor", 1);
                                float f11 = mVar.f1714h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f11 = g4.getFloat(12, f11);
                                }
                                mVar.f1714h = f11;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? g4.getInt(8, -1) : -1;
                                Paint.Cap cap3 = mVar.f1716l;
                                if (i13 == 0) {
                                    cap = cap2;
                                } else if (i13 != 1) {
                                    cap = i13 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                mVar.f1716l = cap;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? g4.getInt(9, -1) : -1;
                                Paint.Join join3 = mVar.f1717m;
                                if (i14 == 0) {
                                    join = join2;
                                } else if (i14 != 1) {
                                    join = i14 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                mVar.f1717m = join;
                                float f12 = mVar.f1718n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f12 = g4.getFloat(10, f12);
                                }
                                mVar.f1718n = f12;
                                mVar.f1710d = g0.b.c(g4, xmlPullParser, theme, "strokeColor", 3);
                                float f13 = mVar.f1713g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f13 = g4.getFloat(11, f13);
                                }
                                mVar.f1713g = f13;
                                float f14 = mVar.f1711e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f14 = g4.getFloat(4, f14);
                                }
                                mVar.f1711e = f14;
                                float f15 = mVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f15 = g4.getFloat(6, f15);
                                }
                                mVar.j = f15;
                                float f16 = mVar.f1715k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f16 = g4.getFloat(7, f16);
                                }
                                mVar.f1715k = f16;
                                float f17 = mVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f17 = g4.getFloat(5, f17);
                                }
                                mVar.i = f17;
                                int i15 = mVar.f1730c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i15 = g4.getInt(13, i15);
                                }
                                mVar.f1730c = i15;
                            }
                            g4.recycle();
                            kVar2.f1720b.add(mVar);
                            if (mVar.getPathName() != null) {
                                eVar.put(mVar.getPathName(), mVar);
                            }
                            oVar3.f1745a = oVar3.f1745a;
                            z10 = false;
                            c9 = '\b';
                        } else {
                            c9 = '\b';
                            if ("clip-path".equals(name)) {
                                m mVar2 = new m();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray g6 = g0.b.g(resources, theme, attributeSet, a.f1694d);
                                    String string4 = g6.getString(0);
                                    if (string4 != null) {
                                        mVar2.f1729b = string4;
                                    }
                                    String string5 = g6.getString(1);
                                    if (string5 != null) {
                                        mVar2.f1728a = a.a.m(string5);
                                    }
                                    mVar2.f1730c = !g0.b.d(xmlPullParser, "fillType") ? 0 : g6.getInt(2, 0);
                                    g6.recycle();
                                }
                                kVar2.f1720b.add(mVar2);
                                if (mVar2.getPathName() != null) {
                                    eVar.put(mVar2.getPathName(), mVar2);
                                }
                                oVar3.f1745a = oVar3.f1745a;
                            } else if ("group".equals(name)) {
                                k kVar3 = new k();
                                TypedArray g9 = g0.b.g(resources, theme, attributeSet, a.f1692b);
                                float f18 = kVar3.f1721c;
                                if (g0.b.d(xmlPullParser, "rotation")) {
                                    f18 = g9.getFloat(5, f18);
                                }
                                kVar3.f1721c = f18;
                                kVar3.f1722d = g9.getFloat(1, kVar3.f1722d);
                                kVar3.f1723e = g9.getFloat(2, kVar3.f1723e);
                                float f19 = kVar3.f1724f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f19 = g9.getFloat(3, f19);
                                }
                                kVar3.f1724f = f19;
                                float f20 = kVar3.f1725g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f20 = g9.getFloat(4, f20);
                                }
                                kVar3.f1725g = f20;
                                float f21 = kVar3.f1726h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f21 = g9.getFloat(6, f21);
                                }
                                kVar3.f1726h = f21;
                                float f22 = kVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f22 = g9.getFloat(7, f22);
                                }
                                kVar3.i = f22;
                                String string6 = g9.getString(0);
                                if (string6 != null) {
                                    kVar3.f1727k = string6;
                                }
                                kVar3.c();
                                g9.recycle();
                                kVar2.f1720b.add(kVar3);
                                arrayDeque.push(kVar3);
                                if (kVar3.getGroupName() != null) {
                                    eVar.put(kVar3.getGroupName(), kVar3);
                                }
                                oVar3.f1745a = oVar3.f1745a;
                            }
                        }
                        i9 = 1;
                    } else {
                        i = depth;
                        c9 = '\b';
                        i9 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i9;
                    depth = i;
                }
                if (!z10) {
                    this.f1758c = a(oVar.f1747c, oVar.f1748d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(g3.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(g3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public q(o oVar) {
        this.f1761f = true;
        this.f1762m = new float[9];
        this.f1763n = new Matrix();
        this.f1764o = new Rect();
        this.f1757b = oVar;
        this.f1758c = a(oVar.f1747c, oVar.f1748d);
    }
}
