package w6;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s extends o {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f6483a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f6483a = bool;
    }

    public static boolean d(s sVar) {
        Serializable serializable = sVar.f6483a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    public final BigInteger a() {
        Serializable serializable = this.f6483a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(b().longValue());
        }
        String c9 = c();
        y6.i.c(c9);
        return new BigInteger(c9);
    }

    public final Number b() {
        Serializable serializable = this.f6483a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new y6.k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Serializable serializable = this.f6483a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = sVar.f6483a;
        Serializable serializable2 = this.f6483a;
        if (serializable2 == null) {
            return serializable == null;
        } else if (d(this) && d(sVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? a().equals(sVar.a()) : b().longValue() == sVar.b().longValue();
        } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
            if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : y6.i.i(c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : y6.i.i(sVar.c())) == 0;
            }
            double doubleValue = serializable2 instanceof Number ? b().doubleValue() : Double.parseDouble(c());
            double doubleValue2 = serializable instanceof Number ? sVar.b().doubleValue() : Double.parseDouble(sVar.c());
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        } else {
            return serializable2.equals(serializable);
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f6483a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            doubleToLongBits = b().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f6483a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f6483a = str;
    }
}
