package i2;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.slider.Slider;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/2.dex */
public abstract class y {
    static {
        new HashMap();
    }

    public static void a(Slider slider, MotionEvent motionEvent, float f9, int i) {
        if (motionEvent != null) {
            int width = (slider.getWidth() - slider.getPaddingLeft()) - slider.getPaddingRight();
            f9 = width <= 0 ? slider.getValue() : (Math.min(Math.max((motionEvent.getX() - slider.getPaddingLeft()) / width, 0.0f), 1.0f) * (slider.getValueTo() - slider.getValueFrom())) + slider.getValueFrom();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(slider.getValue(), f9);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new j(slider, 1));
        ofFloat.start();
    }

    public static void b(View view) {
        view.postDelayed(new r(view, view.getId() == 2131362369 ? 0.95f : 0.9f, 0), 0L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i2.w, java.lang.Object] */
    public static void c(final Slider slider) {
        final ?? obj = new Object();
        obj.f2615a = false;
        obj.f2616b = 0.0f;
        final int scaledTouchSlop = ViewConfiguration.get(slider.getContext()).getScaledTouchSlop();
        slider.setOnTouchListener(new View.OnTouchListener() { // from class: i2.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                w wVar = w.this;
                if (action == 0) {
                    wVar.f2616b = motionEvent.getX();
                    wVar.f2615a = false;
                    return true;
                }
                Slider slider2 = slider;
                if (action == 1) {
                    if (wVar.f2615a) {
                        return slider2.onTouchEvent(motionEvent);
                    }
                    y.a(slider2, motionEvent, 0.0f, 300);
                    return true;
                } else if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                    wVar.f2615a = false;
                    return true;
                } else {
                    if (!wVar.f2615a && Math.abs(motionEvent.getX() - wVar.f2616b) > scaledTouchSlop) {
                        wVar.f2615a = true;
                    }
                    if (wVar.f2615a) {
                        return slider2.onTouchEvent(motionEvent);
                    }
                    return true;
                }
            }
        });
    }

    public static void d(View view) {
        if (view != null && view.getVisibility() == 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(view.getHeight(), 0);
            ofInt.addUpdateListener(new s(view, 0));
            long j = 250;
            ofInt.setDuration(j);
            ofInt.addListener(new x(view, 1));
            ofInt.start();
            view.animate().alpha(0.0f).setDuration(j).start();
        }
    }

    public static void e(final View view) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) view.getParent()).getWidth(), Integer.MIN_VALUE), 0);
        final int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 0;
        view.requestLayout();
        view.setTranslationY(measuredHeight);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i2.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                View view2 = view;
                view2.getLayoutParams().height = intValue;
                view2.requestLayout();
                view2.setTranslationY(measuredHeight - intValue);
            }
        });
        long j = 400;
        ofInt.setDuration(j);
        ofInt.start();
        view.animate().alpha(1.0f).setDuration(j).start();
    }

    public static void f(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(400).start();
    }

    public static void g(View view, int i) {
        view.animate().alpha(0.0f).setDuration(i).withEndAction(new v(view, 1)).start();
    }

    public static void h(View view, int i, int i9) {
        if (view.getVisibility() == 0) {
            view.animate().alpha(0.0f).setDuration(i).withEndAction(new g0.k(view, i9, 1)).start();
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(i).start();
    }

    public static void i(View view, int i) {
        if (view.getVisibility() == 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(view.getHeight(), 0);
            ofInt.addUpdateListener(new s(view, 1));
            long j = i;
            ofInt.setDuration(j);
            ofInt.addListener(new x(view, 0));
            ofInt.start();
            view.animate().alpha(0.0f).setDuration(j).start();
            return;
        }
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) view.getParent()).getWidth(), Integer.MIN_VALUE), 0);
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 0;
        view.requestLayout();
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, measuredHeight);
        ofInt2.addUpdateListener(new s(view, 2));
        long j8 = i;
        ofInt2.setDuration(j8);
        ofInt2.start();
        view.animate().alpha(1.0f).setDuration(j8).start();
    }
}
