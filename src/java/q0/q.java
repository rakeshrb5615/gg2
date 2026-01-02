package q0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f5167a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f5168b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f5169c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5170d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f5171e;

    public q(ViewGroup viewGroup) {
        this.f5169c = viewGroup;
    }

    public final boolean a(float f9, float f10, boolean z9) {
        ViewParent e9;
        if (this.f5170d && (e9 = e(0)) != null) {
            try {
                return e9.onNestedFling(this.f5169c, f9, f10, z9);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f9, float f10) {
        ViewParent e9;
        if (this.f5170d && (e9 = e(0)) != null) {
            try {
                return e9.onNestedPreFling(this.f5169c, f9, f10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i, int i9, int i10, int[] iArr, int[] iArr2) {
        ViewParent e9;
        int i11;
        int i12;
        int[] iArr3;
        if (!this.f5170d || (e9 = e(i10)) == null) {
            return false;
        }
        if (i == 0 && i9 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        ViewGroup viewGroup = this.f5169c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            if (this.f5171e == null) {
                this.f5171e = new int[2];
            }
            iArr3 = this.f5171e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e9 instanceof r) {
            ((r) e9).c(viewGroup, i, i9, iArr3, i10);
        } else if (i10 == 0) {
            try {
                e9.onNestedPreScroll(viewGroup, i, i9, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent e9;
        int i13;
        int i14;
        int[] iArr3;
        if (this.f5170d && (e9 = e(i12)) != null) {
            if (i != 0 || i9 != 0 || i10 != 0 || i11 != 0) {
                ViewGroup viewGroup = this.f5169c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i13 = iArr[0];
                    i14 = iArr[1];
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (iArr2 == null) {
                    if (this.f5171e == null) {
                        this.f5171e = new int[2];
                    }
                    int[] iArr4 = this.f5171e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e9 instanceof s) {
                    ((s) e9).d(viewGroup, i, i9, i10, i11, i12, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i10;
                    iArr3[1] = iArr3[1] + i11;
                    if (e9 instanceof r) {
                        ((r) e9).e(viewGroup, i, i9, i10, i11, i12);
                    } else if (i12 == 0) {
                        try {
                            e9.onNestedScroll(viewGroup, i, i9, i10, i11);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i13;
                    iArr[1] = iArr[1] - i14;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f5168b;
        }
        return this.f5167a;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i9) {
        boolean onStartNestedScroll;
        if (!f(i9)) {
            if (this.f5170d) {
                View view = this.f5169c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z9 = parent instanceof r;
                    if (z9) {
                        onStartNestedScroll = ((r) parent).f(view2, view, i, i9);
                    } else {
                        if (i9 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e9);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i9 == 0) {
                            this.f5167a = parent;
                        } else if (i9 == 1) {
                            this.f5168b = parent;
                        }
                        if (z9) {
                            ((r) parent).a(view2, view, i, i9);
                        } else if (i9 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent e9 = e(i);
        if (e9 != null) {
            boolean z9 = e9 instanceof r;
            ViewGroup viewGroup = this.f5169c;
            if (z9) {
                ((r) e9).b(viewGroup, i);
            } else if (i == 0) {
                try {
                    e9.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i == 0) {
                this.f5167a = null;
            } else if (i != 1) {
            } else {
                this.f5168b = null;
            }
        }
    }
}
