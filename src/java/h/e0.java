package h;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class e0 extends c.p implements j {

    /* renamed from: e  reason: collision with root package name */
    public c0 f2037e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f2038f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e0(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969009(0x7f0401b1, float:1.7546688E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            h.d0 r2 = new h.d0
            r2.<init>()
            r4.f2038f = r2
            h.p r2 = r4.c()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            h.c0 r5 = (h.c0) r5
            r5.f1994a0 = r6
            r2.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.<init>(android.content.Context, int):void");
    }

    @Override // c.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c0 c0Var = (c0) c();
        c0Var.z();
        ((ViewGroup) c0Var.H.findViewById(16908290)).addView(view, layoutParams);
        c0Var.f2008s.a(c0Var.f2007r.getCallback());
    }

    public final p c() {
        if (this.f2037e == null) {
            n nVar = p.f2096a;
            this.f2037e = new c0(getContext(), getWindow(), this, this);
        }
        return this.f2037e;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return q4.b.o(this.f2038f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        c0 c0Var = (c0) c();
        c0Var.z();
        return c0Var.f2007r.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().e();
    }

    @Override // c.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().d();
        super.onCreate(bundle);
        c().h();
    }

    @Override // c.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c0 c0Var = (c0) c();
        c0Var.D();
        n0 n0Var = c0Var.f2010u;
        if (n0Var != null) {
            n0Var.f2092y = false;
            l.j jVar = n0Var.f2091x;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // c.p, android.app.Dialog
    public void setContentView(int i) {
        b();
        c().l(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().o(charSequence);
    }

    @Override // c.p, android.app.Dialog
    public void setContentView(View view) {
        b();
        c().m(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().o(getContext().getString(i));
    }

    @Override // c.p, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().n(view, layoutParams);
    }
}
