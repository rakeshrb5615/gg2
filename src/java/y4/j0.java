package y4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class j0 extends x1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6880b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f6881c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f6882d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f6883e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6884f;

    public j0(FirebaseAuth firebaseAuth, String str, boolean z9, l lVar, String str2, String str3) {
        this.f6879a = str;
        this.f6880b = z9;
        this.f6881c = lVar;
        this.f6882d = str2;
        this.f6883e = str3;
        this.f6884f = firebaseAuth;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [y4.g, z4.w] */
    @Override // x1.b
    public final Task f(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f6879a;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z9 = this.f6880b;
        FirebaseAuth firebaseAuth = this.f6884f;
        if (z9) {
            return firebaseAuth.e.zzb(firebaseAuth.a, (l) Preconditions.checkNotNull(this.f6881c), this.f6879a, this.f6882d, this.f6883e, str, (z4.w) new g(firebaseAuth, 0));
        }
        return firebaseAuth.e.zzb(firebaseAuth.a, this.f6879a, this.f6882d, this.f6883e, str, new f(firebaseAuth));
    }
}
