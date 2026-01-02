package h3;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2157a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2159c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2160d;

    public a(TextView textView, Typeface typeface, int i) {
        this.f2159c = textView;
        this.f2160d = typeface;
        this.f2158b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2157a) {
            case 0:
                ((BottomSheetBehavior) this.f2160d).K(this.f2159c, this.f2158b, false);
                return;
            default:
                ((TextView) this.f2159c).setTypeface((Typeface) this.f2160d, this.f2158b);
                return;
        }
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f2160d = bottomSheetBehavior;
        this.f2159c = view;
        this.f2158b = i;
    }
}
