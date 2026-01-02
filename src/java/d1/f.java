package d1;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f extends v {
    private static final f DEFAULT_INSTANCE;
    private static volatile q0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private w strings_ = s0.d;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        v.j(f.class, fVar);
    }

    public static void l(f fVar, Set set) {
        s0 s0Var = fVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) s0Var).a) {
            s0 s0Var2 = s0Var;
            int i = s0Var2.c;
            fVar.strings_ = s0Var2.c(i == 0 ? 10 : i * 2);
        }
        s0 s0Var3 = fVar.strings_;
        Charset charset = x.a;
        if (s0Var3 instanceof ArrayList) {
            ((ArrayList) s0Var3).ensureCapacity(set.size() + s0Var3.c);
        }
        s0 s0Var4 = s0Var3;
        int i9 = s0Var4.c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (s0Var4.c - i9) + " is null.";
                for (int i10 = s0Var4.c - 1; i10 >= i9; i10--) {
                    s0Var4.remove(i10);
                }
                throw new NullPointerException(str);
            }
            s0Var4.add(obj);
        }
    }

    public static f m() {
        return DEFAULT_INSTANCE;
    }

    public static e o() {
        return (e) ((t) DEFAULT_INSTANCE.c(5));
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
                return new t0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case 4:
                return new t(DEFAULT_INSTANCE);
            case h.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                q0 q0Var2 = PARSER;
                if (q0Var2 == null) {
                    synchronized (f.class) {
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

    public final w n() {
        return this.strings_;
    }
}
