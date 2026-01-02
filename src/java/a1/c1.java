package a1;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public final class c1 extends FileObserver {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f32b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f33c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList f34a;

    public c1(String str) {
        super(str, 128);
        this.f34a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        for (u7.l lVar : this.f34a) {
            lVar.invoke(str);
        }
    }
}
