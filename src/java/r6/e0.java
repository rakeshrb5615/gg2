package r6;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class e0 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        kotlin.jvm.internal.j.e(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = i7.n.f2745a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(i7.j.X(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj3 = arrayList2.get(i9);
            i9++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.j.d(str2, "processName");
            arrayList3.add(new d0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.j.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static d0 b(Context context) {
        Object obj;
        String myProcessName;
        kotlin.jvm.internal.j.e(context, "context");
        int myPid = Process.myPid();
        ArrayList a10 = a(context);
        int size = a10.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = a10.get(i);
            i++;
            if (((d0) obj).f5632b == myPid) {
                break;
            }
        }
        d0 d0Var = (d0) obj;
        if (d0Var == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 > 33) {
                myProcessName = Process.myProcessName();
                kotlin.jvm.internal.j.d(myProcessName, "myProcessName(...)");
            } else if ((i9 < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            return new d0(myProcessName, myPid, 0, false);
        }
        return d0Var;
    }
}
