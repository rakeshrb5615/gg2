package h3;

import a2.l;
import android.view.View;
import androidx.lifecycle.g0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2168a;

    /* renamed from: b  reason: collision with root package name */
    public int f2169b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2170c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f2171d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b0.a f2172e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f2168a = 1;
        this.f2172e = sideSheetBehavior;
        this.f2171d = new g0(this, 13);
    }

    public final void a(int i) {
        switch (this.f2168a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = this.f2172e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                this.f2169b = i;
                if (this.f2170c) {
                    return;
                }
                ((View) bottomSheetBehavior.W.get()).postOnAnimation((l) this.f2171d);
                this.f2170c = true;
                return;
            default:
                SideSheetBehavior sideSheetBehavior = this.f2172e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                this.f2169b = i;
                if (this.f2170c) {
                    return;
                }
                ((View) sideSheetBehavior.p.get()).postOnAnimation(this.f2171d);
                this.f2170c = true;
                return;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f2168a = 0;
        this.f2172e = bottomSheetBehavior;
        this.f2171d = new l(this, 3);
    }
}
