package r2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import r6.n0;
import r6.o0;
import z3.z;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final /* synthetic */ class q implements o2.h, a5.f, o2.e, y2.f, y6.p, z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5552a;

    public /* synthetic */ q(int i) {
        this.f5552a = i;
    }

    @Override // o2.h
    public void a(Exception exc) {
    }

    @Override // o2.e
    public Object apply(Object obj) {
        switch (this.f5552a) {
            case 4:
                n0 n0Var = (n0) obj;
                String q = o0.f5708b.q(n0Var);
                kotlin.jvm.internal.j.d(q, "encode(...)");
                n0Var.getClass();
                r6.n nVar = r6.n.f5700b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = q.getBytes(b8.a.f766a);
                kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
                return bytes;
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        b8.g a10 = j.a();
                        a10.t(rawQuery.getString(1));
                        a10.f791d = b3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a10.f790c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a10.a());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
        }
    }

    @Override // y6.p
    public Object c() {
        switch (this.f5552a) {
            case 15:
                return new LinkedHashMap();
            case 16:
                return new TreeMap();
            case 17:
                return new ConcurrentHashMap();
            case 18:
                return new ConcurrentSkipListMap();
            case 19:
                return new ArrayList();
            case 20:
                return new LinkedHashSet();
            case 21:
                return new TreeSet();
            case 22:
                return new ArrayDeque();
            default:
                return new y6.o(true);
        }
    }

    @Override // a5.f
    public Object e(a5.z zVar) {
        switch (this.f5552a) {
            case 1:
                return TransportRegistrar.c(zVar);
            case 2:
                return TransportRegistrar.b(zVar);
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return TransportRegistrar.a(zVar);
            case 4:
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
            case d1.h.BYTES_FIELD_NUMBER /* 8 */:
            default:
                return FirestoreRegistrar.a(zVar);
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return FirebaseSessionsRegistrar.b(zVar);
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return FirebaseSessionsRegistrar.a(zVar);
            case 9:
                return AbtRegistrar.a(zVar);
        }
    }

    public /* synthetic */ q(r6.l lVar) {
        this.f5552a = 4;
    }
}
