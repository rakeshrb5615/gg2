package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7026a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f7027b;

    /* renamed from: c  reason: collision with root package name */
    public int f7028c;

    /* renamed from: d  reason: collision with root package name */
    public float f7029d;

    /* renamed from: e  reason: collision with root package name */
    public String f7030e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7031f;

    /* renamed from: g  reason: collision with root package name */
    public int f7032g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f7027b = bVar.f7027b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, z.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f7178d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z9 = false;
        Object obj = null;
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            int i10 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z9 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i11 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i11 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i11 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i10 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i10;
                            }
                        }
                        i = 7;
                    }
                }
                i = i11;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f7027b = i;
            obj2.f7026a = z9;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (u.e.c(this.f7027b)) {
            case 0:
            case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f7028c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f7029d = ((Float) obj).floatValue();
                return;
            case 2:
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                this.f7032g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f7030e = (String) obj;
                return;
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                this.f7031f = ((Boolean) obj).booleanValue();
                return;
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f7029d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
