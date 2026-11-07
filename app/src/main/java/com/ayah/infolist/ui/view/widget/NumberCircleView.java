package com.ayah.feature.infolist.ui.view.widget;

import P4.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class NumberCircleView extends AppCompatImageView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f13769u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberCircleView(Context context) {
        this(context, null, 6, 0);
        j.e(context, "context");
    }

    public final void setDrawableInfo(int i10, String str, boolean z10) {
        j.e(str, "overlayText");
        b bVar = this.f13769u;
        bVar.getClass();
        TextPaint textPaint = bVar.f6672b;
        Paint paint = bVar.f6671a;
        Paint paint2 = bVar.f6673c;
        Resources resources = bVar.f6674d;
        bVar.g = i10 / 4.0f;
        bVar.f6678i = str;
        bVar.f6679k = true;
        if (z10) {
            int i11 = i10 > 0 ? R.color.tint_with_alpha : R.color.tint;
            ThreadLocal threadLocal = p244z1.j.f24770a;
            paint2.setColor(resources.getColor(i11, null));
            paint.setColor(resources.getColor(R.color.tint, null));
            textPaint.setColor(resources.getColor(R.color.background, null));
        } else {
            ThreadLocal threadLocal2 = p244z1.j.f24770a;
            paint2.setColor(resources.getColor(R.color.tertiary_background, null));
            paint.setColor(resources.getColor(R.color.grouped_accessory, null));
            textPaint.setColor(resources.getColor(R.color.text, null));
        }
        bVar.invalidateSelf();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.e(context, "context");
    }

    public /* synthetic */ NumberCircleView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberCircleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        b bVar = new b(context);
        this.f13769u = bVar;
        setImageDrawable(bVar);
    }
}
