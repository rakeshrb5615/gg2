package c5;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import b8.p;
import h.f;
import i7.h;
import j2.i;
import java.util.concurrent.TimeUnit;
import o5.e;
import org.json.JSONObject;
import x8.j;
import x8.y;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class c implements a3.a, e5.a, i, e, p5.a, t1.a, x5.a, y1.b {

    /* renamed from: a  reason: collision with root package name */
    public static c f932a;

    /* renamed from: b  reason: collision with root package name */
    public static c f933b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ c f934c = new Object();

    public c(View view) {
    }

    public static final void e(x8.d dVar) {
        f fVar = x8.d.f6626h;
        if (x8.d.i == null) {
            x8.d.i = new x8.d();
            Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        long nanoTime = System.nanoTime();
        long j = dVar.f6650c;
        boolean z9 = dVar.f6648a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i != 0 && z9) {
            dVar.f6632g = Math.min(j, dVar.c() - nanoTime) + nanoTime;
        } else if (i != 0) {
            dVar.f6632g = nanoTime + j;
        } else if (!z9) {
            throw new AssertionError();
        } else {
            dVar.f6632g = dVar.c();
        }
        f fVar2 = x8.d.f6626h;
        int i9 = fVar2.f2040b + 1;
        fVar2.f2040b = i9;
        x8.d[] dVarArr = (x8.d[]) fVar2.f2041c;
        if (i9 == dVarArr.length) {
            x8.d[] dVarArr2 = new x8.d[i9 * 2];
            h.a0(dVarArr, 0, dVarArr2, 0, 14);
            fVar2.f2041c = dVarArr2;
        }
        fVar2.e(i9, dVar);
        if (dVar.f6631f == 1) {
            x8.d.f6627k.signal();
        }
    }

    public static final boolean k(y yVar) {
        y yVar2 = y8.h.f6991f;
        j jVar = yVar.f6689a;
        int k9 = j.k(jVar, y8.c.f6975a);
        if (k9 == -1) {
            k9 = j.k(yVar.f6689a, y8.c.f6976b);
        }
        if (k9 != -1) {
            jVar = j.p(jVar, k9 + 1, 0, 2);
        } else if (yVar.d() != null && jVar.d() == 2) {
            jVar = j.f6643d;
        }
        return !p.l0(jVar.r(), ".class", true);
    }

    public static x8.d l() {
        f fVar = x8.d.f6626h;
        x8.d dVar = ((x8.d[]) fVar.f2041c)[1];
        if (dVar == null) {
            long nanoTime = System.nanoTime();
            x8.d.f6627k.await(x8.d.f6628l, TimeUnit.MILLISECONDS);
            if (((x8.d[]) fVar.f2041c)[1] != null || System.nanoTime() - nanoTime < x8.d.f6629m) {
                return null;
            }
            return x8.d.i;
        }
        long nanoTime2 = dVar.f6632g - System.nanoTime();
        if (nanoTime2 > 0) {
            x8.d.f6627k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        fVar.g(dVar);
        dVar.f6630e = 2;
        return dVar;
    }

    public static o5.c m(c cVar) {
        return new o5.c(System.currentTimeMillis() + 3600000, new o5.b(8), new o5.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // j2.i
    public void a() {
    }

    @Override // a3.a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // o5.e
    public o5.c c(c cVar, JSONObject jSONObject) {
        return m(cVar);
    }

    @Override // t1.a
    public CharSequence d(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return ((Preference) editTextPreference).a.getString(2131952196);
        }
        return null;
    }

    @Override // p5.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // e5.a
    public void g(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // j2.i
    public void h(String str) {
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
    }
}
