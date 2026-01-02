package v3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6176a;

    /* renamed from: b  reason: collision with root package name */
    public final p f6177b;

    /* renamed from: c  reason: collision with root package name */
    public final int[][] f6178c;

    /* renamed from: d  reason: collision with root package name */
    public final p[] f6179d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f6180e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f6181f;

    /* renamed from: g  reason: collision with root package name */
    public final b0 f6182g;

    /* renamed from: h  reason: collision with root package name */
    public final b0 f6183h;

    public d0(c0 c0Var) {
        this.f6176a = c0Var.f6168a;
        this.f6177b = c0Var.f6169b;
        this.f6178c = c0Var.f6170c;
        this.f6179d = c0Var.f6171d;
        this.f6180e = c0Var.f6172e;
        this.f6181f = c0Var.f6173f;
        this.f6182g = c0Var.f6174g;
        this.f6183h = c0Var.f6175h;
    }

    public static void a(c0 c0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
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
                int[] iArr = c3.a.f887r;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                p a10 = p.a(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0), new a(0)).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i9 = 0; i9 < attributeCount; i9++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i9);
                    if (attributeNameResource != 2130969707 && attributeNameResource != 2130969718) {
                        int i10 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i9, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i10;
                    }
                }
                c0Var.a(StateSet.trimStateSet(iArr2, i), a10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [v3.c0, java.lang.Object] */
    public static d0 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            ?? obj = new Object();
            obj.b();
            try {
                xml = context.getResources().getXml(resourceId);
                asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                obj.b();
            }
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    a(obj, context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                if (obj.f6168a == 0) {
                    return null;
                }
                return new d0(obj);
            }
            throw new XmlPullParserException("No start tag found");
        }
        return null;
    }

    public final p c() {
        p pVar = this.f6177b;
        b0 b0Var = this.f6183h;
        b0 b0Var2 = this.f6182g;
        b0 b0Var3 = this.f6181f;
        b0 b0Var4 = this.f6180e;
        if (b0Var4 == null && b0Var3 == null && b0Var2 == null && b0Var == null) {
            return pVar;
        }
        o f9 = pVar.f();
        if (b0Var4 != null) {
            f9.f6238e = b0Var4.f6164b;
        }
        if (b0Var3 != null) {
            f9.f6239f = b0Var3.f6164b;
        }
        if (b0Var2 != null) {
            f9.f6241h = b0Var2.f6164b;
        }
        if (b0Var != null) {
            f9.f6240g = b0Var.f6164b;
        }
        return f9.a();
    }

    public final boolean d() {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        b0 b0Var4;
        return this.f6176a > 1 || ((b0Var = this.f6180e) != null && b0Var.f6163a > 1) || (((b0Var2 = this.f6181f) != null && b0Var2.f6163a > 1) || (((b0Var3 = this.f6182g) != null && b0Var3.f6163a > 1) || ((b0Var4 = this.f6183h) != null && b0Var4.f6163a > 1)));
    }
}
