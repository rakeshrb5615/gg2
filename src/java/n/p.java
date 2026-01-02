package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public int f4239a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4240b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4241c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4242d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4243e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4244f;

    public p(t8.b bVar, u8.k kVar, a2.d dVar, q8.d dVar2) {
        kotlin.jvm.internal.j.e(dVar2, "descriptor");
        this.f4240b = bVar;
        this.f4241c = kVar;
        this.f4242d = dVar;
        this.f4239a = -1;
        t8.d dVar3 = bVar.f5980a;
        this.f4243e = dVar3;
        this.f4244f = dVar3.f5983a ? null : new u8.f(dVar2);
    }

    public void a() {
        View view = (View) this.f4240b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((v2) this.f4242d) != null) {
                if (((v2) this.f4244f) == null) {
                    this.f4244f = new Object();
                }
                v2 v2Var = (v2) this.f4244f;
                v2Var.f4315a = null;
                v2Var.f4318d = false;
                v2Var.f4316b = null;
                v2Var.f4317c = false;
                WeakHashMap weakHashMap = q0.q0.f5172a;
                ColorStateList c9 = q0.i0.c(view);
                if (c9 != null) {
                    v2Var.f4318d = true;
                    v2Var.f4315a = c9;
                }
                PorterDuff.Mode d9 = q0.i0.d(view);
                if (d9 != null) {
                    v2Var.f4317c = true;
                    v2Var.f4316b = d9;
                }
                if (v2Var.f4318d || v2Var.f4317c) {
                    u.e(background, v2Var, view.getDrawableState());
                    return;
                }
            }
            v2 v2Var2 = (v2) this.f4243e;
            if (v2Var2 != null) {
                u.e(background, v2Var2, view.getDrawableState());
                return;
            }
            v2 v2Var3 = (v2) this.f4242d;
            if (v2Var3 != null) {
                u.e(background, v2Var3, view.getDrawableState());
            }
        }
    }

    public p b(q8.d dVar) {
        byte b10;
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        t8.b bVar = (t8.b) this.f4240b;
        u8.k f9 = u8.g.f(dVar, bVar);
        a2.d dVar2 = (a2.d) this.f4242d;
        g0.d dVar3 = (g0.d) dVar2.f294c;
        int i = dVar3.f1608b + 1;
        dVar3.f1608b = i;
        Object[] objArr = (Object[]) dVar3.f1609c;
        if (i == objArr.length) {
            int i9 = i * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i9);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            dVar3.f1609c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) dVar3.f1610d, i9);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            dVar3.f1610d = copyOf2;
        }
        ((Object[]) dVar3.f1609c)[i] = dVar;
        dVar2.g(f9.f6156a);
        String str = (String) dVar2.f297f;
        int i10 = dVar2.f293b;
        while (true) {
            int w8 = dVar2.w(i10);
            b10 = 10;
            if (w8 == -1) {
                dVar2.f293b = w8;
                break;
            }
            char charAt = str.charAt(w8);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                dVar2.f293b = w8;
                b10 = u8.g.b(charAt);
                break;
            }
            i10 = w8 + 1;
        }
        if (b10 != 4) {
            int ordinal = f9.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new p(bVar, f9, dVar2, dVar) : (((u8.k) this.f4241c) == f9 && bVar.f5980a.f5983a) ? this : new p(bVar, f9, dVar2, dVar);
        }
        a2.d.n(dVar2, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public int c(q8.d dVar) {
        t8.b bVar = (t8.b) this.f4240b;
        t8.d dVar2 = bVar.f5980a;
        a2.d dVar3 = (a2.d) this.f4242d;
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        u8.k kVar = (u8.k) this.f4241c;
        int ordinal = kVar.ordinal();
        int i = 0;
        r10 = false;
        boolean z9 = false;
        int i9 = -1;
        if (ordinal == 0) {
            u8.f fVar = (u8.f) this.f4244f;
            t8.d dVar4 = (t8.d) this.f4243e;
            boolean y9 = dVar3.y();
            if (dVar3.d()) {
                dVar4.getClass();
                String f9 = dVar3.f();
                dVar3.g(':');
                kotlin.jvm.internal.j.e(dVar, "<this>");
                kotlin.jvm.internal.j.e(bVar, "json");
                kotlin.jvm.internal.j.e(f9, "name");
                t8.d dVar5 = bVar.f5980a;
                dVar5.getClass();
                u8.g.e(dVar, bVar);
                int a10 = dVar.a(f9);
                i9 = -3;
                if (a10 == -3 && dVar5.f5986d) {
                    j6.o oVar = bVar.f5982c;
                    okhttp3.internal.http2.g gVar = new okhttp3.internal.http2.g(3, dVar, bVar);
                    oVar.getClass();
                    oVar.getClass();
                    kotlin.jvm.internal.j.e(dVar, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) oVar.f3275b).get(dVar);
                    u8.h hVar = u8.g.f6138a;
                    Object obj = map != null ? map.get(hVar) : null;
                    Object obj2 = obj != null ? obj : null;
                    if (obj2 == null) {
                        obj2 = gVar.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oVar.f3275b;
                        Object obj3 = concurrentHashMap.get(dVar);
                        ConcurrentHashMap concurrentHashMap2 = obj3;
                        if (obj3 == null) {
                            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(dVar, concurrentHashMap3);
                            concurrentHashMap2 = concurrentHashMap3;
                        }
                        ((Map) concurrentHashMap2).put(hVar, obj2);
                    }
                    Integer num = (Integer) ((Map) obj2).get(f9);
                    if (num != null) {
                        i9 = num.intValue();
                    }
                } else {
                    i9 = a10;
                }
                if (i9 == -3) {
                    dVar3.m("Encountered an unknown key '" + f9 + '\'', b8.i.A0(((String) dVar3.f297f).subSequence(0, dVar3.f293b).toString(), f9), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                } else if (fVar != null) {
                    s8.d dVar6 = fVar.f6136a;
                    if (i9 < 64) {
                        dVar6.f5864c |= 1 << i9;
                    } else {
                        int i10 = (i9 >>> 6) - 1;
                        long[] jArr = dVar6.f5865d;
                        jArr[i10] = jArr[i10] | (1 << (i9 & 63));
                    }
                }
            } else if (y9) {
                dVar2.getClass();
                u8.g.c(dVar3, "object");
                throw null;
            } else if (fVar != null) {
                s8.d dVar7 = fVar.f6136a;
                u8.e eVar = dVar7.f5863b;
                q8.d dVar8 = dVar7.f5862a;
                int d9 = dVar8.d();
                while (true) {
                    long j = dVar7.f5864c;
                    if (j != -1) {
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                        dVar7.f5864c |= 1 << numberOfTrailingZeros;
                        if (((Boolean) eVar.invoke(dVar8, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                            i9 = numberOfTrailingZeros;
                            break;
                        }
                    } else if (d9 > 64) {
                        long[] jArr2 = dVar7.f5865d;
                        int length = jArr2.length;
                        loop1: while (true) {
                            if (i >= length) {
                                break;
                            }
                            int i11 = i + 1;
                            int i12 = i11 * 64;
                            long j8 = jArr2[i];
                            while (j8 != -1) {
                                long[] jArr3 = jArr2;
                                int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j8);
                                j8 |= 1 << numberOfTrailingZeros2;
                                int i13 = numberOfTrailingZeros2 + i12;
                                if (((Boolean) eVar.invoke(dVar8, Integer.valueOf(i13))).booleanValue()) {
                                    jArr3[i] = j8;
                                    i9 = i13;
                                    break loop1;
                                }
                                jArr2 = jArr3;
                            }
                            jArr2[i] = j8;
                            i = i11;
                        }
                    }
                }
            }
        } else if (ordinal != 2) {
            boolean y10 = dVar3.y();
            if (dVar3.d()) {
                int i14 = this.f4239a;
                if (i14 != -1 && !y10) {
                    a2.d.n(dVar3, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i9 = i14 + 1;
                this.f4239a = i9;
            } else if (y10) {
                dVar2.getClass();
                u8.g.c(dVar3, "array");
                throw null;
            }
        } else {
            int i15 = this.f4239a;
            boolean z10 = i15 % 2 != 0;
            if (!z10) {
                dVar3.g(':');
            } else if (i15 != -1) {
                z9 = dVar3.y();
            }
            if (dVar3.d()) {
                if (z10) {
                    if (this.f4239a == -1) {
                        int i16 = dVar3.f293b;
                        if (z9) {
                            a2.d.n(dVar3, "Unexpected leading comma", i16, 4);
                            throw null;
                        }
                    } else {
                        int i17 = dVar3.f293b;
                        if (!z9) {
                            a2.d.n(dVar3, "Expected comma after the key-value pair", i17, 4);
                            throw null;
                        }
                    }
                }
                i9 = this.f4239a + 1;
                this.f4239a = i9;
            } else if (z9) {
                dVar2.getClass();
                u8.g.c(dVar3, "object");
                throw null;
            }
        }
        if (kVar != u8.k.f6152e) {
            g0.d dVar9 = (g0.d) dVar3.f294c;
            ((int[]) dVar9.f1610d)[dVar9.f1608b] = i9;
        }
        return i9;
    }

    public int d() {
        a2.d dVar = (a2.d) this.f4242d;
        long h9 = dVar.h();
        int i = (int) h9;
        if (h9 == i) {
            return i;
        }
        a2.d.n(dVar, "Failed to parse int for input '" + h9 + '\'', 0, 6);
        throw null;
    }

    public int e(q8.d dVar, int i) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        return d();
    }

    public long f() {
        return ((a2.d) this.f4242d).h();
    }

    public long g(q8.d dVar, int i) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        return f();
    }

    public boolean h() {
        u8.f fVar = (u8.f) this.f4244f;
        if (!(fVar != null ? fVar.f6137b : false)) {
            a2.d dVar = (a2.d) this.f4242d;
            int w8 = dVar.w(dVar.x());
            String str = (String) dVar.f297f;
            int length = str.length() - w8;
            boolean z9 = false;
            if (length >= 4 && w8 != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(w8 + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || u8.g.b(str.charAt(w8 + 4)) != 0) {
                        z9 = true;
                        dVar.f293b = w8 + 4;
                    }
                }
            }
            if (!z9) {
                return true;
            }
        }
        return false;
    }

    public Object i(q8.d dVar, int i, o8.a aVar, Object obj) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        kotlin.jvm.internal.j.e(aVar, "deserializer");
        if (aVar.d().g() || h()) {
            return k(aVar);
        }
        return null;
    }

    public Object j(q8.d dVar, int i, o8.a aVar, Object obj) {
        g0.d dVar2 = (g0.d) ((a2.d) this.f4242d).f294c;
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        kotlin.jvm.internal.j.e(aVar, "deserializer");
        boolean z9 = ((u8.k) this.f4241c) == u8.k.f6152e && (i & 1) == 0;
        if (z9) {
            int i9 = dVar2.f1608b;
            if (((int[]) dVar2.f1610d)[i9] == -2) {
                ((Object[]) dVar2.f1609c)[i9] = u8.h.f6139a;
            }
        }
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        kotlin.jvm.internal.j.e(aVar, "deserializer");
        Object k9 = k(aVar);
        if (z9) {
            int i10 = dVar2.f1608b;
            if (((int[]) dVar2.f1610d)[i10] != -2) {
                int i11 = i10 + 1;
                dVar2.f1608b = i11;
                Object[] objArr = (Object[]) dVar2.f1609c;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i12);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    dVar2.f1609c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) dVar2.f1610d, i12);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    dVar2.f1610d = copyOf2;
                }
            }
            int i13 = dVar2.f1608b;
            ((Object[]) dVar2.f1609c)[i13] = k9;
            ((int[]) dVar2.f1610d)[i13] = -2;
        }
        return k9;
    }

    public Object k(o8.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "deserializer");
        try {
            return aVar.c(this);
        } catch (o8.b e9) {
            String message = e9.getMessage();
            kotlin.jvm.internal.j.b(message);
            if (b8.i.s0(message, "at path")) {
                throw e9;
            }
            throw new o8.b(e9.f5041a, e9.getMessage() + " at path: " + ((g0.d) ((a2.d) this.f4242d).f294c).d(), e9);
        }
    }

    public String l() {
        ((t8.d) this.f4243e).getClass();
        return ((a2.d) this.f4242d).i();
    }

    public String m(q8.d dVar, int i) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        return l();
    }

    public void n(q8.d dVar) {
        a2.d dVar2 = (a2.d) this.f4242d;
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        t8.d dVar3 = ((t8.b) this.f4240b).f5980a;
        dVar3.getClass();
        if (dVar2.y()) {
            dVar3.getClass();
            u8.g.c(dVar2, "");
            throw null;
        }
        dVar2.g(((u8.k) this.f4241c).f6157b);
        g0.d dVar4 = (g0.d) dVar2.f294c;
        int i = dVar4.f1608b;
        int[] iArr = (int[]) dVar4.f1610d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            dVar4.f1608b = i - 1;
        }
        int i9 = dVar4.f1608b;
        if (i9 != -1) {
            dVar4.f1608b = i9 - 1;
        }
    }

    public ColorStateList o() {
        v2 v2Var = (v2) this.f4243e;
        if (v2Var != null) {
            return v2Var.f4315a;
        }
        return null;
    }

    public PorterDuff.Mode p() {
        v2 v2Var = (v2) this.f4243e;
        if (v2Var != null) {
            return v2Var.f4316b;
        }
        return null;
    }

    public void q(AttributeSet attributeSet, int i) {
        ColorStateList f9;
        View view = (View) this.f4240b;
        Context context = view.getContext();
        int[] iArr = g.a.f1592z;
        b8.g p8 = b8.g.p(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) p8.f790c;
        View view2 = (View) this.f4240b;
        q0.q0.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) p8.f790c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f4239a = typedArray.getResourceId(0, -1);
                u uVar = (u) this.f4241c;
                Context context2 = view.getContext();
                int i9 = this.f4239a;
                synchronized (uVar) {
                    f9 = uVar.f4310a.f(context2, i9);
                }
                if (f9 != null) {
                    t(f9);
                }
            }
            if (typedArray.hasValue(1)) {
                q0.i0.g(view, p8.h(1));
            }
            if (typedArray.hasValue(2)) {
                q0.i0.h(view, n1.c(typedArray.getInt(2, -1), null));
            }
            p8.r();
        } catch (Throwable th) {
            p8.r();
            throw th;
        }
    }

    public void r() {
        this.f4239a = -1;
        t(null);
        a();
    }

    public void s(int i) {
        ColorStateList colorStateList;
        this.f4239a = i;
        u uVar = (u) this.f4241c;
        if (uVar != null) {
            Context context = ((View) this.f4240b).getContext();
            synchronized (uVar) {
                colorStateList = uVar.f4310a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        t(colorStateList);
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((v2) this.f4242d) == null) {
                this.f4242d = new Object();
            }
            v2 v2Var = (v2) this.f4242d;
            v2Var.f4315a = colorStateList;
            v2Var.f4318d = true;
        } else {
            this.f4242d = null;
        }
        a();
    }

    public void u(ColorStateList colorStateList) {
        if (((v2) this.f4243e) == null) {
            this.f4243e = new Object();
        }
        v2 v2Var = (v2) this.f4243e;
        v2Var.f4315a = colorStateList;
        v2Var.f4318d = true;
        a();
    }

    public void v(PorterDuff.Mode mode) {
        if (((v2) this.f4243e) == null) {
            this.f4243e = new Object();
        }
        v2 v2Var = (v2) this.f4243e;
        v2Var.f4316b = mode;
        v2Var.f4317c = true;
        a();
    }

    public p(View view) {
        this.f4239a = -1;
        this.f4240b = view;
        this.f4241c = u.a();
    }
}
