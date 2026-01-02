package b8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import d8.f0;
import g1.v;
import j5.t1;
import j6.s;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.zip.Adler32;
import n.t0;
import n.u;
import r2.r;
import r6.g1;
import r6.i0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g implements d4.c, e5.b, e5.a, t2.b, t6.b {

    /* renamed from: e  reason: collision with root package name */
    public static g f787e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f788a;

    /* renamed from: b  reason: collision with root package name */
    public Object f789b;

    /* renamed from: c  reason: collision with root package name */
    public Object f790c;

    /* renamed from: d  reason: collision with root package name */
    public Object f791d;

    public /* synthetic */ g(int i) {
        this.f788a = i;
    }

    public static String b(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return g2.g.d(str, sb2);
        }
        return g2.g.e(str, "?", sb2);
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z9) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static g p(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public r2.j a() {
        String str = ((String) this.f789b) == null ? " backendName" : "";
        if (((o2.d) this.f791d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new r2.j((String) this.f789b, (byte[]) this.f790c, (o2.d) this.f791d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // e5.b
    public void d(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f791d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f789b;
        w5.f fVar = new w5.f(byteArrayOutputStream, hashMap, (HashMap) this.f790c, (t5.d) this.f791d);
        if (obj == null) {
            return;
        }
        t5.d dVar = (t5.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h.f f() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            h5.f.b()
            r2 = 0
            java.lang.Object r3 = r8.f789b     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r4 = r8.f790c     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = b(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lb7
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb4
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.f791d     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbb
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbb
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            h.f r0 = new h.f
            r0.<init>(r1, r2)
            return r0
        Lb4:
            r1 = move-exception
        Lb5:
            r0 = r2
            goto Lbb
        Lb7:
            r1 = r0
            goto Lb5
        Lb9:
            r0 = move-exception
            goto Lb7
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()
        Lc0:
            if (r0 == 0) goto Lc5
            r0.disconnect()
        Lc5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.g.f():h.f");
    }

    @Override // e5.a
    public void g(Bundle bundle) {
        synchronized (this.f790c) {
            try {
                d5.d dVar = d5.d.f1126a;
                dVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f791d = new CountDownLatch(1);
                ((l6.c) this.f789b).g(bundle);
                dVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f791d).await(500, TimeUnit.MILLISECONDS)) {
                        dVar.c("App exception callback received from Analytics listener.");
                    } else {
                        dVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f791d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a3.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a3.a, java.lang.Object] */
    @Override // g7.a
    public Object get() {
        switch (this.f788a) {
            case 12:
                return new r(new Object(), new Object(), (w2.b) ((a2.b) this.f789b).get(), (o5.d) ((m5.c) this.f790c).get(), (s) ((s) this.f791d).get());
            case 14:
                Context context = (Context) ((k4.i) this.f789b).f3396b;
                l7.h hVar = (l7.h) ((g7.a) this.f790c).get();
                i0 i0Var = (i0) ((t6.c) this.f791d).get();
                kotlin.jvm.internal.j.e(context, "appContext");
                kotlin.jvm.internal.j.e(hVar, "blockingDispatcher");
                kotlin.jvm.internal.j.e(i0Var, "sessionDataSerializer");
                return r6.q.b(i0Var, new l6.c(new a6.i(i0Var, 5), 7), f0.b(hVar), new r6.p(context, 1));
            case 17:
                return new u6.o((l7.h) ((g7.a) this.f789b).get(), (g1) ((g7.a) this.f790c).get(), (a1.h) ((t6.c) this.f791d).get());
            default:
                return new g((Context) ((g7.a) this.f789b).get(), (y2.d) ((g7.a) this.f790c).get(), (x2.b) ((v3.f) this.f791d).get(), 21);
        }
    }

    public ColorStateList h(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f790c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = e0.c.getColorStateList((Context) this.f789b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public Drawable i(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f790c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : t1.A((Context) this.f789b, resourceId);
    }

    public Drawable j(int i) {
        int resourceId;
        Drawable d9;
        if (!((TypedArray) this.f790c).hasValue(i) || (resourceId = ((TypedArray) this.f790c).getResourceId(i, 0)) == 0) {
            return null;
        }
        u a10 = u.a();
        Context context = (Context) this.f789b;
        synchronized (a10) {
            d9 = a10.f4310a.d(context, resourceId, true);
        }
        return d9;
    }

    public Typeface k(int i, int i9, t0 t0Var) {
        int resourceId = ((TypedArray) this.f790c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f791d) == null) {
            this.f791d = new TypedValue();
        }
        Context context = (Context) this.f789b;
        TypedValue typedValue = (TypedValue) this.f791d;
        ThreadLocal threadLocal = g0.m.f1631a;
        if (context.isRestricted()) {
            return null;
        }
        return g0.m.a(context, resourceId, typedValue, i9, t0Var, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(86:5|(4:7|(1:9)|10|(2:12|(2:13|(2:15|(3:17|18|(1:20)(0)))(1:21)))(0))(0)|22|(83:248|249|(1:26)|27|28|29|(1:31)|245|33|34|35|36|37|(74:224|(67:226|(1:228)|40|(1:42)|43|(1:45)|46|(58:48|(1:209)|52|(1:54)|55|(1:57)(2:199|(1:204)(1:203))|58|(1:60)(1:198)|61|(1:63)(5:186|(1:188)|189|(1:191)(1:197)|(1:193)(2:194|(1:196)))|64|(1:66)(6:168|(4:171|(2:179|180)(1:177)|178|169)|181|182|(1:184)|185)|67|(1:69)(1:167)|(1:71)|72|(40:163|164|(1:78)|79|(1:81)(1:158)|82|(1:84)|85|(32:153|(1:157)|(1:89)|90|(28:148|(1:152)|(1:94)|95|(24:145|(1:147)|(1:99)|100|(1:102)|103|(1:105)|106|(3:108|(1:113)(1:111)|112)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:144)|125|(4:133|134|(1:136)(1:139)|137)|127|128|(1:130)|131|132)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|74|(40:159|160|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|76|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|210|(2:219|220)|(1:218)(1:217)|52|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|229|(70:231|(1:233)|40|(0)|43|(0)|46|(0)|210|(1:212)|219|220|(1:215)|218|52|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)(1:241)|234|(3:236|(1:238)(1:240)|239)|40|(0)|43|(0)|46|(0)|210|(0)|219|220|(0)|218|52|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|39|40|(0)|43|(0)|46|(0)|210|(0)|219|220|(0)|218|52|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132)|24|(0)|27|28|29|(0)|245|33|34|35|36|37|(0)|39|40|(0)|43|(0)|46|(0)|210|(0)|219|220|(0)|218|52|(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)(0)|(0)|72|(0)|74|(0)|76|(0)|79|(0)(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|103|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|128|(0)|131|132) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0210, code lost:
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0537 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[Catch: NameNotFoundException -> 0x00cf, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x00cf, blocks: (B:30:0x00c3, B:32:0x00c9), top: B:249:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    /* JADX WARN: Type inference failed for: r0v176 */
    /* JADX WARN: Type inference failed for: r0v177 */
    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
    /* JADX WARN: Type inference failed for: r11v27, types: [d0.q, d0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [d0.p] */
    /* JADX WARN: Type inference failed for: r5v14, types: [d0.q, d0.m, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l() {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.g.l():boolean");
    }

    public boolean m(CharSequence charSequence, int i, int i9, g1.u uVar) {
        if ((uVar.f1683c & 3) == 0) {
            g1.f fVar = (g1.f) this.f791d;
            h1.a b10 = uVar.b();
            int b11 = b10.b(8);
            if (b11 != 0) {
                ((ByteBuffer) b10.f2147d).getShort(b11 + b10.f2144a);
            }
            g1.d dVar = (g1.d) fVar;
            dVar.getClass();
            ThreadLocal threadLocal = g1.d.f1644b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i9) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f1645a;
            String sb2 = sb.toString();
            int i10 = h0.c.f2129a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i11 = uVar.f1683c & 4;
            uVar.f1683c = hasGlyph ? i11 | 2 : i11 | 1;
        }
        return (uVar.f1683c & 3) == 2;
    }

    public void n(String str, String str2) {
        ((HashMap) this.f791d).put(str, str2);
    }

    public boolean o(int i, w.d dVar, z.f fVar) {
        x.b bVar = (x.b) this.f790c;
        int[] iArr = dVar.f6373p0;
        int[] iArr2 = dVar.f6376t;
        bVar.f6490a = iArr[0];
        bVar.f6491b = iArr[1];
        bVar.f6492c = dVar.q();
        bVar.f6493d = dVar.k();
        bVar.i = false;
        bVar.j = i;
        boolean z9 = bVar.f6490a == 3;
        boolean z10 = bVar.f6491b == 3;
        boolean z11 = z9 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z11 && iArr2[0] == 4) {
            bVar.f6490a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f6491b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f6494e);
        dVar.L(bVar.f6495f);
        dVar.E = bVar.f6497h;
        dVar.I(bVar.f6496g);
        bVar.j = 0;
        return bVar.i;
    }

    public Object q(CharSequence charSequence, int i, int i9, int i10, boolean z9, g1.n nVar) {
        int i11;
        boolean z10;
        g1.o oVar = new g1.o((g1.r) ((s) this.f790c).f3284d);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i12 = 0;
        boolean z11 = true;
        int i13 = i;
        loop0: while (true) {
            i11 = i13;
            while (i13 < i9 && i12 < i10 && z11) {
                SparseArray sparseArray = oVar.f1661c.f1674a;
                g1.r rVar = sparseArray == null ? null : (g1.r) sparseArray.get(codePointAt);
                if (oVar.f1659a == 2) {
                    if (rVar != null) {
                        oVar.f1661c = rVar;
                        oVar.f1664f++;
                    } else {
                        if (codePointAt == 65038) {
                            oVar.a();
                        } else if (codePointAt != 65039) {
                            g1.r rVar2 = oVar.f1661c;
                            if (rVar2.f1675b != null) {
                                if (oVar.f1664f != 1) {
                                    oVar.f1662d = rVar2;
                                    oVar.a();
                                } else if (oVar.b()) {
                                    oVar.f1662d = oVar.f1661c;
                                    oVar.a();
                                } else {
                                    oVar.a();
                                }
                                z10 = true;
                            } else {
                                oVar.a();
                            }
                        }
                        z10 = true;
                    }
                    z10 = true;
                } else if (rVar == null) {
                    oVar.a();
                    z10 = true;
                } else {
                    oVar.f1659a = 2;
                    oVar.f1661c = rVar;
                    oVar.f1664f = 1;
                    z10 = true;
                }
                oVar.f1663e = codePointAt;
                if (z10) {
                    i13 = Character.charCount(Character.codePointAt(charSequence, i11)) + i11;
                    if (i13 < i9) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                } else if (z10) {
                    int charCount = Character.charCount(codePointAt) + i13;
                    if (charCount < i9) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i13 = charCount;
                } else if (z10) {
                    if (z9 || !m(charSequence, i11, i13, oVar.f1662d.f1675b)) {
                        z11 = nVar.e(charSequence, i11, i13, oVar.f1662d.f1675b);
                        i12++;
                    }
                }
            }
        }
        if (oVar.f1659a == 2 && oVar.f1661c.f1675b != null && ((oVar.f1664f > 1 || oVar.b()) && i12 < i10 && z11 && (z9 || !m(charSequence, i11, i13, oVar.f1661c.f1675b)))) {
            nVar.e(charSequence, i11, i13, oVar.f1661c.f1675b);
        }
        return nVar.getResult();
    }

    public void r() {
        ((TypedArray) this.f790c).recycle();
    }

    public void s(r2.j jVar, int i, boolean z9) {
        x2.b bVar = (x2.b) this.f791d;
        Context context = (Context) this.f789b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = jVar.f5536a;
        String str2 = jVar.f5536a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        o2.d dVar = jVar.f5538c;
        adler32.update(allocate.putInt(b3.a.a(dVar)).array());
        byte[] bArr = jVar.f5537b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z9) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i9 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i9 >= i) {
                        c4.b.v("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((y2.h) ((y2.d) this.f790c)).c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(b3.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(dVar, longValue, i));
            Set set = ((x2.c) bVar.f6543b.get(dVar)).f6546c;
            if (set.contains(x2.d.f6547a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(x2.d.f6549c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(x2.d.f6548b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", b3.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i)), valueOf, Integer.valueOf(i)};
            String concat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(concat, 3)) {
                Log.d(concat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void t(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f789b = str;
    }

    public String toString() {
        switch (this.f788a) {
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f789b);
                sb.append('{');
                k2.c cVar = (k2.c) ((k2.c) this.f790c).f3364c;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f3363b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    cVar = (k2.c) cVar.f3364c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(w.e eVar, int i, int i9, int i10) {
        eVar.getClass();
        int i11 = eVar.f6349b0;
        int i12 = eVar.f6351c0;
        eVar.f6349b0 = 0;
        eVar.f6351c0 = 0;
        eVar.O(i9);
        eVar.L(i10);
        if (i11 < 0) {
            eVar.f6349b0 = 0;
        } else {
            eVar.f6349b0 = i11;
        }
        if (i12 < 0) {
            eVar.f6351c0 = 0;
        } else {
            eVar.f6351c0 = i12;
        }
        w.e eVar2 = (w.e) this.f791d;
        eVar2.f6386t0 = i;
        eVar2.U();
    }

    public void v(w.e eVar) {
        ArrayList arrayList = (ArrayList) this.f789b;
        arrayList.clear();
        int size = eVar.f6383q0.size();
        for (int i = 0; i < size; i++) {
            w.d dVar = (w.d) eVar.f6383q0.get(i);
            int[] iArr = dVar.f6373p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f6385s0.f6501b = true;
    }

    @Override // d4.c
    public Object zza() {
        return new c4.e((c4.l) ((d4.c) this.f789b).zza(), (c4.c) ((d4.c) this.f790c).zza(), ((c4.f) ((l6.c) this.f791d).f3791b).f911a);
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i) {
        this.f788a = i;
        this.f789b = obj;
        this.f790c = obj2;
        this.f791d = obj3;
    }

    public g(String str, HashMap hashMap) {
        this.f788a = 7;
        this.f789b = str;
        this.f790c = hashMap;
        this.f791d = new HashMap();
    }

    public g(l6.c cVar) {
        this.f788a = 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f790c = new Object();
        this.f789b = cVar;
    }

    public g(r3.b bVar, View view) {
        Object obj;
        this.f788a = 13;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            obj = new Object();
        } else {
            obj = i >= 33 ? new Object() : null;
        }
        this.f789b = obj;
        this.f790c = bVar;
        this.f791d = view;
    }

    public g(FirebaseMessagingService firebaseMessagingService, j6.o oVar, ExecutorService executorService) {
        this.f788a = 5;
        this.f789b = executorService;
        this.f790c = firebaseMessagingService;
        this.f791d = oVar;
    }

    public g(Context context, TypedArray typedArray) {
        this.f788a = 8;
        this.f789b = context;
        this.f790c = typedArray;
    }

    public g(Context context, LocationManager locationManager) {
        this.f788a = 4;
        this.f791d = new Object();
        this.f789b = context;
        this.f790c = locationManager;
    }

    public g(w.e eVar) {
        this.f788a = 20;
        this.f789b = new ArrayList();
        this.f790c = new Object();
        this.f791d = eVar;
    }

    public g(s sVar, a6.e eVar, g1.d dVar, Set set) {
        this.f788a = 3;
        this.f789b = eVar;
        this.f790c = sVar;
        this.f791d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            q(str, 0, str.length(), 1, true, new d4.l(str, 1, false));
        }
    }

    public g(String str) {
        this.f788a = 6;
        k2.c cVar = new k2.c(29, false);
        this.f790c = cVar;
        this.f791d = cVar;
        this.f789b = str;
    }

    public g(Matcher matcher, CharSequence charSequence) {
        this.f788a = 0;
        kotlin.jvm.internal.j.e(charSequence, "input");
        this.f789b = matcher;
        this.f790c = new f(this);
    }
}
