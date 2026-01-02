package n;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class j extends z implements l {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f4175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, null, 2130968610);
        this.f4175d = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g3.a(this, getContentDescription());
        setOnTouchListener(new m.b(this, this));
    }

    @Override // n.l
    public final boolean b() {
        return false;
    }

    @Override // n.l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4175d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i, i9, i10, i11);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
