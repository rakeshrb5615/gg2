package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class p extends Dialog implements androidx.lifecycle.u, w, b2.g {

    /* renamed from: a  reason: collision with root package name */
    public androidx.lifecycle.w f825a;

    /* renamed from: b  reason: collision with root package name */
    public final b2.f f826b;

    /* renamed from: c  reason: collision with root package name */
    public final h7.j f827c;

    /* renamed from: d  reason: collision with root package name */
    public final h7.j f828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i) {
        super(context, i);
        kotlin.jvm.internal.j.e(context, "context");
        this.f826b = new b2.f(new c2.a(this, new a8.j(this, 2)));
        this.f827c = a.a.F(new u7.a(this) { // from class: c.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ p f824b;

            {
                this.f824b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [s1.e, java.lang.Object] */
            @Override // u7.a
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        ?? obj = new Object();
                        this.f824b.getOnBackPressedDispatcher().f842b.a(obj);
                        return obj;
                    default:
                        return new v(new g0(this.f824b, 2));
                }
            }
        });
        this.f828d = a.a.F(new u7.a(this) { // from class: c.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ p f824b;

            {
                this.f824b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [s1.e, java.lang.Object] */
            @Override // u7.a
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        ?? obj = new Object();
                        this.f824b.getOnBackPressedDispatcher().f842b.a(obj);
                        return obj;
                    default:
                        return new v(new g0(this.f824b, 2));
                }
            }
        });
    }

    public static void a(p pVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.j.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        decorView.setTag(2131362596, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.j.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "getDecorView(...)");
        decorView2.setTag(2131362598, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.j.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "getDecorView(...)");
        decorView3.setTag(2131362599, this);
        Window window4 = getWindow();
        kotlin.jvm.internal.j.b(window4);
        View decorView4 = window4.getDecorView();
        kotlin.jvm.internal.j.d(decorView4, "getDecorView(...)");
        decorView4.setTag(2131362597, this);
    }

    public final androidx.lifecycle.p getLifecycle() {
        androidx.lifecycle.w wVar = this.f825a;
        if (wVar == null) {
            androidx.lifecycle.w wVar2 = new androidx.lifecycle.w(this);
            this.f825a = wVar2;
            return wVar2;
        }
        return wVar;
    }

    @Override // c.w
    public final v getOnBackPressedDispatcher() {
        return (v) this.f828d.getValue();
    }

    @Override // b2.g
    public final b2.e getSavedStateRegistry() {
        return this.f826b.f708b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((s1.a) this.f827c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            v onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.b(onBackInvokedDispatcher);
        }
        this.f826b.a(bundle);
        androidx.lifecycle.w wVar = this.f825a;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this.f825a = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.j.d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f826b.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        androidx.lifecycle.w wVar = this.f825a;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this.f825a = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.w wVar = this.f825a;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this.f825a = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_DESTROY);
        this.f825a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.j.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
