package g2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f1703a;

    public e(Drawable.ConstantState constantState) {
        this.f1703a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f1703a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f1703a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f1703a.newDrawable();
        fVar.f1709a = newDrawable;
        newDrawable.setCallback(fVar.f1708f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f1703a.newDrawable(resources);
        fVar.f1709a = newDrawable;
        newDrawable.setCallback(fVar.f1708f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null, 0);
        Drawable newDrawable = this.f1703a.newDrawable(resources, theme);
        fVar.f1709a = newDrawable;
        newDrawable.setCallback(fVar.f1708f);
        return fVar;
    }
}
