package b5;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import d8.a0;
import d8.f0;
import d8.z0;
import j6.o;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import z4.w;
import z8.v;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* renamed from: b  reason: collision with root package name */
    public Object f751b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f752c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f750a = i;
        this.f751b = obj;
        this.f752c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        ((java.lang.Runnable) r10.f751b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        b5.m.f753f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f751b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f752c     // Catch: java.lang.Throwable -> L58
            b5.m r2 = (b5.m) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f755b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f752c     // Catch: java.lang.Throwable -> L20
            b5.m r0 = (b5.m) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f756c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f757d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f757d = r6     // Catch: java.lang.Throwable -> L20
            r0.f756c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f752c     // Catch: java.lang.Throwable -> L20
            b5.m r4 = (b5.m) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f755b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f751b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f752c     // Catch: java.lang.Throwable -> L20
            b5.m r0 = (b5.m) r0     // Catch: java.lang.Throwable -> L20
            r0.f756c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f751b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f751b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = b5.m.f753f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f751b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f751b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.l.a():void");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [y4.g, z4.w] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f750a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e9) {
                    synchronized (((m) this.f752c).f755b) {
                        ((m) this.f752c).f756c = 1;
                        throw e9;
                    }
                }
            case 1:
                ((d0.b) this.f751b).f998a = this.f752c;
                return;
            case 2:
                ((Application) this.f751b).unregisterActivityLifecycleCallbacks((d0.b) this.f752c);
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                Object obj = this.f752c;
                Object obj2 = this.f751b;
                try {
                    Method method = d0.c.f1007d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d0.c.f1008e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                ((d8.n) this.f752c).B((z0) this.f751b);
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                ((d8.n) this.f751b).B((e8.c) this.f752c);
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                i8.g gVar = (i8.g) this.f752c;
                a0 a0Var = gVar.f2778d;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f751b).run();
                    } catch (Throwable th2) {
                        f0.l(th2, l7.i.f3796a);
                    }
                    Runnable y9 = gVar.y();
                    if (y9 == null) {
                        return;
                    }
                    this.f751b = y9;
                    i++;
                    if (i >= 16 && a0Var.s(gVar)) {
                        a0Var.i(gVar, this);
                        return;
                    }
                }
                break;
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                Typeface typeface = (Typeface) this.f752c;
                g0.b bVar = (g0.b) ((l6.c) this.f751b).f3791b;
                if (bVar != null) {
                    bVar.i(typeface);
                    return;
                }
                return;
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                ((n0.f) this.f751b).accept(this.f752c);
                return;
            case 9:
                p4.a aVar = (p4.a) this.f752c;
                try {
                    aVar.onSuccess(a.a.v((p4.b) this.f751b));
                    return;
                } catch (Error e11) {
                    e = e11;
                    aVar.onFailure(e);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    aVar.onFailure(e);
                    return;
                } catch (ExecutionException e13) {
                    aVar.onFailure(e13.getCause());
                    return;
                }
            case 10:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(q4.f.e((String) this.f751b));
                y4.l lVar = firebaseAuth.f;
                if (lVar != null) {
                    zzahv zzahvVar = ((z4.e) lVar).f7325a;
                    zzahvVar.zzg();
                    Task zza = firebaseAuth.e.zza(firebaseAuth.a, lVar, zzahvVar.zzd(), (w) new y4.g(firebaseAuth, 1));
                    z4.i.f7350e.v("Token refreshing started", new Object[0]);
                    zza.addOnFailureListener(new o(this, 23));
                    return;
                }
                return;
            default:
                q4.b.C((v) this.f751b).resumeWith(c4.b.p((Throwable) this.f752c));
                return;
        }
    }

    public String toString() {
        switch (this.f750a) {
            case 0:
                Runnable runnable = (Runnable) this.f751b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((m) this.f752c).f756c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            case 9:
                b8.g gVar = new b8.g(getClass().getSimpleName());
                k2.c cVar = new k2.c(29, false);
                ((k2.c) gVar.f791d).f3364c = cVar;
                gVar.f791d = cVar;
                cVar.f3363b = (p4.a) this.f752c;
                return gVar.toString();
            default:
                return super.toString();
        }
    }

    public l(z4.i iVar, String str) {
        this.f750a = 10;
        this.f752c = iVar;
        this.f751b = Preconditions.checkNotEmpty(str);
    }

    public l(i8.g gVar, Runnable runnable) {
        this.f750a = 6;
        this.f752c = gVar;
        this.f751b = runnable;
    }

    public l(m mVar) {
        this.f750a = 0;
        this.f752c = mVar;
    }
}
