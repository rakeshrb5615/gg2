package s3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c extends q4.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f5821f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextPaint f5822g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q4.b f5823h;
    public final /* synthetic */ d i;

    public c(d dVar, Context context, TextPaint textPaint, q4.b bVar) {
        super(26);
        this.i = dVar;
        this.f5821f = context;
        this.f5822g = textPaint;
        this.f5823h = bVar;
    }

    @Override // q4.b
    public final void I(int i) {
        this.f5823h.I(i);
    }

    @Override // q4.b
    public final void J(Typeface typeface, boolean z9) {
        this.i.f(this.f5821f, this.f5822g, typeface);
        this.f5823h.J(typeface, z9);
    }
}
