package n0;

import android.util.Base64;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4380a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4381b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4382c;

    /* renamed from: d  reason: collision with root package name */
    public final List f4383d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4384e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f4380a = str;
        str2.getClass();
        this.f4381b = str2;
        this.f4382c = str3;
        list.getClass();
        this.f4383d = list;
        this.f4384e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4380a + ", mProviderPackage: " + this.f4381b + ", mQuery: " + this.f4382c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f4383d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i9 = 0; i9 < list2.size(); i9++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
