package z8;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/5.dex */
public final class c0 extends z0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7473d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7474e;

    /* renamed from: f  reason: collision with root package name */
    public final a f7475f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7476g;

    public c0(String str, int i, boolean z9) {
        this.f7473d = i;
        switch (i) {
            case 1:
                a aVar = a.f7460b;
                Objects.requireNonNull(str, "name == null");
                this.f7474e = str;
                this.f7475f = aVar;
                this.f7476g = z9;
                return;
            case 2:
                a aVar2 = a.f7460b;
                Objects.requireNonNull(str, "name == null");
                this.f7474e = str;
                this.f7475f = aVar2;
                this.f7476g = z9;
                return;
            default:
                a aVar3 = a.f7460b;
                Objects.requireNonNull(str, "name == null");
                this.f7474e = str;
                this.f7475f = aVar3;
                this.f7476g = z9;
                return;
        }
    }

    @Override // z8.z0
    public final void a(n0 n0Var, Object obj) {
        switch (this.f7473d) {
            case 0:
                if (obj == null) {
                    return;
                }
                this.f7475f.getClass();
                String obj2 = obj.toString();
                if (obj2 == null) {
                    return;
                }
                n0Var.a(this.f7474e, obj2, this.f7476g);
                return;
            case 1:
                if (obj == null) {
                    return;
                }
                this.f7475f.getClass();
                String obj3 = obj.toString();
                if (obj3 == null) {
                    return;
                }
                n0Var.b(this.f7474e, obj3, this.f7476g);
                return;
            default:
                if (obj == null) {
                    return;
                }
                this.f7475f.getClass();
                String obj4 = obj.toString();
                if (obj4 == null) {
                    return;
                }
                n0Var.d(this.f7474e, obj4, this.f7476g);
                return;
        }
    }
}
