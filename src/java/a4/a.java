package a4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import l.c;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f558a = {16842752, 2130969951};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f559b = {2130969484};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i9) {
        return b(context, attributeSet, i, i9, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i9, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f559b, i, i9);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i10 = iArr2[0];
        boolean z9 = (context instanceof c) && ((c) context).f3475a == i10;
        if (i10 == 0 || z9) {
            return context;
        }
        c cVar = new c(context, i10);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i9);
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr3[i11] = obtainStyledAttributes2.getResourceId(i11, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr3[i12];
            if (i13 != 0) {
                cVar.getTheme().applyStyle(i13, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f558a);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cVar.getTheme().applyStyle(resourceId, true);
        }
        return cVar;
    }
}
