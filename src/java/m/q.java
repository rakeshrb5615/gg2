package m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class q extends FrameLayout implements l.b {

    /* renamed from: a  reason: collision with root package name */
    public final CollapsibleActionView f3923a;

    public q(View view) {
        super(view.getContext());
        this.f3923a = (CollapsibleActionView) view;
        addView(view);
    }
}
