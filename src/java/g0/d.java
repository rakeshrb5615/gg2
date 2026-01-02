package g0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import j5.t1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import n.n1;
import n.u;
import n.v2;
import q0.q0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1607a;

    /* renamed from: b  reason: collision with root package name */
    public int f1608b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1609c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1610d;

    public /* synthetic */ d() {
        this.f1607a = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
        if (r11 == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
        if (r11 == 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
        r16 = (int[]) r0.f3363b;
        r17 = (float[]) r0.f3364c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
        if (r10 == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
        if (r10 == 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0219, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f3363b, (float[]) r0.f3364c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0235, code lost:
        if (r25 <= 0.0f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0237, code lost:
        r20 = (int[]) r0.f3363b;
        r21 = (float[]) r0.f3364c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0246, code lost:
        if (r10 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
        if (r10 == 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025c, code lost:
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0268, code lost:
        return new g0.d(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0270, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
        if (r13.size() <= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
        r0 = new k2.c(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
        r0 = new k2.c(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
        r0 = new k2.c(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g0.d c(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.c(android.content.res.Resources, int, android.content.res.Resources$Theme):g0.d");
    }

    public void a() {
        v2 v2Var;
        ImageView imageView = (ImageView) this.f1609c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            n1.a(drawable);
        }
        if (drawable == null || (v2Var = (v2) this.f1610d) == null) {
            return;
        }
        u.e(drawable, v2Var, imageView.getDrawableState());
    }

    public m4.n b() {
        m4.e eVar = (m4.e) this.f1610d;
        if (eVar == null) {
            m4.n b10 = m4.n.b(this.f1608b, (Object[]) this.f1609c, this);
            m4.e eVar2 = (m4.e) this.f1610d;
            if (eVar2 == null) {
                return b10;
            }
            throw eVar2.a();
        }
        throw eVar.a();
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f1608b + 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = ((Object[]) this.f1609c)[i9];
            if (obj instanceof q8.d) {
                q8.d dVar = (q8.d) obj;
                if (!kotlin.jvm.internal.j.a(dVar.c(), q8.f.f5444g)) {
                    int i10 = ((int[]) this.f1610d)[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(dVar.e(i10));
                    }
                } else if (((int[]) this.f1610d)[i9] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f1610d)[i9]);
                    sb.append("]");
                }
            } else if (obj != u8.h.f6139a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        return sb2;
    }

    public boolean e() {
        ColorStateList colorStateList;
        return ((Shader) this.f1609c) == null && (colorStateList = (ColorStateList) this.f1610d) != null && colorStateList.isStateful();
    }

    public void f(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1609c;
        Context context = imageView.getContext();
        int[] iArr = g.a.f1575f;
        b8.g p8 = b8.g.p(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) p8.f790c;
        q0.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) p8.f790c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = t1.A(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                n1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(p8.h(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(n1.c(typedArray.getInt(3, -1), null));
            }
            p8.r();
        } catch (Throwable th) {
            p8.r();
            throw th;
        }
    }

    public void g(Object obj, Object obj2) {
        int i = (this.f1608b + 1) * 2;
        Object[] objArr = (Object[]) this.f1609c;
        if (i > objArr.length) {
            this.f1609c = Arrays.copyOf(objArr, c4.b.y(objArr.length, i));
        }
        q4.b.e(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1609c;
        int i9 = this.f1608b;
        int i10 = i9 * 2;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f1608b = i9 + 1;
    }

    public void h(Collection collection) {
        if (collection != null) {
            int size = (collection.size() + this.f1608b) * 2;
            Object[] objArr = (Object[]) this.f1609c;
            if (size > objArr.length) {
                this.f1609c = Arrays.copyOf(objArr, c4.b.y(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            g(entry.getKey(), entry.getValue());
        }
    }

    public String toString() {
        switch (this.f1607a) {
            case d1.h.INTEGER_FIELD_NUMBER /* 3 */:
                return d();
            default:
                return super.toString();
        }
    }

    public d(ImageView imageView) {
        this.f1607a = 2;
        this.f1608b = 0;
        this.f1609c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f1607a = 0;
        this.f1609c = shader;
        this.f1610d = colorStateList;
        this.f1608b = i;
    }

    public d(int i) {
        this.f1607a = 1;
        this.f1609c = new Object[i * 2];
        this.f1608b = 0;
    }
}
