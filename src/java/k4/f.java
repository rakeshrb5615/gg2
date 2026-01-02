package k4;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final z f3391a = new z("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) {
        String str;
        if (signatureArr == null || (r1 = signatureArr.length) == 0) {
            Object[] objArr = new Object[0];
            z zVar = f3391a;
            zVar.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", z.c(zVar.f3402a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
        } else {
            for (Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    str = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException unused) {
                    str = "";
                }
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                    return true;
                }
                String str2 = Build.TAGS;
                if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
