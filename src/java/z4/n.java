package z4;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.firebase-auth-api.zzaao;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7357a = new Logger("GetTokenResultFactory", new String[0]);

    public static j6.o a(String str) {
        Object hashMap;
        try {
            hashMap = m.b(str);
        } catch (zzaao e9) {
            f7357a.e("Error parsing token claims", e9, new Object[0]);
            hashMap = new HashMap();
        }
        j6.o oVar = new j6.o(22, false);
        oVar.f3275b = hashMap;
        return oVar;
    }
}
