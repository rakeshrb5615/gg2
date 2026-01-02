package a1;

import d8.b2;
import java.util.LinkedHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class a1 implements d8.p0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11c;

    public /* synthetic */ a1(int i, Object obj, Object obj2) {
        this.f9a = i;
        this.f10b = obj;
        this.f11c = obj2;
    }

    @Override // d8.p0
    public final void a() {
        switch (this.f9a) {
            case 0:
                String str = (String) this.f10b;
                b1 b1Var = (b1) this.f11c;
                synchronized (c1.f32b) {
                    LinkedHashMap linkedHashMap = c1.f33c;
                    c1 c1Var = (c1) linkedHashMap.get(str);
                    if (c1Var != null) {
                        c1Var.f34a.remove(b1Var);
                        if (c1Var.f34a.isEmpty()) {
                            linkedHashMap.remove(str);
                            c1Var.stopWatching();
                        }
                    }
                }
                return;
            default:
                ((e8.c) this.f10b).f1357c.removeCallbacks((b2) this.f11c);
                return;
        }
    }
}
