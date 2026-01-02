package f2;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class j implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1437b;

    public j(View view, ArrayList arrayList) {
        this.f1436a = view;
        this.f1437b = arrayList;
    }

    @Override // f2.q
    public final void a(s sVar) {
        sVar.A(this);
        sVar.a(this);
    }

    @Override // f2.q
    public final void b() {
    }

    @Override // f2.q
    public final void c(s sVar) {
    }

    @Override // f2.q
    public final void d() {
    }

    @Override // f2.q
    public final void f(s sVar) {
        sVar.A(this);
        this.f1436a.setVisibility(8);
        ArrayList arrayList = this.f1437b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }
}
