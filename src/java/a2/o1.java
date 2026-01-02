package a2;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public int f408a;

    /* renamed from: b  reason: collision with root package name */
    public int f409b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f410c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f411d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f412e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f413f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f414g;

    public o1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f414g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f408a = -1;
        this.f409b = Integer.MIN_VALUE;
        this.f410c = false;
        this.f411d = false;
        this.f412e = false;
        int[] iArr = this.f413f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
