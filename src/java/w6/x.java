package w6;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final t f6484a;

    /* renamed from: b  reason: collision with root package name */
    public static final u f6485b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ x[] f6486c;

    static {
        t tVar = new t();
        f6484a = tVar;
        u uVar = new u();
        f6485b = uVar;
        f6486c = new x[]{tVar, uVar, new x() { // from class: w6.v
            public static Double b(String str, e7.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (aVar.f1343u != 1) {
                        throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.A(true));
                    }
                    return valueOf;
                } catch (NumberFormatException e9) {
                    StringBuilder q = v1.a.q("Cannot parse ", str, "; at path ");
                    q.append(aVar.A(true));
                    throw new RuntimeException(q.toString(), e9);
                }
            }

            @Override // w6.x
            public final Number a(e7.a aVar) {
                String M = aVar.M();
                if (M.indexOf(46) >= 0) {
                    return b(M, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(M));
                } catch (NumberFormatException unused) {
                    return b(M, aVar);
                }
            }
        }, new x() { // from class: w6.w
            @Override // w6.x
            public final Number a(e7.a aVar) {
                String M = aVar.M();
                try {
                    return y6.i.i(M);
                } catch (NumberFormatException e9) {
                    StringBuilder q = v1.a.q("Cannot parse ", M, "; at path ");
                    q.append(aVar.A(true));
                    throw new RuntimeException(q.toString(), e9);
                }
            }
        }};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f6486c.clone();
    }

    public abstract Number a(e7.a aVar);
}
