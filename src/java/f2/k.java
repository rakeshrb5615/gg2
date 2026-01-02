package f2;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f1438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1439b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1440c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1441d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f1442e;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1442e = mVar;
        this.f1438a = obj;
        this.f1439b = arrayList;
        this.f1440c = obj2;
        this.f1441d = arrayList2;
    }

    @Override // f2.t, f2.q
    public final void a(s sVar) {
        m mVar = this.f1442e;
        Object obj = this.f1438a;
        if (obj != null) {
            mVar.s(obj, this.f1439b, null);
        }
        Object obj2 = this.f1440c;
        if (obj2 != null) {
            mVar.s(obj2, this.f1441d, null);
        }
    }

    @Override // f2.q
    public final void f(s sVar) {
        sVar.A(this);
    }
}
