package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a implements j0.a {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3797a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3798b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f3799c;

    /* renamed from: d  reason: collision with root package name */
    public char f3800d;

    /* renamed from: e  reason: collision with root package name */
    public int f3801e;

    /* renamed from: f  reason: collision with root package name */
    public char f3802f;

    /* renamed from: g  reason: collision with root package name */
    public int f3803g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3804h;
    public Context i;
    public CharSequence j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3805k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3806l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f3807m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3808n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3809o;

    /* renamed from: p  reason: collision with root package name */
    public int f3810p;

    @Override // j0.a
    public final p a() {
        return null;
    }

    @Override // j0.a
    public final j0.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f3804h;
        if (drawable != null) {
            if (this.f3808n || this.f3809o) {
                this.f3804h = drawable;
                Drawable mutate = drawable.mutate();
                this.f3804h = mutate;
                if (this.f3808n) {
                    mutate.setTintList(this.f3806l);
                }
                if (this.f3809o) {
                    this.f3804h.setTintMode(this.f3807m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3803g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3802f;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3804h;
    }

    @Override // j0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3806l;
    }

    @Override // j0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3807m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3799c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3801e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3800d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3797a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3798b;
        return charSequence != null ? charSequence : this.f3797a;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3805k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3810p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3810p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3810p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3810p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f3802f = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        this.f3810p = (z9 ? 1 : 0) | (this.f3810p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        this.f3810p = (z9 ? 2 : 0) | (this.f3810p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        this.f3810p = (z9 ? 16 : 0) | (this.f3810p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3804h = drawable;
        c();
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3806l = colorStateList;
        this.f3808n = true;
        c();
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3807m = mode;
        this.f3809o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3799c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f3800d = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f3800d = c9;
        this.f3802f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3797a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3798b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3805k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        this.f3810p = (this.f3810p & 8) | (z9 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i) {
        this.f3802f = Character.toLowerCase(c9);
        this.f3803g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i) {
        this.f3800d = c9;
        this.f3801e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3797a = this.i.getResources().getString(i);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setTooltipText(CharSequence charSequence) {
        this.f3805k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3804h = e0.c.getDrawable(this.i, i);
        c();
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i, int i9) {
        this.f3800d = c9;
        this.f3801e = KeyEvent.normalizeMetaState(i);
        this.f3802f = Character.toLowerCase(c10);
        this.f3803g = KeyEvent.normalizeMetaState(i9);
        return this;
    }
}
