package i2;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.chilllive.chillwallpaperproject.MainActivity;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2302a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2303b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2304c;

    public /* synthetic */ b0(int i, Object obj, Object obj2) {
        this.f2302a = i;
        this.f2303b = obj;
        this.f2304c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2302a) {
            case 0:
                Dialog dialog = (Dialog) this.f2303b;
                int i = MainActivity.f958u0;
                dialog.dismiss();
                m0.h a10 = m0.h.a(String.valueOf((AtomicReference) this.f2304c));
                h.n nVar = h.p.f2096a;
                Objects.requireNonNull(a10);
                if (Build.VERSION.SDK_INT >= 33) {
                    Object c9 = h.p.c();
                    if (c9 != null) {
                        h.m.b(c9, h.l.a(a10.f3950a.f3951a.toLanguageTags()));
                    }
                } else if (!a10.equals(h.p.f2098c)) {
                    synchronized (h.p.f2103n) {
                        h.p.f2098c = a10;
                        h.p.a();
                    }
                }
                dialog.dismiss();
                return;
            case 1:
                ((l2.a0) this.f2304c).Y1.onClickStoreButton(view);
                ((Dialog) this.f2303b).dismiss();
                return;
            case 2:
                l2.a0 a0Var = (l2.a0) this.f2303b;
                TextView textView = (TextView) this.f2304c;
                a0Var.getClass();
                y.b(textView);
                textView.setSelected(true);
                a0Var.B.setSelected(false);
                a0Var.A.setSelected(false);
                a0Var.C.setSelected(false);
                a0Var.f3628z.setSelected(false);
                return;
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                y.b((ImageButton) this.f2304c);
                ((MainActivity) ((l2.d0) this.f2303b).requireActivity()).getOnBackPressedDispatcher().f843c.a();
                return;
            default:
                ((z) this.f2304c).onClick(view);
                ((y3.j) this.f2303b).a(1);
                return;
        }
    }

    public /* synthetic */ b0(l2.a0 a0Var, Dialog dialog) {
        this.f2302a = 1;
        this.f2304c = a0Var;
        this.f2303b = dialog;
    }
}
