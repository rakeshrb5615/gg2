package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class k2 extends t1 {

    /* renamed from: s  reason: collision with root package name */
    public final int f4199s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4200t;

    /* renamed from: u  reason: collision with root package name */
    public h2 f4201u;

    /* renamed from: v  reason: collision with root package name */
    public m.o f4202v;

    public k2(Context context, boolean z9) {
        super(context, z9);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4199s = 21;
            this.f4200t = 22;
            return;
        }
        this.f4199s = 22;
        this.f4200t = 21;
    }

    @Override // n.t1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        m.j jVar;
        int i;
        int pointToPosition;
        int i9;
        if (this.f4201u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                jVar = (m.j) headerViewListAdapter.getWrappedAdapter();
            } else {
                jVar = (m.j) adapter;
                i = 0;
            }
            m.o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i9 = pointToPosition - i) < 0 || i9 >= jVar.getCount()) ? null : jVar.getItem(i9);
            m.o oVar = this.f4202v;
            if (oVar != item) {
                m.m mVar = jVar.f3867a;
                if (oVar != null) {
                    this.f4201u.n(mVar, oVar);
                }
                this.f4202v = item;
                if (item != null) {
                    this.f4201u.d(mVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView selectedView = getSelectedView();
        if (selectedView != null && i == this.f4199s) {
            if (selectedView.isEnabled() && selectedView.getItemData().hasSubMenu()) {
                performItemClick(selectedView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (selectedView == null || i != this.f4200t) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (m.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (m.j) adapter).f3867a.c(false);
            return true;
        }
    }

    public void setHoverListener(h2 h2Var) {
        this.f4201u = h2Var;
    }

    @Override // n.t1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
