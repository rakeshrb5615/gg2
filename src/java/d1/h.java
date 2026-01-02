package d1;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.v;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class h extends v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile q0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        v.j(h.class, hVar);
    }

    public static g D() {
        return (g) ((t) DEFAULT_INSTANCE.c(5));
    }

    public static void l(h hVar, long j) {
        hVar.valueCase_ = 4;
        hVar.value_ = Long.valueOf(j);
    }

    public static void m(h hVar, String str) {
        hVar.getClass();
        hVar.valueCase_ = 5;
        hVar.value_ = str;
    }

    public static void n(h hVar, f fVar) {
        hVar.getClass();
        hVar.value_ = fVar;
        hVar.valueCase_ = 6;
    }

    public static void o(h hVar, double d9) {
        hVar.valueCase_ = 7;
        hVar.value_ = Double.valueOf(d9);
    }

    public static void p(h hVar, androidx.datastore.preferences.protobuf.g gVar) {
        hVar.getClass();
        hVar.valueCase_ = 8;
        hVar.value_ = gVar;
    }

    public static void q(h hVar, boolean z9) {
        hVar.valueCase_ = 1;
        hVar.value_ = Boolean.valueOf(z9);
    }

    public static void r(h hVar, float f9) {
        hVar.valueCase_ = 2;
        hVar.value_ = Float.valueOf(f9);
    }

    public static void s(h hVar, int i) {
        hVar.valueCase_ = 3;
        hVar.value_ = Integer.valueOf(i);
    }

    public static h v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final f B() {
        return this.valueCase_ == 6 ? (f) this.value_ : f.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case 4:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
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
                return new t0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", f.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case 4:
                return new t(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                q0 q0Var2 = PARSER;
                if (q0Var2 == null) {
                    synchronized (h.class) {
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

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.g u() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.c;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
