package a2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class d {

    /* renamed from: a */
    public final /* synthetic */ int f292a;

    /* renamed from: b */
    public int f293b;

    /* renamed from: c */
    public final Object f294c;

    /* renamed from: d */
    public Object f295d;

    /* renamed from: e */
    public final Serializable f296e;

    /* renamed from: f */
    public Object f297f;

    public d(h0 h0Var) {
        this.f292a = 0;
        this.f293b = 0;
        this.f294c = h0Var;
        this.f295d = new c();
        this.f296e = new ArrayList();
    }

    public static /* synthetic */ void n(d dVar, String str, int i, int i9) {
        if ((i9 & 2) != 0) {
            i = dVar.f293b;
        }
        dVar.m(str, i, (i9 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public void A(View view) {
        if (((ArrayList) this.f296e).remove(view)) {
            h0 h0Var = (h0) this.f294c;
            k1 M = RecyclerView.M(view);
            if (M != null) {
                RecyclerView recyclerView = h0Var.f343a;
                int i = M.f389p;
                if (recyclerView.P()) {
                    M.q = i;
                    recyclerView.x0.add(M);
                } else {
                    M.f376a.setImportantForAccessibility(i);
                }
                M.f389p = 0;
            }
        }
    }

    public void a(View view, int i, boolean z9) {
        RecyclerView recyclerView = ((h0) this.f294c).f343a;
        int childCount = i < 0 ? recyclerView.getChildCount() : s(i);
        ((c) this.f295d).e(childCount, z9);
        if (z9) {
            v(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.M(view);
    }

    public int b(CharSequence charSequence, int i) {
        int i9 = i + 4;
        if (i9 < charSequence.length()) {
            ((StringBuilder) this.f296e).append((char) (p(charSequence, i + 3) + (p(charSequence, i) << 12) + (p(charSequence, i + 1) << 8) + (p(charSequence, i + 2) << 4)));
            return i9;
        }
        this.f293b = i;
        if (i9 < charSequence.length()) {
            return b(charSequence, this.f293b);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z9) {
        RecyclerView recyclerView = ((h0) this.f294c).f343a;
        int childCount = i < 0 ? recyclerView.getChildCount() : s(i);
        ((c) this.f295d).e(childCount, z9);
        if (z9) {
            v(view);
        }
        k1 M = RecyclerView.M(view);
        if (M != null) {
            if (!M.j() && !M.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(M);
                throw new IllegalArgumentException(v1.a.h(recyclerView, sb));
            }
            if (RecyclerView.G0) {
                Log.d("RecyclerView", "reAttach " + M);
            }
            M.j &= -257;
        } else if (RecyclerView.F0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(v1.a.h(recyclerView, sb2));
        }
        RecyclerView.a(recyclerView, view, childCount, layoutParams);
    }

    public boolean d() {
        int i = this.f293b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f297f;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f293b = i;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i++;
        }
        this.f293b = i;
        return false;
    }

    public void e(int i, String str) {
        String str2 = (String) this.f297f;
        if (str2.length() - i < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != (str2.charAt(i + i9) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, 6);
                throw null;
            }
        }
        this.f293b = str.length() + i;
    }

    public String f() {
        StringBuilder sb = (StringBuilder) this.f296e;
        String str = (String) this.f297f;
        g('\"');
        int i = this.f293b;
        int v02 = b8.i.v0(str, '\"', i, 4);
        if (v02 == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i9 = i;
        while (i9 < v02) {
            if (str.charAt(i9) == '\\') {
                int i10 = this.f293b;
                char charAt = str.charAt(i9);
                boolean z9 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append((CharSequence) str, i10, i9);
                        int w8 = w(i9 + 1);
                        if (w8 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i11 = w8 + 1;
                        char charAt2 = str.charAt(w8);
                        if (charAt2 == 'u') {
                            i11 = b(str, i11);
                        } else {
                            char c9 = charAt2 < 'u' ? u8.c.f6134a[charAt2] : (char) 0;
                            if (c9 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb.append(c9);
                        }
                        i10 = w(i11);
                        if (i10 == -1) {
                            n(this, "Unexpected EOF", i10, 4);
                            throw null;
                        }
                    } else {
                        i9++;
                        if (i9 >= str.length()) {
                            sb.append((CharSequence) str, i10, i9);
                            i10 = w(i9);
                            if (i10 == -1) {
                                n(this, "Unexpected EOF", i10, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i9);
                        }
                    }
                    i9 = i10;
                    z9 = true;
                    charAt = str.charAt(i9);
                }
                String obj = !z9 ? str.subSequence(i10, i9).toString() : k(i10, i9);
                this.f293b = i9 + 1;
                return obj;
            }
            i9++;
        }
        this.f293b = v02 + 1;
        String substring = str.substring(i, v02);
        kotlin.jvm.internal.j.d(substring, "substring(...)");
        return substring;
    }

    public void g(char c9) {
        int i = this.f293b;
        if (i == -1) {
            z(c9);
            throw null;
        }
        String str = (String) this.f297f;
        while (i < str.length()) {
            int i9 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f293b = i9;
                if (charAt == c9) {
                    return;
                }
                z(c9);
                throw null;
            }
            i = i9;
        }
        this.f293b = -1;
        z(c9);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x00e9, code lost:
        n(r22, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0100, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0101, code lost:
        if (r12 == r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0103, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0105, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0106, code lost:
        if (r1 == r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0108, code lost:
        if (r14 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x010c, code lost:
        if (r1 == (r12 - 1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0113, code lost:
        if (r3 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0115, code lost:
        if (r5 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x011d, code lost:
        if (r2.charAt(r12) != '\"') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x011f, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0122, code lost:
        n(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0129, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x012a, code lost:
        n(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x012f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0130, code lost:
        r22.f293b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0134, code lost:
        if (r13 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0136, code lost:
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0139, code lost:
        if (r11 != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x013b, code lost:
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0143, code lost:
        if (r11 != 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0145, code lost:
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x014a, code lost:
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x014f, code lost:
        if (r1 > 9.223372036854776E18d) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0155, code lost:
        if (r1 < (-9.223372036854776E18d)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x015d, code lost:
        if (java.lang.Math.floor(r1) != r1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x015f, code lost:
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0161, code lost:
        n(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0179, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x017a, code lost:
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x017f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0185, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0186, code lost:
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0187, code lost:
        if (r14 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0189, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x018e, code lost:
        if (r10 == Long.MIN_VALUE) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0191, code lost:
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0192, code lost:
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0197, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0198, code lost:
        n(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x019d, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.h():long");
    }

    public String i() {
        String str = (String) this.f295d;
        if (str != null) {
            kotlin.jvm.internal.j.b(str);
            this.f295d = null;
            return str;
        }
        return f();
    }

    public String j() {
        String str = (String) this.f297f;
        String str2 = (String) this.f295d;
        if (str2 != null) {
            kotlin.jvm.internal.j.b(str2);
            this.f295d = null;
            return str2;
        }
        int x9 = x();
        if (x9 >= str.length() || x9 == -1) {
            n(this, "EOF", x9, 4);
            throw null;
        }
        byte b10 = u8.g.b(str.charAt(x9));
        if (b10 == 1) {
            return i();
        }
        if (b10 != 0) {
            n(this, "Expected beginning of the string, but got " + str.charAt(x9), 0, 6);
            throw null;
        }
        boolean z9 = false;
        while (u8.g.b(str.charAt(x9)) == 0) {
            x9++;
            if (x9 >= str.length()) {
                ((StringBuilder) this.f296e).append((CharSequence) str, this.f293b, x9);
                int w8 = w(x9);
                if (w8 == -1) {
                    this.f293b = x9;
                    return k(0, 0);
                }
                x9 = w8;
                z9 = true;
            }
        }
        String obj = !z9 ? str.subSequence(this.f293b, x9).toString() : k(this.f293b, x9);
        this.f293b = x9;
        return obj;
    }

    public String k(int i, int i9) {
        StringBuilder sb = (StringBuilder) this.f296e;
        sb.append((CharSequence) ((String) this.f297f), i, i9);
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void l(int i) {
        int s5 = s(i);
        ((c) this.f295d).f(s5);
        RecyclerView recyclerView = ((h0) this.f294c).f343a;
        View childAt = recyclerView.getChildAt(s5);
        if (childAt != null) {
            k1 M = RecyclerView.M(childAt);
            if (M != null) {
                if (M.j() && !M.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(M);
                    throw new IllegalArgumentException(v1.a.h(recyclerView, sb));
                }
                if (RecyclerView.G0) {
                    Log.d("RecyclerView", "tmpDetach " + M);
                }
                M.a(256);
            }
        } else if (RecyclerView.F0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(s5);
            throw new IllegalArgumentException(v1.a.h(recyclerView, sb2));
        }
        RecyclerView.c(recyclerView, s5);
    }

    public void m(String str, int i, String str2) {
        kotlin.jvm.internal.j.e(str, "message");
        kotlin.jvm.internal.j.e(str2, "hint");
        String str3 = str + " at path: " + ((g0.d) this.f294c).d() + (str2.length() == 0 ? "" : "\n".concat(str2));
        String str4 = (String) this.f297f;
        kotlin.jvm.internal.j.e(str3, "message");
        kotlin.jvm.internal.j.e(str4, "input");
        String str5 = str3 + "\nJSON input: " + ((Object) u8.g.d(str4, i));
        kotlin.jvm.internal.j.e(str5, "message");
        if (i >= 0) {
            str5 = "Unexpected JSON token at offset " + i + ": " + str5;
        }
        kotlin.jvm.internal.j.e(str5, "message");
        throw new IllegalArgumentException(str5);
    }

    public void o(byte b10, boolean z9) {
        String str = (String) this.f297f;
        String str2 = b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == Byte.MAX_VALUE ? "invalid token" : "valid token";
        int i = z9 ? this.f293b - 1 : this.f293b;
        String valueOf = (this.f293b == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i));
        n(this, "Expected " + str2 + ", but had '" + valueOf + "' instead", i, 4);
        throw null;
    }

    public int p(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' > charAt || charAt >= ':') {
            if ('a' > charAt || charAt >= 'g') {
                if ('A' > charAt || charAt >= 'G') {
                    n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
                    throw null;
                }
                return charAt - '7';
            }
            return charAt - 'W';
        }
        return charAt - '0';
    }

    public View q(int i) {
        return ((h0) this.f294c).f343a.getChildAt(s(i));
    }

    public int r() {
        return ((h0) this.f294c).f343a.getChildCount() - ((ArrayList) this.f296e).size();
    }

    public int s(int i) {
        c cVar = (c) this.f295d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((h0) this.f294c).f343a.getChildCount();
        int i9 = i;
        while (i9 < childCount) {
            int b10 = i - (i9 - cVar.b(i9));
            if (b10 == 0) {
                while (cVar.d(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += b10;
        }
        return -1;
    }

    public View t(int i) {
        return ((h0) this.f294c).f343a.getChildAt(i);
    }

    public final String toString() {
        switch (this.f292a) {
            case 0:
                return ((c) this.f295d).toString() + ", hidden list:" + ((ArrayList) this.f296e).size();
            default:
                return "JsonReader(source='" + ((Object) ((String) this.f297f)) + "', currentPosition=" + this.f293b + ')';
        }
    }

    public int u() {
        return ((h0) this.f294c).f343a.getChildCount();
    }

    public void v(View view) {
        ((ArrayList) this.f296e).add(view);
        h0 h0Var = (h0) this.f294c;
        k1 M = RecyclerView.M(view);
        if (M != null) {
            View view2 = M.f376a;
            RecyclerView recyclerView = h0Var.f343a;
            int i = M.q;
            if (i != -1) {
                M.f389p = i;
            } else {
                M.f389p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.P()) {
                view2.setImportantForAccessibility(4);
                return;
            }
            M.q = 4;
            recyclerView.x0.add(M);
        }
    }

    public int w(int i) {
        if (i < ((String) this.f297f).length()) {
            return i;
        }
        return -1;
    }

    public int x() {
        char charAt;
        int i = this.f293b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f297f;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.f293b = i;
        return i;
    }

    public boolean y() {
        int x9 = x();
        String str = (String) this.f297f;
        if (x9 >= str.length() || x9 == -1 || str.charAt(x9) != ',') {
            return false;
        }
        this.f293b++;
        return true;
    }

    public void z(char c9) {
        int i = this.f293b;
        if (i > 0 && c9 == '\"') {
            try {
                this.f293b = i - 1;
                String j = j();
                this.f293b = i;
                if (kotlin.jvm.internal.j.a(j, "null")) {
                    m("Expected string literal but 'null' literal was found", this.f293b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f293b = i;
                throw th;
            }
        }
        o(u8.g.b(c9), true);
        throw null;
    }

    public d(String str) {
        this.f292a = 1;
        kotlin.jvm.internal.j.e(str, "source");
        g0.d dVar = new g0.d();
        dVar.f1609c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        dVar.f1610d = iArr;
        dVar.f1608b = -1;
        this.f294c = dVar;
        this.f296e = new StringBuilder();
        this.f297f = str;
    }
}
