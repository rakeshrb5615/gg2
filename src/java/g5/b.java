package g5;

import j5.b0;
import java.io.File;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f1773a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1774b;

    /* renamed from: c  reason: collision with root package name */
    public final File f1775c;

    public b(b0 b0Var, String str, File file) {
        this.f1773a = b0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f1774b = str;
        this.f1775c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f1773a.equals(bVar.f1773a) && this.f1774b.equals(bVar.f1774b) && this.f1775c.equals(bVar.f1775c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1773a.hashCode() ^ 1000003) * 1000003) ^ this.f1774b.hashCode()) * 1000003) ^ this.f1775c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f1773a + ", sessionId=" + this.f1774b + ", reportFile=" + this.f1775c + "}";
    }
}
