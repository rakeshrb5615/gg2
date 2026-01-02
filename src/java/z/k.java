package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class k {
    public static final SparseIntArray j;

    /* renamed from: a  reason: collision with root package name */
    public int f7144a;

    /* renamed from: b  reason: collision with root package name */
    public int f7145b;

    /* renamed from: c  reason: collision with root package name */
    public int f7146c;

    /* renamed from: d  reason: collision with root package name */
    public float f7147d;

    /* renamed from: e  reason: collision with root package name */
    public float f7148e;

    /* renamed from: f  reason: collision with root package name */
    public float f7149f;

    /* renamed from: g  reason: collision with root package name */
    public int f7150g;

    /* renamed from: h  reason: collision with root package name */
    public String f7151h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f7180f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case 1:
                    this.f7148e = obtainStyledAttributes.getFloat(index, this.f7148e);
                    break;
                case 2:
                    this.f7146c = obtainStyledAttributes.getInt(index, this.f7146c);
                    break;
                case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = v.a.f6158a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case d1.h.STRING_FIELD_NUMBER /* 5 */:
                    this.f7144a = n.f(obtainStyledAttributes, index, this.f7144a);
                    break;
                case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f7145b = obtainStyledAttributes.getInteger(index, this.f7145b);
                    break;
                case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f7147d = obtainStyledAttributes.getFloat(index, this.f7147d);
                    break;
                case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                    this.f7150g = obtainStyledAttributes.getInteger(index, this.f7150g);
                    break;
                case 9:
                    this.f7149f = obtainStyledAttributes.getFloat(index, this.f7149f);
                    break;
                case 10:
                    int i9 = obtainStyledAttributes.peekValue(index).type;
                    if (i9 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i9 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f7151h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
