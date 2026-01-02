package z;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class t extends c {

    /* renamed from: n  reason: collision with root package name */
    public boolean f7183n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7184o;

    @Override // z.c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // z.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f7176b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f7183n = true;
                } else if (index == 22) {
                    this.f7184o = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(w.g gVar, int i, int i9);

    @Override // z.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7183n || this.f7184o) {
            ConstraintLayout parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f7034b; i++) {
                    View view = (View) constraintLayout.a.get(this.f7033a[i]);
                    if (view != null) {
                        if (this.f7183n) {
                            view.setVisibility(visibility);
                        }
                        if (this.f7184o && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}
