package y4;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f implements z4.y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6862a;

    public f(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f6862a = firebaseAuth;
    }

    @Override // z4.y
    public final void a(zzahv zzahvVar, l lVar) {
        Preconditions.checkNotNull(zzahvVar);
        Preconditions.checkNotNull(lVar);
        z4.e eVar = (z4.e) lVar;
        eVar.getClass();
        eVar.f7325a = (zzahv) Preconditions.checkNotNull(zzahvVar);
        FirebaseAuth firebaseAuth = this.f6862a;
        firebaseAuth.getClass();
        FirebaseAuth.c(firebaseAuth, lVar, zzahvVar, true, false);
    }
}
