package q4;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import d8.f0;
import d8.w;
import d8.x;
import i8.q;
import j5.t1;
import j6.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.u;
import q0.p0;
import q0.q0;
import u7.p;
import v3.a0;
import v3.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class b implements t0.f {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5375b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f5376c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5377d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f5378e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5379a;

    public /* synthetic */ b(int i) {
        this.f5379a = i;
    }

    public static int B(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i != 64) {
                                    if (i != 128) {
                                        if (i != 256) {
                                            if (i == 512) {
                                                return 9;
                                            }
                                            throw new IllegalArgumentException(g2.g.c(i, "type needs to be >= FIRST and <= LAST, type="));
                                        }
                                        return 8;
                                    }
                                    return 7;
                                }
                                return 6;
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static l7.c C(l7.c cVar) {
        l7.c<Object> intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        n7.c cVar2 = cVar instanceof n7.c ? (n7.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }

    public static boolean D(byte b10) {
        return b10 > -65;
    }

    public static String F(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static l7.h G(l7.f fVar, l7.g gVar) {
        kotlin.jvm.internal.j.e(gVar, "key");
        return kotlin.jvm.internal.j.a(fVar.getKey(), gVar) ? l7.i.f3796a : fVar;
    }

    public static l7.h L(l7.f fVar, l7.h hVar) {
        kotlin.jvm.internal.j.e(hVar, "context");
        return hVar == l7.i.f3796a ? fVar : (l7.h) hVar.fold(fVar, new x(8));
    }

    public static void O(View view, k kVar) {
        p3.a aVar = kVar.f6213b.f6198c;
        if (aVar == null || !aVar.f5085a) {
            return;
        }
        float f9 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f9 += ((View) parent).getElevation();
        }
        v3.i iVar = kVar.f6213b;
        if (iVar.f6206m != f9) {
            iVar.f6206m = f9;
            kVar.v();
        }
    }

    public static void P(EditorInfo editorInfo, CharSequence charSequence, int i, int i9) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i9);
    }

    public static void Q(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static final Object S(q qVar, q qVar2, p pVar) {
        Object wVar;
        Object B;
        try {
            u.a(2, pVar);
            wVar = pVar.invoke(qVar2, qVar);
        } catch (Throwable th) {
            wVar = new w(false, th);
        }
        m7.a aVar = m7.a.f4049a;
        if (wVar == aVar || (B = qVar.B(wVar)) == f0.f1189e) {
            return aVar;
        }
        if (B instanceof w) {
            throw ((w) B).f1256a;
        }
        return f0.v(B);
    }

    public static byte[] T(j6.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < min2) {
                int read = dVar.read(bArr, i9, min2 - i9);
                if (read == -1) {
                    return g(arrayDeque, i);
                }
                i9 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (dVar.read() == -1) {
            return g(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static Object U(p pVar, Object obj, l7.c cVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        l7.h context = cVar.getContext();
        Object gVar = context == l7.i.f3796a ? new n7.g(cVar) : new n7.c(cVar, context);
        u.a(2, pVar);
        return pVar.invoke(obj, gVar);
    }

    public static void a(Throwable th, Throwable th2) {
        kotlin.jvm.internal.j.e(th, "<this>");
        kotlin.jvm.internal.j.e(th2, "exception");
        if (th != th2) {
            Integer num = q7.a.f5437a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = p7.a.f5090a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void e(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] g(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final long h(long j, c8.c cVar, c8.c cVar2) {
        kotlin.jvm.internal.j.e(cVar, "sourceUnit");
        kotlin.jvm.internal.j.e(cVar2, "targetUnit");
        return cVar2.f957a.convert(j, cVar.f957a);
    }

    public static final void i(int i, int i9) {
        if (i <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i9 + ").");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, j5.t1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, j5.t1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, j5.t1] */
    public static t1 j(int i) {
        if (i != 0 && i == 1) {
            return new Object();
        }
        return new Object();
    }

    public static l7.c k(l7.c cVar, l7.c cVar2, p pVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof n7.a) {
            return ((n7.a) pVar).create(cVar, cVar2);
        }
        l7.h context = cVar2.getContext();
        return context == l7.i.f3796a ? new m7.b(cVar2, cVar, pVar) : new m7.c(cVar2, context, pVar, cVar);
    }

    public static String l(String str) {
        try {
            byte[] m9 = m("KEY");
            byte[] m10 = m("IV");
            SecretKeySpec secretKeySpec = new SecretKeySpec(m9, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(m10);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 2)), StandardCharsets.UTF_8);
        } catch (Exception e9) {
            throw new RuntimeException("Decryption failed", e9);
        }
    }

    public static byte[] m(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest((str + "43f!gR2q9~pLm#Ae->" + str.hashCode()).getBytes(StandardCharsets.UTF_8));
            char[] charArray = "43f!gR2q9~pLm#Ae".toCharArray();
            int length = charArray.length;
            int i = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i ^= charArray[i9] * 31;
            }
            byte b10 = (byte) (i & 255);
            byte[] bArr = new byte[16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArr[i10] = (byte) (digest[i10] ^ b10);
            }
            return bArr;
        } catch (Exception e9) {
            throw new RuntimeException("Key derivation failed", e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [q0.p0, java.lang.Object] */
    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = q0.f5172a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = p0.f5161d;
        p0 p0Var = (p0) view.getTag(2131362487);
        WeakReference weakReference = null;
        p0 p0Var2 = p0Var;
        if (p0Var == null) {
            ?? obj = new Object();
            obj.f5162a = null;
            obj.f5163b = null;
            obj.f5164c = null;
            view.setTag(2131362487, obj);
            p0Var2 = obj;
        }
        WeakReference weakReference2 = p0Var2.f5164c;
        if (weakReference2 == null || weakReference2.get() != keyEvent) {
            p0Var2.f5164c = new WeakReference(keyEvent);
            if (p0Var2.f5163b == null) {
                p0Var2.f5163b = new SparseArray();
            }
            SparseArray sparseArray = p0Var2.f5163b;
            if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131362488)) == null || (size = arrayList.size() - 1) < 0) {
                    return true;
                }
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean o(q0.k r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.superDispatchKeyEvent(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = q4.b.f5375b
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            q4.b.f5376c = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            q4.b.f5375b = r3
        L4d:
            java.lang.reflect.Method r1 = q4.b.f5376c
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = q0.q0.d(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = q4.b.f5377d
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            q4.b.f5378e = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            q4.b.f5377d = r3
        L9b:
            java.lang.reflect.Field r6 = q4.b.f5378e
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = q0.q0.d(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = q0.q0.d(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.superDispatchKeyEvent(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.o(q0.k, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static ZonedDateTime q(LocalDate localDate, float f9, ZoneId zoneId) {
        if (Float.isNaN(f9) || f9 < 0.0f || f9 >= 24.0f) {
            return null;
        }
        int i = (int) f9;
        return localDate.atTime(i, (int) ((f9 - i) * 60.0f)).atZone(zoneId);
    }

    public static l7.f r(l7.f fVar, l7.g gVar) {
        kotlin.jvm.internal.j.e(gVar, "key");
        if (kotlin.jvm.internal.j.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final Class u(kotlin.jvm.internal.e eVar) {
        Class a10 = eVar.a();
        kotlin.jvm.internal.j.c(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a10;
    }

    public static final Class v(z7.c cVar) {
        kotlin.jvm.internal.j.e(cVar, "<this>");
        Class a10 = ((kotlin.jvm.internal.d) cVar).a();
        if (a10.isPrimitive()) {
            String name = a10.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a10;
    }

    public abstract ViewPropertyAnimator A(View view, int i);

    public abstract boolean E(Class cls);

    public abstract void H(Throwable th);

    public abstract void I(int i);

    public abstract void J(Typeface typeface, boolean z9);

    public abstract void K(s sVar);

    public abstract void M(t.g gVar, t.g gVar2);

    public abstract void N(t.g gVar, Thread thread);

    public abstract void R(a0 a0Var, float f9);

    public abstract boolean b(t.h hVar, t.d dVar, t.d dVar2);

    public abstract boolean c(t.h hVar, Object obj, Object obj2);

    public abstract boolean d(t.h hVar, t.g gVar, t.g gVar2);

    public int hashCode() {
        switch (this.f5379a) {
            case 24:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract Method s(Class cls, Field field);

    public abstract Constructor t(Class cls);

    public String toString() {
        switch (this.f5379a) {
            case 24:
                String b10 = kotlin.jvm.internal.s.a(getClass()).b();
                kotlin.jvm.internal.j.b(b10);
                return b10;
            default:
                return super.toString();
        }
    }

    public abstract String[] w(Class cls);

    public abstract int x(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float y(a0 a0Var);

    public abstract int z();
}
