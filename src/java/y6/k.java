package y6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k extends Number {

    /* renamed from: a  reason: collision with root package name */
    public final String f6925a;

    public k(String str) {
        this.f6925a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f6925a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f6925a.equals(((k) obj).f6925a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f6925a);
    }

    public final int hashCode() {
        return this.f6925a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f6925a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return i.i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f6925a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return i.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f6925a;
    }
}
