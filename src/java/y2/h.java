package y2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class h implements d, z2.c, c {

    /* renamed from: f  reason: collision with root package name */
    public static final o2.c f6771f = new o2.c("proto");

    /* renamed from: a  reason: collision with root package name */
    public final j f6772a;

    /* renamed from: b  reason: collision with root package name */
    public final a3.a f6773b;

    /* renamed from: c  reason: collision with root package name */
    public final a3.a f6774c;

    /* renamed from: d  reason: collision with root package name */
    public final a f6775d;

    /* renamed from: e  reason: collision with root package name */
    public final g7.a f6776e;

    public h(a3.a aVar, a3.a aVar2, a aVar3, j jVar, g7.a aVar4) {
        this.f6772a = jVar;
        this.f6773b = aVar;
        this.f6774c = aVar2;
        this.f6775d = aVar3;
        this.f6776e = aVar4;
    }

    public static Object A(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, r2.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f5536a, String.valueOf(b3.a.a(jVar.f5538c))));
        byte[] bArr = jVar.f5537b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String z(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f6764a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final SQLiteDatabase c() {
        j jVar = this.f6772a;
        Objects.requireNonNull(jVar);
        a3.a aVar = this.f6774c;
        long b10 = aVar.b();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e9) {
                if (aVar.b() >= this.f6775d.f6761c + b10) {
                    throw new RuntimeException("Timed out while trying to open db.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6772a.close();
    }

    public final Object i(f fVar) {
        SQLiteDatabase c9 = c();
        c9.beginTransaction();
        try {
            Object apply = fVar.apply(c9);
            c9.setTransactionSuccessful();
            return apply;
        } finally {
            c9.endTransaction();
        }
    }

    public final ArrayList s(SQLiteDatabase sQLiteDatabase, r2.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long f9 = f(sQLiteDatabase, jVar);
        if (f9 == null) {
            return arrayList;
        }
        A(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{f9.toString()}, null, null, null, String.valueOf(i)), new h5.a(this, arrayList, jVar, 8));
        return arrayList;
    }

    public final void x(long j, u2.c cVar, String str) {
        i(new d5.a(str, cVar, j));
    }

    public final Object y(z2.b bVar) {
        SQLiteDatabase c9 = c();
        a3.a aVar = this.f6774c;
        long b10 = aVar.b();
        while (true) {
            try {
                c9.beginTransaction();
                try {
                    Object b11 = bVar.b();
                    c9.setTransactionSuccessful();
                    return b11;
                } finally {
                    c9.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e9) {
                if (aVar.b() >= this.f6775d.f6761c + b10) {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
