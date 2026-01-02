package m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public int f3859a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f3860b;

    public h(i iVar) {
        this.f3860b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f3860b.f3863c;
        o oVar = mVar.f3892v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f3859a = i;
                    return;
                }
            }
        }
        this.f3859a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final o getItem(int i) {
        i iVar = this.f3860b;
        m mVar = iVar.f3863c;
        mVar.i();
        ArrayList arrayList = mVar.j;
        iVar.getClass();
        int i9 = this.f3859a;
        if (i9 >= 0 && i >= i9) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f3860b;
        m mVar = iVar.f3863c;
        mVar.i();
        int size = mVar.j.size();
        iVar.getClass();
        return this.f3859a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3860b.f3862b.inflate(2131558416, viewGroup, false);
        }
        ((z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
