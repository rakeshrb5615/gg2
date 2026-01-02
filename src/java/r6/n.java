package r6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class n implements v5.f {

    /* renamed from: b  reason: collision with root package name */
    public static final n f5700b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ n[] f5701c;

    /* renamed from: a  reason: collision with root package name */
    public final int f5702a;

    static {
        n nVar = new n("EVENT_TYPE_UNKNOWN", 0, 0);
        n nVar2 = new n("SESSION_START", 1, 1);
        f5700b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f5701c = nVarArr;
        c4.b.x(nVarArr);
    }

    public n(String str, int i, int i9) {
        this.f5702a = i9;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f5701c.clone();
    }

    @Override // v5.f
    public final int a() {
        return this.f5702a;
    }
}
