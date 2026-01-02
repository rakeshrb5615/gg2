package a2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public int f326a;

    /* renamed from: b  reason: collision with root package name */
    public int f327b;

    /* renamed from: c  reason: collision with root package name */
    public int f328c;

    /* renamed from: d  reason: collision with root package name */
    public int f329d;

    /* renamed from: e  reason: collision with root package name */
    public int f330e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f331f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f332g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f333h;
    public boolean i;
    public boolean j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f334k;

    /* renamed from: l  reason: collision with root package name */
    public int f335l;

    /* renamed from: m  reason: collision with root package name */
    public long f336m;

    /* renamed from: n  reason: collision with root package name */
    public int f337n;

    public final void a(int i) {
        if ((this.f329d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f329d));
    }

    public final int b() {
        return this.f332g ? this.f327b - this.f328c : this.f330e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f326a + ", mData=null, mItemCount=" + this.f330e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f327b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f328c + ", mStructureChanged=" + this.f331f + ", mInPreLayout=" + this.f332g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f334k + '}';
    }
}
