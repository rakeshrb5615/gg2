package u;

import a2.q;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d extends b {

    /* renamed from: f  reason: collision with root package name */
    public f[] f6015f;

    /* renamed from: g  reason: collision with root package name */
    public f[] f6016g;

    /* renamed from: h  reason: collision with root package name */
    public int f6017h;
    public n0.a i;

    @Override // u.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i9 = 0; i9 < this.f6017h; i9++) {
            f[] fVarArr = this.f6015f;
            f fVar = fVarArr[i9];
            if (!zArr[fVar.f6020b]) {
                n0.a aVar = this.i;
                aVar.f4373b = fVar;
                int i10 = 8;
                if (i == -1) {
                    while (i10 >= 0) {
                        float f9 = ((f) aVar.f4373b).f6026n[i10];
                        if (f9 <= 0.0f) {
                            if (f9 < 0.0f) {
                                i = i9;
                                break;
                            }
                            i10--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i];
                    while (true) {
                        if (i10 >= 0) {
                            float f10 = fVar2.f6026n[i10];
                            float f11 = ((f) aVar.f4373b).f6026n[i10];
                            if (f11 == f10) {
                                i10--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f6015f[i];
    }

    @Override // u.b
    public final boolean e() {
        return this.f6017h == 0;
    }

    @Override // u.b
    public final void i(c cVar, b bVar, boolean z9) {
        f fVar = bVar.f5996a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f6026n;
        a aVar = bVar.f5999d;
        int d9 = aVar.d();
        for (int i = 0; i < d9; i++) {
            f e9 = aVar.e(i);
            float f9 = aVar.f(i);
            n0.a aVar2 = this.i;
            aVar2.f4373b = e9;
            if (e9.f6019a) {
                boolean z10 = true;
                for (int i9 = 0; i9 < 9; i9++) {
                    float[] fArr2 = ((f) aVar2.f4373b).f6026n;
                    float f10 = (fArr[i9] * f9) + fArr2[i9];
                    fArr2[i9] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((f) aVar2.f4373b).f6026n[i9] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((d) aVar2.f4374c).k((f) aVar2.f4373b);
                }
            } else {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = fArr[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f9;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((f) aVar2.f4373b).f6026n[i10] = f12;
                    } else {
                        ((f) aVar2.f4373b).f6026n[i10] = 0.0f;
                    }
                }
                j(e9);
            }
            this.f5997b = (bVar.f5997b * f9) + this.f5997b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i9 = this.f6017h + 1;
        f[] fVarArr = this.f6015f;
        if (i9 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f6015f = fVarArr2;
            this.f6016g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f6015f;
        int i10 = this.f6017h;
        fVarArr3[i10] = fVar;
        int i11 = i10 + 1;
        this.f6017h = i11;
        if (i11 > 1 && fVarArr3[i10].f6020b > fVar.f6020b) {
            int i12 = 0;
            while (true) {
                i = this.f6017h;
                if (i12 >= i) {
                    break;
                }
                this.f6016g[i12] = this.f6015f[i12];
                i12++;
            }
            Arrays.sort(this.f6016g, 0, i, new q(3));
            for (int i13 = 0; i13 < this.f6017h; i13++) {
                this.f6015f[i13] = this.f6016g[i13];
            }
        }
        fVar.f6019a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.f6017h) {
            if (this.f6015f[i] == fVar) {
                while (true) {
                    int i9 = this.f6017h;
                    if (i >= i9 - 1) {
                        this.f6017h = i9 - 1;
                        fVar.f6019a = false;
                        return;
                    }
                    f[] fVarArr = this.f6015f;
                    int i10 = i + 1;
                    fVarArr[i] = fVarArr[i10];
                    i = i10;
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.b
    public final String toString() {
        n0.a aVar = this.i;
        String str = " goal -> (" + this.f5997b + ") : ";
        for (int i = 0; i < this.f6017h; i++) {
            aVar.f4373b = this.f6015f[i];
            str = str + aVar + " ";
        }
        return str;
    }
}
