package h4;

import android.app.PendingIntent;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f2194a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2195b;

    public b(PendingIntent pendingIntent, boolean z9) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f2194a = pendingIntent;
        this.f2195b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            b bVar = (b) ((a) obj);
            if (this.f2194a.equals(bVar.f2194a) && this.f2195b == bVar.f2195b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2194a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2195b ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder q = v1.a.q("ReviewInfo{pendingIntent=", this.f2194a.toString(), ", isNoOp=");
        q.append(this.f2195b);
        q.append("}");
        return q.toString();
    }
}
