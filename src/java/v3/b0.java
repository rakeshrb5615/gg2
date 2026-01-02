package v3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public int f6163a;

    /* renamed from: b  reason: collision with root package name */
    public d f6164b;

    /* renamed from: c  reason: collision with root package name */
    public int[][] f6165c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public d[] f6166d = new d[10];

    public static b0 b(d dVar) {
        b0 b0Var = new b0();
        b0Var.a(StateSet.WILD_CARD, dVar);
        return b0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i = this.f6163a;
        if (i == 0 || iArr.length == 0) {
            this.f6164b = dVar;
        }
        int[][] iArr2 = this.f6165c;
        if (i >= iArr2.length) {
            int i9 = i + 10;
            int[][] iArr3 = new int[i9];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f6165c = iArr3;
            d[] dVarArr = new d[i9];
            System.arraycopy(this.f6166d, 0, dVarArr, 0, i);
            this.f6166d = dVarArr;
        }
        int[][] iArr4 = this.f6165c;
        int i10 = this.f6163a;
        iArr4[i10] = iArr;
        this.f6166d[i10] = dVar;
        this.f6163a = i10 + 1;
    }

    public final d c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f6165c;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i = -1;
            if (i10 >= this.f6163a) {
                i10 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f6165c;
            while (true) {
                if (i9 >= this.f6163a) {
                    break;
                } else if (StateSet.stateSetMatches(iArr4[i9], iArr3)) {
                    i = i9;
                    break;
                } else {
                    i9++;
                }
            }
            i10 = i;
        }
        return i10 < 0 ? this.f6164b : this.f6166d[i10];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = c3.a.f895z;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d c9 = p.c(obtainAttributes, 5, new a(0.0f));
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i9 = 0; i9 < attributeCount; i9++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i9);
                    if (attributeNameResource != 2130968958) {
                        int i10 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i9, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i10;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i), c9);
            }
        }
    }
}
