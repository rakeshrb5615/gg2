package b8;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f792a;

    public h(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        this.f792a = compile;
    }

    public final g a(int i, String str) {
        kotlin.jvm.internal.j.e(str, "input");
        Matcher region = this.f792a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new g(region, str);
        }
        return null;
    }

    public final String b(String str) {
        kotlin.jvm.internal.j.e(str, "input");
        String replaceAll = this.f792a.matcher(str).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f792a.toString();
        kotlin.jvm.internal.j.d(pattern, "toString(...)");
        return pattern;
    }
}
