package f1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import androidx.lifecycle.g0;
import java.util.ArrayList;
import r.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d {
    public static final ThreadLocal i = new ThreadLocal();

    /* renamed from: e  reason: collision with root package name */
    public final k2.c f1369e;

    /* renamed from: h  reason: collision with root package name */
    public b f1372h;

    /* renamed from: a  reason: collision with root package name */
    public final j f1365a = new j(0);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1366b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final l6.c f1367c = new l6.c(this, 16);

    /* renamed from: d  reason: collision with root package name */
    public final g0 f1368d = new g0(this, 4);

    /* renamed from: f  reason: collision with root package name */
    public boolean f1370f = false;

    /* renamed from: g  reason: collision with root package name */
    public float f1371g = 1.0f;

    public d(k2.c cVar) {
        this.f1369e = cVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [f1.a, android.animation.ValueAnimator$DurationScaleChangeListener] */
    public final void a(g gVar) {
        ArrayList arrayList = this.f1366b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f1369e.f3363b).postFrameCallback(new c(this.f1368d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f1371g = ValueAnimator.getDurationScale();
                if (this.f1372h == null) {
                    this.f1372h = new b(this);
                }
                final b bVar = this.f1372h;
                if (bVar.f1361a == null) {
                    ?? r22 = new ValueAnimator.DurationScaleChangeListener() { // from class: f1.a
                        public final void onChanged(float f9) {
                            b.this.f1362b.f1371g = f9;
                        }
                    };
                    bVar.f1361a = r22;
                    ValueAnimator.registerDurationScaleChangeListener(r22);
                }
            }
        }
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }
}
