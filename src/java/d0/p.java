package d0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1024a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1028e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1029f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f1030g;

    /* renamed from: h  reason: collision with root package name */
    public IconCompat f1031h;
    public int i;
    public int j;

    /* renamed from: l  reason: collision with root package name */
    public q f1033l;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f1035n;
    public String q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f1038r;

    /* renamed from: s  reason: collision with root package name */
    public final Notification f1039s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f1040t;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1025b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1026c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1027d = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f1032k = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1034m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f1036o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f1037p = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f1039s = notification;
        this.f1024a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f1040t = new ArrayList();
        this.f1038r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        j6.s sVar = new j6.s(this);
        p pVar = (p) sVar.f3284d;
        q qVar = pVar.f1033l;
        if (qVar != null) {
            qVar.a(sVar);
        }
        Notification build = ((Notification.Builder) sVar.f3283c).build();
        if (qVar != null) {
            pVar.f1033l.getClass();
        }
        if (qVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", qVar.b());
        }
        return build;
    }

    public final void c(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f1024a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131165280);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165279);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f1031h = iconCompat;
    }

    public final void d(q qVar) {
        if (this.f1033l != qVar) {
            this.f1033l = qVar;
            if (qVar.f1041a != this) {
                qVar.f1041a = this;
                d(qVar);
            }
        }
    }
}
