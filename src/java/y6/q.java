package y6;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class q implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    public char[] f6951a;

    /* renamed from: b  reason: collision with root package name */
    public String f6952b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f6951a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6951a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i9) {
        return new String(this.f6951a, i, i9 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f6952b == null) {
            this.f6952b = new String(this.f6951a);
        }
        return this.f6952b;
    }
}
