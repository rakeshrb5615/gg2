package n0;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzac;
import com.google.android.gms.internal.firebase-auth-api.zzaer;
import com.google.android.gms.internal.firebase-auth-api.zzahs;
import com.google.android.gms.internal.firebase-auth-api.zzt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import g5.p;
import j6.o;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONObject;
import q0.t;
import z4.x;
import z8.n;
import z8.q0;
import z8.z;
import z8.z0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a implements SuccessContinuation, p5.a, t, t2.b, OnCompleteListener, Continuation, z8.f, z8.g, Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4372a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4373b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4374c;

    public /* synthetic */ a(int i) {
        this.f4372a = i;
    }

    @Override // z8.f
    public Object a(z zVar) {
        Executor executor = (Executor) this.f4374c;
        return executor == null ? zVar : new n(executor, zVar);
    }

    @Override // z8.g
    public void b(z8.d dVar, Throwable th) {
        ((n) this.f4374c).f7508a.execute(new androidx.fragment.app.l(this, (z8.g) this.f4373b, th, 7));
    }

    @Override // z8.f
    public Type c() {
        return (Type) this.f4373b;
    }

    @Override // z8.g
    public void d(z8.d dVar, q0 q0Var) {
        ((n) this.f4374c).f7508a.execute(new androidx.fragment.app.l(this, (z8.g) this.f4373b, q0Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory e(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.e(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // p5.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        p5.a[] aVarArr = (p5.a[]) this.f4373b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            p5.a aVar = aVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.f(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((c5.c) this.f4374c).f(stackTraceElementArr2) : stackTraceElementArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: JSONException -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0013, B:7:0x002a, B:10:0x003d, B:17:0x0057, B:24:0x006d, B:26:0x0076, B:28:0x0080, B:30:0x0084, B:31:0x009b, B:32:0x00a2, B:33:0x00a3, B:34:0x00aa, B:35:0x00ab, B:36:0x00b2), top: B:45:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: JSONException -> 0x003a, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0013, B:7:0x002a, B:10:0x003d, B:17:0x0057, B:24:0x006d, B:26:0x0076, B:28:0x0080, B:30:0x0084, B:31:0x009b, B:32:0x00a2, B:33:0x00a3, B:34:0x00aa, B:35:0x00ab, B:36:0x00b2), top: B:45:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, q6.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q6.d g(n6.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            org.json.JSONArray r1 = r14.f4916g
            long r2 = r14.f4915f
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r4 = 0
            r5 = r4
        Ld:
            int r6 = r1.length()
            if (r5 >= r6) goto Lbb
            org.json.JSONObject r6 = r1.getJSONObject(r5)     // Catch: org.json.JSONException -> L3a
            java.lang.String r7 = "rolloutId"
            java.lang.String r7 = r6.getString(r7)     // Catch: org.json.JSONException -> L3a
            java.lang.String r8 = "affectedParameterKeys"
            org.json.JSONArray r8 = r6.getJSONArray(r8)     // Catch: org.json.JSONException -> L3a
            int r9 = r8.length()     // Catch: org.json.JSONException -> L3a
            r10 = 1
            if (r9 <= r10) goto L3d
            java.lang.String r9 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            java.lang.Object[] r12 = new java.lang.Object[]{r7, r8}     // Catch: org.json.JSONException -> L3a
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> L3a
            android.util.Log.w(r9, r11)     // Catch: org.json.JSONException -> L3a
            goto L3d
        L3a:
            r14 = move-exception
            goto Lb3
        L3d:
            java.lang.String r8 = r8.optString(r4, r0)     // Catch: org.json.JSONException -> L3a
            java.lang.Object r9 = r13.f4373b     // Catch: org.json.JSONException -> L3a
            n6.d r9 = (n6.d) r9     // Catch: org.json.JSONException -> L3a
            n6.f r9 = r9.c()     // Catch: org.json.JSONException -> L3a
            r11 = 0
            if (r9 != 0) goto L4e
        L4c:
            r9 = r11
            goto L54
        L4e:
            org.json.JSONObject r9 = r9.f4911b     // Catch: org.json.JSONException -> L4c
            java.lang.String r9 = r9.getString(r8)     // Catch: org.json.JSONException -> L4c
        L54:
            if (r9 == 0) goto L57
            goto L6d
        L57:
            java.lang.Object r9 = r13.f4374c     // Catch: org.json.JSONException -> L3a
            n6.d r9 = (n6.d) r9     // Catch: org.json.JSONException -> L3a
            n6.f r9 = r9.c()     // Catch: org.json.JSONException -> L3a
            if (r9 != 0) goto L62
            goto L68
        L62:
            org.json.JSONObject r9 = r9.f4911b     // Catch: org.json.JSONException -> L68
            java.lang.String r11 = r9.getString(r8)     // Catch: org.json.JSONException -> L68
        L68:
            if (r11 == 0) goto L6c
            r9 = r11
            goto L6d
        L6c:
            r9 = r0
        L6d:
            int r11 = q6.e.f5436a     // Catch: org.json.JSONException -> L3a
            q6.b r11 = new q6.b     // Catch: org.json.JSONException -> L3a
            r11.<init>()     // Catch: org.json.JSONException -> L3a
            if (r7 == 0) goto Lab
            r11.f5424a = r7     // Catch: org.json.JSONException -> L3a
            java.lang.String r7 = "variantId"
            java.lang.String r6 = r6.getString(r7)     // Catch: org.json.JSONException -> L3a
            if (r6 == 0) goto La3
            r11.f5425b = r6     // Catch: org.json.JSONException -> L3a
            if (r8 == 0) goto L9b
            r11.f5426c = r8     // Catch: org.json.JSONException -> L3a
            r11.f5427d = r9     // Catch: org.json.JSONException -> L3a
            r11.f5428e = r2     // Catch: org.json.JSONException -> L3a
            byte r6 = r11.f5429f     // Catch: org.json.JSONException -> L3a
            r6 = r6 | r10
            byte r6 = (byte) r6     // Catch: org.json.JSONException -> L3a
            r11.f5429f = r6     // Catch: org.json.JSONException -> L3a
            q6.c r6 = r11.a()     // Catch: org.json.JSONException -> L3a
            r14.add(r6)     // Catch: org.json.JSONException -> L3a
            int r5 = r5 + 1
            goto Ld
        L9b:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        La3:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        Lab:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        Lb3:
            m6.c r0 = new m6.c
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lbb:
            q6.d r0 = new q6.d
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.g(n6.f):q6.d");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a3.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a3.a, java.lang.Object] */
    @Override // g7.a
    public Object get() {
        switch (this.f4372a) {
            case 9:
                return new s2.d((Context) ((k4.i) this.f4373b).f3396b, (b8.g) ((o) this.f4374c).get());
            default:
                ?? obj = new Object();
                ?? obj2 = new Object();
                y2.j jVar = (y2.j) ((g7.a) this.f4373b).get();
                return new y2.h(obj, obj2, y2.a.f6758f, jVar, (g7.a) this.f4374c);
        }
    }

    public void h(Call call, IOException iOException) {
        try {
            ((z8.g) this.f4373b).b((z) this.f4374c, iOException);
        } catch (Throwable th) {
            z0.r(th);
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    @Override // q0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0.s1 i(android.view.View r20, q0.s1 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.f4373b
            i2.m r3 = (i2.m) r3
            java.lang.Object r4 = r0.f4374c
            q3.m r4 = (q3.m) r4
            int r5 = r4.f5369a
            int r6 = r4.f5370b
            int r4 = r4.f5371c
            q0.p1 r7 = r2.f5183a
            r8 = 519(0x207, float:7.27E-43)
            h0.b r8 = r7.f(r8)
            r9 = 32
            h0.b r7 = r7.f(r9)
            java.lang.Object r9 = r3.f2413b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f2126b
            int r11 = r8.f2127c
            int r12 = r8.f2125a
            r9.w = r10
            int r10 = r1.getLayoutDirection()
            r14 = 1
            if (r10 != r14) goto L37
            r10 = r14
            goto L38
        L37:
            r10 = 0
        L38:
            int r15 = r1.getPaddingBottom()
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingRight()
            boolean r13 = r9.o
            if (r13 == 0) goto L4f
            int r15 = r2.a()
            r9.v = r15
            int r15 = r15 + r4
        L4f:
            boolean r4 = r9.p
            if (r4 == 0) goto L5a
            if (r10 == 0) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = r5
        L58:
            int r16 = r4 + r12
        L5a:
            r4 = r16
            boolean r14 = r9.q
            if (r14 == 0) goto L66
            if (r10 == 0) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            int r17 = r5 + r11
        L66:
            r5 = r17
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r10 = r9.s
            if (r10 == 0) goto L7b
            int r10 = r6.leftMargin
            if (r10 == r12) goto L7b
            r6.leftMargin = r12
            r18 = 1
            goto L7d
        L7b:
            r18 = 0
        L7d:
            boolean r10 = r9.t
            if (r10 == 0) goto L89
            int r10 = r6.rightMargin
            if (r10 == r11) goto L89
            r6.rightMargin = r11
            r18 = 1
        L89:
            boolean r10 = r9.u
            if (r10 == 0) goto L97
            int r10 = r6.topMargin
            int r8 = r8.f2126b
            if (r10 == r8) goto L97
            r6.topMargin = r8
            r14 = 1
            goto L99
        L97:
            r14 = r18
        L99:
            if (r14 == 0) goto L9e
            r1.setLayoutParams(r6)
        L9e:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r4, r6, r5, r15)
            boolean r1 = r3.f2412a
            if (r1 == 0) goto Lad
            int r3 = r7.f2128d
            r9.m = r3
        Lad:
            if (r13 != 0) goto Lb3
            if (r1 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r2
        Lb3:
            r9.O()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.i(android.view.View, q0.s1):q0.s1");
    }

    public void j(Call call, Response response) {
        z8.g gVar = (z8.g) this.f4373b;
        z zVar = (z) this.f4374c;
        try {
            try {
                gVar.d(zVar, zVar.d(response));
            } catch (Throwable th) {
                z0.r(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            z0.r(th2);
            try {
                gVar.b(zVar, th2);
            } catch (Throwable th3) {
                z0.r(th3);
                th3.printStackTrace();
            }
        }
    }

    public void k(g gVar) {
        m0.f fVar = (m0.f) this.f4374c;
        l6.c cVar = (l6.c) this.f4373b;
        int i = gVar.f4393b;
        if (i == 0) {
            fVar.execute(new b5.l(7, cVar, gVar.f4392a));
        } else {
            fVar.execute(new com.google.android.material.datepicker.g(cVar, i, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.l(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void onComplete(Task task) {
        switch (this.f4372a) {
            case 13:
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f4373b;
                String str = (String) this.f4374c;
                int i = GenericIdpActivity.c;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzaer.zzb(genericIdpActivity, str);
                    return;
                }
                List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent.putExtra("com.android.browser.application_id", str);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent.addFlags(1073741824);
                    intent.addFlags(268435456);
                    genericIdpActivity.startActivity(intent);
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent2.putExtras(bundle);
                }
                intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent2.putExtras(new Bundle());
                intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                intent2.setData((Uri) task.getResult());
                e0.c.startActivity(genericIdpActivity, intent2, null);
                return;
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f4373b;
                String str2 = (String) this.f4374c;
                x xVar = RecaptchaActivity.c;
                if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzaer.zzb(recaptchaActivity, str2);
                    return;
                }
                List<ResolveInfo> queryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices2 == null || queryIntentServices2.isEmpty()) {
                    Intent intent3 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent3.putExtra("com.android.browser.application_id", str2);
                    intent3.addFlags(1073741824);
                    intent3.addFlags(268435456);
                    recaptchaActivity.startActivity(intent3);
                    return;
                }
                Intent intent4 = new Intent("android.intent.action.VIEW");
                if (!intent4.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent4.putExtras(bundle2);
                }
                intent4.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent4.putExtras(new Bundle());
                intent4.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                intent4.addFlags(1073741824);
                intent4.addFlags(268435456);
                intent4.setData((Uri) task.getResult());
                e0.c.startActivity(recaptchaActivity, intent4, null);
                return;
        }
    }

    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new Exception((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahs zzahsVar = (zzahs) task.getResult();
        String zza = zzahsVar.zza();
        if (zzac.zzc(zza)) {
            return Tasks.forException(new Exception(g2.g.l("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f4373b)));
        }
        List zza2 = zzt.zza('/').zza(zza);
        String str = zza2.size() != 4 ? null : (String) zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(g2.g.l("Invalid siteKey format ", zza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f4373b));
        }
        a5.z zVar = (a5.z) this.f4374c;
        q4.f fVar = (q4.f) zVar.f622d;
        fVar.a();
        ((z4.z) zVar.f624f).getClass();
        Task fetchTaskClient = Recaptcha.fetchTaskClient((Application) fVar.f5386a, str);
        a5.z zVar2 = (a5.z) this.f4374c;
        String str2 = (String) this.f4373b;
        synchronized (zVar2.f619a) {
            zVar2.f621c = zzahsVar;
            ((HashMap) zVar2.f620b).put(str2, fetchTaskClient);
        }
        return fetchTaskClient;
    }

    public String toString() {
        switch (this.f4372a) {
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return "Bounds{lower=" + ((h0.b) this.f4373b) + " upper=" + ((h0.b) this.f4374c) + "}";
            case 10:
                String str = "[ ";
                if (((u.f) this.f4373b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder b10 = u.e.b(str);
                        b10.append(((u.f) this.f4373b).f6026n[i]);
                        b10.append(" ");
                        str = b10.toString();
                    }
                }
                return str + "] " + ((u.f) this.f4373b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f4372a = i;
        this.f4373b = obj;
        this.f4374c = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, boolean z9) {
        this.f4372a = i;
        this.f4374c = obj;
        this.f4373b = obj2;
    }

    public a(a5.z zVar, String str) {
        this.f4372a = 15;
        this.f4373b = str;
        Objects.requireNonNull(zVar);
        this.f4374c = zVar;
    }

    public a(p5.a[] aVarArr) {
        this.f4372a = 5;
        this.f4373b = aVarArr;
        this.f4374c = new Object();
    }

    public a(u.d dVar) {
        this.f4372a = 10;
        this.f4374c = dVar;
    }

    public a(c6.b bVar) {
        this.f4372a = 2;
        this.f4374c = Collections.synchronizedMap(new HashMap());
        this.f4373b = bVar;
    }

    public a(q4.f fVar, d6.d dVar, n6.i iVar, n6.d dVar2, Context context, n6.n nVar, ScheduledExecutorService scheduledExecutorService) {
        this.f4372a = 1;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f4373b = linkedHashSet;
        this.f4374c = new n6.l(fVar, dVar, iVar, dVar2, context, linkedHashSet, nVar, scheduledExecutorService);
    }

    public a(Context context) {
        this.f4372a = 8;
        this.f4374c = null;
        this.f4373b = context;
    }

    public Task then(Object obj) {
        FileWriter fileWriter;
        Void r10 = (Void) obj;
        o5.d dVar = (o5.d) this.f4374c;
        JSONObject jSONObject = (JSONObject) ((h5.f) this.f4373b).f2219c.f2212a.submit(new p(this, 3)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            o5.c E = ((o) dVar.f5023c).E(jSONObject);
            o oVar = (o) dVar.f5025e;
            long j = E.f5017c;
            oVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) oVar.f3275b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        g5.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    g5.g.b(fileWriter, "Failed to close settings writer.");
                    o5.d.d(jSONObject, "Loaded settings: ");
                    String str = ((o5.f) dVar.f5022b).f5034f;
                    SharedPreferences.Editor edit = ((Context) dVar.f5021a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    ((AtomicReference) dVar.f5028h).set(E);
                    ((TaskCompletionSource) ((AtomicReference) dVar.i).get()).trySetResult(E);
                    return Tasks.forResult((Object) null);
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                g5.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            g5.g.b(fileWriter, "Failed to close settings writer.");
            o5.d.d(jSONObject, "Loaded settings: ");
            String str2 = ((o5.f) dVar.f5022b).f5034f;
            SharedPreferences.Editor edit2 = ((Context) dVar.f5021a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            ((AtomicReference) dVar.f5028h).set(E);
            ((TaskCompletionSource) ((AtomicReference) dVar.i).get()).trySetResult(E);
        }
        return Tasks.forResult((Object) null);
    }
}
