package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f7086a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7087b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7088c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7089d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7090e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f7086a = Float.NaN;
        this.f7087b = Float.NaN;
        this.f7088c = Float.NaN;
        this.f7089d = Float.NaN;
        this.f7090e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f7090e);
                this.f7090e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f7089d = obtainStyledAttributes.getDimension(index, this.f7089d);
            } else if (index == 2) {
                this.f7087b = obtainStyledAttributes.getDimension(index, this.f7087b);
            } else if (index == 3) {
                this.f7088c = obtainStyledAttributes.getDimension(index, this.f7088c);
            } else if (index == 4) {
                this.f7086a = obtainStyledAttributes.getDimension(index, this.f7086a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
