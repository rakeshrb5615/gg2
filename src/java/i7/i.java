package i7;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class i extends l {
    public static void Y(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static boolean Z(Iterable iterable, Object obj) {
        int i;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i9 < 0) {
                    a.a.V();
                    throw null;
                } else if (kotlin.jvm.internal.j.a(obj, next)) {
                    i = i9;
                    break;
                } else {
                    i9++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static final void a0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, u7.l lVar) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            c4.b.d(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void b0(ArrayList arrayList, StringBuilder sb) {
        a0(arrayList, sb, "\n", "", "", "...", null);
    }

    public static String c0(Iterable iterable, String str, String str2, String str3, u7.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.j.e(iterable, "<this>");
        kotlin.jvm.internal.j.e(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        a0(iterable, sb, str4, str5, str6, "...", lVar);
        return sb.toString();
    }

    public static Object d0(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(a.a.y(list));
    }

    public static ArrayList e0(Collection collection, List list) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List f0(int i, List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        if (i >= 0) {
            n nVar = n.f2745a;
            if (i == 0) {
                return nVar;
            }
            if (i >= list.size()) {
                return j0(list);
            }
            if (i == 1) {
                if (list.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                return a.a.G(list.get(0));
            }
            ArrayList arrayList = new ArrayList(i);
            int i9 = 0;
            for (Object obj : list) {
                arrayList.add(obj);
                i9++;
                if (i9 == i) {
                    break;
                }
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : a.a.G(arrayList.get(0)) : nVar;
        }
        throw new IllegalArgumentException(v1.a.j("Requested element count ", i, " is less than zero.").toString());
    }

    public static byte[] g0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void h0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] i0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List j0(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z9 = iterable instanceof Collection;
        n nVar = n.f2745a;
        if (!z9) {
            List m02 = m0(iterable);
            ArrayList arrayList = (ArrayList) m02;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? m02 : a.a.G(arrayList.get(0)) : nVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return l0(collection);
            }
            return a.a.G(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return nVar;
    }

    public static long[] k0(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList l0(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List m0(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return l0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h0(iterable, arrayList);
        return arrayList;
    }

    public static Set n0(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(r.l0(collection.size()));
                    h0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                kotlin.jvm.internal.j.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            h0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.j.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return p.f2747a;
    }
}
