package p0;

import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f5059a;

    /* renamed from: b  reason: collision with root package name */
    public int f5060b;

    public c(int i) {
        if (i > 0) {
            this.f5059a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        int i = this.f5060b;
        if (i > 0) {
            int i9 = i - 1;
            Object[] objArr = this.f5059a;
            Object obj = objArr[i9];
            j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            objArr[i9] = null;
            this.f5060b--;
            return obj;
        }
        return null;
    }

    public void b(u.b bVar) {
        int i = this.f5060b;
        Object[] objArr = this.f5059a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.f5060b = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z9;
        j.e(obj, "instance");
        int i = this.f5060b;
        int i9 = 0;
        while (true) {
            objArr = this.f5059a;
            if (i9 >= i) {
                z9 = false;
                break;
            } else if (objArr[i9] == obj) {
                z9 = true;
                break;
            } else {
                i9++;
            }
        }
        if (z9) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f5060b;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.f5060b = i10 + 1;
            return true;
        }
        return false;
    }

    public c() {
        this.f5059a = new Object[256];
    }
}
