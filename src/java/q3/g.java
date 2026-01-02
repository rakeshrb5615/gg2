package q3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f5349a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f5350b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5351c;

    /* renamed from: d  reason: collision with root package name */
    public int f5352d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5357k;

    /* renamed from: m  reason: collision with root package name */
    public a5.a f5359m;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f5353e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f5354f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f5355g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f5356h = 1.0f;
    public int i = 1;
    public boolean j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f5358l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f5349a = charSequence;
        this.f5350b = textPaint;
        this.f5351c = i;
        this.f5352d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f5349a == null) {
            this.f5349a = "";
        }
        int max = Math.max(0, this.f5351c);
        CharSequence charSequence = this.f5349a;
        int i = this.f5354f;
        TextPaint textPaint = this.f5350b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f5358l);
        }
        int min = Math.min(charSequence.length(), this.f5352d);
        this.f5352d = min;
        if (this.f5357k && this.f5354f == 1) {
            this.f5353e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f5353e);
        obtain.setIncludePad(this.j);
        obtain.setTextDirection(this.f5357k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5358l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5354f);
        float f9 = this.f5355g;
        if (f9 != 0.0f || this.f5356h != 1.0f) {
            obtain.setLineSpacing(f9, this.f5356h);
        }
        if (this.f5354f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        a5.a aVar = this.f5359m;
        if (aVar != null) {
            obtain.setBreakStrategy(((TextInputLayout) aVar.f561b).A.getBreakStrategy());
        }
        return obtain.build();
    }
}
