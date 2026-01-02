package s2;

import android.content.Context;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5810a;

    /* renamed from: b  reason: collision with root package name */
    public final a3.a f5811b;

    /* renamed from: c  reason: collision with root package name */
    public final a3.a f5812c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5813d;

    public b(Context context, a3.a aVar, a3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f5810a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f5811b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f5812c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5813d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f5810a.equals(bVar.f5810a) && this.f5811b.equals(bVar.f5811b) && this.f5812c.equals(bVar.f5812c) && this.f5813d.equals(bVar.f5813d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f5810a.hashCode() ^ 1000003) * 1000003) ^ this.f5811b.hashCode()) * 1000003) ^ this.f5812c.hashCode()) * 1000003) ^ this.f5813d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f5810a);
        sb.append(", wallClock=");
        sb.append(this.f5811b);
        sb.append(", monotonicClock=");
        sb.append(this.f5812c);
        sb.append(", backendName=");
        return v1.a.n(sb, this.f5813d, "}");
    }
}
