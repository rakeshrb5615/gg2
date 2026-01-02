package s8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public class m implements q8.d, b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5879a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5880b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5881c;

    /* renamed from: d  reason: collision with root package name */
    public int f5882d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f5883e;

    /* renamed from: f  reason: collision with root package name */
    public final List[] f5884f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f5885g;

    /* renamed from: h  reason: collision with root package name */
    public Object f5886h;
    public final Object i;
    public final Object j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f5887k;

    public m(String str, e eVar, int i) {
        this.f5879a = str;
        this.f5880b = eVar;
        this.f5881c = i;
        String[] strArr = new String[i];
        for (int i9 = 0; i9 < i; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f5883e = strArr;
        int i10 = this.f5881c;
        this.f5884f = new List[i10];
        this.f5885g = new boolean[i10];
        this.f5886h = i7.o.f2746a;
        h7.e[] eVarArr = h7.e.f2224a;
        this.i = a.a.E(new u7.a(this) { // from class: s8.l

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ m f5878b;

            {
                this.f5878b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [h7.d, java.lang.Object] */
            @Override // u7.a
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return this.f5878b.f5880b.a();
                    default:
                        m mVar = this.f5878b;
                        q8.d[] dVarArr = (q8.d[]) mVar.j.getValue();
                        kotlin.jvm.internal.j.e(dVarArr, "typeParams");
                        int hashCode = (mVar.b().hashCode() * 31) + Arrays.hashCode(dVarArr);
                        int d9 = mVar.d();
                        int i11 = 1;
                        while (true) {
                            int i12 = 0;
                            if (d9 > 0) {
                                int i13 = d9 - 1;
                                int i14 = i11 * 31;
                                String b10 = mVar.i(mVar.d() - d9).b();
                                if (b10 != null) {
                                    i12 = b10.hashCode();
                                }
                                i11 = i14 + i12;
                                d9 = i13;
                            } else {
                                int d10 = mVar.d();
                                int i15 = 1;
                                while (true) {
                                    if (!(d10 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i11) * 31) + i15);
                                    }
                                    int i16 = d10 - 1;
                                    int i17 = i15 * 31;
                                    q4.b c9 = mVar.i(mVar.d() - d10).c();
                                    i15 = i17 + (c9 != null ? c9.hashCode() : 0);
                                    d10 = i16;
                                }
                            }
                        }
                }
            }
        });
        this.j = a.a.E(new e.e(this));
        this.f5887k = a.a.E(new u7.a(this) { // from class: s8.l

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ m f5878b;

            {
                this.f5878b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [h7.d, java.lang.Object] */
            @Override // u7.a
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return this.f5878b.f5880b.a();
                    default:
                        m mVar = this.f5878b;
                        q8.d[] dVarArr = (q8.d[]) mVar.j.getValue();
                        kotlin.jvm.internal.j.e(dVarArr, "typeParams");
                        int hashCode = (mVar.b().hashCode() * 31) + Arrays.hashCode(dVarArr);
                        int d9 = mVar.d();
                        int i11 = 1;
                        while (true) {
                            int i12 = 0;
                            if (d9 > 0) {
                                int i13 = d9 - 1;
                                int i14 = i11 * 31;
                                String b10 = mVar.i(mVar.d() - d9).b();
                                if (b10 != null) {
                                    i12 = b10.hashCode();
                                }
                                i11 = i14 + i12;
                                d9 = i13;
                            } else {
                                int d10 = mVar.d();
                                int i15 = 1;
                                while (true) {
                                    if (!(d10 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i11) * 31) + i15);
                                    }
                                    int i16 = d10 - 1;
                                    int i17 = i15 * 31;
                                    q4.b c9 = mVar.i(mVar.d() - d10).c();
                                    i15 = i17 + (c9 != null ? c9.hashCode() : 0);
                                    d10 = i16;
                                }
                            }
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // q8.d
    public final int a(String str) {
        kotlin.jvm.internal.j.e(str, "name");
        Integer num = (Integer) this.f5886h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // q8.d
    public final String b() {
        return this.f5879a;
    }

    @Override // q8.d
    public final q4.b c() {
        return q8.f.f5443f;
    }

    @Override // q8.d
    public final int d() {
        return this.f5881c;
    }

    @Override // q8.d
    public final String e(int i) {
        return this.f5883e[i];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [h7.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [h7.d, java.lang.Object] */
    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            q8.d dVar = (q8.d) obj;
            if (this.f5879a.equals(dVar.b()) && Arrays.equals((q8.d[]) this.j.getValue(), (q8.d[]) ((m) obj).j.getValue())) {
                int d9 = dVar.d();
                int i9 = this.f5881c;
                if (i9 == d9) {
                    for (i = 0; i < i9; i = i + 1) {
                        i = (kotlin.jvm.internal.j.a(i(i).b(), dVar.i(i).b()) && kotlin.jvm.internal.j.a(i(i).c(), dVar.i(i).c())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // s8.b
    public final Set f() {
        return this.f5886h.keySet();
    }

    @Override // q8.d
    public final boolean g() {
        return false;
    }

    @Override // q8.d
    public final List getAnnotations() {
        return i7.n.f2745a;
    }

    @Override // q8.d
    public final List h(int i) {
        List list = this.f5884f[i];
        return list == null ? i7.n.f2745a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.d, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f5887k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h7.d, java.lang.Object] */
    @Override // q8.d
    public final q8.d i(int i) {
        return ((o8.a[]) this.i.getValue())[i].d();
    }

    @Override // q8.d
    public boolean isInline() {
        return false;
    }

    @Override // q8.d
    public final boolean j(int i) {
        return this.f5885g[i];
    }

    public final void k(String str, boolean z9) {
        int i = this.f5882d + 1;
        this.f5882d = i;
        String[] strArr = this.f5883e;
        strArr[i] = str;
        this.f5885g[i] = z9;
        this.f5884f[i] = null;
        if (i == this.f5881c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                hashMap.put(strArr[i9], Integer.valueOf(i9));
            }
            this.f5886h = hashMap;
        }
    }

    public final String toString() {
        return i7.i.c0(w3.a.f(0, this.f5881c), ", ", this.f5879a.concat("("), ")", new a6.i(this, 6), 24);
    }
}
