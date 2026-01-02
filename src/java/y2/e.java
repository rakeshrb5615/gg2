package y2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f6767a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r2.j f6768b;

    public /* synthetic */ e(long j, r2.j jVar) {
        this.f6767a = j;
        this.f6768b = jVar;
    }

    @Override // y2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f6767a));
        r2.j jVar = this.f6768b;
        String str = jVar.f5536a;
        o2.d dVar = jVar.f5538c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(b3.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f5536a);
            contentValues.put("priority", Integer.valueOf(b3.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
