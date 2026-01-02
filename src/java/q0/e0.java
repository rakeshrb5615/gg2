package q0;

import android.text.TextUtils;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e0 extends h1.c {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5121e;

    public e0(int i, Class cls, int i9, int i10, int i11) {
        this.f5121e = i11;
        this.f2144a = i;
        this.f2147d = cls;
        this.f2146c = i9;
        this.f2145b = i10;
    }

    @Override // h1.c
    public final Object d(View view) {
        switch (this.f5121e) {
            case 0:
                return Boolean.valueOf(l0.c(view));
            case 1:
                return l0.a(view);
            case 2:
                return n0.b(view);
            default:
                return Boolean.valueOf(l0.b(view));
        }
    }

    @Override // h1.c
    public final void e(View view, Object obj) {
        switch (this.f5121e) {
            case 0:
                l0.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                l0.e(view, (CharSequence) obj);
                return;
            case 2:
                n0.c(view, (CharSequence) obj);
                return;
            default:
                l0.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // h1.c
    public final boolean h(Object obj, Object obj2) {
        boolean equals;
        switch (this.f5121e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
