package d0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class g extends Activity implements androidx.lifecycle.u, q0.k {
    private final r.j extraDataMap = new r.j(0);
    private final androidx.lifecycle.w lifecycleRegistry = new androidx.lifecycle.w(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (q4.b.n(decorView, keyEvent)) {
            return true;
        }
        return q4.b.o(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (q4.b.n(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends f> T getExtraData(Class<T> cls) {
        kotlin.jvm.internal.j.e(cls, "extraDataClass");
        if (this.extraDataMap.get(cls) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public androidx.lifecycle.p getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = m0.b;
        k0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.e(bundle, "outState");
        androidx.lifecycle.w wVar = this.lifecycleRegistry;
        androidx.lifecycle.o oVar = androidx.lifecycle.o.a;
        wVar.g();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(f fVar) {
        kotlin.jvm.internal.j.e(fVar, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.equals("--autofill") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        if (r4.equals("--list-dumpables") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r4.equals("--dump-dumpable") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L56
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L56
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L46;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L56
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L56
        L1b:
            r1 = r0
            goto L56
        L1d:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L26
            goto L56
        L26:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L56
            goto L1b
        L2d:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L56
            goto L1b
        L46:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            goto L56
        L4f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L56
            goto L1b
        L56:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.g.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // q0.k
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        kotlin.jvm.internal.j.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
