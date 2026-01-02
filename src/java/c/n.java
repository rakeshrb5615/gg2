package c;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import d0.a0;
import d0.y;
import d0.z;
import j5.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public abstract class n extends d0.g implements b1, androidx.lifecycle.j, b2.g, w, e.j, e0.d, e0.e, y, z, q0.l {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final h Companion = new Object();
    private a1 _viewModelStore;
    private final e.i activityResultRegistry;
    private int contentLayoutId;
    private final h7.d defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final h7.d fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final h7.d onBackPressedDispatcher$delegate;
    private final h7.d onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<p0.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<p0.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<p0.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<p0.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<p0.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final b2.f savedStateRegistryController;
    private final d.a contextAwareHelper = new d.a();
    private final q0.o menuHostHelper = new q0.o(new b(this, 0));

    public n() {
        c2.a aVar = new c2.a(this, new a8.j(this, 2));
        this.savedStateRegistryController = new b2.f(aVar);
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = a.a.F(new c(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = a.a.F(new c(this, 2));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new e(this, 0));
        getLifecycle().a(new e(this, 1));
        getLifecycle().a(new b2.b(this, 1));
        aVar.a();
        q0.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new f(this, 0));
        addOnContextAvailableListener(new d.b() { // from class: c.g
            @Override // d.b
            public final void a(n nVar) {
                n.f(n.this, nVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = a.a.F(new c(this, 3));
        this.onBackPressedDispatcher$delegate = a.a.F(new c(this, 4));
    }

    public static Bundle a(n nVar) {
        Bundle bundle = new Bundle();
        e.i iVar = nVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.f1286b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f1288d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f1291g));
        return bundle;
    }

    public static final void access$ensureViewModelStore(n nVar) {
        if (nVar._viewModelStore == null) {
            i iVar = (i) nVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                nVar._viewModelStore = iVar.f813b;
            }
            if (nVar._viewModelStore == null) {
                nVar._viewModelStore = new a1();
            }
        }
    }

    public static void b(v vVar, n nVar, androidx.lifecycle.u uVar, androidx.lifecycle.n nVar2) {
        if (nVar2 == androidx.lifecycle.n.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = nVar.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.j.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            vVar.b(onBackInvokedDispatcher);
        }
    }

    public static q c(n nVar) {
        return new q(nVar.reportFullyDrawnExecutor, new c(nVar, 0));
    }

    public static void d(n nVar, androidx.lifecycle.u uVar, androidx.lifecycle.n nVar2) {
        if (nVar2 == androidx.lifecycle.n.ON_DESTROY) {
            nVar.contextAwareHelper.f996b = null;
            if (!nVar.isChangingConfigurations()) {
                nVar.getViewModelStore().a();
            }
            k kVar = (k) nVar.reportFullyDrawnExecutor;
            n nVar3 = kVar.f817d;
            nVar3.getWindow().getDecorView().removeCallbacks(kVar);
            nVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
        }
    }

    public static void e(n nVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e9) {
            if (!kotlin.jvm.internal.j.a(e9.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e9;
            }
        } catch (NullPointerException e10) {
            if (!kotlin.jvm.internal.j.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }

    public static void f(n nVar, Context context) {
        kotlin.jvm.internal.j.e(context, "it");
        Bundle a10 = nVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            e.i iVar = nVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = iVar.f1286b;
            LinkedHashMap linkedHashMap2 = iVar.f1285a;
            Bundle bundle = iVar.f1291g;
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                iVar.f1288d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle.containsKey(str)) {
                        continue;
                    } else if ((linkedHashMap2 instanceof v7.a) && !(linkedHashMap2 instanceof v7.b)) {
                        kotlin.jvm.internal.u.e(linkedHashMap2, "kotlin.collections.MutableMap");
                        throw null;
                    } else {
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                kotlin.jvm.internal.j.d(num2, "get(...)");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                kotlin.jvm.internal.j.d(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                iVar.f1286b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // q0.l
    public void addMenuProvider(q0.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "provider");
        q0.o oVar = this.menuHostHelper;
        oVar.f5158b.add(pVar);
        oVar.f5157a.run();
    }

    @Override // e0.d
    public final void addOnConfigurationChangedListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(d.b bVar) {
        kotlin.jvm.internal.j.e(bVar, "listener");
        d.a aVar = this.contextAwareHelper;
        aVar.getClass();
        n nVar = aVar.f996b;
        if (nVar != null) {
            bVar.a(nVar);
        }
        aVar.f995a.add(bVar);
    }

    @Override // d0.y
    public final void addOnMultiWindowModeChangedListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    @Override // d0.z
    public final void addOnPictureInPictureModeChangedListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // e0.e
    public final void addOnTrimMemoryListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        kotlin.jvm.internal.j.e(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // e.j
    public final e.i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public o1.b getDefaultViewModelCreationExtras() {
        o1.c cVar = new o1.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f5000a;
        if (application != null) {
            linkedHashMap.put(w0.d, getApplication());
        }
        linkedHashMap.put(q0.a, this);
        linkedHashMap.put(q0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(q0.c, extras);
        }
        return cVar;
    }

    public x0 getDefaultViewModelProviderFactory() {
        return (x0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public q getFullyDrawnReporter() {
        return (q) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f812a;
        }
        return null;
    }

    @Override // d0.g
    public androidx.lifecycle.p getLifecycle() {
        return super.getLifecycle();
    }

    public s1.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().f842b;
    }

    @Override // c.w
    public final v getOnBackPressedDispatcher() {
        return (v) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // b2.g
    public final b2.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f708b;
    }

    public a1 getViewModelStore() {
        if (getApplication() != null) {
            if (this._viewModelStore == null) {
                i iVar = (i) getLastNonConfigurationInstance();
                if (iVar != null) {
                    this._viewModelStore = iVar.f813b;
                }
                if (this._viewModelStore == null) {
                    this._viewModelStore = new a1();
                }
            }
            a1 a1Var = this._viewModelStore;
            kotlin.jvm.internal.j.b(a1Var);
            return a1Var;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        decorView.setTag(2131362596, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView2, "getDecorView(...)");
        decorView2.setTag(2131362600, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView3, "getDecorView(...)");
        decorView3.setTag(2131362599, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView4, "getDecorView(...)");
        decorView4.setTag(2131362598, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView5, "getDecorView(...)");
        decorView5.setTag(2131362353, this);
        View decorView6 = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView6, "getDecorView(...)");
        decorView6.setTag(2131362597, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i9, Intent intent) {
        if (this.activityResultRegistry.a(i, i9, intent)) {
            return;
        }
        super.onActivityResult(i, i9, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((s1.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<p0.a> it = this.onConfigurationChangedListeners.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // d0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        d.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f996b = this;
        Iterator it = aVar.f995a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = m0.b;
        k0.b(this);
        int i9 = this.contentLayoutId;
        if (i9 != 0) {
            setContentView(i9);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            q0.o oVar = this.menuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = oVar.f5158b.iterator();
            while (it.hasNext()) {
                ((q0.p) it.next()).a.j(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        kotlin.jvm.internal.j.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<p0.a> it = this.onMultiWindowModeChangedListeners.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new d0.i(z9));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<p0.a> it = this.onNewIntentListeners.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        Iterator it = this.menuHostHelper.f5158b.iterator();
        while (it.hasNext()) {
            ((q0.p) it.next()).a.p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<p0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new a0(z9));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        kotlin.jvm.internal.j.e(menu, "menu");
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = this.menuHostHelper.f5158b.iterator();
            while (it.hasNext()) {
                ((q0.p) it.next()).a.s(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.j.e(strArr, "permissions");
        kotlin.jvm.internal.j.e(iArr, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, c.i] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        a1 a1Var = this._viewModelStore;
        if (a1Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            a1Var = iVar.f813b;
        }
        if (a1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f812a = onRetainCustomNonConfigurationInstance;
        obj.f813b = a1Var;
        return obj;
    }

    @Override // d0.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.e(bundle, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.w) {
            androidx.lifecycle.w lifecycle = getLifecycle();
            kotlin.jvm.internal.j.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            androidx.lifecycle.o oVar = androidx.lifecycle.o.a;
            lifecycle.g();
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<p0.a> it = this.onTrimMemoryListeners.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        kotlin.jvm.internal.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f996b;
    }

    public final <I, O> e.c registerForActivityResult(f.a aVar, e.i iVar, e.b bVar) {
        kotlin.jvm.internal.j.e(aVar, "contract");
        kotlin.jvm.internal.j.e(iVar, "registry");
        kotlin.jvm.internal.j.e(bVar, "callback");
        return iVar.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override // q0.l
    public void removeMenuProvider(q0.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "provider");
        this.menuHostHelper.b(pVar);
    }

    @Override // e0.d
    public final void removeOnConfigurationChangedListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(d.b bVar) {
        kotlin.jvm.internal.j.e(bVar, "listener");
        d.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f995a.remove(bVar);
    }

    @Override // d0.y
    public final void removeOnMultiWindowModeChangedListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    @Override // d0.z
    public final void removeOnPictureInPictureModeChangedListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // e0.e
    public final void removeOnTrimMemoryListener(p0.a aVar) {
        kotlin.jvm.internal.j.e(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        kotlin.jvm.internal.j.e(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (t1.I()) {
                t1.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            q fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f829a) {
                fullyDrawnReporter.f830b = true;
                ArrayList arrayList = fullyDrawnReporter.f831c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((u7.a) obj).invoke();
                }
                fullyDrawnReporter.f831c.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i9, int i10, int i11) {
        kotlin.jvm.internal.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i9, i10, i11);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.j.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        kotlin.jvm.internal.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i9, i10, i11, bundle);
    }

    public final <I, O> e.c registerForActivityResult(f.a aVar, e.b bVar) {
        kotlin.jvm.internal.j.e(aVar, "contract");
        kotlin.jvm.internal.j.e(bVar, "callback");
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9, Configuration configuration) {
        kotlin.jvm.internal.j.e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z9, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<p0.a> it = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.j.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new d0.i(z9));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        kotlin.jvm.internal.j.e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<p0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.j.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new a0(z9));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(q0.p pVar, androidx.lifecycle.u uVar) {
        kotlin.jvm.internal.j.e(pVar, "provider");
        kotlin.jvm.internal.j.e(uVar, "owner");
        q0.o oVar = this.menuHostHelper;
        oVar.f5158b.add(pVar);
        oVar.f5157a.run();
        androidx.lifecycle.p lifecycle = uVar.getLifecycle();
        HashMap hashMap = oVar.f5159c;
        q0.n nVar = (q0.n) hashMap.remove(pVar);
        if (nVar != null) {
            nVar.f5154a.b(nVar.f5155b);
            nVar.f5155b = null;
        }
        hashMap.put(pVar, new q0.n(lifecycle, new d(1, oVar, pVar)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final q0.p pVar, androidx.lifecycle.u uVar, final androidx.lifecycle.o oVar) {
        kotlin.jvm.internal.j.e(pVar, "provider");
        kotlin.jvm.internal.j.e(uVar, "owner");
        kotlin.jvm.internal.j.e(oVar, "state");
        final q0.o oVar2 = this.menuHostHelper;
        oVar2.getClass();
        androidx.lifecycle.p lifecycle = uVar.getLifecycle();
        HashMap hashMap = oVar2.f5159c;
        q0.n nVar = (q0.n) hashMap.remove(pVar);
        if (nVar != null) {
            nVar.f5154a.b(nVar.f5155b);
            nVar.f5155b = null;
        }
        hashMap.put(pVar, new q0.n(lifecycle, new androidx.lifecycle.s() { // from class: q0.m
            public final void c(androidx.lifecycle.u uVar2, androidx.lifecycle.n nVar2) {
                o oVar3 = o.this;
                oVar3.getClass();
                Runnable runnable = oVar3.f5157a;
                CopyOnWriteArrayList copyOnWriteArrayList = oVar3.f5158b;
                androidx.lifecycle.n.Companion.getClass();
                androidx.lifecycle.o oVar4 = oVar;
                int ordinal = oVar4.ordinal();
                androidx.lifecycle.n nVar3 = null;
                androidx.lifecycle.n nVar4 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : androidx.lifecycle.n.ON_RESUME : androidx.lifecycle.n.ON_START : androidx.lifecycle.n.ON_CREATE;
                p pVar2 = pVar;
                if (nVar2 == nVar4) {
                    copyOnWriteArrayList.add(pVar2);
                    runnable.run();
                    return;
                }
                androidx.lifecycle.n nVar5 = androidx.lifecycle.n.ON_DESTROY;
                if (nVar2 == nVar5) {
                    oVar3.b(pVar2);
                    return;
                }
                int ordinal2 = oVar4.ordinal();
                if (ordinal2 == 2) {
                    nVar3 = nVar5;
                } else if (ordinal2 == 3) {
                    nVar3 = androidx.lifecycle.n.ON_STOP;
                } else if (ordinal2 == 4) {
                    nVar3 = androidx.lifecycle.n.ON_PAUSE;
                }
                if (nVar2 == nVar3) {
                    copyOnWriteArrayList.remove(pVar2);
                    runnable.run();
                }
            }
        }));
    }
}
