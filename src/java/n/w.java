package n;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.chilllive.chillwallpaperproject/dex-files/0.dex */
public class w extends EditText implements q0.u {

    /* renamed from: a  reason: collision with root package name */
    public final p f4319a;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f4320b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f4321c;

    /* renamed from: d  reason: collision with root package name */
    public final t0.i f4322d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f4323e;

    /* renamed from: f  reason: collision with root package name */
    public v f4324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [t0.i, java.lang.Object] */
    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969050);
        u2.a(context);
        t2.a(this, getContext());
        p pVar = new p(this);
        this.f4319a = pVar;
        pVar.q(attributeSet, 2130969050);
        x0 x0Var = new x0(this);
        this.f4320b = x0Var;
        x0Var.f(attributeSet, 2130969050);
        x0Var.b();
        c0 c0Var = new c0();
        c0Var.f4101b = this;
        this.f4321c = c0Var;
        this.f4322d = new Object();
        c0 c0Var2 = new c0(this);
        this.f4323e = c0Var2;
        c0Var2.b(attributeSet, 2130969050);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a10 = c0Var2.a(keyListener);
        if (a10 == keyListener) {
            return;
        }
        super.setKeyListener(a10);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private v getSuperCaller() {
        if (this.f4324f == null) {
            this.f4324f = new v(this);
        }
        return this.f4324f;
    }

    @Override // q0.u
    public final q0.g a(q0.g gVar) {
        this.f4322d.getClass();
        return t0.i.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f4319a;
        if (pVar != null) {
            pVar.a();
        }
        x0 x0Var = this.f4320b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f4319a;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f4319a;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4320b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4320b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f4321c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f4102c;
        return textClassifier == null ? s0.a((TextView) c0Var.f4101b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] h9;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4320b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        a.a.M(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (h9 = q0.q0.h(this)) != null) {
            editorInfo.contentMimeTypes = h9;
            onCreateInputConnection = new s0.a(onCreateInputConnection, new a5.a(this, 17));
        }
        return this.f4323e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z9 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && q0.q0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z9 = f0.a(dragEvent, this, activity);
            }
        }
        if (z9) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        q0.d dVar;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 || q0.q0.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i9 >= 31) {
                dVar = new q0.c(primaryClip, 1);
            } else {
                q0.e eVar = new q0.e();
                eVar.f5116b = primaryClip;
                eVar.f5117c = 1;
                dVar = eVar;
            }
            dVar.f(i == 16908322 ? 0 : 1);
            q0.q0.j(this, dVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f4319a;
        if (pVar != null) {
            pVar.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        p pVar = this.f4319a;
        if (pVar != null) {
            pVar.s(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4320b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f4320b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c4.b.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f4323e.d(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4323e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f4319a;
        if (pVar != null) {
            pVar.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f4319a;
        if (pVar != null) {
            pVar.v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f4320b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f4320b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x0 x0Var = this.f4320b;
        if (x0Var != null) {
            x0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f4321c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f4102c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
