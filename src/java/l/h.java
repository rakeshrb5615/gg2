package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import m.p;
import n.n1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class h extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f3514e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f3515f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f3516a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3517b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3518c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3519d;

    static {
        Class[] clsArr = {Context.class};
        f3514e = clsArr;
        f3515f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f3518c = context;
        Object[] objArr = {context};
        this.f3516a = objArr;
        this.f3517b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z9 = z9;
                        z10 = z10;
                    } else if (name2.equals("group")) {
                        gVar.f3492b = 0;
                        gVar.f3493c = 0;
                        gVar.f3494d = 0;
                        gVar.f3495e = 0;
                        gVar.f3496f = true;
                        gVar.f3497g = true;
                    } else if (name2.equals("item")) {
                        if (!gVar.f3498h) {
                            p pVar = gVar.f3513z;
                            if (pVar == null || !pVar.f3922b.hasSubMenu()) {
                                gVar.f3498h = true;
                                gVar.b(gVar.f3491a.add(gVar.f3492b, gVar.i, gVar.j, gVar.f3499k));
                            } else {
                                gVar.f3498h = true;
                                gVar.b(gVar.f3491a.addSubMenu(gVar.f3492b, gVar.i, gVar.j, gVar.f3499k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z9 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z9 = z9;
            } else {
                if (!z10) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f3518c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f1583p);
                        gVar.f3492b = obtainStyledAttributes.getResourceId(1, 0);
                        gVar.f3493c = obtainStyledAttributes.getInt(3, 0);
                        gVar.f3494d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f3495e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f3496f = obtainStyledAttributes.getBoolean(2, true);
                        gVar.f3497g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.a.q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.j = (obtainStyledAttributes2.getInt(5, gVar.f3493c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.f3494d) & 65535);
                            gVar.f3499k = obtainStyledAttributes2.getText(7);
                            gVar.f3500l = obtainStyledAttributes2.getText(8);
                            gVar.f3501m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f3502n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f3503o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.f3504p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f3505r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f3505r = gVar.f3495e;
                            }
                            gVar.f3506s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f3507t = obtainStyledAttributes2.getBoolean(4, gVar.f3496f);
                            gVar.f3508u = obtainStyledAttributes2.getBoolean(1, gVar.f3497g);
                            gVar.f3509v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f3512y = obtainStyledAttributes2.getString(12);
                            gVar.f3510w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f3511x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && gVar.f3510w == 0 && gVar.f3511x == null) {
                                gVar.f3513z = (p) gVar.a(string3, f3515f, this.f3517b);
                            } else {
                                if (z11) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f3513z = null;
                            }
                            gVar.A = obtainStyledAttributes2.getText(17);
                            gVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.D = n1.c(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                            } else {
                                gVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = e0.c.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.C = colorStateList;
                            } else {
                                gVar.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.f3498h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.f3498h = true;
                            SubMenu addSubMenu = gVar.f3491a.addSubMenu(gVar.f3492b, gVar.i, gVar.j, gVar.f3499k);
                            gVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z9 = z9;
                        z10 = z10;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z9 = z9;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z9 = z9;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof m.m)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z9 = false;
        try {
            try {
                xmlResourceParser = this.f3518c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof m.m) {
                    m.m mVar = (m.m) menu;
                    if (!mVar.f3887p) {
                        mVar.w();
                        z9 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z9) {
                    ((m.m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z9) {
                ((m.m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
