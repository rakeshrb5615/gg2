package v3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public t1 f6244a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public t1 f6245b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public t1 f6246c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public t1 f6247d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public d f6248e = new a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public d f6249f = new a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public d f6250g = new a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public d f6251h = new a(0.0f);
    public f i = new Object();
    public f j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public f f6252k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public f f6253l = new Object();

    public static o a(Context context, int i, int i9, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i9 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i9, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(c3.a.f895z);
        try {
            int i10 = obtainStyledAttributes.getInt(0, 0);
            int i11 = obtainStyledAttributes.getInt(3, i10);
            int i12 = obtainStyledAttributes.getInt(4, i10);
            int i13 = obtainStyledAttributes.getInt(2, i10);
            int i14 = obtainStyledAttributes.getInt(1, i10);
            d c9 = c(obtainStyledAttributes, 5, aVar);
            d c10 = c(obtainStyledAttributes, 8, c9);
            d c11 = c(obtainStyledAttributes, 9, c9);
            d c12 = c(obtainStyledAttributes, 7, c9);
            d c13 = c(obtainStyledAttributes, 6, c9);
            o oVar = new o();
            oVar.f6234a = q4.b.j(i11);
            oVar.f6238e = c10;
            oVar.f6235b = q4.b.j(i12);
            oVar.f6239f = c11;
            oVar.f6236c = q4.b.j(i13);
            oVar.f6240g = c12;
            oVar.f6237d = q4.b.j(i14);
            oVar.f6241h = c13;
            return oVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static o b(Context context, AttributeSet attributeSet, int i, int i9) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3.a.f887r, i, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i9 = peekValue.type;
            if (i9 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i9 == 6) {
                return new m(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.f6245b instanceof n) && (this.f6244a instanceof n) && (this.f6246c instanceof n) && (this.f6247d instanceof n);
    }

    public final boolean e(RectF rectF) {
        boolean z9 = this.f6253l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.f6252k.getClass().equals(f.class);
        float a10 = this.f6248e.a(rectF);
        return z9 && ((this.f6249f.a(rectF) > a10 ? 1 : (this.f6249f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f6251h.a(rectF) > a10 ? 1 : (this.f6251h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f6250g.a(rectF) > a10 ? 1 : (this.f6250g.a(rectF) == a10 ? 0 : -1)) == 0) && d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v3.o, java.lang.Object] */
    public final o f() {
        ?? obj = new Object();
        obj.f6234a = this.f6244a;
        obj.f6235b = this.f6245b;
        obj.f6236c = this.f6246c;
        obj.f6237d = this.f6247d;
        obj.f6238e = this.f6248e;
        obj.f6239f = this.f6249f;
        obj.f6240g = this.f6250g;
        obj.f6241h = this.f6251h;
        obj.i = this.i;
        obj.j = this.j;
        obj.f6242k = this.f6252k;
        obj.f6243l = this.f6253l;
        return obj;
    }

    public final String toString() {
        return "[" + this.f6248e + ", " + this.f6249f + ", " + this.f6250g + ", " + this.f6251h + "]";
    }
}
