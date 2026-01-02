package r;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class i {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final s.b lock;
    private final s.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    /* JADX WARN: Type inference failed for: r1v4, types: [s.b, java.lang.Object] */
    public i(int i) {
        this.maxSize = i;
        if (i <= 0) {
            s.a.c("maxSize <= 0");
            throw null;
        }
        this.map = new s.c();
        this.lock = new Object();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.j.e(str, "message");
        throw new IllegalStateException(str);
    }

    public Object create(Object obj) {
        kotlin.jvm.internal.j.e(obj, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z9, Object obj, Object obj2, Object obj3) {
        kotlin.jvm.internal.j.e(obj, "key");
        kotlin.jvm.internal.j.e(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(Object obj) {
        Object put;
        kotlin.jvm.internal.j.e(obj, "key");
        synchronized (this.lock) {
            s.c cVar = this.map;
            cVar.getClass();
            Object obj2 = cVar.f5774a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object create = create(obj);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    put = this.map.f5774a.put(obj, create);
                    if (put != null) {
                        this.map.f5774a.put(obj, put);
                    } else {
                        this.size += a(obj, create);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, obj, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        kotlin.jvm.internal.j.e(obj, "key");
        kotlin.jvm.internal.j.e(obj2, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            put = this.map.f5774a.put(obj, obj2);
            if (put != null) {
                this.size -= a(obj, put);
            }
        }
        if (put != null) {
            entryRemoved(false, obj, put, obj2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(Object obj) {
        Object remove;
        kotlin.jvm.internal.j.e(obj, "key");
        synchronized (this.lock) {
            s.c cVar = this.map;
            cVar.getClass();
            remove = cVar.f5774a.remove(obj);
            if (remove != null) {
                this.size -= a(obj, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, obj, remove, null);
        }
        return remove;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            s.a.c("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(Object obj, Object obj2) {
        kotlin.jvm.internal.j.e(obj, "key");
        kotlin.jvm.internal.j.e(obj2, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set entrySet = this.map.f5774a.entrySet();
            kotlin.jvm.internal.j.d(entrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry> entrySet2 = this.map.f5774a.entrySet();
            kotlin.jvm.internal.j.d(entrySet2, "<get-entries>(...)");
            for (Map.Entry entry : entrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i9 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i9 != 0 ? (i * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:13:0x0019, B:15:0x001d, B:18:0x0028, B:20:0x003a, B:28:0x0059, B:32:0x005f, B:23:0x0044, B:24:0x004a, B:27:0x0055, B:37:0x008d, B:38:0x0094), top: B:41:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            s.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L8d
            s.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f5774a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L19
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L8d
            goto L19
        L16:
            r7 = move-exception
            goto L95
        L19:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 <= r7) goto L8b
            s.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f5774a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L28
            goto L8b
        L28:
            s.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f5774a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "<get-entries>(...)"
            kotlin.jvm.internal.j.d(r1, r2)     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L16
            r3 = 0
            if (r2 == 0) goto L4a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L44
        L42:
            r1 = r3
            goto L59
        L44:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L16
            goto L59
        L4a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L55
            goto L42
        L55:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L16
        L59:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L5f
            monitor-exit(r0)
            return
        L5f:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            s.c r4 = r6.map     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = "key"
            kotlin.jvm.internal.j.e(r2, r5)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r4 = r4.f5774a     // Catch: java.lang.Throwable -> L16
            r4.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r4 = r6.size     // Catch: java.lang.Throwable -> L16
            int r5 = r6.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L16
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r6.entryRemoved(r5, r2, r1, r3)
            goto L0
        L8b:
            monitor-exit(r0)
            return
        L8d:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L95:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.trimToSize(int):void");
    }
}
