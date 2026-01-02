package a2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class k1 {

    /* renamed from: t  reason: collision with root package name */
    public static final List f375t = Collections.EMPTY_LIST;

    /* renamed from: a  reason: collision with root package name */
    public final View f376a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f377b;
    public int j;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f390r;

    /* renamed from: s  reason: collision with root package name */
    public i0 f391s;

    /* renamed from: c  reason: collision with root package name */
    public int f378c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f379d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f380e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f381f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f382g = -1;

    /* renamed from: h  reason: collision with root package name */
    public k1 f383h = null;
    public k1 i = null;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f384k = null;

    /* renamed from: l  reason: collision with root package name */
    public final List f385l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f386m = 0;

    /* renamed from: n  reason: collision with root package name */
    public z0 f387n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f388o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f389p = 0;
    public int q = -1;

    public k1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f376a = view;
    }

    public final void a(int i) {
        this.j = i | this.j;
    }

    public final int b() {
        int i = this.f382g;
        return i == -1 ? this.f378c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f384k) == null || arrayList.size() == 0) ? f375t : this.f385l;
    }

    public final boolean d() {
        View view = this.f376a;
        return (view.getParent() == null || view.getParent() == this.f390r) ? false : true;
    }

    public final boolean e() {
        return (this.j & 1) != 0;
    }

    public final boolean f() {
        return (this.j & 4) != 0;
    }

    public final boolean g() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = q0.q0.f5172a;
            return !this.f376a.hasTransientState();
        }
        return false;
    }

    public final boolean h() {
        return (this.j & 8) != 0;
    }

    public final boolean i() {
        return this.f387n != null;
    }

    public final boolean j() {
        return (this.j & 256) != 0;
    }

    public final boolean k() {
        return (this.j & 2) != 0;
    }

    public final void l(int i, boolean z9) {
        if (this.f379d == -1) {
            this.f379d = this.f378c;
        }
        if (this.f382g == -1) {
            this.f382g = this.f378c;
        }
        if (z9) {
            this.f382g += i;
        }
        this.f378c += i;
        View view = this.f376a;
        if (view.getLayoutParams() != null) {
            ((u0) view.getLayoutParams()).f509c = true;
        }
    }

    public final void m() {
        if (RecyclerView.F0 && j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f378c = -1;
        this.f379d = -1;
        this.f380e = -1L;
        this.f382g = -1;
        this.f386m = 0;
        this.f383h = null;
        this.i = null;
        ArrayList arrayList = this.f384k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f389p = 0;
        this.q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z9) {
        int i = this.f386m;
        int i9 = z9 ? i - 1 : i + 1;
        this.f386m = i9;
        if (i9 < 0) {
            this.f386m = 0;
            if (RecyclerView.F0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z9 && i9 == 1) {
            this.j |= 16;
        } else if (z9 && i9 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.G0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z9 + ":" + this);
        }
    }

    public final boolean o() {
        return (this.j & 128) != 0;
    }

    public final boolean p() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f378c + " id=" + this.f380e + ", oldPos=" + this.f379d + ", pLpos:" + this.f382g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f388o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f386m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f376a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
