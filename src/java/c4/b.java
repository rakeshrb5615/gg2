package c4;

import a2.e0;
import a2.g1;
import a2.t0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f2.b0;
import j5.t1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.b1;
import q0.u0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class b implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public static g f899a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f900b = true;

    public b() {
        new ConcurrentHashMap();
    }

    public static float[] A() {
        return new float[]{-0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f};
    }

    public static final Object B(e1.b bVar, e1.e eVar, Serializable serializable) {
        kotlin.jvm.internal.j.e(bVar, "<this>");
        kotlin.jvm.internal.j.e(eVar, "key");
        Object obj = bVar.f1297a.get(eVar);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.j.d(obj, "copyOf(this, size)");
        }
        return obj == null ? serializable : obj;
    }

    public static SharedPreferences C(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final int D(int i, int i9, int i10) {
        if (i10 > 0) {
            if (i < i9) {
                int i11 = i9 % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i9 - i13;
            }
        } else if (i10 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else {
            if (i > i9) {
                int i14 = -i10;
                int i15 = i % i14;
                if (i15 < 0) {
                    i15 += i14;
                }
                int i16 = i9 % i14;
                if (i16 < 0) {
                    i16 += i14;
                }
                int i17 = (i15 - i16) % i14;
                if (i17 < 0) {
                    i17 += i14;
                }
                return i17 + i9;
            }
        }
        return i9;
    }

    public static o0.c E(b1 b1Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new o0.c(e0.a.l(b1Var));
        }
        TextPaint textPaint = new TextPaint(b1Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = b1Var.getBreakStrategy();
        int hyphenationFrequency = b1Var.getHyphenationFrequency();
        if (b1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (b1Var.getInputType() & 15) != 3) {
                boolean z9 = b1Var.getLayoutDirection() == 1;
                switch (b1Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case d1.h.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z9) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(e0.a.c(DecimalFormatSymbols.getInstance(b1Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new o0.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void F(Context context) {
        String packageName = context.getPackageName();
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }

    public static boolean G(int i) {
        return ((i & 32) == 0 && (i & 64) == 0 && (i & 128) == 0 && (i & 256) == 0 && (i & 512) == 0 && (i & 4096) == 0) ? false : true;
    }

    public static boolean H(int i) {
        return ((i & 4) == 0 && (i & 1) == 0 && !G(i)) ? false : true;
    }

    public static boolean I(int i) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public static boolean J(int i) {
        return ((i & 16) == 0 && (i & 1024) == 0 && (i & 2048) == 0 && (i & 128) == 0 && (i & 256) == 0 && (i & 512) == 0 && (i & 4096) == 0) ? false : true;
    }

    public static void K(Activity activity, Context context) {
        Task task;
        HashMap hashMap;
        String str;
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        k2.c cVar = new k2.c(new h4.f(applicationContext));
        h4.f fVar = (h4.f) cVar.f3363b;
        String str2 = fVar.f2205b;
        d4.l lVar = h4.f.f2203c;
        lVar.g("requestInAppReview (%s)", str2);
        i4.h hVar = fVar.f2204a;
        if (hVar == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", d4.l.i(lVar.f1097b, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            if (j4.a.f2862a.containsKey(-1)) {
                str = ((String) hashMap.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) j4.a.f2863b.get(-1)) + ")";
            } else {
                str = "";
            }
            task = Tasks.forException(new ApiException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str))));
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            hVar.a().post(new i4.f(hVar, taskCompletionSource, taskCompletionSource, new h4.d(fVar, taskCompletionSource, taskCompletionSource)));
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new h5.a(cVar, activity, context, 1));
    }

    public static String L(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i9 = 0; i9 < objArr.length; i9++) {
            Object obj = objArr[i9];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e9) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e9);
                    StringBuilder q = v1.a.q("<", str2, " threw ");
                    q.append(e9.getClass().getName());
                    q.append(">");
                    sb = q.toString();
                }
            }
            objArr[i9] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i10 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i10)) != -1) {
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(objArr[i]);
            i10 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i11 = i + 1; i11 < objArr.length; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static int M(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static int N(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i = iArr[0];
            if (i != 0) {
                try {
                    try {
                        GLES20.glBindTexture(3553, i);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLES20.glTexParameteri(3553, 10242, 33071);
                        GLES20.glTexParameteri(3553, 10243, 33071);
                        GLUtils.texImage2D(3553, 0, bitmap, 0);
                        bitmap.recycle();
                        return iArr[0];
                    } catch (Exception unused) {
                        GLES20.glDeleteTextures(1, iArr, 0);
                        bitmap.recycle();
                        return 0;
                    }
                } catch (Throwable th) {
                    bitmap.recycle();
                    throw th;
                }
            }
        }
        return 0;
    }

    public static int O(Context context, int i) {
        try {
            Drawable A = t1.A(context, i);
            if (A != null) {
                int intrinsicWidth = A.getIntrinsicWidth();
                int intrinsicHeight = A.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 64;
                    intrinsicHeight = 64;
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                A.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                A.draw(canvas);
                return N(createBitmap);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static void P(SharedPreferences sharedPreferences, String str, float f9) {
        try {
            sharedPreferences.edit().putFloat(str, f9).apply();
        } catch (ClassCastException unused) {
            sharedPreferences.edit().remove(str).apply();
            sharedPreferences.edit().putFloat(str, f9).apply();
        }
    }

    public static void Q(SharedPreferences sharedPreferences, String str, int i) {
        try {
            sharedPreferences.edit().putInt(str, i).apply();
        } catch (ClassCastException unused) {
            sharedPreferences.edit().remove(str).apply();
            sharedPreferences.edit().putInt(str, i).apply();
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [h1.b, h1.c] */
    public static h1.b R(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i9 = 0;
            while (true) {
                if (i9 >= i) {
                    j = -1;
                    break;
                }
                int i10 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j = duplicate.getInt() & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i10) {
                    break;
                }
                i9++;
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j8 = duplicate.getInt() & 4294967295L;
                for (int i11 = 0; i11 < j8; i11++) {
                    int i12 = duplicate.getInt();
                    long j9 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i12 || 1701669481 == i12) {
                        duplicate.position((int) (j9 + j));
                        ?? cVar = new h1.c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        cVar.f2147d = duplicate;
                        cVar.f2144a = position;
                        int i13 = position - duplicate.getInt(position);
                        cVar.f2145b = i13;
                        cVar.f2146c = ((ByteBuffer) cVar.f2147d).getShort(i13);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final byte[] S(InputStream inputStream) {
        kotlin.jvm.internal.j.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static TypedValue T(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean U(Context context, int i, boolean z9) {
        TypedValue T = T(context, i);
        return (T == null || T.type != 18) ? z9 : T.data != 0;
    }

    public static int V(Context context) {
        TypedValue T = T(context, 2130969509);
        return (int) ((T == null || T.type != 5) ? context.getResources().getDimension(2131166140) : T.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static TypedValue W(Context context, int i, String str) {
        TypedValue T = T(context, i);
        if (T != null) {
            return T;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void X(int i, TextView textView) {
        p0.e.c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            e0.a.o(i, textView);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), i + i9, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void Y(int i, TextView textView) {
        p0.e.c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i9);
        }
    }

    public static void Z(int i, TextView textView) {
        p0.e.c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void a0(float[] fArr, float[] fArr2, float[] fArr3, float f9, float f10, float f11, float f12) {
        Matrix.setIdentityM(fArr, 0);
        Matrix.orthoM(fArr2, 0, f9, f10, f11, f12, -10.0f, 10.0f);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
    }

    public static void b0(Activity activity, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", activity.getString(2131952341));
            intent.putExtra("android.intent.extra.TEXT", activity.getString(2131952341) + ("https://play.google.com/store/apps/details?id=" + context.getPackageName()));
            activity.startActivity(Intent.createChooser(intent, "Share app via"));
        } catch (Exception unused) {
            Toast.makeText(context, "Unable to share at this time.", 0).show();
        }
    }

    public static final e1.e c0(String str) {
        kotlin.jvm.internal.j.e(str, "name");
        return new e1.e(str);
    }

    public static void d(StringBuilder sb, Object obj, u7.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void d0(ViewGroup viewGroup, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29) {
            b0.m(viewGroup, z9);
        } else if (f900b) {
            try {
                b0.m(viewGroup, z9);
            } catch (NoSuchMethodError unused) {
                f900b = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(f8.q r4, a1.k0 r5, n7.c r6) {
        /*
            boolean r0 = r6 instanceof f8.o
            if (r0 == 0) goto L13
            r0 = r6
            f8.o r0 = (f8.o) r0
            int r1 = r0.f1567c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1567c = r1
            goto L18
        L13:
            f8.o r0 = new f8.o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1566b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1567c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a1.k0 r5 = r0.f1565a
            e0(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e0(r6)
            l7.h r6 = r0.getContext()
            d8.b0 r2 = d8.b0.f1162b
            l7.f r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.f1565a = r5     // Catch: java.lang.Throwable -> L29
            r0.f1567c = r3     // Catch: java.lang.Throwable -> L29
            d8.n r6 = new d8.n     // Catch: java.lang.Throwable -> L29
            l7.c r0 = q4.b.C(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.r()     // Catch: java.lang.Throwable -> L29
            z8.u r0 = new z8.u     // Catch: java.lang.Throwable -> L29
            r2 = 3
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            f8.p r4 = (f8.p) r4     // Catch: java.lang.Throwable -> L29
            r4.R(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.q()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.invoke()
            h7.l r4 = h7.l.f2236a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.e(f8.q, a1.k0, n7.c):java.lang.Object");
    }

    public static final void e0(Object obj) {
        if (obj instanceof h7.g) {
            throw ((h7.g) obj).f2227a;
        }
    }

    public static final Bundle f(h7.f... fVarArr) {
        Bundle bundle = new Bundle(fVarArr.length);
        for (h7.f fVar : fVarArr) {
            String str = (String) fVar.f2225a;
            Object obj = fVar.f2226b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.j.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (!Serializable.class.isAssignableFrom(componentType)) {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                } else {
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (!(obj instanceof SizeF)) {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            } else {
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static int f0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static float g(float f9, float f10, float f11) {
        return f9 < f10 ? f10 : f9 > f11 ? f11 : f9;
    }

    public static void g0(int i, float[] fArr, float[] fArr2, float[] fArr3, float f9) {
        Matrix.setIdentityM(fArr, 0);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(i, "u_MVPMatrix"), 1, false, fArr3, 0);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(i, "uZ"), f9);
    }

    public static int h(int i, int i9, int i10) {
        return i < i9 ? i9 : i > i10 ? i10 : i;
    }

    public static ActionMode.Callback h0(ActionMode.Callback callback) {
        return callback instanceof t0.h ? ((t0.h) callback).f5951a : callback;
    }

    public static void i(FloatBuffer floatBuffer) {
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
    }

    public static ActionMode.Callback i0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof t0.h) || callback == null) ? callback : new t0.h(callback, textView);
    }

    public static void j(int i) {
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
    }

    public static void k(int i) {
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public static int l(g1 g1Var, e0 e0Var, View view, View view2, t0 t0Var, boolean z9) {
        if (t0Var.v() == 0 || g1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z9) {
            return Math.min(e0Var.l(), e0Var.b(view2) - e0Var.e(view));
        }
        return Math.abs(t0.G(view) - t0.G(view2)) + 1;
    }

    public static int m(g1 g1Var, e0 e0Var, View view, View view2, t0 t0Var, boolean z9, boolean z10) {
        if (t0Var.v() == 0 || g1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z10 ? Math.max(0, (g1Var.b() - Math.max(t0.G(view), t0.G(view2))) - 1) : Math.max(0, Math.min(t0.G(view), t0.G(view2)));
        if (z9) {
            return Math.round((max * (Math.abs(e0Var.b(view2) - e0Var.e(view)) / (Math.abs(t0.G(view) - t0.G(view2)) + 1))) + (e0Var.k() - e0Var.e(view)));
        }
        return max;
    }

    public static int n(g1 g1Var, e0 e0Var, View view, View view2, t0 t0Var, boolean z9) {
        if (t0Var.v() == 0 || g1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z9) {
            return (int) (((e0Var.b(view2) - e0Var.e(view)) / (Math.abs(t0.G(view) - t0.G(view2)) + 1)) * g1Var.b());
        }
        return g1Var.b();
    }

    public static void o(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        kotlin.jvm.internal.j.e(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final h7.g p(Throwable th) {
        kotlin.jvm.internal.j.e(th, "exception");
        return new h7.g(th);
    }

    public static FloatBuffer q(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void v(String str, String str2, Object obj) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, String.format(str2, obj));
        }
    }

    public static void w(Exception exc, String str, String str2) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static final o7.b x(Enum[] enumArr) {
        kotlin.jvm.internal.j.e(enumArr, "entries");
        return new o7.b(enumArr);
    }

    public static int y(int i, int i9) {
        if (i9 >= 0) {
            int i10 = i + (i >> 1) + 1;
            if (i10 < i9) {
                i10 = Integer.highestOneBit(i9 - 1) << 1;
            }
            if (i10 < 0) {
                return Integer.MAX_VALUE;
            }
            return i10;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    @Override // q0.u0
    public void b() {
    }

    @Override // q0.u0
    public void c() {
    }

    public abstract void j0(byte[] bArr, int i, int i9);

    public abstract Typeface r(Context context, g0.f fVar, Resources resources, int i);

    public abstract Typeface s(Context context, n0.i[] iVarArr, int i);

    public Typeface t(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface u(Context context, Resources resources, int i, String str, int i9) {
        File F = t1.F(context);
        if (F == null) {
            return null;
        }
        try {
            if (t1.h(F, resources, i)) {
                return Typeface.createFromFile(F.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            F.delete();
        }
    }

    public n0.i z(n0.i[] iVarArr, int i) {
        int i9 = (i & 1) == 0 ? 400 : 700;
        boolean z9 = (i & 2) != 0;
        n0.i iVar = null;
        int i10 = Integer.MAX_VALUE;
        for (n0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.f4400c - i9) * 2) + (iVar2.f4401d == z9 ? 0 : 1);
            if (iVar == null || i10 > abs) {
                iVar = iVar2;
                i10 = abs;
            }
        }
        return iVar;
    }
}
