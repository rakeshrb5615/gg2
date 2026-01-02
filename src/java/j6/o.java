package j6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import n.h2;
import n.y0;
import n.y2;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r6.c1;
import r6.w0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class o implements h2, m.x, m.k, y0, OnSuccessListener, OnFailureListener, OnCanceledListener, t6.b, t2.b, q0.i, y1.b, Continuation, z8.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3274a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3275b;

    public /* synthetic */ o(int i, boolean z9) {
        this.f3274a = i;
    }

    public static boolean C(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String H(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public String A(String str) {
        Bundle bundle = (Bundle) this.f3275b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long[] B() {
        JSONArray u9 = u("gcm.n.vibrate_timings");
        if (u9 == null) {
            return null;
        }
        try {
            if (u9.length() > 1) {
                int length = u9.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = u9.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + u9 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle D() {
        Bundle bundle = (Bundle) this.f3275b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [o5.e] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public o5.c E(JSONObject jSONObject) {
        ?? r02;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        return r02.c((c5.c) this.f3275b, jSONObject);
    }

    public boolean F(int i, int i9, Bundle bundle) {
        return false;
    }

    public JSONObject G() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f3275b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(g5.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e9) {
                        e = e9;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        g5.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    g5.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            g5.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            g5.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // m.x
    public void a(m.m mVar, boolean z9) {
        if (mVar instanceof m.e0) {
            ((m.e0) mVar).f3837z.k().c(false);
        }
        m.x xVar = ((n.k) this.f3275b).f4180e;
        if (xVar != null) {
            xVar.a(mVar, z9);
        }
    }

    @Override // m.k
    public boolean b(m.m mVar, MenuItem menuItem) {
        n.n nVar = ((ActionMenuView) this.f3275b).F;
        return nVar != null && ((y2) nVar).f4366a.M.a(menuItem);
    }

    @Override // n.y0
    public void c(int i) {
    }

    @Override // n.h2
    public void d(m.m mVar, m.o oVar) {
        m.g gVar = (m.g) this.f3275b;
        Handler handler = gVar.f3845f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f3847n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((m.f) arrayList.get(i)).f3839b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i9 = i + 1;
        handler.postAtTime(new m.e(this, i9 < arrayList.size() ? (m.f) arrayList.get(i9) : null, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // z8.m
    public Object e(Object obj) {
        return Optional.ofNullable(((z8.m) this.f3275b).e((ResponseBody) obj));
    }

    @Override // m.k
    public void f(m.m mVar) {
        y2 y2Var = ((ActionMenuView) this.f3275b).A;
        if (y2Var != null) {
            y2Var.f(mVar);
        }
    }

    @Override // q0.i
    public boolean g(float f9) {
        if (f9 == 0.0f) {
            return false;
        }
        o();
        ((NestedScrollView) this.f3275b).j((int) f9);
        return true;
    }

    @Override // g7.a
    public Object get() {
        switch (this.f3274a) {
            case 12:
                return new w0((c1) ((t6.c) this.f3275b).get());
            default:
                return new b8.g((Context) ((k4.i) this.f3275b).f3396b, new Object(), new Object(), 15);
        }
    }

    @Override // m.x
    public boolean h(m.m mVar) {
        n.k kVar = (n.k) this.f3275b;
        if (mVar == kVar.f4178c) {
            return false;
        }
        ((m.e0) mVar).A.getClass();
        kVar.getClass();
        m.x xVar = kVar.f4180e;
        if (xVar != null) {
            return xVar.h(mVar);
        }
        return false;
    }

    @Override // y1.b
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // y1.b
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f3275b).setResultCode(i);
    }

    @Override // n.y0
    public void k(int i) {
    }

    @Override // q0.i
    public float l() {
        return -((NestedScrollView) this.f3275b).getVerticalScrollFactorCompat();
    }

    @Override // n.y0
    public void m(int i, float f9) {
    }

    @Override // n.h2
    public void n(m.m mVar, MenuItem menuItem) {
        ((m.g) this.f3275b).f3845f.removeCallbacksAndMessages(mVar);
    }

    @Override // q0.i
    public void o() {
        ((NestedScrollView) this.f3275b).d.abortAnimation();
    }

    public void onCanceled() {
        ((CountDownLatch) this.f3275b).countDown();
    }

    public void onFailure(Exception exc) {
        switch (this.f3274a) {
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                ((CountDownLatch) this.f3275b).countDown();
                return;
            default:
                if (exc instanceof q4.i) {
                    Logger logger = z4.i.f7350e;
                    logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
                    z4.i iVar = (z4.i) ((b5.l) this.f3275b).f752c;
                    int i = (int) iVar.f7352b;
                    iVar.f7352b = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * iVar.f7352b : i != 960 ? 30L : 960L;
                    iVar.f7351a = (iVar.f7352b * 1000) + DefaultClock.getInstance().currentTimeMillis();
                    logger.v(v1.a.g(iVar.f7351a, "Scheduling refresh for "), new Object[0]);
                    iVar.f7353c.postDelayed(iVar.f7354d, iVar.f7352b * 1000);
                    return;
                }
                return;
        }
    }

    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f3275b).countDown();
    }

    public r0.c p(int i) {
        return null;
    }

    public String q(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            v5.d dVar = (v5.d) this.f3275b;
            v5.e eVar = new v5.e(stringWriter, dVar.f6309a, dVar.f6310b, dVar.f6311c, dVar.f6312d);
            eVar.h(obj);
            eVar.j();
            eVar.f6314b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public r0.c r(int i) {
        return null;
    }

    public boolean s(String str) {
        String A = A(str);
        return "1".equals(A) || Boolean.parseBoolean(A);
    }

    public Integer t(String str) {
        String A = A(str);
        if (TextUtils.isEmpty(A)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + H(str) + "(" + A + ") into an int");
            return null;
        }
    }

    public Object then(Task task) {
        switch (this.f3274a) {
            case 24:
                x1.b bVar = (x1.b) this.f3275b;
                if (task.isSuccessful()) {
                    return bVar.f((String) task.getResult());
                }
                String message = ((Exception) Preconditions.checkNotNull(task.getException())).getMessage();
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message + "\n\n Failing open with a fake token.");
                return bVar.f("NO_RECAPTCHA");
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f3275b);
                }
                Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
                if (exc instanceof z4.q) {
                    if (Log.isLoggable("RecaptchaHandler", 4)) {
                        String message2 = exc.getMessage();
                        Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + message2);
                    }
                    return Tasks.forResult("");
                }
                return Tasks.forException(exc);
        }
    }

    public JSONArray u(String str) {
        String A = A(str);
        if (TextUtils.isEmpty(A)) {
            return null;
        }
        try {
            return new JSONArray(A);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + H(str) + ": " + A + ", falling back to default");
            return null;
        }
    }

    public int[] v() {
        JSONArray u9 = u("gcm.n.light_settings");
        if (u9 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (u9.length() == 3) {
                int parseColor = Color.parseColor(u9.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = u9.optInt(1);
                    iArr[2] = u9.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e9) {
            Log.w("NotificationParams", "LightSettings is invalid: " + u9 + ". " + e9.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + u9 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] w(String str) {
        JSONArray u9 = u(str.concat("_loc_args"));
        if (u9 == null) {
            return null;
        }
        int length = u9.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = u9.optString(i);
        }
        return strArr;
    }

    public String x(String str) {
        return A(str.concat("_loc_key"));
    }

    public Long y() {
        String A = A("gcm.n.event_time");
        if (TextUtils.isEmpty(A)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + H("gcm.n.event_time") + "(" + A + ") into a long");
            return null;
        }
    }

    public String z(String str, Resources resources, String str2) {
        String A = A(str2);
        if (TextUtils.isEmpty(A)) {
            String x9 = x(str2);
            if (TextUtils.isEmpty(x9)) {
                return null;
            }
            int identifier = resources.getIdentifier(x9, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", H(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            Object[] w8 = w(str2);
            if (w8 == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, w8);
            } catch (MissingFormatArgumentException e9) {
                Log.w("NotificationParams", "Missing format argument for " + H(str2) + ": " + Arrays.toString(w8) + " Default value will be used.", e9);
                return null;
            }
        }
        return A;
    }

    public /* synthetic */ o(Object obj, int i) {
        this.f3274a = i;
        this.f3275b = obj;
    }

    public o(a5.z zVar, RecaptchaAction recaptchaAction) {
        this.f3274a = 25;
        this.f3275b = recaptchaAction;
        Objects.requireNonNull(zVar);
    }

    public o(m5.c cVar) {
        this.f3274a = 8;
        this.f3275b = new File((File) cVar.f4021d, "com.crashlytics.settings.json");
    }

    public o(Context context) {
        boolean isEmpty;
        this.f3274a = 1;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3275b = sharedPreferences;
        File file = new File(e0.c.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e9.getMessage());
            }
        }
    }

    public o(Bundle bundle) {
        this.f3274a = 0;
        if (bundle != null) {
            this.f3275b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public o(int i) {
        this.f3274a = i;
        switch (i) {
            case 11:
                this.f3275b = new r0.d(this);
                return;
            case 17:
                this.f3275b = new ConcurrentHashMap(16);
                return;
            default:
                this.f3275b = new CountDownLatch(1);
                return;
        }
    }
}
