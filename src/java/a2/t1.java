package a2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public int f500a;

    /* renamed from: b  reason: collision with root package name */
    public int f501b;

    /* renamed from: c  reason: collision with root package name */
    public int f502c;

    /* renamed from: d  reason: collision with root package name */
    public int f503d;

    /* renamed from: e  reason: collision with root package name */
    public int f504e;

    public final boolean a() {
        int i = this.f500a;
        int i9 = 2;
        if ((i & 7) != 0) {
            int i10 = this.f503d;
            int i11 = this.f501b;
            if (((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i12 = this.f503d;
            int i13 = this.f502c;
            if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i14 = this.f504e;
            int i15 = this.f501b;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i16 = this.f504e;
            int i17 = this.f502c;
            if (i16 > i17) {
                i9 = 1;
            } else if (i16 != i17) {
                i9 = 4;
            }
            if ((i & (i9 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
