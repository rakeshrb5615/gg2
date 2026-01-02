package y4;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzal;
import java.util.HashMap;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f6841c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f6842a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6843b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        zzal.zza(hashMap);
    }

    public b(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 == null || a11 == null || a12 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        Preconditions.checkNotEmpty(a10);
        this.f6842a = Preconditions.checkNotEmpty(a11);
        Preconditions.checkNotEmpty(a12);
        a(str, "continueUrl");
        a(str, "lang");
        this.f6843b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
