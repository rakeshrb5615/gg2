package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f implements r0.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2039a;

    /* renamed from: b  reason: collision with root package name */
    public int f2040b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2041c;

    public /* synthetic */ f(int i, boolean z9) {
        this.f2039a = i;
    }

    @Override // r0.l
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f2041c).H(this.f2040b);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public g b() {
        b bVar = (b) this.f2041c;
        g gVar = new g(bVar.f1967a, this.f2040b);
        View view = bVar.f1971e;
        e eVar = gVar.f2042m;
        if (view != null) {
            eVar.f2028n = view;
        } else {
            CharSequence charSequence = bVar.f1970d;
            if (charSequence != null) {
                eVar.f2020d = charSequence;
                TextView textView = eVar.f2026l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f1969c;
            if (drawable != null) {
                eVar.j = drawable;
                ImageView imageView = eVar.f2025k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f2025k.setImageDrawable(drawable);
                }
            }
        }
        if (bVar.f1973g != null) {
            AlertController.RecycleListView inflate = bVar.f1968b.inflate(eVar.f2031r, (ViewGroup) null);
            int i = bVar.i ? eVar.f2032s : eVar.f2033t;
            Object obj = bVar.f1973g;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(bVar.f1967a, i, 16908308, (Object[]) null);
            }
            eVar.f2029o = arrayAdapter;
            eVar.f2030p = bVar.j;
            if (bVar.f1974h != null) {
                inflate.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.i) {
                inflate.setChoiceMode(1);
            }
            eVar.f2021e = inflate;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        m.n nVar = bVar.f1972f;
        if (nVar != null) {
            gVar.setOnKeyListener(nVar);
        }
        return gVar;
    }

    public void c(int i, int i9) {
        int i10 = i9 + i;
        char[] cArr = (char[]) this.f2041c;
        if (cArr.length <= i10) {
            int i11 = i * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            char[] copyOf = Arrays.copyOf(cArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            this.f2041c = copyOf;
        }
    }

    public synchronized List d() {
        return Collections.unmodifiableList(new ArrayList((ArrayList) this.f2041c));
    }

    public void e(int i, x8.d dVar) {
        while (true) {
            int i9 = i >> 1;
            if (i9 == 0) {
                break;
            }
            x8.d dVar2 = ((x8.d[]) this.f2041c)[i9];
            kotlin.jvm.internal.j.b(dVar2);
            if (kotlin.jvm.internal.j.g(0L, dVar.f6632g - dVar2.f6632g) <= 0) {
                break;
            }
            dVar2.f6631f = i;
            ((x8.d[]) this.f2041c)[i] = dVar2;
            i = i9;
        }
        ((x8.d[]) this.f2041c)[i] = dVar;
        dVar.f6631f = i;
    }

    public void f() {
        u8.b bVar = u8.b.f6133c;
        char[] cArr = (char[]) this.f2041c;
        bVar.getClass();
        kotlin.jvm.internal.j.e(cArr, "array");
        synchronized (bVar) {
            int i = ((androidx.datastore.preferences.protobuf.j) bVar).a;
            if (cArr.length + i < u8.a.f6132a) {
                ((androidx.datastore.preferences.protobuf.j) bVar).a = i + cArr.length;
                ((i7.g) ((androidx.datastore.preferences.protobuf.j) bVar).b).addLast(cArr);
            }
        }
    }

    public void g(x8.d dVar) {
        x8.d dVar2;
        int i = dVar.f6631f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i9 = this.f2040b;
        x8.d dVar3 = ((x8.d[]) this.f2041c)[i9];
        kotlin.jvm.internal.j.b(dVar3);
        dVar.f6631f = -1;
        ((x8.d[]) this.f2041c)[i9] = null;
        this.f2040b = i9 - 1;
        if (dVar == dVar3) {
            return;
        }
        int g3 = kotlin.jvm.internal.j.g(0L, dVar3.f6632g - dVar.f6632g);
        if (g3 == 0) {
            ((x8.d[]) this.f2041c)[i] = dVar3;
            dVar3.f6631f = i;
        } else if (g3 >= 0) {
            e(i, dVar3);
        } else {
            while (true) {
                int i10 = i << 1;
                int i11 = i10 + 1;
                int i12 = this.f2040b;
                if (i11 > i12) {
                    if (i10 > i12) {
                        break;
                    }
                    dVar2 = ((x8.d[]) this.f2041c)[i10];
                    kotlin.jvm.internal.j.b(dVar2);
                } else {
                    dVar2 = ((x8.d[]) this.f2041c)[i10];
                    kotlin.jvm.internal.j.b(dVar2);
                    x8.d dVar4 = ((x8.d[]) this.f2041c)[i11];
                    kotlin.jvm.internal.j.b(dVar4);
                    if (kotlin.jvm.internal.j.g(0L, dVar4.f6632g - dVar2.f6632g) >= 0) {
                        dVar2 = dVar4;
                    }
                }
                if (kotlin.jvm.internal.j.g(0L, dVar2.f6632g - dVar3.f6632g) <= 0) {
                    break;
                }
                int i13 = dVar2.f6631f;
                dVar2.f6631f = i;
                ((x8.d[]) this.f2041c)[i] = dVar2;
                i = i13;
            }
            ((x8.d[]) this.f2041c)[i] = dVar3;
            dVar3.f6631f = i;
        }
    }

    public synchronized boolean h(List list) {
        ((ArrayList) this.f2041c).clear();
        if (list.size() <= this.f2040b) {
            return ((ArrayList) this.f2041c).addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f2040b, null);
        return ((ArrayList) this.f2041c).addAll(list.subList(0, this.f2040b));
    }

    public void i(String str) {
        kotlin.jvm.internal.j.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        c(this.f2040b, length);
        str.getChars(0, str.length(), (char[]) this.f2041c, this.f2040b);
        this.f2040b += length;
    }

    public String toString() {
        switch (this.f2039a) {
            case d1.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return new String((char[]) this.f2041c, 0, this.f2040b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(Object obj, int i, int i9) {
        this.f2039a = i9;
        this.f2041c = obj;
        this.f2040b = i;
    }

    public f(int i, String str) {
        this.f2039a = 4;
        this.f2040b = i;
        this.f2041c = str;
    }

    public f(int i) {
        this.f2039a = i;
        switch (i) {
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                this.f2040b = 1;
                this.f2041c = Collections.singletonList(null);
                return;
            default:
                this.f2041c = new ArrayList();
                this.f2040b = 128;
                return;
        }
    }

    public f(Context context) {
        this.f2039a = 0;
        int e9 = g.e(context, 0);
        this.f2041c = new b(new ContextThemeWrapper(context, g.e(context, e9)));
        this.f2040b = e9;
    }

    public f(ArrayList arrayList) {
        this.f2039a = 5;
        this.f2040b = 0;
        this.f2041c = arrayList;
    }
}
