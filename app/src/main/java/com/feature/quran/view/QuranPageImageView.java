package com.ayah.feature.quran.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuranPageImageView extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable[] f13844s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranPageImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f13843r = context.getColor(R.color.quran_text);
        this.f13844s = new Drawable[0];
    }

    public final void a() {
        int width = getWidth();
        int i10 = (width * 174) / 1080;
        if (width > 0) {
            for (Drawable drawable : this.f13844s) {
                if (drawable != null) {
                    drawable.setBounds(0, 0, width, i10);
                }
                if (drawable != null) {
                    drawable.setTint(this.f13843r);
                }
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f13844s.length == 0) {
            return;
        }
        int height = getHeight();
        int width = getWidth();
        int i10 = (width * 174) / 1080;
        Drawable[] drawableArr = this.f13844s;
        int length = drawableArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Drawable drawable = drawableArr[i11];
            int i13 = i12 + 1;
            float fFloor = (float) Math.floor(((height - i10) / 14.0f) * i12);
            if (drawable != null) {
                drawable.setBounds(0, 0, width, i10);
                canvas.translate(0.0f, fFloor);
                drawable.draw(canvas);
                canvas.translate(0.0f, -fFloor);
            }
            i11++;
            i12 = i13;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a();
    }

    public final void setLineImages(Drawable[] drawableArr) {
        j.e(drawableArr, "images");
        this.f13844s = drawableArr;
        a();
    }
}
