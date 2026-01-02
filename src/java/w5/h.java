package w5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h implements t5.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6454a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6455b = false;

    /* renamed from: c  reason: collision with root package name */
    public t5.c f6456c;

    /* renamed from: d  reason: collision with root package name */
    public final f f6457d;

    public h(f fVar) {
        this.f6457d = fVar;
    }

    @Override // t5.g
    public final t5.g e(String str) {
        if (this.f6454a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6454a = true;
        this.f6457d.h(this.f6456c, str, this.f6455b);
        return this;
    }

    @Override // t5.g
    public final t5.g g(boolean z9) {
        if (this.f6454a) {
            throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6454a = true;
        this.f6457d.g(this.f6456c, z9 ? 1 : 0, this.f6455b);
        return this;
    }
}
