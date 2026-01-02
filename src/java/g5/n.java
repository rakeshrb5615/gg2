package g5;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j5.b0;
import j5.j0;
import j5.k0;
import j5.k1;
import j5.l1;
import j5.m1;
import j5.m2;
import j5.n1;
import j5.n2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class n {

    /* renamed from: r  reason: collision with root package name */
    public static final h f1805r = new h(1);

    /* renamed from: s  reason: collision with root package name */
    public static final Charset f1806s = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f1807a;

    /* renamed from: b  reason: collision with root package name */
    public final v f1808b;

    /* renamed from: c  reason: collision with root package name */
    public final k2.c f1809c;

    /* renamed from: d  reason: collision with root package name */
    public final m5.c f1810d;

    /* renamed from: e  reason: collision with root package name */
    public final h5.f f1811e;

    /* renamed from: f  reason: collision with root package name */
    public final y f1812f;

    /* renamed from: g  reason: collision with root package name */
    public final m5.c f1813g;

    /* renamed from: h  reason: collision with root package name */
    public final a f1814h;
    public final i5.e i;
    public final d5.b j;

    /* renamed from: k  reason: collision with root package name */
    public final e5.a f1815k;

    /* renamed from: l  reason: collision with root package name */
    public final k f1816l;

    /* renamed from: m  reason: collision with root package name */
    public final a5.z f1817m;

    /* renamed from: n  reason: collision with root package name */
    public u f1818n;

    /* renamed from: o  reason: collision with root package name */
    public final TaskCompletionSource f1819o = new TaskCompletionSource();

    /* renamed from: p  reason: collision with root package name */
    public final TaskCompletionSource f1820p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public n(Context context, y yVar, v vVar, m5.c cVar, k2.c cVar2, a aVar, m5.c cVar3, i5.e eVar, a5.z zVar, d5.b bVar, e5.a aVar2, k kVar, h5.f fVar) {
        new AtomicBoolean(false);
        this.f1807a = context;
        this.f1812f = yVar;
        this.f1808b = vVar;
        this.f1813g = cVar;
        this.f1809c = cVar2;
        this.f1814h = aVar;
        this.f1810d = cVar3;
        this.i = eVar;
        this.j = bVar;
        this.f1815k = aVar2;
        this.f1816l = kVar;
        this.f1817m = zVar;
        this.f1811e = fVar;
    }

    public static Task a(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : m5.c.e(((File) nVar.f1813g.f4021d).listFiles(f1805r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult((Object) null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new m(nVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e4 A[LOOP:2: B:153:0x04e4->B:158:0x0501, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    /* JADX WARN: Type inference failed for: r0v6, types: [g5.k] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, j5.c0] */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object, j5.o0] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r12v56, types: [j5.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, j5.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r33, o5.d r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.n.b(boolean, o5.d, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [j5.m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [j5.h1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, j5.a0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [j5.i0, java.lang.Object] */
    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        Map unmodifiableMap;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String l5 = g2.g.l("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l5, null);
        }
        Locale locale = Locale.US;
        y yVar = this.f1812f;
        a aVar = this.f1814h;
        l1 l1Var = new l1(yVar.f1870c, aVar.f1770f, aVar.f1771g, yVar.c().f1776a, g2.g.a(aVar.f1768d != null ? 4 : 1), aVar.f1772h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.f1807a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f1785a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            f fVar2 = (f) f.f1786b.get(str8.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = fVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(context);
        boolean f9 = g.f();
        int c9 = g.c();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, currentTimeMillis, new k1(l1Var, n1Var, new m1(ordinal, availableProcessors, a10, blockCount, f9, c9)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            m5.c cVar = this.f1810d;
            synchronized (((String) cVar.f4019b)) {
                cVar.f4019b = str;
                i5.d dVar = (i5.d) ((AtomicMarkableReference) ((i5.n) cVar.f4022e).f2731b).getReference();
                synchronized (dVar) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar.f2705a));
                }
                str3 = str10;
                str5 = str9;
                str2 = str7;
                str4 = str11;
                i = 4;
                ((h5.f) cVar.f4021d).f2218b.a(new i2.e(cVar, str, unmodifiableMap, ((h.f) cVar.f4024m).d(), 2));
            }
        }
        i5.e eVar = this.i;
        ((i5.c) eVar.f2710b).a();
        eVar.f2710b = i5.e.f2708c;
        if (str != null) {
            eVar.f2710b = new i5.l(((m5.c) eVar.f2709a).b(str, "userlog"));
        }
        this.f1816l.a(str);
        a5.z zVar = this.f1817m;
        t tVar = (t) zVar.f619a;
        Charset charset = n2.f3090a;
        ?? obj = new Object();
        obj.f2868a = "20.0.3";
        a aVar2 = tVar.f1848c;
        String str12 = aVar2.f1765a;
        if (str12 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        obj.f2869b = str12;
        y yVar2 = tVar.f1847b;
        String str13 = yVar2.c().f1776a;
        if (str13 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        obj.f2871d = str13;
        obj.f2872e = yVar2.c().f1777b;
        obj.f2873f = yVar2.c().f1778c;
        String str14 = aVar2.f1770f;
        if (str14 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        obj.f2875h = str14;
        String str15 = aVar2.f1771g;
        if (str15 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        obj.i = str15;
        obj.f2870c = i;
        obj.f2878m = (byte) (obj.f2878m | 1);
        ?? obj2 = new Object();
        obj2.f2995f = false;
        obj2.f2993d = currentTimeMillis;
        obj2.f3000m = (byte) (((byte) (obj2.f3000m | 2)) | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        obj2.f2991b = str;
        String str16 = t.f1845g;
        if (str16 == null) {
            throw new NullPointerException("Null generator");
        }
        obj2.f2990a = str16;
        String str17 = yVar2.f1870c;
        if (str17 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str18 = yVar2.c().f1776a;
        k2.c cVar2 = aVar2.f1772h;
        if (((k2.c) cVar2.f3364c) == null) {
            cVar2.f3364c = new k2.c(cVar2);
        }
        k2.c cVar3 = (k2.c) cVar2.f3364c;
        String str19 = (String) cVar3.f3363b;
        if (cVar3 == null) {
            cVar2.f3364c = new k2.c(cVar2);
        }
        obj2.f2996g = new k0(str17, str14, str15, str18, str19, (String) ((k2.c) cVar2.f3364c).f3364c);
        ?? obj3 = new Object();
        obj3.f2977a = 3;
        obj3.f2981e = (byte) (obj3.f2981e | 1);
        if (str6 == null) {
            throw new NullPointerException("Null version");
        }
        obj3.f2978b = str6;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        obj3.f2979c = str2;
        obj3.f2980d = g.g();
        obj3.f2981e = (byte) (obj3.f2981e | 2);
        obj2.i = obj3.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i9 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) t.f1844f.get(str8.toLowerCase(locale))) != null) {
            i9 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a11 = g.a(tVar.f1846a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean f10 = g.f();
        int c10 = g.c();
        ?? obj4 = new Object();
        obj4.f3061a = i9;
        byte b10 = (byte) (obj4.j | 1);
        obj4.j = b10;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        obj4.f3062b = str5;
        obj4.f3063c = availableProcessors2;
        obj4.f3064d = a11;
        obj4.f3065e = blockCount2;
        obj4.f3066f = f10;
        obj4.f3067g = c10;
        obj4.j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        obj4.f3068h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        obj4.i = str21;
        obj2.j = obj4.a();
        obj2.f2999l = 3;
        obj2.f3000m = (byte) (obj2.f3000m | 4);
        obj.j = obj2.a();
        b0 a12 = obj.a();
        m5.c cVar4 = ((m5.a) zVar.f620b).f4014b;
        m2 m2Var = a12.f2901k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((j0) m2Var).f3017b;
        try {
            m5.a.f4011g.getClass();
            m5.a.f(cVar4.b(str22, "report"), k5.a.f3403a.q(a12));
            File b11 = cVar4.b(str22, "start-time");
            long j = ((j0) m2Var).f3019d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b11), m5.a.f4009e);
            outputStreamWriter.write("");
            b11.setLastModified(j * 1000);
            outputStreamWriter.close();
        } catch (IOException e9) {
            String l9 = g2.g.l("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", l9, e9);
            }
        }
    }

    public final boolean d(o5.d dVar) {
        h5.f.a();
        u uVar = this.f1818n;
        if (uVar != null && uVar.f1855e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, dVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e9) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e9);
            return false;
        }
    }

    public final String e() {
        InputStream resourceAsStream;
        Context context = this.f1807a;
        int d9 = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = d9 == 0 ? null : context.getResources().getString(d9);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f1806s), 0);
        }
        ClassLoader classLoader = n.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    String encodeToString = Base64.encodeToString(byteArray, 0);
                    resourceAsStream.close();
                    return encodeToString;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        try {
            String e9 = e();
            if (e9 != null) {
                try {
                    this.f1810d.f(e9);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f1807a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.tasks.SuccessContinuation, java.lang.Object] */
    public final void g(Task task) {
        Task task2;
        Task a10;
        TaskCompletionSource taskCompletionSource = this.f1819o;
        m5.c cVar = ((m5.a) this.f1817m.f620b).f4014b;
        if (m5.c.e(((File) cVar.f4023f).listFiles()).isEmpty() && m5.c.e(((File) cVar.f4024m).listFiles()).isEmpty() && m5.c.e(((File) cVar.f4025n).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        d5.d dVar = d5.d.f1126a;
        dVar.c("Crash reports are available to be sent.");
        v vVar = this.f1808b;
        if (vVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a10 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.b("Automatic data collection is disabled.");
            dVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (vVar.f1857b) {
                task2 = vVar.f1858c.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask((SuccessContinuation) new Object());
            dVar.b("Waiting for send/deleteUnsentReports to be called.");
            a10 = h5.b.a(onSuccessTask, this.f1820p.getTask());
        }
        a10.onSuccessTask(this.f1811e.f2217a, new k2.c(this, task, 15, false));
    }
}
