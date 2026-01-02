package f1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
import v3.a0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g {

    /* renamed from: m  reason: collision with root package name */
    public static final e f1376m = new e(1);

    /* renamed from: n  reason: collision with root package name */
    public static final e f1377n = new e(2);

    /* renamed from: o  reason: collision with root package name */
    public static final e f1378o = new e(3);

    /* renamed from: p  reason: collision with root package name */
    public static final e f1379p = new e(4);
    public static final e q = new e(5);

    /* renamed from: r  reason: collision with root package name */
    public static final e f1380r = new e(0);

    /* renamed from: c  reason: collision with root package name */
    public final a0 f1383c;

    /* renamed from: d  reason: collision with root package name */
    public final q4.b f1384d;

    /* renamed from: g  reason: collision with root package name */
    public final float f1387g;
    public h j;

    /* renamed from: k  reason: collision with root package name */
    public float f1389k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1390l;

    /* renamed from: a  reason: collision with root package name */
    public float f1381a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f1382b = Float.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1385e = false;

    /* renamed from: f  reason: collision with root package name */
    public long f1386f = 0;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f1388h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public g(a0 a0Var, q4.b bVar) {
        this.f1383c = a0Var;
        this.f1384d = bVar;
        if (bVar == f1378o || bVar == f1379p || bVar == q) {
            this.f1387g = 0.1f;
        } else if (bVar == f1380r) {
            this.f1387g = 0.00390625f;
        } else if (bVar == f1376m || bVar == f1377n) {
            this.f1387g = 0.002f;
        } else {
            this.f1387g = 1.0f;
        }
        this.j = null;
        this.f1389k = Float.MAX_VALUE;
        this.f1390l = false;
    }

    public static d b() {
        ThreadLocal threadLocal = d.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new d(new k2.c(12)));
        }
        return (d) threadLocal.get();
    }

    public final void a(float f9) {
        if (this.f1385e) {
            this.f1389k = f9;
            return;
        }
        if (this.j == null) {
            this.j = new h(f9);
        }
        h hVar = this.j;
        double d9 = f9;
        hVar.i = d9;
        double d10 = (float) d9;
        if (d10 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.f1387g * 0.75f);
        hVar.f1394d = abs;
        hVar.f1395e = abs * 62.5d;
        k2.c cVar = b().f1369e;
        cVar.getClass();
        if (Thread.currentThread() != ((Looper) cVar.f3364c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z9 = this.f1385e;
        if (z9 || z9) {
            return;
        }
        this.f1385e = true;
        float y9 = this.f1384d.y(this.f1383c);
        this.f1382b = y9;
        if (y9 > Float.MAX_VALUE || y9 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b().a(this);
    }

    public final void c(float f9) {
        this.f1384d.R(this.f1383c, f9);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            } else if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            } else {
                i++;
            }
        }
    }

    public final void d() {
        if (this.j.f1392b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        k2.c cVar = b().f1369e;
        cVar.getClass();
        if (Thread.currentThread() != ((Looper) cVar.f3364c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f1385e) {
            this.f1390l = true;
        }
    }
}
