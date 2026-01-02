package b5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final /* synthetic */ class b implements h, z2.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f722a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f723b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f724c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f725d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f726e;

    public /* synthetic */ b(g gVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f722a = i;
        this.f723b = gVar;
        this.f726e = obj;
        this.f724c = j;
        this.f725d = timeUnit;
    }

    @Override // b5.h
    public ScheduledFuture a(final l6.c cVar) {
        switch (this.f722a) {
            case 0:
                g gVar = (g) this.f723b;
                return gVar.f744b.schedule(new e(gVar, (Runnable) this.f726e, cVar, 1), this.f724c, (TimeUnit) this.f725d);
            default:
                final g gVar2 = (g) this.f723b;
                final Callable callable = (Callable) this.f726e;
                return gVar2.f744b.schedule(new Callable() { // from class: b5.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return g.this.f743a.submit(new a5.i(3, callable, cVar));
                    }
                }, this.f724c, (TimeUnit) this.f725d);
        }
    }

    @Override // z2.b
    public Object b() {
        o5.d dVar = (o5.d) this.f723b;
        Iterable iterable = (Iterable) this.f726e;
        r2.j jVar = (r2.j) this.f725d;
        y2.h hVar = (y2.h) ((y2.d) dVar.f5023c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y2.h.z(iterable);
            SQLiteDatabase c9 = hVar.c();
            c9.beginTransaction();
            try {
                c9.compileStatement(str).execute();
                Cursor rawQuery = c9.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    hVar.x(rawQuery.getInt(0), u2.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                c9.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                c9.setTransactionSuccessful();
            } finally {
                c9.endTransaction();
            }
        }
        hVar.i(new y2.e(((a3.a) dVar.f5027g).b() + this.f724c, jVar));
        return null;
    }

    public /* synthetic */ b(o5.d dVar, Iterable iterable, r2.j jVar, long j) {
        this.f722a = 2;
        this.f723b = dVar;
        this.f726e = iterable;
        this.f725d = jVar;
        this.f724c = j;
    }
}
