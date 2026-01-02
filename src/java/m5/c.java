package m5;

import a1.h;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.g0;
import b8.g;
import d5.e;
import h5.f;
import i5.d;
import i5.n;
import j5.z0;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import r6.c0;
import r6.c1;
import r6.g1;
import r6.p0;
import r6.t0;
import u6.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c implements t6.b, t2.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4018a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4019b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4020c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4021d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4022e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4023f;

    /* renamed from: m  reason: collision with root package name */
    public final Object f4024m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f4025n;

    public /* synthetic */ c(g7.a aVar, g7.a aVar2, g7.a aVar3, g7.a aVar4, g7.a aVar5, g7.a aVar6, g7.a aVar7, int i) {
        this.f4018a = i;
        this.f4019b = aVar;
        this.f4020c = aVar2;
        this.f4021d = aVar3;
        this.f4022e = aVar4;
        this.f4023f = aVar5;
        this.f4024m = aVar6;
        this.f4025n = aVar7;
    }

    public static synchronized void c(File file) {
        synchronized (c.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f4020c, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f4022e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void f(String str) {
        n nVar = (n) this.f4023f;
        synchronized (nVar) {
            try {
                if (((d) ((AtomicMarkableReference) nVar.f2731b).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) nVar.f2731b;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), true);
                    Runnable g0Var = new g0(nVar, 8);
                    AtomicReference atomicReference = (AtomicReference) nVar.f2732c;
                    while (!atomicReference.compareAndSet(null, g0Var)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((f) ((c) nVar.f2733d).f4021d).f2218b.a(g0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o5.d] */
    @Override // g7.a
    public Object get() {
        switch (this.f4018a) {
            case 2:
                return new c1((k) ((g7.a) this.f4019b).get(), (t0) ((g7.a) this.f4020c).get(), (p0) ((g7.a) this.f4021d).get(), (g1) ((g7.a) this.f4022e).get(), (h) ((g7.a) this.f4023f).get(), (c0) ((t6.c) this.f4024m).get(), (l7.h) ((g7.a) this.f4025n).get());
            default:
                Object obj = new Object();
                Object obj2 = new Object();
                ?? obj3 = new Object();
                obj3.f5021a = (Context) ((g7.a) this.f4019b).get();
                obj3.f5022b = (s2.d) ((g7.a) this.f4020c).get();
                obj3.f5023c = (y2.d) ((g7.a) this.f4021d).get();
                obj3.f5024d = (g) ((g) this.f4022e).get();
                obj3.f5025e = (Executor) ((g7.a) this.f4023f).get();
                obj3.f5026f = (z2.c) ((g7.a) this.f4024m).get();
                obj3.f5027g = obj;
                obj3.f5028h = obj2;
                obj3.i = (y2.c) ((g7.a) this.f4025n).get();
                return obj3;
        }
    }

    public c(Context context) {
        String str;
        String replaceAll;
        this.f4018a = 0;
        String str2 = ((z0) e.f1127a.b(context)).f3204a;
        this.f4019b = str2;
        File filesDir = context.getFilesDir();
        this.f4020c = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = g5.g.h(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f4021d = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f4022e = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f4023f = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f4024m = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f4025n = file5;
    }

    public c(String str, c cVar, f fVar) {
        this.f4018a = 1;
        this.f4022e = new n(this, false);
        this.f4023f = new n(this, true);
        this.f4024m = new h.f(3);
        this.f4025n = new AtomicMarkableReference(null, false);
        this.f4019b = str;
        this.f4020c = new i5.g(cVar);
        this.f4021d = fVar;
    }
}
