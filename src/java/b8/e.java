package b8;

import java.util.regex.Matcher;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e extends i7.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f785a;

    public e(g gVar) {
        this.f785a = gVar;
    }

    @Override // i7.a
    public final int b() {
        return ((Matcher) this.f785a.f789b).groupCount() + 1;
    }

    @Override // i7.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = ((Matcher) this.f785a.f789b).group(i);
        return group == null ? "" : group;
    }

    @Override // i7.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // i7.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
