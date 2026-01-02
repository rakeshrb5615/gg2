package t8;

import h.f;
import i2.m;
import j6.o;
import kotlin.jvm.internal.j;
import n.p;
import u8.g;
import u8.i;
import u8.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f5979d = new b();

    /* renamed from: a  reason: collision with root package name */
    public final d f5980a = new d();

    /* renamed from: b  reason: collision with root package name */
    public final c5.c f5981b = v8.a.f6319a;

    /* renamed from: c  reason: collision with root package name */
    public final o f5982c = new o(17);

    public final Object a(o8.a aVar, String str) {
        byte b10;
        j.e(aVar, "deserializer");
        this.f5980a.getClass();
        a2.d dVar = new a2.d(str);
        Object k9 = new p(this, k.f6150c, dVar, aVar.d()).k(aVar);
        String str2 = (String) dVar.f297f;
        int i = dVar.f293b;
        while (true) {
            b10 = 10;
            if (i != -1 && i < str2.length()) {
                int i9 = i + 1;
                char charAt = str2.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    dVar.f293b = i9;
                    b10 = g.b(charAt);
                    break;
                }
                i = i9;
            } else {
                break;
            }
        }
        dVar.f293b = str2.length();
        if (b10 == 10) {
            return k9;
        }
        a2.d.n(dVar, "Expected EOF after parsing, but had " + str.charAt(dVar.f293b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(o8.a aVar, Object obj) {
        char[] cArr;
        j.e(aVar, "serializer");
        f fVar = new f(6, false);
        u8.b bVar = u8.b.f6133c;
        synchronized (bVar) {
            i7.g gVar = (i7.g) ((androidx.datastore.preferences.protobuf.j) bVar).b;
            cArr = null;
            char[] cArr2 = (char[]) (gVar.isEmpty() ? null : gVar.removeLast());
            if (cArr2 != null) {
                ((androidx.datastore.preferences.protobuf.j) bVar).a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        fVar.f2041c = cArr;
        try {
            this.f5980a.getClass();
            new i(new m(fVar), this, k.f6150c, new i[k.f6155n.b()]).i(aVar, obj);
            return fVar.toString();
        } finally {
            fVar.f();
        }
    }
}
