package m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class m implements Menu {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3873y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f3874a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f3875b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3876c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3877d;

    /* renamed from: e  reason: collision with root package name */
    public k f3878e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f3879f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3880g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3881h;
    public final ArrayList i;
    public final ArrayList j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3882k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f3884m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3885n;

    /* renamed from: o  reason: collision with root package name */
    public View f3886o;

    /* renamed from: v  reason: collision with root package name */
    public o f3892v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3894x;

    /* renamed from: l  reason: collision with root package name */
    public int f3883l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3887p = false;
    public boolean q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3888r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3889s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f3890t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f3891u = new CopyOnWriteArrayList();

    /* renamed from: w  reason: collision with root package name */
    public boolean f3893w = false;

    public m(Context context) {
        boolean z9;
        boolean z10 = false;
        this.f3874a = context;
        Resources resources = context.getResources();
        this.f3875b = resources;
        this.f3879f = new ArrayList();
        this.f3880g = new ArrayList();
        this.f3881h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.f3882k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = e0.a.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z9 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z9) {
                z10 = true;
            }
        }
        this.f3877d = z10;
    }

    public final o a(int i, int i9, int i10, CharSequence charSequence) {
        int i11;
        int i12 = ((-65536) & i10) >> 16;
        if (i12 < 0 || i12 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i13 = (f3873y[i12] << 16) | (65535 & i10);
        o oVar = new o(this, i, i9, i10, i13, charSequence, this.f3883l);
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            } else if (((o) arrayList.get(size)).f3901d <= i13) {
                i11 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i11, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f3874a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a10 = a(i, i9, i10, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f3904g = intent2;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = a10;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f3891u.add(new WeakReference(yVar));
        yVar.g(context, this);
        this.f3882k = true;
    }

    public final void c(boolean z9) {
        if (this.f3889s) {
            return;
        }
        this.f3889s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3891u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.a(this, z9);
            }
        }
        this.f3889s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f3892v;
        if (oVar != null) {
            d(oVar);
        }
        this.f3879f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3885n = null;
        this.f3884m = null;
        this.f3886o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3891u;
        boolean z9 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3892v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 = yVar.k(oVar);
                    if (z9) {
                        break;
                    }
                }
            }
            v();
            if (z9) {
                this.f3892v = null;
            }
        }
        return z9;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f3878e;
        return kVar != null && kVar.b(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3891u;
        boolean z9 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 = yVar.e(oVar);
                if (z9) {
                    break;
                }
            }
        }
        v();
        if (z9) {
            this.f3892v = oVar;
        }
        return z9;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f3898a == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f3910o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3890t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n9 = n();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            char c9 = n9 ? oVar.j : oVar.f3905h;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (n9 && c9 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3879f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n9 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f3879f;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                o oVar = (o) arrayList.get(i9);
                if (oVar.hasSubMenu()) {
                    oVar.f3910o.h(list, i, keyEvent);
                }
                char c9 = n9 ? oVar.j : oVar.f3905h;
                if ((modifiers & 69647) == ((n9 ? oVar.f3906k : oVar.i) & 69647) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c9 == cArr[0] || c9 == cArr[2] || (n9 && c9 == '\b' && i == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3894x) {
            return true;
        }
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l5 = l();
        if (this.f3882k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3891u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 |= yVar.h();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z9) {
                arrayList.clear();
                arrayList2.clear();
                int size = l5.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l5.get(i);
                    if ((oVar.f3918x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3882k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z9 = this.f3881h;
        ArrayList arrayList = this.f3880g;
        if (z9) {
            arrayList.clear();
            ArrayList arrayList2 = this.f3879f;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                o oVar = (o) arrayList2.get(i);
                if (oVar.isVisible()) {
                    arrayList.add(oVar);
                }
            }
            this.f3881h = false;
            this.f3882k = true;
            return arrayList;
        }
        return arrayList;
    }

    public boolean m() {
        return this.f3893w;
    }

    public boolean n() {
        return this.f3876c;
    }

    public boolean o() {
        return this.f3877d;
    }

    public final void p(boolean z9) {
        if (this.f3887p) {
            this.q = true;
            if (z9) {
                this.f3888r = true;
                return;
            }
            return;
        }
        if (z9) {
            this.f3881h = true;
            this.f3882k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3891u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.d();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i9) {
        return q(findItem(i), null, i9);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i9) {
        o g3 = g(i, keyEvent);
        boolean q = g3 != null ? q(g3, null, i9) : false;
        if ((i9 & 2) != 0) {
            c(true);
        }
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, m.y r8, int r9) {
        /*
            r6 = this;
            m.o r7 = (m.o) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            m.m r1 = r7.f3909n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f3911p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f3904g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f3874a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            m.p r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f3922b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            m.p r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f3922b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            m.e0 r9 = new m.e0
            android.content.Context r5 = r6.f3874a
            r9.<init>(r5, r6, r7)
            r7.f3910o = r9
            java.lang.CharSequence r5 = r7.f3902e
            r9.setHeaderTitle(r5)
        L90:
            m.e0 r7 = r7.f3910o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f3922b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f3891u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.i(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            m.y r4 = (m.y) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.i(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.m.q(android.view.MenuItem, m.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3891u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((o) arrayList.get(i10)).f3899b == i) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            int size2 = arrayList.size() - i10;
            while (true) {
                int i11 = i9 + 1;
                if (i9 >= size2 || ((o) arrayList.get(i10)).f3899b != i) {
                    break;
                }
                if (i10 >= 0 && i10 < arrayList.size()) {
                    arrayList.remove(i10);
                }
                i9 = i11;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((o) arrayList.get(i9)).f3898a == i) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i9);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f3879f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (findItem = findItem(i9)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z9, boolean z10) {
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f3899b == i) {
                oVar.f3918x = (oVar.f3918x & (-5)) | (z10 ? 4 : 0);
                oVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f3893w = z9;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z9) {
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f3899b == i) {
                oVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z9) {
        ArrayList arrayList = this.f3879f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = (o) arrayList.get(i9);
            if (oVar.f3899b == i) {
                int i10 = oVar.f3918x;
                int i11 = (i10 & (-9)) | (z9 ? 0 : 8);
                oVar.f3918x = i11;
                if (i10 != i11) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f3876c = z9;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3879f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3879f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i9, Drawable drawable, View view) {
        if (view != null) {
            this.f3886o = view;
            this.f3884m = null;
            this.f3885n = null;
        } else {
            if (i > 0) {
                this.f3884m = this.f3875b.getText(i);
            } else if (charSequence != null) {
                this.f3884m = charSequence;
            }
            if (i9 > 0) {
                this.f3885n = e0.c.getDrawable(this.f3874a, i9);
            } else if (drawable != null) {
                this.f3885n = drawable;
            }
            this.f3886o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3887p = false;
        if (this.q) {
            this.q = false;
            p(this.f3888r);
        }
    }

    public final void w() {
        if (this.f3887p) {
            return;
        }
        this.f3887p = true;
        this.q = false;
        this.f3888r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f3875b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3875b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, CharSequence charSequence) {
        return a(i, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, CharSequence charSequence) {
        o a10 = a(i, i9, i10, charSequence);
        e0 e0Var = new e0(this.f3874a, this, a10);
        a10.f3910o = e0Var;
        e0Var.setHeaderTitle(a10.f3902e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, int i11) {
        return a(i, i9, i10, this.f3875b.getString(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, int i11) {
        return addSubMenu(i, i9, i10, this.f3875b.getString(i11));
    }
}
