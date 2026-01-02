package n0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import j5.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final r.i f4378a = new r.i(2);

    /* renamed from: b  reason: collision with root package name */
    public static final g5.i f4379b = new g5.i(4);

    public static h.f a(Context context, List list) {
        t1.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                d dVar = (d) list.get(i);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new h.f(5);
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new h.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [n0.b, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        g5.i iVar = f4379b;
        r.i iVar2 = f4378a;
        t1.c("FontProvider.getProvider");
        try {
            List list = dVar.f4383d;
            String str = dVar.f4380a;
            String str2 = dVar.f4381b;
            if (list == null) {
                list = g0.b.k(resources, 0);
            }
            ?? obj = new Object();
            obj.f4375a = str;
            obj.f4376b = str2;
            obj.f4377c = list;
            ProviderInfo providerInfo = (ProviderInfo) iVar2.get(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            } else {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, iVar);
                for (int i = 0; i < list.size(); i++) {
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, iVar);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i9 = 0; i9 < arrayList.size(); i9++) {
                            if (!Arrays.equals((byte[]) arrayList.get(i9), (byte[]) arrayList2.get(i9))) {
                                break;
                            }
                        }
                        iVar2.put(obj, resolveContentProvider);
                        return resolveContentProvider;
                    }
                }
                Trace.endSection();
                return null;
            }
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        t1.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            t1.c("ContentQueryWrapper.query");
            try {
                String[] strArr2 = {dVar.f4382c};
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                    } catch (RemoteException e9) {
                        Log.w("FontsProvider", "Unable to query the content provider", e9);
                    }
                }
                Trace.endSection();
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    ArrayList arrayList2 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                        arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                    }
                    arrayList = arrayList2;
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                return (i[]) arrayList.toArray(new i[0]);
            } finally {
            }
        } finally {
        }
    }
}
