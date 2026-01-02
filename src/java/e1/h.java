package e1;

import a1.f1;
import a1.n1;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import i7.i;
import i7.r;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final h f1306a = new Object();

    @Override // a1.f1
    public final void a(Object obj, n1 n1Var) {
        v a10;
        Map a11 = ((b) obj).a();
        d1.b n9 = d1.d.n();
        for (Map.Entry entry : a11.entrySet()) {
            Object value = entry.getValue();
            String str = ((e) entry.getKey()).f1304a;
            if (value instanceof Boolean) {
                d1.g D = d1.h.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.d();
                d1.h.q((d1.h) ((t) D).b, booleanValue);
                a10 = D.a();
            } else if (value instanceof Float) {
                d1.g D2 = d1.h.D();
                float floatValue = ((Number) value).floatValue();
                D2.d();
                d1.h.r((d1.h) ((t) D2).b, floatValue);
                a10 = D2.a();
            } else if (value instanceof Double) {
                d1.g D3 = d1.h.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.d();
                d1.h.o((d1.h) ((t) D3).b, doubleValue);
                a10 = D3.a();
            } else if (value instanceof Integer) {
                d1.g D4 = d1.h.D();
                int intValue = ((Number) value).intValue();
                D4.d();
                d1.h.s((d1.h) ((t) D4).b, intValue);
                a10 = D4.a();
            } else if (value instanceof Long) {
                d1.g D5 = d1.h.D();
                long longValue = ((Number) value).longValue();
                D5.d();
                d1.h.l((d1.h) ((t) D5).b, longValue);
                a10 = D5.a();
            } else if (value instanceof String) {
                d1.g D6 = d1.h.D();
                D6.d();
                d1.h.m((d1.h) ((t) D6).b, (String) value);
                a10 = D6.a();
            } else if (value instanceof Set) {
                d1.g D7 = d1.h.D();
                d1.e o9 = d1.f.o();
                o9.d();
                d1.f.l((d1.f) ((t) o9).b, (Set) value);
                D7.d();
                d1.h.n((d1.h) ((t) D7).b, (d1.f) o9.a());
                a10 = D7.a();
            } else if (!(value instanceof byte[])) {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            } else {
                d1.g D8 = d1.h.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.g c9 = androidx.datastore.preferences.protobuf.g.c(bArr, 0, bArr.length);
                D8.d();
                d1.h.p((d1.h) ((t) D8).b, c9);
                a10 = D8.a();
            }
            n9.getClass();
            str.getClass();
            n9.d();
            d1.d.l((d1.d) ((t) n9).b).put(str, (d1.h) a10);
        }
        d1.d dVar = (d1.d) n9.a();
        int a12 = dVar.a((u0) null);
        Logger logger = l.h;
        if (a12 > 4096) {
            a12 = 4096;
        }
        l lVar = new l(n1Var, a12);
        dVar.b(lVar);
        if (lVar.f > 0) {
            lVar.u0();
        }
    }

    @Override // a1.f1
    public final Object b() {
        return new b(true);
    }

    @Override // a1.f1
    public final Object c(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            d1.d o9 = d1.d.o(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            j.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map m9 = o9.m();
            j.d(m9, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m9.entrySet()) {
                String str = (String) entry.getKey();
                d1.h hVar = (d1.h) entry.getValue();
                j.d(str, "name");
                j.d(hVar, "value");
                int C = hVar.C();
                switch (C == 0 ? -1 : g.f1305a[u.e.c(C)]) {
                    case -1:
                        throw new IOException("Value case is null.", null);
                    case 0:
                    default:
                        throw new RuntimeException();
                    case 1:
                        bVar.e(new e(str), Boolean.valueOf(hVar.t()));
                        break;
                    case 2:
                        bVar.e(new e(str), Float.valueOf(hVar.x()));
                        break;
                    case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                        bVar.e(new e(str), Double.valueOf(hVar.w()));
                        break;
                    case 4:
                        bVar.e(new e(str), Integer.valueOf(hVar.y()));
                        break;
                    case d1.h.STRING_FIELD_NUMBER /* 5 */:
                        bVar.e(new e(str), Long.valueOf(hVar.z()));
                        break;
                    case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                        e eVar = new e(str);
                        String A = hVar.A();
                        j.d(A, "value.string");
                        bVar.e(eVar, A);
                        break;
                    case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                        e c02 = c4.b.c0(str);
                        w n9 = hVar.B().n();
                        j.d(n9, "value.stringSet.stringsList");
                        bVar.e(c02, i.n0(n9));
                        break;
                    case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                        e eVar2 = new e(str);
                        androidx.datastore.preferences.protobuf.g u9 = hVar.u();
                        int size = u9.size();
                        if (size == 0) {
                            bArr = x.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u9.d(size, bArr2);
                            bArr = bArr2;
                        }
                        j.d(bArr, "value.bytes.toByteArray()");
                        bVar.e(eVar2, bArr);
                        break;
                    case 9:
                        throw new IOException("Value not set.", null);
                }
            }
            return new b(r.s0(bVar.a()), true);
        } catch (z e9) {
            throw new IOException("Unable to parse preferences proto.", e9);
        }
    }
}
