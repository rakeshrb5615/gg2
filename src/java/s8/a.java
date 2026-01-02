package s8;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a implements o8.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5857a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final n f5858b = new n("kotlin.Boolean", q8.b.f5438f);

    @Override // o8.a
    public final void b(u8.i iVar, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (iVar.f6141b) {
            iVar.j(String.valueOf(booleanValue));
        } else {
            ((h.f) ((i2.m) iVar.f6142c).f2413b).i(String.valueOf(booleanValue));
        }
    }

    @Override // o8.a
    public final Object c(n.p pVar) {
        boolean z9;
        boolean z10;
        kotlin.jvm.internal.j.e(pVar, "decoder");
        a2.d dVar = (a2.d) pVar.f4242d;
        int x9 = dVar.x();
        String str = (String) dVar.f297f;
        if (x9 == str.length()) {
            a2.d.n(dVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(x9) == '\"') {
            x9++;
            z9 = true;
        } else {
            z9 = false;
        }
        int w8 = dVar.w(x9);
        if (w8 >= str.length() || w8 == -1) {
            a2.d.n(dVar, "EOF", 0, 6);
            throw null;
        }
        int i = w8 + 1;
        int charAt = str.charAt(w8) | ' ';
        if (charAt == 102) {
            dVar.e(i, "alse");
            z10 = false;
        } else if (charAt != 116) {
            a2.d.n(dVar, "Expected valid boolean literal prefix, but had '" + dVar.j() + '\'', 0, 6);
            throw null;
        } else {
            dVar.e(i, "rue");
            z10 = true;
        }
        if (z9) {
            if (dVar.f293b == str.length()) {
                a2.d.n(dVar, "EOF", 0, 6);
                throw null;
            } else if (str.charAt(dVar.f293b) != '\"') {
                a2.d.n(dVar, "Expected closing quotation mark", 0, 6);
                throw null;
            } else {
                dVar.f293b++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // o8.a
    public final q8.d d() {
        return f5858b;
    }
}
