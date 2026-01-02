package r3;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final PathInterpolator f5558a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final View f5559b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5560c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5561d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5562e;

    /* renamed from: f  reason: collision with root package name */
    public c.a f5563f;

    public a(View view) {
        this.f5559b = view;
        Context context = view.getContext();
        this.f5560c = t1.P(context, 2130969527, 300);
        this.f5561d = t1.P(context, 2130969532, 150);
        this.f5562e = t1.P(context, 2130969531, 100);
    }
}
