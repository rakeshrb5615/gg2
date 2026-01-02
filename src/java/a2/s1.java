package a2;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f475a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f476b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f477c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f478d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f479e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f480f;

    public s1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f480f = staggeredGridLayoutManager;
        this.f479e = i;
    }

    public final void a() {
        ArrayList arrayList = this.f475a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f477c = this.f480f.r.b(view);
        ((p1) view.getLayoutParams()).getClass();
    }

    public final void b() {
        this.f475a.clear();
        this.f476b = Integer.MIN_VALUE;
        this.f477c = Integer.MIN_VALUE;
        this.f478d = 0;
    }

    public final int c() {
        boolean z9 = this.f480f.w;
        ArrayList arrayList = this.f475a;
        return z9 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z9 = this.f480f.w;
        ArrayList arrayList = this.f475a;
        return z9 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i, int i9) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f480f;
        int k9 = staggeredGridLayoutManager.r.k();
        int g3 = staggeredGridLayoutManager.r.g();
        int i10 = i9 > i ? 1 : -1;
        while (i != i9) {
            View view = (View) this.f475a.get(i);
            int e9 = staggeredGridLayoutManager.r.e(view);
            int b10 = staggeredGridLayoutManager.r.b(view);
            boolean z9 = e9 <= g3;
            boolean z10 = b10 >= k9;
            if (z9 && z10 && (e9 < k9 || b10 > g3)) {
                return t0.G(view);
            }
            i += i10;
        }
        return -1;
    }

    public final int f(int i) {
        int i9 = this.f477c;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (this.f475a.size() == 0) {
            return i;
        }
        a();
        return this.f477c;
    }

    public final View g(int i, int i9) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f480f;
        ArrayList arrayList = this.f475a;
        View view = null;
        if (i9 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && t0.G(view2) >= i) || ((!staggeredGridLayoutManager.w && t0.G(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            View view3 = (View) arrayList.get(i10);
            if ((staggeredGridLayoutManager.w && t0.G(view3) <= i) || ((!staggeredGridLayoutManager.w && t0.G(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i10++;
            view = view3;
        }
        return view;
    }

    public final int h(int i) {
        int i9 = this.f476b;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        ArrayList arrayList = this.f475a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        this.f476b = this.f480f.r.e(view);
        ((p1) view.getLayoutParams()).getClass();
        return this.f476b;
    }
}
