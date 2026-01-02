package f2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class b0 {
    public static Drawable a(Drawable drawable, Drawable drawable2, int i, int i9) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i9 == -1 && (i9 = drawable2.getIntrinsicHeight()) == -1) {
            i9 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i9 > drawable.getIntrinsicHeight()) {
            float f9 = i / i9;
            if (f9 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i9 = (int) (intrinsicWidth / f9);
                i = intrinsicWidth;
            } else {
                i9 = drawable.getIntrinsicHeight();
                i = (int) (f9 * i9);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i9);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static int[] c(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i9 = iArr[i];
            if (i9 == 16842912) {
                return iArr;
            }
            if (i9 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static ColorStateList d(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static float e(View view) {
        return view.getTransitionAlpha();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.content.Context r7) {
        /*
            android.content.SharedPreferences r0 = c4.b.C(r7)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Lf
            goto Laa
        Lf:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r1 = r7.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r2 == 0) goto L38
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r1 == 0) goto L38
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r2 == 0) goto L38
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r2 == 0) goto L38
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            goto L39
        L38:
            r0 = 1
        L39:
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r1 != 0) goto L44
            r7 = 0
            com.google.android.gms.tasks.Tasks.forResult(r7)
            goto Laa
        L44:
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            java.lang.String r2 = "error configuring notification delegate for package "
            r3 = 0
            int r4 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> L77
            android.content.pm.ApplicationInfo r5 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L77
            int r5 = r5.uid     // Catch: java.lang.Throwable -> L77
            r6 = 1
            if (r4 != r5) goto L5b
            r4 = r6
            goto L5c
        L5b:
            r4 = 0
        L5c:
            if (r4 != 0) goto L79
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Throwable -> L77
            r4.append(r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L77
            android.util.Log.e(r0, r7)     // Catch: java.lang.Throwable -> L77
        L73:
            r1.trySetResult(r3)
            goto La7
        L77:
            r7 = move-exception
            goto Lab
        L79:
            android.content.SharedPreferences r2 = c4.b.C(r7)     // Catch: java.lang.Throwable -> L77
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "proxy_notification_initialized"
            r2.putBoolean(r4, r6)     // Catch: java.lang.Throwable -> L77
            r2.apply()     // Catch: java.lang.Throwable -> L77
            java.lang.Class<android.app.NotificationManager> r2 = android.app.NotificationManager.class
            java.lang.Object r7 = r7.getSystemService(r2)     // Catch: java.lang.Throwable -> L77
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "com.google.android.gms"
            if (r0 == 0) goto L99
            r7.setNotificationDelegate(r2)     // Catch: java.lang.Throwable -> L77
            goto L73
        L99:
            java.lang.String r0 = r7.getNotificationDelegate()     // Catch: java.lang.Throwable -> L77
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L73
            r7.setNotificationDelegate(r3)     // Catch: java.lang.Throwable -> L77
            goto L73
        La7:
            r1.getTask()
        Laa:
            return
        Lab:
            r1.trySetResult(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b0.f(android.content.Context):void");
    }

    public static boolean g() {
        return Trace.isEnabled();
    }

    public static boolean h(Context context) {
        if (PlatformVersion.isAtLeastQ()) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            } else if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                    return true;
                }
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        return false;
    }

    public static Insets i(int i, int i9, int i10, int i11) {
        return Insets.of(i, i9, i10, i11);
    }

    public static void j(View view, int i, int i9, int i10, int i11) {
        view.setLeftTopRightBottom(i, i9, i10, i11);
    }

    public static void k(View view, float f9) {
        view.setTransitionAlpha(f9);
    }

    public static void l(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public static void m(ViewGroup viewGroup, boolean z9) {
        viewGroup.suppressLayout(z9);
    }

    public static void n(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void o(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
