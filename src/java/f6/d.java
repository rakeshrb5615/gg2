package f6;

import d6.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v3.f;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final long f1514d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f1515e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final j f1516a;

    /* renamed from: b  reason: collision with root package name */
    public long f1517b;

    /* renamed from: c  reason: collision with root package name */
    public int f1518c;

    /* JADX WARN: Type inference failed for: r0v4, types: [v3.f, java.lang.Object] */
    public d() {
        if (f.f6187b == null) {
            Pattern pattern = j.f1150c;
            f.f6187b = new Object();
        }
        f fVar = f.f6187b;
        if (j.f1151d == null) {
            j.f1151d = new j(fVar);
        }
        this.f1516a = j.f1151d;
    }

    public final synchronized boolean a() {
        boolean z9;
        if (this.f1518c != 0) {
            this.f1516a.f1152a.getClass();
            z9 = System.currentTimeMillis() > this.f1517b;
        }
        return z9;
    }

    public final synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f1518c = 0;
            }
            return;
        }
        this.f1518c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.f1518c);
                this.f1516a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f1515e);
            } else {
                min = f1514d;
            }
            this.f1516a.f1152a.getClass();
            this.f1517b = System.currentTimeMillis() + min;
        }
    }
}
