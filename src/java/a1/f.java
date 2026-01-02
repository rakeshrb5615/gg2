package a1;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class f extends n7.i implements u7.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f55a;

    /* renamed from: b  reason: collision with root package name */
    public int f56b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f57c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, l7.c cVar, int i) {
        super(1, cVar);
        this.f55a = i;
        this.f57c = obj;
    }

    @Override // n7.a
    public final l7.c create(l7.c cVar) {
        switch (this.f55a) {
            case 0:
                return new f((c1.d) this.f57c, cVar, 0);
            default:
                return new f((c0) this.f57c, cVar, 1);
        }
    }

    @Override // u7.l
    public final Object invoke(Object obj) {
        l7.c cVar = (l7.c) obj;
        switch (this.f55a) {
            case 0:
                return ((f) create(cVar)).invokeSuspend(h7.l.f2236a);
            default:
                return ((f) create(cVar)).invokeSuspend(h7.l.f2236a);
        }
    }

    @Override // n7.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.f55a) {
            case 0:
                m7.a aVar = m7.a.f4049a;
                int i = this.f56b;
                h7.l lVar = h7.l.f2236a;
                if (i == 0) {
                    c4.b.e0(obj);
                    c1.d dVar = (c1.d) this.f57c;
                    this.f56b = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.f860e.getValue()).edit();
                    Set<String> set = dVar.f861f;
                    if (set == null) {
                        edit.clear();
                    } else {
                        for (String str2 : set) {
                            edit.remove(str2);
                        }
                    }
                    if (!edit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) dVar.f860e.getValue()).getAll().isEmpty() && (context = dVar.f858c) != null && (str = dVar.f859d) != null) {
                        c1.b.a(context, str);
                    }
                    if (set != null) {
                        set.clear();
                    }
                    if (lVar == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    c4.b.e0(obj);
                }
                return lVar;
            default:
                m7.a aVar2 = m7.a.f4049a;
                int i9 = this.f56b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        c4.b.e0(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4.b.e0(obj);
                this.f56b = 1;
                Object invoke = ((c0) this.f57c).invoke(this);
                return invoke == aVar2 ? aVar2 : invoke;
        }
    }
}
