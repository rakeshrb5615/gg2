package y4;

import com.google.android.gms.common.logging.Logger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class u {
    private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, t tVar);

    public abstract void onVerificationCompleted(s sVar);

    public abstract void onVerificationFailed(q4.h hVar);
}
