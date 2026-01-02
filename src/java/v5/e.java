package v5;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import t5.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class e implements t5.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6313a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f6314b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f6315c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f6316d;

    /* renamed from: e  reason: collision with root package name */
    public final t5.d f6317e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6318f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z9) {
        this.f6314b = new JsonWriter(writer);
        this.f6315c = hashMap;
        this.f6316d = hashMap2;
        this.f6317e = aVar;
        this.f6318f = z9;
    }

    @Override // t5.e
    public final t5.e a(t5.c cVar, boolean z9) {
        String str = cVar.f5972a;
        j();
        JsonWriter jsonWriter = this.f6314b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z9);
        return this;
    }

    @Override // t5.e
    public final t5.e b(t5.c cVar, double d9) {
        String str = cVar.f5972a;
        j();
        JsonWriter jsonWriter = this.f6314b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d9);
        return this;
    }

    @Override // t5.e
    public final t5.e c(t5.c cVar, long j) {
        String str = cVar.f5972a;
        j();
        JsonWriter jsonWriter = this.f6314b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // t5.e
    public final t5.e d(t5.c cVar, int i) {
        String str = cVar.f5972a;
        j();
        JsonWriter jsonWriter = this.f6314b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // t5.g
    public final g e(String str) {
        j();
        this.f6314b.value(str);
        return this;
    }

    @Override // t5.e
    public final t5.e f(t5.c cVar, Object obj) {
        i(obj, cVar.f5972a);
        return this;
    }

    @Override // t5.g
    public final g g(boolean z9) {
        j();
        this.f6314b.value(z9);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f6314b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                for (Object obj2 : (Collection) obj) {
                    h(obj2);
                }
                jsonWriter.endArray();
                return this;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e9) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e9);
                    }
                }
                jsonWriter.endObject();
                return this;
            } else {
                t5.d dVar = (t5.d) this.f6315c.get(obj.getClass());
                if (dVar != null) {
                    jsonWriter.beginObject();
                    dVar.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                }
                t5.f fVar = (t5.f) this.f6316d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (!(obj instanceof Enum)) {
                    jsonWriter.beginObject();
                    this.f6317e.a(obj, this);
                    jsonWriter.endObject();
                    return this;
                } else if (obj instanceof f) {
                    int a10 = ((f) obj).a();
                    j();
                    jsonWriter.value(a10);
                    return this;
                } else {
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                    return this;
                }
            }
        } else if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        } else {
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    j();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    h(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    h(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
    }

    public final e i(Object obj, String str) {
        boolean z9 = this.f6318f;
        JsonWriter jsonWriter = this.f6314b;
        if (z9) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f6313a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
