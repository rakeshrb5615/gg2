package z3;

import android.text.Editable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class l extends q3.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7217a;

    public l(o oVar) {
        this.f7217a = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f7217a.b().a();
    }

    @Override // q3.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        this.f7217a.b().b();
    }
}
