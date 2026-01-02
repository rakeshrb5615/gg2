package y4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h0 extends x1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f6873a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f6874b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z4.d f6875c;

    public h0(z4.d dVar, l lVar, d dVar2) {
        this.f6873a = lVar;
        this.f6874b = dVar2;
        this.f6875c = dVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [y4.g, z4.w] */
    @Override // x1.b
    public final Task f(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        z4.d dVar = this.f6875c;
        return ((FirebaseAuth) dVar).e.zza(((FirebaseAuth) dVar).a, this.f6873a, this.f6874b, str, (z4.w) new g(dVar, 0));
    }
}
