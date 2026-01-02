package n;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class f1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) g1.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
