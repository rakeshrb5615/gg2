package n;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public int f4250a;

    /* renamed from: b  reason: collision with root package name */
    public int f4251b;

    /* renamed from: c  reason: collision with root package name */
    public int f4252c;

    /* renamed from: d  reason: collision with root package name */
    public int f4253d;

    /* renamed from: e  reason: collision with root package name */
    public int f4254e;

    /* renamed from: f  reason: collision with root package name */
    public int f4255f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4256g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4257h;

    public final void a(int i, int i9) {
        this.f4252c = i;
        this.f4253d = i9;
        this.f4257h = true;
        if (this.f4256g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f4250a = i9;
            }
            if (i != Integer.MIN_VALUE) {
                this.f4251b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f4250a = i;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f4251b = i9;
        }
    }
}
