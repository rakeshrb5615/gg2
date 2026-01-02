package u8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final k f6150c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f6151d;

    /* renamed from: e  reason: collision with root package name */
    public static final k f6152e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f6153f;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ k[] f6154m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ o7.b f6155n;

    /* renamed from: a  reason: collision with root package name */
    public final char f6156a;

    /* renamed from: b  reason: collision with root package name */
    public final char f6157b;

    static {
        k kVar = new k("OBJ", 0, '{', '}');
        f6150c = kVar;
        k kVar2 = new k("LIST", 1, '[', ']');
        f6151d = kVar2;
        k kVar3 = new k("MAP", 2, '{', '}');
        f6152e = kVar3;
        k kVar4 = new k("POLY_OBJ", 3, '[', ']');
        f6153f = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f6154m = kVarArr;
        f6155n = c4.b.x(kVarArr);
    }

    public k(String str, int i, char c9, char c10) {
        this.f6156a = c9;
        this.f6157b = c10;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f6154m.clone();
    }
}
