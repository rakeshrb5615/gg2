package z;

import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f7041a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f7042a0;

    /* renamed from: b  reason: collision with root package name */
    public int f7043b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7044b0;

    /* renamed from: c  reason: collision with root package name */
    public float f7045c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7046c0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7047d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f7048d0;

    /* renamed from: e  reason: collision with root package name */
    public int f7049e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7050e0;

    /* renamed from: f  reason: collision with root package name */
    public int f7051f;
    public int f0;

    /* renamed from: g  reason: collision with root package name */
    public int f7052g;

    /* renamed from: g0  reason: collision with root package name */
    public int f7053g0;

    /* renamed from: h  reason: collision with root package name */
    public int f7054h;

    /* renamed from: h0  reason: collision with root package name */
    public int f7055h0;
    public int i;

    /* renamed from: i0  reason: collision with root package name */
    public int f7056i0;
    public int j;

    /* renamed from: j0  reason: collision with root package name */
    public int f7057j0;

    /* renamed from: k  reason: collision with root package name */
    public int f7058k;

    /* renamed from: k0  reason: collision with root package name */
    public int f7059k0;

    /* renamed from: l  reason: collision with root package name */
    public int f7060l;
    public float l0;

    /* renamed from: m  reason: collision with root package name */
    public int f7061m;

    /* renamed from: m0  reason: collision with root package name */
    public int f7062m0;

    /* renamed from: n  reason: collision with root package name */
    public int f7063n;

    /* renamed from: n0  reason: collision with root package name */
    public int f7064n0;

    /* renamed from: o  reason: collision with root package name */
    public int f7065o;

    /* renamed from: o0  reason: collision with root package name */
    public float f7066o0;

    /* renamed from: p  reason: collision with root package name */
    public int f7067p;

    /* renamed from: p0  reason: collision with root package name */
    public w.d f7068p0;
    public int q;

    /* renamed from: r  reason: collision with root package name */
    public float f7069r;

    /* renamed from: s  reason: collision with root package name */
    public int f7070s;

    /* renamed from: t  reason: collision with root package name */
    public int f7071t;

    /* renamed from: u  reason: collision with root package name */
    public int f7072u;

    /* renamed from: v  reason: collision with root package name */
    public int f7073v;

    /* renamed from: w  reason: collision with root package name */
    public int f7074w;

    /* renamed from: x  reason: collision with root package name */
    public int f7075x;

    /* renamed from: y  reason: collision with root package name */
    public int f7076y;

    /* renamed from: z  reason: collision with root package name */
    public int f7077z;

    public final void a() {
        this.f7048d0 = false;
        this.f7042a0 = true;
        this.f7044b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.f7042a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i9 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i9 == -2 && this.X) {
            this.f7044b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f7042a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i9 == 0 || i9 == -1) {
            this.f7044b0 = false;
            if (i9 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f7045c == -1.0f && this.f7041a == -1 && this.f7043b == -1) {
            return;
        }
        this.f7048d0 = true;
        this.f7042a0 = true;
        this.f7044b0 = true;
        if (!(this.f7068p0 instanceof w.h)) {
            this.f7068p0 = new w.h();
        }
        ((w.h) this.f7068p0).S(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e.resolveLayoutDirection(int):void");
    }
}
