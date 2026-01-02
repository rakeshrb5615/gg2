package h0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import n0.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends c4.b {
    public static Font k0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m02 = m0(fontStyle, font.getStyle());
        for (int i9 = 1; i9 < fontFamily.getSize(); i9++) {
            Font font2 = fontFamily.getFont(i9);
            int m03 = m0(fontStyle, font2.getStyle());
            if (m03 < m02) {
                font = font2;
                m02 = m03;
            }
        }
        return font;
    }

    public static FontFamily l0(i[] iVarArr, ContentResolver contentResolver) {
        int i;
        ParcelFileDescriptor openFileDescriptor;
        int length = iVarArr.length;
        FontFamily.Builder builder = null;
        while (i < length) {
            i iVar = iVarArr[i];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f4398a, "r", null);
            } catch (IOException e9) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            }
            if (openFileDescriptor == null) {
                i = openFileDescriptor == null ? i + 1 : 0;
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.f4400c).setSlant(iVar.f4401d ? 1 : 0).setTtcIndex(iVar.f4399b).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int m0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // c4.b
    public final Typeface r(Context context, g0.f fVar, Resources resources, int i) {
        g0.g[] gVarArr;
        try {
            FontFamily.Builder builder = null;
            for (g0.g gVar : fVar.f1611a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f1617f).setWeight(gVar.f1613b).setSlant(gVar.f1614c ? 1 : 0).setTtcIndex(gVar.f1616e).setFontVariationSettings(gVar.f1615d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(k0(build2, i).getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // c4.b
    public final Typeface s(Context context, i[] iVarArr, int i) {
        try {
            FontFamily l0 = l0(iVarArr, context.getContentResolver());
            if (l0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(l0).setStyle(k0(l0, i).getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // c4.b
    public final Typeface t(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily l0 = l0((i[]) list.get(0), contentResolver);
            if (l0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(l0);
            for (int i9 = 1; i9 < list.size(); i9++) {
                FontFamily l02 = l0((i[]) list.get(i9), contentResolver);
                if (l02 != null) {
                    customFallbackBuilder.addCustomFallback(l02);
                }
            }
            return customFallbackBuilder.setStyle(k0(l0, i).getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // c4.b
    public final Typeface u(Context context, Resources resources, int i, String str, int i9) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e9) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e9);
            return null;
        }
    }

    @Override // c4.b
    public final i z(i[] iVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
