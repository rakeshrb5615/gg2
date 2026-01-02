package o0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f4980e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f4981a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4982b;

    /* renamed from: c  reason: collision with root package name */
    public int f4983c;

    /* renamed from: d  reason: collision with root package name */
    public char f4984d;

    static {
        for (int i = 0; i < 1792; i++) {
            f4980e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f4981a = charSequence;
        this.f4982b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f4981a;
        char charAt = charSequence.charAt(this.f4983c - 1);
        this.f4984d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f4983c);
            this.f4983c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f4983c--;
        char c9 = this.f4984d;
        return c9 < 1792 ? f4980e[c9] : Character.getDirectionality(c9);
    }
}
