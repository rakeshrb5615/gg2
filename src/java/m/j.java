package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class j extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final m f3867a;

    /* renamed from: b  reason: collision with root package name */
    public int f3868b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3869c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3870d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f3871e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3872f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z9, int i) {
        this.f3870d = z9;
        this.f3871e = layoutInflater;
        this.f3867a = mVar;
        this.f3872f = i;
        a();
    }

    public final void a() {
        m mVar = this.f3867a;
        o oVar = mVar.f3892v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f3868b = i;
                    return;
                }
            }
        }
        this.f3868b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final o getItem(int i) {
        ArrayList l5;
        boolean z9 = this.f3870d;
        m mVar = this.f3867a;
        if (z9) {
            mVar.i();
            l5 = mVar.j;
        } else {
            l5 = mVar.l();
        }
        int i9 = this.f3868b;
        if (i9 >= 0 && i >= i9) {
            i++;
        }
        return (o) l5.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l5;
        boolean z9 = this.f3870d;
        m mVar = this.f3867a;
        if (z9) {
            mVar.i();
            l5 = mVar.j;
        } else {
            l5 = mVar.l();
        }
        return this.f3868b < 0 ? l5.size() : l5.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z9 = false;
        if (view == null) {
            view = this.f3871e.inflate(this.f3872f, viewGroup, false);
        }
        int i9 = getItem(i).f3899b;
        int i10 = i - 1;
        int i11 = i10 >= 0 ? getItem(i10).f3899b : i9;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3867a.m() && i9 != i11) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        z zVar = (z) view;
        if (this.f3869c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
