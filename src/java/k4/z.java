package k4;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final String f3402a;

    public z(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f3402a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e9) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e9);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return g2.g.e(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", c(this.f3402a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f3402a, str, objArr));
        }
    }
}
