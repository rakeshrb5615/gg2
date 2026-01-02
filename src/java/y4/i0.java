package y4;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6877a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f6878b;

    public i0(FirebaseAuth firebaseAuth) {
        this.f6878b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6877a) {
            case 0:
                FirebaseAuth firebaseAuth = this.f6878b;
                Iterator it = firebaseAuth.d.iterator();
                if (it.hasNext()) {
                    throw v1.a.e(it);
                }
                Iterator it2 = firebaseAuth.b.iterator();
                if (it2.hasNext()) {
                    throw v1.a.e(it2);
                }
                return;
            default:
                Iterator it3 = this.f6878b.c.iterator();
                if (it3.hasNext()) {
                    throw v1.a.e(it3);
                }
                return;
        }
    }

    public i0(FirebaseAuth firebaseAuth, h6.b bVar) {
        this.f6878b = firebaseAuth;
    }
}
