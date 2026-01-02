package d5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j5.k1;
import java.util.HashMap;
import n6.i;
import r2.j;
import y2.f;
import y2.h;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class a implements c6.a, Continuation, z2.b, f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f1119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1121c;

    public /* synthetic */ a(Object obj, long j, Object obj2) {
        this.f1120b = obj;
        this.f1119a = j;
        this.f1121c = obj2;
    }

    @Override // c6.a
    public void a(c6.b bVar) {
        ((b) bVar.get()).d((String) this.f1120b, this.f1119a, (k1) this.f1121c);
    }

    @Override // y2.f
    public Object apply(Object obj) {
        String str = (String) this.f1120b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((u2.c) this.f1121c).f6051a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z9 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f1119a;
            if (z9) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // z2.b
    public Object b() {
        o5.d dVar = (o5.d) this.f1120b;
        long b10 = ((a3.a) dVar.f5027g).b() + this.f1119a;
        h hVar = (h) ((y2.d) dVar.f5023c);
        hVar.getClass();
        hVar.i(new y2.e(b10, (j) this.f1121c));
        return null;
    }

    public Object then(Task task) {
        return ((i) this.f1120b).b(task, this.f1119a, (HashMap) this.f1121c);
    }

    public /* synthetic */ a(Object obj, Object obj2, long j) {
        this.f1120b = obj;
        this.f1121c = obj2;
        this.f1119a = j;
    }
}
