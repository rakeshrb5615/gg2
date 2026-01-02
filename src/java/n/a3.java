package n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a3 implements m.y {

    /* renamed from: a  reason: collision with root package name */
    public m.m f4084a;

    /* renamed from: b  reason: collision with root package name */
    public m.o f4085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4086c;

    public a3(Toolbar toolbar) {
        this.f4086c = toolbar;
    }

    @Override // m.y
    public final void a(m.m mVar, boolean z9) {
    }

    @Override // m.y
    public final void d() {
        if (this.f4085b != null) {
            m.m mVar = this.f4084a;
            if (mVar != null) {
                int size = mVar.f3879f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f4084a.getItem(i) == this.f4085b) {
                        return;
                    }
                }
            }
            k(this.f4085b);
        }
    }

    @Override // m.y
    public final boolean e(m.o oVar) {
        Toolbar toolbar = this.f4086c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = oVar.getActionView();
        toolbar.o = actionView;
        this.f4085b = oVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.o);
            }
            b3 h9 = Toolbar.h();
            h9.f4095a = (toolbar.t & 112) | 8388611;
            h9.f4096b = 2;
            toolbar.o.setLayoutParams(h9);
            toolbar.addView(toolbar.o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            ActionMenuView childAt = toolbar.getChildAt(childCount);
            if (((b3) childAt.getLayoutParams()).f4096b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.K.add(childAt);
            }
        }
        toolbar.requestLayout();
        oVar.C = true;
        oVar.f3909n.p(false);
        View view = toolbar.o;
        if (view instanceof l.b) {
            ((m.q) ((l.b) view)).f3923a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // m.y
    public final void g(Context context, m.m mVar) {
        m.o oVar;
        m.m mVar2 = this.f4084a;
        if (mVar2 != null && (oVar = this.f4085b) != null) {
            mVar2.d(oVar);
        }
        this.f4084a = mVar;
    }

    @Override // m.y
    public final boolean h() {
        return false;
    }

    @Override // m.y
    public final boolean i(m.e0 e0Var) {
        return false;
    }

    @Override // m.y
    public final boolean k(m.o oVar) {
        Toolbar toolbar = this.f4086c;
        View view = toolbar.o;
        if (view instanceof l.b) {
            ((m.q) ((l.b) view)).f3923a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.o);
        toolbar.removeView(toolbar.n);
        toolbar.o = null;
        ArrayList arrayList = toolbar.K;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4085b = null;
        toolbar.requestLayout();
        oVar.C = false;
        oVar.f3909n.p(false);
        toolbar.t();
        return true;
    }
}
