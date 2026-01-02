package v3;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class f implements i5.c, l8.a, o5.e, p5.a, t1.a, a5.f, t2.b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile f f6186a;

    /* renamed from: b  reason: collision with root package name */
    public static f f6187b;

    /* renamed from: c  reason: collision with root package name */
    public static f f6188c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ f f6189d = new Object();

    public f(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new c5.c(view);
        } else {
            new c5.c(view);
        }
    }

    public static x8.j h(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i9 = i * 2;
                bArr[i] = (byte) (y8.b.a(str.charAt(i9 + 1)) + (y8.b.a(str.charAt(i9)) << 4));
            }
            return new x8.j(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static x8.j i(String str) {
        kotlin.jvm.internal.j.e(str, "<this>");
        byte[] bytes = str.getBytes(b8.a.f766a);
        kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
        x8.j jVar = new x8.j(bytes);
        jVar.f6646c = str;
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
        if (r10 != (-1)) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(i1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f.m(i1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // i5.c
    public void a() {
    }

    @Override // i5.c
    public String b() {
        return null;
    }

    @Override // o5.e
    public o5.c c(c5.c cVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        o5.b bVar = jSONObject.has("session") ? new o5.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new o5.b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new o5.c(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), bVar, new o5.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // t1.a
    public CharSequence d(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return ((Preference) listPreference).a.getString(2131952196);
        }
        return null;
    }

    @Override // a5.f
    public /* synthetic */ Object e(a5.z zVar) {
        return AnalyticsConnectorRegistrar.zza(zVar);
    }

    @Override // p5.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i9 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i12 = i9 - intValue;
                if (i9 + i12 <= stackTraceElementArr.length) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (stackTraceElementArr[intValue + i13].equals(stackTraceElementArr[i9 + i13])) {
                        }
                    }
                    int intValue2 = i9 - num.intValue();
                    if (i11 < 10) {
                        System.arraycopy(stackTraceElementArr, i9, stackTraceElementArr2, i10, intValue2);
                        i10 += intValue2;
                        i11++;
                    }
                    i = (intValue2 - 1) + i9;
                    hashMap.put(stackTraceElement, Integer.valueOf(i9));
                    i9 = i + 1;
                }
            }
            stackTraceElementArr2[i10] = stackTraceElementArr[i9];
            i10++;
            i11 = 1;
            i = i9;
            hashMap.put(stackTraceElement, Integer.valueOf(i9));
            i9 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i10);
        return i10 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // i5.c
    public void g(long j, String str) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a3.a, java.lang.Object] */
    @Override // g7.a
    public Object get() {
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(o2.d.f5006a, new x2.c(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(o2.d.f5008c, new x2.c(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(x2.d.f6548b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(o2.d.f5007b, new x2.c(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= o2.d.values().length) {
                            new HashMap();
                            return new x2.b(obj, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    public boolean j() {
        return this instanceof g;
    }

    public void k(float f9, float f10, float f11, z zVar) {
        zVar.c(f9, 0.0f);
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean n(CharSequence charSequence) {
        return charSequence instanceof o0.d;
    }
}
