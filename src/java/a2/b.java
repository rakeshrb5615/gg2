package a2;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class b implements o2.f, t6.b, t2.b, a5.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f262a;

    /* renamed from: b  reason: collision with root package name */
    public Object f263b;

    /* renamed from: c  reason: collision with root package name */
    public Object f264c;

    /* renamed from: d  reason: collision with root package name */
    public Object f265d;

    /* renamed from: e  reason: collision with root package name */
    public Object f266e;

    /* renamed from: f  reason: collision with root package name */
    public Object f267f;

    public static b c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        b bVar = new b(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) bVar.f266e)) {
            try {
                ((ArrayDeque) bVar.f266e).clear();
                String string = ((SharedPreferences) bVar.f263b).getString((String) bVar.f264c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) bVar.f265d)) {
                    String[] split = string.split((String) bVar.f265d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) bVar.f266e).add(str);
                        }
                    }
                    return bVar;
                }
                return bVar;
            } finally {
            }
        }
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.f265d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar = (a) arrayList.get(i9);
            int i10 = aVar.f256a;
            if (i10 != 8) {
                if (i10 == 1) {
                    int i11 = aVar.f257b;
                    int i12 = aVar.f258c + i11;
                    while (i11 < i12) {
                        if (g(i11, i9 + 1) == i) {
                            return true;
                        }
                        i11++;
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (g(aVar.f258c, i9 + 1) == i) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        h0 h0Var = (h0) this.f266e;
        ArrayList arrayList = (ArrayList) this.f265d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h0) this.f266e).a((a) arrayList.get(i));
        }
        k(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f264c;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            a aVar = (a) arrayList2.get(i9);
            int i10 = aVar.f256a;
            if (i10 == 1) {
                h0Var.a(aVar);
                h0Var.d(aVar.f257b, aVar.f258c);
            } else if (i10 == 2) {
                h0Var.a(aVar);
                int i11 = aVar.f257b;
                int i12 = aVar.f258c;
                RecyclerView recyclerView = h0Var.f343a;
                recyclerView.S(i11, true, i12);
                recyclerView.n0 = true;
                recyclerView.k0.f328c += i12;
            } else if (i10 == 4) {
                h0Var.a(aVar);
                h0Var.c(aVar.f257b, aVar.f258c);
            } else if (i10 == 8) {
                h0Var.a(aVar);
                h0Var.e(aVar.f257b, aVar.f258c);
            }
        }
        k(arrayList2);
    }

    public void d(a aVar) {
        int i;
        p0.c cVar = (p0.c) this.f263b;
        int i9 = aVar.f256a;
        if (i9 == 1 || i9 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int n9 = n(aVar.f257b, i9);
        int i10 = aVar.f257b;
        int i11 = aVar.f256a;
        if (i11 == 2) {
            i = 0;
        } else if (i11 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + aVar);
        } else {
            i = 1;
        }
        int i12 = 1;
        for (int i13 = 1; i13 < aVar.f258c; i13++) {
            int n10 = n((i * i13) + aVar.f257b, aVar.f256a);
            int i14 = aVar.f256a;
            if (i14 == 2 ? n10 != n9 : !(i14 == 4 && n10 == n9 + 1)) {
                a i15 = i(i14, n9, i12);
                f(i15, i10);
                cVar.c(i15);
                if (aVar.f256a == 4) {
                    i10 += i12;
                }
                i12 = 1;
                n9 = n10;
            } else {
                i12++;
            }
        }
        cVar.c(aVar);
        if (i12 > 0) {
            a i16 = i(aVar.f256a, n9, i12);
            f(i16, i10);
            cVar.c(i16);
        }
    }

    @Override // a5.f
    public Object e(a5.z zVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((a5.x) this.f263b, (a5.x) this.f264c, (a5.x) this.f265d, (a5.x) this.f266e, (a5.x) this.f267f, zVar);
    }

    public void f(a aVar, int i) {
        h0 h0Var = (h0) this.f266e;
        h0Var.a(aVar);
        int i9 = aVar.f256a;
        if (i9 != 2) {
            if (i9 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            h0Var.c(i, aVar.f258c);
            return;
        }
        int i10 = aVar.f258c;
        RecyclerView recyclerView = h0Var.f343a;
        recyclerView.S(i, true, i10);
        recyclerView.n0 = true;
        recyclerView.k0.f328c += i10;
    }

    public int g(int i, int i9) {
        ArrayList arrayList = (ArrayList) this.f265d;
        int size = arrayList.size();
        while (i9 < size) {
            a aVar = (a) arrayList.get(i9);
            int i10 = aVar.f256a;
            if (i10 == 8) {
                int i11 = aVar.f257b;
                if (i11 == i) {
                    i = aVar.f258c;
                } else {
                    if (i11 < i) {
                        i--;
                    }
                    if (aVar.f258c <= i) {
                        i++;
                    }
                }
            } else {
                int i12 = aVar.f257b;
                if (i12 > i) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = aVar.f258c;
                    if (i < i12 + i13) {
                        return -1;
                    }
                    i -= i13;
                } else if (i10 == 1) {
                    i += aVar.f258c;
                }
            }
            i9++;
        }
        return i;
    }

    @Override // g7.a
    public Object get() {
        switch (this.f262a) {
            case 4:
                return new r6.s0((q4.f) ((k4.i) this.f263b).f3396b, (d6.d) ((g7.a) this.f264c).get(), (u6.k) ((g7.a) this.f265d).get(), (r6.l) ((t6.c) this.f266e).get(), (l7.h) ((g7.a) this.f267f).get());
            case d1.h.STRING_FIELD_NUMBER /* 5 */:
                return new u6.c((r6.g1) ((g7.a) this.f263b).get(), (d6.d) ((g7.a) this.f264c).get(), (r6.b) ((g7.a) this.f265d).get(), (u6.e) ((g7.a) this.f266e).get(), (u6.o) ((t6.c) this.f267f).get());
            default:
                return new w2.a((Executor) ((g7.a) this.f263b).get(), (s2.d) ((g7.a) this.f264c).get(), (b8.g) ((b8.g) this.f265d).get(), (y2.d) ((g7.a) this.f266e).get(), (z2.c) ((g7.a) this.f267f).get());
        }
    }

    public boolean h() {
        return ((ArrayList) this.f264c).size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [a2.a, java.lang.Object] */
    public a i(int i, int i9, int i10) {
        a aVar = (a) ((p0.c) this.f263b).a();
        if (aVar != null) {
            aVar.f256a = i;
            aVar.f257b = i9;
            aVar.f258c = i10;
            return aVar;
        }
        ?? obj = new Object();
        obj.f256a = i;
        obj.f257b = i9;
        obj.f258c = i10;
        return obj;
    }

    public void j(a aVar) {
        h0 h0Var = (h0) this.f266e;
        ((ArrayList) this.f265d).add(aVar);
        int i = aVar.f256a;
        if (i == 1) {
            h0Var.d(aVar.f257b, aVar.f258c);
        } else if (i == 2) {
            int i9 = aVar.f257b;
            int i10 = aVar.f258c;
            RecyclerView recyclerView = h0Var.f343a;
            recyclerView.S(i9, false, i10);
            recyclerView.n0 = true;
        } else if (i == 4) {
            h0Var.c(aVar.f257b, aVar.f258c);
        } else if (i == 8) {
            h0Var.e(aVar.f257b, aVar.f258c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    public void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            aVar.getClass();
            ((p0.c) this.f263b).c(aVar);
        }
        arrayList.clear();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, r2.h] */
    public void l(o2.a aVar, o2.h hVar) {
        r2.r rVar = (r2.r) this.f267f;
        r2.j jVar = (r2.j) this.f263b;
        String str = (String) this.f264c;
        o2.e eVar = (o2.e) this.f266e;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        w2.b bVar = rVar.f5556c;
        r2.j b10 = jVar.b(aVar.f5002b);
        ?? obj = new Object();
        obj.f5525f = new HashMap();
        obj.f5523d = Long.valueOf(rVar.f5554a.b());
        obj.f5524e = Long.valueOf(rVar.f5555b.b());
        obj.f5520a = str;
        obj.f5522c = new r2.m((o2.c) this.f265d, (byte[]) eVar.apply(aVar.f5001a));
        obj.f5521b = null;
        o2.b bVar2 = aVar.f5003c;
        if (bVar2 != null) {
            obj.f5526g = bVar2.f5004a;
        }
        w2.a aVar2 = (w2.a) bVar;
        aVar2.f6428b.execute(new i2.e(aVar2, b10, hVar, obj.b(), 4));
    }

    public void m(Object obj, String str) {
        kotlin.jvm.internal.j.e(str, "key");
        ((LinkedHashMap) this.f263b).put(str, obj);
        g8.u uVar = (g8.u) ((LinkedHashMap) this.f265d).get(str);
        if (uVar != null) {
            ((g8.y) uVar).d(obj);
        }
        g8.u uVar2 = (g8.u) ((LinkedHashMap) this.f266e).get(str);
        if (uVar2 != null) {
            ((g8.y) uVar2).d(obj);
        }
    }

    public int n(int i, int i9) {
        int i10;
        int i11;
        p0.c cVar = (p0.c) this.f263b;
        ArrayList arrayList = (ArrayList) this.f265d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i12 = aVar.f256a;
            if (i12 == 8) {
                int i13 = aVar.f257b;
                int i14 = aVar.f258c;
                if (i13 < i14) {
                    i11 = i13;
                    i10 = i14;
                } else {
                    i10 = i13;
                    i11 = i14;
                }
                if (i < i11 || i > i10) {
                    if (i < i13) {
                        if (i9 == 1) {
                            aVar.f257b = i13 + 1;
                            aVar.f258c = i14 + 1;
                        } else if (i9 == 2) {
                            aVar.f257b = i13 - 1;
                            aVar.f258c = i14 - 1;
                        }
                    }
                } else if (i11 == i13) {
                    if (i9 == 1) {
                        aVar.f258c = i14 + 1;
                    } else if (i9 == 2) {
                        aVar.f258c = i14 - 1;
                    }
                    i++;
                } else {
                    if (i9 == 1) {
                        aVar.f257b = i13 + 1;
                    } else if (i9 == 2) {
                        aVar.f257b = i13 - 1;
                    }
                    i--;
                }
            } else {
                int i15 = aVar.f257b;
                if (i15 <= i) {
                    if (i12 == 1) {
                        i -= aVar.f258c;
                    } else if (i12 == 2) {
                        i += aVar.f258c;
                    }
                } else if (i9 == 1) {
                    aVar.f257b = i15 + 1;
                } else if (i9 == 2) {
                    aVar.f257b = i15 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f256a == 8) {
                int i16 = aVar2.f258c;
                if (i16 == aVar2.f257b || i16 < 0) {
                    arrayList.remove(size2);
                    cVar.c(aVar2);
                }
            } else if (aVar2.f258c <= 0) {
                arrayList.remove(size2);
                cVar.c(aVar2);
            }
        }
        return i;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f262a = i;
        this.f263b = obj;
        this.f264c = obj2;
        this.f265d = obj3;
        this.f266e = obj4;
        this.f267f = obj5;
    }

    public b(Map map) {
        this.f262a = 2;
        kotlin.jvm.internal.j.e(map, "initialState");
        this.f263b = i7.r.s0(map);
        this.f264c = new LinkedHashMap();
        this.f265d = new LinkedHashMap();
        this.f266e = new LinkedHashMap();
        this.f267f = new c.f(this, 1);
    }

    public b(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f262a = 1;
        this.f266e = new ArrayDeque();
        this.f263b = sharedPreferences;
        this.f264c = "topic_operation_queue";
        this.f265d = ",";
        this.f267f = scheduledThreadPoolExecutor;
    }

    public b(h0 h0Var) {
        this.f262a = 0;
        this.f263b = new p0.c(30);
        this.f264c = new ArrayList();
        this.f265d = new ArrayList();
        this.f266e = h0Var;
        this.f267f = new l6.c(this, 4);
    }
}
