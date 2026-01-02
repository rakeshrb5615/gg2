package z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class a extends c {

    /* renamed from: n  reason: collision with root package name */
    public int f7023n;

    /* renamed from: o  reason: collision with root package name */
    public int f7024o;

    /* renamed from: p  reason: collision with root package name */
    public w.a f7025p;

    public boolean getAllowsGoneWidget() {
        return this.f7025p.f6321t0;
    }

    public int getMargin() {
        return this.f7025p.f6322u0;
    }

    public int getType() {
        return this.f7023n;
    }

    @Override // z.c
    public final void h(w.d dVar, boolean z9) {
        int i = this.f7023n;
        this.f7024o = i;
        if (z9) {
            if (i == 5) {
                this.f7024o = 1;
            } else if (i == 6) {
                this.f7024o = 0;
            }
        } else if (i == 5) {
            this.f7024o = 0;
        } else if (i == 6) {
            this.f7024o = 1;
        }
        if (dVar instanceof w.a) {
            ((w.a) dVar).f6320s0 = this.f7024o;
        }
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.f7025p.f6321t0 = z9;
    }

    public void setDpMargin(int i) {
        this.f7025p.f6322u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f7025p.f6322u0 = i;
    }

    public void setType(int i) {
        this.f7023n = i;
    }
}
