package v3;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public int f6190a;

    /* renamed from: b  reason: collision with root package name */
    public j6.o f6191b;

    /* renamed from: c  reason: collision with root package name */
    public int[][] f6192c;

    /* renamed from: d  reason: collision with root package name */
    public j6.o[] f6193d;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
            r11 = this;
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r13.next()
            if (r2 == r1) goto Lcd
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto Lcd
        L15:
            r4 = 2
            if (r2 != r4) goto L6
            if (r3 > r0) goto L6
            java.lang.String r2 = r13.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            goto L6
        L27:
            android.content.res.Resources r2 = r12.getResources()
            int[] r3 = c3.a.D
            r5 = 0
            if (r15 != 0) goto L35
            android.content.res.TypedArray r2 = r2.obtainAttributes(r14, r3)
            goto L39
        L35:
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r14, r3, r5, r5)
        L39:
            android.util.TypedValue r3 = r2.peekValue(r5)
            if (r3 != 0) goto L40
            goto L69
        L40:
            int r6 = r3.type
            r7 = 5
            if (r6 != r7) goto L5a
            v3.e0 r6 = new v3.e0
            int r3 = r3.data
            android.content.res.Resources r7 = r2.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r3 = android.util.TypedValue.complexToDimensionPixelSize(r3, r7)
            float r3 = (float) r3
            r6.<init>(r4, r3)
            goto L6a
        L5a:
            r4 = 6
            if (r6 != r4) goto L69
            v3.e0 r6 = new v3.e0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r4, r4)
            r6.<init>(r1, r3)
            goto L6a
        L69:
            r6 = 0
        L6a:
            r2.recycle()
            int r2 = r14.getAttributeCount()
            int[] r3 = new int[r2]
            r4 = r5
            r7 = r4
        L75:
            if (r4 >= r2) goto L90
            int r8 = r14.getAttributeNameResource(r4)
            r9 = 2130970074(0x7f0405da, float:1.7548848E38)
            if (r8 == r9) goto L8d
            int r9 = r7 + 1
            boolean r10 = r14.getAttributeBooleanValue(r4, r5)
            if (r10 == 0) goto L89
            goto L8a
        L89:
            int r8 = -r8
        L8a:
            r3[r7] = r8
            r7 = r9
        L8d:
            int r4 = r4 + 1
            goto L75
        L90:
            int[] r2 = android.util.StateSet.trimStateSet(r3, r7)
            j6.o r3 = new j6.o
            r4 = 18
            r7 = 0
            r3.<init>(r4, r7)
            r3.f3275b = r6
            int r4 = r11.f6190a
            if (r4 == 0) goto La5
            int r6 = r2.length
            if (r6 != 0) goto La7
        La5:
            r11.f6191b = r3
        La7:
            int[][] r6 = r11.f6192c
            int r7 = r6.length
            if (r4 < r7) goto Lbe
            int r7 = r4 + 10
            int[][] r8 = new int[r7]
            java.lang.System.arraycopy(r6, r5, r8, r5, r4)
            r11.f6192c = r8
            j6.o[] r6 = new j6.o[r7]
            j6.o[] r7 = r11.f6193d
            java.lang.System.arraycopy(r7, r5, r6, r5, r4)
            r11.f6193d = r6
        Lbe:
            int[][] r4 = r11.f6192c
            int r5 = r11.f6190a
            r4[r5] = r2
            j6.o[] r2 = r11.f6193d
            r2[r5] = r3
            int r5 = r5 + r1
            r11.f6190a = r5
            goto L6
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f0.a(android.content.Context, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
