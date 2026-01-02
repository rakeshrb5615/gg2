package c1;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a extends k implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f849a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f850b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, Object obj, int i) {
        super(0);
        this.f849a = i;
        this.f850b = context;
        this.f851c = obj;
    }

    @Override // u7.a
    public final Object invoke() {
        switch (this.f849a) {
            case 0:
                SharedPreferences sharedPreferences = this.f850b.getSharedPreferences((String) this.f851c, 0);
                j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context context = this.f850b;
                j.d(context, "applicationContext");
                String str = ((d1.a) this.f851c).f1061a;
                j.e(str, "name");
                return x1.b.a(context, str.concat(".preferences_pb"));
        }
    }
}
