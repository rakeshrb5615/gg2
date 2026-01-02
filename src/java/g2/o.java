package g2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f1745a;

    /* renamed from: b  reason: collision with root package name */
    public n f1746b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f1747c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f1748d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1749e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f1750f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1751g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1752h;
    public int i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1753k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f1754l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1745a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
