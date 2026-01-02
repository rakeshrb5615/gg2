package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7168d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f7169e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f7170f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7171a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7172b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7173c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7169e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f7170f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int i;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i9 = 0;
        int i10 = 0;
        while (i9 < split.length) {
            String trim = split[i9].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout parent = aVar.getParent();
                if (trim != null) {
                    HashMap hashMap = parent.s;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = parent.s.get(trim);
                    }
                } else {
                    parent.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i10] = i;
            i9++;
            i10++;
        }
        return i10 != split.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    /* JADX WARN: Type inference failed for: r6v189, types: [z.h, java.lang.Object] */
    public static i d(Context context, AttributeSet attributeSet, boolean z9) {
        int i;
        int i9;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z9 ? r.f7177c : r.f7175a);
        l lVar = iVar.f7102b;
        m mVar = iVar.f7105e;
        k kVar = iVar.f7103c;
        j jVar = iVar.f7104d;
        int[] iArr = f7168d;
        String[] strArr = v.a.f6158a;
        SparseIntArray sparseIntArray = f7169e;
        if (z9) {
            ?? obj = new Object();
            obj.f7091a = new int[10];
            obj.f7092b = new int[10];
            obj.f7093c = 0;
            obj.f7094d = new int[10];
            obj.f7095e = new float[10];
            obj.f7096f = 0;
            obj.f7097g = new int[5];
            obj.f7098h = new String[5];
            obj.i = 0;
            obj.j = new int[4];
            obj.f7099k = new boolean[4];
            obj.f7100l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i10 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i10 < indexCount; indexCount = i9) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = i10;
                switch (f7170f.get(index)) {
                    case 2:
                        i9 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        continue;
                        i10 = i11 + 1;
                    case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i9 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case d1.h.STRING_FIELD_NUMBER /* 5 */:
                        i9 = indexCount;
                        obj.c(5, obtainStyledAttributes.getString(index));
                        continue;
                        i10 = i11 + 1;
                    case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                        i9 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                        i9 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                        i9 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i9 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        i9 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        i9 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        i9 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        i9 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        i9 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        i9 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f7114d));
                        break;
                    case 18:
                        i9 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f7116e));
                        break;
                    case 19:
                        i9 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, jVar.f7118f));
                        break;
                    case 20:
                        i9 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, jVar.f7140w));
                        break;
                    case 21:
                        i9 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f7112c));
                        break;
                    case 22:
                        i9 = indexCount;
                        obj.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f7152a)]);
                        break;
                    case 23:
                        i9 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f7110b));
                        break;
                    case 24:
                        i9 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        i9 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        i9 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 31:
                        i9 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 34:
                        i9 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case 37:
                        i9 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, jVar.f7141x));
                        break;
                    case 38:
                        i9 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f7101a);
                        iVar.f7101a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i9 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, jVar.U));
                        break;
                    case 40:
                        i9 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case 41:
                        i9 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 42:
                        i9 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 43:
                        i9 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, lVar.f7154c));
                        break;
                    case 44:
                        i9 = indexCount;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, mVar.f7167m));
                        break;
                    case 45:
                        i9 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, mVar.f7158b));
                        break;
                    case 46:
                        i9 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, mVar.f7159c));
                        break;
                    case 47:
                        i9 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, mVar.f7160d));
                        break;
                    case 48:
                        i9 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, mVar.f7161e));
                        break;
                    case 49:
                        i9 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, mVar.f7162f));
                        break;
                    case 50:
                        i9 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, mVar.f7163g));
                        break;
                    case 51:
                        i9 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        break;
                    case 52:
                        i9 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, mVar.j));
                        break;
                    case 53:
                        i9 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, mVar.f7165k));
                        break;
                    case 54:
                        i9 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        i9 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        i9 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        i9 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f7109a0));
                        break;
                    case 58:
                        i9 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f7111b0));
                        break;
                    case 59:
                        i9 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f7113c0));
                        break;
                    case 60:
                        i9 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, mVar.f7157a));
                        break;
                    case 62:
                        i9 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        i9 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, jVar.B));
                        break;
                    case 64:
                        i9 = indexCount;
                        obj.b(64, f(obtainStyledAttributes, index, kVar.f7144a));
                        break;
                    case 65:
                        i9 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            obj.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i9 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i9 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, kVar.f7148e));
                        break;
                    case 68:
                        i9 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, lVar.f7155d));
                        break;
                    case 69:
                        i9 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i9 = indexCount;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i9 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i9 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, jVar.f0));
                        break;
                    case 73:
                        i9 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f7120g0));
                        break;
                    case 74:
                        i9 = indexCount;
                        obj.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i9 = indexCount;
                        obj.d(75, obtainStyledAttributes.getBoolean(index, jVar.f7131n0));
                        break;
                    case 76:
                        i9 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, kVar.f7146c));
                        break;
                    case 77:
                        i9 = indexCount;
                        obj.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i9 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, lVar.f7153b));
                        break;
                    case 79:
                        i9 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, kVar.f7147d));
                        break;
                    case 80:
                        i9 = indexCount;
                        obj.d(80, obtainStyledAttributes.getBoolean(index, jVar.l0));
                        break;
                    case 81:
                        i9 = indexCount;
                        obj.d(81, obtainStyledAttributes.getBoolean(index, jVar.f7129m0));
                        break;
                    case 82:
                        i9 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, kVar.f7145b));
                        break;
                    case 83:
                        i9 = indexCount;
                        obj.b(83, f(obtainStyledAttributes, index, mVar.f7164h));
                        break;
                    case 84:
                        i9 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, kVar.f7150g));
                        break;
                    case 85:
                        i9 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, kVar.f7149f));
                        break;
                    case 86:
                        i9 = indexCount;
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            obj.b(89, resourceId2);
                            if (kVar.i != -1) {
                                obj.b(88, -2);
                                break;
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.f7151h = string;
                            obj.c(90, string);
                            if (kVar.f7151h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                                break;
                            } else {
                                obj.b(88, -1);
                                break;
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i9 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i9 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        i9 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        i9 = indexCount;
                        g(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i9 = indexCount;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i9 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, jVar.f7133o0));
                        break;
                    case 98:
                        i9 = indexCount;
                        int i13 = y.a.f6696w;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            iVar.f7101a = obtainStyledAttributes.getResourceId(index, iVar.f7101a);
                            break;
                        }
                    case 99:
                        i9 = indexCount;
                        obj.d(99, obtainStyledAttributes.getBoolean(index, jVar.f7119g));
                        break;
                }
                i10 = i11 + 1;
            }
        } else {
            int i14 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i14 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i14);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        jVar.f7134p = f(obtainStyledAttributes, index2, jVar.f7134p);
                        continue;
                        i14++;
                    case 2:
                        i = indexCount2;
                        jVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                        i14++;
                    case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                        i = indexCount2;
                        jVar.f7132o = f(obtainStyledAttributes, index2, jVar.f7132o);
                        continue;
                        i14++;
                    case 4:
                        i = indexCount2;
                        jVar.f7130n = f(obtainStyledAttributes, index2, jVar.f7130n);
                        continue;
                        i14++;
                    case d1.h.STRING_FIELD_NUMBER /* 5 */:
                        i = indexCount2;
                        jVar.f7142y = obtainStyledAttributes.getString(index2);
                        continue;
                        i14++;
                    case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = indexCount2;
                        jVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                        i14++;
                    case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = indexCount2;
                        jVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        continue;
                        i14++;
                    case d1.h.BYTES_FIELD_NUMBER /* 8 */:
                        i = indexCount2;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                        i14++;
                    case 9:
                        i = indexCount2;
                        jVar.f7139v = f(obtainStyledAttributes, index2, jVar.f7139v);
                        continue;
                        i14++;
                    case 10:
                        i = indexCount2;
                        jVar.f7138u = f(obtainStyledAttributes, index2, jVar.f7138u);
                        continue;
                        i14++;
                    case 11:
                        i = indexCount2;
                        jVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                        i14++;
                    case 12:
                        i = indexCount2;
                        jVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                        i14++;
                    case 13:
                        i = indexCount2;
                        jVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                        i14++;
                    case 14:
                        i = indexCount2;
                        jVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                        i14++;
                    case 15:
                        i = indexCount2;
                        jVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        continue;
                        i14++;
                    case 16:
                        i = indexCount2;
                        jVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                        i14++;
                    case 17:
                        i = indexCount2;
                        jVar.f7114d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f7114d);
                        continue;
                        i14++;
                    case 18:
                        i = indexCount2;
                        jVar.f7116e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f7116e);
                        continue;
                        i14++;
                    case 19:
                        i = indexCount2;
                        jVar.f7118f = obtainStyledAttributes.getFloat(index2, jVar.f7118f);
                        continue;
                        i14++;
                    case 20:
                        i = indexCount2;
                        jVar.f7140w = obtainStyledAttributes.getFloat(index2, jVar.f7140w);
                        continue;
                        i14++;
                    case 21:
                        i = indexCount2;
                        jVar.f7112c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f7112c);
                        continue;
                        i14++;
                    case 22:
                        i = indexCount2;
                        int i15 = obtainStyledAttributes.getInt(index2, lVar.f7152a);
                        lVar.f7152a = i15;
                        lVar.f7152a = iArr[i15];
                        continue;
                        i14++;
                    case 23:
                        i = indexCount2;
                        jVar.f7110b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f7110b);
                        continue;
                        i14++;
                    case 24:
                        i = indexCount2;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                        i14++;
                    case 25:
                        i = indexCount2;
                        jVar.f7121h = f(obtainStyledAttributes, index2, jVar.f7121h);
                        continue;
                        i14++;
                    case 26:
                        i = indexCount2;
                        jVar.i = f(obtainStyledAttributes, index2, jVar.i);
                        continue;
                        i14++;
                    case 27:
                        i = indexCount2;
                        jVar.E = obtainStyledAttributes.getInt(index2, jVar.E);
                        continue;
                        i14++;
                    case 28:
                        i = indexCount2;
                        jVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                        i14++;
                    case 29:
                        i = indexCount2;
                        jVar.j = f(obtainStyledAttributes, index2, jVar.j);
                        continue;
                        i14++;
                    case 30:
                        i = indexCount2;
                        jVar.f7125k = f(obtainStyledAttributes, index2, jVar.f7125k);
                        continue;
                        i14++;
                    case 31:
                        i = indexCount2;
                        jVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        continue;
                        i14++;
                    case 32:
                        i = indexCount2;
                        jVar.f7136s = f(obtainStyledAttributes, index2, jVar.f7136s);
                        continue;
                        i14++;
                    case 33:
                        i = indexCount2;
                        jVar.f7137t = f(obtainStyledAttributes, index2, jVar.f7137t);
                        continue;
                        i14++;
                    case 34:
                        i = indexCount2;
                        jVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                        i14++;
                    case 35:
                        i = indexCount2;
                        jVar.f7128m = f(obtainStyledAttributes, index2, jVar.f7128m);
                        continue;
                        i14++;
                    case 36:
                        i = indexCount2;
                        jVar.f7127l = f(obtainStyledAttributes, index2, jVar.f7127l);
                        continue;
                        i14++;
                    case 37:
                        i = indexCount2;
                        jVar.f7141x = obtainStyledAttributes.getFloat(index2, jVar.f7141x);
                        continue;
                        i14++;
                    case 38:
                        i = indexCount2;
                        iVar.f7101a = obtainStyledAttributes.getResourceId(index2, iVar.f7101a);
                        continue;
                        i14++;
                    case 39:
                        i = indexCount2;
                        jVar.U = obtainStyledAttributes.getFloat(index2, jVar.U);
                        continue;
                        i14++;
                    case 40:
                        i = indexCount2;
                        jVar.T = obtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                        i14++;
                    case 41:
                        i = indexCount2;
                        jVar.V = obtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                        i14++;
                    case 42:
                        i = indexCount2;
                        jVar.W = obtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                        i14++;
                    case 43:
                        i = indexCount2;
                        lVar.f7154c = obtainStyledAttributes.getFloat(index2, lVar.f7154c);
                        continue;
                        i14++;
                    case 44:
                        i = indexCount2;
                        mVar.f7166l = true;
                        mVar.f7167m = obtainStyledAttributes.getDimension(index2, mVar.f7167m);
                        continue;
                        i14++;
                    case 45:
                        i = indexCount2;
                        mVar.f7158b = obtainStyledAttributes.getFloat(index2, mVar.f7158b);
                        continue;
                        i14++;
                    case 46:
                        i = indexCount2;
                        mVar.f7159c = obtainStyledAttributes.getFloat(index2, mVar.f7159c);
                        continue;
                        i14++;
                    case 47:
                        i = indexCount2;
                        mVar.f7160d = obtainStyledAttributes.getFloat(index2, mVar.f7160d);
                        continue;
                        i14++;
                    case 48:
                        i = indexCount2;
                        mVar.f7161e = obtainStyledAttributes.getFloat(index2, mVar.f7161e);
                        continue;
                        i14++;
                    case 49:
                        i = indexCount2;
                        mVar.f7162f = obtainStyledAttributes.getDimension(index2, mVar.f7162f);
                        continue;
                        i14++;
                    case 50:
                        i = indexCount2;
                        mVar.f7163g = obtainStyledAttributes.getDimension(index2, mVar.f7163g);
                        continue;
                        i14++;
                    case 51:
                        i = indexCount2;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        continue;
                        i14++;
                    case 52:
                        i = indexCount2;
                        mVar.j = obtainStyledAttributes.getDimension(index2, mVar.j);
                        continue;
                        i14++;
                    case 53:
                        i = indexCount2;
                        mVar.f7165k = obtainStyledAttributes.getDimension(index2, mVar.f7165k);
                        continue;
                        i14++;
                    case 54:
                        i = indexCount2;
                        jVar.X = obtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                        i14++;
                    case 55:
                        i = indexCount2;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        continue;
                        i14++;
                    case 56:
                        i = indexCount2;
                        jVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                        i14++;
                    case 57:
                        i = indexCount2;
                        jVar.f7109a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f7109a0);
                        continue;
                        i14++;
                    case 58:
                        i = indexCount2;
                        jVar.f7111b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f7111b0);
                        continue;
                        i14++;
                    case 59:
                        i = indexCount2;
                        jVar.f7113c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f7113c0);
                        continue;
                        i14++;
                    case 60:
                        i = indexCount2;
                        mVar.f7157a = obtainStyledAttributes.getFloat(index2, mVar.f7157a);
                        continue;
                        i14++;
                    case 61:
                        i = indexCount2;
                        jVar.f7143z = f(obtainStyledAttributes, index2, jVar.f7143z);
                        continue;
                        i14++;
                    case 62:
                        i = indexCount2;
                        jVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        continue;
                        i14++;
                    case 63:
                        i = indexCount2;
                        jVar.B = obtainStyledAttributes.getFloat(index2, jVar.B);
                        continue;
                        i14++;
                    case 64:
                        i = indexCount2;
                        kVar.f7144a = f(obtainStyledAttributes, index2, kVar.f7144a);
                        continue;
                        i14++;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            continue;
                            i14++;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                        i14++;
                    case 67:
                        i = indexCount2;
                        kVar.f7148e = obtainStyledAttributes.getFloat(index2, kVar.f7148e);
                        break;
                    case 68:
                        i = indexCount2;
                        lVar.f7155d = obtainStyledAttributes.getFloat(index2, lVar.f7155d);
                        break;
                    case 69:
                        i = indexCount2;
                        jVar.f7115d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        jVar.f7117e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        jVar.f0 = obtainStyledAttributes.getInt(index2, jVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        jVar.f7120g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f7120g0);
                        break;
                    case 74:
                        i = indexCount2;
                        jVar.f7124j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        jVar.f7131n0 = obtainStyledAttributes.getBoolean(index2, jVar.f7131n0);
                        break;
                    case 76:
                        i = indexCount2;
                        kVar.f7146c = obtainStyledAttributes.getInt(index2, kVar.f7146c);
                        break;
                    case 77:
                        i = indexCount2;
                        jVar.f7126k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        lVar.f7153b = obtainStyledAttributes.getInt(index2, lVar.f7153b);
                        break;
                    case 79:
                        i = indexCount2;
                        kVar.f7147d = obtainStyledAttributes.getFloat(index2, kVar.f7147d);
                        break;
                    case 80:
                        i = indexCount2;
                        jVar.l0 = obtainStyledAttributes.getBoolean(index2, jVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        jVar.f7129m0 = obtainStyledAttributes.getBoolean(index2, jVar.f7129m0);
                        break;
                    case 82:
                        i = indexCount2;
                        kVar.f7145b = obtainStyledAttributes.getInteger(index2, kVar.f7145b);
                        break;
                    case 83:
                        i = indexCount2;
                        mVar.f7164h = f(obtainStyledAttributes, index2, mVar.f7164h);
                        break;
                    case 84:
                        i = indexCount2;
                        kVar.f7150g = obtainStyledAttributes.getInteger(index2, kVar.f7150g);
                        break;
                    case 85:
                        i = indexCount2;
                        kVar.f7149f = obtainStyledAttributes.getFloat(index2, kVar.f7149f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i16 = obtainStyledAttributes.peekValue(index2).type;
                        if (i16 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i16 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.f7151h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        jVar.q = f(obtainStyledAttributes, index2, jVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        jVar.f7135r = f(obtainStyledAttributes, index2, jVar.f7135r);
                        break;
                    case 93:
                        i = indexCount2;
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        jVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        continue;
                        i14++;
                    case 96:
                        i = indexCount2;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        jVar.f7133o0 = obtainStyledAttributes.getInt(index2, jVar.f7133o0);
                        break;
                }
                i14++;
            }
            if (jVar.f7124j0 != null) {
                jVar.f7123i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i, int i9) {
        int resourceId = typedArray.getResourceId(i, i9);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, z.a, z.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [w.i, w.a] */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        View findViewById;
        HashMap hashMap;
        String str;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f7173c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else if (nVar.f7172b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            l lVar = iVar.f7102b;
                            j jVar = iVar.f7104d;
                            m mVar = iVar.f7105e;
                            if (childAt instanceof a) {
                                jVar.f7122h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.f0);
                                aVar.setMargin(jVar.f7120g0);
                                aVar.setAllowsGoneWidget(jVar.f7131n0);
                                int[] iArr = jVar.f7123i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str2 = jVar.f7124j0;
                                    if (str2 != null) {
                                        int[] c9 = c(aVar, str2);
                                        jVar.f7123i0 = c9;
                                        aVar.setReferencedIds(c9);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f7106f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str3);
                                HashSet hashSet3 = hashSet2;
                                String l5 = !bVar.f7026a ? g2.g.l("set", str3) : str3;
                                int i10 = i9;
                                try {
                                    int c10 = u.e.c(bVar.f7027b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (c10) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(l5, cls3).invoke(childAt, Integer.valueOf(bVar.f7028c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(l5, cls2).invoke(childAt, Float.valueOf(bVar.f7029d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(l5, cls3).invoke(childAt, Integer.valueOf(bVar.f7032g));
                                            break;
                                        case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                                            Method method = cls.getMethod(l5, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f7032g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e9) {
                                                e = e9;
                                                StringBuilder q = v1.a.q(" Custom Attribute \"", str3, "\" not found on ");
                                                q.append(cls.getName());
                                                Log.e("TransitionLayout", q.toString(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i10;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + l5, e);
                                                hashSet2 = hashSet3;
                                                i9 = i10;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder q9 = v1.a.q(" Custom Attribute \"", str3, "\" not found on ");
                                                q9.append(cls.getName());
                                                Log.e("TransitionLayout", q9.toString(), e);
                                                hashSet2 = hashSet3;
                                                i9 = i10;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(l5, CharSequence.class).invoke(childAt, bVar.f7030e);
                                            hashMap = hashMap3;
                                            break;
                                        case d1.h.STRING_FIELD_NUMBER /* 5 */:
                                            cls.getMethod(l5, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f7031f));
                                            hashMap = hashMap3;
                                            break;
                                        case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                                            cls.getMethod(l5, cls2).invoke(childAt, Float.valueOf(bVar.f7029d));
                                            hashMap = hashMap3;
                                            break;
                                        case d1.h.DOUBLE_FIELD_NUMBER /* 7 */:
                                            cls.getMethod(l5, cls3).invoke(childAt, Integer.valueOf(bVar.f7028c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i9 = i10;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i = i9;
                            childAt.setLayoutParams(eVar);
                            if (lVar.f7153b == 0) {
                                childAt.setVisibility(lVar.f7152a);
                            }
                            childAt.setAlpha(lVar.f7154c);
                            childAt.setRotation(mVar.f7157a);
                            childAt.setRotationX(mVar.f7158b);
                            childAt.setRotationY(mVar.f7159c);
                            childAt.setScaleX(mVar.f7160d);
                            childAt.setScaleY(mVar.f7161e);
                            if (mVar.f7164h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f7164h) != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f7162f)) {
                                    childAt.setPivotX(mVar.f7162f);
                                }
                                if (!Float.isNaN(mVar.f7163g)) {
                                    childAt.setPivotY(mVar.f7163g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.j);
                            childAt.setTranslationZ(mVar.f7165k);
                            if (mVar.f7166l) {
                                childAt.setElevation(mVar.f7167m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i9;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i9 = i + 1;
                    nVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i9;
            i9 = i + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f7104d;
                if (jVar2.f7122h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f7033a = new int[32];
                    view.f7039m = new HashMap();
                    view.f7035c = context;
                    ?? iVar3 = new w.i();
                    iVar3.f6320s0 = 0;
                    iVar3.f6321t0 = true;
                    iVar3.f6322u0 = 0;
                    iVar3.f6323v0 = false;
                    view.f7025p = iVar3;
                    view.f7036d = iVar3;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = jVar2.f7123i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str4 = jVar2.f7124j0;
                        if (str4 != null) {
                            int[] c11 = c(view, str4);
                            jVar2.f7123i0 = c11;
                            view.setReferencedIds(c11);
                        }
                    }
                    view.setType(jVar2.f0);
                    view.setMargin(jVar2.f7120g0);
                    e g3 = ConstraintLayout.g();
                    view.i();
                    iVar2.a(g3);
                    constraintLayout.addView(view, g3);
                }
                if (jVar2.f7108a) {
                    p pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g4 = ConstraintLayout.g();
                    iVar2.a(g4);
                    constraintLayout.addView(pVar, g4);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i9;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f7173c;
        hashMap2.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f7172b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap2.get(Integer.valueOf(id));
            if (iVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i9 = i10;
            } else {
                l lVar = iVar.f7102b;
                j jVar = iVar.f7104d;
                m mVar = iVar.f7105e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i9 = i10;
                HashMap hashMap4 = nVar.f7171a;
                for (String str : hashMap4.keySet()) {
                    b bVar = (b) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e9) {
                        StringBuilder q = v1.a.q(" Custom Attribute \"", str, "\" not found on ");
                        q.append(cls.getName());
                        Log.e("TransitionLayout", q.toString(), e9);
                    } catch (NoSuchMethodException e10) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
                    } catch (InvocationTargetException e11) {
                        StringBuilder q9 = v1.a.q(" Custom Attribute \"", str, "\" not found on ");
                        q9.append(cls.getName());
                        Log.e("TransitionLayout", q9.toString(), e11);
                    }
                    hashMap4 = hashMap5;
                }
                iVar.f7106f = hashMap3;
                iVar.f7101a = id;
                jVar.f7121h = eVar.f7049e;
                jVar.i = eVar.f7051f;
                jVar.j = eVar.f7052g;
                jVar.f7125k = eVar.f7054h;
                jVar.f7127l = eVar.i;
                jVar.f7128m = eVar.j;
                jVar.f7130n = eVar.f7058k;
                jVar.f7132o = eVar.f7060l;
                jVar.f7134p = eVar.f7061m;
                jVar.q = eVar.f7063n;
                jVar.f7135r = eVar.f7065o;
                jVar.f7136s = eVar.f7070s;
                jVar.f7137t = eVar.f7071t;
                jVar.f7138u = eVar.f7072u;
                jVar.f7139v = eVar.f7073v;
                jVar.f7140w = eVar.E;
                jVar.f7141x = eVar.F;
                jVar.f7142y = eVar.G;
                jVar.f7143z = eVar.f7067p;
                jVar.A = eVar.q;
                jVar.B = eVar.f7069r;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.E = eVar.V;
                jVar.f7118f = eVar.f7045c;
                jVar.f7114d = eVar.f7041a;
                jVar.f7116e = eVar.f7043b;
                jVar.f7110b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f7112c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.D;
                jVar.T = eVar.I;
                jVar.U = eVar.H;
                jVar.W = eVar.K;
                jVar.V = eVar.J;
                jVar.l0 = eVar.W;
                jVar.f7129m0 = eVar.X;
                jVar.X = eVar.L;
                jVar.Y = eVar.M;
                jVar.Z = eVar.P;
                jVar.f7109a0 = eVar.Q;
                jVar.f7111b0 = eVar.N;
                jVar.f7113c0 = eVar.O;
                jVar.f7115d0 = eVar.R;
                jVar.f7117e0 = eVar.S;
                jVar.f7126k0 = eVar.Y;
                jVar.N = eVar.f7075x;
                jVar.P = eVar.f7077z;
                jVar.M = eVar.f7074w;
                jVar.O = eVar.f7076y;
                jVar.R = eVar.A;
                jVar.Q = eVar.B;
                jVar.S = eVar.C;
                jVar.f7133o0 = eVar.Z;
                jVar.J = eVar.getMarginEnd();
                jVar.K = eVar.getMarginStart();
                lVar.f7152a = childAt.getVisibility();
                lVar.f7154c = childAt.getAlpha();
                mVar.f7157a = childAt.getRotation();
                mVar.f7158b = childAt.getRotationX();
                mVar.f7159c = childAt.getRotationY();
                mVar.f7160d = childAt.getScaleX();
                mVar.f7161e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f7162f = pivotX;
                    mVar.f7163g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.j = childAt.getTranslationY();
                mVar.f7165k = childAt.getTranslationZ();
                if (mVar.f7166l) {
                    mVar.f7167m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f7131n0 = aVar.getAllowsGoneWidget();
                    jVar.f7123i0 = aVar.getReferencedIds();
                    jVar.f0 = aVar.getType();
                    jVar.f7120g0 = aVar.getMargin();
                }
            }
            i10 = i9 + 1;
            nVar = this;
            childCount = i;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    i d9 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d9.f7104d.f7108a = true;
                    }
                    this.f7173c.put(Integer.valueOf(d9.f7101a), d9);
                    continue;
                }
            }
        } catch (IOException e9) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e9);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e10);
        }
    }
}
