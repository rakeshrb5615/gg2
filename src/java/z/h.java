package z;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int[] f7091a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7092b;

    /* renamed from: c  reason: collision with root package name */
    public int f7093c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f7094d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f7095e;

    /* renamed from: f  reason: collision with root package name */
    public int f7096f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f7097g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f7098h;
    public int i;
    public int[] j;

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f7099k;

    /* renamed from: l  reason: collision with root package name */
    public int f7100l;

    public final void a(int i, float f9) {
        int i9 = this.f7096f;
        int[] iArr = this.f7094d;
        if (i9 >= iArr.length) {
            this.f7094d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f7095e;
            this.f7095e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f7094d;
        int i10 = this.f7096f;
        iArr2[i10] = i;
        float[] fArr2 = this.f7095e;
        this.f7096f = i10 + 1;
        fArr2[i10] = f9;
    }

    public final void b(int i, int i9) {
        int i10 = this.f7093c;
        int[] iArr = this.f7091a;
        if (i10 >= iArr.length) {
            this.f7091a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f7092b;
            this.f7092b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7091a;
        int i11 = this.f7093c;
        iArr3[i11] = i;
        int[] iArr4 = this.f7092b;
        this.f7093c = i11 + 1;
        iArr4[i11] = i9;
    }

    public final void c(int i, String str) {
        int i9 = this.i;
        int[] iArr = this.f7097g;
        if (i9 >= iArr.length) {
            this.f7097g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7098h;
            this.f7098h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f7097g;
        int i10 = this.i;
        iArr2[i10] = i;
        String[] strArr2 = this.f7098h;
        this.i = i10 + 1;
        strArr2[i10] = str;
    }

    public final void d(int i, boolean z9) {
        int i9 = this.f7100l;
        int[] iArr = this.j;
        if (i9 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f7099k;
            this.f7099k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i10 = this.f7100l;
        iArr2[i10] = i;
        boolean[] zArr2 = this.f7099k;
        this.f7100l = i10 + 1;
        zArr2[i10] = z9;
    }
}
