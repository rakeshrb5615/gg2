package v3;

import android.util.StateSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public int f6168a;

    /* renamed from: b  reason: collision with root package name */
    public p f6169b;

    /* renamed from: c  reason: collision with root package name */
    public int[][] f6170c;

    /* renamed from: d  reason: collision with root package name */
    public p[] f6171d;

    /* renamed from: e  reason: collision with root package name */
    public b0 f6172e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f6173f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f6174g;

    /* renamed from: h  reason: collision with root package name */
    public b0 f6175h;

    public c0(p pVar) {
        b();
        a(StateSet.WILD_CARD, pVar);
    }

    public final void a(int[] iArr, p pVar) {
        int i = this.f6168a;
        if (i == 0 || iArr.length == 0) {
            this.f6169b = pVar;
        }
        int[][] iArr2 = this.f6170c;
        if (i >= iArr2.length) {
            int i9 = i + 10;
            int[][] iArr3 = new int[i9];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f6170c = iArr3;
            p[] pVarArr = new p[i9];
            System.arraycopy(this.f6171d, 0, pVarArr, 0, i);
            this.f6171d = pVarArr;
        }
        int[][] iArr4 = this.f6170c;
        int i10 = this.f6168a;
        iArr4[i10] = iArr;
        this.f6171d[i10] = pVar;
        this.f6168a = i10 + 1;
    }

    public final void b() {
        this.f6169b = new p();
        this.f6170c = new int[10];
        this.f6171d = new p[10];
    }
}
