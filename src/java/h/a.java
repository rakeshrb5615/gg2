package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f1964a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f1965b;

    public a(b bVar, e eVar) {
        this.f1965b = bVar;
        this.f1964a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b bVar = this.f1965b;
        DialogInterface.OnClickListener onClickListener = bVar.f1974h;
        e eVar = this.f1964a;
        onClickListener.onClick(eVar.f2018b, i);
        if (bVar.i) {
            return;
        }
        eVar.f2018b.dismiss();
    }
}
