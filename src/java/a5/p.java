package a5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class p implements x5.c, x5.b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f601a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f602b;

    /* renamed from: c  reason: collision with root package name */
    public final b5.n f603c;

    public p() {
        b5.n nVar = b5.n.f759a;
        this.f601a = new HashMap();
        this.f602b = new ArrayDeque();
        this.f603c = nVar;
    }

    public final synchronized void a(Executor executor, x5.a aVar) {
        try {
            executor.getClass();
            if (!this.f601a.containsKey(q4.b.class)) {
                this.f601a.put(q4.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f601a.get(q4.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
