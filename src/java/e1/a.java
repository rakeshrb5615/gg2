package e1;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import u7.l;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1296a = new k(1);

    @Override // u7.l
    public final Object invoke(Object obj) {
        String valueOf;
        byte[] bArr;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i = 0;
            for (byte b10 : (byte[]) value) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b10));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return v1.a.o(new StringBuilder("  "), ((e) entry.getKey()).f1304a, " = ", valueOf);
    }
}
