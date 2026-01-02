package q4;

import a5.r;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import b5.n;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f5384k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final r.e f5385l = new r.j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f5386a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5387b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5388c;

    /* renamed from: d  reason: collision with root package name */
    public final a5.j f5389d;

    /* renamed from: g  reason: collision with root package name */
    public final r f5392g;

    /* renamed from: h  reason: collision with root package name */
    public final c6.b f5393h;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f5390e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f5391f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [a6.e, java.lang.Object] */
    public f(Context context, String str, j jVar) {
        ?? arrayList;
        this.f5386a = (Context) Preconditions.checkNotNull(context);
        this.f5387b = Preconditions.checkNotEmpty(str);
        this.f5388c = (j) Preconditions.checkNotNull(jVar);
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (String str3 : arrayList) {
            arrayList2.add(new a5.e(str3, 0));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        n nVar = n.f759a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new a5.e(new FirebaseCommonRegistrar(), 1));
        arrayList3.add(new a5.e(new ExecutorsRegistrar(), 1));
        arrayList4.add(a5.c.c(context, Context.class, new Class[0]));
        arrayList4.add(a5.c.c(this, f.class, new Class[0]));
        arrayList4.add(a5.c.c(jVar, j.class, new Class[0]));
        ?? obj = new Object();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.b.get()) {
            arrayList4.add(a5.c.c(aVar, a.class, new Class[0]));
        }
        a5.j jVar2 = new a5.j(arrayList3, arrayList4, obj);
        this.f5389d = jVar2;
        Trace.endSection();
        this.f5392g = new r(new a5.h(2, this, context));
        this.f5393h = jVar2.f(a6.d.class);
        c cVar = new c(this);
        a();
        if (this.f5390e.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        this.i.add(cVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f5384k) {
            try {
                Iterator it = ((r.d) f5385l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    fVar.a();
                    arrayList.add(fVar.f5387b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static f d() {
        f fVar;
        synchronized (f5384k) {
            try {
                fVar = (f) f5385l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((a6.d) fVar.f5393h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f e(String str) {
        f fVar;
        ArrayList c9;
        String str2;
        synchronized (f5384k) {
            try {
                fVar = (f) f5385l.get(str.trim());
                if (fVar == null) {
                    if (c().isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", c9);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((a6.d) fVar.f5393h.get()).a();
            } finally {
            }
        }
        return fVar;
    }

    public static f h(Context context) {
        synchronized (f5384k) {
            try {
                if (f5385l.containsKey("[DEFAULT]")) {
                    return d();
                }
                j a10 = j.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, a10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener, java.lang.Object] */
    public static f i(Context context, j jVar) {
        f fVar;
        AtomicReference atomicReference = d.f5381a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f5381a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet(null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener((BackgroundDetector.BackgroundStateChangeListener) obj);
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5384k) {
            r.e eVar = f5385l;
            Preconditions.checkState(!eVar.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", jVar);
            eVar.put("[DEFAULT]", fVar);
        }
        fVar.g();
        return fVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f5391f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.f5389d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            fVar.a();
            return this.f5387b.equals(fVar.f5387b);
        }
        return false;
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f5387b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f5388c.f5400b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap hashMap;
        if (!((UserManager) this.f5386a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f5387b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f5386a;
            AtomicReference atomicReference = e.f5382b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f5387b);
        Log.i("FirebaseApp", sb2.toString());
        a5.j jVar = this.f5389d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f5387b);
        AtomicReference atomicReference2 = jVar.f591f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet(null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (jVar) {
                    hashMap = new HashMap(jVar.f586a);
                }
                jVar.i(hashMap, equals);
                break;
            }
        }
        ((a6.d) this.f5393h.get()).a();
    }

    public final int hashCode() {
        return this.f5387b.hashCode();
    }

    public final boolean j() {
        boolean z9;
        a();
        h6.a aVar = (h6.a) this.f5392g.get();
        synchronized (aVar) {
            z9 = aVar.f2220a;
        }
        return z9;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f5387b).add("options", this.f5388c).toString();
    }
}
