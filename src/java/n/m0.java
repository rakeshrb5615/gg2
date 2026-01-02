package n;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class m0 implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4221b;

    public /* synthetic */ m0(Object obj, int i) {
        this.f4220a = i;
        this.f4221b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        switch (this.f4220a) {
            case 0:
                o0 o0Var = (o0) this.f4221b;
                r0 r0Var = o0Var.M;
                r0Var.setSelection(i);
                if (r0Var.getOnItemClickListener() != null) {
                    r0Var.performItemClick(view, i, o0Var.J.getItemId(i));
                }
                o0Var.dismiss();
                return;
            default:
                z3.u uVar = (z3.u) this.f4221b;
                g2 g2Var = uVar.f7278e;
                convertSelectionToString = uVar.convertSelectionToString(i < 0 ? !g2Var.F.isShowing() ? null : g2Var.f4146c.getSelectedItem() : uVar.getAdapter().getItem(i));
                uVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = uVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !g2Var.F.isShowing() ? null : g2Var.f4146c.getSelectedView();
                        i = !g2Var.F.isShowing() ? -1 : g2Var.f4146c.getSelectedItemPosition();
                        j = !g2Var.F.isShowing() ? Long.MIN_VALUE : g2Var.f4146c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g2Var.f4146c, view, i, j);
                }
                g2Var.dismiss();
                return;
        }
    }
}
