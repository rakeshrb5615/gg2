package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class i implements y, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f3861a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f3862b;

    /* renamed from: c  reason: collision with root package name */
    public m f3863c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f3864d;

    /* renamed from: e  reason: collision with root package name */
    public x f3865e;

    /* renamed from: f  reason: collision with root package name */
    public h f3866f;

    public i(ContextWrapper contextWrapper) {
        this.f3861a = contextWrapper;
        this.f3862b = LayoutInflater.from(contextWrapper);
    }

    @Override // m.y
    public final void a(m mVar, boolean z9) {
        x xVar = this.f3865e;
        if (xVar != null) {
            xVar.a(mVar, z9);
        }
    }

    @Override // m.y
    public final void d() {
        h hVar = this.f3866f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // m.y
    public final boolean e(o oVar) {
        return false;
    }

    @Override // m.y
    public final void g(Context context, m mVar) {
        if (this.f3861a != null) {
            this.f3861a = context;
            if (this.f3862b == null) {
                this.f3862b = LayoutInflater.from(context);
            }
        }
        this.f3863c = mVar;
        h hVar = this.f3866f;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // m.y
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, m.x, java.lang.Object, m.n, android.content.DialogInterface$OnDismissListener] */
    @Override // m.y
    public final boolean i(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f3874a;
        if (hasVisibleItems) {
            ?? obj = new Object();
            obj.f3895a = e0Var;
            h.f fVar = new h.f(context);
            h.b bVar = (h.b) fVar.f2041c;
            i iVar = new i(bVar.f1967a);
            obj.f3897c = iVar;
            iVar.f3865e = obj;
            e0Var.b(iVar, context);
            i iVar2 = obj.f3897c;
            if (iVar2.f3866f == null) {
                iVar2.f3866f = new h(iVar2);
            }
            bVar.f1973g = iVar2.f3866f;
            bVar.f1974h = obj;
            View view = e0Var.f3886o;
            if (view != null) {
                bVar.f1971e = view;
            } else {
                bVar.f1969c = e0Var.f3885n;
                bVar.f1970d = e0Var.f3884m;
            }
            bVar.f1972f = obj;
            h.g b10 = fVar.b();
            obj.f3896b = b10;
            b10.setOnDismissListener(obj);
            WindowManager.LayoutParams attributes = obj.f3896b.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            obj.f3896b.show();
            x xVar = this.f3865e;
            if (xVar != null) {
                xVar.h(e0Var);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // m.y
    public final void j(x xVar) {
        throw null;
    }

    @Override // m.y
    public final boolean k(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f3863c.q(this.f3866f.getItem(i), this, 0);
    }
}
