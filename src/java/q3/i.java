package q3;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public float f5362c;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f5364e;

    /* renamed from: f  reason: collision with root package name */
    public s3.d f5365f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f5360a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final l3.b f5361b = new l3.b(this, 1);

    /* renamed from: d  reason: collision with root package name */
    public boolean f5363d = true;

    public i(h hVar) {
        this.f5364e = new WeakReference(null);
        this.f5364e = new WeakReference(hVar);
    }

    public final float a(String str) {
        if (this.f5363d) {
            TextPaint textPaint = this.f5360a;
            this.f5362c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
            if (str != null) {
                Math.abs(textPaint.getFontMetrics().ascent);
            }
            this.f5363d = false;
            return this.f5362c;
        }
        return this.f5362c;
    }

    public final void b(s3.d dVar, Context context) {
        if (this.f5365f != dVar) {
            this.f5365f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f5360a;
                l3.b bVar = this.f5361b;
                dVar.e(context, textPaint, bVar);
                h hVar = (h) this.f5364e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                this.f5363d = true;
            }
            h hVar2 = (h) this.f5364e.get();
            if (hVar2 != null) {
                hVar2.a();
                hVar2.onStateChange(hVar2.getState());
            }
        }
    }
}
