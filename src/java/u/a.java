package u;

import b8.g;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public final b f5989b;

    /* renamed from: c  reason: collision with root package name */
    public final g f5990c;

    /* renamed from: a  reason: collision with root package name */
    public int f5988a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5991d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f5992e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f5993f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f5994g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f5995h = -1;
    public int i = -1;
    public boolean j = false;

    public a(b bVar, g gVar) {
        this.f5989b = bVar;
        this.f5990c = gVar;
    }

    public final void a(f fVar, float f9, boolean z9) {
        if (f9 <= -0.001f || f9 >= 0.001f) {
            int i = this.f5995h;
            b bVar = this.f5989b;
            if (i == -1) {
                this.f5995h = 0;
                this.f5994g[0] = f9;
                this.f5992e[0] = fVar.f6020b;
                this.f5993f[0] = -1;
                fVar.q++;
                fVar.a(bVar);
                this.f5988a++;
                if (this.j) {
                    return;
                }
                int i9 = this.i + 1;
                this.i = i9;
                int[] iArr = this.f5992e;
                if (i9 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i != -1 && i11 < this.f5988a; i11++) {
                int i12 = this.f5992e[i];
                int i13 = fVar.f6020b;
                if (i12 == i13) {
                    float[] fArr = this.f5994g;
                    float f10 = fArr[i] + f9;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i] = f10;
                    if (f10 == 0.0f) {
                        if (i == this.f5995h) {
                            this.f5995h = this.f5993f[i];
                        } else {
                            int[] iArr2 = this.f5993f;
                            iArr2[i10] = iArr2[i];
                        }
                        if (z9) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        fVar.q--;
                        this.f5988a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i10 = i;
                }
                i = this.f5993f[i];
            }
            int i14 = this.i;
            int i15 = i14 + 1;
            if (this.j) {
                int[] iArr3 = this.f5992e;
                if (iArr3[i14] != -1) {
                    i14 = iArr3.length;
                }
            } else {
                i14 = i15;
            }
            int[] iArr4 = this.f5992e;
            if (i14 >= iArr4.length && this.f5988a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f5992e;
                    if (i16 >= iArr5.length) {
                        break;
                    } else if (iArr5[i16] == -1) {
                        i14 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            int[] iArr6 = this.f5992e;
            if (i14 >= iArr6.length) {
                i14 = iArr6.length;
                int i17 = this.f5991d * 2;
                this.f5991d = i17;
                this.j = false;
                this.i = i14 - 1;
                this.f5994g = Arrays.copyOf(this.f5994g, i17);
                this.f5992e = Arrays.copyOf(this.f5992e, this.f5991d);
                this.f5993f = Arrays.copyOf(this.f5993f, this.f5991d);
            }
            this.f5992e[i14] = fVar.f6020b;
            this.f5994g[i14] = f9;
            if (i10 != -1) {
                int[] iArr7 = this.f5993f;
                iArr7[i14] = iArr7[i10];
                iArr7[i10] = i14;
            } else {
                this.f5993f[i14] = this.f5995h;
                this.f5995h = i14;
            }
            fVar.q++;
            fVar.a(bVar);
            this.f5988a++;
            if (!this.j) {
                this.i++;
            }
            int i18 = this.i;
            int[] iArr8 = this.f5992e;
            if (i18 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.f5995h;
        for (int i9 = 0; i != -1 && i9 < this.f5988a; i9++) {
            f fVar = ((f[]) this.f5990c.f791d)[this.f5992e[i]];
            if (fVar != null) {
                fVar.b(this.f5989b);
            }
            i = this.f5993f[i];
        }
        this.f5995h = -1;
        this.i = -1;
        this.j = false;
        this.f5988a = 0;
    }

    public final float c(f fVar) {
        int i = this.f5995h;
        for (int i9 = 0; i != -1 && i9 < this.f5988a; i9++) {
            if (this.f5992e[i] == fVar.f6020b) {
                return this.f5994g[i];
            }
            i = this.f5993f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f5988a;
    }

    public final f e(int i) {
        int i9 = this.f5995h;
        for (int i10 = 0; i9 != -1 && i10 < this.f5988a; i10++) {
            if (i10 == i) {
                return ((f[]) this.f5990c.f791d)[this.f5992e[i9]];
            }
            i9 = this.f5993f[i9];
        }
        return null;
    }

    public final float f(int i) {
        int i9 = this.f5995h;
        for (int i10 = 0; i9 != -1 && i10 < this.f5988a; i10++) {
            if (i10 == i) {
                return this.f5994g[i9];
            }
            i9 = this.f5993f[i9];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f9) {
        if (f9 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i = this.f5995h;
        b bVar = this.f5989b;
        if (i == -1) {
            this.f5995h = 0;
            this.f5994g[0] = f9;
            this.f5992e[0] = fVar.f6020b;
            this.f5993f[0] = -1;
            fVar.q++;
            fVar.a(bVar);
            this.f5988a++;
            if (this.j) {
                return;
            }
            int i9 = this.i + 1;
            this.i = i9;
            int[] iArr = this.f5992e;
            if (i9 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i != -1 && i11 < this.f5988a; i11++) {
            int i12 = this.f5992e[i];
            int i13 = fVar.f6020b;
            if (i12 == i13) {
                this.f5994g[i] = f9;
                return;
            }
            if (i12 < i13) {
                i10 = i;
            }
            i = this.f5993f[i];
        }
        int i14 = this.i;
        int i15 = i14 + 1;
        if (this.j) {
            int[] iArr2 = this.f5992e;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.f5992e;
        if (i14 >= iArr3.length && this.f5988a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f5992e;
                if (i16 >= iArr4.length) {
                    break;
                } else if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                } else {
                    i16++;
                }
            }
        }
        int[] iArr5 = this.f5992e;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.f5991d * 2;
            this.f5991d = i17;
            this.j = false;
            this.i = i14 - 1;
            this.f5994g = Arrays.copyOf(this.f5994g, i17);
            this.f5992e = Arrays.copyOf(this.f5992e, this.f5991d);
            this.f5993f = Arrays.copyOf(this.f5993f, this.f5991d);
        }
        this.f5992e[i14] = fVar.f6020b;
        this.f5994g[i14] = f9;
        if (i10 != -1) {
            int[] iArr6 = this.f5993f;
            iArr6[i14] = iArr6[i10];
            iArr6[i10] = i14;
        } else {
            this.f5993f[i14] = this.f5995h;
            this.f5995h = i14;
        }
        fVar.q++;
        fVar.a(bVar);
        int i18 = this.f5988a + 1;
        this.f5988a = i18;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.f5992e;
        if (i18 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z9) {
        int i = this.f5995h;
        if (i == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i != -1 && i9 < this.f5988a) {
            if (this.f5992e[i] == fVar.f6020b) {
                if (i == this.f5995h) {
                    this.f5995h = this.f5993f[i];
                } else {
                    int[] iArr = this.f5993f;
                    iArr[i10] = iArr[i];
                }
                if (z9) {
                    fVar.b(this.f5989b);
                }
                fVar.q--;
                this.f5988a--;
                this.f5992e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.f5994g[i];
            }
            i9++;
            i10 = i;
            i = this.f5993f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f5995h;
        String str = "";
        for (int i9 = 0; i != -1 && i9 < this.f5988a; i9++) {
            StringBuilder b10 = e.b(g2.g.d(str, " -> "));
            b10.append(this.f5994g[i]);
            b10.append(" : ");
            StringBuilder b11 = e.b(b10.toString());
            b11.append(((f[]) this.f5990c.f791d)[this.f5992e[i]]);
            str = b11.toString();
            i = this.f5993f[i];
        }
        return str;
    }
}
