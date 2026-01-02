package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class b0 extends h.z implements Menu {

    /* renamed from: c  reason: collision with root package name */
    public final m f3812c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f3812c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f3812c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f3812c.addIntentOptions(i, i9, i10, componentName, intentArr, intent, i11, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = f(menuItemArr2[i12]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3812c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        r.j jVar = (r.j) this.f2122b;
        if (jVar != null) {
            jVar.clear();
        }
        this.f3812c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f3812c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return f(this.f3812c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return f(this.f3812c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f3812c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f3812c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i9) {
        return this.f3812c.performIdentifierAction(i, i9);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i9) {
        return this.f3812c.performShortcut(i, keyEvent, i9);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((r.j) this.f2122b) != null) {
            int i9 = 0;
            while (true) {
                r.j jVar = (r.j) this.f2122b;
                if (i9 >= jVar.f5471c) {
                    break;
                }
                if (((j0.a) jVar.g(i9)).getGroupId() == i) {
                    ((r.j) this.f2122b).h(i9);
                    i9--;
                }
                i9++;
            }
        }
        this.f3812c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((r.j) this.f2122b) != null) {
            int i9 = 0;
            while (true) {
                r.j jVar = (r.j) this.f2122b;
                if (i9 >= jVar.f5471c) {
                    break;
                } else if (((j0.a) jVar.g(i9)).getItemId() == i) {
                    ((r.j) this.f2122b).h(i9);
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f3812c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z9, boolean z10) {
        this.f3812c.setGroupCheckable(i, z9, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z9) {
        this.f3812c.setGroupEnabled(i, z9);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z9) {
        this.f3812c.setGroupVisible(i, z9);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f3812c.setQwertyMode(z9);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3812c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f3812c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return f(this.f3812c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, CharSequence charSequence) {
        return this.f3812c.addSubMenu(i, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, CharSequence charSequence) {
        return f(this.f3812c.a(i, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, int i11) {
        return this.f3812c.addSubMenu(i, i9, i10, i11);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, int i11) {
        return f(this.f3812c.add(i, i9, i10, i11));
    }
}
