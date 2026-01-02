package h5;

import android.os.Looper;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final /* synthetic */ class d extends i implements u7.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Class cls, String str, String str2, int i9, int i10) {
        super(i, obj, cls, str, str2, i9);
        this.f2215a = i10;
    }

    @Override // u7.a
    public final Object invoke() {
        switch (this.f2215a) {
            case 0:
                ((e) ((kotlin.jvm.internal.c) this).receiver).getClass();
                String name = Thread.currentThread().getName();
                j.d(name, "<get-threadName>(...)");
                return Boolean.valueOf(b8.i.s0(name, "Firebase Background Thread #"));
            case 1:
                ((e) ((kotlin.jvm.internal.c) this).receiver).getClass();
                String name2 = Thread.currentThread().getName();
                j.d(name2, "<get-threadName>(...)");
                return Boolean.valueOf(b8.i.s0(name2, "Firebase Blocking Thread #"));
            default:
                ((e) ((kotlin.jvm.internal.c) this).receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
