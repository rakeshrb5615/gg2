package o7;

import i7.d;
import i7.h;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends d implements a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Enum[] f5040a;

    public b(Enum[] enumArr) {
        j.e(enumArr, "entries");
        this.f5040a = enumArr;
    }

    @Override // i7.a
    public final int b() {
        return this.f5040a.length;
    }

    @Override // i7.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            return ((Enum) h.f0(r42.ordinal(), this.f5040a)) == r42;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f5040a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(v1.a.i("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // i7.d, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            if (((Enum) h.f0(ordinal, this.f5040a)) == r42) {
                return ordinal;
            }
            return -1;
        }
        return -1;
    }

    @Override // i7.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            int ordinal = r42.ordinal();
            if (((Enum) h.f0(ordinal, this.f5040a)) == r42) {
                return ordinal;
            }
            return -1;
        }
        return -1;
    }
}
