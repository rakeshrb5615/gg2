package y0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase-auth-api.zzajb;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import y4.a0;
import y4.g0;
import y4.m;
import y4.n;
import y4.x;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class d {
    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r9.bottom <= r11.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r9.right <= r11.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r9.top >= r11.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r9.left >= r11.right) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r8 == 17) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r8 != 66) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        r10 = f(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r8 == 17) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r8 == 33) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r8 == 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
        if (r8 != 130) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = c(r8, r9, r10)
            boolean r1 = c(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = f(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.b(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static ImageView.ScaleType d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean e(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i9 = rect.right;
            int i10 = rect2.right;
            return (i9 > i10 || rect.left >= i10) && rect.left > rect2.left;
        } else if (i == 33) {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            return (i11 > i12 || rect.top >= i12) && rect.top > rect2.top;
        } else if (i == 66) {
            int i13 = rect.left;
            int i14 = rect2.left;
            return (i13 < i14 || rect.right <= i14) && rect.right < rect2.right;
        } else if (i == 130) {
            int i15 = rect.top;
            int i16 = rect2.top;
            return (i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int f(int i, Rect rect, Rect rect2) {
        int i9;
        int i10;
        if (i == 17) {
            i9 = rect.left;
            i10 = rect2.right;
        } else if (i == 33) {
            i9 = rect.top;
            i10 = rect2.bottom;
        } else if (i == 66) {
            i9 = rect2.left;
            i10 = rect.right;
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i9 = rect2.top;
            i10 = rect.bottom;
        }
        return Math.max(0, i9 - i10);
    }

    public static int g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z9 = false;
        boolean z10 = onLongClickListener != null;
        if (hasOnClickListeners || z10) {
            z9 = true;
        }
        checkableImageButton.setFocusable(z9);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        checkableImageButton.setImportantForAccessibility(z9 ? 1 : 2);
    }

    public static zzajb j(y4.c cVar, String str) {
        Preconditions.checkNotNull(cVar);
        if (cVar instanceof n) {
            n nVar = (n) cVar;
            Preconditions.checkNotNull(nVar);
            return new zzajb(nVar.f6886a, nVar.f6887b, "google.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        } else if (cVar instanceof y4.e) {
            y4.e eVar = (y4.e) cVar;
            Preconditions.checkNotNull(eVar);
            return new zzajb((String) null, eVar.f6858a, "facebook.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        } else if (cVar instanceof a0) {
            a0 a0Var = (a0) cVar;
            Preconditions.checkNotNull(a0Var);
            return new zzajb((String) null, a0Var.f6839a, "twitter.com", (String) null, a0Var.f6840b, (String) null, str, (String) null, (String) null);
        } else if (cVar instanceof m) {
            m mVar = (m) cVar;
            Preconditions.checkNotNull(mVar);
            return new zzajb((String) null, mVar.f6885a, "github.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        } else if (cVar instanceof x) {
            x xVar = (x) cVar;
            Preconditions.checkNotNull(xVar);
            return new zzajb((String) null, (String) null, "playgames.google.com", (String) null, (String) null, xVar.f6897a, str, (String) null, (String) null);
        } else if (cVar instanceof g0) {
            g0 g0Var = (g0) cVar;
            Preconditions.checkNotNull(g0Var);
            zzajb zzajbVar = g0Var.f6869d;
            return zzajbVar != null ? zzajbVar : new zzajb(g0Var.f6867b, g0Var.f6868c, g0Var.f6866a, (String) null, g0Var.f6871f, (String) null, str, g0Var.f6870e, g0Var.f6872m);
        } else {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
    }
}
