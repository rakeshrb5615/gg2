package i2;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public class m implements i5.j, j2.i {

    /* renamed from: c  reason: collision with root package name */
    public static m f2411c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2412a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2413b;

    public /* synthetic */ m(Object obj) {
        this.f2413b = obj;
        this.f2412a = true;
    }

    public static synchronized m d() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f2411c == null) {
                    f2411c = new m();
                }
                mVar = f2411c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // j2.i
    public void a() {
        l2.a0 a0Var = (l2.a0) this.f2413b;
        if (a0Var.isAdded()) {
            String string = this.f2412a ? a0Var.getString(2131952494) : a0Var.getString(2131951966);
            androidx.fragment.app.j0 j0Var = a0Var.Y1;
            if (j0Var == null || a0Var.f3540a == null) {
                return;
            }
            j0Var.runOnUiThread(new l2.y(this, string, 1));
        }
    }

    @Override // i5.j
    public void b(i5.i iVar, int i) {
        StringBuilder sb = (StringBuilder) this.f2413b;
        if (this.f2412a) {
            this.f2412a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public boolean c() {
        return this.f2412a;
    }

    public float e(String str) {
        Float f9 = (Float) ((HashMap) this.f2413b).get(str);
        if (f9 == null) {
            return 0.0f;
        }
        return f9.floatValue();
    }

    public void f(Context context) {
        if (this.f2412a) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("element_map.json")));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        bufferedReader.close();
        try {
            JSONArray jSONArray = new JSONObject(sb.toString()).getJSONArray("layers");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ((HashMap) this.f2413b).put(jSONObject.getString("name"), Float.valueOf((float) jSONObject.getDouble("z")));
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        this.f2412a = true;
    }

    public boolean g(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        o0.e eVar = (o0.e) this.f2413b;
        if (eVar == null) {
            return c();
        }
        eVar.getClass();
        boolean z9 = true;
        for (int i9 = 0; i9 < i && z9; i9++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i9));
            m mVar = o0.f.f4995a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            z9 = true;
                            break;
                    }
                }
                z9 = false;
            }
            z9 = true;
        }
        if (z9) {
            if (!z9) {
                return c();
            }
            return false;
        }
        return true;
    }

    @Override // j2.i
    public void h(String str) {
        androidx.fragment.app.j0 j0Var;
        l2.a0 a0Var = (l2.a0) this.f2413b;
        if (!a0Var.isAdded() || (j0Var = a0Var.Y1) == null || a0Var.f3540a == null) {
            return;
        }
        j0Var.runOnUiThread(new l2.y(this, str, 0));
    }

    public void i() {
        this.f2412a = false;
    }

    public void j(char c9) {
        h.f fVar = (h.f) this.f2413b;
        fVar.c(fVar.f2040b, 1);
        int i = fVar.f2040b;
        fVar.f2040b = i + 1;
        ((char[]) fVar.f2041c)[i] = c9;
    }

    public void k() {
    }

    public void l() {
    }

    public /* synthetic */ m(Object obj, boolean z9) {
        this.f2413b = obj;
        this.f2412a = z9;
    }

    public m() {
        this.f2413b = new HashMap();
        this.f2412a = false;
    }

    public m(o0.e eVar, boolean z9) {
        this.f2413b = eVar;
        this.f2412a = z9;
    }
}
