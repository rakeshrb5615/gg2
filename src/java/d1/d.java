package d1;

import a2.r;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.z;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d extends v {
    private static final d DEFAULT_INSTANCE;
    private static volatile q0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private h0 preferences_ = h0.b;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        v.j(d.class, dVar);
    }

    public static h0 l(d dVar) {
        h0 h0Var = dVar.preferences_;
        if (!h0Var.a) {
            dVar.preferences_ = h0Var.d();
        }
        return dVar.preferences_;
    }

    public static b n() {
        return (b) ((t) DEFAULT_INSTANCE.c(5));
    }

    public static d o(FileInputStream fileInputStream) {
        d dVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(fileInputStream);
        n a10 = n.a();
        v i = dVar.i();
        try {
            r0 r0Var = r0.c;
            r0Var.getClass();
            u0 a11 = r0Var.a(i.getClass());
            r rVar = (r) ((androidx.datastore.preferences.protobuf.j) iVar).b;
            if (rVar == null) {
                rVar = new r(iVar);
            }
            a11.a(i, rVar, a10);
            a11.e(i);
            if (v.f(i, true)) {
                return (d) i;
            }
            throw new IOException(new a1().getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof z) {
                throw e9.getCause();
            }
            throw new IOException(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof z) {
                throw e10.getCause();
            }
            throw e10;
        } catch (a1 e11) {
            throw new IOException(e11.getMessage());
        } catch (z e12) {
            if (e12.a) {
                throw new IOException(e12.getMessage(), e12);
            }
            throw e12;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.datastore.preferences.protobuf.q0, java.lang.Object] */
    public final Object c(int i) {
        q0 q0Var;
        switch (u.e.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", c.f1064a});
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                return new d();
            case 4:
                return new t(DEFAULT_INSTANCE);
            case h.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                q0 q0Var2 = PARSER;
                if (q0Var2 == null) {
                    synchronized (d.class) {
                        try {
                            q0 q0Var3 = PARSER;
                            q0Var = q0Var3;
                            if (q0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                q0Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return q0Var;
                }
                return q0Var2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
