package i2;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.chilllive.chillwallpaperproject.MainActivity;
import j5.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public final class f implements PurchasesUpdatedListener {
    public final Button A;
    public final Button B;
    public final Button C;
    public final Button D;
    public final Button E;
    public final Button F;
    public final Button G;
    public final Button H;
    public final Button I;
    public final Button J;
    public final Button K;
    public final Button L;
    public final TextView M;
    public final TextView N;
    public final Button O;
    public final String P;
    public final o0 Q;
    public final HashSet R;
    public final HashSet S;
    public final ArrayList T = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2319a;

    /* renamed from: b  reason: collision with root package name */
    public final MainActivity f2320b;

    /* renamed from: c  reason: collision with root package name */
    public final BillingClient f2321c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2322d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2323e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2324f;

    /* renamed from: m  reason: collision with root package name */
    public final String f2325m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2326n;

    /* renamed from: o  reason: collision with root package name */
    public final String f2327o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2328p;
    public final String q;

    /* renamed from: r  reason: collision with root package name */
    public final String f2329r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2330s;

    /* renamed from: t  reason: collision with root package name */
    public final String f2331t;

    /* renamed from: u  reason: collision with root package name */
    public final String f2332u;

    /* renamed from: v  reason: collision with root package name */
    public final String f2333v;

    /* renamed from: w  reason: collision with root package name */
    public final String f2334w;

    /* renamed from: x  reason: collision with root package name */
    public final String f2335x;

    /* renamed from: y  reason: collision with root package name */
    public final String f2336y;

    /* renamed from: z  reason: collision with root package name */
    public final String f2337z;

    public f(MainActivity mainActivity, Context context, View view) {
        this.f2319a = context;
        this.f2320b = mainActivity;
        String[] strArr = p0.f2471b;
        this.f2322d = strArr[9];
        this.f2323e = strArr[11];
        this.f2324f = strArr[8];
        this.f2325m = strArr[13];
        this.f2333v = strArr[12];
        this.f2334w = strArr[15];
        this.f2335x = strArr[16];
        this.f2327o = strArr[10];
        this.f2326n = strArr[2];
        this.f2331t = strArr[3];
        this.f2330s = strArr[4];
        this.f2332u = strArr[5];
        this.f2337z = strArr[0];
        this.f2328p = strArr[6];
        this.f2336y = strArr[14];
        this.q = strArr[7];
        this.f2329r = strArr[1];
        this.P = q4.b.l("knTS/S5tSa0GYkGFNXWAZw==");
        this.R = new HashSet(Arrays.asList(this.f2326n, this.f2327o, this.f2333v, this.f2334w, this.f2335x, this.f2328p, this.q, this.f2336y, this.f2329r, this.f2330s, this.f2331t, this.f2332u));
        this.S = new HashSet(Arrays.asList(this.f2322d, this.f2324f, this.f2325m, this.f2323e));
        this.D = (Button) view.findViewById(2131362575);
        this.E = (Button) view.findViewById(2131362576);
        this.A = (Button) view.findViewById(2131362577);
        this.B = (Button) view.findViewById(2131362581);
        this.F = (Button) view.findViewById(2131362586);
        this.C = (Button) view.findViewById(2131362582);
        TextView textView = (TextView) view.findViewById(2131362574);
        View findViewById = view.findViewById(2131362340);
        TextView textView2 = (TextView) findViewById.findViewById(2131362569);
        TextView textView3 = (TextView) findViewById.findViewById(2131362568);
        this.G = (Button) findViewById.findViewById(2131362579);
        this.H = (Button) findViewById.findViewById(2131362580);
        this.I = (Button) findViewById.findViewById(2131362578);
        this.K = (Button) view.findViewById(2131362575);
        this.L = (Button) view.findViewById(2131362577);
        this.N = (TextView) view.findViewById(2131362581);
        this.O = (Button) view.findViewById(2131362576);
        this.M = (TextView) view.findViewById(2131362571);
        this.J = (Button) view.findViewById(2131361992);
        this.Q = o0.c(context);
        t1.z(context).edit().putFloat(q4.b.l("fUhJXBGcb7Xlhnci2/ThGQ=="), (float) Double.longBitsToDouble(4614256656552045848L)).apply();
        this.f2321c = BillingClient.newBuilder(context).setListener(this).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
        a();
    }

    public final void a() {
        BillingClient billingClient = this.f2321c;
        if (billingClient.isReady()) {
            return;
        }
        billingClient.startConnection(new l6.c(this, 27));
    }

    public final String b(String str) {
        SharedPreferences z9 = t1.z(this.f2319a);
        return z9.getString(this.P + str, null);
    }

    public final void c(Purchase purchase) {
        if (purchase.getPurchaseState() != 1) {
            purchase.getPurchaseState();
            return;
        }
        boolean isAcknowledged = purchase.isAcknowledged();
        BillingClient billingClient = this.f2321c;
        if (!isAcknowledged) {
            billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new b(this, 0));
        }
        for (String str : purchase.getProducts()) {
            if (str.equals(this.f2337z)) {
                billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new a5.t(18));
                return;
            }
        }
    }

    public final void d(String str, String str2) {
        ProductDetails productDetails;
        String str3;
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                productDetails = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            productDetails = (ProductDetails) obj;
            if (productDetails.getProductId().equals(str)) {
                break;
            }
        }
        if (productDetails != null) {
            BillingClient billingClient = this.f2321c;
            if (billingClient.isReady()) {
                BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
                boolean contains = this.S.contains(productDetails.getProductId());
                androidx.fragment.app.j0 j0Var = this.f2320b;
                if (contains) {
                    List subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                    if (subscriptionOfferDetails == null || subscriptionOfferDetails.isEmpty()) {
                        return;
                    }
                    Iterator it = subscriptionOfferDetails.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str3 = "";
                            break;
                        }
                        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) it.next();
                        if (subscriptionOfferDetails2.getOfferTags().isEmpty()) {
                            str3 = subscriptionOfferDetails2.getOfferToken();
                            break;
                        }
                    }
                    if (str3.isEmpty()) {
                        return;
                    }
                    productDetails2.setOfferToken(str3);
                    if (str2 != null && !str2.isEmpty()) {
                        billingClient.launchBillingFlow(j0Var, BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(productDetails2.build())).setSubscriptionUpdateParams(BillingFlowParams.SubscriptionUpdateParams.newBuilder().setOldPurchaseToken(str2).setSubscriptionReplacementMode(2).build()).build());
                        return;
                    }
                }
                billingClient.launchBillingFlow(j0Var, BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(productDetails2.build())).build());
            }
        }
    }

    public final void e() {
        String str;
        long j;
        String str2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList = this.T;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ProductDetails productDetails = (ProductDetails) obj;
            String productId = productDetails.getProductId();
            if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                str = oneTimePurchaseOfferDetails.getFormattedPrice();
                j = oneTimePurchaseOfferDetails.getPriceAmountMicros();
                str2 = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
            } else if (productDetails.getSubscriptionOfferDetails() == null || productDetails.getSubscriptionOfferDetails().isEmpty()) {
                str = "";
                j = 0;
                str2 = "";
            } else {
                ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) ((ProductDetails.SubscriptionOfferDetails) productDetails.getSubscriptionOfferDetails().get(0)).getPricingPhases().getPricingPhaseList().get(0);
                str = pricingPhase.getFormattedPrice();
                j = pricingPhase.getPriceAmountMicros();
                str2 = pricingPhase.getPriceCurrencyCode();
            }
            hashMap.put(productId, str);
            hashMap2.put(productId, Long.valueOf(j));
            hashMap3.put(productId, str2);
        }
        this.f2320b.runOnUiThread(new e(this, hashMap2, hashMap3, hashMap, 0));
        f();
        g();
    }

    public final void f() {
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o0 o0Var = this.Q;
            if (str.equals(o0Var.f2461l)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2465p)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.i)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.j)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2457f)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2458g)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2459h)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2460k)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2452a)) {
                o0Var.g(o0Var.f(str), true);
            }
            if (str.equals(o0Var.f2453b)) {
                o0Var.g(o0Var.f(str), false);
            }
            if (str.equals(o0Var.f2454c)) {
                o0Var.g(o0Var.f(str), false);
            }
            if (str.equals(o0Var.f2455d)) {
                o0Var.g(o0Var.f(str), false);
            }
        }
        this.f2321c.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new b(this, 1));
    }

    public final void g() {
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o0 o0Var = this.Q;
            if (str.equals(o0Var.f2462m)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2463n)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2456e)) {
                o0Var.g(o0Var.e(str), false);
            }
            if (str.equals(o0Var.f2464o)) {
                o0Var.g(o0Var.e(str), false);
            }
        }
        this.f2321c.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("subs").build(), new b(this, 2));
    }

    public final void h(Purchase purchase, String str) {
        String purchaseToken = purchase.getPurchaseToken();
        SharedPreferences.Editor edit = t1.z(this.f2319a).edit();
        edit.putString(this.P + str, purchaseToken).apply();
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (billingResult.getResponseCode() != 0 || list == null) {
            billingResult.getResponseCode();
            return;
        }
        for (Purchase purchase : list) {
            String str = (String) purchase.getProducts().get(0);
            String purchaseToken = purchase.getPurchaseToken();
            if (str.equals(this.f2322d)) {
                SharedPreferences.Editor edit = t1.z(this.f2319a).edit();
                edit.putString(this.P + str, purchaseToken).apply();
            }
            c(purchase);
        }
    }
}
