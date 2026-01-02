package u8;

import android.content.res.AssetManager;
import android.os.Build;
import c.l;
import i2.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f6140a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6141b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6142c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6143d;

    /* renamed from: e  reason: collision with root package name */
    public final Serializable f6144e;

    /* renamed from: f  reason: collision with root package name */
    public final Serializable f6145f;

    /* renamed from: g  reason: collision with root package name */
    public Object f6146g;

    /* renamed from: h  reason: collision with root package name */
    public Serializable f6147h;

    /* JADX WARN: Multi-variable type inference failed */
    public i(m mVar, t8.b bVar, k kVar, i[] iVarArr) {
        kotlin.jvm.internal.j.e(mVar, "composer");
        this.f6142c = mVar;
        this.f6143d = bVar;
        this.f6144e = kVar;
        this.f6145f = iVarArr;
        this.f6146g = bVar.f5980a;
        int ordinal = kVar.ordinal();
        if (iVarArr != 0) {
            Object[] objArr = iVarArr[ordinal];
            if (objArr == 0 && objArr == this) {
                return;
            }
            iVarArr[ordinal] = this;
        }
    }

    public i a(q8.d dVar) {
        i iVar;
        i[] iVarArr = (i[]) this.f6145f;
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        t8.b bVar = (t8.b) this.f6143d;
        k f9 = g.f(dVar, bVar);
        char c9 = f9.f6156a;
        m mVar = (m) this.f6142c;
        mVar.j(c9);
        mVar.f2412a = true;
        String str = this.f6140a;
        if (str != null) {
            String str2 = (String) this.f6147h;
            if (str2 == null) {
                str2 = dVar.b();
            }
            mVar.i();
            j(str);
            mVar.j(':');
            j(str2);
            this.f6140a = null;
            this.f6147h = null;
        }
        return ((k) this.f6144e) == f9 ? this : (iVarArr == null || (iVar = iVarArr[f9.ordinal()]) == null) ? new i(mVar, bVar, f9, iVarArr) : iVar;
    }

    public void b(q8.d dVar, int i) {
        m mVar = (m) this.f6142c;
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        int ordinal = ((k) this.f6144e).ordinal();
        boolean z9 = true;
        if (ordinal == 1) {
            if (!mVar.f2412a) {
                mVar.j(',');
            }
            mVar.i();
        } else if (ordinal == 2) {
            if (mVar.f2412a) {
                this.f6141b = true;
                mVar.i();
                return;
            }
            if (i % 2 == 0) {
                mVar.j(',');
                mVar.i();
            } else {
                mVar.j(':');
                mVar.k();
                z9 = false;
            }
            this.f6141b = z9;
        } else if (ordinal != 3) {
            if (!mVar.f2412a) {
                mVar.j(',');
            }
            mVar.i();
            g.e(dVar, (t8.b) this.f6143d);
            j(dVar.e(i));
            mVar.j(':');
            mVar.k();
        } else {
            if (i == 0) {
                this.f6141b = true;
            }
            if (i == 1) {
                mVar.j(',');
                mVar.k();
                this.f6141b = false;
            }
        }
    }

    public void c(int i) {
        if (this.f6141b) {
            j(String.valueOf(i));
        } else {
            ((h.f) ((m) this.f6142c).f2413b).i(String.valueOf(i));
        }
    }

    public void d(long j) {
        if (this.f6141b) {
            j(String.valueOf(j));
        } else {
            ((h.f) ((m) this.f6142c).f2413b).i(String.valueOf(j));
        }
    }

    public void e(q8.d dVar, int i, long j) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        b(dVar, i);
        d(j);
    }

    public void f() {
        m mVar = (m) this.f6142c;
        mVar.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((h.f) mVar.f2413b).i("null");
    }

    public void g(q8.d dVar, int i, o8.a aVar, Object obj) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        kotlin.jvm.internal.j.e(aVar, "serializer");
        if (obj != null || ((t8.d) this.f6146g).f5983a) {
            kotlin.jvm.internal.j.e(dVar, "descriptor");
            kotlin.jvm.internal.j.e(aVar, "serializer");
            b(dVar, i);
            if (aVar.d().g()) {
                i(aVar, obj);
            } else if (obj == null) {
                f();
            } else {
                i(aVar, obj);
            }
        }
    }

    public void h(q8.d dVar, int i, o8.a aVar, Object obj) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        kotlin.jvm.internal.j.e(aVar, "serializer");
        b(dVar, i);
        i(aVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(o8.a r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.j.e(r5, r0)
            java.lang.Object r0 = r4.f6143d
            t8.b r0 = (t8.b) r0
            t8.d r0 = r0.f5980a
            r0.getClass()
            t8.a r1 = r0.f5987e
            int r1 = r1.ordinal()
            if (r1 == 0) goto L66
            r2 = 1
            if (r1 == r2) goto L23
            r0 = 2
            if (r1 != r0) goto L1d
            goto L66
        L1d:
            a5.o r5 = new a5.o
            r5.<init>()
            throw r5
        L23:
            q8.d r1 = r5.d()
            q4.b r1 = r1.c()
            q8.f r2 = q8.f.f5443f
            boolean r2 = kotlin.jvm.internal.j.a(r1, r2)
            if (r2 != 0) goto L3b
            q8.f r2 = q8.f.i
            boolean r1 = kotlin.jvm.internal.j.a(r1, r2)
            if (r1 == 0) goto L66
        L3b:
            q8.d r1 = r5.d()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.j.e(r1, r2)
            java.util.List r1 = r1.getAnnotations()
            java.util.Iterator r1 = r1.iterator()
        L4c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            boolean r3 = r2 instanceof t8.c
            if (r3 == 0) goto L4c
            t8.c r2 = (t8.c) r2
            java.lang.String r0 = r2.discriminator()
            goto L67
        L63:
            java.lang.String r0 = r0.f5985c
            goto L67
        L66:
            r0 = 0
        L67:
            if (r0 == 0) goto L75
            q8.d r1 = r5.d()
            java.lang.String r1 = r1.b()
            r4.f6140a = r0
            r4.f6147h = r1
        L75:
            r5.b(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.i.i(o8.a, java.lang.Object):void");
    }

    public void j(String str) {
        int i;
        kotlin.jvm.internal.j.e(str, "value");
        m mVar = (m) this.f6142c;
        mVar.getClass();
        kotlin.jvm.internal.j.e(str, "value");
        h.f fVar = (h.f) mVar.f2413b;
        fVar.c(fVar.f2040b, str.length() + 2);
        char[] cArr = (char[]) fVar.f2041c;
        int i9 = fVar.f2040b;
        int i10 = i9 + 1;
        cArr[i9] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c9 = cArr[i12];
            byte[] bArr = j.f6149b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = str.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    fVar.c(i12, 2);
                    char charAt = str.charAt(i13);
                    byte[] bArr2 = j.f6149b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i = i12 + 1;
                            ((char[]) fVar.f2041c)[i12] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str2 = j.f6148a[charAt];
                                kotlin.jvm.internal.j.b(str2);
                                fVar.c(i12, str2.length());
                                str2.getChars(0, str2.length(), (char[]) fVar.f2041c, i12);
                                int length3 = str2.length() + i12;
                                fVar.f2040b = length3;
                                i12 = length3;
                            } else {
                                char[] cArr2 = (char[]) fVar.f2041c;
                                cArr2[i12] = '\\';
                                cArr2[i12 + 1] = (char) b10;
                                i12 += 2;
                                fVar.f2040b = i12;
                            }
                        }
                    } else {
                        i = i12 + 1;
                        ((char[]) fVar.f2041c)[i12] = charAt;
                    }
                    i12 = i;
                }
                fVar.c(i12, 1);
                ((char[]) fVar.f2041c)[i12] = '\"';
                fVar.f2040b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        fVar.f2040b = i11 + 1;
    }

    public void k(q8.d dVar, int i, String str) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        kotlin.jvm.internal.j.e(str, "value");
        b(dVar, i);
        j(str);
    }

    public void l(q8.d dVar) {
        kotlin.jvm.internal.j.e(dVar, "descriptor");
        m mVar = (m) this.f6142c;
        mVar.getClass();
        mVar.f2412a = false;
        mVar.j(((k) this.f6144e).f6157b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((y1.b) this.f6143d).i();
            return null;
        }
    }

    public void n(int i, Serializable serializable) {
        ((Executor) this.f6142c).execute(new l(this, i, 3, serializable));
    }

    public boolean o(q8.d dVar) {
        ((t8.d) this.f6146g).getClass();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public i(AssetManager assetManager, Executor executor, y1.b bVar, String str, File file) {
        ?? r12;
        this.f6141b = false;
        this.f6142c = executor;
        this.f6143d = bVar;
        this.f6140a = str;
        this.f6145f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            r12 = y1.c.f6743d;
        } else {
            switch (i) {
                case 26:
                    r12 = y1.c.f6746g;
                    break;
                case 27:
                    r12 = y1.c.f6745f;
                    break;
                case 28:
                case 29:
                case 30:
                    r12 = y1.c.f6744e;
                    break;
                default:
                    r12 = 0;
                    break;
            }
        }
        this.f6144e = r12;
    }
}
