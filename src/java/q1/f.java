package q1;

import androidx.lifecycle.a1;
import androidx.lifecycle.c0;
import androidx.lifecycle.u;
import androidx.lifecycle.z0;
import g2.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5217a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5218b;

    public f(u uVar, a1 a1Var) {
        this.f5217a = uVar;
        this.f5218b = (e) new z0(a1Var, e.f5214d).a(e.class);
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        e eVar = this.f5218b;
        if (eVar.f5215b.f5474c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            k kVar = eVar.f5215b;
            if (i >= kVar.f5474c) {
                return;
            }
            c cVar = (c) kVar.e(i);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(eVar.f5215b.f5472a[i]);
            printWriter.print(": ");
            printWriter.println(cVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(cVar.f5208l);
            cVar.f5208l.dump(g.d(str2, "  "), fileDescriptor, printWriter, strArr);
            if (cVar.f5210n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(cVar.f5210n);
                d dVar = cVar.f5210n;
                dVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(dVar.f5213c);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            androidx.loader.content.e eVar2 = cVar.f5208l;
            Object obj = ((c0) cVar).e;
            printWriter.println(eVar2.dataToString(obj != c0.k ? obj : null));
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(((c0) cVar).c > 0);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        p0.e.a(this.f5217a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
