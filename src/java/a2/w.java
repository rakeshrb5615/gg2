package a2;

import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public e0 f523a;

    /* renamed from: b  reason: collision with root package name */
    public int f524b;

    /* renamed from: c  reason: collision with root package name */
    public int f525c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f526d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f527e;

    public w() {
        d();
    }

    public final void a() {
        this.f525c = this.f526d ? this.f523a.g() : this.f523a.k();
    }

    public final void b(View view, int i) {
        if (this.f526d) {
            int b10 = this.f523a.b(view);
            e0 e0Var = this.f523a;
            this.f525c = (Integer.MIN_VALUE == e0Var.f303a ? 0 : e0Var.l() - e0Var.f303a) + b10;
        } else {
            this.f525c = this.f523a.e(view);
        }
        this.f524b = i;
    }

    public final void c(View view, int i) {
        e0 e0Var = this.f523a;
        int l5 = Integer.MIN_VALUE == e0Var.f303a ? 0 : e0Var.l() - e0Var.f303a;
        if (l5 >= 0) {
            b(view, i);
            return;
        }
        this.f524b = i;
        if (!this.f526d) {
            int e9 = this.f523a.e(view);
            int k9 = e9 - this.f523a.k();
            this.f525c = e9;
            if (k9 > 0) {
                int g3 = (this.f523a.g() - Math.min(0, (this.f523a.g() - l5) - this.f523a.b(view))) - (this.f523a.c(view) + e9);
                if (g3 < 0) {
                    this.f525c -= Math.min(k9, -g3);
                    return;
                }
                return;
            }
            return;
        }
        int g4 = (this.f523a.g() - l5) - this.f523a.b(view);
        this.f525c = this.f523a.g() - g4;
        if (g4 > 0) {
            int c9 = this.f525c - this.f523a.c(view);
            int k10 = this.f523a.k();
            int min = c9 - (Math.min(this.f523a.e(view) - k10, 0) + k10);
            if (min < 0) {
                this.f525c = Math.min(g4, -min) + this.f525c;
            }
        }
    }

    public final void d() {
        this.f524b = -1;
        this.f525c = Integer.MIN_VALUE;
        this.f526d = false;
        this.f527e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f524b + ", mCoordinate=" + this.f525c + ", mLayoutFromEnd=" + this.f526d + ", mValid=" + this.f527e + '}';
    }
}
