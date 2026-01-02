package j5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static long f3158a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static Method f3159b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3160c = true;

    /* renamed from: d  reason: collision with root package name */
    public static Field f3161d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f3162e;

    public static Drawable A(Context context, int i) {
        return n.n2.b().c(context, i);
    }

    public static Drawable B(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A = A(context, resourceId)) == null) ? typedArray.getDrawable(i) : A;
    }

    public static float C(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static final o8.a D(o8.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "<this>");
        return aVar.d().g() ? aVar : new s8.j(aVar);
    }

    public static final Bundle E(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(v1.a.l("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static File F(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean H(int i) {
        if (i != 0) {
            ThreadLocal threadLocal = h0.a.f2123a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d9 = red / 255.0d;
                double pow = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
                double d10 = green / 255.0d;
                double pow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                double d11 = blue / 255.0d;
                double pow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d12 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d12;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                return d12 / 100.0d > 0.5d;
            }
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        return false;
    }

    public static boolean I() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e2.a.a();
        }
        try {
            if (f3159b == null) {
                f3158a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3159b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3159b.invoke(null, Long.valueOf(f3158a))).booleanValue();
        } catch (Exception e9) {
            if (!(e9 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e9);
                return false;
            }
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean J(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean K(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int L(int i, int i9, float f9) {
        return h0.a.e(h0.a.h(i9, Math.round(Color.alpha(i9) * f9)), i);
    }

    public static int M(Context context, int i) {
        Drawable drawable = e0.c.getDrawable(context, i);
        if (drawable == null) {
            return 0;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, createBitmap, 0);
        createBitmap.recycle();
        return iArr[0];
    }

    public static MappedByteBuffer N(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        FileChannel channel = fileInputStream.getChannel();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        fileInputStream.close();
        openFileDescriptor.close();
        return map;
    }

    public static final void O(Object[] objArr, int i, int i9) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        while (i < i9) {
            objArr[i] = null;
            i++;
        }
    }

    public static int P(Context context, int i, int i9) {
        TypedValue T = c4.b.T(context, i);
        return (T == null || T.type != 16) ? i9 : T.data;
    }

    public static TimeInterpolator Q(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (K(valueOf, "cubic-bezier") || K(valueOf, "path")) {
                    if (K(valueOf, "cubic-bezier")) {
                        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                        if (split.length == 4) {
                            return new PathInterpolator(C(split, 0), C(split, 1), C(split, 2), C(split, 3));
                        }
                        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                    } else if (K(valueOf, "path")) {
                        String substring = valueOf.substring(5, valueOf.length() - 1);
                        Path path = new Path();
                        try {
                            h0.d.b(a.a.m(substring), path);
                            return new PathInterpolator(path);
                        } catch (RuntimeException e9) {
                            throw new RuntimeException("Error in parsing ".concat(substring), e9);
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
                    }
                }
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        return timeInterpolator;
    }

    public static void R(Window window, boolean z9) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            e0.b.h(window, z9);
        } else if (i >= 30) {
            e0.b.g(window, z9);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z9 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final long U(int i, c8.c cVar) {
        kotlin.jvm.internal.j.e(cVar, "unit");
        return cVar.compareTo(c8.c.f952d) <= 0 ? p(q4.b.h(i, cVar, c8.c.f950b)) : V(i, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r5 > 4611686018427387903L) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long V(long r5, c8.c r7) {
        /*
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.j.e(r7, r0)
            c8.c r0 = c8.c.f950b
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r1 = q4.b.h(r1, r0, r7)
            long r3 = -r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L22
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L22
            long r5 = q4.b.h(r5, r7, r0)
            long r5 = p(r5)
            return r5
        L22:
            c8.c r0 = c8.c.f951c
            java.lang.String r1 = "targetUnit"
            kotlin.jvm.internal.j.e(r0, r1)
            java.util.concurrent.TimeUnit r0 = r0.f957a
            java.util.concurrent.TimeUnit r7 = r7.f957a
            long r5 = r0.convert(r5, r7)
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 >= 0) goto L3c
        L3a:
            r5 = r0
            goto L46
        L3c:
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L46
            goto L3a
        L46:
            long r5 = o(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.t1.V(long, c8.c):long");
    }

    public static final String a(Object[] objArr, int i, int i9, i7.e eVar) {
        StringBuilder sb = new StringBuilder((i9 * 3) + 2);
        sb.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i10];
            if (obj == eVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static final Object b(Task task, r6.v vVar) {
        if (!task.isComplete()) {
            d8.n nVar = new d8.n(1, q4.b.C(vVar));
            nVar.r();
            task.addOnCompleteListener(n8.a.f4973a, new n8.b(nVar, 0));
            Object q = nVar.q();
            m7.a aVar = m7.a.f4049a;
            return q;
        }
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            return task.getResult();
        }
        throw exception;
    }

    public static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void d(int i, Object[] objArr) {
        for (int i9 = 0; i9 < i; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException(g2.g.c(i9, "at index "));
            }
        }
    }

    public static void e(int i, int i9, int i10) {
        if (i >= 0 && i9 <= i10) {
            if (i > i9) {
                throw new IllegalArgumentException(v1.a.i("fromIndex: ", i, i9, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i9 + ", size: " + i10);
    }

    public static final void f(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                q4.b.a(th, th2);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean h(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean i9 = i(file, inputStream);
                g(inputStream);
                return i9;
            } catch (Throwable th) {
                th = th;
                g(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean i(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    g(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            g(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            g(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static a5.c j(String str, String str2) {
        l6.a aVar = new l6.a(str, str2);
        a5.b b10 = a5.c.b(l6.a.class);
        b10.f566e = 1;
        b10.f567f = new a5.a(aVar, 0);
        return b10.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v3.f] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [g1.q, a2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g1.q k(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            g1.c r0 = new g1.c
            r0.<init>()
            goto L11
        Lc:
            v3.f r0 = new v3.f
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            p0.e.d(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r1 = r5
            goto L7a
        L4b:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.l(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L59:
            if (r3 >= r6) goto L67
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            n0.d r1 = new n0.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            g1.q r5 = new g1.q
            g1.p r0 = new g1.p
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.t1.k(android.content.Context):g1.q");
    }

    public static androidx.lifecycle.v0 l(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                kotlin.jvm.internal.j.b(newInstance);
                return (androidx.lifecycle.v0) newInstance;
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static Bitmap m(Context context, int i) {
        if (i == 0) {
            return null;
        }
        return BitmapFactory.decodeResource(context.getResources(), i);
    }

    public static void n(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a5.c cVar = (a5.c) obj;
            a5.k kVar = new a5.k(cVar);
            for (a5.x xVar : cVar.f570b) {
                boolean z9 = cVar.f573e == 0;
                a5.l lVar = new a5.l(xVar, !z9);
                if (!hashMap.containsKey(lVar)) {
                    hashMap.put(lVar, new HashSet());
                }
                Set set = (Set) hashMap.get(lVar);
                if (!set.isEmpty() && z9) {
                    throw new IllegalArgumentException("Multiple components provide " + xVar + ".");
                }
                set.add(kVar);
            }
        }
        for (Set<a5.k> set2 : hashMap.values()) {
            for (a5.k kVar2 : set2) {
                for (a5.m mVar : kVar2.f593a.f571c) {
                    if (mVar.f600c == 0) {
                        Set<a5.k> set3 = (Set) hashMap.get(new a5.l(mVar.f598a, mVar.f599b == 2));
                        if (set3 != null) {
                            for (a5.k kVar3 : set3) {
                                kVar2.f594b.add(kVar3);
                                kVar3.f595c.add(kVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a5.k kVar4 = (a5.k) it.next();
            if (kVar4.f595c.isEmpty()) {
                hashSet2.add(kVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            a5.k kVar5 = (a5.k) hashSet2.iterator().next();
            hashSet2.remove(kVar5);
            i++;
            Iterator it2 = kVar5.f594b.iterator();
            while (it2.hasNext()) {
                a5.k kVar6 = (a5.k) it2.next();
                kVar6.f595c.remove(kVar5);
                if (kVar6.f595c.isEmpty()) {
                    hashSet2.add(kVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            a5.k kVar7 = (a5.k) it3.next();
            if (!kVar7.f595c.isEmpty() && !kVar7.f594b.isEmpty()) {
                arrayList2.add(kVar7.f593a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final long o(long j) {
        long j8 = (j << 1) + 1;
        int i = c8.a.f947d;
        int i9 = c8.b.f949a;
        return j8;
    }

    public static final long p(long j) {
        long j8 = j << 1;
        int i = c8.a.f947d;
        int i9 = c8.b.f949a;
        return j8;
    }

    public static String q(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i = 0; i < gVar.size(); i++) {
            byte a10 = gVar.a(i);
            if (a10 == 34) {
                sb.append("\\\"");
            } else if (a10 == 39) {
                sb.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
                    case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        continue;
                    case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a10 >>> 6) & 3) + 48));
                            sb.append((char) (((a10 >>> 3) & 7) + 48));
                            sb.append((char) ((a10 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a10);
                            continue;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static a5.c r(String str, l4.h hVar) {
        a5.b b10 = a5.c.b(l6.a.class);
        b10.f566e = 1;
        b10.a(a5.m.c(Context.class));
        b10.f567f = new a5.u(4, str, hVar);
        return b10.b();
    }

    public static final z7.c s(q8.d dVar) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        if (dVar instanceof s8.o) {
            return s(((s8.o) dVar).f5890a);
        }
        return null;
    }

    public static int t(Context context, int i, int i9) {
        Integer num;
        TypedValue T = c4.b.T(context, i);
        if (T != null) {
            int i10 = T.resourceId;
            num = Integer.valueOf(i10 != 0 ? e0.c.getColor(context, i10) : T.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i9;
    }

    public static int u(View view, int i) {
        Context context = view.getContext();
        TypedValue W = c4.b.W(view.getContext(), i, view.getClass().getCanonicalName());
        int i9 = W.resourceId;
        return i9 != 0 ? e0.c.getColor(context, i9) : W.data;
    }

    public static ColorStateList v(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = e0.c.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static ColorStateList w(Context context, b8.g gVar, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) gVar.f790c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = e0.c.getColorStateList(context, resourceId)) == null) ? gVar.h(i) : colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String y() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1b
            java.lang.Object r0 = h.p.c()
            if (r0 == 0) goto L20
            android.os.LocaleList r0 = h.m.a(r0)
            m0.h r1 = new m0.h
            m0.i r2 = new m0.i
            r2.<init>(r0)
            r1.<init>(r2)
            goto L22
        L1b:
            m0.h r1 = h.p.f2098c
            if (r1 == 0) goto L20
            goto L22
        L20:
            m0.h r1 = m0.h.f3949b
        L22:
            boolean r0 = r1.b()
            if (r0 != 0) goto L39
            m0.i r0 = r1.f3950a
            android.os.LocaleList r0 = r0.f3951a
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = r0.toLanguageTag()
            goto L41
        L39:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLanguageTag()
        L41:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.t1.y():java.lang.String");
    }

    public static SharedPreferences z(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public float G(View view) {
        if (f3160c) {
            try {
                return f2.b0.e(view);
            } catch (NoSuchMethodError unused) {
                f3160c = false;
            }
        }
        return view.getAlpha();
    }

    public void S(View view, float f9) {
        if (f3160c) {
            try {
                f2.b0.k(view, f9);
                return;
            } catch (NoSuchMethodError unused) {
                f3160c = false;
            }
        }
        view.setAlpha(f9);
    }

    public void T(View view, int i) {
        if (!f3162e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3161d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f3162e = true;
        }
        Field field = f3161d;
        if (field != null) {
            try {
                f3161d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void x(v3.z zVar, float f9, float f10);
}
