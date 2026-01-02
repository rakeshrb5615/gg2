package a2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public int f450a;

    /* renamed from: b  reason: collision with root package name */
    public int f451b;

    /* renamed from: c  reason: collision with root package name */
    public int f452c = 0;

    /* renamed from: d  reason: collision with root package name */
    public Object f453d;

    public r(androidx.datastore.preferences.protobuf.j jVar) {
        Charset charset = androidx.datastore.preferences.protobuf.x.a;
        this.f453d = jVar;
        jVar.b = this;
    }

    public void a(int i, int i9) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i10 = this.f452c;
        int i11 = i10 * 2;
        int[] iArr = (int[]) this.f453d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f453d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i11 >= iArr.length) {
            int[] iArr3 = new int[i10 * 4];
            this.f453d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f453d;
        iArr4[i11] = i;
        iArr4[i11 + 1] = i9;
        this.f452c++;
    }

    public void b(RecyclerView recyclerView, boolean z9) {
        this.f452c = 0;
        int[] iArr = (int[]) this.f453d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        t0 t0Var = recyclerView.s;
        if (recyclerView.r == null || t0Var == null || !t0Var.i) {
            return;
        }
        if (z9) {
            if (!recyclerView.e.h()) {
                t0Var.i(recyclerView.r.a(), this);
            }
        } else if (!recyclerView.O()) {
            t0Var.h(this.f450a, this.f451b, recyclerView.k0, this);
        }
        int i = this.f452c;
        if (i > t0Var.j) {
            t0Var.j = i;
            t0Var.f495k = z9;
            recyclerView.c.n();
        }
    }

    public int c() {
        int i = this.f452c;
        if (i != 0) {
            this.f450a = i;
            this.f452c = 0;
        } else {
            this.f450a = ((androidx.datastore.preferences.protobuf.j) this.f453d).u();
        }
        int i9 = this.f450a;
        if (i9 == 0 || i9 == this.f451b) {
            return Integer.MAX_VALUE;
        }
        return i9 >>> 3;
    }

    public void d(Object obj, androidx.datastore.preferences.protobuf.u0 u0Var, androidx.datastore.preferences.protobuf.n nVar) {
        int i = this.f451b;
        this.f451b = ((this.f450a >>> 3) << 3) | 4;
        try {
            u0Var.a(obj, this, nVar);
            if (this.f450a == this.f451b) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.f451b = i;
        }
    }

    public void e(Object obj, androidx.datastore.preferences.protobuf.u0 u0Var, androidx.datastore.preferences.protobuf.n nVar) {
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int v2 = jVar.v();
        if (jVar.a >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e9 = jVar.e(v2);
        jVar.a++;
        u0Var.a(obj, this, nVar);
        jVar.a(0);
        jVar.a--;
        jVar.d(e9);
    }

    public void f(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Boolean.valueOf(jVar.f()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Boolean.valueOf(jVar.f()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public androidx.datastore.preferences.protobuf.g g() {
        y(2);
        return ((androidx.datastore.preferences.protobuf.j) this.f453d).g();
    }

    public void h(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        if ((this.f450a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.s0) wVar).add(g());
            if (jVar.c()) {
                return;
            }
            u9 = jVar.u();
        } while (u9 == this.f450a);
        this.f452c = u9;
    }

    public void i(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Double.valueOf(jVar.h()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int v2 = jVar.v();
            if ((v2 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b10 = jVar.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Double.valueOf(jVar.h()));
            } while (jVar.b() < b10);
        }
    }

    public void j(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.i()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.i()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public Object k(androidx.datastore.preferences.protobuf.p1 p1Var, Class cls, androidx.datastore.preferences.protobuf.n nVar) {
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        switch (p1Var.ordinal()) {
            case 0:
                y(1);
                return Double.valueOf(jVar.h());
            case 1:
                y(5);
                return Float.valueOf(jVar.l());
            case 2:
                y(0);
                return Long.valueOf(jVar.n());
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                y(0);
                return Long.valueOf(jVar.w());
            case 4:
                y(0);
                return Integer.valueOf(jVar.m());
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                y(1);
                return Long.valueOf(jVar.k());
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                y(5);
                return Integer.valueOf(jVar.j());
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(jVar.f());
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                y(2);
                return jVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                y(2);
                androidx.datastore.preferences.protobuf.u0 a10 = androidx.datastore.preferences.protobuf.r0.c.a(cls);
                androidx.datastore.preferences.protobuf.v i = a10.i();
                e(i, a10, nVar);
                a10.e(i);
                return i;
            case 11:
                return g();
            case 12:
                y(0);
                return Integer.valueOf(jVar.v());
            case 13:
                y(0);
                return Integer.valueOf(jVar.i());
            case 14:
                y(5);
                return Integer.valueOf(jVar.o());
            case 15:
                y(1);
                return Long.valueOf(jVar.p());
            case 16:
                y(0);
                return Integer.valueOf(jVar.q());
            case 17:
                y(0);
                return Long.valueOf(jVar.r());
        }
    }

    public void l(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 2) {
            int v2 = jVar.v();
            if ((v2 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b10 = jVar.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.j()));
            } while (jVar.b() < b10);
        } else if (i != 5) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.j()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        }
    }

    public void m(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.k()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int v2 = jVar.v();
            if ((v2 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b10 = jVar.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.k()));
            } while (jVar.b() < b10);
        }
    }

    public void n(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 2) {
            int v2 = jVar.v();
            if ((v2 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b10 = jVar.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Float.valueOf(jVar.l()));
            } while (jVar.b() < b10);
        } else if (i != 5) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Float.valueOf(jVar.l()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        }
    }

    public void o(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.m()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.m()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public void p(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.n()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.n()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public void q(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 2) {
            int v2 = jVar.v();
            if ((v2 & 3) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b10 = jVar.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.o()));
            } while (jVar.b() < b10);
        } else if (i != 5) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.o()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        }
    }

    public void r(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.p()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int v2 = jVar.v();
            if ((v2 & 7) != 0) {
                throw new IOException("Failed to parse the message.");
            }
            int b10 = jVar.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.p()));
            } while (jVar.b() < b10);
        }
    }

    public void s(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.q()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.q()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public void t(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.r()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.r()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public void u(androidx.datastore.preferences.protobuf.w wVar, boolean z9) {
        String s5;
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        if ((this.f450a & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
        do {
            if (z9) {
                y(2);
                s5 = jVar.t();
            } else {
                y(2);
                s5 = jVar.s();
            }
            ((androidx.datastore.preferences.protobuf.s0) wVar).add(s5);
            if (jVar.c()) {
                return;
            }
            u9 = jVar.u();
        } while (u9 == this.f450a);
        this.f452c = u9;
    }

    public void v(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.v()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Integer.valueOf(jVar.v()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public void w(androidx.datastore.preferences.protobuf.w wVar) {
        int u9;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        int i = this.f450a & 7;
        if (i == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.w()));
                if (jVar.c()) {
                    return;
                }
                u9 = jVar.u();
            } while (u9 == this.f450a);
            this.f452c = u9;
        } else if (i != 2) {
            throw androidx.datastore.preferences.protobuf.z.b();
        } else {
            int b10 = jVar.b() + jVar.v();
            do {
                ((androidx.datastore.preferences.protobuf.s0) wVar).add(Long.valueOf(jVar.w()));
            } while (jVar.b() < b10);
            x(b10);
        }
    }

    public void x(int i) {
        if (((androidx.datastore.preferences.protobuf.j) this.f453d).b() != i) {
            throw androidx.datastore.preferences.protobuf.z.e();
        }
    }

    public void y(int i) {
        if ((this.f450a & 7) != i) {
            throw androidx.datastore.preferences.protobuf.z.b();
        }
    }

    public boolean z() {
        int i;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f453d;
        if (jVar.c() || (i = this.f450a) == this.f451b) {
            return false;
        }
        return jVar.x(i);
    }
}
