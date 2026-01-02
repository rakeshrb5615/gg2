package u8;

import b8.p;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6132a;

    static {
        Object p8;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            p8 = p.q0(property);
        } catch (Throwable th) {
            p8 = c4.b.p(th);
        }
        if (p8 instanceof h7.g) {
            p8 = null;
        }
        Integer num = (Integer) p8;
        f6132a = num != null ? num.intValue() : 2097152;
    }
}
