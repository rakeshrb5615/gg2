package s8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c implements o8.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5859a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final n f5860b = new n("kotlin.Double", q8.b.f5439g);

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        i2.m mVar = (i2.m) iVar.f6142c;
        if (iVar.f6141b) {
            iVar.j(String.valueOf(doubleValue));
        } else {
            ((h.f) mVar.f2413b).i(String.valueOf(doubleValue));
        }
        ((t8.d) iVar.f6146g).getClass();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            Double valueOf = Double.valueOf(doubleValue);
            String fVar = ((h.f) mVar.f2413b).toString();
            throw new u8.d("Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) u8.g.d(fVar, -1)));
        }
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "decoder");
        a2.d dVar = (a2.d) pVar.f4242d;
        String j = dVar.j();
        try {
            double parseDouble = Double.parseDouble(j);
            ((t8.b) pVar.f4240b).f5980a.getClass();
            if (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble)) {
                Double valueOf = Double.valueOf(parseDouble);
                a2.d.n(dVar, "Unexpected special floating-point value " + valueOf + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
                throw null;
            }
            return Double.valueOf(parseDouble);
        } catch (IllegalArgumentException unused) {
            a2.d.n(dVar, "Failed to parse type 'double' for input '" + j + '\'', 0, 6);
            throw null;
        }
    }

    @Override // o8.a
    public final q8.d d() {
        return f5860b;
    }
}
