package h1;

import android.os.Build;
import android.view.View;
import j7.f;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f2144a;

    /* renamed from: b  reason: collision with root package name */
    public int f2145b;

    /* renamed from: c  reason: collision with root package name */
    public int f2146c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2147d;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, c5.c] */
    public c() {
        if (c5.c.f932a == null) {
            c5.c.f932a = new Object();
        }
    }

    public int b(int i) {
        if (i < this.f2146c) {
            return ((ByteBuffer) this.f2147d).getShort(this.f2145b + i);
        }
        return 0;
    }

    public void c() {
        if (((f) this.f2147d).f3340n != this.f2146c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object d(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i = this.f2144a;
            f fVar = (f) this.f2147d;
            if (i >= fVar.f3338f || fVar.f3335c[i] >= 0) {
                return;
            }
            this.f2144a = i + 1;
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2145b) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2145b) {
            tag = d(view);
        } else {
            tag = view.getTag(this.f2144a);
            if (!((Class) this.f2147d).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate e9 = q0.e(view);
            q0.b bVar = e9 == null ? null : e9 instanceof q0.a ? ((q0.a) e9).f5091a : new q0.b(e9);
            if (bVar == null) {
                bVar = new q0.b();
            }
            q0.n(view, bVar);
            view.setTag(this.f2144a, obj);
            q0.i(view, this.f2146c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2144a < ((f) this.f2147d).f3338f;
    }

    public void remove() {
        f fVar = (f) this.f2147d;
        c();
        if (this.f2145b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.c();
        fVar.l(this.f2145b);
        this.f2145b = -1;
        this.f2146c = fVar.f3340n;
    }
}
