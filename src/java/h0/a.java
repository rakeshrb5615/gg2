package h0;

import android.graphics.Color;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f2123a = new ThreadLocal();

    public static int a(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float abs = (1.0f - Math.abs((f11 * 2.0f) - 1.0f)) * f10;
        float f12 = f11 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f9 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f9) / 60) {
            case 0:
                i = Math.round((abs + f12) * 255.0f);
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f12) * 255.0f);
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                break;
            case 2:
                i = Math.round(f12 * 255.0f);
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                break;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                i = Math.round(f12 * 255.0f);
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f12) * 255.0f);
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                break;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                i = Math.round((abs + f12) * 255.0f);
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(g(i), g(round), g(round2));
    }

    public static void b(int i, int i9, int i10, float[] fArr) {
        float f9;
        float abs;
        float f10 = i / 255.0f;
        float f11 = i9 / 255.0f;
        float f12 = i10 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min;
        float f14 = (max + min) / 2.0f;
        if (max == min) {
            f9 = 0.0f;
            abs = 0.0f;
        } else {
            f9 = max == f10 ? ((f11 - f12) / f13) % 6.0f : max == f11 ? ((f12 - f10) / f13) + 2.0f : 4.0f + ((f10 - f11) / f13);
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f9 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = f15 < 0.0f ? 0.0f : Math.min(f15, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f14 >= 0.0f ? Math.min(f14, 1.0f) : 0.0f;
    }

    public static int c(double d9, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d9))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d9))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d9))) / 100.0d;
        return Color.rgb(g((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d)), g((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d)), g((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d)));
    }

    public static int d(int i, int i9, float f9) {
        float f10 = 1.0f - f9;
        return Color.argb((int) ((Color.alpha(i9) * f9) + (Color.alpha(i) * f10)), (int) ((Color.red(i9) * f9) + (Color.red(i) * f10)), (int) ((Color.green(i9) * f9) + (Color.green(i) * f10)), (int) ((Color.blue(i9) * f9) + (Color.blue(i) * f10)));
    }

    public static int e(int i, int i9) {
        int alpha = Color.alpha(i9);
        int alpha2 = Color.alpha(i);
        int i10 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i10, f(Color.red(i), alpha2, Color.red(i9), alpha, i10), f(Color.green(i), alpha2, Color.green(i9), alpha, i10), f(Color.blue(i), alpha2, Color.blue(i9), alpha, i10));
    }

    public static int f(int i, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((255 - i9) * (i10 * i11)) + ((i * 255) * i9)) / (i12 * 255);
    }

    public static int g(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static int h(int i, int i9) {
        if (i9 < 0 || i9 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i9 << 24);
    }
}
