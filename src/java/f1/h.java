package f1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public double f1391a;

    /* renamed from: b  reason: collision with root package name */
    public double f1392b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1393c;

    /* renamed from: d  reason: collision with root package name */
    public double f1394d;

    /* renamed from: e  reason: collision with root package name */
    public double f1395e;

    /* renamed from: f  reason: collision with root package name */
    public double f1396f;

    /* renamed from: g  reason: collision with root package name */
    public double f1397g;

    /* renamed from: h  reason: collision with root package name */
    public double f1398h;
    public double i;
    public final f j;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, f1.f] */
    public h() {
        this.f1391a = Math.sqrt(1500.0d);
        this.f1392b = 0.5d;
        this.f1393c = false;
        this.i = Double.MAX_VALUE;
        this.j = new Object();
    }

    public final f a(double d9, double d10, long j) {
        double sin;
        double cos;
        if (!this.f1393c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d11 = this.f1392b;
            if (d11 > 1.0d) {
                double d12 = this.f1391a;
                this.f1396f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                double d13 = this.f1392b;
                double d14 = this.f1391a;
                this.f1397g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.f1398h = Math.sqrt(1.0d - (d11 * d11)) * this.f1391a;
            }
            this.f1393c = true;
        }
        double d15 = j / 1000.0d;
        double d16 = d9 - this.i;
        double d17 = this.f1392b;
        int i = (d17 > 1.0d ? 1 : (d17 == 1.0d ? 0 : -1));
        if (i > 0) {
            double d18 = this.f1397g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f1396f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f1396f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f1397g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f1396f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (i == 0) {
            double d23 = this.f1391a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f1391a) * d15) * d25;
            double d26 = -this.f1391a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.f1398h;
            double d28 = this.f1391a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.f1398h * d15) * d29) + (Math.cos(this.f1398h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f1391a;
            double d31 = this.f1392b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.f1398h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.f1398h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        f fVar = this.j;
        fVar.f1374a = (float) (sin + this.i);
        fVar.f1375b = (float) cos;
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, f1.f] */
    public h(float f9) {
        this.f1391a = Math.sqrt(1500.0d);
        this.f1392b = 0.5d;
        this.f1393c = false;
        this.j = new Object();
        this.i = f9;
    }
}
