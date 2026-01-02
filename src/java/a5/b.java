package a5;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f562a = null;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f563b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f564c;

    /* renamed from: d  reason: collision with root package name */
    public int f565d;

    /* renamed from: e  reason: collision with root package name */
    public int f566e;

    /* renamed from: f  reason: collision with root package name */
    public f f567f;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f568g;

    public b(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f563b = hashSet;
        this.f564c = new HashSet();
        this.f565d = 0;
        this.f566e = 0;
        this.f568g = new HashSet();
        hashSet.add(x.a(cls));
        for (Class cls2 : clsArr) {
            q4.b.f(cls2, "Null interface");
            this.f563b.add(x.a(cls2));
        }
    }

    public final void a(m mVar) {
        if (this.f563b.contains(mVar.f598a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f564c.add(mVar);
    }

    public final c b() {
        if (this.f567f != null) {
            return new c(this.f562a, new HashSet(this.f563b), new HashSet(this.f564c), this.f565d, this.f566e, this.f567f, this.f568g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i) {
        if (!(this.f565d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f565d = i;
    }

    public b(x xVar, x[] xVarArr) {
        HashSet hashSet = new HashSet();
        this.f563b = hashSet;
        this.f564c = new HashSet();
        this.f565d = 0;
        this.f566e = 0;
        this.f568g = new HashSet();
        hashSet.add(xVar);
        for (x xVar2 : xVarArr) {
            q4.b.f(xVar2, "Null interface");
        }
        Collections.addAll(this.f563b, xVarArr);
    }
}
