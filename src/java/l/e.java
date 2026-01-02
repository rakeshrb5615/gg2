package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import m.b0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3486a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3487b;

    public e(Context context, a aVar) {
        this.f3486a = context;
        this.f3487b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3487b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3487b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f3486a, this.f3487b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3487b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3487b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3487b.f3472a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3487b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3487b.f3473b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3487b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3487b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3487b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3487b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3487b.f3472a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3487b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z9) {
        this.f3487b.p(z9);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3487b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3487b.n(i);
    }
}
