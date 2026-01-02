package h0;

import android.graphics.Path;
import android.util.Log;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public char f2130a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2131b;

    public d(char c9, float[] fArr) {
        this.f2130a = c9;
        this.f2131b = fArr;
    }

    public static void a(Path path, float f9, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, boolean z10) {
        double d9;
        double d10;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f9;
        double d12 = f10;
        double d13 = f13;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f14;
        double d16 = ((d12 * cos) + ((-f9) * sin)) / d15;
        double d17 = f12;
        double d18 = ((d17 * sin) + (f11 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f11) * sin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f9, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z9, z10);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z9 == z10) {
            d9 = d22 - d27;
            d10 = d23 + d26;
        } else {
            d9 = d22 + d27;
            d10 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d10, d14 - d9);
        double atan22 = Math.atan2(d19 - d10, d18 - d9) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z10 != (i >= 0)) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d28 = d9 * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = -d13;
        double d33 = d32 * cos2;
        double d34 = d15 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d15 * cos2;
        double d38 = atan22 / ceil;
        double d39 = (cos3 * d37) + (sin3 * d36);
        double d40 = d11;
        double d41 = d12;
        int i9 = 0;
        double d42 = atan2;
        while (i9 < ceil) {
            double d43 = d42 + d38;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            int i10 = ceil;
            double d44 = (((d13 * cos2) * cos4) + d30) - (d34 * sin4);
            double d45 = (d37 * sin4) + (d13 * sin2 * cos4) + d31;
            double d46 = (d33 * sin4) - (d34 * cos4);
            double d47 = (cos4 * d37) + (sin4 * d36);
            double d48 = d43 - d42;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d40), (float) ((d39 * sqrt3) + d41), (float) (d44 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d44, (float) d45);
            i9++;
            d41 = d45;
            cos2 = cos2;
            d36 = d36;
            d42 = d43;
            d39 = d47;
            d40 = d44;
            ceil = i10;
            d35 = d46;
            d38 = d38;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i;
        float[] fArr;
        int i9;
        d dVar;
        int i10;
        char c9;
        float f9;
        float f10;
        d dVar2;
        boolean z9;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i11 = 0;
        int i12 = 0;
        char c10 = 'm';
        while (i12 < length) {
            d dVar3 = dVarArr2[i12];
            char c11 = dVar3.f2130a;
            float[] fArr3 = dVar3.f2131b;
            float f19 = fArr2[i11];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            int i13 = i11;
            float f24 = fArr2[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i14 = i13;
            while (i14 < fArr3.length) {
                if (c11 == 'A') {
                    fArr = fArr3;
                    i9 = i14;
                    dVar = dVar3;
                    float f29 = f27;
                    float f30 = f28;
                    i10 = i12;
                    c9 = c11;
                    int i15 = i9 + 5;
                    int i16 = i9 + 6;
                    a(path, f29, f30, fArr[i15], fArr[i16], fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3] != 0.0f ? 1 : i13, fArr[i9 + 4] != 0.0f ? 1 : i13);
                    f21 = fArr[i15];
                    f9 = fArr[i16];
                    f22 = f9;
                    f10 = f21;
                } else if (c11 == 'C') {
                    fArr = fArr3;
                    i9 = i14;
                    i10 = i12;
                    dVar = dVar3;
                    c9 = c11;
                    int i17 = i9 + 2;
                    int i18 = i9 + 3;
                    int i19 = i9 + 4;
                    int i20 = i9 + 5;
                    path2.cubicTo(fArr[i9], fArr[i9 + 1], fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                    float f31 = fArr[i19];
                    float f32 = fArr[i20];
                    f21 = fArr[i17];
                    f22 = fArr[i18];
                    f9 = f32;
                    f10 = f31;
                } else if (c11 == 'H') {
                    fArr = fArr3;
                    i9 = i14;
                    dVar = dVar3;
                    c9 = c11;
                    f9 = f28;
                    i10 = i12;
                    path2.lineTo(fArr[i9], f9);
                    f10 = fArr[i9];
                } else if (c11 == 'Q') {
                    fArr = fArr3;
                    i9 = i14;
                    i10 = i12;
                    dVar = dVar3;
                    c9 = c11;
                    int i21 = i9 + 1;
                    int i22 = i9 + 2;
                    int i23 = i9 + 3;
                    path2.quadTo(fArr[i9], fArr[i21], fArr[i22], fArr[i23]);
                    float f33 = fArr[i9];
                    float f34 = fArr[i21];
                    float f35 = fArr[i22];
                    float f36 = fArr[i23];
                    f21 = f33;
                    f22 = f34;
                    f10 = f35;
                    f9 = f36;
                } else if (c11 == 'V') {
                    fArr = fArr3;
                    i9 = i14;
                    i10 = i12;
                    dVar = dVar3;
                    f10 = f27;
                    c9 = c11;
                    path2.lineTo(f10, fArr[i9]);
                    f9 = fArr[i9];
                } else if (c11 != 'a') {
                    if (c11 == 'c') {
                        fArr = fArr3;
                        i9 = i14;
                        int i24 = i9 + 2;
                        int i25 = i9 + 3;
                        int i26 = i9 + 4;
                        int i27 = i9 + 5;
                        path2.rCubicTo(fArr[i9], fArr[i9 + 1], fArr[i24], fArr[i25], fArr[i26], fArr[i27]);
                        float f37 = fArr[i24] + f27;
                        float f38 = fArr[i25] + f28;
                        f27 += fArr[i26];
                        f28 += fArr[i27];
                        f21 = f37;
                        f22 = f38;
                    } else if (c11 != 'h') {
                        if (c11 != 'q') {
                            if (c11 != 'v') {
                                if (c11 == 'L') {
                                    fArr = fArr3;
                                    i9 = i14;
                                    int i28 = i9 + 1;
                                    path2.lineTo(fArr[i9], fArr[i28]);
                                    f10 = fArr[i9];
                                    f9 = fArr[i28];
                                } else if (c11 == 'M') {
                                    fArr = fArr3;
                                    i9 = i14;
                                    f10 = fArr[i9];
                                    f9 = fArr[i9 + 1];
                                    if (i9 > 0) {
                                        path2.lineTo(f10, f9);
                                    } else {
                                        path2.moveTo(f10, f9);
                                        f25 = f10;
                                        f26 = f9;
                                    }
                                } else if (c11 != 'S') {
                                    if (c11 == 'T') {
                                        fArr = fArr3;
                                        i9 = i14;
                                        if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                            f27 = (f27 * 2.0f) - f21;
                                            f28 = (f28 * 2.0f) - f22;
                                        }
                                        int i29 = i9 + 1;
                                        path2.quadTo(f27, f28, fArr[i9], fArr[i29]);
                                        f10 = fArr[i9];
                                        f9 = fArr[i29];
                                        dVar = dVar3;
                                        f21 = f27;
                                        f22 = f28;
                                    } else if (c11 == 'l') {
                                        fArr = fArr3;
                                        i9 = i14;
                                        int i30 = i9 + 1;
                                        path2.rLineTo(fArr[i9], fArr[i30]);
                                        f27 += fArr[i9];
                                        f14 = fArr[i30];
                                    } else if (c11 == 'm') {
                                        fArr = fArr3;
                                        i9 = i14;
                                        float f39 = fArr[i9];
                                        f27 += f39;
                                        float f40 = fArr[i9 + 1];
                                        f28 += f40;
                                        if (i9 > 0) {
                                            path2.rLineTo(f39, f40);
                                        } else {
                                            path2.rMoveTo(f39, f40);
                                            dVar = dVar3;
                                            f10 = f27;
                                            f25 = f10;
                                            f9 = f28;
                                            f26 = f9;
                                        }
                                    } else if (c11 != 's') {
                                        if (c11 != 't') {
                                            fArr = fArr3;
                                            i9 = i14;
                                            dVar = dVar3;
                                            f10 = f27;
                                        } else {
                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                f17 = f27 - f21;
                                                f18 = f28 - f22;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i31 = i14 + 1;
                                            path2.rQuadTo(f17, f18, fArr3[i14], fArr3[i31]);
                                            float f41 = f17 + f27;
                                            float f42 = f18 + f28;
                                            float f43 = f27 + fArr3[i14];
                                            f28 += fArr3[i31];
                                            f22 = f42;
                                            fArr = fArr3;
                                            i9 = i14;
                                            dVar = dVar3;
                                            f10 = f43;
                                            f21 = f41;
                                        }
                                        f9 = f28;
                                    } else {
                                        if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                            f15 = f28 - f22;
                                            f16 = f27 - f21;
                                        } else {
                                            f16 = 0.0f;
                                            f15 = 0.0f;
                                        }
                                        int i32 = i14;
                                        int i33 = i32 + 1;
                                        int i34 = i32 + 2;
                                        int i35 = i32 + 3;
                                        fArr = fArr3;
                                        i9 = i32;
                                        path2.rCubicTo(f16, f15, fArr3[i32], fArr3[i33], fArr3[i34], fArr3[i35]);
                                        f11 = fArr[i9] + f27;
                                        f12 = fArr[i33] + f28;
                                        f27 += fArr[i34];
                                        f13 = fArr[i35];
                                    }
                                    i10 = i12;
                                    c9 = c11;
                                } else {
                                    fArr = fArr3;
                                    i9 = i14;
                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                        f27 = (f27 * 2.0f) - f21;
                                        f28 = (f28 * 2.0f) - f22;
                                    }
                                    float f44 = f27;
                                    float f45 = f28;
                                    int i36 = i9 + 1;
                                    int i37 = i9 + 2;
                                    int i38 = i9 + 3;
                                    path2.cubicTo(f44, f45, fArr[i9], fArr[i36], fArr[i37], fArr[i38]);
                                    f21 = fArr[i9];
                                    f22 = fArr[i36];
                                    f10 = fArr[i37];
                                    f9 = fArr[i38];
                                }
                                i10 = i12;
                                dVar = dVar3;
                                c9 = c11;
                            } else {
                                fArr = fArr3;
                                i9 = i14;
                                path2.rLineTo(0.0f, fArr[i9]);
                                f14 = fArr[i9];
                            }
                            f28 += f14;
                        } else {
                            fArr = fArr3;
                            i9 = i14;
                            int i39 = i9 + 1;
                            int i40 = i9 + 2;
                            int i41 = i9 + 3;
                            path2.rQuadTo(fArr[i9], fArr[i39], fArr[i40], fArr[i41]);
                            f11 = fArr[i9] + f27;
                            f12 = fArr[i39] + f28;
                            f27 += fArr[i40];
                            f13 = fArr[i41];
                        }
                        f28 += f13;
                        f21 = f11;
                        f22 = f12;
                    } else {
                        fArr = fArr3;
                        i9 = i14;
                        path2.rLineTo(fArr[i9], 0.0f);
                        f27 += fArr[i9];
                    }
                    dVar = dVar3;
                    f10 = f27;
                    f9 = f28;
                    i10 = i12;
                    c9 = c11;
                } else {
                    fArr = fArr3;
                    i9 = i14;
                    int i42 = i9 + 5;
                    float f46 = fArr[i42] + f27;
                    int i43 = i9 + 6;
                    float f47 = fArr[i43] + f28;
                    float f48 = fArr[i9];
                    float f49 = fArr[i9 + 1];
                    float f50 = fArr[i9 + 2];
                    if (fArr[i9 + 3] != 0.0f) {
                        dVar2 = dVar3;
                        z9 = 1;
                    } else {
                        dVar2 = dVar3;
                        z9 = i13;
                    }
                    dVar = dVar2;
                    float f51 = f27;
                    c9 = c11;
                    float f52 = f28;
                    i10 = i12;
                    a(path, f51, f52, f46, f47, f48, f49, f50, z9, fArr[i9 + 4] != 0.0f ? 1 : i13);
                    f10 = f51 + fArr[i42];
                    f9 = f52 + fArr[i43];
                    f21 = f10;
                    f22 = f9;
                }
                i14 = i9 + i;
                path2 = path;
                dVar3 = dVar;
                c11 = c9;
                i12 = i10;
                f27 = f10;
                f28 = f9;
                c10 = c11;
                fArr3 = fArr;
            }
            fArr2[i13] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c10 = dVar3.f2130a;
            i12++;
            dVarArr2 = dVarArr;
            path2 = path;
            i11 = i13;
        }
    }

    public d(d dVar) {
        this.f2130a = dVar.f2130a;
        float[] fArr = dVar.f2131b;
        this.f2131b = a.a.l(fArr, fArr.length);
    }
}
