package m4;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3968a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3969b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3970c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f3968a = obj;
        this.f3969b = obj2;
        this.f3970c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f3968a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f3969b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f3970c);
        return new IllegalArgumentException(sb.toString());
    }
}
