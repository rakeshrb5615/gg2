package i2;

import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final /* synthetic */ class b implements AcknowledgePurchaseResponseListener, PurchasesResponseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f2301b;

    public /* synthetic */ b(f fVar, int i) {
        this.f2300a = i;
        this.f2301b = fVar;
    }

    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        f fVar = this.f2301b;
        fVar.getClass();
        if (billingResult.getResponseCode() == 0) {
            fVar.f();
            fVar.g();
        }
    }

    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        switch (this.f2300a) {
            case 1:
                f fVar = this.f2301b;
                o0 o0Var = fVar.Q;
                if (billingResult.getResponseCode() == 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Purchase purchase = (Purchase) it.next();
                        if (purchase.getPurchaseState() == 1) {
                            for (String str : purchase.getProducts()) {
                                if (fVar.R.contains(str)) {
                                    if (str.equals(o0Var.f2461l)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.f2465p)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.i)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.j)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.f2457f)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.f2458g)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.f2459h)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.f2460k)) {
                                        o0Var.g(o0Var.e(str), true);
                                    }
                                    if (str.equals(o0Var.f2452a)) {
                                        o0Var.g(o0Var.f(str), true);
                                    }
                                    if (str.equals(o0Var.f2453b)) {
                                        o0Var.g(o0Var.f(str), true);
                                    }
                                    if (str.equals(o0Var.f2454c)) {
                                        o0Var.g(o0Var.f(str), true);
                                    }
                                    if (str.equals(o0Var.f2455d)) {
                                        o0Var.g(o0Var.f(str), true);
                                    }
                                    if (!fVar.f2326n.equals(str) && !fVar.f2327o.equals(str) && !fVar.f2322d.equals(str) && !fVar.f2323e.equals(str) && !fVar.f2333v.equals(str) && !fVar.f2325m.equals(str)) {
                                        fVar.f2334w.equals(str);
                                    }
                                }
                            }
                            if (!purchase.isAcknowledged()) {
                                fVar.c(purchase);
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                if (billingResult.getResponseCode() == 0) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Purchase purchase2 = (Purchase) it2.next();
                        if (purchase2.getPurchaseState() == 1) {
                            Iterator it3 = purchase2.getProducts().iterator();
                            while (true) {
                                boolean hasNext = it3.hasNext();
                                f fVar2 = this.f2301b;
                                if (hasNext) {
                                    String str2 = (String) it3.next();
                                    if (fVar2.S.contains(str2)) {
                                        o0 o0Var2 = fVar2.Q;
                                        if (str2.equals(o0Var2.f2462m)) {
                                            o0Var2.g(o0Var2.e(str2), true);
                                        }
                                        if (str2.equals(o0Var2.f2463n)) {
                                            o0Var2.g(o0Var2.e(str2), true);
                                        }
                                        if (str2.equals(o0Var2.f2456e)) {
                                            o0Var2.g(o0Var2.e(str2), true);
                                        }
                                        if (str2.equals(o0Var2.f2464o)) {
                                            o0Var2.g(o0Var2.e(str2), true);
                                        }
                                        if (str2.equals(fVar2.f2322d)) {
                                            fVar2.h(purchase2, fVar2.f2322d);
                                        }
                                        if (str2.equals(fVar2.f2323e)) {
                                            fVar2.h(purchase2, fVar2.f2323e);
                                        }
                                        if (str2.equals(fVar2.f2324f)) {
                                            fVar2.h(purchase2, fVar2.f2324f);
                                        }
                                    }
                                } else if (!purchase2.isAcknowledged()) {
                                    fVar2.c(purchase2);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
