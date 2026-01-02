package j6;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class m implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3270b;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i) {
        this.f3269a = i;
        this.f3270b = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        boolean z9;
        switch (this.f3269a) {
            case 0:
                z zVar = (z) obj;
                if (!this.f3270b.e.b() || zVar.f3313h.a() == null) {
                    return;
                }
                synchronized (zVar) {
                    z9 = zVar.f3312g;
                }
                if (z9) {
                    return;
                }
                zVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f3270b;
                CloudMessage cloudMessage = (CloudMessage) obj;
                o oVar = FirebaseMessaging.k;
                if (cloudMessage != null) {
                    a.a.J(cloudMessage.getIntent());
                    ((Rpc) firebaseMessaging.c.f621c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f, new m(firebaseMessaging, 1));
                    return;
                }
                return;
        }
    }
}
