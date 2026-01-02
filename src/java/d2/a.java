package d2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import j5.t1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f1068d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f1069e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f1072c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f1071b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1070a = new HashMap();

    public a(Context context) {
        this.f1072c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1068d == null) {
            synchronized (f1069e) {
                try {
                    if (f1068d == null) {
                        f1068d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1068d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1072c.getString(2131951683);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1071b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f1070a;
        if (t1.I()) {
            try {
                t1.c(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            String name = cls.getName();
            throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
            List<Class> a10 = bVar.a();
            if (!a10.isEmpty()) {
                for (Class cls2 : a10) {
                    if (!hashMap.containsKey(cls2)) {
                        b(cls2, hashSet);
                    }
                }
            }
            obj = bVar.b(this.f1072c);
            hashSet.remove(cls);
            hashMap.put(cls, obj);
        }
        Trace.endSection();
        return obj;
    }
}
