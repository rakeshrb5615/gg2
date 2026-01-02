package a5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f569a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f570b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f571c;

    /* renamed from: d  reason: collision with root package name */
    public final int f572d;

    /* renamed from: e  reason: collision with root package name */
    public final int f573e;

    /* renamed from: f  reason: collision with root package name */
    public final f f574f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f575g;

    public c(String str, Set set, Set set2, int i, int i9, f fVar, Set set3) {
        this.f569a = str;
        this.f570b = Collections.unmodifiableSet(set);
        this.f571c = Collections.unmodifiableSet(set2);
        this.f572d = i;
        this.f573e = i9;
        this.f574f = fVar;
        this.f575g = Collections.unmodifiableSet(set3);
    }

    public static b a(x xVar) {
        return new b(xVar, new x[0]);
    }

    public static b b(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static c c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(x.a(cls));
        for (Class cls2 : clsArr) {
            q4.b.f(cls2, "Null interface");
            hashSet.add(x.a(cls2));
        }
        return new c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(obj, 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f570b.toArray()) + ">{" + this.f572d + ", type=" + this.f573e + ", deps=" + Arrays.toString(this.f571c.toArray()) + "}";
    }
}
