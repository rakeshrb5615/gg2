package j5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public Double f2879a;

    /* renamed from: b  reason: collision with root package name */
    public int f2880b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2881c;

    /* renamed from: d  reason: collision with root package name */
    public int f2882d;

    /* renamed from: e  reason: collision with root package name */
    public long f2883e;

    /* renamed from: f  reason: collision with root package name */
    public long f2884f;

    /* renamed from: g  reason: collision with root package name */
    public byte f2885g;

    public final b1 a() {
        if (this.f2885g != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.f2885g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f2885g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f2885g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f2885g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f2885g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new b1(this.f2879a, this.f2880b, this.f2881c, this.f2882d, this.f2883e, this.f2884f);
    }
}
