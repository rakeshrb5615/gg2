package d5;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import i7.n;
import j5.c2;
import j5.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f1127a = new Object();

    /* JADX WARN: Type inference failed for: r5v2, types: [j5.y0, java.lang.Object] */
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        j.e(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = n.f2745a;
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
            ?? obj4 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            obj4.f3197a = str2;
            obj4.f3198b = runningAppProcessInfo.pid;
            obj4.f3199c = runningAppProcessInfo.importance;
            obj4.f3201e = (byte) (((byte) (obj4.f3201e | 1)) | 2);
            obj4.f3200d = j.a(str2, str);
            obj4.f3201e = (byte) (obj4.f3201e | 4);
            arrayList3.add(obj4.a());
        }
        return arrayList3;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [j5.y0, java.lang.Object] */
    public final c2 b(Context context) {
        Object obj;
        String str;
        j.e(context, "context");
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
            if (((z0) ((c2) obj)).f3205b == myPid) {
                break;
            }
        }
        c2 c2Var = (c2) obj;
        if (c2Var == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 > 33) {
                str = Process.myProcessName();
                j.b(str);
            } else if (i9 < 28 || (str = Application.getProcessName()) == null) {
                str = "";
            }
            j.e(str, "processName");
            ?? obj2 = new Object();
            obj2.f3197a = str;
            obj2.f3198b = myPid;
            obj2.f3199c = 0;
            obj2.f3200d = false;
            obj2.f3201e = (byte) (((byte) (((byte) (obj2.f3201e | 1)) | 2)) | 4);
            return obj2.a();
        }
        return c2Var;
    }
}
