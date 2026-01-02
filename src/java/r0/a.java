package r0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f5475a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5476b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5477c;

    public a(int i, c cVar, int i9) {
        this.f5475a = i;
        this.f5476b = cVar;
        this.f5477c = i9;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5475a);
        this.f5476b.f5491a.performAction(this.f5477c, bundle);
    }
}
