package com.ayah.feature.tafsir.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.ayah.R;
import p089i4.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class TafsirChapterHeaderView extends Hilt_TafsirChapterHeaderView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextPaint f13877A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Rect f13878B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f13879C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13880D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f13881E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f13882F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Paint f13883G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public b f13884H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f13885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13887y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f13888z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TafsirChapterHeaderView(Context context) {
        this(context, null, 6, 0);
        j.e(context, "context");
    }

    public final void a() {
        float measuredWidth = getMeasuredWidth();
        String str = this.f13888z;
        TextPaint textPaint = this.f13877A;
        float f3 = 2;
        this.f13886x = (int) ((measuredWidth - textPaint.measureText(str)) / f3);
        this.f13887y = (getMeasuredHeight() / 2) + ((int) (((textPaint.descent() - textPaint.ascent()) / f3) - textPaint.descent()));
    }

    public final b getTafsirChapterHeaderGenerator() {
        b bVar = this.f13884H;
        if (bVar != null) {
            return bVar;
        }
        j.k("tafsirChapterHeaderGenerator");
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.f13880D) {
            float f3 = this.f13881E;
            canvas.drawRoundRect(this.f13882F, f3, f3, this.f13883G);
        }
        super.onDraw(canvas);
        if (this.f13888z.length() > 0) {
            canvas.drawText(this.f13888z, this.f13886x, this.f13887y, this.f13877A);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int length = this.f13888z.length();
        TextPaint textPaint = this.f13877A;
        String str = this.f13885w;
        Rect rect = this.f13878B;
        textPaint.getTextBounds(str, 0, length, rect);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + (this.f13879C * 2) + rect.height());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        b tafsirChapterHeaderGenerator = getTafsirChapterHeaderGenerator();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.header_middle_size);
        tafsirChapterHeaderGenerator.getClass();
        Bitmap bitmap = tafsirChapterHeaderGenerator.f16752d;
        if (paddingRight != tafsirChapterHeaderGenerator.f16750b || paddingBottom != tafsirChapterHeaderGenerator.f16751c || bitmap == null) {
            Bitmap bitmap2 = (Bitmap) tafsirChapterHeaderGenerator.f16749a.f7780b.getValue();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, (bitmap2.getWidth() - dimensionPixelSize) / 2, 0, dimensionPixelSize, bitmap2.getHeight());
            j.d(bitmapCreateBitmap, "createBitmap(...)");
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int i14 = (paddingBottom * width) / height;
            int i15 = (int) (((((double) width) * 0.35d) * ((double) paddingBottom)) / ((double) height));
            Paint paint = new Paint(7);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(paddingRight, paddingBottom, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            canvas.save();
            canvas.clipRect(0, 0, i15, paddingBottom);
            canvas.drawBitmap(bitmap2, (Rect) null, new Rect(0, 0, i14, paddingBottom), paint);
            canvas.restore();
            canvas.save();
            int i16 = paddingRight - i15;
            canvas.clipRect(i15, 0, i16, paddingBottom);
            canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, new Rect(0, 0, paddingRight, paddingBottom), paint);
            canvas.restore();
            canvas.save();
            canvas.clipRect(i16, 0, paddingRight, paddingBottom);
            canvas.drawBitmap(bitmap2, (Rect) null, new Rect(paddingRight - i14, 0, paddingRight, paddingBottom), paint);
            canvas.restore();
            tafsirChapterHeaderGenerator.f16752d = bitmapCreateBitmap2;
            tafsirChapterHeaderGenerator.f16750b = paddingRight;
            tafsirChapterHeaderGenerator.f16751c = paddingBottom;
            bitmap = bitmapCreateBitmap2;
        }
        setImageBitmap(bitmap);
        this.f13882F.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f13881E = paddingRight * 0.006f;
        a();
    }

    public final void setShouldSelect(boolean z10) {
        this.f13880D = z10;
    }

    public final void setSuraName(String str) {
        j.e(str, "suraName");
        this.f13888z = str;
        a();
    }

    public final void setTafsirChapterHeaderGenerator(b bVar) {
        j.e(bVar, "<set-?>");
        this.f13884H = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TafsirChapterHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.e(context, "context");
    }

    public /* synthetic */ TafsirChapterHeaderView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TafsirChapterHeaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f13885w = "ﮍ";
        this.f13888z = "";
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(p106k4.b.f18991b.a(getContext(), 4));
        textPaint.setColor(getContext().getColor(R.color.quran_text));
        textPaint.setTextSize(getContext().getResources().getDimension(R.dimen.tafsir_chapter_header_font_size));
        this.f13877A = textPaint;
        this.f13878B = new Rect();
        this.f13879C = getResources().getDimensionPixelSize(R.dimen.tafsir_chapter_header_vertical_padding);
        this.f13882F = new RectF();
        Paint paint = new Paint();
        this.f13883G = paint;
        paint.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.quran_selection), PorterDuff.Mode.SRC_IN));
        setScaleType(ImageView.ScaleType.CENTER);
    }
}
