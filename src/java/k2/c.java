package k2;

import a2.k1;
import a2.q1;
import a2.r0;
import a2.u1;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.j0;
import c4.l;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d4.r;
import g1.n;
import g1.u;
import g1.v;
import g1.x;
import h.c0;
import i2.o0;
import j2.f;
import j2.i;
import j2.k;
import j5.t1;
import j6.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l2.a0;
import l2.z;
import m.b0;
import m.m;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilJvmKt;
import org.json.JSONException;
import org.json.JSONObject;
import q0.g0;
import q0.t0;
import r.h;
import r.j;
import u.e;
import z8.d;
import z8.g;
import z8.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class c implements d4.c, OnCompleteListener, n, SuccessContinuation, g8.c, g, i {

    /* renamed from: d  reason: collision with root package name */
    public static c f3361d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3362a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3363b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3364c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f3362a = i;
        this.f3363b = obj;
        this.f3364c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k2.c g(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            k2.c r2 = new k2.c     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 10
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.g(android.content.Context):k2.c");
    }

    public static synchronized c p() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f3361d == null) {
                    f3361d = new c(0);
                }
                cVar = f3361d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static int q(int i, int i9) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            i10++;
            if (i10 == i9) {
                i11++;
                i10 = 0;
            } else if (i10 > i9) {
                i11++;
                i10 = 1;
            }
        }
        return i10 + 1 > i9 ? i11 + 1 : i11;
    }

    public e6.b A() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(o());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = e6.b.f1319h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i9 = e.d(5)[optInt];
        if (i9 != 0) {
            byte b11 = (byte) (((byte) (b10 | 2)) | 1);
            if (b11 != 3 || i9 == 0) {
                StringBuilder sb = new StringBuilder();
                if (i9 == 0) {
                    sb.append(" registrationStatus");
                }
                if ((b11 & 1) == 0) {
                    sb.append(" expiresInSecs");
                }
                if ((b11 & 2) == 0) {
                    sb.append(" tokenCreationEpochInSecs");
                }
                throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
            }
            return new e6.b(optString, i9, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void B() {
        try {
            ((FileLock) this.f3364c).release();
            ((FileChannel) this.f3363b).close();
        } catch (IOException e9) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e9);
        }
    }

    public void C(k1 k1Var) {
        u1 u1Var = (u1) ((j) this.f3363b).get(k1Var);
        if (u1Var == null) {
            return;
        }
        u1Var.f512a &= -2;
    }

    public void D(k1 k1Var) {
        r.g gVar = (r.g) this.f3364c;
        int g3 = gVar.g() - 1;
        while (true) {
            if (g3 < 0) {
                break;
            } else if (k1Var == gVar.h(g3)) {
                Object[] objArr = gVar.f5465c;
                Object obj = objArr[g3];
                Object obj2 = h.f5467a;
                if (obj != obj2) {
                    objArr[g3] = obj2;
                    gVar.f5463a = true;
                }
            } else {
                g3--;
            }
        }
        u1 u1Var = (u1) ((j) this.f3363b).remove(k1Var);
        if (u1Var != null) {
            u1Var.f512a = 0;
            u1Var.f513b = null;
            u1Var.f514c = null;
            u1.f511d.c(u1Var);
        }
    }

    @Override // j2.i
    public void a() {
        a0 a0Var = (a0) this.f3364c;
        j0 j0Var = a0Var.Y1;
        if (j0Var == null || a0Var.f3540a == null) {
            return;
        }
        j0Var.runOnUiThread(new z(this, (String) this.f3363b, 1));
    }

    @Override // z8.g
    public void b(d dVar, Throwable th) {
        ((i) this.f3363b).h("Failed to fetch weather data: " + th.getMessage());
    }

    @Override // z8.g
    public void d(d dVar, q0 q0Var) {
        Throwable th;
        String str;
        Throwable th2;
        Object obj;
        long j;
        long j8;
        String str2;
        i iVar = (i) this.f3363b;
        j2.j jVar = (j2.j) this.f3364c;
        String str3 = jVar.f2848v;
        String str4 = jVar.f2847u;
        String str5 = jVar.f2849w;
        String str6 = jVar.A;
        Context context = jVar.f2830a;
        SharedPreferences sharedPreferences = jVar.f2831b;
        if (!q0Var.f7556a.v || (obj = q0Var.f7557b) == null) {
            try {
                ResponseBody responseBody = q0Var.f7558c;
                if (responseBody != null) {
                    x8.i i = responseBody.i();
                    try {
                        String v2 = i.v(_UtilJvmKt.e(i, Internal.a(responseBody.f())));
                        try {
                            i.close();
                            th2 = null;
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                        th = th2;
                        str = v2;
                    } catch (Throwable th4) {
                        if (i != null) {
                            try {
                                i.close();
                            } catch (Throwable th5) {
                                q4.b.a(th4, th5);
                            }
                        }
                        th = th4;
                        str = null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    try {
                        iVar.h(new JSONObject(str).getJSONObject("error").getString("message"));
                    } catch (JSONException e9) {
                        Log.e("", "Invalid error JSON: " + str, e9);
                    }
                } else {
                    Log.w("", "Error body is null");
                }
                if (responseBody != null) {
                    responseBody.close();
                    return;
                }
                return;
            } catch (IOException e10) {
                Log.e("", "Error reading error body", e10);
                return;
            }
        }
        k kVar = (k) obj;
        long d9 = kVar.a().d() * 1000;
        long currentTimeMillis = (System.currentTimeMillis() - d9) / 60000;
        if (currentTimeMillis < 0) {
            j = d9;
            j8 = 0;
        } else {
            j = d9;
            j8 = currentTimeMillis;
        }
        String d10 = jVar.d(j8);
        int b10 = o0.c(context).b();
        boolean z9 = c4.b.H(b10) || c4.b.I(b10) || c4.b.J(b10);
        if (sharedPreferences.getBoolean(str6, false) && z9) {
            sharedPreferences.edit().putString("lastProviderUpdate", d10).apply();
            sharedPreferences.edit().putString("lastUpdate", kVar.a().c()).apply();
            sharedPreferences.edit().putLong("lastEpoch", j).apply();
        }
        sharedPreferences.edit().remove(str5).apply();
        sharedPreferences.edit().remove(str4).apply();
        sharedPreferences.edit().remove(str3).apply();
        String str7 = jVar.f2837h;
        String str8 = jVar.f2836g;
        String str9 = jVar.f2839l;
        String str10 = jVar.f2838k;
        String str11 = jVar.j;
        String str12 = jVar.i;
        String str13 = jVar.f2843p;
        String str14 = jVar.f2835f;
        String str15 = jVar.f2834e;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        LocalDate now = LocalDate.now(ZoneId.systemDefault());
        f c9 = kVar.c();
        if (c9 != null) {
            str2 = str9;
            edit.putString(str4, String.valueOf(c9.a()));
            edit.putString(str3, String.valueOf(c9.b()));
            edit.putString(str5, c9.c() + ", " + c9.d());
        } else {
            str2 = str9;
        }
        j2.a a10 = ((j2.e) kVar.b().a().get(0)).a();
        if (a10 != null) {
            c4.b.P(sharedPreferences, str15, j2.j.e(a10.e()));
            c4.b.P(sharedPreferences, str14, j2.j.e(a10.f()));
        }
        edit.apply();
        if (!sharedPreferences.getBoolean(str6, false) || kVar.a() == null) {
            edit.putString(str13, sharedPreferences.getString("weatherSaved", context.getString(2131951809)));
        } else {
            edit.putString(str13, kVar.a().b().a());
            edit.putString("weatherSaved", kVar.a().b().a());
            edit.putString(jVar.q, String.valueOf(kVar.a().a()));
            edit.putString(jVar.f2844r, String.valueOf(kVar.a().g()));
            edit.putString(jVar.f2845s, String.valueOf(kVar.a().f()));
            edit.putString(jVar.f2846t, String.valueOf(kVar.a().e()));
            Locale build = new Locale.Builder().setLanguage("en").setRegion("US").build();
            Calendar calendar = Calendar.getInstance();
            edit.putFloat(jVar.f2851y, Float.parseFloat(new SimpleDateFormat("dd", build).format(calendar.getTime())));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM yyyy, HH:mm", build);
            edit.putString(jVar.f2850x, simpleDateFormat.format(calendar.getTime()));
            edit.putString(jVar.f2852z, simpleDateFormat.format(calendar.getTime()));
            edit.apply();
        }
        j2.a a11 = ((j2.e) kVar.b().a().get(0)).a();
        edit.putString(jVar.f2841n, a11.b());
        edit.putString(jVar.f2842o, a11.a());
        String string = sharedPreferences.getString("astro_last_update_date", null);
        LocalDate parse = string != null ? LocalDate.parse(string) : null;
        if (parse == null || !parse.isEqual(now)) {
            if (parse == null || !parse.plusDays(1L).isEqual(now)) {
                String str16 = str2;
                if (kVar.b() != null && kVar.b().a().size() >= 3) {
                    j2.a a12 = ((j2.e) kVar.b().a().get(0)).a();
                    edit.putFloat(str8, j2.j.e(a12.c()));
                    edit.putFloat(str7, j2.j.e(a12.d()));
                    j2.a a13 = ((j2.e) kVar.b().a().get(1)).a();
                    edit.putFloat(str12, j2.j.e(a13.c()));
                    edit.putFloat(str11, j2.j.e(a13.d()));
                    j2.a a14 = ((j2.e) kVar.b().a().get(2)).a();
                    edit.putFloat(str10, j2.j.e(a14.c()));
                    edit.putFloat(str16, j2.j.e(a14.d()));
                    j2.a a15 = ((j2.e) kVar.b().a().get(0)).a();
                    c4.b.P(sharedPreferences, str15, j2.j.e(a15.e()));
                    c4.b.P(sharedPreferences, str14, j2.j.e(a15.f()));
                }
            } else {
                float f9 = sharedPreferences.getFloat(str12, 11.0f);
                float f10 = sharedPreferences.getFloat(str11, 23.0f);
                float f11 = sharedPreferences.getFloat(str10, 11.0f);
                String str17 = str2;
                float f12 = sharedPreferences.getFloat(str17, 23.0f);
                edit.putFloat(str8, f9);
                edit.putFloat(str7, f10);
                edit.putFloat(str12, f11);
                edit.putFloat(str11, f12);
                if (kVar.b() != null && kVar.b().a().size() >= 3) {
                    j2.a a16 = ((j2.e) kVar.b().a().get(2)).a();
                    edit.putFloat(str10, j2.j.e(a16.c()));
                    edit.putFloat(str17, j2.j.e(a16.d()));
                }
            }
            edit.putString("astro_last_update_date", now.toString());
            edit.apply();
        }
        kVar.a().getClass();
        iVar.a();
    }

    @Override // g1.n
    public boolean e(CharSequence charSequence, int i, int i9, u uVar) {
        if ((uVar.f1683c & 4) > 0) {
            return true;
        }
        if (((x) this.f3363b) == null) {
            this.f3363b = new x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((a6.e) this.f3364c).getClass();
        ((x) this.f3363b).setSpan(new v(uVar), i, i9, 33);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // g8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(g8.d r7, n7.c r8) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.f(g8.d, n7.c):java.lang.Object");
    }

    @Override // g1.n
    public Object getResult() {
        return (x) this.f3363b;
    }

    @Override // j2.i
    public void h(String str) {
        a0 a0Var = (a0) this.f3364c;
        j0 j0Var = a0Var.Y1;
        if (j0Var == null || a0Var.f3540a == null) {
            return;
        }
        j0Var.runOnUiThread(new z(this, str, 0));
    }

    public void i(k1 k1Var, a2.o0 o0Var) {
        j jVar = (j) this.f3363b;
        u1 u1Var = (u1) jVar.get(k1Var);
        if (u1Var == null) {
            u1Var = u1.a();
            jVar.put(k1Var, u1Var);
        }
        u1Var.f514c = o0Var;
        u1Var.f512a |= 8;
    }

    public void j() {
        int[] iArr = (int[]) this.f3363b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f3364c = null;
    }

    public void k() {
        String str = (String) this.f3363b;
        try {
            m5.c cVar = (m5.c) this.f3364c;
            cVar.getClass();
            new File((File) cVar.f4021d, str).createNewFile();
        } catch (IOException e9) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e9);
        }
    }

    public void l(int i) {
        int[] iArr = (int[]) this.f3363b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f3363b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f3363b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f3363b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void m(final MainActivity mainActivity, final Context context, j2.j jVar, final boolean z9) {
        if (((j2.j) this.f3364c) == null) {
            this.f3364c = jVar;
        }
        final SharedPreferences z10 = t1.z(context);
        m6.b bVar = (m6.b) this.f3363b;
        n6.i iVar = bVar.f4031e;
        long j = iVar.f4933h.f4962a.getLong("minimum_fetch_interval_in_seconds", n6.i.j);
        HashMap hashMap = new HashMap(iVar.i);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        iVar.f4931f.b().continueWithTask(iVar.f4928c, new d5.a(iVar, j, hashMap)).onSuccessTask(b5.j.f746a, new l4.h(2)).onSuccessTask(bVar.f4028b, new m6.a(bVar)).addOnCompleteListener(new OnCompleteListener() { // from class: k2.a
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0119, code lost:
                if (r7.matcher(r6).matches() != false) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onComplete(com.google.android.gms.tasks.Task r13) {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: k2.a.onComplete(com.google.android.gms.tasks.Task):void");
            }
        });
    }

    public View n(int i, int i9, int i10, int i11) {
        View u9;
        a2.t1 t1Var = (a2.t1) this.f3364c;
        r0 r0Var = (r0) this.f3363b;
        int d9 = r0Var.d();
        int c9 = r0Var.c();
        int i12 = i9 > i ? 1 : -1;
        View view = null;
        while (i != i9) {
            switch (r0Var.f454a) {
                case 0:
                    u9 = r0Var.f455b.u(i);
                    break;
                default:
                    u9 = r0Var.f455b.u(i);
                    break;
            }
            int b10 = r0Var.b(u9);
            int a10 = r0Var.a(u9);
            t1Var.f501b = d9;
            t1Var.f502c = c9;
            t1Var.f503d = b10;
            t1Var.f504e = a10;
            if (i10 != 0) {
                t1Var.f500a = i10;
                if (t1Var.a()) {
                    return u9;
                }
            }
            if (i11 != 0) {
                t1Var.f500a = i11;
                if (t1Var.a()) {
                    view = u9;
                }
            }
            i += i12;
        }
        return view;
    }

    public File o() {
        if (((File) this.f3363b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f3363b) == null) {
                        q4.f fVar = (q4.f) this.f3364c;
                        fVar.a();
                        File filesDir = fVar.f5386a.getFilesDir();
                        this.f3363b = new File(filesDir, "PersistedInstallation." + ((q4.f) this.f3364c).f() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f3363b;
    }

    public void onComplete(Task task) {
        switch (this.f3362a) {
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                r rVar = (r) this.f3363b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3364c;
                synchronized (rVar.f1113f) {
                    rVar.f1112e.remove(taskCompletionSource);
                }
                return;
            case 25:
                i4.h hVar = (i4.h) this.f3363b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f3364c;
                synchronized (hVar.f2687f) {
                    hVar.f2686e.remove(taskCompletionSource2);
                }
                return;
            default:
                k4.d dVar = (k4.d) this.f3363b;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f3364c;
                synchronized (dVar.f3384f) {
                    dVar.f3383e.remove(taskCompletionSource3);
                }
                return;
        }
    }

    public void r(e6.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f1320a);
            jSONObject.put("Status", e.c(bVar.f1321b));
            jSONObject.put("AuthToken", bVar.f1322c);
            jSONObject.put("RefreshToken", bVar.f1323d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f1325f);
            jSONObject.put("ExpiresInSecs", bVar.f1324e);
            jSONObject.put("FisError", bVar.f1326g);
            q4.f fVar = (q4.f) this.f3364c;
            fVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f5386a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(o())) {
                return;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public void s() {
        ((SparseIntArray) this.f3363b).clear();
    }

    public boolean t(View view) {
        a2.t1 t1Var = (a2.t1) this.f3364c;
        r0 r0Var = (r0) this.f3363b;
        int d9 = r0Var.d();
        int c9 = r0Var.c();
        int b10 = r0Var.b(view);
        int a10 = r0Var.a(view);
        t1Var.f501b = d9;
        t1Var.f502c = c9;
        t1Var.f503d = b10;
        t1Var.f504e = a10;
        t1Var.f500a = 24579;
        return t1Var.a();
    }

    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        g5.n nVar = (g5.n) this.f3364c;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean booleanValue = bool.booleanValue();
            g5.v vVar = nVar.f1808b;
            if (booleanValue) {
                vVar.f1861f.trySetResult((Object) null);
                return ((Task) this.f3363b).onSuccessTask(nVar.f1811e.f2217a, new l6.c(this, 20));
            }
            vVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        m5.c cVar = nVar.f1813g;
        for (File file : m5.c.e(((File) cVar.f4021d).listFiles(g5.n.f1805r))) {
            file.delete();
        }
        m5.c cVar2 = ((m5.a) nVar.f1817m.f620b).f4014b;
        m5.a.a(m5.c.e(((File) cVar2.f4023f).listFiles()));
        m5.a.a(m5.c.e(((File) cVar2.f4024m).listFiles()));
        m5.a.a(m5.c.e(((File) cVar2.f4025n).listFiles()));
        nVar.q.trySetResult((Object) null);
        return Tasks.forResult((Object) null);
    }

    public void u(int i, int i9) {
        int[] iArr = (int[]) this.f3363b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i10 = i + i9;
        l(i10);
        int[] iArr2 = (int[]) this.f3363b;
        System.arraycopy(iArr2, i, iArr2, i10, (iArr2.length - i) - i9);
        Arrays.fill((int[]) this.f3363b, i, i10, -1);
        ArrayList arrayList = (ArrayList) this.f3364c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q1 q1Var = (q1) ((ArrayList) this.f3364c).get(size);
            int i11 = q1Var.f446a;
            if (i11 >= i) {
                q1Var.f446a = i11 + i9;
            }
        }
    }

    public void v(int i, int i9) {
        int[] iArr = (int[]) this.f3363b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i10 = i + i9;
        l(i10);
        int[] iArr2 = (int[]) this.f3363b;
        System.arraycopy(iArr2, i10, iArr2, i, (iArr2.length - i) - i9);
        int[] iArr3 = (int[]) this.f3363b;
        Arrays.fill(iArr3, iArr3.length - i9, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f3364c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q1 q1Var = (q1) ((ArrayList) this.f3364c).get(size);
            int i11 = q1Var.f446a;
            if (i11 >= i) {
                if (i11 < i10) {
                    ((ArrayList) this.f3364c).remove(size);
                } else {
                    q1Var.f446a = i11 - i9;
                }
            }
        }
    }

    public void w(l.a aVar) {
        s sVar = (s) this.f3363b;
        ((ActionMode.Callback) sVar.f3282b).onDestroyActionMode(sVar.f(aVar));
        c0 c0Var = (c0) this.f3364c;
        if (c0Var.C != null) {
            c0Var.f2007r.getDecorView().removeCallbacks(c0Var.D);
        }
        if (c0Var.B != null) {
            t0 t0Var = c0Var.E;
            if (t0Var != null) {
                t0Var.b();
            }
            t0 b10 = q0.q0.b(c0Var.B);
            b10.a(0.0f);
            c0Var.E = b10;
            b10.d(new h.s(this, 2));
        }
        c0Var.A = null;
        ViewGroup viewGroup = c0Var.H;
        WeakHashMap weakHashMap = q0.q0.f5172a;
        g0.c(viewGroup);
        c0Var.L();
    }

    public void x(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            e5.b bVar = "clx".equals(bundle2.getString("_o")) ? (b8.g) this.f3363b : (l6.c) this.f3364c;
            if (bVar == null) {
                return;
            }
            bVar.d(bundle2, string);
        }
    }

    public boolean y(l.a aVar, Menu menu) {
        ViewGroup viewGroup = ((c0) this.f3364c).H;
        WeakHashMap weakHashMap = q0.q0.f5172a;
        g0.c(viewGroup);
        s sVar = (s) this.f3363b;
        ActionMode.Callback callback = (ActionMode.Callback) sVar.f3282b;
        l.e f9 = sVar.f(aVar);
        j jVar = (j) sVar.f3285e;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) sVar.f3283c, (m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(f9, menu2);
    }

    public a2.o0 z(k1 k1Var, int i) {
        u1 u1Var;
        a2.o0 o0Var;
        j jVar = (j) this.f3363b;
        int e9 = jVar.e(k1Var);
        if (e9 >= 0 && (u1Var = (u1) jVar.j(e9)) != null) {
            int i9 = u1Var.f512a;
            if ((i9 & i) != 0) {
                int i10 = i9 & (~i);
                u1Var.f512a = i10;
                if (i == 4) {
                    o0Var = u1Var.f513b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    o0Var = u1Var.f514c;
                }
                if ((i10 & 12) == 0) {
                    jVar.h(e9);
                    u1Var.f512a = 0;
                    u1Var.f513b = null;
                    u1Var.f514c = null;
                    u1.f511d.c(u1Var);
                }
                return o0Var;
            }
        }
        return null;
    }

    @Override // d4.c
    public Object zza() {
        return new l(((c4.f) ((l6.c) this.f3363b).f3791b).f911a, (c4.m) ((d4.c) this.f3364c).zza());
    }

    public /* synthetic */ c(int i, boolean z9) {
        this.f3362a = i;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i, boolean z9) {
        this.f3362a = i;
        this.f3364c = obj;
        this.f3363b = obj2;
    }

    public c(h4.f fVar) {
        this.f3362a = 23;
        this.f3364c = new Handler(Looper.getMainLooper());
        this.f3363b = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [m6.g, java.lang.Object] */
    public c(int i) {
        this.f3362a = i;
        switch (i) {
            case 1:
                this.f3363b = new SparseIntArray();
                this.f3364c = new SparseIntArray();
                return;
            case 4:
                this.f3363b = new j(0);
                this.f3364c = new r.g();
                return;
            case 12:
                this.f3363b = Choreographer.getInstance();
                this.f3364c = Looper.myLooper();
                return;
            case 17:
                this.f3363b = new AtomicInteger();
                this.f3364c = new AtomicInteger();
                return;
            default:
                m6.b a10 = ((m6.j) q4.f.d().b(m6.j.class)).a();
                this.f3363b = a10;
                ?? obj = new Object();
                int[] iArr = n6.i.f4925k;
                obj.f4036a = 14400L;
                ?? obj2 = new Object();
                obj2.f4036a = obj.f4036a;
                Tasks.call(a10.f4028b, new j6.h(1, a10, obj2));
                return;
        }
    }

    public c(Context context) {
        this.f3362a = 9;
        this.f3363b = context;
        this.f3364c = null;
    }

    public c(q4.f fVar) {
        this.f3362a = 11;
        this.f3364c = fVar;
    }

    public c(c cVar) {
        this.f3362a = 8;
        Context context = (Context) cVar.f3363b;
        int d9 = g5.g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (d9 != 0) {
            this.f3363b = "Unity";
            String string = context.getResources().getString(d9);
            this.f3364c = string;
            String l5 = g2.g.l("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", l5, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f3363b = "Flutter";
                this.f3364c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f3363b = null;
                this.f3364c = null;
            }
        }
        this.f3363b = null;
        this.f3364c = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a2.t1, java.lang.Object] */
    public c(r0 r0Var) {
        this.f3362a = 3;
        this.f3363b = r0Var;
        ?? obj = new Object();
        obj.f500a = 0;
        this.f3364c = obj;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f3362a = 13;
        int size = arrayList.size();
        this.f3363b = new int[size];
        this.f3364c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f3363b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f3364c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public c(int i, int i9) {
        this.f3362a = 13;
        this.f3363b = new int[]{i, i9};
        this.f3364c = new float[]{0.0f, 1.0f};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, i1.a] */
    public c(EditText editText) {
        this.f3362a = 24;
        this.f3363b = editText;
        i1.i iVar = new i1.i(editText);
        this.f3364c = iVar;
        editText.addTextChangedListener(iVar);
        if (i1.a.f2256b == null) {
            synchronized (i1.a.f2255a) {
                try {
                    if (i1.a.f2256b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            i1.a.f2257c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, i1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        i1.a.f2256b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(i1.a.f2256b);
    }

    public c(int i, int i9, int i10) {
        this.f3362a = 13;
        this.f3363b = new int[]{i, i9, i10};
        this.f3364c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
