package f7;

import c5.c;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final BitSet f1519b;

    /* renamed from: a  reason: collision with root package name */
    public final String f1520a;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c9 = '0'; c9 <= '9'; c9 = (char) (c9 + 1)) {
            bitSet.set(c9);
        }
        for (char c10 = 'a'; c10 <= 'z'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        f1519b = bitSet;
    }

    public a(String str, c cVar) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        a.a.g(lowerCase, "name");
        if (lowerCase.isEmpty()) {
            throw new IllegalArgumentException("token must have at least 1 tchar");
        }
        if (lowerCase.equals("connection")) {
            b.f1521a.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char charAt = lowerCase.charAt(i);
            if (!f1519b.get(charAt)) {
                throw new IllegalArgumentException(c4.b.L("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.f1520a = lowerCase;
        lowerCase.getBytes(l4.b.f3775a);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(c4.b.L("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        a.a.g(cVar, "marshaller");
    }

    public static void a(String str, c cVar) {
        new a(str, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return this.f1520a.equals(((a) obj).f1520a);
    }

    public final int hashCode() {
        return this.f1520a.hashCode();
    }

    public final String toString() {
        return v1.a.n(new StringBuilder("Key{name='"), this.f1520a, "'}");
    }
}
