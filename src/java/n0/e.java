package n0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4386b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f4387c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4388d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4389e;

    public /* synthetic */ e(String str, Context context, Object obj, int i, int i9) {
        this.f4385a = i9;
        this.f4386b = str;
        this.f4387c = context;
        this.f4389e = obj;
        this.f4388d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4385a) {
            case 0:
                ArrayList arrayList = new ArrayList(1);
                Object obj = new Object[]{(d) this.f4389e}[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f4386b, this.f4387c, Collections.unmodifiableList(arrayList), this.f4388d);
            default:
                try {
                    return h.b(this.f4386b, this.f4387c, (List) this.f4389e, this.f4388d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
