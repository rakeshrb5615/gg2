package r6;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5610a;

    /* renamed from: b  reason: collision with root package name */
    public final h7.j f5611b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5612c;

    /* renamed from: d  reason: collision with root package name */
    public final h7.j f5613d;

    /* renamed from: e  reason: collision with root package name */
    public final h7.j f5614e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5615f;

    public c0(Context context, h1 h1Var) {
        kotlin.jvm.internal.j.e(context, "appContext");
        kotlin.jvm.internal.j.e(h1Var, "uuidGenerator");
        this.f5610a = context;
        this.f5611b = a.a.F(new u7.a(this) { // from class: r6.b0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c0 f5597b;

            {
                this.f5597b = this;
            }

            @Override // u7.a
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((d0) this.f5597b.f5614e.getValue()).f5631a;
                    default:
                        return e0.b(this.f5597b.f5610a);
                }
            }
        });
        this.f5612c = Process.myPid();
        this.f5613d = a.a.F(new a8.j(h1Var, 6));
        this.f5614e = a.a.F(new u7.a(this) { // from class: r6.b0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c0 f5597b;

            {
                this.f5597b = this;
            }

            @Override // u7.a
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((d0) this.f5597b.f5614e.getValue()).f5631a;
                    default:
                        return e0.b(this.f5597b.f5610a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f5611b.getValue();
    }

    public final Map b(Map map) {
        h7.j jVar = this.f5613d;
        if (map != null) {
            LinkedHashMap s02 = i7.r.s0(map);
            s02.put(a(), new a0(Process.myPid(), (String) jVar.getValue()));
            return i7.r.r0(s02);
        }
        return i7.r.m0(new h7.f(a(), new a0(Process.myPid(), (String) jVar.getValue())));
    }
}
