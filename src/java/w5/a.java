package w5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f6441a;

    public a(int i) {
        this.f6441a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            if (this.f6441a == ((a) ((e) obj)).f6441a) {
                Object obj2 = d.f6443a;
                return obj2.equals(obj2);
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f6441a) + (d.f6443a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6441a + "intEncoding=" + d.f6443a + ')';
    }
}
