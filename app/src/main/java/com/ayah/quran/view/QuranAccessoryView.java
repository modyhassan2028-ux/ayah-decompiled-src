package com.ayah.feature.quran.view;

import H5.b;
import T3.a;
import Y3.g;
import Y3.h;
import Y3.i;
import Y3.k;
import Y3.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import p035d3.v;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuranAccessoryView extends Hilt_QuranAccessoryView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f13833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f13834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f13835v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranAccessoryView(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13830s) {
            this.f13830s = true;
            this.f13835v = (a) ((v) ((b) c())).f15685c.f15621e.get();
        }
        this.f13833t = new ArrayList();
        this.f13834u = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, int i11) {
        int i12;
        float fA;
        float f3;
        ArrayList arrayList = this.f13833t;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            int i15 = i13 + 1;
            if (i13 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            k kVar = (k) obj;
            ArrayList arrayList2 = this.f13834u;
            Drawable drawable = ((H5.a) arrayList2.get(i13)).f3387a;
            j.e(kVar, "model");
            int i16 = kVar.f10407a;
            if (drawable instanceof F5.b) {
                F5.b bVar = (F5.b) drawable;
                i iVar = kVar instanceof i ? (i) kVar : null;
                if (iVar == null) {
                    i12 = i13;
                } else {
                    i12 = i13;
                    bVar.setBounds(0, 0, (int) Math.ceil((iVar.f10400c - iVar.f10401d) * i10), (i11 - ((i10 * 174) / 1080)) / 14);
                }
            } else {
                i12 = i13;
                if (drawable instanceof F5.a) {
                    F5.a aVar = (F5.a) drawable;
                    Bitmap bitmap = aVar.f2402b;
                    int i17 = (i10 * 1038) / 1080;
                    aVar.setBounds(0, 0, i17, (bitmap.getHeight() * i17) / bitmap.getWidth());
                    aVar.f2404d = i17 * 0.006f;
                    aVar.f2403c = new RectF(aVar.getBounds());
                } else if (drawable instanceof m) {
                    m mVar = (m) drawable;
                    int i18 = (int) (((double) i10) * 0.05d);
                    int intrinsicHeight = (mVar.getIntrinsicHeight() * i18) / mVar.getIntrinsicWidth();
                    mVar.setBounds(0, 0, i18, intrinsicHeight);
                    mVar.a(intrinsicHeight);
                }
            }
            int i19 = (i10 * 174) / 1080;
            int i20 = (i11 - i19) / 14;
            if (kVar instanceof i) {
                f3 = ((i) kVar).f10401d * i10;
                fA = (i20 * i16) + ((i19 - i20) / 2);
            } else {
                if (!(kVar instanceof Y3.j) && !(kVar instanceof h)) {
                    throw new A6.a();
                }
                Rect bounds = drawable.getBounds();
                j.d(bounds, "getBounds(...)");
                g gVar = (g) kVar;
                float fB = (gVar.b() * i10) - (bounds.width() / 2);
                fA = ((gVar.a() * i19) + (i20 * i16)) - (bounds.height() / 2);
                f3 = fB;
            }
            arrayList2.set(i12, new H5.a(drawable, f3, fA));
            i13 = i15;
        }
    }

    public final a getImageStorage() {
        a aVar = this.f13835v;
        if (aVar != null) {
            return aVar;
        }
        j.k("imageStorage");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        ArrayList arrayList = this.f13834u;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            H5.a aVar = (H5.a) obj;
            float f3 = aVar.f3388b;
            float f7 = aVar.f3389c;
            canvas.translate(f3, f7);
            aVar.f3387a.draw(canvas);
            canvas.translate(-aVar.f3388b, -f7);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i12) {
            return;
        }
        a(i10, i11);
    }

    public final void setAccessoryViews(List<? extends k> list) {
        Drawable bVar;
        j.e(list, "accessories");
        ArrayList arrayList = this.f13833t;
        arrayList.clear();
        ArrayList arrayList2 = this.f13834u;
        arrayList2.clear();
        Context context = getContext();
        for (k kVar : list) {
            if (kVar instanceof Y3.j) {
                j.b(context);
                bVar = new m(context, (Y3.j) kVar);
            } else if (kVar instanceof h) {
                j.b(context);
                bVar = new F5.a(context, (h) kVar, getImageStorage());
            } else {
                if (!(kVar instanceof i)) {
                    throw new A6.a();
                }
                j.b(context);
                bVar = new F5.b(context, (i) kVar);
            }
            arrayList.add(kVar);
            arrayList2.add(new H5.a(bVar, 0.0f, 0.0f));
        }
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            a(width, height);
        }
        invalidate();
    }

    public final void setImageStorage(a aVar) {
        j.e(aVar, "<set-?>");
        this.f13835v = aVar;
    }
}
