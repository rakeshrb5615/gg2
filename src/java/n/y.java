package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class y extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public final p f4349a;

    /* renamed from: b  reason: collision with root package name */
    public final g0.d f4350b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u2.a(context);
        this.f4351c = false;
        t2.a(this, getContext());
        p pVar = new p(this);
        this.f4349a = pVar;
        pVar.q(attributeSet, i);
        g0.d dVar = new g0.d(this);
        this.f4350b = dVar;
        dVar.f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4349a;
        if (pVar != null) {
            pVar.a();
        }
        g0.d dVar = this.f4350b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4349a;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4349a;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        v2 v2Var;
        g0.d dVar = this.f4350b;
        if (dVar == null || (v2Var = (v2) dVar.f1610d) == null) {
            return null;
        }
        return v2Var.f4315a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        v2 v2Var;
        g0.d dVar = this.f4350b;
        if (dVar == null || (v2Var = (v2) dVar.f1610d) == null) {
            return null;
        }
        return v2Var.f4316b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4350b.f1609c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4349a;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4349a;
        if (pVar != null) {
            pVar.s(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        g0.d dVar = this.f4350b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        g0.d dVar = this.f4350b;
        if (dVar != null && drawable != null && !this.f4351c) {
            dVar.f1608b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f4351c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f1609c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f1608b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4351c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        g0.d dVar = this.f4350b;
        ImageView imageView = (ImageView) dVar.f1609c;
        if (i != 0) {
            Drawable A = j5.t1.A(imageView.getContext(), i);
            if (A != null) {
                n1.a(A);
            }
            imageView.setImageDrawable(A);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        g0.d dVar = this.f4350b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4349a;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4349a;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        g0.d dVar = this.f4350b;
        if (dVar != null) {
            if (((v2) dVar.f1610d) == null) {
                dVar.f1610d = new Object();
            }
            v2 v2Var = (v2) dVar.f1610d;
            v2Var.f4315a = colorStateList;
            v2Var.f4318d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        g0.d dVar = this.f4350b;
        if (dVar != null) {
            if (((v2) dVar.f1610d) == null) {
                dVar.f1610d = new Object();
            }
            v2 v2Var = (v2) dVar.f1610d;
            v2Var.f4316b = mode;
            v2Var.f4317c = true;
            dVar.a();
        }
    }
}
