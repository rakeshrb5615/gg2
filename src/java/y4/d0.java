package y4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d0 extends x1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f6854a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f6855b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f6856c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6857d;

    public d0(FirebaseAuth firebaseAuth, boolean z9, l lVar, d dVar) {
        this.f6854a = z9;
        this.f6855b = lVar;
        this.f6856c = dVar;
        this.f6857d = firebaseAuth;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [y4.g, z4.w] */
    @Override // x1.b
    public final Task f(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z9 = this.f6854a;
        d dVar = this.f6856c;
        FirebaseAuth firebaseAuth = this.f6857d;
        return z9 ? firebaseAuth.e.zzb(firebaseAuth.a, (l) Preconditions.checkNotNull(this.f6855b), dVar, str, (z4.w) new g(firebaseAuth, 0)) : firebaseAuth.e.zza(firebaseAuth.a, dVar, str, new f(firebaseAuth));
    }
}
