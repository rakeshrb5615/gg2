package v0;

import i7.p;
import i7.r;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f6159a;

    static {
        Set set;
        Integer[] numArr = {7, 20};
        int length = numArr.length;
        if (length != 0) {
            if (length != 1) {
                set = new LinkedHashSet(r.l0(numArr.length));
                for (Integer num : numArr) {
                    set.add(num);
                }
            } else {
                set = Collections.singleton(numArr[0]);
                j.d(set, "singleton(...)");
            }
        } else {
            set = p.f2747a;
        }
        f6159a = set;
    }
}
