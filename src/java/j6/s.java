package j6;

import a1.b1;
import android.app.Notification;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.a1;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import d8.e1;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import r6.w0;
import x8.g0;
import x8.h0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class s implements t6.b, t2.b, g0, Continuation {

    /* renamed from: f  reason: collision with root package name */
    public static s f3279f;

    /* renamed from: m  reason: collision with root package name */
    public static s f3280m;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3281a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3282b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3283c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3284d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3285e;

    public /* synthetic */ s(int i, boolean z9) {
        this.f3281a = i;
    }

    public static synchronized s g() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f3279f == null) {
                    f3279f = new s(0);
                }
                sVar = f3279f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public static s h() {
        if (f3280m == null) {
            f3280m = new s(15);
        }
        return f3280m;
    }

    @Override // x8.g0
    public h0 a() {
        return (y8.e) this.f3284d;
    }

    @Override // x8.g0
    public x8.f0 b() {
        return (y8.d) this.f3285e;
    }

    public boolean c(y3.l lVar, int i) {
        y3.f fVar = (y3.f) lVar.f6826a.get();
        if (fVar != null) {
            ((Handler) this.f3283c).removeCallbacksAndMessages(lVar);
            Handler handler = y3.h.f6805x;
            handler.sendMessage(handler.obtainMessage(1, i, 0, fVar.f6790a));
            return true;
        }
        return false;
    }

    @Override // x8.g0
    public void cancel() {
        ((Socket) this.f3282b).close();
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((r.j) this.f3283c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(n7.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3285e
            a1.g0 r0 = (a1.g0) r0
            boolean r1 = r7 instanceof a1.i
            if (r1 == 0) goto L17
            r1 = r7
            a1.i r1 = (a1.i) r1
            int r2 = r1.f97d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f97d = r2
            goto L1c
        L17:
            a1.i r1 = new a1.i
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f95b
            m7.a r2 = m7.a.f4049a
            int r3 = r1.f97d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            j6.s r0 = r1.f94a
            c4.b.e0(r7)
            goto L64
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            j6.s r0 = r1.f94a
            c4.b.e0(r7)
            goto L74
        L3e:
            c4.b.e0(r7)
            java.lang.Object r7 = r6.f3284d
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            a1.s0 r7 = r0.h()
            a1.l r3 = new a1.l
            r5 = 0
            r3.<init>(r0, r6, r5)
            r1.f94a = r6
            r1.f97d = r4
            java.lang.Object r7 = r7.a(r3, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            a1.c r7 = (a1.c) r7
            goto L76
        L67:
            r1.f94a = r6
            r1.f97d = r5
            r7 = 0
            java.lang.Object r7 = a1.g0.g(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            a1.c r7 = (a1.c) r7
        L76:
            java.lang.Object r0 = r0.f3285e
            a1.g0 r0 = (a1.g0) r0
            l6.c r0 = r0.f79h
            r0.l(r7)
            h7.l r7 = h7.l.f2236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.s.e(n7.c):java.lang.Object");
    }

    public l.e f(l.a aVar) {
        ArrayList arrayList = (ArrayList) this.f3284d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l.e eVar = (l.e) arrayList.get(i);
            if (eVar != null && eVar.f3487b == aVar) {
                return eVar;
            }
        }
        l.e eVar2 = new l.e((Context) this.f3283c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    @Override // g7.a
    public Object get() {
        switch (this.f3281a) {
            case 11:
                return new r6.o((q4.f) ((k4.i) this.f3282b).f3396b, (u6.k) ((g7.a) this.f3283c).get(), (l7.h) ((g7.a) this.f3284d).get(), (w0) ((t6.c) this.f3285e).get());
            default:
                return new s((Executor) ((g7.a) this.f3282b).get(), (y2.d) ((g7.a) this.f3283c).get(), (b8.g) ((b8.g) this.f3284d).get(), (z2.c) ((g7.a) this.f3285e).get(), 13);
        }
    }

    public v0 i(kotlin.jvm.internal.e eVar, String str) {
        v0 v0Var;
        boolean isInstance;
        v0 a10;
        kotlin.jvm.internal.j.e(str, "key");
        synchronized (((a6.e) this.f3285e)) {
            try {
                a1 a1Var = (a1) this.f3282b;
                a1Var.getClass();
                v0Var = (v0) a1Var.a.get(str);
                Class cls = eVar.a;
                kotlin.jvm.internal.j.e(cls, "jClass");
                Map map = kotlin.jvm.internal.e.b;
                kotlin.jvm.internal.j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(cls);
                if (num != null) {
                    isInstance = kotlin.jvm.internal.u.c(num.intValue(), v0Var);
                } else {
                    if (cls.isPrimitive()) {
                        cls = q4.b.v(kotlin.jvm.internal.s.a(cls));
                    }
                    isInstance = cls.isInstance(v0Var);
                }
                if (isInstance) {
                    t0 t0Var = (x0) this.f3283c;
                    if (t0Var instanceof t0) {
                        t0 t0Var2 = t0Var;
                        kotlin.jvm.internal.j.b(v0Var);
                        androidx.lifecycle.p pVar = t0Var2.d;
                        if (pVar != null) {
                            b2.e eVar2 = t0Var2.e;
                            kotlin.jvm.internal.j.b(eVar2);
                            q0.a(v0Var, eVar2, pVar);
                        }
                    }
                    kotlin.jvm.internal.j.c(v0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    o1.c cVar = new o1.c((o1.b) this.f3284d);
                    cVar.f5000a.put(z0.b, str);
                    x0 x0Var = (x0) this.f3283c;
                    try {
                        try {
                            a10 = x0Var.c(eVar, cVar);
                        } catch (AbstractMethodError unused) {
                            a10 = x0Var.b(q4.b.u(eVar), cVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        a10 = x0Var.a(q4.b.u(eVar));
                    }
                    v0Var = a10;
                    a1 a1Var2 = (a1) this.f3282b;
                    a1Var2.getClass();
                    kotlin.jvm.internal.j.e(v0Var, "viewModel");
                    v0 v0Var2 = (v0) a1Var2.a.put(str, v0Var);
                    if (v0Var2 != null) {
                        v0Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v0Var;
    }

    public boolean j(Context context) {
        if (((Boolean) this.f3284d) == null) {
            this.f3284d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f3283c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f3284d).booleanValue();
    }

    public boolean k(Context context) {
        if (((Boolean) this.f3283c) == null) {
            this.f3283c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f3283c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f3283c).booleanValue();
    }

    public boolean l(y3.f fVar) {
        y3.l lVar = (y3.l) this.f3284d;
        return (lVar == null || fVar == null || lVar.f6826a.get() != fVar) ? false : true;
    }

    public boolean m(l.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f3282b).onActionItemClicked(f(aVar), new m.t((Context) this.f3283c, (j0.a) menuItem));
    }

    public boolean n(l.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f3282b;
        l.e f9 = f(aVar);
        r.j jVar = (r.j) this.f3285e;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new m.b0((Context) this.f3283c, (m.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(f9, menu2);
    }

    public void o(y3.f fVar) {
        synchronized (this.f3282b) {
            try {
                if (l(fVar)) {
                    y3.l lVar = (y3.l) this.f3284d;
                    if (!lVar.f6828c) {
                        lVar.f6828c = true;
                        ((Handler) this.f3283c).removeCallbacksAndMessages(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(y3.f fVar) {
        synchronized (this.f3282b) {
            try {
                if (l(fVar)) {
                    y3.l lVar = (y3.l) this.f3284d;
                    if (lVar.f6828c) {
                        lVar.f6828c = false;
                        r(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:27:0x0064, B:31:0x0074), top: B:42:0x0064 }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [m8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(n7.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a1.e1
            if (r0 == 0) goto L13
            r0 = r8
            a1.e1 r0 = (a1.e1) r0
            int r1 = r0.f54e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54e = r1
            goto L18
        L13:
            a1.e1 r0 = new a1.e1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f52c
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f54e
            r3 = 2
            r4 = 1
            h7.l r5 = h7.l.f2236a
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            m8.a r1 = r0.f51b
            j6.s r0 = r0.f50a
            c4.b.e0(r8)     // Catch: java.lang.Throwable -> L31
            goto L83
        L31:
            r8 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            m8.a r2 = r0.f51b
            j6.s r4 = r0.f50a
            c4.b.e0(r8)
            r8 = r2
            goto L64
        L44:
            c4.b.e0(r8)
            java.lang.Object r8 = r7.f3283c
            d8.u r8 = (d8.u) r8
            boolean r8 = r8.isCompleted()
            if (r8 == 0) goto L52
            return r5
        L52:
            java.lang.Object r8 = r7.f3282b
            m8.c r8 = (m8.c) r8
            r0.f50a = r7
            r0.f51b = r8
            r0.f54e = r4
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L63
            goto L80
        L63:
            r4 = r7
        L64:
            java.lang.Object r2 = r4.f3283c     // Catch: java.lang.Throwable -> L90
            d8.u r2 = (d8.u) r2     // Catch: java.lang.Throwable -> L90
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L74
            m8.c r8 = (m8.c) r8
            r8.f(r6)
            return r5
        L74:
            r0.f50a = r4     // Catch: java.lang.Throwable -> L90
            r0.f51b = r8     // Catch: java.lang.Throwable -> L90
            r0.f54e = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r4.e(r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            r1 = r8
            r0 = r4
        L83:
            java.lang.Object r8 = r0.f3283c     // Catch: java.lang.Throwable -> L31
            d8.u r8 = (d8.u) r8     // Catch: java.lang.Throwable -> L31
            r8.A(r5)     // Catch: java.lang.Throwable -> L31
            m8.c r1 = (m8.c) r1
            r1.f(r6)
            return r5
        L90:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L93:
            m8.c r1 = (m8.c) r1
            r1.f(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.s.q(n7.c):java.lang.Object");
    }

    public void r(y3.l lVar) {
        Handler handler = (Handler) this.f3283c;
        int i = lVar.f6827b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(lVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, lVar), i);
    }

    public void s() {
        y3.l lVar = (y3.l) this.f3285e;
        if (lVar != null) {
            this.f3284d = lVar;
            this.f3285e = null;
            y3.f fVar = (y3.f) lVar.f6826a.get();
            if (fVar == null) {
                this.f3284d = null;
                return;
            }
            Handler handler = y3.h.f6805x;
            handler.sendMessage(handler.obtainMessage(0, fVar.f6790a));
        }
    }

    public Object then(Task task) {
        a5.z zVar;
        a5.z zVar2;
        switch (this.f3281a) {
            case 17:
                RecaptchaAction recaptchaAction = (RecaptchaAction) this.f3283c;
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f3284d;
                String str = (String) this.f3282b;
                o oVar = (o) this.f3285e;
                if (task.isSuccessful()) {
                    return Tasks.forResult(task.getResult());
                }
                Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
                if (!zzaen.zzd(exc)) {
                    String valueOf = String.valueOf(recaptchaAction);
                    String message = exc.getMessage();
                    Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf + "with exception - " + message);
                    return Tasks.forException(exc);
                }
                if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                    Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
                }
                synchronized (firebaseAuth) {
                    zVar = firebaseAuth.j;
                }
                if (zVar == null) {
                    a5.z zVar3 = new a5.z(firebaseAuth.a, firebaseAuth);
                    synchronized (firebaseAuth) {
                        firebaseAuth.j = zVar3;
                    }
                }
                synchronized (firebaseAuth) {
                    zVar2 = firebaseAuth.j;
                }
                Task w8 = zVar2.w(str, Boolean.FALSE, recaptchaAction);
                return w8.continueWithTask(oVar).continueWithTask(new s(str, zVar2, recaptchaAction, oVar, 18));
            default:
                String str2 = (String) this.f3282b;
                if (task.isSuccessful() || !zzaen.zzc((Exception) Preconditions.checkNotNull(task.getException()))) {
                    return task;
                }
                if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                    Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str2);
                }
                return ((a5.z) this.f3283c).w(str2, Boolean.TRUE, (RecaptchaAction) this.f3284d).continueWithTask((o) this.f3285e);
        }
    }

    public String toString() {
        switch (this.f3281a) {
            case 16:
                String socket = ((Socket) this.f3282b).toString();
                kotlin.jvm.internal.j.d(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3281a = i;
        this.f3282b = obj;
        this.f3283c = obj2;
        this.f3284d = obj3;
        this.f3285e = obj4;
    }

    public s(d8.c0 c0Var, a1.d0 d0Var, a1.d dVar) {
        this.f3281a = 2;
        this.f3282b = c0Var;
        this.f3283c = dVar;
        this.f3284d = a.a.a(Integer.MAX_VALUE, null, 6);
        this.f3285e = new l6.c(1);
        e1 e1Var = (e1) c0Var.a().get(d8.b0.f1162b);
        if (e1Var != null) {
            e1Var.invokeOnCompletion(new b1(1, d0Var, this));
        }
    }

    public s(a1 a1Var, x0 x0Var, o1.b bVar) {
        this.f3281a = 9;
        kotlin.jvm.internal.j.e(a1Var, "store");
        kotlin.jvm.internal.j.e(bVar, "defaultExtras");
        this.f3282b = a1Var;
        this.f3283c = x0Var;
        this.f3284d = bVar;
        this.f3285e = new Object();
    }

    public s(Socket socket) {
        this.f3281a = 16;
        this.f3282b = socket;
        this.f3283c = new AtomicInteger();
        this.f3284d = new y8.e(this);
        this.f3285e = new y8.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(d0.p pVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i9;
        this.f3281a = 4;
        new ArrayList();
        this.f3285e = new Bundle();
        this.f3284d = pVar;
        Context context = pVar.f1024a;
        ArrayList arrayList2 = pVar.f1040t;
        ArrayList arrayList3 = pVar.f1026c;
        ArrayList arrayList4 = pVar.f1027d;
        this.f3282b = context;
        Notification.Builder builder = new Notification.Builder(context, pVar.q);
        this.f3283c = builder;
        Notification notification = pVar.f1039s;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.f1028e).setContentText(pVar.f1029f).setContentInfo(null).setContentIntent(pVar.f1030g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(pVar.i).setProgress(0, 0, false);
        IconCompat iconCompat = pVar.f1031h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.e(context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(pVar.j);
        ArrayList arrayList5 = pVar.f1025b;
        int size = arrayList5.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList5.get(i10);
            i10++;
            d0.j jVar = (d0.j) obj;
            int i11 = Build.VERSION.SDK_INT;
            if (jVar.f1014b == null && (i9 = jVar.f1017e) != 0) {
                jVar.f1014b = IconCompat.a(i9);
            }
            IconCompat iconCompat2 = jVar.f1014b;
            boolean z9 = jVar.f1015c;
            Bundle bundle3 = jVar.f1013a;
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.e(context2) : context2, jVar.f1018f, jVar.f1019g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z9);
            builder2.setAllowGeneratedReplies(z9);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i11 >= 28) {
                d0.r.a(builder2);
            }
            if (i11 >= 29) {
                d0.e.d(builder2);
            }
            if (i11 >= 31) {
                d0.s.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", jVar.f1016d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f3283c).addAction(builder2.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            context2 = null;
        }
        ArrayList arrayList8 = arrayList3;
        Bundle bundle4 = pVar.f1035n;
        if (bundle4 != null) {
            ((Bundle) this.f3285e).putAll(bundle4);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f3283c).setShowWhen(pVar.f1032k);
        ((Notification.Builder) this.f3283c).setLocalOnly(pVar.f1034m);
        ((Notification.Builder) this.f3283c).setGroup(null);
        ((Notification.Builder) this.f3283c).setSortKey(null);
        ((Notification.Builder) this.f3283c).setGroupSummary(false);
        ((Notification.Builder) this.f3283c).setCategory(null);
        ((Notification.Builder) this.f3283c).setColor(pVar.f1036o);
        ((Notification.Builder) this.f3283c).setVisibility(pVar.f1037p);
        ((Notification.Builder) this.f3283c).setPublicVersion(null);
        ((Notification.Builder) this.f3283c).setSound(notification.sound, notification.audioAttributes);
        if (i12 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw v1.a.e(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    r.f fVar = new r.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                ((Notification.Builder) this.f3283c).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (pVar.f1035n == null) {
                pVar.f1035n = new Bundle();
            }
            Bundle bundle5 = pVar.f1035n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                String num = Integer.toString(i14);
                d0.j jVar2 = (d0.j) arrayList4.get(i14);
                Bundle bundle8 = new Bundle();
                if (jVar2.f1014b == null && (i = jVar2.f1017e) != 0) {
                    jVar2.f1014b = IconCompat.a(i);
                }
                IconCompat iconCompat3 = jVar2.f1014b;
                Bundle bundle9 = jVar2.f1013a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : 0);
                bundle8.putCharSequence("title", jVar2.f1018f);
                bundle8.putParcelable("actionIntent", jVar2.f1019g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jVar2.f1015c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", jVar2.f1016d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (pVar.f1035n == null) {
                pVar.f1035n = new Bundle();
            }
            pVar.f1035n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f3285e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f3283c).setExtras(pVar.f1035n);
        ((Notification.Builder) this.f3283c).setRemoteInputHistory(null);
        ((Notification.Builder) this.f3283c).setBadgeIconType(0);
        ((Notification.Builder) this.f3283c).setSettingsText(null);
        ((Notification.Builder) this.f3283c).setShortcutId(null);
        ((Notification.Builder) this.f3283c).setTimeoutAfter(0L);
        ((Notification.Builder) this.f3283c).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(pVar.q)) {
            ((Notification.Builder) this.f3283c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i15 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw v1.a.e(it2);
            }
        }
        if (i15 >= 29) {
            d0.e.b((Notification.Builder) this.f3283c, pVar.f1038r);
            d0.e.c((Notification.Builder) this.f3283c);
        }
    }

    public s(Typeface typeface, h1.b bVar) {
        int i;
        int i9;
        int i10;
        int i11;
        this.f3281a = 6;
        this.f3285e = typeface;
        this.f3282b = bVar;
        this.f3284d = new g1.r(1024);
        int b10 = bVar.b(6);
        if (b10 != 0) {
            int i12 = b10 + bVar.f2144a;
            i = ((ByteBuffer) bVar.f2147d).getInt(((ByteBuffer) bVar.f2147d).getInt(i12) + i12);
        } else {
            i = 0;
        }
        this.f3283c = new char[i * 2];
        int b11 = bVar.b(6);
        if (b11 != 0) {
            int i13 = b11 + bVar.f2144a;
            i9 = ((ByteBuffer) bVar.f2147d).getInt(((ByteBuffer) bVar.f2147d).getInt(i13) + i13);
        } else {
            i9 = 0;
        }
        for (int i14 = 0; i14 < i9; i14++) {
            g1.u uVar = new g1.u(this, i14);
            h1.a b12 = uVar.b();
            int b13 = b12.b(4);
            Character.toChars(b13 != 0 ? ((ByteBuffer) b12.f2147d).getInt(b13 + b12.f2144a) : 0, (char[]) this.f3283c, i14 * 2);
            h1.a b14 = uVar.b();
            int b15 = b14.b(16);
            if (b15 != 0) {
                int i15 = b15 + b14.f2144a;
                i10 = ((ByteBuffer) b14.f2147d).getInt(((ByteBuffer) b14.f2147d).getInt(i15) + i15);
            } else {
                i10 = 0;
            }
            p0.e.b("invalid metadata codepoint length", i10 > 0);
            g1.r rVar = (g1.r) this.f3284d;
            h1.a b16 = uVar.b();
            int b17 = b16.b(16);
            if (b17 != 0) {
                int i16 = b17 + b16.f2144a;
                i11 = ((ByteBuffer) b16.f2147d).getInt(((ByteBuffer) b16.f2147d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            rVar.a(uVar, 0, i11 - 1);
        }
    }

    public s(int i) {
        this.f3281a = i;
        switch (i) {
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                this.f3282b = new p0.c(10);
                this.f3283c = new r.j(0);
                this.f3284d = new ArrayList();
                this.f3285e = new HashSet();
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                this.f3282b = new r.j(0);
                this.f3283c = new SparseArray();
                this.f3284d = new r.g();
                this.f3285e = new r.j(0);
                return;
            case 15:
                this.f3282b = new Object();
                this.f3283c = new Handler(Looper.getMainLooper(), new y3.k(this));
                return;
            default:
                this.f3282b = null;
                this.f3283c = null;
                this.f3284d = null;
                this.f3285e = new ArrayDeque();
                return;
        }
    }

    public s(Context context, ActionMode.Callback callback) {
        this.f3281a = 7;
        this.f3283c = context;
        this.f3282b = callback;
        this.f3284d = new ArrayList();
        this.f3285e = new r.j(0);
    }

    public s(a1.g0 g0Var, List list) {
        this.f3281a = 1;
        this.f3285e = g0Var;
        this.f3282b = m8.d.a();
        this.f3283c = d8.f0.a();
        this.f3284d = i7.i.j0(list);
    }
}
