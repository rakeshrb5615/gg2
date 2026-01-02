package v5;

import java.util.Date;
import java.util.HashMap;
import t5.g;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d implements u5.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6305e = new a(0);

    /* renamed from: f  reason: collision with root package name */
    public static final b f6306f = new t5.f() { // from class: v5.b
        @Override // t5.a
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).e((String) obj);
                    return;
                default:
                    ((g) obj2).g(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final b f6307g = new t5.f() { // from class: v5.b
        @Override // t5.a
        public final void a(Object obj, Object obj2) {
            switch (r1) {
                case 0:
                    ((g) obj2).e((String) obj);
                    return;
                default:
                    ((g) obj2).g(((Boolean) obj).booleanValue());
                    return;
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public static final c f6308h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6309a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6310b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6311c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6312d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f6309a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f6310b = hashMap2;
        this.f6311c = f6305e;
        this.f6312d = false;
        hashMap2.put(String.class, f6306f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f6307g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f6308h);
        hashMap.remove(Date.class);
    }

    public final u5.a a(Class cls, t5.d dVar) {
        this.f6309a.put(cls, dVar);
        this.f6310b.remove(cls);
        return this;
    }
}
