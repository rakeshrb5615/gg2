package c2;

import a8.j;
import android.os.Bundle;
import androidx.lifecycle.o;
import b2.g;
import c.e;
import java.util.LinkedHashMap;
import v3.f;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final g f865a;

    /* renamed from: b  reason: collision with root package name */
    public final j f866b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f869e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f870f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f871g;

    /* renamed from: c  reason: collision with root package name */
    public final f f867c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f868d = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public boolean f872h = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [v3.f, java.lang.Object] */
    public a(g gVar, j jVar) {
        this.f865a = gVar;
        this.f866b = jVar;
    }

    public final void a() {
        g gVar = this.f865a;
        if (gVar.getLifecycle().c != o.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f869e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f866b.invoke();
        gVar.getLifecycle().a(new e(this, 2));
        this.f869e = true;
    }
}
