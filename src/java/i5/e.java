package i5;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e implements j {

    /* renamed from: c  reason: collision with root package name */
    public static final v3.f f2708c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2709a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2710b;

    public e(m5.c cVar) {
        this.f2709a = cVar;
        this.f2710b = f2708c;
    }

    @Override // i5.j
    public void b(i iVar, int i) {
        int[] iArr = (int[]) this.f2710b;
        try {
            iVar.read((byte[]) this.f2709a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f2709a = bArr;
        this.f2710b = iArr;
    }
}
