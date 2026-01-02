package n;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f4280a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e9) {
            e9.printStackTrace();
        }
        f4280a = field;
    }
}
