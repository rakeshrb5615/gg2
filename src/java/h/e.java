package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2017a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2018b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f2019c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2020d;

    /* renamed from: e  reason: collision with root package name */
    public AlertController.RecycleListView f2021e;

    /* renamed from: f  reason: collision with root package name */
    public Button f2022f;

    /* renamed from: g  reason: collision with root package name */
    public Button f2023g;

    /* renamed from: h  reason: collision with root package name */
    public Button f2024h;
    public NestedScrollView i;
    public Drawable j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f2025k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f2026l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f2027m;

    /* renamed from: n  reason: collision with root package name */
    public View f2028n;

    /* renamed from: o  reason: collision with root package name */
    public ListAdapter f2029o;
    public final int q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2031r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2032s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2033t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2034u;

    /* renamed from: v  reason: collision with root package name */
    public final c f2035v;

    /* renamed from: p  reason: collision with root package name */
    public int f2030p = -1;

    /* renamed from: w  reason: collision with root package name */
    public final com.google.android.material.datepicker.m f2036w = new com.google.android.material.datepicker.m(this, 1);

    public e(Context context, g gVar, Window window) {
        this.f2017a = context;
        this.f2018b = gVar;
        this.f2019c = window;
        c cVar = new c();
        cVar.f1990b = new WeakReference(gVar);
        this.f2035v = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.a.f1574e, 2130968623, 0);
        this.q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2031r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2032s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2033t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2034u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.c().k(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
