package u0;

import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6030a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f6031b;

    public /* synthetic */ b(HiddenActivity hiddenActivity, int i) {
        this.f6030a = i;
        this.f6031b = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        int i = this.f6030a;
        String str = "CREATE_INTERRUPTED";
        String str2 = "GET_INTERRUPTED";
        HiddenActivity hiddenActivity = this.f6031b;
        switch (i) {
            case 0:
                int i9 = HiddenActivity.c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                str = ((exc instanceof ApiException) && v0.a.f6159a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                ResultReceiver resultReceiver = hiddenActivity.a;
                j.b(resultReceiver);
                hiddenActivity.a(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                return;
            case 1:
                int i10 = HiddenActivity.c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                str = ((exc instanceof ApiException) && v0.a.f6159a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "CREATE_UNKNOWN" : "CREATE_UNKNOWN";
                ResultReceiver resultReceiver2 = hiddenActivity.a;
                j.b(resultReceiver2);
                hiddenActivity.a(resultReceiver2, str, "During save password, found password failure response from one tap " + exc.getMessage());
                return;
            case 2:
                int i11 = HiddenActivity.c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                str2 = ((exc instanceof ApiException) && v0.a.f6159a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                ResultReceiver resultReceiver3 = hiddenActivity.a;
                j.b(resultReceiver3);
                hiddenActivity.a(resultReceiver3, str2, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                return;
            default:
                int i12 = HiddenActivity.c;
                j.e(hiddenActivity, "this$0");
                j.e(exc, "e");
                str2 = ((exc instanceof ApiException) && v0.a.f6159a.contains(Integer.valueOf(((ApiException) exc).getStatusCode()))) ? "GET_NO_CREDENTIALS" : "GET_NO_CREDENTIALS";
                ResultReceiver resultReceiver4 = hiddenActivity.a;
                j.b(resultReceiver4);
                hiddenActivity.a(resultReceiver4, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                return;
        }
    }
}
