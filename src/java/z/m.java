package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class m {

    /* renamed from: n  reason: collision with root package name */
    public static final SparseIntArray f7156n;

    /* renamed from: a  reason: collision with root package name */
    public float f7157a;

    /* renamed from: b  reason: collision with root package name */
    public float f7158b;

    /* renamed from: c  reason: collision with root package name */
    public float f7159c;

    /* renamed from: d  reason: collision with root package name */
    public float f7160d;

    /* renamed from: e  reason: collision with root package name */
    public float f7161e;

    /* renamed from: f  reason: collision with root package name */
    public float f7162f;

    /* renamed from: g  reason: collision with root package name */
    public float f7163g;

    /* renamed from: h  reason: collision with root package name */
    public int f7164h;
    public float i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f7165k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7166l;

    /* renamed from: m  reason: collision with root package name */
    public float f7167m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7156n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f7156n.get(index)) {
                case 1:
                    this.f7157a = obtainStyledAttributes.getFloat(index, this.f7157a);
                    break;
                case 2:
                    this.f7158b = obtainStyledAttributes.getFloat(index, this.f7158b);
                    break;
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    this.f7159c = obtainStyledAttributes.getFloat(index, this.f7159c);
                    break;
                case 4:
                    this.f7160d = obtainStyledAttributes.getFloat(index, this.f7160d);
                    break;
                case d1.h.STRING_FIELD_NUMBER /* 5 */:
                    this.f7161e = obtainStyledAttributes.getFloat(index, this.f7161e);
                    break;
                case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f7162f = obtainStyledAttributes.getDimension(index, this.f7162f);
                    break;
                case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f7163g = obtainStyledAttributes.getDimension(index, this.f7163g);
                    break;
                case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f7165k = obtainStyledAttributes.getDimension(index, this.f7165k);
                    break;
                case 11:
                    this.f7166l = true;
                    this.f7167m = obtainStyledAttributes.getDimension(index, this.f7167m);
                    break;
                case 12:
                    this.f7164h = n.f(obtainStyledAttributes, index, this.f7164h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
