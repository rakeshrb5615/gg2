package h;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public class f0 extends androidx.fragment.app.s {
    public Dialog onCreateDialog(Bundle bundle) {
        return new e0(getContext(), getTheme());
    }

    public final void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof e0)) {
            super.setupDialog(dialog, i);
            return;
        }
        e0 e0Var = (e0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        e0Var.c().k(1);
    }
}
