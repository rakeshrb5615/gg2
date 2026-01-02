package k5;

import android.util.Base64;
import android.util.JsonReader;
import j5.a2;
import j5.b;
import j5.b0;
import j5.b1;
import j5.b2;
import j5.c;
import j5.c1;
import j5.c2;
import j5.d0;
import j5.d2;
import j5.e;
import j5.e0;
import j5.e1;
import j5.e2;
import j5.f;
import j5.f0;
import j5.f1;
import j5.f2;
import j5.g;
import j5.g0;
import j5.g1;
import j5.g2;
import j5.h;
import j5.h0;
import j5.h2;
import j5.i;
import j5.i1;
import j5.i2;
import j5.j;
import j5.j0;
import j5.j1;
import j5.j2;
import j5.k;
import j5.k0;
import j5.k2;
import j5.l;
import j5.l0;
import j5.l2;
import j5.m;
import j5.m2;
import j5.n;
import j5.n0;
import j5.n2;
import j5.o1;
import j5.p;
import j5.p0;
import j5.p1;
import j5.q;
import j5.q0;
import j5.q1;
import j5.r;
import j5.r0;
import j5.r1;
import j5.s;
import j5.s0;
import j5.s1;
import j5.t;
import j5.t0;
import j5.t1;
import j5.u;
import j5.u0;
import j5.u1;
import j5.v;
import j5.v0;
import j5.v1;
import j5.w;
import j5.w1;
import j5.x;
import j5.x0;
import j5.x1;
import j5.y;
import j5.y1;
import j5.z;
import j5.z0;
import j5.z1;
import j6.o;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.d;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final o f3403a;

    static {
        d dVar = new d();
        j5.d dVar2 = j5.d.f2922a;
        dVar.a(n2.class, dVar2);
        dVar.a(b0.class, dVar2);
        j jVar = j.f3005a;
        dVar.a(m2.class, jVar);
        dVar.a(j0.class, jVar);
        g gVar = g.f2963a;
        dVar.a(u1.class, gVar);
        dVar.a(k0.class, gVar);
        h hVar = h.f2974a;
        dVar.a(t1.class, hVar);
        dVar.a(l0.class, hVar);
        z zVar = z.f3202a;
        dVar.a(l2.class, zVar);
        dVar.a(j1.class, zVar);
        y yVar = y.f3192a;
        dVar.a(k2.class, yVar);
        dVar.a(i1.class, yVar);
        i iVar = i.f2982a;
        dVar.a(v1.class, iVar);
        dVar.a(n0.class, iVar);
        t tVar = t.f3146a;
        dVar.a(j2.class, tVar);
        dVar.a(p0.class, tVar);
        k kVar = k.f3027a;
        dVar.a(d2.class, kVar);
        dVar.a(q0.class, kVar);
        m mVar = m.f3055a;
        dVar.a(b2.class, mVar);
        dVar.a(r0.class, mVar);
        p pVar = p.f3102a;
        dVar.a(a2.class, pVar);
        dVar.a(v0.class, pVar);
        q qVar = q.f3112a;
        dVar.a(z1.class, qVar);
        dVar.a(x0.class, qVar);
        n nVar = n.f3075a;
        dVar.a(x1.class, nVar);
        dVar.a(t0.class, nVar);
        b bVar = b.f2886a;
        dVar.a(p1.class, bVar);
        dVar.a(d0.class, bVar);
        j5.a aVar = j5.a.f2864a;
        dVar.a(o1.class, aVar);
        dVar.a(e0.class, aVar);
        j5.o oVar = j5.o.f3091a;
        dVar.a(y1.class, oVar);
        dVar.a(u0.class, oVar);
        l lVar = l.f3044a;
        dVar.a(w1.class, lVar);
        dVar.a(s0.class, lVar);
        c cVar = c.f2910a;
        dVar.a(q1.class, cVar);
        dVar.a(f0.class, cVar);
        r rVar = r.f3125a;
        dVar.a(c2.class, rVar);
        dVar.a(z0.class, rVar);
        s sVar = s.f3135a;
        dVar.a(e2.class, sVar);
        dVar.a(b1.class, sVar);
        u uVar = u.f3163a;
        dVar.a(f2.class, uVar);
        dVar.a(c1.class, uVar);
        x xVar = x.f3185a;
        dVar.a(i2.class, xVar);
        dVar.a(g1.class, xVar);
        v vVar = v.f3168a;
        dVar.a(h2.class, vVar);
        dVar.a(e1.class, vVar);
        w wVar = w.f3176a;
        dVar.a(g2.class, wVar);
        dVar.a(f1.class, wVar);
        e eVar = e.f2946a;
        dVar.a(s1.class, eVar);
        dVar.a(g0.class, eVar);
        f fVar = f.f2956a;
        dVar.a(r1.class, fVar);
        dVar.a(h0.class, fVar);
        dVar.f6312d = true;
        f3403a = new o(dVar, 19);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j5.w0, java.lang.Object] */
    public static x0 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c9 = 4;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    obj.f3182d = jsonReader.nextLong();
                    obj.f3184f = (byte) (obj.f3184f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f3180b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f3179a = jsonReader.nextLong();
                    obj.f3184f = (byte) (obj.f3184f | 1);
                    break;
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    obj.f3181c = jsonReader.nextString();
                    break;
                case 4:
                    obj.f3183e = jsonReader.nextInt();
                    obj.f3184f = (byte) (obj.f3184f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static f0 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null || str2 == null) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                sb.append(" key");
            }
            if (str2 == null) {
                sb.append(" value");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
        }
        return new f0(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j5.c0] */
    public static d0 c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c9 = '\b';
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    obj.i = d(jsonReader, new a5.t(24));
                    break;
                case 1:
                    obj.f2913a = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 1);
                    break;
                case 2:
                    obj.f2917e = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 8);
                    break;
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    obj.f2918f = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 16);
                    break;
                case 4:
                    obj.f2919g = jsonReader.nextLong();
                    obj.j = (byte) (obj.j | 32);
                    break;
                case d1.h.STRING_FIELD_NUMBER /* 5 */:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f2914b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    obj.f2915c = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 2);
                    break;
                case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    obj.f2920h = jsonReader.nextString();
                    break;
                case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                    obj.f2916d = jsonReader.nextInt();
                    obj.j = (byte) (obj.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, j5.d1] */
    public static List d(JsonReader jsonReader, a5.t tVar) {
        Object e0Var;
        boolean z9;
        Object h0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            switch (tVar.f609a) {
                case 24:
                    jsonReader.beginObject();
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    z9 = false;
                                    break;
                                }
                                z9 = true;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    z9 = true;
                                    break;
                                }
                                z9 = true;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    z9 = true;
                                    break;
                                }
                                z9 = true;
                                break;
                            default:
                                z9 = true;
                                break;
                        }
                        switch (z9) {
                            case false:
                                str2 = jsonReader.nextString();
                                if (str2 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null libraryName");
                                }
                            case true:
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    str = nextString;
                                    break;
                                } else {
                                    throw new NullPointerException("Null arch");
                                }
                            case true:
                                str3 = jsonReader.nextString();
                                if (str3 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null buildId");
                                }
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str == null || str2 == null || str3 == null) {
                        StringBuilder sb = new StringBuilder();
                        if (str == null) {
                            sb.append(" arch");
                        }
                        if (str2 == null) {
                            sb.append(" libraryName");
                        }
                        if (str3 == null) {
                            sb.append(" buildId");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
                    }
                    e0Var = new e0(str, str2, str3);
                    continue;
                    arrayList.add(e0Var);
                    break;
                case 25:
                    jsonReader.beginObject();
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("filename")) {
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException("Null filename");
                            }
                            str = nextString2;
                        } else if (nextName2.equals("contents")) {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str != null && bArr != null) {
                        h0Var = new h0(str, bArr);
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if (str == null) {
                            sb2.append(" filename");
                        }
                        if (bArr == null) {
                            sb2.append(" contents");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", sb2));
                    }
                    break;
                case 26:
                    ?? obj = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = true;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                        switch (z10) {
                            case false:
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 != null) {
                                    obj.f2942b = nextString3;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterKey");
                                }
                            case true:
                                obj.f2944d = jsonReader.nextLong();
                                obj.f2945e = (byte) (obj.f2945e | 1);
                                break;
                            case true:
                                jsonReader.beginObject();
                                String str4 = null;
                                String str5 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (nextName4.equals("variantId")) {
                                        str5 = jsonReader.nextString();
                                        if (str5 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (nextName4.equals("rolloutId")) {
                                        str4 = jsonReader.nextString();
                                        if (str4 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str4 != null && str5 != null) {
                                    obj.f2941a = new f1(str4, str5);
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (str4 == null) {
                                        sb3.append(" rolloutId");
                                    }
                                    if (str5 == null) {
                                        sb3.append(" variantId");
                                    }
                                    throw new IllegalStateException(g2.g.g("Missing required properties:", sb3));
                                }
                            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    obj.f2943c = nextString4;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterValue");
                                }
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    e0Var = obj.a();
                    continue;
                    arrayList.add(e0Var);
                    break;
                case 27:
                    jsonReader.beginObject();
                    List list = null;
                    byte b10 = 0;
                    int i = 0;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = true;
                                break;
                            default:
                                z11 = true;
                                break;
                        }
                        switch (z11) {
                            case false:
                                list = d(jsonReader, new a5.t(29));
                                if (list != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            case true:
                                str = jsonReader.nextString();
                                if (str == null) {
                                    throw new NullPointerException("Null name");
                                }
                                break;
                            case true:
                                i = jsonReader.nextInt();
                                b10 = (byte) (b10 | 1);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && str != null && list != null) {
                        h0Var = new v0(str, i, list);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (str == null) {
                            sb4.append(" name");
                        }
                        if ((b10 & 1) == 0) {
                            sb4.append(" importance");
                        }
                        if (list == null) {
                            sb4.append(" frames");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", sb4));
                    }
                    break;
                case 28:
                    jsonReader.beginObject();
                    String str6 = null;
                    String str7 = null;
                    byte b11 = 0;
                    long j = 0;
                    long j8 = 0;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    z12 = false;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    z12 = true;
                                    break;
                                }
                                z12 = true;
                                break;
                            default:
                                z12 = true;
                                break;
                        }
                        switch (z12) {
                            case false:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 != null) {
                                    str6 = nextString5;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case true:
                                b11 = (byte) (b11 | 2);
                                j8 = jsonReader.nextLong();
                                break;
                            case true:
                                str7 = new String(Base64.decode(jsonReader.nextString(), 2), n2.f3090a);
                                break;
                            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                b11 = (byte) (b11 | 1);
                                j = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b11 != 3 || str6 == null) {
                        StringBuilder sb5 = new StringBuilder();
                        if ((b11 & 1) == 0) {
                            sb5.append(" baseAddress");
                        }
                        if ((b11 & 2) == 0) {
                            sb5.append(" size");
                        }
                        if (str6 == null) {
                            sb5.append(" name");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", sb5));
                    }
                    e0Var = new s0(j, j8, str6, str7);
                    continue;
                    arrayList.add(e0Var);
                    break;
                default:
                    e0Var = a(jsonReader);
                    continue;
                    arrayList.add(e0Var);
            }
            e0Var = h0Var;
            arrayList.add(e0Var);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, j5.o0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, j5.a1] */
    public static p0 e(JsonReader jsonReader) {
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                obj2.f2879a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f2880b = jsonReader.nextInt();
                                obj2.f2885g = (byte) (obj2.f2885g | 1);
                                break;
                            case 2:
                                obj2.f2882d = jsonReader.nextInt();
                                obj2.f2885g = (byte) (obj2.f2885g | 4);
                                break;
                            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                obj2.f2884f = jsonReader.nextLong();
                                obj2.f2885g = (byte) (obj2.f2885g | 16);
                                break;
                            case 4:
                                obj2.f2883e = jsonReader.nextLong();
                                obj2.f2885g = (byte) (obj2.f2885g | 8);
                                break;
                            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                                obj2.f2881c = jsonReader.nextBoolean();
                                obj2.f2885g = (byte) (obj2.f2885g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f3098d = obj2.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d9 = d(jsonReader, new a5.t(26));
                            if (d9 == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = d9;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f3100f = new g1(list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                case 2:
                    jsonReader.beginObject();
                    byte b10 = 0;
                    int i = 0;
                    r0 r0Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    z0 z0Var = null;
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = Collections.unmodifiableList(arrayList);
                                break;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                t0 t0Var = null;
                                d0 d0Var = null;
                                u0 u0Var = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            d0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            list5 = d(jsonReader, new a5.t(27));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            long j = 0;
                                            byte b11 = 0;
                                            String str = null;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c13 = 0;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c13 = 1;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c13 = 2;
                                                            break;
                                                        }
                                                        c13 = 65535;
                                                        break;
                                                    default:
                                                        c13 = 65535;
                                                        break;
                                                }
                                                switch (c13) {
                                                    case 0:
                                                        b11 = (byte) (b11 | 1);
                                                        j = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b11 == 1 && str != null && str2 != null) {
                                                u0Var = new u0(str, str2, j);
                                                break;
                                            } else {
                                                StringBuilder sb = new StringBuilder();
                                                if (str == null) {
                                                    sb.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb.append(" code");
                                                }
                                                if ((b11 & 1) == 0) {
                                                    sb.append(" address");
                                                }
                                                throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
                                            }
                                            break;
                                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                            list6 = d(jsonReader, new a5.t(28));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            break;
                                        case 4:
                                            t0Var = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (u0Var != null && list6 != null) {
                                    r0Var = new r0(list5, t0Var, d0Var, u0Var, list6);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (u0Var == null) {
                                        sb2.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb2.append(" binaries");
                                    }
                                    throw new IllegalStateException(g2.g.g("Missing required properties:", sb2));
                                }
                                break;
                            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = Collections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = Collections.unmodifiableList(arrayList3);
                                break;
                            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                                i = jsonReader.nextInt();
                                b10 = (byte) 1;
                                break;
                            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                                z0Var = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 == 1 && r0Var != null) {
                        obj.f3097c = new q0(r0Var, list2, list3, bool, z0Var, list4, i);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (r0Var == null) {
                            sb3.append(" execution");
                        }
                        if (b10 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", sb3));
                    }
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str3 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 != null) {
                        obj.f3099e = new c1(str3);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f3096b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case d1.h.STRING_FIELD_NUMBER /* 5 */:
                    obj.f3095a = jsonReader.nextLong();
                    obj.f3101g = (byte) (obj.f3101g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r2.equals("reason") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j5.t0 f(android.util.JsonReader r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.a.f(android.util.JsonReader):j5.t0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j5.y0, java.lang.Object] */
    public static z0 g(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    obj.f3198b = jsonReader.nextInt();
                    obj.f3201e = (byte) (obj.f3201e | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f3197a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    obj.f3200d = jsonReader.nextBoolean();
                    obj.f3201e = (byte) (obj.f3201e | 4);
                    break;
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    obj.f3199c = jsonReader.nextInt();
                    obj.f3201e = (byte) (obj.f3201e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j5.a0] */
    /* JADX WARN: Type inference failed for: r1v44, types: [j5.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [j5.m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [j5.h1, java.lang.Object] */
    public static b0 h(JsonReader jsonReader) {
        char c9;
        char c10;
        char c11;
        boolean z9;
        char c12;
        Charset charset = n2.f3090a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c9 = '\b';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c9 = '\t';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c9 = '\n';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c9 = 11;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new a5.t(25));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.f2876k = new g0(list, str);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f2868a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.f2874g = jsonReader.nextString();
                    break;
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    obj.f2877l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f2875h = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case d1.h.STRING_FIELD_NUMBER /* 5 */:
                    obj.f2873f = jsonReader.nextString();
                    break;
                case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f2869b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.f2871d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                    obj.f2872e = jsonReader.nextString();
                    break;
                case '\t':
                    obj.f2870c = jsonReader.nextInt();
                    obj.f2878m = (byte) (obj.f2878m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.i = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f2995f = false;
                    obj2.f3000m = (byte) (obj2.f3000m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                obj2.f2993d = jsonReader.nextLong();
                                obj2.f3000m = (byte) (obj2.f3000m | 1);
                                break;
                            case 1:
                                obj2.f2992c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f2991b = new String(Base64.decode(jsonReader.nextString(), 2), n2.f3090a);
                                break;
                            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                obj2.f2994e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c11 = 7;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c11 = '\b';
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            obj3.f3066f = jsonReader.nextBoolean();
                                            obj3.j = (byte) (obj3.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.f3068h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.f3064d = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 4);
                                            break;
                                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                            obj3.f3061a = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 1);
                                            break;
                                        case 4:
                                            obj3.f3065e = jsonReader.nextLong();
                                            obj3.j = (byte) (obj3.j | 8);
                                            break;
                                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                                            obj3.f3063c = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 2);
                                            break;
                                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f3062b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                                            obj3.f3067g = jsonReader.nextInt();
                                            obj3.j = (byte) (obj3.j | 32);
                                            break;
                                        case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.j = obj3.a();
                                break;
                            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f2998k = Collections.unmodifiableList(arrayList);
                                break;
                            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z9 = false;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z9 = true;
                                                break;
                                            }
                                            z9 = true;
                                            break;
                                        default:
                                            z9 = true;
                                            break;
                                    }
                                    switch (z9) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.f2979c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case true:
                                            obj4.f2980d = jsonReader.nextBoolean();
                                            obj4.f2981e = (byte) (obj4.f2981e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.f2978b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                            obj4.f2977a = jsonReader.nextInt();
                                            obj4.f2981e = (byte) (obj4.f2981e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.i = obj4.a();
                                break;
                            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                            str3 = jsonReader.nextString();
                                            if (str3 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    obj2.f2996g = new k0(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str2 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb.append(" version");
                                    }
                                    throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
                                }
                                break;
                            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    obj2.f2997h = new j1(str8);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f2990a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f2995f = jsonReader.nextBoolean();
                                obj2.f3000m = (byte) (obj2.f3000m | 2);
                                break;
                            case 11:
                                obj2.f2999l = jsonReader.nextInt();
                                obj2.f3000m = (byte) (obj2.f3000m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.j = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            b0 h9 = h(jsonReader);
            jsonReader.close();
            return h9;
        } catch (IllegalStateException e9) {
            throw new IOException(e9);
        }
    }
}
