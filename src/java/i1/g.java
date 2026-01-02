package i1;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class g extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final f f2269b;

    public g(TextView textView) {
        this.f2269b = new f(textView);
    }

    @Override // a.a
    public final boolean B() {
        return this.f2269b.f2268d;
    }

    @Override // a.a
    public final void O(boolean z9) {
        if (g1.i.f1647k != null) {
            this.f2269b.O(z9);
        }
    }

    @Override // a.a
    public final void R(boolean z9) {
        f fVar = this.f2269b;
        if (g1.i.f1647k != null) {
            fVar.R(z9);
        } else {
            fVar.f2268d = z9;
        }
    }

    @Override // a.a
    public final TransformationMethod W(TransformationMethod transformationMethod) {
        return !(g1.i.f1647k != null) ? transformationMethod : this.f2269b.W(transformationMethod);
    }

    @Override // a.a
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        return !(g1.i.f1647k != null) ? inputFilterArr : this.f2269b.x(inputFilterArr);
    }
}
