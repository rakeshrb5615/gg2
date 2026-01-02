package x1;

import a5.z;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.firebase-auth-api.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import j6.o;
import j6.s;
import java.io.File;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class b {
    public static final File a(Context context, String str) {
        j.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public abstract Object b(l7.c cVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, l7.c cVar);

    public abstract Object d(Uri uri, l7.c cVar);

    public Task e(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        z zVar;
        boolean z9;
        o oVar = new o(24, false);
        oVar.f3275b = this;
        synchronized (firebaseAuth) {
            zVar = firebaseAuth.j;
        }
        if (zVar != null) {
            synchronized (zVar.f619a) {
                try {
                    zzahs zzahsVar = (zzahs) zVar.f621c;
                    z9 = zzahsVar != null && zzahsVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9) {
                return zVar.w(str, Boolean.FALSE, recaptchaAction).continueWithTask(oVar).continueWithTask(new s(str, zVar, recaptchaAction, oVar, 18));
            }
        }
        Task f9 = f(null);
        s sVar = new s(17, false);
        sVar.f3283c = recaptchaAction;
        sVar.f3284d = firebaseAuth;
        sVar.f3282b = str;
        sVar.f3285e = oVar;
        return f9.continueWithTask(sVar);
    }

    public abstract Task f(String str);
}
