package b2;

import android.os.Bundle;
import com.chilllive.chillwallpaperproject.MainActivity;
import i7.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f701a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f702b;

    public a(e eVar) {
        this.f701a = 0;
        this.f702b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // b2.d
    public final Bundle a() {
        switch (this.f701a) {
            case 0:
                Bundle f9 = c4.b.f((h7.f[]) Arrays.copyOf(new h7.f[0], 0));
                List j02 = i.j0((LinkedHashSet) this.f702b);
                f9.putStringArrayList("classes_to_restore", j02 instanceof ArrayList ? (ArrayList) j02 : new ArrayList<>(j02));
                return f9;
            default:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f702b).h().getClass();
                return bundle;
        }
    }

    public a(MainActivity mainActivity) {
        this.f701a = 1;
        this.f702b = mainActivity;
    }
}
