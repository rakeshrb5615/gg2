package h0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j5.t1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n0.i;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class f extends c4.b {
    public static Class j;

    /* renamed from: k  reason: collision with root package name */
    public static Constructor f2134k;

    /* renamed from: l  reason: collision with root package name */
    public static Method f2135l;

    /* renamed from: m  reason: collision with root package name */
    public static Method f2136m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f2137n;

    /* renamed from: c  reason: collision with root package name */
    public final Class f2138c;

    /* renamed from: d  reason: collision with root package name */
    public final Constructor f2139d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f2140e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f2141f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f2142g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f2143h;
    public final Method i;

    public f() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = p0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = q0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e9.getClass().getName()), e9);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2138c = cls;
        this.f2139d = constructor;
        this.f2140e = method2;
        this.f2141f = method3;
        this.f2142g = method4;
        this.f2143h = method5;
        this.i = method;
    }

    public static boolean l0(Object obj, String str, int i, boolean z9) {
        o0();
        try {
            return ((Boolean) f2135l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static void o0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2137n) {
            return;
        }
        f2137n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi21Impl", e9.getClass().getName(), e9);
            method = null;
            cls = null;
            method2 = null;
        }
        f2134k = constructor;
        j = cls;
        f2135l = method2;
        f2136m = method;
    }

    public static Method p0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean k0(Context context, Object obj, String str, int i, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2140e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface m0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2138c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.i.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean n0(Object obj) {
        try {
            return ((Boolean) this.f2142g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method q0(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // c4.b
    public final Typeface r(Context context, g0.f fVar, Resources resources, int i) {
        g0.g[] gVarArr;
        Object obj;
        Method method = this.f2140e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f2139d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                g0.g[] gVarArr2 = fVar.f1611a;
                int length = gVarArr2.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        g0.g gVar = gVarArr2[i9];
                        Context context2 = context;
                        if (k0(context2, obj, gVar.f1612a, gVar.f1616e, gVar.f1613b, gVar.f1614c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f1615d))) {
                            i9++;
                            context = context2;
                        } else {
                            try {
                                this.f2143h.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (n0(obj)) {
                        return m0(obj);
                    }
                }
            }
            return null;
        }
        o0();
        try {
            Object newInstance = f2134k.newInstance(null);
            for (g0.g gVar2 : fVar.f1611a) {
                File F = t1.F(context);
                if (F == null) {
                    return null;
                }
                try {
                    if (t1.h(F, resources, gVar2.f1617f) && l0(newInstance, F.getPath(), gVar2.f1613b, gVar2.f1614c)) {
                        F.delete();
                    }
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    F.delete();
                    throw th;
                }
                F.delete();
                return null;
            }
            o0();
            try {
                Object newInstance2 = Array.newInstance(j, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2136m.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // c4.b
    public final Typeface s(Context context, i[] iVarArr, int i) {
        Object obj;
        Typeface m02;
        boolean z9;
        if (iVarArr.length >= 1) {
            Method method = this.f2140e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (i iVar : iVarArr) {
                        if (iVar.f4402e == 0) {
                            Uri uri = iVar.f4398a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, t1.N(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f2139d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = iVarArr.length;
                        int i9 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f2143h;
                            if (i9 < length) {
                                i iVar2 = iVarArr[i9];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f4398a);
                                if (byteBuffer != null) {
                                    try {
                                        z9 = ((Boolean) this.f2141f.invoke(obj, byteBuffer, Integer.valueOf(iVar2.f4399b), null, Integer.valueOf(iVar2.f4400c), Integer.valueOf(iVar2.f4401d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z10 = true;
                                }
                                i9++;
                                z10 = z10;
                            } else if (!z10) {
                                method2.invoke(obj, null);
                            } else if (n0(obj) && (m02 = m0(obj)) != null) {
                                return Typeface.create(m02, i);
                            }
                        }
                    }
                } else {
                    i z11 = z(iVarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(z11.f4398a, "r", null);
                    if (openFileDescriptor != null) {
                        Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(z11.f4400c).setItalic(z11.f4401d).build();
                        openFileDescriptor.close();
                        return build;
                    } else if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // c4.b
    public final Typeface u(Context context, Resources resources, int i, String str, int i9) {
        Object obj;
        Method method = this.f2140e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f2139d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!k0(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f2143h.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (n0(obj)) {
                    return m0(obj);
                }
            }
            return null;
        }
        return super.u(context, resources, i, str, i9);
    }
}
