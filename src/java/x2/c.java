package x2;

import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f6544a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6545b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f6546c;

    public c(long j, long j8, Set set) {
        this.f6544a = j;
        this.f6545b = j8;
        this.f6546c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f6544a == cVar.f6544a && this.f6545b == cVar.f6545b && this.f6546c.equals(cVar.f6546c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6544a;
        long j8 = this.f6545b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f6546c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f6544a + ", maxAllowedDelay=" + this.f6545b + ", flags=" + this.f6546c + "}";
    }
}
