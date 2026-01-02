package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j5.t1;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class o implements j0.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a  reason: collision with root package name */
    public final int f3898a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3899b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3900c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3901d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3902e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3903f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f3904g;

    /* renamed from: h  reason: collision with root package name */
    public char f3905h;
    public char j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3907l;

    /* renamed from: n  reason: collision with root package name */
    public final m f3909n;

    /* renamed from: o  reason: collision with root package name */
    public e0 f3910o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3911p;
    public CharSequence q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3912r;

    /* renamed from: y  reason: collision with root package name */
    public int f3919y;

    /* renamed from: z  reason: collision with root package name */
    public View f3920z;
    public int i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f3906k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f3908m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3913s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f3914t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3915u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3916v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3917w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f3918x = 16;
    public boolean C = false;

    public o(m mVar, int i, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f3909n = mVar;
        this.f3898a = i9;
        this.f3899b = i;
        this.f3900c = i10;
        this.f3901d = i11;
        this.f3902e = charSequence;
        this.f3919y = i12;
    }

    public static void c(int i, int i9, String str, StringBuilder sb) {
        if ((i & i9) == i9) {
            sb.append(str);
        }
    }

    @Override // j0.a
    public final p a() {
        return this.A;
    }

    @Override // j0.a
    public final j0.a b(p pVar) {
        this.f3920z = null;
        this.A = pVar;
        this.f3909n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f3921a = new j6.o(this, 3);
            pVar2.f3922b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3919y & 8) == 0) {
            return false;
        }
        if (this.f3920z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3909n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3917w && (this.f3915u || this.f3916v)) {
            drawable = drawable.mutate();
            if (this.f3915u) {
                drawable.setTintList(this.f3913s);
            }
            if (this.f3916v) {
                drawable.setTintMode(this.f3914t);
            }
            this.f3917w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f3919y & 8) != 0) {
            if (this.f3920z == null && (pVar = this.A) != null) {
                this.f3920z = pVar.f3922b.onCreateActionView(this);
            }
            if (this.f3920z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f3909n.f(this);
            }
            return false;
        }
        return false;
    }

    public final void f(boolean z9) {
        if (z9) {
            this.f3918x |= 32;
        } else {
            this.f3918x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3920z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar != null) {
            View onCreateActionView = pVar.f3922b.onCreateActionView(this);
            this.f3920z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3906k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3899b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3907l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f3908m;
        if (i != 0) {
            Drawable A = t1.A(this.f3909n.f3874a, i);
            this.f3908m = 0;
            this.f3907l = A;
            return d(A);
        }
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3913s;
    }

    @Override // j0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3914t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3904g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3898a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3905h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3900c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3910o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3902e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3903f;
        return charSequence != null ? charSequence : this.f3902e;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3912r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3910o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3918x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3918x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3918x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        return (pVar == null || !pVar.f3922b.overridesItemVisibility()) ? (this.f3918x & 8) == 0 : (this.f3918x & 8) == 0 && this.A.f3922b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3920z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f3898a) > 0) {
            view.setId(i);
        }
        m mVar = this.f3909n;
        mVar.f3882k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.j == c9) {
            return this;
        }
        this.j = Character.toLowerCase(c9);
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        int i = this.f3918x;
        int i9 = (z9 ? 1 : 0) | (i & (-2));
        this.f3918x = i9;
        if (i != i9) {
            this.f3909n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        int i = this.f3918x;
        int i9 = i & 4;
        m mVar = this.f3909n;
        if (i9 == 0) {
            int i10 = (i & (-3)) | (z9 ? 2 : 0);
            this.f3918x = i10;
            if (i != i10) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f3879f;
        int size = arrayList.size();
        mVar.w();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (oVar.f3899b == this.f3899b && (oVar.f3918x & 4) != 0 && oVar.isCheckable()) {
                boolean z10 = oVar == this;
                int i12 = oVar.f3918x;
                int i13 = (z10 ? 2 : 0) | (i12 & (-3));
                oVar.f3918x = i13;
                if (i12 != i13) {
                    oVar.f3909n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f3918x |= 16;
        } else {
            this.f3918x &= -17;
        }
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3908m = 0;
        this.f3907l = drawable;
        this.f3917w = true;
        this.f3909n.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3913s = colorStateList;
        this.f3915u = true;
        this.f3917w = true;
        this.f3909n.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3914t = mode;
        this.f3916v = true;
        this.f3917w = true;
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3904g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f3905h == c9) {
            return this;
        }
        this.f3905h = c9;
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3911p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f3905h = c9;
        this.j = Character.toLowerCase(c10);
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i9 = i & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3919y = i;
        m mVar = this.f3909n;
        mVar.f3882k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3902e = charSequence;
        this.f3909n.p(false);
        e0 e0Var = this.f3910o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3903f = charSequence;
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        int i = this.f3918x;
        int i9 = (z9 ? 0 : 8) | (i & (-9));
        this.f3918x = i9;
        if (i != i9) {
            m mVar = this.f3909n;
            mVar.f3881h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3902e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.f3909n.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setTooltipText(CharSequence charSequence) {
        this.f3912r = charSequence;
        this.f3909n.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i) {
        if (this.j == c9 && this.f3906k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c9);
        this.f3906k = KeyEvent.normalizeMetaState(i);
        this.f3909n.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i) {
        if (this.f3905h == c9 && this.i == i) {
            return this;
        }
        this.f3905h = c9;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f3909n.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i, int i9) {
        this.f3905h = c9;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c10);
        this.f3906k = KeyEvent.normalizeMetaState(i9);
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3907l = null;
        this.f3908m = i;
        this.f3917w = true;
        this.f3909n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3909n.f3874a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i9;
        m mVar = this.f3909n;
        Context context = mVar.f3874a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3920z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i9 = this.f3898a) > 0) {
            inflate.setId(i9);
        }
        mVar.f3882k = true;
        mVar.p(true);
        return this;
    }
}
