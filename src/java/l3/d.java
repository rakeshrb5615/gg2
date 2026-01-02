package l3;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class d extends y0.b {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // y0.b
    public final int n(float f9, float f10) {
        Rect rect = Chip.C;
        Chip chip = this.q;
        return (chip.d() && Chip.a(chip).contains(f9, f10)) ? 1 : 0;
    }

    @Override // y0.b
    public final void o(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.C;
        Chip chip = this.q;
        if (!chip.d() || (fVar = chip.e) == null || !fVar.Z || chip.n == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // y0.b
    public final boolean s(int i, int i9, Bundle bundle) {
        boolean z9 = false;
        if (i9 == 16) {
            View view = this.q;
            if (i == 0) {
                return view.performClick();
            }
            if (i == 1) {
                view.playSoundEffect(0);
                View.OnClickListener onClickListener = ((Chip) view).n;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    z9 = true;
                }
                if (((Chip) view).y) {
                    ((Chip) view).x.x(1, 1);
                }
            }
        }
        return z9;
    }

    @Override // y0.b
    public final void t(r0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        Chip chip = this.q;
        f fVar = chip.e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        cVar.i(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // y0.b
    public final void u(int i, r0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5491a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.C);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(2131952129, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(Chip.b(chip));
        cVar.b(r0.b.f5478e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        cVar.i(Button.class.getName());
    }

    @Override // y0.b
    public final void v(int i, boolean z9) {
        Chip chip = this.q;
        if (i == 1) {
            chip.s = z9;
        }
        f fVar = chip.e;
        boolean z10 = chip.s;
        boolean z11 = false;
        if (fVar.f3751a0 != null) {
            z11 = fVar.U(z10 ? new int[]{16842919, 16842910} : f.U0);
        }
        if (z11) {
            chip.refreshDrawableState();
        }
    }
}
