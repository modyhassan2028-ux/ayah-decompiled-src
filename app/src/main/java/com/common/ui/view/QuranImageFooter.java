package com.ayah.common.ui.view;

import Q8.C0469p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.ayah.R;
import java.util.LinkedHashMap;
import p110k9.a;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuranImageFooter extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static boolean f13710B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Paint f13711C = new Paint(6);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final TextPaint f13712D = new TextPaint(1);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final TextPaint f13713E = new TextPaint(1);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final LinkedHashMap f13714F = new LinkedHashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Bitmap f13715A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f13716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f13717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f13723y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f13724z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuranImageFooter(Context context) {
        this(context, null, 6, 0);
        j.e(context, "context");
    }

    public final void a() {
        if (H9.o.e1(this.f13716r)) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f3 = height * (height >= 22 ? 0.88f : 1.0f);
        Bitmap bitmap = this.f13715A;
        if (bitmap == null) {
            j.k("bitmap");
            throw null;
        }
        float width2 = bitmap.getWidth() * f3;
        Bitmap bitmap2 = this.f13715A;
        if (bitmap2 == null) {
            j.k("bitmap");
            throw null;
        }
        float height2 = width2 / bitmap2.getHeight();
        float f7 = 2;
        float f10 = f3 / f7;
        float f11 = (height / 2) - f10;
        float f12 = this.f13718t ? width - height2 : 0.0f;
        this.f13723y.set(f12, f11, height2 + f12, f11 + f3);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        TextPaint textPaint = f13712D;
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(0.574f * f3);
        textPaint.setColor(getContext().getColor(R.color.text));
        float f13 = (138.5f * f3) / 114.0f;
        float fMeasureText = textPaint.measureText(this.f13716r);
        this.f13719u = this.f13718t ? (width - f13) - (fMeasureText / f7) : f13 - (fMeasureText / f7);
        Rect rect = new Rect();
        String str = this.f13716r;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        this.f13720v = (((rect.height() / 2) + f10) + f11) - rect.bottom;
        TextPaint textPaint2 = f13713E;
        textPaint2.setTypeface(typeface);
        textPaint2.setTextSize(0.472f * f3);
        textPaint2.setColor(getContext().getColor(R.color.text));
        float f14 = (f3 * 425) / 114;
        float fMeasureText2 = textPaint2.measureText(this.f13717s);
        this.f13721w = this.f13718t ? (width - f14) - (fMeasureText2 / f7) : f14 - (fMeasureText2 / f7);
        String str2 = this.f13717s;
        textPaint2.getTextBounds(str2, 0, str2.length(), rect);
        this.f13722x = ((f10 + (rect.height() / 2)) + f11) - rect.bottom;
    }

    public final Bitmap b(int i10, int i11) {
        o oVar = this.f13724z;
        boolean zBooleanValue = ((Boolean) oVar.getValue()).booleanValue();
        boolean z10 = f13710B;
        LinkedHashMap linkedHashMap = f13714F;
        if (zBooleanValue != z10) {
            linkedHashMap.clear();
            f13710B = ((Boolean) oVar.getValue()).booleanValue();
        }
        Bitmap bitmap = (Bitmap) linkedHashMap.get(Integer.valueOf(i10));
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i11, new BitmapFactory.Options());
        linkedHashMap.put(Integer.valueOf(i10), bitmapDecodeResource);
        j.b(bitmapDecodeResource);
        return bitmapDecodeResource;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (H9.o.e1(this.f13716r)) {
            return;
        }
        Bitmap bitmap = this.f13715A;
        if (bitmap == null) {
            j.k("bitmap");
            throw null;
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f13723y, f13711C);
        canvas.drawText(this.f13716r, this.f13719u, this.f13720v, f13712D);
        if (H9.o.e1(this.f13717s)) {
            return;
        }
        canvas.drawText(this.f13717s, this.f13721w, this.f13722x, f13713E);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a();
    }

    public final void setFooterInfo(String str, String str2, boolean z10, boolean z11) {
        Bitmap bitmapB;
        j.e(str, "pageTitle");
        j.e(str2, "quarterTitle");
        this.f13716r = str;
        this.f13717s = str2;
        this.f13718t = z10;
        boolean zE1 = H9.o.e1(str2);
        if (zE1 || !z10) {
            bitmapB = !zE1 ? b(1, 2131231022) : b(0, 2131231020);
        } else {
            bitmapB = b(2, 2131231023);
        }
        this.f13715A = bitmapB;
        a();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuranImageFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.e(context, "context");
    }

    public /* synthetic */ QuranImageFooter(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranImageFooter(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f13716r = "";
        this.f13717s = "";
        this.f13718t = true;
        this.f13723y = new RectF();
        this.f13724z = a.d(new C0469p(context, 3));
    }
}
