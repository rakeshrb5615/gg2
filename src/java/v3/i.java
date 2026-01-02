package v3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class i extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public p f6196a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f6197b;

    /* renamed from: c  reason: collision with root package name */
    public p3.a f6198c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f6199d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f6200e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f6201f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f6202g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f6203h;
    public final float i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f6204k;

    /* renamed from: l  reason: collision with root package name */
    public int f6205l;

    /* renamed from: m  reason: collision with root package name */
    public float f6206m;

    /* renamed from: n  reason: collision with root package name */
    public float f6207n;

    /* renamed from: o  reason: collision with root package name */
    public int f6208o;

    /* renamed from: p  reason: collision with root package name */
    public int f6209p;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public final Paint.Style f6210r;

    public i(p pVar) {
        this.f6199d = null;
        this.f6200e = null;
        this.f6201f = null;
        this.f6202g = PorterDuff.Mode.SRC_IN;
        this.f6203h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.f6205l = 255;
        this.f6206m = 0.0f;
        this.f6207n = 0.0f;
        this.f6208o = 0;
        this.f6209p = 0;
        this.q = 0;
        this.f6210r = Paint.Style.FILL_AND_STROKE;
        this.f6196a = pVar;
        this.f6198c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        k kVar = new k(this);
        kVar.f6217f = true;
        kVar.f6218m = true;
        return kVar;
    }

    public i(i iVar) {
        this.f6199d = null;
        this.f6200e = null;
        this.f6201f = null;
        this.f6202g = PorterDuff.Mode.SRC_IN;
        this.f6203h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.f6205l = 255;
        this.f6206m = 0.0f;
        this.f6207n = 0.0f;
        this.f6208o = 0;
        this.f6209p = 0;
        this.q = 0;
        this.f6210r = Paint.Style.FILL_AND_STROKE;
        this.f6196a = iVar.f6196a;
        this.f6197b = iVar.f6197b;
        this.f6198c = iVar.f6198c;
        this.f6204k = iVar.f6204k;
        this.f6199d = iVar.f6199d;
        this.f6200e = iVar.f6200e;
        this.f6202g = iVar.f6202g;
        this.f6201f = iVar.f6201f;
        this.f6205l = iVar.f6205l;
        this.i = iVar.i;
        this.q = iVar.q;
        this.f6208o = iVar.f6208o;
        this.j = iVar.j;
        this.f6206m = iVar.f6206m;
        this.f6207n = iVar.f6207n;
        this.f6209p = iVar.f6209p;
        this.f6210r = iVar.f6210r;
        if (iVar.f6203h != null) {
            this.f6203h = new Rect(iVar.f6203h);
        }
    }
}
