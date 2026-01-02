package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/3.dex */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f5172a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f5173b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5174c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5175d = {2131361811, 2131361812, 2131361823, 2131361834, 2131361837, 2131361838, 2131361839, 2131361840, 2131361841, 2131361842, 2131361813, 2131361814, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361824, 2131361825, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833, 2131361835, 2131361836};

    /* renamed from: e  reason: collision with root package name */
    public static final d0 f5176e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final f0 f5177f = new f0();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        kotlin.jvm.internal.j.e(view2, "<this>");
        view2.setTag(2131362595, viewGroup);
    }

    public static t0 b(View view) {
        if (f5172a == null) {
            f5172a = new WeakHashMap();
        }
        t0 t0Var = (t0) f5172a.get(view);
        if (t0Var == null) {
            t0 t0Var2 = new t0(view);
            f5172a.put(view, t0Var2);
            return t0Var2;
        }
        return t0Var;
    }

    public static void c(View view, s1 s1Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets f9 = s1Var.f();
        if (f9 != null) {
            WindowInsets a10 = i >= 30 ? n0.a(view, f9) : g0.a(view, f9);
            if (a10.equals(f9)) {
                return;
            }
            s1.g(view, a10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [q0.p0, java.lang.Object] */
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = p0.f5161d;
        p0 p0Var = (p0) view.getTag(2131362487);
        p0 p0Var2 = p0Var;
        if (p0Var == null) {
            ?? obj = new Object();
            obj.f5162a = null;
            obj.f5163b = null;
            obj.f5164c = null;
            view.setTag(2131362487, obj);
            p0Var2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = p0Var2.f5162a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = p0.f5161d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (p0Var2.f5162a == null) {
                            p0Var2.f5162a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = p0.f5161d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                p0Var2.f5162a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    p0Var2.f5162a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a10 = p0Var2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (p0Var2.f5163b == null) {
                    p0Var2.f5163b = new SparseArray();
                }
                p0Var2.f5163b.put(keyCode, new WeakReference(a10));
            }
        }
        return a10 != null;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m0.a(view);
        }
        if (f5174c) {
            return null;
        }
        if (f5173b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5173b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5174c = true;
                return null;
            }
        }
        try {
            Object obj = f5173b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5174c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = l0.a(view);
        } else {
            tag = view.getTag(2131362478);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131362475);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(2131362475, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] h(n.w wVar) {
        return Build.VERSION.SDK_INT >= 31 ? o0.a(wVar) : (String[]) wVar.getTag(2131362482);
    }

    public static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z9 = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z9) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z9 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z9) {
                    obtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                    } catch (AbstractMethodError e9) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e9);
                    }
                }
            } else {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(f(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            }
        }
    }

    public static g j(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o0.b(view, gVar);
        }
        t0.i iVar = (t0.i) view.getTag(2131362481);
        u uVar = f5176e;
        if (iVar == null) {
            if (view instanceof u) {
                uVar = (u) view;
            }
            return uVar.a(gVar);
        }
        g a10 = t0.i.a(view, gVar);
        if (a10 == null) {
            return null;
        }
        if (view instanceof u) {
            uVar = (u) view;
        }
        return uVar.a(a10);
    }

    public static void k(View view, int i) {
        ArrayList g3 = g(view);
        for (int i9 = 0; i9 < g3.size(); i9++) {
            if (((r0.b) g3.get(i9)).a() == i) {
                g3.remove(i9);
                return;
            }
        }
    }

    public static void l(View view, r0.b bVar, r0.l lVar) {
        r0.b bVar2 = new r0.b(null, bVar.f5488b, null, lVar, bVar.f5489c);
        View.AccessibilityDelegate e9 = e(view);
        b bVar3 = e9 == null ? null : e9 instanceof a ? ((a) e9).f5091a : new b(e9);
        if (bVar3 == null) {
            bVar3 = new b();
        }
        n(view, bVar3);
        k(view, bVar2.a());
        g(view).add(bVar2);
        i(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            m0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void n(View view, b bVar) {
        if (bVar == null && (e(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f5095b);
    }

    public static void o(View view, CharSequence charSequence) {
        new e0(2131362478, CharSequence.class, 8, 28, 1).g(view, charSequence);
        f0 f0Var = f5177f;
        if (charSequence == null) {
            f0Var.f5122a.remove(view);
            view.removeOnAttachStateChangeListener(f0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(f0Var);
            return;
        }
        f0Var.f5122a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(f0Var);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(f0Var);
        }
    }
}
