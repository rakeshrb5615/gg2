package a;

import a1.b1;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.j0;
import f8.g;
import h7.d;
import h7.e;
import h7.j;
import h7.k;
import i2.l;
import i7.h;
import i7.n;
import j6.o;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k4.m;
import q4.f;
import r6.c1;
import r6.i;
import r6.r;
import u4.b;
import u4.c;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static c1 f0a;

    public static boolean C(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final boolean D(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h7.d, java.lang.Object, h7.i] */
    public static d E(u7.a aVar) {
        e[] eVarArr = e.f2224a;
        k kVar = k.f2235a;
        ?? obj = new Object();
        obj.f2230a = aVar;
        obj.f2231b = kVar;
        return obj;
    }

    public static j F(u7.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "initializer");
        return new j(aVar);
    }

    public static List G(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List H(Object... objArr) {
        return objArr.length > 0 ? h.V(objArr) : n.f2745a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int I(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i > 0) {
            switch (o4.a.f5010a[roundingMode.ordinal()]) {
                case 1:
                    if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    break;
                case 4:
                case d1.h.STRING_FIELD_NUMBER /* 5 */:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        throw new IllegalArgumentException(v1.a.j("x (", i, ") must be > 0"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void J(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.J(android.content.Intent):void");
    }

    public static void K(Bundle bundle, String str) {
        try {
            f.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e9);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = o.C(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            b bVar = (b) f.d().b(b.class);
            if (bVar != null) {
                ((c) bVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final void L() {
        try {
            if (f0a == null) {
                c1 c1Var = (c1) ((i) ((r) f.d().b(r.class))).f5679o.get();
                kotlin.jvm.internal.j.e(c1Var, "<set-?>");
                f0a = c1Var;
            }
            c1 c1Var2 = f0a;
            if (c1Var2 == null) {
                kotlin.jvm.internal.j.i("sharedSessionRepository");
                throw null;
            } else if (c1Var2.i) {
                if (c1Var2 != null) {
                    c1Var2.b();
                } else {
                    kotlin.jvm.internal.j.i("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void M(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float N(EdgeEffect edgeEffect, float f9, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.c.c(edgeEffect, f9, f10);
        }
        t0.b.a(edgeEffect, f9, f10);
        return f9;
    }

    public static void S(j0 j0Var, ViewGroup viewGroup, int i) {
        Drawable background;
        if (j0Var == null || viewGroup == null || (background = viewGroup.getBackground()) == null || !(background instanceof LayerDrawable)) {
            return;
        }
        Drawable drawable = ((LayerDrawable) background).getDrawable(0);
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setStroke((int) ((j0Var.getResources().getDisplayMetrics().density * 3.0f) + 0.5f), i);
            viewGroup.invalidate();
        }
    }

    public static boolean T(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int U(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static void V() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static f8.c a(int i, f8.a aVar, int i9) {
        if ((i9 & 2) != 0) {
            aVar = f8.a.f1523a;
        }
        if (i == -2) {
            if (aVar == f8.a.f1523a) {
                g.f1559l.getClass();
                return new f8.c(f8.f.f1558b);
            }
            return new f8.n(1, aVar);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == f8.a.f1523a ? new f8.c(i) : new f8.n(i, aVar) : new f8.c(Integer.MAX_VALUE) : aVar == f8.a.f1523a ? new f8.c(0) : new f8.n(1, aVar);
        } else if (aVar == f8.a.f1523a) {
            return new f8.n(1, f8.a.f1524b);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m mVar = (m) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", mVar.f3398a);
            bundle.putLong("event_timestamp", mVar.f3399b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a1.e, n7.c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [a1.k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.r] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.internal.r, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlin.jvm.internal.r] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v6, types: [u7.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(java.util.List r6, a1.k r7, n7.c r8) {
        /*
            boolean r0 = r8 instanceof a1.e
            if (r0 == 0) goto L13
            r0 = r8
            a1.e r0 = (a1.e) r0
            int r1 = r0.f45d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45d = r1
            goto L18
        L13:
            a1.e r0 = new a1.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f44c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f45d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f43b
            java.io.Serializable r7 = r0.f42a
            kotlin.jvm.internal.r r7 = (kotlin.jvm.internal.r) r7
            c4.b.e0(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f42a
            java.util.List r6 = (java.util.List) r6
            c4.b.e0(r8)
            goto L5c
        L42:
            c4.b.e0(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            a1.g r2 = new a1.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f42a = r8
            r0.f45d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            u7.l r8 = (u7.l) r8
            r0.f42a = r7     // Catch: java.lang.Throwable -> L30
            r0.f43b = r6     // Catch: java.lang.Throwable -> L30
            r0.f45d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.a
            if (r2 != 0) goto L85
            r7.a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            q4.b.a(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            h7.l r1 = h7.l.f2236a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.c(java.util.List, a1.k, n7.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [t.l, java.lang.Object] */
    public static t.k d(d8.j0 j0Var) {
        ?? obj = new Object();
        obj.f5920c = new Object();
        t.k kVar = new t.k(obj);
        obj.f5919b = kVar;
        obj.f5918a = v1.a.class;
        try {
            j0Var.invokeOnCompletion(new b1(2, obj, j0Var));
            obj.f5918a = "Deferred.asListenableFuture";
            return kVar;
        } catch (Exception e9) {
            kVar.f5924b.k(e9);
            return kVar;
        }
    }

    public static String e(int i, int i9, String str) {
        if (i < 0) {
            return c4.b.L("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i9 >= 0) {
            return c4.b.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException(g2.g.c(i9, "negative size: "));
    }

    public static void f(int i, int i9) {
        String L;
        if (i < 0 || i >= i9) {
            if (i < 0) {
                L = c4.b.L("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i9 < 0) {
                throw new IllegalArgumentException(g2.g.c(i9, "negative size: "));
            } else {
                L = c4.b.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i9));
            }
            throw new IndexOutOfBoundsException(L);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(int i, int i9) {
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(e(i, i9, "index"));
        }
    }

    public static void i(int i, int i9, int i10) {
        if (i < 0 || i9 < i || i9 > i10) {
            throw new IndexOutOfBoundsException((i < 0 || i > i10) ? e(i, i10, "start index") : (i9 < 0 || i9 > i10) ? e(i9, i10, "end index") : c4.b.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i)));
        }
    }

    public static void j(int i) {
        if (2 > i || i >= 37) {
            StringBuilder p8 = v1.a.p("radix ", i, " was not in valid range ");
            p8.append(new y7.d(2, 36, 1));
            throw new IllegalArgumentException(p8.toString());
        }
    }

    public static int k(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, d0.e.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static float[] l(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h0.d[] m(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.m(java.lang.String):h0.d[]");
    }

    public static View n(Activity activity, Dialog dialog, Context context, int i) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        dialog.setContentView(inflate);
        if (dialog.getWindow() != null) {
            l l5 = l.l(context);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            int i9 = l5.o() ? 2131099684 : 2131099685;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(e0.c.getColor(context, i9));
            l5.q(activity, (ViewGroup) dialog.findViewById(2131362023));
            gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics()));
            inflate.setBackground(gradientDrawable);
        }
        dialog.show();
        return inflate;
    }

    public static h0.d[] p(h0.d[] dVarArr) {
        h0.d[] dVarArr2 = new h0.d[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            dVarArr2[i] = new h0.d(dVarArr[i]);
        }
        return dVarArr2;
    }

    public static boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            f.d();
            f d9 = f.d();
            d9.a();
            Context context = d9.f5386a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final boolean s(char c9, char c10, boolean z9) {
        if (c9 == c10) {
            return true;
        }
        if (z9) {
            char upperCase = Character.toUpperCase(c9);
            char upperCase2 = Character.toUpperCase(c10);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static int t(View view, int i) {
        Drawable drawable;
        Bitmap bitmap;
        Object tag = view.getTag(2131361998);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            int length = compoundDrawablesRelative.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    drawable = null;
                    break;
                }
                drawable = compoundDrawablesRelative[i9];
                if (drawable != null) {
                    break;
                }
                i9++;
            }
            if (drawable == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                int length2 = compoundDrawables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    Drawable drawable2 = compoundDrawables[i10];
                    if (drawable2 != null) {
                        drawable = drawable2;
                        break;
                    }
                    i10++;
                }
            }
        } else {
            drawable = view instanceof ImageView ? ((ImageView) view).getDrawable() : view.getBackground();
        }
        if (drawable != null) {
            try {
                Drawable mutate = drawable.getConstantState() != null ? drawable.getConstantState().newDrawable().mutate() : drawable.mutate();
                try {
                    ColorStateList colorStateList = (ColorStateList) Drawable.class.getMethod("getTintList", null).invoke(mutate, null);
                    if (colorStateList != null) {
                        return colorStateList.getDefaultColor();
                    }
                } catch (Exception unused) {
                }
                if (mutate instanceof ColorDrawable) {
                    return ((ColorDrawable) mutate).getColor();
                }
                if ((mutate instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) mutate).getBitmap()) != null && !bitmap.isRecycled()) {
                    int pixel = bitmap.getPixel(Math.max(0, bitmap.getWidth() / 2), Math.max(0, bitmap.getHeight() / 2));
                    if ((pixel >>> 24) != 0) {
                        return pixel;
                    }
                }
                ColorFilter colorFilter = mutate.getColorFilter();
                if (colorFilter != null) {
                    try {
                        Field declaredField = colorFilter.getClass().getDeclaredField("mColor");
                        declaredField.setAccessible(true);
                        return declaredField.getInt(colorFilter);
                    } catch (Exception unused2) {
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.min(Math.max(1, mutate.getIntrinsicWidth()), 64)), Math.max(1, Math.min(Math.max(1, mutate.getIntrinsicHeight()), 64)), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                mutate.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                mutate.draw(canvas);
                int width = createBitmap.getWidth() / 2;
                int height = createBitmap.getHeight() / 2;
                for (int max = Math.max(0, height - 2); max <= Math.min(createBitmap.getHeight() - 1, height + 2); max++) {
                    for (int max2 = Math.max(0, width - 2); max2 <= Math.min(createBitmap.getWidth() - 1, width + 2); max2++) {
                        int pixel2 = createBitmap.getPixel(max2, max);
                        if ((pixel2 >>> 24) != 0) {
                            createBitmap.recycle();
                            return pixel2;
                        }
                    }
                }
                createBitmap.recycle();
            } catch (Exception unused3) {
                return i;
            }
        }
        return i;
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Object v(p4.b bVar) {
        Object obj;
        if (bVar.isDone()) {
            boolean z9 = false;
            while (true) {
                try {
                    obj = bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z9 = true;
                } catch (Throwable th) {
                    if (z9) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(c4.b.L("Future was expected to be done: %s", bVar));
    }

    public static Set w() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int y(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static Object z(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return m0.b.a(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (e.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public abstract boolean A();

    public abstract boolean B();

    public abstract void O(boolean z9);

    public abstract void P(boolean z9);

    public abstract void Q(boolean z9);

    public abstract void R(boolean z9);

    public abstract TransformationMethod W(TransformationMethod transformationMethod);

    public abstract String o(byte[] bArr, int i, int i9);

    public abstract int r(String str, byte[] bArr, int i, int i9);

    public abstract InputFilter[] x(InputFilter[] inputFilterArr);
}
