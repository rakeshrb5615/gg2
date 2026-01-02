package c8;

import b8.i;
import j5.t1;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final long f945b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f946c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f947d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f948a;

    static {
        int i = b.f949a;
        f945b = t1.o(4611686018427387903L);
        f946c = t1.o(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb, int i, int i9, int i10, String str, boolean z9) {
        sb.append(i);
        if (i9 != 0) {
            sb.append('.');
            String C0 = i.C0(i10, String.valueOf(i9));
            int i11 = -1;
            int length = C0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (C0.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z9 || i13 >= 3) {
                sb.append((CharSequence) C0, 0, ((i11 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) C0, 0, i13);
            }
        }
        sb.append(str);
    }

    public static int b(long j, long j8) {
        long j9 = j ^ j8;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return j.g(j, j8);
        }
        int i = (((int) j) & 1) - (((int) j8) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean c(long j) {
        return j == f945b || j == f946c;
    }

    public static final long d(long j, c cVar) {
        j.e(cVar, "unit");
        if (j == f945b) {
            return Long.MAX_VALUE;
        }
        if (j == f946c) {
            return Long.MIN_VALUE;
        }
        long j8 = j >> 1;
        c cVar2 = (((int) j) & 1) == 0 ? c.f950b : c.f951c;
        j.e(cVar2, "sourceUnit");
        return cVar.f957a.convert(j8, cVar2.f957a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.f948a, ((a) obj).f948a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f948a == ((a) obj).f948a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f948a);
    }

    public final String toString() {
        long j;
        int d9;
        int i;
        long j8;
        int i9;
        int i10;
        long j9 = this.f948a;
        int i11 = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
        if (i11 == 0) {
            return "0s";
        }
        if (j9 == f945b) {
            return "Infinity";
        }
        if (j9 == f946c) {
            return "-Infinity";
        }
        boolean z9 = i11 < 0;
        StringBuilder sb = new StringBuilder();
        if (z9) {
            sb.append('-');
        }
        if (i11 < 0) {
            j9 = (((int) j9) & 1) + ((-(j9 >> 1)) << 1);
            int i12 = b.f949a;
        }
        long d10 = d(j9, c.f955m);
        int d11 = c(j9) ? 0 : (int) (d(j9, c.f954f) % 24);
        if (c(j9)) {
            j = 0;
            d9 = 0;
        } else {
            j = 0;
            d9 = (int) (d(j9, c.f953e) % 60);
        }
        int d12 = c(j9) ? 0 : (int) (d(j9, c.f952d) % 60);
        if (c(j9)) {
            i = 1;
            i9 = 0;
        } else {
            if ((((int) j9) & 1) == 1) {
                i = 1;
                j8 = ((j9 >> 1) % 1000) * 1000000;
            } else {
                i = 1;
                j8 = (j9 >> 1) % 1000000000;
            }
            i9 = (int) j8;
        }
        int i13 = d10 != j ? i : 0;
        int i14 = d11 != 0 ? i : 0;
        int i15 = d9 != 0 ? i : 0;
        int i16 = (d12 == 0 && i9 == 0) ? 0 : i;
        if (i13 != 0) {
            sb.append(d10);
            sb.append('d');
            i10 = i;
        } else {
            i10 = 0;
        }
        if (i14 != 0 || (i13 != 0 && (i15 != 0 || i16 != 0))) {
            int i17 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(d11);
            sb.append('h');
            i10 = i17;
        }
        if (i15 != 0 || (i16 != 0 && (i14 != 0 || i13 != 0))) {
            int i18 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(d9);
            sb.append('m');
            i10 = i18;
        }
        if (i16 != 0) {
            int i19 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (d12 != 0 || i13 != 0 || i14 != 0 || i15 != 0) {
                a(sb, d12, i9, 9, "s", false);
            } else if (i9 >= 1000000) {
                a(sb, i9 / 1000000, i9 % 1000000, 6, "ms", false);
            } else if (i9 >= 1000) {
                a(sb, i9 / 1000, i9 % 1000, 3, "us", false);
            } else {
                sb.append(i9);
                sb.append("ns");
            }
            i10 = i19;
        }
        if (z9 && i10 > i) {
            sb.insert(i, '(').append(')');
        }
        return sb.toString();
    }
}
