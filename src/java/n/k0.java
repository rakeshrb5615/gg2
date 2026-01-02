package n;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class k0 implements q0, DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public h.g f4195a;

    /* renamed from: b  reason: collision with root package name */
    public l0 f4196b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f4197c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r0 f4198d;

    public k0(r0 r0Var) {
        this.f4198d = r0Var;
    }

    @Override // n.q0
    public final int a() {
        return 0;
    }

    @Override // n.q0
    public final boolean b() {
        h.g gVar = this.f4195a;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // n.q0
    public final void dismiss() {
        h.g gVar = this.f4195a;
        if (gVar != null) {
            gVar.dismiss();
            this.f4195a = null;
        }
    }

    @Override // n.q0
    public final Drawable e() {
        return null;
    }

    @Override // n.q0
    public final void g(CharSequence charSequence) {
        this.f4197c = charSequence;
    }

    @Override // n.q0
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // n.q0
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // n.q0
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // n.q0
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // n.q0
    public final void l(int i, int i9) {
        if (this.f4196b == null) {
            return;
        }
        r0 r0Var = this.f4198d;
        h.f fVar = new h.f(r0Var.getPopupContext());
        h.b bVar = (h.b) fVar.f2041c;
        CharSequence charSequence = this.f4197c;
        if (charSequence != null) {
            bVar.f1970d = charSequence;
        }
        l0 l0Var = this.f4196b;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        bVar.f1973g = l0Var;
        bVar.f1974h = this;
        bVar.j = selectedItemPosition;
        bVar.i = true;
        h.g b10 = fVar.b();
        this.f4195a = b10;
        AlertController.RecycleListView recycleListView = b10.f2042m.f2021e;
        recycleListView.setTextDirection(i);
        recycleListView.setTextAlignment(i9);
        this.f4195a.show();
    }

    @Override // n.q0
    public final int m() {
        return 0;
    }

    @Override // n.q0
    public final CharSequence o() {
        return this.f4197c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        r0 r0Var = this.f4198d;
        r0Var.setSelection(i);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i, this.f4196b.getItemId(i));
        }
        dismiss();
    }

    @Override // n.q0
    public final void p(ListAdapter listAdapter) {
        this.f4196b = (l0) listAdapter;
    }
}
