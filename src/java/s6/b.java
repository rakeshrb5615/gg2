package s6;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class b extends n7.c {

    /* renamed from: a  reason: collision with root package name */
    public Map f5842a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator f5843b;

    /* renamed from: c  reason: collision with root package name */
    public d f5844c;

    /* renamed from: d  reason: collision with root package name */
    public m8.c f5845d;

    /* renamed from: e  reason: collision with root package name */
    public Map f5846e;

    /* renamed from: f  reason: collision with root package name */
    public Object f5847f;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f5848m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ c f5849n;

    /* renamed from: o  reason: collision with root package name */
    public int f5850o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, n7.c cVar2) {
        super(cVar2);
        this.f5849n = cVar;
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        this.f5848m = obj;
        this.f5850o |= Integer.MIN_VALUE;
        return this.f5849n.b(this);
    }
}
