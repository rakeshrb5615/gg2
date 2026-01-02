package i1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f2274a;

    public j(TransformationMethod transformationMethod) {
        this.f2274a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2274a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || g1.i.a().b() != 1) {
            return charSequence;
        }
        g1.i a10 = g1.i.a();
        a10.getClass();
        return a10.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f2274a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i, rect);
        }
    }
}
