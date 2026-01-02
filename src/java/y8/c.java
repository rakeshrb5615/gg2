package y8;

import x8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final x8.j f6975a;

    /* renamed from: b  reason: collision with root package name */
    public static final x8.j f6976b;

    /* renamed from: c  reason: collision with root package name */
    public static final x8.j f6977c;

    /* renamed from: d  reason: collision with root package name */
    public static final x8.j f6978d;

    /* renamed from: e  reason: collision with root package name */
    public static final x8.j f6979e;

    static {
        x8.j jVar = x8.j.f6643d;
        f6975a = v3.f.i("/");
        f6976b = v3.f.i("\\");
        f6977c = v3.f.i("/\\");
        f6978d = v3.f.i(".");
        f6979e = v3.f.i("..");
    }

    public static final int a(y yVar) {
        x8.j jVar = yVar.f6689a;
        if (jVar.d() != 0) {
            if (jVar.i(0) != 47) {
                if (jVar.i(0) == 92) {
                    if (jVar.d() > 2 && jVar.i(1) == 92) {
                        x8.j jVar2 = f6976b;
                        kotlin.jvm.internal.j.e(jVar2, "other");
                        int f9 = jVar.f(2, jVar2.h());
                        return f9 == -1 ? jVar.d() : f9;
                    }
                } else if (jVar.d() > 2 && jVar.i(1) == 58 && jVar.i(2) == 92) {
                    char i = (char) jVar.i(0);
                    if ('a' <= i && i < '{') {
                        return 3;
                    }
                    if ('A' <= i && i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, x8.g] */
    public static final y b(y yVar, y yVar2, boolean z9) {
        kotlin.jvm.internal.j.e(yVar2, "child");
        if (a(yVar2) == -1 && yVar2.d() == null) {
            x8.j c9 = c(yVar);
            if (c9 == null && (c9 = c(yVar2)) == null) {
                c9 = f(y.f6688b);
            }
            ?? obj = new Object();
            obj.K(yVar.f6689a);
            if (obj.f6642b > 0) {
                obj.K(c9);
            }
            obj.K(yVar2.f6689a);
            return d(obj, z9);
        }
        return yVar2;
    }

    public static final x8.j c(y yVar) {
        x8.j jVar = yVar.f6689a;
        x8.j jVar2 = f6975a;
        if (x8.j.g(jVar, jVar2) != -1) {
            return jVar2;
        }
        x8.j jVar3 = yVar.f6689a;
        x8.j jVar4 = f6976b;
        if (x8.j.g(jVar3, jVar4) != -1) {
            return jVar4;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
        if (r4 != (-1)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
        r18 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b3 A[EDGE_INSN: B:225:0x02b3->B:128:0x02b3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03bc A[EDGE_INSN: B:231:0x03bc->B:206:0x03bc ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x8.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final x8.y d(x8.g r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.c.d(x8.g, boolean):x8.y");
    }

    public static final x8.j e(byte b10) {
        if (b10 != 47) {
            if (b10 == 92) {
                return f6976b;
            }
            throw new IllegalArgumentException(g2.g.c(b10, "not a directory separator: "));
        }
        return f6975a;
    }

    public static final x8.j f(String str) {
        if (kotlin.jvm.internal.j.a(str, "/")) {
            return f6975a;
        }
        if (kotlin.jvm.internal.j.a(str, "\\")) {
            return f6976b;
        }
        throw new IllegalArgumentException(g2.g.l("not a directory separator: ", str));
    }
}
