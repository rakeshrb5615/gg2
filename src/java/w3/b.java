package w3;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import r0.l;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f6434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6435b;

    public /* synthetic */ b(SideSheetBehavior sideSheetBehavior, int i) {
        this.f6434a = sideSheetBehavior;
        this.f6435b = i;
    }

    @Override // r0.l
    public final boolean a(View view) {
        this.f6434a.v(this.f6435b);
        return true;
    }
}
