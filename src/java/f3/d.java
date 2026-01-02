package f3;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j6.s;
import y3.f;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d extends w0.a {

    /* renamed from: a  reason: collision with root package name */
    public int f1493a;

    /* renamed from: b  reason: collision with root package name */
    public int f1494b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1495c;

    public d(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1495c = swipeDismissBehavior;
    }

    @Override // w0.a
    public final int b(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z9 = view.getLayoutDirection() == 1;
        int i9 = this.f1495c.e;
        if (i9 == 0) {
            if (z9) {
                width = this.f1493a - view.getWidth();
                width2 = this.f1493a;
            } else {
                width = this.f1493a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i9 != 1) {
            width = this.f1493a - view.getWidth();
            width2 = view.getWidth() + this.f1493a;
        } else if (z9) {
            width = this.f1493a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f1493a - view.getWidth();
            width2 = this.f1493a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // w0.a
    public final int c(View view, int i) {
        return view.getTop();
    }

    @Override // w0.a
    public final int d(View view) {
        return view.getWidth();
    }

    @Override // w0.a
    public final void f(View view, int i) {
        this.f1494b = i;
        this.f1493a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f1495c;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // w0.a
    public final void g(int i) {
        y3.e eVar = this.f1495c.b;
        if (eVar != null) {
            f fVar = eVar.f6789a.f6824t;
            if (i == 0) {
                s.h().p(fVar);
            } else if (i == 1 || i == 2) {
                s.h().o(fVar);
            }
        }
    }

    @Override // w0.a
    public final void h(View view, int i, int i9) {
        SwipeDismissBehavior swipeDismissBehavior = this.f1495c;
        float width = view.getWidth() * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.f1493a);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.f1493a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L31;
     */
    @Override // w0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f1494b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f1495c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f1493a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f1493a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f1493a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f1493a
        L67:
            y0.e r10 = r3.a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7c
            f3.e r10 = new f3.e
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
            return
        L7c:
            if (r2 == 0) goto L85
            y3.e r10 = r3.b
            if (r10 == 0) goto L85
            r10.a(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.d.i(android.view.View, float, float):void");
    }

    @Override // w0.a
    public final boolean j(View view, int i) {
        int i9 = this.f1494b;
        return (i9 == -1 || i9 == i) && this.f1495c.v(view);
    }
}
