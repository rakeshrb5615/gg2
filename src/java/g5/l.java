package g5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j5.c2;
import j5.q0;
import j5.r0;
import j5.t0;
import j5.u0;
import j5.v0;
import j5.z0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f1798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f1799b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f1800c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o5.d f1801d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f1802e;

    public l(n nVar, long j, Throwable th, Thread thread, o5.d dVar) {
        this.f1802e = nVar;
        this.f1798a = j;
        this.f1799b = th;
        this.f1800c = thread;
        this.f1801d = dVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, j5.o0] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Thread thread;
        long j = this.f1798a;
        long j8 = j / 1000;
        n nVar = this.f1802e;
        NavigableSet c9 = ((m5.a) nVar.f1817m.f620b).c();
        String str = !c9.isEmpty() ? (String) c9.first() : null;
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult((Object) null);
        }
        nVar.f1809c.k();
        a5.z zVar = nVar.f1817m;
        zVar.getClass();
        String concat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        t tVar = (t) zVar.f619a;
        Context context = tVar.f1846a;
        int i = context.getResources().getConfiguration().orientation;
        n0.a aVar = tVar.f1849d;
        Stack stack = new Stack();
        for (Throwable th = this.f1799b; th != null; th = th.getCause()) {
            stack.push(th);
        }
        j6.s sVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            sVar = new j6.s(th2.getLocalizedMessage(), th2.getClass().getName(), aVar.f(th2.getStackTrace()), sVar, 10);
        }
        j6.s sVar2 = sVar;
        ?? obj = new Object();
        obj.f3096b = "crash";
        obj.f3095a = j8;
        obj.f3101g = (byte) (obj.f3101g | 1);
        c2 b10 = d5.e.f1127a.b(context);
        int i9 = ((z0) b10).f3206c;
        Boolean valueOf = i9 > 0 ? Boolean.valueOf(i9 != 100) : null;
        ArrayList a10 = d5.e.a(context);
        byte b11 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar2.f3284d;
        Thread thread2 = this.f1800c;
        String name = thread2.getName();
        if (name != null) {
            byte b12 = (byte) 1;
            List d9 = t.d(stackTraceElementArr, 4);
            if (d9 != null) {
                if (b12 != 1) {
                    StringBuilder sb = new StringBuilder();
                    if (b12 == 0) {
                        sb.append(" importance");
                    }
                    throw new IllegalStateException(g2.g.g("Missing required properties:", sb));
                }
                String str2 = str;
                arrayList.add(new v0(name, 4, d9));
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    Thread key = entry.getKey();
                    if (key.equals(thread2)) {
                        thread = thread2;
                    } else {
                        StackTraceElement[] f9 = aVar.f(entry.getValue());
                        String name2 = key.getName();
                        if (name2 == null) {
                            throw new NullPointerException("Null name");
                        }
                        List d10 = t.d(f9, 0);
                        if (d10 == null) {
                            throw new NullPointerException("Null frames");
                        }
                        if (b12 != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            if (b12 == 0) {
                                sb2.append(" importance");
                            }
                            throw new IllegalStateException(g2.g.g("Missing required properties:", sb2));
                        }
                        thread = thread2;
                        arrayList.add(new v0(name2, 0, d10));
                    }
                    thread2 = thread;
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                t0 c10 = t.c(sVar2, 0);
                u0 e9 = t.e();
                List a11 = tVar.a();
                if (a11 != null) {
                    r0 r0Var = new r0(unmodifiableList, c10, null, e9, a11);
                    if (b11 != 1) {
                        StringBuilder sb3 = new StringBuilder();
                        if (b11 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(g2.g.g("Missing required properties:", sb3));
                    }
                    obj.f3097c = new q0(r0Var, null, null, valueOf, b10, a10, i);
                    obj.f3098d = tVar.b(i);
                    m5.c cVar = (m5.c) zVar.f623e;
                    ((m5.a) zVar.f620b).d(a5.z.j(a5.z.i(obj.a(), (i5.e) zVar.f622d, cVar, i7.o.f2746a), cVar), str2, true);
                    try {
                        m5.c cVar2 = nVar.f1813g;
                        String str3 = ".ae" + j;
                        cVar2.getClass();
                        if (!new File((File) cVar2.f4021d, str3).createNewFile()) {
                            throw new IOException("Create new file failed.");
                        }
                    } catch (IOException e10) {
                        Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
                    }
                    o5.d dVar = this.f1801d;
                    nVar.b(false, dVar, false);
                    nVar.c(new e().f1784a, Boolean.FALSE);
                    return !nVar.f1808b.a() ? Tasks.forResult((Object) null) : ((TaskCompletionSource) ((AtomicReference) dVar.i).get()).getTask().onSuccessTask(nVar.f1811e.f2217a, new l6.c(this, str2));
                }
                throw new NullPointerException("Null binaries");
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }
}
