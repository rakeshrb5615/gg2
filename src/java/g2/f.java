package g2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f extends h implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    public final Context f1705c;

    /* renamed from: d  reason: collision with root package name */
    public f2.o f1706d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1707e = null;

    /* renamed from: f  reason: collision with root package name */
    public final c f1708f = new c(this);

    /* renamed from: b  reason: collision with root package name */
    public final d f1704b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable$ConstantState, g2.d] */
    public f(Context context, int i) {
        this.f1705c = context;
    }

    @Override // g2.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f1704b;
        dVar.f1699a.draw(canvas);
        if (dVar.f1700b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getAlpha() : this.f1704b.f1699a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1704b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getColorFilter() : this.f1704b.f1699a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1709a != null) {
            return new e(this.f1709a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f1704b.f1699a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f1704b.f1699a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.getOpacity() : this.f1704b.f1699a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [r.e, r.j] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f1704b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray g3 = g0.b.g(resources, theme, attributeSet, a.f1695e);
                    int resourceId = g3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        q qVar = new q();
                        ThreadLocal threadLocal = g0.m.f1631a;
                        qVar.f1709a = resources.getDrawable(resourceId, theme);
                        new p(qVar.f1709a.getConstantState());
                        qVar.f1761f = false;
                        qVar.setCallback(this.f1708f);
                        q qVar2 = dVar.f1699a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        dVar.f1699a = qVar;
                    }
                    g3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f1696f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f1705c;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f1699a.f1757b.f1746b.f1744o.get(string));
                            if (dVar.f1701c == null) {
                                dVar.f1701c = new ArrayList();
                                dVar.f1702d = new r.j(0);
                            }
                            dVar.f1701c.add(loadAnimator);
                            dVar.f1702d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f1700b == null) {
            dVar.f1700b = new AnimatorSet();
        }
        dVar.f1700b.playTogether(dVar.f1701c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.isAutoMirrored() : this.f1704b.f1699a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1709a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f1704b.f1700b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.isStateful() : this.f1704b.f1699a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1704b.f1699a.setBounds(rect);
        }
    }

    @Override // g2.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.setLevel(i) : this.f1704b.f1699a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1709a;
        return drawable != null ? drawable.setState(iArr) : this.f1704b.f1699a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f1704b.f1699a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.f1704b.f1699a.setAutoMirrored(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1704b.f1699a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            q4.b.Q(drawable, i);
        } else {
            this.f1704b.f1699a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f1704b.f1699a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f1704b.f1699a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f1704b.f1699a.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f1704b;
        if (dVar.f1700b.isStarted()) {
            return;
        }
        dVar.f1700b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1709a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1704b.f1700b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
