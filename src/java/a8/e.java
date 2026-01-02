package a8;

import b8.q;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f660a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f661b;

    /* renamed from: c  reason: collision with root package name */
    public final h7.a f662c;

    public /* synthetic */ e(Object obj, u7.l lVar, int i) {
        this.f660a = i;
        this.f661b = obj;
        this.f662c = lVar;
    }

    @Override // a8.f
    public final Iterator iterator() {
        switch (this.f660a) {
            case 0:
                return new d(this);
            case 1:
                return new l(this);
            default:
                return new b8.b(this);
        }
    }

    public e(CharSequence charSequence, q qVar) {
        this.f660a = 2;
        kotlin.jvm.internal.j.e(charSequence, "input");
        this.f661b = charSequence;
        this.f662c = qVar;
    }
}
