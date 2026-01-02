package u;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6019a;

    /* renamed from: e  reason: collision with root package name */
    public float f6023e;

    /* renamed from: r  reason: collision with root package name */
    public int f6029r;

    /* renamed from: b  reason: collision with root package name */
    public int f6020b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f6021c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f6022d = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6024f = false;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f6025m = new float[9];

    /* renamed from: n  reason: collision with root package name */
    public final float[] f6026n = new float[9];

    /* renamed from: o  reason: collision with root package name */
    public b[] f6027o = new b[16];

    /* renamed from: p  reason: collision with root package name */
    public int f6028p = 0;
    public int q = 0;

    public f(int i) {
        this.f6029r = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i9 = this.f6028p;
            if (i >= i9) {
                b[] bVarArr = this.f6027o;
                if (i9 >= bVarArr.length) {
                    this.f6027o = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f6027o;
                int i10 = this.f6028p;
                bVarArr2[i10] = bVar;
                this.f6028p = i10 + 1;
                return;
            } else if (this.f6027o[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f6028p;
        int i9 = 0;
        while (i9 < i) {
            if (this.f6027o[i9] == bVar) {
                while (i9 < i - 1) {
                    b[] bVarArr = this.f6027o;
                    int i10 = i9 + 1;
                    bVarArr[i9] = bVarArr[i10];
                    i9 = i10;
                }
                this.f6028p--;
                return;
            }
            i9++;
        }
    }

    public final void c() {
        this.f6029r = 5;
        this.f6022d = 0;
        this.f6020b = -1;
        this.f6021c = -1;
        this.f6023e = 0.0f;
        this.f6024f = false;
        int i = this.f6028p;
        for (int i9 = 0; i9 < i; i9++) {
            this.f6027o[i9] = null;
        }
        this.f6028p = 0;
        this.q = 0;
        this.f6019a = false;
        Arrays.fill(this.f6026n, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6020b - ((f) obj).f6020b;
    }

    public final void d(c cVar, float f9) {
        this.f6023e = f9;
        this.f6024f = true;
        int i = this.f6028p;
        this.f6021c = -1;
        for (int i9 = 0; i9 < i; i9++) {
            this.f6027o[i9].h(cVar, this, false);
        }
        this.f6028p = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f6028p;
        for (int i9 = 0; i9 < i; i9++) {
            this.f6027o[i9].i(cVar, bVar, false);
        }
        this.f6028p = 0;
    }

    public final String toString() {
        return "" + this.f6020b;
    }
}
