package u8;

import j5.t1;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final h f6138a = new Object();

    public static final q8.d a(q8.d dVar, c5.c cVar) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(cVar, "module");
        if (!kotlin.jvm.internal.j.a(dVar.c(), q8.e.f5441f)) {
            return dVar.isInline() ? a(dVar.i(0), cVar) : dVar;
        }
        t1.s(dVar);
        return dVar;
    }

    public static final byte b(char c9) {
        if (c9 < '~') {
            return c.f6135b[c9];
        }
        return (byte) 0;
    }

    public static final void c(a2.d dVar, String str) {
        dVar.m("Trailing comma before the end of JSON ".concat(str), dVar.f293b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(CharSequence charSequence, int i) {
        int length;
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i9 = i - 30;
                int i10 = i + 30;
                String str = i9 <= 0 ? "" : ".....";
                String str2 = i10 >= charSequence.length() ? "" : ".....";
                StringBuilder b10 = u.e.b(str);
                if (i9 < 0) {
                    i9 = 0;
                }
                int length2 = charSequence.length();
                if (i10 > length2) {
                    i10 = length2;
                }
                b10.append(charSequence.subSequence(i9, i10).toString());
                b10.append(str2);
                return b10.toString();
            }
            if (charSequence.length() - 60 > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void e(q8.d dVar, t8.b bVar) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(bVar, "json");
        if (kotlin.jvm.internal.j.a(dVar.c(), q8.f.f5443f)) {
            bVar.f5980a.getClass();
        }
    }

    public static final k f(q8.d dVar, t8.b bVar) {
        kotlin.jvm.internal.j.e(dVar, "desc");
        q4.b c9 = dVar.c();
        if (c9 instanceof q8.a) {
            return k.f6153f;
        }
        if (kotlin.jvm.internal.j.a(c9, q8.f.f5444g)) {
            return k.f6151d;
        }
        if (kotlin.jvm.internal.j.a(c9, q8.f.f5445h)) {
            q8.d a10 = a(dVar.i(0), bVar.f5981b);
            q4.b c10 = a10.c();
            if ((c10 instanceof q8.c) || kotlin.jvm.internal.j.a(c10, q8.e.f5442g)) {
                return k.f6152e;
            }
            bVar.f5980a.getClass();
            throw new d("Value of type '" + a10.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a10.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        }
        return k.f6150c;
    }
}
