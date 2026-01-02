package h3;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import h.e0;
import h.f0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class j extends f0 {
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof i) {
            i iVar = (i) dialog;
            if (iVar.f2179m == null) {
                iVar.e();
            }
            boolean z9 = iVar.f2179m.I;
        }
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof i) {
            i iVar = (i) dialog;
            if (iVar.f2179m == null) {
                iVar.e();
            }
            boolean z9 = iVar.f2179m.I;
        }
        super.dismissAllowingStateLoss();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [h3.i, android.app.Dialog, h.e0] */
    @Override // h.f0
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        int theme = getTheme();
        if (theme == 0) {
            TypedValue typedValue = new TypedValue();
            theme = context.getTheme().resolveAttribute(2130968711, typedValue, true) ? typedValue.resourceId : 2132017815;
        }
        ?? e0Var = new e0(context, theme);
        e0Var.q = true;
        e0Var.f2183r = true;
        e0Var.f2188w = new g(e0Var);
        e0Var.c().k(1);
        TypedArray obtainStyledAttributes = e0Var.getContext().getTheme().obtainStyledAttributes(new int[]{2130969060});
        e0Var.f2186u = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return e0Var;
    }
}
