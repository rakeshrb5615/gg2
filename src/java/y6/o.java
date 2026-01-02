package y6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class o extends AbstractMap implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final a2.q f6942o = new a2.q(4);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6944b;

    /* renamed from: c  reason: collision with root package name */
    public n f6945c;

    /* renamed from: f  reason: collision with root package name */
    public final n f6948f;

    /* renamed from: m  reason: collision with root package name */
    public m f6949m;

    /* renamed from: n  reason: collision with root package name */
    public m f6950n;

    /* renamed from: d  reason: collision with root package name */
    public int f6946d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f6947e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Comparator f6943a = f6942o;

    public o(boolean z9) {
        this.f6944b = z9;
        this.f6948f = new n(z9);
    }

    public final n b(Object obj, boolean z9) {
        int i;
        n nVar;
        n nVar2 = this.f6945c;
        a2.q qVar = f6942o;
        Comparator comparator = this.f6943a;
        if (nVar2 != null) {
            Comparable comparable = comparator == qVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f6938f;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return nVar2;
                }
                n nVar3 = i < 0 ? nVar2.f6934b : nVar2.f6935c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            i = 0;
        }
        n nVar4 = nVar2;
        if (z9) {
            n nVar5 = this.f6948f;
            if (nVar4 != null) {
                nVar = new n(this.f6944b, nVar4, obj, nVar5, nVar5.f6937e);
                if (i < 0) {
                    nVar4.f6934b = nVar;
                } else {
                    nVar4.f6935c = nVar;
                }
                c(nVar4, true);
            } else if (comparator == qVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            } else {
                nVar = new n(this.f6944b, nVar4, obj, nVar5, nVar5.f6937e);
                this.f6945c = nVar;
            }
            this.f6946d++;
            this.f6947e++;
            return nVar;
        }
        return null;
    }

    public final void c(n nVar, boolean z9) {
        while (nVar != null) {
            n nVar2 = nVar.f6934b;
            n nVar3 = nVar.f6935c;
            int i = nVar2 != null ? nVar2.f6941o : 0;
            int i9 = nVar3 != null ? nVar3.f6941o : 0;
            int i10 = i - i9;
            if (i10 == -2) {
                n nVar4 = nVar3.f6934b;
                n nVar5 = nVar3.f6935c;
                int i11 = (nVar4 != null ? nVar4.f6941o : 0) - (nVar5 != null ? nVar5.f6941o : 0);
                if (i11 == -1 || (i11 == 0 && !z9)) {
                    f(nVar);
                } else {
                    g(nVar3);
                    f(nVar);
                }
                if (z9) {
                    return;
                }
            } else if (i10 == 2) {
                n nVar6 = nVar2.f6934b;
                n nVar7 = nVar2.f6935c;
                int i12 = (nVar6 != null ? nVar6.f6941o : 0) - (nVar7 != null ? nVar7.f6941o : 0);
                if (i12 == 1 || (i12 == 0 && !z9)) {
                    g(nVar);
                } else {
                    f(nVar2);
                    g(nVar);
                }
                if (z9) {
                    return;
                }
            } else if (i10 == 0) {
                nVar.f6941o = i + 1;
                if (z9) {
                    return;
                }
            } else {
                nVar.f6941o = Math.max(i, i9) + 1;
                if (!z9) {
                    return;
                }
            }
            nVar = nVar.f6933a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6945c = null;
        this.f6946d = 0;
        this.f6947e++;
        n nVar = this.f6948f;
        nVar.f6937e = nVar;
        nVar.f6936d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nVar != null;
    }

    public final void d(n nVar, boolean z9) {
        n nVar2;
        n nVar3;
        int i;
        if (z9) {
            n nVar4 = nVar.f6937e;
            nVar4.f6936d = nVar.f6936d;
            nVar.f6936d.f6937e = nVar4;
        }
        n nVar5 = nVar.f6934b;
        n nVar6 = nVar.f6935c;
        n nVar7 = nVar.f6933a;
        int i9 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                e(nVar, nVar5);
                nVar.f6934b = null;
            } else if (nVar6 != null) {
                e(nVar, nVar6);
                nVar.f6935c = null;
            } else {
                e(nVar, null);
            }
            c(nVar7, false);
            this.f6946d--;
            this.f6947e++;
            return;
        }
        if (nVar5.f6941o > nVar6.f6941o) {
            n nVar8 = nVar5.f6935c;
            while (true) {
                n nVar9 = nVar8;
                nVar3 = nVar5;
                nVar5 = nVar9;
                if (nVar5 == null) {
                    break;
                }
                nVar8 = nVar5.f6935c;
            }
        } else {
            n nVar10 = nVar6.f6934b;
            while (true) {
                nVar2 = nVar6;
                nVar6 = nVar10;
                if (nVar6 == null) {
                    break;
                }
                nVar10 = nVar6.f6934b;
            }
            nVar3 = nVar2;
        }
        d(nVar3, false);
        n nVar11 = nVar.f6934b;
        if (nVar11 != null) {
            i = nVar11.f6941o;
            nVar3.f6934b = nVar11;
            nVar11.f6933a = nVar3;
            nVar.f6934b = null;
        } else {
            i = 0;
        }
        n nVar12 = nVar.f6935c;
        if (nVar12 != null) {
            i9 = nVar12.f6941o;
            nVar3.f6935c = nVar12;
            nVar12.f6933a = nVar3;
            nVar.f6935c = null;
        }
        nVar3.f6941o = Math.max(i, i9) + 1;
        e(nVar, nVar3);
    }

    public final void e(n nVar, n nVar2) {
        n nVar3 = nVar.f6933a;
        nVar.f6933a = null;
        if (nVar2 != null) {
            nVar2.f6933a = nVar3;
        }
        if (nVar3 == null) {
            this.f6945c = nVar2;
        } else if (nVar3.f6934b == nVar) {
            nVar3.f6934b = nVar2;
        } else {
            nVar3.f6935c = nVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.f6949m;
        if (mVar == null) {
            m mVar2 = new m(this, 0);
            this.f6949m = mVar2;
            return mVar2;
        }
        return mVar;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.f6934b;
        n nVar3 = nVar.f6935c;
        n nVar4 = nVar3.f6934b;
        n nVar5 = nVar3.f6935c;
        nVar.f6935c = nVar4;
        if (nVar4 != null) {
            nVar4.f6933a = nVar;
        }
        e(nVar, nVar3);
        nVar3.f6934b = nVar;
        nVar.f6933a = nVar3;
        int max = Math.max(nVar2 != null ? nVar2.f6941o : 0, nVar4 != null ? nVar4.f6941o : 0) + 1;
        nVar.f6941o = max;
        nVar3.f6941o = Math.max(max, nVar5 != null ? nVar5.f6941o : 0) + 1;
    }

    public final void g(n nVar) {
        n nVar2 = nVar.f6934b;
        n nVar3 = nVar.f6935c;
        n nVar4 = nVar2.f6934b;
        n nVar5 = nVar2.f6935c;
        nVar.f6934b = nVar5;
        if (nVar5 != null) {
            nVar5.f6933a = nVar;
        }
        e(nVar, nVar2);
        nVar2.f6935c = nVar;
        nVar.f6933a = nVar2;
        int max = Math.max(nVar3 != null ? nVar3.f6941o : 0, nVar5 != null ? nVar5.f6941o : 0) + 1;
        nVar.f6941o = max;
        nVar2.f6941o = Math.max(max, nVar4 != null ? nVar4.f6941o : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            y6.n r3 = r2.b(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f6940n
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.o.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f6950n;
        if (mVar == null) {
            m mVar2 = new m(this, 1);
            this.f6950n = mVar2;
            return mVar2;
        }
        return mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null || this.f6944b) {
                n b10 = b(obj, true);
                Object obj3 = b10.f6940n;
                b10.f6940n = obj2;
                return obj3;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            y6.n r3 = r2.b(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.d(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f6940n
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6946d;
    }
}
