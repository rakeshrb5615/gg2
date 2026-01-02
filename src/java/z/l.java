package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public int f7152a;

    /* renamed from: b  reason: collision with root package name */
    public int f7153b;

    /* renamed from: c  reason: collision with root package name */
    public float f7154c;

    /* renamed from: d  reason: collision with root package name */
    public float f7155d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f7181g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f7154c = obtainStyledAttributes.getFloat(index, this.f7154c);
            } else if (index == 0) {
                int i9 = obtainStyledAttributes.getInt(index, this.f7152a);
                this.f7152a = i9;
                this.f7152a = n.f7168d[i9];
            } else if (index == 4) {
                this.f7153b = obtainStyledAttributes.getInt(index, this.f7153b);
            } else if (index == 3) {
                this.f7155d = obtainStyledAttributes.getFloat(index, this.f7155d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
