package y4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g implements z4.j, z4.y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6865b;

    public g(FirebaseAuth firebaseAuth, int i) {
        this.f6864a = i;
        switch (i) {
            case 1:
                this.f6865b = firebaseAuth;
                return;
            default:
                Objects.requireNonNull(firebaseAuth);
                this.f6865b = firebaseAuth;
                return;
        }
    }

    @Override // z4.y
    public final void a(zzahv zzahvVar, l lVar) {
        switch (this.f6864a) {
            case 0:
                Preconditions.checkNotNull(zzahvVar);
                Preconditions.checkNotNull(lVar);
                z4.e eVar = (z4.e) lVar;
                eVar.getClass();
                eVar.f7325a = (zzahv) Preconditions.checkNotNull(zzahvVar);
                FirebaseAuth firebaseAuth = this.f6865b;
                firebaseAuth.getClass();
                FirebaseAuth.c(firebaseAuth, lVar, zzahvVar, true, true);
                return;
            default:
                FirebaseAuth firebaseAuth2 = this.f6865b;
                firebaseAuth2.getClass();
                FirebaseAuth.c(firebaseAuth2, lVar, zzahvVar, true, true);
                return;
        }
    }

    @Override // z4.j
    public final void zza(Status status) {
        switch (this.f6864a) {
            case 0:
                if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
                    this.f6865b.a();
                    return;
                }
                return;
            default:
                int statusCode = status.getStatusCode();
                if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
                    this.f6865b.a();
                    return;
                }
                return;
        }
    }
}
