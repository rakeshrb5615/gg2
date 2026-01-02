package l6;

import a1.l1;
import a1.m1;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.d;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.h;
import g5.n;
import g5.q;
import g5.r;
import g5.s;
import g8.y;
import h3.i;
import i1.g;
import i2.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import org.json.JSONException;
import org.json.JSONObject;
import q0.p1;
import q0.q0;
import q0.s1;
import q0.t;
import r0.l;
import u7.p;
import w6.z;
import y3.e;
import z8.m;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class c implements g8.c, m, t, d4.c, e5.b, f5.a, e5.a, l, SuccessContinuation, BillingClientStateListener, i3.b {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f3789c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3790a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3791b;

    public /* synthetic */ c(int i, boolean z9) {
        this.f3790a = i;
    }

    public static String k(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // r0.l
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3791b;
        if (swipeDismissBehavior.v(view)) {
            boolean z9 = view.getLayoutDirection() == 1;
            int i = swipeDismissBehavior.e;
            int width = (!(i == 0 && z9) && (i != 1 || z9)) ? view.getWidth() : -view.getWidth();
            WeakHashMap weakHashMap = q0.f5172a;
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            e eVar = swipeDismissBehavior.b;
            if (eVar != null) {
                eVar.a(view);
            }
            return true;
        }
        return false;
    }

    @Override // f5.a
    public void b(q qVar) {
        this.f3791b = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // e5.b
    public void d(Bundle bundle, String str) {
        q qVar = (q) this.f3791b;
        if (qVar != null) {
            try {
                s sVar = qVar.f1826a;
                sVar.f1843o.f2217a.a(new r(sVar, System.currentTimeMillis() - sVar.f1834d, "$A$:" + k(bundle, str), 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // z8.m
    public Object e(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        ResponseBody.BomAwareReader bomAwareReader = responseBody.a;
        if (bomAwareReader == null) {
            bomAwareReader = new ResponseBody.BomAwareReader(responseBody.i(), Internal.a(responseBody.f()));
            responseBody.a = bomAwareReader;
        }
        e7.a aVar = new e7.a(bomAwareReader);
        aVar.f1343u = 2;
        try {
            Object b10 = ((z) this.f3791b).b(aVar);
            if (aVar.O() == 10) {
                return b10;
            }
            throw new RuntimeException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    @Override // g8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(g8.d r7, n7.c r8) {
        /*
            r6 = this;
            int r0 = r6.f3790a
            switch(r0) {
                case 2: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof g8.a
            if (r0 == 0) goto L18
            r0 = r8
            g8.a r0 = (g8.a) r0
            int r1 = r0.f1878d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f1878d = r1
            goto L1d
        L18:
            g8.a r0 = new g8.a
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f1876b
            m7.a r1 = m7.a.f4049a
            int r2 = r0.f1878d
            h7.l r3 = h7.l.f2236a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            h8.g r7 = r0.f1875a
            c4.b.e0(r8)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            c4.b.e0(r8)
            h8.g r8 = new h8.g
            l7.h r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f1875a = r8     // Catch: java.lang.Throwable -> L63
            r0.f1878d = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r6.f3791b     // Catch: java.lang.Throwable -> L63
            n7.i r7 = (n7.i) r7     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r1) goto L55
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 != r1) goto L59
            goto L5e
        L59:
            r7 = r8
        L5a:
            r7.releaseIntercepted()
            r1 = r3
        L5e:
            return r1
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L65
        L63:
            r7 = move-exception
            goto L5f
        L65:
            r7.releaseIntercepted()
            throw r8
        L69:
            java.lang.Object r0 = r6.f3791b
            k2.c r0 = (k2.c) r0
            a1.s r1 = new a1.s
            r2 = 0
            r1.<init>(r7, r2)
            java.lang.Object r7 = r0.f(r1, r8)
            m7.a r8 = m7.a.f4049a
            if (r7 != r8) goto L7c
            goto L7e
        L7c:
            h7.l r7 = h7.l.f2236a
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c.f(g8.d, n7.c):java.lang.Object");
    }

    @Override // e5.a
    public void g(Bundle bundle) {
        ((u4.c) ((u4.b) this.f3791b)).a("clx", "_ae", bundle);
    }

    public l1 h() {
        return (l1) ((y) this.f3791b).b();
    }

    @Override // q0.t
    public s1 i(View view, s1 s1Var) {
        switch (this.f3790a) {
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                p1 p1Var = s1Var.f5183a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3791b;
                if (!Objects.equals(coordinatorLayout.t, s1Var)) {
                    coordinatorLayout.t = s1Var;
                    boolean z9 = true;
                    boolean z10 = s1Var.d() > 0;
                    coordinatorLayout.u = z10;
                    coordinatorLayout.setWillNotDraw((z10 || coordinatorLayout.getBackground() != null) ? false : false);
                    if (!p1Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = q0.f5172a;
                            if (!childAt.getFitsSystemWindows() || ((d) childAt.getLayoutParams()).f683a == null || !p1Var.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return s1Var;
            default:
                i iVar = (i) this.f3791b;
                h3.h hVar = iVar.f2185t;
                if (hVar != null) {
                    iVar.f2179m.Y.remove(hVar);
                }
                h3.h hVar2 = new h3.h(iVar.f2182p, s1Var);
                iVar.f2185t = hVar2;
                hVar2.e(iVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = iVar.f2179m;
                h3.h hVar3 = iVar.f2185t;
                ArrayList arrayList = bottomSheetBehavior.Y;
                if (!arrayList.contains(hVar3)) {
                    arrayList.add(hVar3);
                }
                return s1Var;
        }
    }

    public void j(o5.d dVar, Thread thread, Throwable th) {
        Task continueWithTask;
        n nVar = (n) this.f3791b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            a.a.L();
            long currentTimeMillis = System.currentTimeMillis();
            h5.c cVar = nVar.f1811e.f2217a;
            g5.l lVar = new g5.l(nVar, currentTimeMillis, th, thread, dVar);
            synchronized (cVar.f2213b) {
                continueWithTask = cVar.f2214c.continueWithTask(cVar.f2212a, new a5.a(lVar, 6));
                cVar.f2214c = continueWithTask;
            }
            try {
                g5.z.a(continueWithTask);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e9) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e9);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6.f138a > r2.f138a) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(a1.l1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.j.e(r6, r0)
            java.lang.Object r0 = r5.f3791b
            g8.y r0 = (g8.y) r0
        L9:
            java.lang.Object r1 = r0.b()
            r2 = r1
            a1.l1 r2 = (a1.l1) r2
            boolean r3 = r2 instanceof a1.d1
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            a1.m1 r3 = a1.m1.f147b
            boolean r3 = kotlin.jvm.internal.j.a(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof a1.c
            if (r3 == 0) goto L2b
            int r3 = r6.f138a
            int r4 = r2.f138a
            if (r3 <= r4) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof a1.r0
            if (r3 == 0) goto L3e
        L2f:
            d4.l r3 = h8.f.f2244a
            if (r1 != 0) goto L34
            r1 = r3
        L34:
            if (r2 != 0) goto L37
            r2 = r3
        L37:
            boolean r1 = r0.e(r1, r2)
            if (r1 == 0) goto L9
            return
        L3e:
            a5.o r6 = new a5.o
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c.l(a1.l1):void");
    }

    public void onBillingServiceDisconnected() {
        ((f) this.f3791b).a();
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            final f fVar = (f) this.f3791b;
            BillingClient billingClient = fVar.f2321c;
            if (billingClient.isReady()) {
                fVar.T.clear();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList(fVar.R);
                arrayList3.addAll(fVar.S);
                arrayList3.add(fVar.f2337z);
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    String str = (String) obj;
                    if (fVar.S.contains(str)) {
                        arrayList2.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType("subs").build());
                    } else {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType("inapp").build());
                    }
                }
                final AtomicInteger atomicInteger = new AtomicInteger(2);
                if (arrayList.isEmpty()) {
                    atomicInteger.decrementAndGet();
                } else {
                    billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new ProductDetailsResponseListener() { // from class: i2.d
                        public final void onProductDetailsResponse(BillingResult billingResult2, QueryProductDetailsResult queryProductDetailsResult) {
                            switch (r3) {
                                case 0:
                                    int responseCode = billingResult2.getResponseCode();
                                    f fVar2 = fVar;
                                    if (responseCode == 0) {
                                        fVar2.T.addAll(queryProductDetailsResult.getProductDetailsList());
                                    }
                                    if (atomicInteger.decrementAndGet() == 0) {
                                        fVar2.e();
                                        return;
                                    }
                                    return;
                                default:
                                    int responseCode2 = billingResult2.getResponseCode();
                                    f fVar3 = fVar;
                                    if (responseCode2 == 0) {
                                        fVar3.T.addAll(queryProductDetailsResult.getProductDetailsList());
                                    }
                                    if (atomicInteger.decrementAndGet() == 0) {
                                        fVar3.e();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
                if (arrayList2.isEmpty()) {
                    atomicInteger.decrementAndGet();
                } else {
                    billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList2).build(), new ProductDetailsResponseListener() { // from class: i2.d
                        public final void onProductDetailsResponse(BillingResult billingResult2, QueryProductDetailsResult queryProductDetailsResult) {
                            switch (r3) {
                                case 0:
                                    int responseCode = billingResult2.getResponseCode();
                                    f fVar2 = fVar;
                                    if (responseCode == 0) {
                                        fVar2.T.addAll(queryProductDetailsResult.getProductDetailsList());
                                    }
                                    if (atomicInteger.decrementAndGet() == 0) {
                                        fVar2.e();
                                        return;
                                    }
                                    return;
                                default:
                                    int responseCode2 = billingResult2.getResponseCode();
                                    f fVar3 = fVar;
                                    if (responseCode2 == 0) {
                                        fVar3.T.addAll(queryProductDetailsResult.getProductDetailsList());
                                    }
                                    if (atomicInteger.decrementAndGet() == 0) {
                                        fVar3.e();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
        }
    }

    public Task then(Object obj) {
        switch (this.f3790a) {
            case 19:
                o5.c cVar = (o5.c) obj;
                n nVar = ((g5.l) this.f3791b).f1802e;
                if (cVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult((Object) null);
                }
                return Tasks.whenAll(new Task[]{n.a(nVar), nVar.f1817m.s(null, nVar.f1811e.f2217a)});
            default:
                o5.c cVar2 = (o5.c) obj;
                k2.c cVar3 = (k2.c) this.f3791b;
                if (cVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult((Object) null);
                }
                n nVar2 = (n) cVar3.f3364c;
                n.a((n) cVar3.f3364c);
                nVar2.f1817m.s(null, nVar2.f1811e.f2217a);
                nVar2.q.trySetResult((Object) null);
                return Tasks.forResult((Object) null);
        }
    }

    @Override // d4.c
    public Object zza() {
        return ((c4.f) this.f3791b).f911a;
    }

    public /* synthetic */ c(Object obj, int i) {
        this.f3790a = i;
        this.f3791b = obj;
    }

    public c(w6.m mVar, z zVar) {
        this.f3790a = 5;
        this.f3791b = zVar;
    }

    public c(int i) {
        this.f3790a = i;
        switch (i) {
            case 1:
                this.f3791b = new AtomicInteger(0);
                return;
            case 2:
            default:
                this.f3791b = new HashSet();
                return;
            case h.INTEGER_FIELD_NUMBER /* 3 */:
                this.f3791b = new y(m1.f147b);
                return;
        }
    }

    public c(boolean z9) {
        this.f3790a = 12;
        this.f3791b = new AtomicBoolean(z9);
    }

    public c(TextView textView) {
        this.f3790a = 26;
        this.f3791b = new g(textView);
    }

    public c(EditText editText) {
        this.f3790a = 25;
        this.f3791b = new k2.c(editText);
    }

    public c(p pVar) {
        this.f3790a = 21;
        this.f3791b = (n7.i) pVar;
    }

    public c(g5.l lVar, String str) {
        this.f3790a = 19;
        this.f3791b = lVar;
    }
}
