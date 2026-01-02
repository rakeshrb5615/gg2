package l6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3787a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3788b;

    public b(Set set, c cVar) {
        this.f3787a = b(set);
        this.f3788b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f3785a);
            sb.append('/');
            sb.append(aVar.f3786b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String str = this.f3787a;
        c cVar = this.f3788b;
        synchronized (((HashSet) cVar.f3791b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f3791b);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f3791b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f3791b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
