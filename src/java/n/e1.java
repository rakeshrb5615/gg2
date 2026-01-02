package n;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e1 extends d1 {
    @Override // n.d1, n.f1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // n.f1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
