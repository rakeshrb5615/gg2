package i2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.chilllive.chillwallpaperproject.MainActivity;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.install.zza;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f2318a;

    public /* synthetic */ e0(MainActivity mainActivity) {
        this.f2318a = mainActivity;
    }

    public final void a(zza zzaVar) {
        ViewGroup viewGroup;
        MainActivity mainActivity = this.f2318a;
        int i = MainActivity.f958u0;
        if (zzaVar.a == 11) {
            View findViewById = mainActivity.findViewById(16908290);
            int[] iArr = y3.j.C;
            CharSequence text = findViewById.getResources().getText(2131951624);
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(findViewById instanceof CoordinatorLayout)) {
                    if (findViewById instanceof FrameLayout) {
                        if (findViewById.getId() == 16908290) {
                            viewGroup = (ViewGroup) findViewById;
                            break;
                        }
                        viewGroup2 = (ViewGroup) findViewById;
                    }
                    ViewParent parent = findViewById.getParent();
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                        continue;
                    } else {
                        findViewById = null;
                        continue;
                    }
                    if (findViewById == null) {
                        viewGroup = viewGroup2;
                        break;
                    }
                } else {
                    viewGroup = (ViewGroup) findViewById;
                    break;
                }
            }
            if (viewGroup == null) {
                throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
            }
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y3.j.C);
            boolean z9 = false;
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            SnackbarContentLayout inflate = from.inflate((resourceId == -1 || resourceId2 == -1) ? 2131558438 : 2131558507, viewGroup, false);
            y3.j jVar = new y3.j(context, viewGroup, inflate, inflate);
            jVar.i.getChildAt(0).getMessageView().setText(text);
            jVar.f6816k = -2;
            z zVar = new z(mainActivity, 5);
            CharSequence text2 = context.getText(2131952292);
            Button actionView = jVar.i.getChildAt(0).getActionView();
            if (TextUtils.isEmpty(text2)) {
                actionView.setVisibility(8);
                actionView.setOnClickListener(null);
                jVar.B = false;
            } else {
                jVar.B = true;
                actionView.setVisibility(0);
                actionView.setText(text2);
                actionView.setOnClickListener(new b0(4, jVar, zVar));
            }
            j6.s h9 = j6.s.h();
            int g3 = jVar.g();
            y3.f fVar = jVar.f6824t;
            synchronized (h9.f3282b) {
                try {
                    if (h9.l(fVar)) {
                        y3.l lVar = (y3.l) h9.f3284d;
                        lVar.f6827b = g3;
                        ((Handler) h9.f3283c).removeCallbacksAndMessages(lVar);
                        h9.r((y3.l) h9.f3284d);
                        return;
                    }
                    y3.l lVar2 = (y3.l) h9.f3285e;
                    if (lVar2 != null && lVar2.f6826a.get() == fVar) {
                        z9 = true;
                    }
                    if (z9) {
                        ((y3.l) h9.f3285e).f6827b = g3;
                    } else {
                        h9.f3285e = new y3.l(g3, fVar);
                    }
                    y3.l lVar3 = (y3.l) h9.f3284d;
                    if (lVar3 == null || !h9.c(lVar3, 4)) {
                        h9.f3284d = null;
                        h9.s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
