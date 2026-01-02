package e1;

import i7.i;
import i7.j;
import i7.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1297a;

    /* renamed from: b  reason: collision with root package name */
    public final l6.c f1298b;

    public b(LinkedHashMap linkedHashMap, boolean z9) {
        this.f1297a = linkedHashMap;
        this.f1298b = new l6.c(z9);
    }

    public final Map a() {
        h7.f fVar;
        Set<Map.Entry> entrySet = this.f1297a.entrySet();
        int l0 = r.l0(j.X(entrySet, 10));
        if (l0 < 16) {
            l0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(this, size)");
                fVar = new h7.f(key, copyOf);
            } else {
                fVar = new h7.f(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(fVar.f2225a, fVar.f2226b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.j.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f1298b.f3791b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(e eVar) {
        kotlin.jvm.internal.j.e(eVar, "key");
        b();
        this.f1297a.remove(eVar);
    }

    public final void d(e eVar, Object obj) {
        kotlin.jvm.internal.j.e(eVar, "key");
        e(eVar, obj);
    }

    public final void e(e eVar, Object obj) {
        kotlin.jvm.internal.j.e(eVar, "key");
        b();
        if (obj == null) {
            c(eVar);
            return;
        }
        boolean z9 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f1297a;
        if (z9) {
            Set unmodifiableSet = Collections.unmodifiableSet(i.n0((Set) obj));
            kotlin.jvm.internal.j.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(eVar, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(eVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, size)");
            linkedHashMap.put(eVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e1.b
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            e1.b r7 = (e1.b) r7
            java.util.LinkedHashMap r7 = r7.f1297a
            java.util.LinkedHashMap r0 = r6.f1297a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = kotlin.jvm.internal.j.a(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.f1297a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return i.c0(this.f1297a.entrySet(), ",\n", "{\n", "\n}", a.f1296a, 24);
    }

    public /* synthetic */ b(boolean z9) {
        this(new LinkedHashMap(), z9);
    }
}
