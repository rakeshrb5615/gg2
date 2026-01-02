package z3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f extends v3.i {

    /* renamed from: s  reason: collision with root package name */
    public final RectF f7202s;

    public f(v3.p pVar, RectF rectF) {
        super(pVar);
        this.f7202s = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z3.g, v3.k, android.graphics.drawable.Drawable] */
    @Override // v3.i, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? kVar = new v3.k(this);
        kVar.M = this;
        kVar.invalidateSelf();
        return kVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f7202s = fVar.f7202s;
    }
}
