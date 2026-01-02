package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class f implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public c f5053a;

    /* renamed from: b  reason: collision with root package name */
    public c f5054b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f5055c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public int f5056d = 0;

    public c a(Object obj) {
        c cVar = this.f5053a;
        while (cVar != null && !cVar.f5046a.equals(obj)) {
            cVar = cVar.f5048c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a10 = a(obj);
        if (a10 == null) {
            return null;
        }
        this.f5056d--;
        WeakHashMap weakHashMap = this.f5055c;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(a10);
            }
        }
        c cVar = a10.f5049d;
        if (cVar != null) {
            cVar.f5048c = a10.f5048c;
        } else {
            this.f5053a = a10.f5048c;
        }
        c cVar2 = a10.f5048c;
        if (cVar2 != null) {
            cVar2.f5049d = cVar;
        } else {
            this.f5054b = cVar;
        }
        a10.f5048c = null;
        a10.f5049d = null;
        return a10.f5047b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((p.b) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.f r7 = (p.f) r7
            int r1 = r6.f5056d
            int r3 = r7.f5056d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            p.b r3 = (p.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            p.b r4 = (p.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            p.b r7 = (p.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f5053a, this.f5054b, 0);
        this.f5055c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
