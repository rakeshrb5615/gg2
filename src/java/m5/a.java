package m5;

import android.util.Log;
import g5.h;
import g5.i;
import g5.k;
import j5.j2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import o5.d;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f4009e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    public static final int f4010f = 15;

    /* renamed from: g  reason: collision with root package name */
    public static final k5.a f4011g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final i f4012h = new i(2);
    public static final h i = new h(2);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f4013a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final c f4014b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4015c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4016d;

    public a(c cVar, d dVar, k kVar) {
        this.f4014b = cVar;
        this.f4015c = dVar;
        this.f4016d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f4009e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f4009e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f4014b;
        arrayList.addAll(c.e(((File) cVar.f4024m).listFiles()));
        arrayList.addAll(c.e(((File) cVar.f4025n).listFiles()));
        i iVar = f4012h;
        Collections.sort(arrayList, iVar);
        List e9 = c.e(((File) cVar.f4023f).listFiles());
        Collections.sort(e9, iVar);
        arrayList.addAll(e9);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(((File) this.f4014b.f4022e).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z9) {
        c cVar = this.f4014b;
        int i9 = this.f4015c.b().f5015a.f5014a;
        f4011g.getClass();
        try {
            f(cVar.b(str, v1.a.l("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f4013a.getAndIncrement())), z9 ? "_" : "")), k5.a.f3403a.q(j2Var));
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e9);
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.f4022e, str);
        file.mkdirs();
        List<File> e10 = c.e(file.listFiles(hVar));
        Collections.sort(e10, new i(3));
        int size = e10.size();
        for (File file2 : e10) {
            if (size <= i9) {
                return;
            }
            c.d(file2);
            size--;
        }
    }
}
