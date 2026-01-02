package s6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5851a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f5852b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f5852b;
        j.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[Catch: all -> 0x00c7, TRY_ENTER, TryCatch #0 {all -> 0x00c7, blocks: (B:22:0x0099, B:25:0x00ae, B:26:0x00c6), top: B:31:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x0098). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(n7.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof s6.b
            if (r0 == 0) goto L13
            r0 = r11
            s6.b r0 = (s6.b) r0
            int r1 = r0.f5850o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5850o = r1
            goto L18
        L13:
            s6.b r0 = new s6.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f5848m
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f5850o
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f5847f
            java.util.Map r4 = r0.f5846e
            java.util.Map r4 = (java.util.Map) r4
            m8.c r5 = r0.f5845d
            s6.d r6 = r0.f5844c
            java.util.Iterator r7 = r0.f5843b
            java.util.Map r8 = r0.f5842a
            java.util.Map r8 = (java.util.Map) r8
            c4.b.e0(r11)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            c4.b.e0(r11)
            java.lang.String r11 = "dependencies"
            java.util.Map r2 = s6.c.f5852b
            kotlin.jvm.internal.j.d(r2, r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r4 = r2.size()
            int r4 = i7.r.l0(r4)
            r11.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r4 = r11
            r7 = r2
        L60:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lcc
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            s6.d r6 = (s6.d) r6
            java.lang.Object r11 = r11.getValue()
            s6.a r11 = (s6.a) r11
            m8.c r5 = r11.f5840a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f5842a = r11
            r0.f5843b = r7
            r0.f5844c = r6
            r0.f5845d = r5
            r0.f5846e = r11
            r0.f5847f = r2
            r0.f5850o = r3
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.j.e(r6, r9)     // Catch: java.lang.Throwable -> Lc7
            s6.a r9 = a(r6)     // Catch: java.lang.Throwable -> Lc7
            g5.k r9 = r9.f5841b     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto Lae
            r5.f(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L60
        Lae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc7
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc7
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r0 = move-exception
            r5.f(r11)
            throw r0
        Lcc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.b(n7.c):java.lang.Object");
    }
}
