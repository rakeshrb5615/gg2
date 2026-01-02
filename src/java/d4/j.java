package d4;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1093a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f1093a = new HashMap();
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat("PlayCoreVersion");
    }
}
