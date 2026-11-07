package com.ayah.feature.quran.view;

import D.C0061d;
import H5.a;
import H8.e;
import R3.b;
import X3.f;
import X3.g;
import X3.k;
import Y3.h;
import Y3.i;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.ayah.common.ui.view.QuranImageFooter;
import com.ayah.common.ui.view.QuranImageHeader;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuranPageViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f13845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final QuranPageImageView f13846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final QuranAccessoryView f13847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final QuranImageHeader f13848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final QuranImageFooter f13849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f13851x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuranPageViewGroup(Context context, AttributeSet attributeSet, int i10) {
        View view;
        super(context, attributeSet, i10);
        j.e(context, "context");
        QuranPageImageView quranPageImageView = new QuranPageImageView(context, null, 0);
        u0.u(quranPageImageView);
        this.f13846s = quranPageImageView;
        QuranAccessoryView quranAccessoryView = new QuranAccessoryView(context);
        u0.u(quranAccessoryView);
        this.f13847t = quranAccessoryView;
        QuranImageHeader quranImageHeader = new QuranImageHeader(context, null, 6, 0);
        quranImageHeader.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.f13848u = quranImageHeader;
        QuranImageFooter quranImageFooter = new QuranImageFooter(context, null, 6, 0);
        quranImageFooter.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.f13849v = quranImageFooter;
        boolean z10 = context.getResources().getConfiguration().orientation == 2;
        this.f13850w = z10;
        float f3 = context.getResources().getDisplayMetrics().density;
        if (z10) {
            this.f13851x = new C0061d(4, f3);
            ScrollView scrollView = new ScrollView(context);
            u0.u(scrollView);
            LinearLayout linearLayout = new LinearLayout(context);
            u0.u(linearLayout);
            linearLayout.setOrientation(1);
            linearLayout.addView(quranImageHeader);
            FrameLayout frameLayout = new FrameLayout(context);
            u0.u(frameLayout);
            frameLayout.addView(quranAccessoryView);
            frameLayout.addView(quranPageImageView);
            linearLayout.addView(frameLayout);
            scrollView.addView(linearLayout);
            view = scrollView;
        } else {
            this.f13851x = new e(14);
            addView(quranImageHeader);
            addView(quranAccessoryView);
            view = quranPageImageView;
        }
        this.f13845r = view;
        addView(view);
        addView(quranImageFooter);
    }

    public final k a(float f3, float f7, boolean z10) {
        int top;
        Object obj;
        Object obj2;
        h hVar;
        i iVar;
        boolean z11 = this.f13850w;
        QuranAccessoryView quranAccessoryView = this.f13847t;
        if (z11) {
            Object parent = quranAccessoryView.getParent();
            j.c(parent, "null cannot be cast to non-null type android.view.View");
            top = ((View) parent).getTop();
        } else {
            top = quranAccessoryView.getTop();
        }
        float f10 = f7 - top;
        ArrayList arrayList = quranAccessoryView.f13834u;
        int height = (quranAccessoryView.getHeight() - ((quranAccessoryView.getWidth() * 174) / 1080)) / 14;
        ArrayList arrayList2 = quranAccessoryView.f13833t;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i13);
                    i13++;
                    a aVar = (a) ((p110k9.j) obj).f19078s;
                    float f11 = aVar.f3389c;
                    if (f10 >= f11 && f10 <= f11 + height) {
                        float f12 = aVar.f3388b;
                        if (f3 >= f12 && f3 <= f12 + aVar.f3387a.getBounds().width()) {
                            break;
                        }
                    }
                }
                p110k9.j jVar = (p110k9.j) obj;
                int i14 = -1;
                int i15 = (jVar == null || (iVar = (i) jVar.f19077r) == null) ? -1 : iVar.f10399b;
                if (i15 >= 0) {
                    return z10 ? new X3.i(i15) : new f(i15);
                }
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList2.size();
                int i16 = 0;
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList2.get(i17);
                    i17++;
                    int i18 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC0813f2.T();
                        throw null;
                    }
                    Y3.k kVar = (Y3.k) obj3;
                    p110k9.j jVar2 = kVar instanceof h ? new p110k9.j(kVar, arrayList.get(i16)) : null;
                    if (jVar2 != null) {
                        arrayList4.add(jVar2);
                    }
                    i16 = i18;
                }
                int size4 = arrayList4.size();
                while (true) {
                    if (i10 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList4.get(i10);
                    i10++;
                    a aVar2 = (a) ((p110k9.j) obj2).f19078s;
                    Rect bounds = aVar2.f3387a.getBounds();
                    j.d(bounds, "getBounds(...)");
                    float f13 = aVar2.f3389c;
                    if (f10 >= f13 && f10 <= f13 + bounds.height()) {
                        float f14 = aVar2.f3388b;
                        if (f3 >= f14 && f3 <= f14 + bounds.width()) {
                            break;
                        }
                    }
                }
                p110k9.j jVar3 = (p110k9.j) obj2;
                if (jVar3 != null && (hVar = (h) jVar3.f19077r) != null) {
                    i14 = hVar.f10395b;
                }
                if (i14 < 0) {
                    return null;
                }
                return z10 ? new X3.j(i14) : new g(i14);
            }
            Object obj4 = arrayList2.get(i12);
            i12++;
            int i19 = i11 + 1;
            if (i11 < 0) {
                AbstractC0813f2.T();
                throw null;
            }
            Y3.k kVar2 = (Y3.k) obj4;
            p110k9.j jVar4 = kVar2 instanceof i ? new p110k9.j(kVar2, arrayList.get(i11)) : null;
            if (jVar4 != null) {
                arrayList3.add(jVar4);
            }
            i11 = i19;
        }
    }

    public final void b(View view, int i10, int i11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int paddingLeft = ((i11 - measuredWidth) / 2) + getPaddingLeft();
        view.layout(paddingLeft, i10, measuredWidth + paddingLeft, measuredHeight + i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int paddingRight = (i12 - i10) - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = (i13 - i11) - (getPaddingBottom() + getPaddingTop());
        boolean z11 = this.f13850w;
        if (z11) {
            measuredHeight = getPaddingTop();
        } else {
            QuranImageHeader quranImageHeader = this.f13848u;
            int measuredHeight2 = quranImageHeader.getMeasuredHeight();
            i11 = ((((paddingBottom - measuredHeight2) - this.f13846s.getMeasuredHeight()) - measuredHeight2) / 2) + getPaddingTop() + i11;
            b(quranImageHeader, i11, paddingRight);
            b(this.f13847t, quranImageHeader.getMeasuredHeight() + i11, paddingRight);
            measuredHeight = quranImageHeader.getMeasuredHeight();
        }
        int i14 = measuredHeight + i11;
        View view = this.f13845r;
        b(view, i14, paddingRight);
        QuranImageFooter quranImageFooter = this.f13849v;
        b(quranImageFooter, z11 ? paddingBottom - ((int) (((double) quranImageFooter.getMeasuredHeight()) * 1.5d)) : view.getMeasuredHeight() + i14, paddingRight);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = size2 - (getPaddingBottom() + getPaddingTop());
        R3.a aVarF = this.f13851x.f(paddingRight, paddingBottom);
        int i12 = aVarF.f7224c;
        int i13 = aVarF.f7222a;
        int i14 = aVarF.f7223b;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        int i15 = aVarF.f7225d;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        this.f13849v.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        boolean z10 = this.f13850w;
        View view = this.f13845r;
        QuranAccessoryView quranAccessoryView = this.f13847t;
        QuranImageHeader quranImageHeader = this.f13848u;
        if (z10) {
            int i16 = (int) (((double) i15) * 0.5d);
            int i17 = (i13 - i12) / 2;
            ViewGroup.LayoutParams layoutParams = quranImageHeader.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i12;
            marginLayoutParams.height = i15;
            marginLayoutParams.topMargin = i16;
            marginLayoutParams.leftMargin = i17;
            marginLayoutParams.rightMargin = i17;
            quranImageHeader.setLayoutParams(marginLayoutParams);
            QuranPageImageView quranPageImageView = this.f13846s;
            ViewGroup.LayoutParams layoutParams2 = quranPageImageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.width = i13;
            marginLayoutParams2.height = i14;
            int i18 = i16 + i15;
            marginLayoutParams2.bottomMargin = i18;
            quranPageImageView.setLayoutParams(marginLayoutParams2);
            ViewGroup.LayoutParams layoutParams3 = quranAccessoryView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.width = i13;
            marginLayoutParams3.height = i14;
            marginLayoutParams3.bottomMargin = i18;
            quranAccessoryView.setLayoutParams(marginLayoutParams3);
            view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        } else {
            quranImageHeader.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            quranAccessoryView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setAccessoryViews(List<? extends Y3.k> list) {
        j.e(list, "accessoryViews");
        this.f13847t.setAccessoryViews(list);
    }

    public final void setPageImages(Drawable[] drawableArr) {
        j.e(drawableArr, "images");
        this.f13846s.setLineImages(drawableArr);
    }

    public final void setTouchListenerOnCorrectView(View.OnTouchListener onTouchListener) {
        j.e(onTouchListener, "onTouchListener");
        if (!this.f13850w) {
            setOnTouchListener(onTouchListener);
            return;
        }
        View view = this.f13845r;
        j.c(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).getChildAt(0).setOnTouchListener(onTouchListener);
    }
}
