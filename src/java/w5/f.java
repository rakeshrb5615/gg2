package w5;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f implements t5.e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f6445f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final t5.c f6446g = new t5.c("key", g2.g.i(g2.g.h(e.class, new a(1))));

    /* renamed from: h  reason: collision with root package name */
    public static final t5.c f6447h = new t5.c("value", g2.g.i(g2.g.h(e.class, new a(2))));
    public static final v5.a i = new v5.a(1);

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f6448a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6449b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f6450c;

    /* renamed from: d  reason: collision with root package name */
    public final t5.d f6451d;

    /* renamed from: e  reason: collision with root package name */
    public final h f6452e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, t5.d dVar) {
        this.f6448a = byteArrayOutputStream;
        this.f6449b = hashMap;
        this.f6450c = hashMap2;
        this.f6451d = dVar;
    }

    public static int j(t5.c cVar) {
        e eVar = (e) ((Annotation) cVar.f5973b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f6441a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // t5.e
    public final t5.e a(t5.c cVar, boolean z9) {
        g(cVar, z9 ? 1 : 0, true);
        return this;
    }

    @Override // t5.e
    public final t5.e b(t5.c cVar, double d9) {
        e(cVar, d9, true);
        return this;
    }

    @Override // t5.e
    public final t5.e c(t5.c cVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f5973b.get(e.class));
        if (eVar != null) {
            k(((a) eVar).f6441a << 3);
            l(j);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // t5.e
    public final t5.e d(t5.c cVar, int i9) {
        g(cVar, i9, true);
        return this;
    }

    public final void e(t5.c cVar, double d9, boolean z9) {
        if (z9 && d9 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f6448a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d9).array());
    }

    @Override // t5.e
    public final t5.e f(t5.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void g(t5.c cVar, int i9, boolean z9) {
        if (z9 && i9 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f5973b.get(e.class));
        if (eVar == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        k(((a) eVar).f6441a << 3);
        k(i9);
    }

    public final void h(t5.c cVar, Object obj, boolean z9) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z9 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6445f);
            k(bytes.length);
            this.f6448a.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(cVar, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i(i, cVar, entry, false);
            }
        } else if (obj instanceof Double) {
            e(cVar, ((Double) obj).doubleValue(), z9);
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z9 && floatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f6448a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z9 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f5973b.get(e.class));
            if (eVar == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            k(((a) eVar).f6441a << 3);
            l(longValue);
        } else if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z9 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f6448a.write(bArr);
        } else {
            t5.d dVar = (t5.d) this.f6449b.get(obj.getClass());
            if (dVar != null) {
                i(dVar, cVar, obj, z9);
                return;
            }
            t5.f fVar = (t5.f) this.f6450c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.f6452e;
                hVar.f6454a = false;
                hVar.f6456c = cVar;
                hVar.f6455b = z9;
                fVar.a(obj, hVar);
            } else if (obj instanceof c) {
                g(cVar, ((c) obj).a(), true);
            } else if (obj instanceof Enum) {
                g(cVar, ((Enum) obj).ordinal(), true);
            } else {
                i(this.f6451d, cVar, obj, z9);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, w5.b] */
    public final void i(t5.d dVar, t5.c cVar, Object obj, boolean z9) {
        ?? outputStream = new OutputStream();
        outputStream.f6442a = 0L;
        try {
            OutputStream outputStream2 = this.f6448a;
            this.f6448a = outputStream;
            dVar.a(obj, this);
            this.f6448a = outputStream2;
            long j = outputStream.f6442a;
            outputStream.close();
            if (z9 && j == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j);
            dVar.a(obj, this);
        } catch (Throwable th) {
            try {
                outputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(int i9) {
        while ((i9 & (-128)) != 0) {
            this.f6448a.write((i9 & 127) | 128);
            i9 >>>= 7;
        }
        this.f6448a.write(i9 & 127);
    }

    public final void l(long j) {
        while (((-128) & j) != 0) {
            this.f6448a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f6448a.write(((int) j) & 127);
    }
}
