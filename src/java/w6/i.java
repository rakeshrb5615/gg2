package w6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final i f6460d = new i("", "", false);

    /* renamed from: a  reason: collision with root package name */
    public final String f6461a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6462b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6463c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z9) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f6461a = str;
        this.f6462b = str2;
        this.f6463c = z9;
    }
}
