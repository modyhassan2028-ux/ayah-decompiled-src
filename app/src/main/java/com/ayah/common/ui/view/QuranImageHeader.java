package com.ayah.common.ui.view;

import H9.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuranImageHeader extends AppCompatTextView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final TextPaint f13725C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f13726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f13727B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f13728y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f13729z;

    static {
        TextPaint textPaint = new TextPaint();
        textPaint.setFlags(1);
        f13725C = textPaint;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuranImageHeader(Context context) {
        this(context, null, 6, 0);
        j.e(context, "context");
    }

    public final void g() {
        if (o.e1(this.f13726A) || o.e1(this.f13727B)) {
            return;
        }
        float width = getWidth();
        String str = this.f13726A;
        TextPaint textPaint = f13725C;
        this.f13728y = width - textPaint.measureText(str);
        Rect rect = new Rect();
        String str2 = this.f13726A;
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        this.f13729z = ((rect.height() / 2.0f) + (getHeight() / 2.0f)) - rect.bottom;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        String str = this.f13727B;
        float f3 = this.f13729z;
        TextPaint textPaint = f13725C;
        canvas.drawText(str, 0.0f, f3, textPaint);
        canvas.drawText(this.f13726A, this.f13728y, this.f13729z, textPaint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f3 = (i11 >= 22 ? 0.58f : 0.66f) * i11;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        TextPaint textPaint = f13725C;
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f3);
        textPaint.setColor(getContext().getColor(R.color.quran_header_text));
        g();
    }

    public final void setHeaderInfo(String str, String str2) {
        j.e(str, "juzInfo");
        j.e(str2, "suraInfo");
        this.f13726A = str;
        this.f13727B = str2;
        g();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuranImageHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.e(context, "context");
    }

    public /* synthetic */ QuranImageHeader(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranImageHeader(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f13726A = "";
        this.f13727B = "";
    }
}
