package a5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class u implements c6.a, m0.c, OnCompleteListener, Continuation, f, SuccessContinuation, z2.b, y2.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f610a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f611b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f612c;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.f610a = i;
        this.f611b = obj;
        this.f612c = obj2;
    }

    private final Object c(Task task) {
        n6.i iVar = (n6.i) this.f611b;
        Date date = (Date) this.f612c;
        iVar.getClass();
        if (task.isSuccessful()) {
            n6.n nVar = iVar.f4933h;
            synchronized (nVar.f4963b) {
                nVar.f4962a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof m6.e) {
            n6.n nVar2 = iVar.f4933h;
            synchronized (nVar2.f4963b) {
                nVar2.f4962a.edit().putInt("last_fetch_status", 2).apply();
            }
            return task;
        }
        n6.n nVar3 = iVar.f4933h;
        synchronized (nVar3.f4963b) {
            nVar3.f4962a.edit().putInt("last_fetch_status", 1).apply();
        }
        return task;
    }

    @Override // c6.a
    public void a(c6.b bVar) {
        ((c6.a) this.f611b).a(bVar);
        ((c6.a) this.f612c).a(bVar);
    }

    @Override // y2.f
    public Object apply(Object obj) {
        o2.d[] values;
        y2.h hVar = (y2.h) this.f611b;
        r2.j jVar = (r2.j) this.f612c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        y2.a aVar = hVar.f6775d;
        ArrayList s5 = hVar.s(sQLiteDatabase, jVar, aVar.f6760b);
        for (o2.d dVar : o2.d.values()) {
            if (dVar != jVar.f5538c) {
                int size = aVar.f6760b - s5.size();
                if (size <= 0) {
                    break;
                }
                s5.addAll(hVar.s(sQLiteDatabase, jVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < s5.size(); i++) {
            sb.append(((y2.b) s5.get(i)).f6764a);
            if (i < s5.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new y2.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = s5.listIterator();
        while (listIterator.hasNext()) {
            y2.b bVar = (y2.b) listIterator.next();
            long j8 = bVar.f6764a;
            if (hashMap.containsKey(Long.valueOf(j8))) {
                r2.h c9 = bVar.f6766c.c();
                for (y2.g gVar : (Set) hashMap.get(Long.valueOf(j8))) {
                    c9.a(gVar.f6769a, gVar.f6770b);
                }
                listIterator.set(new y2.b(j8, bVar.f6765b, c9.b()));
            }
        }
        return s5;
    }

    @Override // z2.b
    public Object b() {
        switch (this.f610a) {
            case 10:
                Iterable iterable = (Iterable) this.f612c;
                y2.h hVar = (y2.h) ((y2.d) ((o5.d) this.f611b).f5023c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.c().compileStatement("DELETE FROM events WHERE _id in " + y2.h.z(iterable)).execute();
                    return null;
                }
                return null;
            default:
                o5.d dVar = (o5.d) this.f611b;
                for (Map.Entry entry : ((HashMap) this.f612c).entrySet()) {
                    ((y2.h) ((y2.c) dVar.i)).x(((Integer) entry.getValue()).intValue(), u2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // a5.f
    public Object e(z zVar) {
        String valueOf;
        switch (this.f610a) {
            case 4:
                String str = (String) this.f611b;
                Context context = (Context) zVar.a(Context.class);
                switch (((l4.h) this.f612c).f3780a) {
                    case 14:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 15:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 16:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new l6.a(str, valueOf);
            default:
                String str2 = (String) this.f611b;
                c cVar = (c) this.f612c;
                try {
                    Trace.beginSection(str2);
                    return cVar.f574f.e(zVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // m0.c
    public void onCancel() {
        ((f2.s) this.f611b).cancel();
        ((androidx.fragment.app.d) this.f612c).run();
    }

    public void onComplete(Task task) {
        ((j6.g) this.f611b).a((Intent) this.f612c);
    }

    public Task then(Object obj) {
        n6.d dVar = (n6.d) this.f611b;
        n6.f fVar = (n6.f) this.f612c;
        Void r32 = (Void) obj;
        synchronized (dVar) {
            dVar.f4902c = Tasks.forResult(fVar);
        }
        return Tasks.forResult(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #6 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00cd, B:64:0x00d1, B:66:0x00d4, B:71:0x00d9, B:65:0x00d2), top: B:137:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #6 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00cd, B:64:0x00d1, B:66:0x00d4, B:71:0x00d9, B:65:0x00d2), top: B:137:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r15) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.u.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
