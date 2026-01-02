package a6;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f625a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f626b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f625a = str;
        this.f626b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f625a.equals(aVar.f625a) && this.f626b.equals(aVar.f626b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f625a.hashCode() ^ 1000003) * 1000003) ^ this.f626b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f625a + ", usedDates=" + this.f626b + "}";
    }
}
