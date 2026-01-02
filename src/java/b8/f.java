package b8;

import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f extends i7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f786a;

    public f(g gVar) {
        this.f786a = gVar;
    }

    @Override // i7.a
    public final int b() {
        return ((Matcher) this.f786a.f789b).groupCount() + 1;
    }

    public final d c(int i) {
        Matcher matcher = (Matcher) this.f786a.f789b;
        y7.e f9 = w3.a.f(matcher.start(i), matcher.end(i));
        if (f9.f6967a >= 0) {
            String group = matcher.group(i);
            kotlin.jvm.internal.j.d(group, "group(...)");
            return new d(group, f9);
        }
        return null;
    }

    @Override // i7.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof d) {
            return super.contains((d) obj);
        }
        return false;
    }

    @Override // i7.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a8.l(new a8.e(new a8.i(new y7.d(0, size() - 1, 1), 3), new a6.i(this, 2), 1));
    }
}
