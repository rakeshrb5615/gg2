package l;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import q0.t0;
import q0.u0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f3526c;

    /* renamed from: d  reason: collision with root package name */
    public u0 f3527d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3528e;

    /* renamed from: b  reason: collision with root package name */
    public long f3525b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final i f3529f = new i(this);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3524a = new ArrayList();

    public final void a() {
        if (this.f3528e) {
            ArrayList arrayList = this.f3524a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((t0) obj).b();
            }
            this.f3528e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f3528e) {
            return;
        }
        ArrayList arrayList = this.f3524a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t0 t0Var = (t0) obj;
            long j = this.f3525b;
            if (j >= 0) {
                t0Var.c(j);
            }
            Interpolator interpolator = this.f3526c;
            if (interpolator != null && (view = (View) t0Var.f5184a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f3527d != null) {
                t0Var.d(this.f3529f);
            }
            View view2 = (View) t0Var.f5184a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3528e = true;
    }
}
