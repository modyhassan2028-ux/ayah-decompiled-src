package com.ayah.ui.widget.search;

import A.C0040q0;
import K0.C0362p;
import K9.AbstractC0405x;
import P9.d;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import i7.B;
import p017b7.g;
import p035d3.u;
import p035d3.v;
import p114l3.b;
import p218w3.c;
import p236y3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SearchResultsView extends Hilt_SearchResultsView {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f13960B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public d f13961A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f13962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f13963u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f13964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RecyclerView f13965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p168q6.d f13966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p096j4.a f13967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13968z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResultsView(Context context) {
        this(context, null, 0, 14);
        j.e(context, "context");
    }

    public final c getJumpModel() {
        c cVar = this.f13964v;
        if (cVar != null) {
            return cVar;
        }
        j.k("jumpModel");
        throw null;
    }

    public final b getPageTypeDecider() {
        b bVar = this.f13962t;
        if (bVar != null) {
            return bVar;
        }
        j.k("pageTypeDecider");
        throw null;
    }

    public final a getSearchModel() {
        a aVar = this.f13963u;
        if (aVar != null) {
            return aVar;
        }
        j.k("searchModel");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVarD = AbstractC0405x.d();
        this.f13961A = dVarD;
        AbstractC0405x.x(dVarD, null, new C0040q0(this, (p150o9.c) null, 27), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d dVar = this.f13961A;
        if (dVar == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0405x.h(dVar, null);
        super.onDetachedFromWindow();
    }

    public final void setImeInsets(int i10) {
        p096j4.a aVar = this.f13967y;
        if (aVar.f18778b != i10) {
            aVar.f18778b = i10;
            this.f13965w.S();
        }
    }

    public final void setJumpModel(c cVar) {
        j.e(cVar, "<set-?>");
        this.f13964v = cVar;
    }

    public final void setPageTypeDecider(b bVar) {
        j.e(bVar, "<set-?>");
        this.f13962t = bVar;
    }

    public final void setSearchModel(a aVar) {
        j.e(aVar, "<set-?>");
        this.f13963u = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResultsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        j.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResultsView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        j.e(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchResultsView(Context context, AttributeSet attributeSet, int i10, int i11) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        i10 = (i11 & 4) != 0 ? 0 : i10;
        j.e(context, "context");
        super(context, attributeSet, i10, 0);
        if (!isInEditMode() && !this.f13959s) {
            this.f13959s = true;
            v vVar = (v) ((p239y6.c) c());
            vVar.getClass();
            this.f13962t = new B(19);
            u uVar = vVar.f15683a;
            this.f13963u = (a) uVar.f15646E.get();
            this.f13964v = (c) uVar.f15642A.get();
        }
        RecyclerView recyclerView = new RecyclerView(context);
        this.f13965w = recyclerView;
        this.f13968z = true;
        p168q6.d dVar = new p168q6.d(context, getPageTypeDecider(), new C0362p(2, this, SearchResultsView.class, "jumpToAyah", "jumpToAyah(II)V", 0, 0, 15), new E5.a(21, this));
        this.f13966x = dVar;
        p096j4.a aVar = new p096j4.a();
        aVar.f18778b = 0;
        this.f13967y = aVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(dVar);
        recyclerView.setBackgroundColor(context.getColor(R.color.grouped_background));
        recyclerView.setVisibility(8);
        recyclerView.i(aVar);
        recyclerView.j(new p239y6.b(this, context));
        addView(recyclerView, -1, -1);
        g.J(recyclerView, new p197u2.b(5));
    }
}
