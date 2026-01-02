package q0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class p0 {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f5161d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f5162a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f5163b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f5164c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f5162a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a10 = a(viewGroup.getChildAt(childCount));
                if (a10 != null) {
                    return a10;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(2131362488);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
