package d4;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import g1.u;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class l implements g1.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1096a;

    /* renamed from: b  reason: collision with root package name */
    public String f1097b;

    public static void a(b8.g gVar, o5.f fVar) {
        String str = fVar.f5029a;
        if (str != null) {
            gVar.n("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        gVar.n("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        gVar.n("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        gVar.n("Accept", "application/json");
        String str2 = fVar.f5030b;
        if (str2 != null) {
            gVar.n("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = fVar.f5031c;
        if (str3 != null) {
            gVar.n("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = fVar.f5032d;
        if (str4 != null) {
            gVar.n("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = fVar.f5033e.c().f1776a;
        if (str5 != null) {
            gVar.n("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(o5.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f5036h);
        hashMap.put("display_version", fVar.f5035g);
        hashMap.put("source", Integer.toString(fVar.i));
        String str = fVar.f5034f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static String i(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e9) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e9);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return g2.g.e(str, " : ", str2);
    }

    public static String j(String str, String str2, Object... objArr) {
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

    public JSONObject c(h.f fVar) {
        String str = this.f1097b;
        int i = fVar.f2040b;
        d5.d dVar = d5.d.f1126a;
        dVar.c("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (dVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = (String) fVar.f2041c;
        try {
            return new JSONObject(str3);
        } catch (Exception e9) {
            dVar.d("Failed to parse settings JSON from " + str, e9);
            dVar.d("Settings response " + str3, null);
            return null;
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", j(this.f1097b, str, objArr));
        }
    }

    @Override // g1.n
    public boolean e(CharSequence charSequence, int i, int i9, u uVar) {
        if (TextUtils.equals(charSequence.subSequence(i, i9), this.f1097b)) {
            uVar.f1683c = (uVar.f1683c & 3) | 4;
            return false;
        }
        return true;
    }

    public void f(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", j(this.f1097b, str, objArr), remoteException);
        }
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", i(this.f1097b, str, objArr));
        }
    }

    @Override // g1.n
    public Object getResult() {
        return this;
    }

    public void h(String str, Object... objArr) {
        switch (this.f1096a) {
            case 0:
                if (Log.isLoggable("PlayCore", 4)) {
                    Log.i("PlayCore", j(this.f1097b, str, objArr));
                    return;
                }
                return;
            default:
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", i(this.f1097b, str, objArr));
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f1096a) {
            case 4:
                return "<" + this.f1097b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(String str, int i, boolean z9) {
        this.f1096a = i;
        this.f1097b = str;
    }

    public l(String str, int i) {
        this.f1096a = i;
        switch (i) {
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                int myUid = Process.myUid();
                int myPid = Process.myPid();
                this.f1097b = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
                return;
            default:
                int myUid2 = Process.myUid();
                int myPid2 = Process.myPid();
                this.f1097b = ("UID: [" + myUid2 + "]  PID: [" + myPid2 + "] ").concat(str);
                return;
        }
    }

    public l(String str, c5.c cVar) {
        this.f1096a = 5;
        if (str != null) {
            this.f1097b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
