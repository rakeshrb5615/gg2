package u2;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public enum c implements w5.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f6051a;

    c(int i) {
        this.f6051a = i;
    }

    @Override // w5.c
    public final int a() {
        return this.f6051a;
    }
}
