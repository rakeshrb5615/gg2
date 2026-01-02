package g2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f1719a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1720b;

    /* renamed from: c  reason: collision with root package name */
    public float f1721c;

    /* renamed from: d  reason: collision with root package name */
    public float f1722d;

    /* renamed from: e  reason: collision with root package name */
    public float f1723e;

    /* renamed from: f  reason: collision with root package name */
    public float f1724f;

    /* renamed from: g  reason: collision with root package name */
    public float f1725g;

    /* renamed from: h  reason: collision with root package name */
    public float f1726h;
    public float i;
    public final Matrix j;

    /* renamed from: k  reason: collision with root package name */
    public String f1727k;

    public k() {
        this.f1719a = new Matrix();
        this.f1720b = new ArrayList();
        this.f1721c = 0.0f;
        this.f1722d = 0.0f;
        this.f1723e = 0.0f;
        this.f1724f = 1.0f;
        this.f1725g = 1.0f;
        this.f1726h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.f1727k = null;
    }

    @Override // g2.l
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1720b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // g2.l
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f1720b;
            if (i >= arrayList.size()) {
                return z9;
            }
            z9 |= ((l) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f1722d, -this.f1723e);
        matrix.postScale(this.f1724f, this.f1725g);
        matrix.postRotate(this.f1721c, 0.0f, 0.0f);
        matrix.postTranslate(this.f1726h + this.f1722d, this.i + this.f1723e);
    }

    public String getGroupName() {
        return this.f1727k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f1722d;
    }

    public float getPivotY() {
        return this.f1723e;
    }

    public float getRotation() {
        return this.f1721c;
    }

    public float getScaleX() {
        return this.f1724f;
    }

    public float getScaleY() {
        return this.f1725g;
    }

    public float getTranslateX() {
        return this.f1726h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f9) {
        if (f9 != this.f1722d) {
            this.f1722d = f9;
            c();
        }
    }

    public void setPivotY(float f9) {
        if (f9 != this.f1723e) {
            this.f1723e = f9;
            c();
        }
    }

    public void setRotation(float f9) {
        if (f9 != this.f1721c) {
            this.f1721c = f9;
            c();
        }
    }

    public void setScaleX(float f9) {
        if (f9 != this.f1724f) {
            this.f1724f = f9;
            c();
        }
    }

    public void setScaleY(float f9) {
        if (f9 != this.f1725g) {
            this.f1725g = f9;
            c();
        }
    }

    public void setTranslateX(float f9) {
        if (f9 != this.f1726h) {
            this.f1726h = f9;
            c();
        }
    }

    public void setTranslateY(float f9) {
        if (f9 != this.i) {
            this.i = f9;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [g2.m, g2.j] */
    public k(k kVar, r.e eVar) {
        m mVar;
        this.f1719a = new Matrix();
        this.f1720b = new ArrayList();
        this.f1721c = 0.0f;
        this.f1722d = 0.0f;
        this.f1723e = 0.0f;
        this.f1724f = 1.0f;
        this.f1725g = 1.0f;
        this.f1726h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f1727k = null;
        this.f1721c = kVar.f1721c;
        this.f1722d = kVar.f1722d;
        this.f1723e = kVar.f1723e;
        this.f1724f = kVar.f1724f;
        this.f1725g = kVar.f1725g;
        this.f1726h = kVar.f1726h;
        this.i = kVar.i;
        String str = kVar.f1727k;
        this.f1727k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(kVar.j);
        ArrayList arrayList = kVar.f1720b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof k) {
                this.f1720b.add(new k((k) obj, eVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    ?? mVar2 = new m(jVar);
                    mVar2.f1711e = 0.0f;
                    mVar2.f1713g = 1.0f;
                    mVar2.f1714h = 1.0f;
                    mVar2.i = 0.0f;
                    mVar2.j = 1.0f;
                    mVar2.f1715k = 0.0f;
                    mVar2.f1716l = Paint.Cap.BUTT;
                    mVar2.f1717m = Paint.Join.MITER;
                    mVar2.f1718n = 4.0f;
                    mVar2.f1710d = jVar.f1710d;
                    mVar2.f1711e = jVar.f1711e;
                    mVar2.f1713g = jVar.f1713g;
                    mVar2.f1712f = jVar.f1712f;
                    mVar2.f1730c = jVar.f1730c;
                    mVar2.f1714h = jVar.f1714h;
                    mVar2.i = jVar.i;
                    mVar2.j = jVar.j;
                    mVar2.f1715k = jVar.f1715k;
                    mVar2.f1716l = jVar.f1716l;
                    mVar2.f1717m = jVar.f1717m;
                    mVar2.f1718n = jVar.f1718n;
                    mVar = mVar2;
                } else if (obj instanceof i) {
                    mVar = new m((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f1720b.add(mVar);
                Object obj2 = mVar.f1729b;
                if (obj2 != null) {
                    eVar.put(obj2, mVar);
                }
            }
        }
    }
}
