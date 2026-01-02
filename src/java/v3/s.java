package v3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class s extends y {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6265c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f6266d;

    public s(ArrayList arrayList, Matrix matrix) {
        this.f6265c = arrayList;
        this.f6266d = matrix;
    }

    @Override // v3.y
    public final void a(Matrix matrix, u3.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f6265c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((y) obj).a(this.f6266d, aVar, i, canvas);
        }
    }
}
