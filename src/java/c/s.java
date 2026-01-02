package c;

import androidx.fragment.app.t0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f836a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.u f837b;

    public s(t0 t0Var, androidx.lifecycle.u uVar) {
        kotlin.jvm.internal.j.e(t0Var, "callback");
        this.f836a = t0Var;
        this.f837b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.j.a(this.f836a, sVar.f836a) && kotlin.jvm.internal.j.a(this.f837b, sVar.f837b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f836a.hashCode() * 31;
        androidx.lifecycle.u uVar = this.f837b;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f836a + ", owner=" + this.f837b + ')';
    }
}
