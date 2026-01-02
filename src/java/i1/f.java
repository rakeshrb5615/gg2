package i1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/1.dex */
public final class f extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final TextView f2266b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2267c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2268d = true;

    public f(TextView textView) {
        this.f2266b = textView;
        this.f2267c = new d(textView);
    }

    @Override // a.a
    public final boolean B() {
        return this.f2268d;
    }

    @Override // a.a
    public final void O(boolean z9) {
        if (z9) {
            TextView textView = this.f2266b;
            textView.setTransformationMethod(W(textView.getTransformationMethod()));
        }
    }

    @Override // a.a
    public final void R(boolean z9) {
        this.f2268d = z9;
        TextView textView = this.f2266b;
        textView.setTransformationMethod(W(textView.getTransformationMethod()));
        textView.setFilters(x(textView.getFilters()));
    }

    @Override // a.a
    public final TransformationMethod W(TransformationMethod transformationMethod) {
        return this.f2268d ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f2274a : transformationMethod;
    }

    @Override // a.a
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        if (!this.f2268d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (sparseArray.indexOfKey(i10) < 0) {
                    inputFilterArr2[i9] = inputFilterArr[i10];
                    i9++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i11 = 0;
        while (true) {
            d dVar = this.f2267c;
            if (i11 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            } else if (inputFilterArr[i11] == dVar) {
                return inputFilterArr;
            } else {
                i11++;
            }
        }
    }
}
