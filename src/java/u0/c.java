package u0;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import u7.l;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class c extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f6033b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HiddenActivity hiddenActivity, int i, int i9) {
        super(1);
        this.f6032a = i9;
        this.f6033b = hiddenActivity;
        this.f6034c = i;
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        switch (this.f6032a) {
            case 0:
                HiddenActivity hiddenActivity = this.f6033b;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                try {
                    hiddenActivity.b = true;
                    hiddenActivity.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.f6034c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e9) {
                    ResultReceiver resultReceiver = hiddenActivity.a;
                    j.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e9.getMessage());
                }
                return h7.l.f2236a;
            case 1:
                HiddenActivity hiddenActivity2 = this.f6033b;
                SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                try {
                    hiddenActivity2.b = true;
                    hiddenActivity2.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), this.f6034c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.a;
                    j.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
                }
                return h7.l.f2236a;
            case 2:
                HiddenActivity hiddenActivity3 = this.f6033b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                j.e(pendingIntent, "result");
                try {
                    hiddenActivity3.b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f6034c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.a;
                    j.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e11.getMessage());
                }
                return h7.l.f2236a;
            default:
                HiddenActivity hiddenActivity4 = this.f6033b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f6034c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e12) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.a;
                    j.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e12.getMessage());
                }
                return h7.l.f2236a;
        }
    }
}
