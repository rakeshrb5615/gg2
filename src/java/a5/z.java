package a5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.firebase-auth-api.zzac;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import j5.a0;
import j5.b0;
import j5.c1;
import j5.f0;
import j5.f1;
import j5.g1;
import j5.j2;
import j5.o0;
import j5.p0;
import j5.q0;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import n.n2;
import n.t2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class z implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f619a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f620b;

    /* renamed from: c  reason: collision with root package name */
    public Object f621c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f622d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f623e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f624f;

    public z(q4.f fVar, FirebaseAuth firebaseAuth) {
        Object obj = new Object();
        this.f619a = new Object();
        this.f620b = new HashMap();
        this.f622d = fVar;
        this.f623e = firebaseAuth;
        this.f624f = obj;
    }

    public static p0 i(p0 p0Var, i5.e eVar, m5.c cVar, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        o0 a10 = p0Var.a();
        String b10 = ((i5.c) eVar.f2710b).b();
        if (b10 != null) {
            a10.f3099e = new c1(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        i5.n nVar = (i5.n) cVar.f4022e;
        if (map.isEmpty()) {
            i5.d dVar = (i5.d) ((AtomicMarkableReference) nVar.f2731b).getReference();
            synchronized (dVar) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(dVar.f2705a));
            }
        } else {
            i5.d dVar2 = (i5.d) ((AtomicMarkableReference) nVar.f2731b).getReference();
            synchronized (dVar2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar2.f2705a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String a11 = i5.d.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a11)) {
                    hashMap.put(a11, i5.d.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List q = q(unmodifiableMap2);
        i5.d dVar3 = (i5.d) ((AtomicMarkableReference) ((i5.n) cVar.f4023f).f2731b).getReference();
        synchronized (dVar3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(dVar3.f2705a));
        }
        List q9 = q(unmodifiableMap3);
        if (!q.isEmpty() || !q9.isEmpty()) {
            q0 q0Var = (q0) p0Var.f3108c;
            a10.f3097c = new q0(q0Var.f3118a, q, q9, q0Var.f3121d, q0Var.f3122e, q0Var.f3123f, q0Var.f3124g);
        }
        return a10.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, j5.d1] */
    public static j2 j(p0 p0Var, m5.c cVar) {
        List d9 = ((h.f) cVar.f4024m).d();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d9.size(); i++) {
            i5.m mVar = (i5.m) d9.get(i);
            mVar.getClass();
            ?? obj = new Object();
            i5.b bVar = (i5.b) mVar;
            String str = bVar.f2703e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f2700b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            obj.f2941a = new f1(str2, str);
            String str3 = bVar.f2701c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            obj.f2942b = str3;
            String str4 = bVar.f2702d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            obj.f2943c = str4;
            obj.f2944d = bVar.f2704f;
            obj.f2945e = (byte) (obj.f2945e | 1);
            arrayList.add(obj.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 a10 = p0Var.a();
        a10.f3100f = new g1(arrayList);
        return a10.a();
    }

    public static boolean k(int[] iArr, int i) {
        for (int i9 : iArr) {
            if (i9 == i) {
                return true;
            }
        }
        return false;
    }

    public static String l(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static z m(Context context, g5.y yVar, m5.c cVar, g5.a aVar, i5.e eVar, m5.c cVar2, n0.a aVar2, o5.d dVar, k2.c cVar3, g5.k kVar, h5.f fVar) {
        g5.t tVar = new g5.t(context, yVar, aVar, aVar2, dVar);
        m5.a aVar3 = new m5.a(cVar, dVar, kVar);
        k5.a aVar4 = n5.a.f4864b;
        r2.r.b(context);
        return new z(tVar, aVar3, new n5.a(new n5.c(r2.r.a().c(new p2.a(n5.a.f4865c, n5.a.f4866d)).a("FIREBASE_CRASHLYTICS_REPORT", new o2.c("json"), n5.a.f4867e), dVar.b(), cVar3)), eVar, cVar2, yVar, fVar);
    }

    public static ColorStateList n(Context context, int i) {
        int c9 = t2.c(context, 2130968848);
        int b10 = t2.b(context, 2130968843);
        int[] iArr = t2.f4302b;
        int[] iArr2 = t2.f4304d;
        int e9 = h0.a.e(c9, i);
        return new ColorStateList(new int[][]{iArr, iArr2, t2.f4303c, t2.f4306f}, new int[]{b10, e9, h0.a.e(c9, i), i});
    }

    public static LayerDrawable p(n2 n2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c9 = n2Var.c(context, 2131231043);
        Drawable c10 = n2Var.c(context, 2131231044);
        if ((c9 instanceof BitmapDrawable) && c9.getIntrinsicWidth() == dimensionPixelSize && c9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c9;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c9.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c10 instanceof BitmapDrawable) && c10.getIntrinsicWidth() == dimensionPixelSize && c10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static List q(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new f0(str, str2));
        }
        Collections.sort(arrayList, new g5.i(1));
        return Collections.unmodifiableList(arrayList);
    }

    public static void u(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = n.u.f4308b;
        }
        mutate.setColorFilter(n.u.c(i, mode));
    }

    @Override // a5.d
    public Object a(Class cls) {
        if (!((Set) this.f619a).contains(x.a(cls))) {
            throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a10 = ((d) this.f624f).a(cls);
        if (cls.equals(x5.b.class)) {
            x5.b bVar = (x5.b) a10;
            return new Object();
        }
        return a10;
    }

    @Override // a5.d
    public c6.b b(x xVar) {
        if (((Set) this.f620b).contains(xVar)) {
            return ((d) this.f624f).b(xVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + xVar + ">.");
    }

    @Override // a5.d
    public Set c(x xVar) {
        if (((Set) this.f622d).contains(xVar)) {
            return ((d) this.f624f).c(xVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + xVar + ">.");
    }

    @Override // a5.d
    public c6.b d(x xVar) {
        if (((Set) this.f623e).contains(xVar)) {
            return ((d) this.f624f).d(xVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + xVar + ">>.");
    }

    @Override // a5.d
    public Object e(x xVar) {
        if (((Set) this.f619a).contains(xVar)) {
            return ((d) this.f624f).e(xVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + xVar + ".");
    }

    @Override // a5.d
    public c6.b f(Class cls) {
        return b(x.a(cls));
    }

    @Override // a5.d
    public v g(x xVar) {
        if (((Set) this.f621c).contains(xVar)) {
            return ((d) this.f624f).g(xVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + xVar + ">.");
    }

    @Override // a5.d
    public v h(Class cls) {
        return g(x.a(cls));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public Task o(Task task) {
        return task.continueWith((Executor) new Object(), new a(this, 10));
    }

    public ColorStateList r(Context context, int i) {
        if (i == 2131231000) {
            return e0.c.getColorStateList(context, 2131099669);
        }
        if (i == 2131231046) {
            return e0.c.getColorStateList(context, 2131099672);
        }
        if (i != 2131231045) {
            if (i == 2131230988) {
                return n(context, t2.c(context, 2130968843));
            }
            if (i == 2131230982) {
                return n(context, 0);
            }
            if (i == 2131230987) {
                return n(context, t2.c(context, 2130968841));
            }
            if (i == 2131231041 || i == 2131231042) {
                return e0.c.getColorStateList(context, 2131099671);
            }
            if (k((int[]) this.f620b, i)) {
                return t2.d(context, 2130968849);
            }
            if (k((int[]) this.f623e, i)) {
                return e0.c.getColorStateList(context, 2131099668);
            }
            if (k((int[]) this.f624f, i)) {
                return e0.c.getColorStateList(context, 2131099667);
            }
            if (i == 2131231038) {
                return e0.c.getColorStateList(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList d9 = t2.d(context, 2130968900);
        if (d9 == null || !d9.isStateful()) {
            iArr[0] = t2.f4302b;
            iArr2[0] = t2.b(context, 2130968900);
            iArr[1] = t2.f4305e;
            iArr2[1] = t2.c(context, 2130968847);
            iArr[2] = t2.f4306f;
            iArr2[2] = t2.c(context, 2130968900);
        } else {
            int[] iArr3 = t2.f4302b;
            iArr[0] = iArr3;
            iArr2[0] = d9.getColorForState(iArr3, 0);
            iArr[1] = t2.f4305e;
            iArr2[1] = t2.c(context, 2130968847);
            iArr[2] = t2.f4306f;
            iArr2[2] = d9.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public Task s(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList b10 = ((m5.a) this.f620b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i = 0;
        while (i < size) {
            int i9 = i + 1;
            File file = (File) b10.get(i);
            try {
                k5.a aVar = m5.a.f4011g;
                String e9 = m5.a.e(file);
                aVar.getClass();
                arrayList.add(new g5.b(k5.a.i(e9), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i = i9;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            g5.b bVar = (g5.b) obj;
            if (str == null || str.equals(bVar.f1774b)) {
                n5.a aVar2 = (n5.a) this.f621c;
                b0 b0Var = bVar.f1773a;
                if (b0Var.f2898f == null || b0Var.f2899g == null) {
                    g5.x b11 = ((g5.y) this.f624f).b(true);
                    b0 b0Var2 = bVar.f1773a;
                    String str2 = b11.f1864a;
                    a0 a10 = b0Var2.a();
                    a10.f2872e = str2;
                    b0 a11 = a10.a();
                    String str3 = b11.f1865b;
                    a0 a12 = a11.a();
                    a12.f2873f = str3;
                    bVar = new g5.b(a12.a(), bVar.f1774b, bVar.f1775c);
                }
                boolean z9 = str != null;
                n5.c cVar = aVar2.f4868a;
                synchronized (cVar.f4878f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z9) {
                            ((AtomicInteger) cVar.i.f3363b).getAndIncrement();
                            if (cVar.f4878f.size() < cVar.f4877e) {
                                d5.d dVar = d5.d.f1126a;
                                dVar.b("Enqueueing report: " + bVar.f1774b);
                                dVar.b("Queue size: " + cVar.f4878f.size());
                                cVar.f4879g.execute(new n0.l(cVar, bVar, taskCompletionSource));
                                dVar.b("Closing task for report: " + bVar.f1774b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f1774b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.i.f3364c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new t(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.z.t(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public Task v(String str, String str2, Bundle bundle) {
        try {
            t(str, str2, bundle);
            return ((Rpc) this.f621c).send(bundle);
        } catch (InterruptedException | ExecutionException e9) {
            return Tasks.forException(e9);
        }
    }

    public Task w(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task continueWithTask;
        if (zzac.zzc(str)) {
            str = "*";
        }
        Task x9 = x(str);
        if (bool.booleanValue() || x9 == null) {
            String str2 = zzac.zzc(str) ? "*" : str;
            if (bool.booleanValue() || (continueWithTask = x(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f623e;
                continueWithTask = firebaseAuth.e.zza(firebaseAuth.i, "RECAPTCHA_ENTERPRISE").continueWithTask(new n0.a(this, str2));
            }
            x9 = continueWithTask;
        }
        return x9.continueWithTask(new j6.o(this, recaptchaAction));
    }

    public Task x(String str) {
        Task task;
        synchronized (this.f619a) {
            task = (Task) ((HashMap) this.f620b).get(str);
        }
        return task;
    }

    public z(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<m> set = cVar.f571c;
        Set set2 = cVar.f575g;
        for (m mVar : set) {
            int i = mVar.f600c;
            int i9 = mVar.f599b;
            boolean z9 = i == 0;
            x xVar = mVar.f598a;
            if (z9) {
                if (i9 == 2) {
                    hashSet4.add(xVar);
                } else {
                    hashSet.add(xVar);
                }
            } else if (i == 2) {
                hashSet3.add(xVar);
            } else if (i9 == 2) {
                hashSet5.add(xVar);
            } else {
                hashSet2.add(xVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(x.a(x5.b.class));
        }
        this.f619a = Collections.unmodifiableSet(hashSet);
        this.f620b = Collections.unmodifiableSet(hashSet2);
        this.f621c = Collections.unmodifiableSet(hashSet3);
        this.f622d = Collections.unmodifiableSet(hashSet4);
        this.f623e = Collections.unmodifiableSet(hashSet5);
        this.f624f = dVar;
    }

    public z() {
        this.f619a = new int[]{2131231056, 2131231054, 2131230980};
        this.f620b = new int[]{2131231004, 2131231039, 2131231011, 2131231006, 2131231007, 2131231010, 2131231009};
        this.f621c = new int[]{2131231053, 2131231055, 2131230997, 2131231049, 2131231050, 2131231051, 2131231052};
        this.f622d = new int[]{2131231029, 2131230995, 2131231028};
        this.f623e = new int[]{2131231047, 2131231057};
        this.f624f = new int[]{2131230983, 2131230989, 2131230984, 2131230990};
    }

    public z(g5.t tVar, m5.a aVar, n5.a aVar2, i5.e eVar, m5.c cVar, g5.y yVar, h5.f fVar) {
        this.f619a = tVar;
        this.f620b = aVar;
        this.f621c = aVar2;
        this.f622d = eVar;
        this.f623e = cVar;
        this.f624f = yVar;
    }

    public z(q4.f fVar, h3.k kVar, c6.b bVar, c6.b bVar2, d6.d dVar) {
        fVar.a();
        Rpc rpc = new Rpc(fVar.f5386a);
        this.f619a = fVar;
        this.f620b = kVar;
        this.f621c = rpc;
        this.f622d = bVar;
        this.f623e = bVar2;
        this.f624f = dVar;
    }
}
