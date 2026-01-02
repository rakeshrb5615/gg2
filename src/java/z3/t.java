package z3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class t extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f7275a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f7276b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f7277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f7277c = uVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        u uVar = this.f7277c;
        ColorStateList colorStateList2 = uVar.f7284r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f7276b = colorStateList;
        if (uVar.q != 0 && uVar.f7284r != null) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{h0.a.e(uVar.f7284r.getColorForState(iArr3, 0), uVar.q), h0.a.e(uVar.f7284r.getColorForState(iArr2, 0), uVar.q), uVar.q});
        }
        this.f7275a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            u uVar = this.f7277c;
            RippleDrawable rippleDrawable = null;
            if (uVar.getText().toString().contentEquals(textView.getText()) && uVar.q != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(uVar.q);
                if (this.f7276b != null) {
                    colorDrawable.setTintList(this.f7275a);
                    rippleDrawable = new RippleDrawable(this.f7276b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
