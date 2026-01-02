package n4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c extends d {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    public c(a aVar, Character ch) {
        super(aVar, ch);
        if (aVar.f4856b.length != 64) {
            throw new IllegalArgumentException();
        }
    }
}
