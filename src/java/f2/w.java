package f2;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1481a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f1482b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f1483c;

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.a, f2.y] */
    static {
        ?? yVar = new y();
        yVar.I = false;
        yVar.M(new h(2));
        yVar.M(new s());
        yVar.M(new h(1));
        f1481a = yVar;
        f1482b = new ThreadLocal();
        f1483c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, f2.v] */
    public static void a(ViewGroup viewGroup, s sVar) {
        ArrayList arrayList = f1483c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (sVar == null) {
            sVar = f1481a;
        }
        s clone = sVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((s) obj).z(viewGroup);
            }
        }
        clone.k(viewGroup, true);
        if (viewGroup.getTag(2131362549) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(2131362549, null);
        ?? obj2 = new Object();
        obj2.f1479a = clone;
        obj2.f1480b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(obj2);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [r.e, java.lang.Object, r.j] */
    public static r.e b() {
        r.e eVar;
        ThreadLocal threadLocal = f1482b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference == null || (eVar = (r.e) weakReference.get()) == null) {
            ?? jVar = new r.j(0);
            threadLocal.set(new WeakReference(jVar));
            return jVar;
        }
        return eVar;
    }
}
