package com.ayah.ui.widget;

import A1.c;
import I1.B0;
import I1.m0;
import I1.o0;
import I1.p0;
import I1.q0;
import I1.r0;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SelectiveEatingFrameLayout extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectiveEatingFrameLayout(Context context) {
        this(context, null, 0, 14);
        j.e(context, "context");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        r0 o0Var;
        j.e(windowInsets, "insets");
        B0 b0H = B0.h(null, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            o0Var = new q0(b0H);
        } else if (i10 >= 30) {
            o0Var = new p0(b0H);
        } else {
            o0Var = i10 >= 29 ? new o0(b0H) : new m0(b0H);
        }
        o0Var.c(3, c.f461e);
        WindowInsets windowInsetsG = o0Var.b().g();
        return windowInsetsG == null ? windowInsets : windowInsetsG;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectiveEatingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        j.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectiveEatingFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        j.e(context, "context");
    }

    public SelectiveEatingFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, 0);
    }
}
