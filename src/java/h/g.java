package h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class g extends e0 implements DialogInterface {

    /* renamed from: m  reason: collision with root package name */
    public final e f2042m;

    public g(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, e(contextThemeWrapper, i));
        this.f2042m = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968624, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.e0, c.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z9;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        e eVar = this.f2042m;
        eVar.f2018b.setContentView(eVar.q);
        Context context = eVar.f2017a;
        Window window = eVar.f2019c;
        View findViewById2 = window.findViewById(2131362294);
        View findViewById3 = findViewById2.findViewById(2131362539);
        View findViewById4 = findViewById2.findViewById(2131361987);
        View findViewById5 = findViewById2.findViewById(2131361934);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131362000);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(2131362539);
        View findViewById7 = viewGroup.findViewById(2131361987);
        View findViewById8 = viewGroup.findViewById(2131361934);
        ViewGroup a10 = e.a(findViewById6, findViewById3);
        ViewGroup a11 = e.a(findViewById7, findViewById4);
        ViewGroup a12 = e.a(findViewById8, findViewById5);
        NestedScrollView findViewById9 = window.findViewById(2131362377);
        eVar.i = findViewById9;
        findViewById9.setFocusable(false);
        eVar.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a11.findViewById(16908299);
        eVar.f2027m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.i.removeView(eVar.f2027m);
            if (eVar.f2021e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView((View) eVar.f2021e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a11.setVisibility(8);
            }
        }
        Button button = (Button) a12.findViewById(16908313);
        eVar.f2022f = button;
        View.OnClickListener onClickListener = eVar.f2036w;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(null)) {
            eVar.f2022f.setVisibility(8);
            z9 = false;
        } else {
            eVar.f2022f.setText((CharSequence) null);
            eVar.f2022f.setVisibility(0);
            z9 = true;
        }
        Button button2 = (Button) a12.findViewById(16908314);
        eVar.f2023g = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(null)) {
            eVar.f2023g.setVisibility(8);
        } else {
            eVar.f2023g.setText((CharSequence) null);
            eVar.f2023g.setVisibility(0);
            z9 |= true;
        }
        Button button3 = (Button) a12.findViewById(16908315);
        eVar.f2024h = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(null)) {
            eVar.f2024h.setVisibility(8);
        } else {
            eVar.f2024h.setText((CharSequence) null);
            eVar.f2024h.setVisibility(0);
            z9 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968622, typedValue, true);
        if (typedValue.data != 0) {
            if (z9) {
                Button button4 = eVar.f2022f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z9) {
                Button button5 = eVar.f2023g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z9) {
                Button button6 = eVar.f2024h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z9) {
            a12.setVisibility(8);
        }
        if (eVar.f2028n != null) {
            a10.addView(eVar.f2028n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131362521).setVisibility(8);
        } else {
            eVar.f2025k = (ImageView) window.findViewById(16908294);
            if (TextUtils.isEmpty(eVar.f2020d) || !eVar.f2034u) {
                window.findViewById(2131362521).setVisibility(8);
                eVar.f2025k.setVisibility(8);
                a10.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131361881);
                eVar.f2026l = textView2;
                textView2.setText(eVar.f2020d);
                Drawable drawable = eVar.j;
                if (drawable != null) {
                    eVar.f2025k.setImageDrawable(drawable);
                } else {
                    eVar.f2026l.setPadding(eVar.f2025k.getPaddingLeft(), eVar.f2025k.getPaddingTop(), eVar.f2025k.getPaddingRight(), eVar.f2025k.getPaddingBottom());
                    eVar.f2025k.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i = (a10 == null || a10.getVisibility() == 8) ? 0 : 1;
        boolean z11 = a12.getVisibility() != 8;
        if (!z11 && (findViewById = a11.findViewById(2131362496)) != null) {
            findViewById.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView = eVar.i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = eVar.f2021e != null ? a10.findViewById(2131362519) : null;
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else {
            View findViewById11 = a11.findViewById(2131362497);
            if (findViewById11 != null) {
                findViewById11.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = eVar.f2021e;
        if (recycleListView != null && (!z11 || i == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z11 ? recycleListView.getPaddingBottom() : recycleListView.b);
        }
        if (!z10) {
            NestedScrollView nestedScrollView2 = eVar.f2021e;
            if (nestedScrollView2 == null) {
                nestedScrollView2 = eVar.i;
            }
            if (nestedScrollView2 != null) {
                int i9 = z11 ? 2 : 0;
                View findViewById12 = window.findViewById(2131362376);
                View findViewById13 = window.findViewById(2131362375);
                WeakHashMap weakHashMap = q0.f5172a;
                q0.j0.b(nestedScrollView2, i | i9, 3);
                if (findViewById12 != null) {
                    a11.removeView(findViewById12);
                }
                if (findViewById13 != null) {
                    a11.removeView(findViewById13);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = eVar.f2021e;
        if (recycleListView2 == null || (listAdapter = eVar.f2029o) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i10 = eVar.f2030p;
        if (i10 > -1) {
            recycleListView2.setItemChecked(i10, true);
            recycleListView2.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2042m.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2042m.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // h.e0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f2042m;
        eVar.f2020d = charSequence;
        TextView textView = eVar.f2026l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
