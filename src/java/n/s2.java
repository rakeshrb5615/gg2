package n;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class s2 extends g1.g {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f4281a;

    public s2(SwitchCompat switchCompat) {
        this.f4281a = new WeakReference(switchCompat);
    }

    @Override // g1.g
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f4281a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // g1.g
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f4281a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
