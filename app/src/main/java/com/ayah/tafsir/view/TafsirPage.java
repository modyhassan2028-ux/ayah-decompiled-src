package com.ayah.feature.tafsir.view;

import C4.g;
import D.C0061d;
import E5.c;
import H8.e;
import K0.C0362p;
import K9.AbstractC0405x;
import K9.H;
import N9.AbstractC0419l;
import N9.C0424q;
import N9.InterfaceC0415h;
import N9.P;
import N9.g0;
import P9.d;
import W1.i;
import Z5.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.common.ui.view.QuranImageFooter;
import com.ayah.common.ui.view.QuranImageHeader;
import p027c6.f;
import p035d3.n;
import p035d3.u;
import p035d3.v;
import p106k4.a;
import p151p.C1256n;
import p174r3.l;
import p218w3.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class TafsirPage extends Hilt_TafsirPage {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f13889D = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MainActivity f13890A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f13891B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public a f13892C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f13893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final QuranImageHeader f13894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final QuranImageFooter f13895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f13896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final R3.b f13897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f13898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13899z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TafsirPage(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13876s) {
            this.f13876s = true;
            v vVar = (v) ((p037d6.d) c());
            u uVar = vVar.f15683a;
            p218w3.j jVar = (p218w3.j) uVar.f15681y.get();
            C1256n c1256nA = u.a();
            p218w3.f fVar = (p218w3.f) uVar.f15680x.get();
            n nVar = vVar.f15684b;
            this.f13891B = new f(jVar, c1256nA, fVar, (p218w3.n) nVar.f15629d.get(), (z3.f) nVar.f15631f.get(), (p189t3.b) uVar.f15657P.get(), (h) uVar.f15643B.get(), (l) uVar.f15674r.get());
            this.f13892C = new a();
        }
        SnappingLinearLayoutManager snappingLinearLayoutManager = new SnappingLinearLayoutManager(1);
        this.f13898y = AbstractC0405x.d();
        this.f13899z = -1;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.inflate(R.layout.tafsir, this);
        Resources resources = context.getResources();
        float f3 = resources.getDisplayMetrics().density;
        b bVar = new b(f3, layoutInflaterFrom, getAyahTextFormatter(), new E5.a(12, this));
        this.f13896w = bVar;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tafsir_bottom_padding);
        View viewFindViewById = findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(snappingLinearLayoutManager);
        recyclerView.setAdapter(bVar);
        int i11 = 0;
        int i12 = 2;
        int i13 = 0;
        recyclerView.f12869H.add(new p016b6.a(context, new C0362p(i12, this, TafsirPage.class, "suraNumberForTapCoordinates", "suraNumberForTapCoordinates(FF)I", i13, i11, 12), new C0362p(i12, this, TafsirPage.class, "ayahIdForTapCoordinates", "ayahIdForTapCoordinates(FF)I", i13, i11, 13), new c(1, this, TafsirPage.class, "processAyahOperation", "processAyahOperation(Lcom/ayah/common/ui/page/operation/QuranPageOperation;)V", i13, i11, 9)));
        recyclerView.i(new p096j4.a(dimensionPixelSize));
        j.d(viewFindViewById, "apply(...)");
        this.f13893t = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.page_header);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f13894u = (QuranImageHeader) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.page_footer);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f13895v = (QuranImageFooter) viewFindViewById3;
        this.f13897x = context.getResources().getConfiguration().orientation == 2 ? new C0061d(4, f3) : new e(14);
    }

    public final a getAyahTextFormatter() {
        a aVar = this.f13892C;
        if (aVar != null) {
            return aVar;
        }
        j.k("ayahTextFormatter");
        throw null;
    }

    public final f getPresenter() {
        f fVar = this.f13891B;
        if (fVar != null) {
            return fVar;
        }
        j.k("presenter");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d dVarD = AbstractC0405x.d();
        this.f13898y = dVarD;
        int i10 = 11;
        p150o9.c cVar = null;
        int i11 = 2;
        AbstractC0419l.u(new H2.j(new g(new C4.c(getPresenter().j, i10), this, 16), getPresenter().f13533n, new H5.e(this, cVar, i11)), dVarD);
        f presenter = getPresenter();
        int i12 = this.f13899z;
        int i13 = 3;
        G5.c cVar2 = new G5.c(new C4.c(presenter.j, i10), i12, i13);
        p218w3.n nVar = presenter.f13525d;
        H2.j jVar = new H2.j(nVar.f23710f, nVar.f23709e.f21552h, new g0(nVar, i12, null));
        R9.e eVar = H.f5322a;
        int i14 = 1;
        H2.j jVar2 = new H2.j(AbstractC0419l.s(jVar, R9.d.f7436t), presenter.f13528h.g, new i(i13, cVar, i14));
        P pA = presenter.f13526e.a();
        h hVar = presenter.g;
        AbstractC0419l.u(new C0424q(new P(new InterfaceC0415h[]{cVar2, jVar2, pA, hVar.f23674d, new H2.j(hVar.f23675e, presenter.f13527f.f22587b, new i(i13, cVar, i11))}, new p027c6.e(presenter, null)), new p037d6.c(this, cVar, 0), 2), dVarD);
        AbstractC0419l.u(new C0424q(getPresenter().f13531l, new p037d6.c(this, cVar, i14), 2), dVarD);
        f presenter2 = getPresenter();
        G5.c cVar3 = new G5.c(new C4.c(presenter2.j, i10), this.f13899z, i11);
        h hVar2 = presenter2.g;
        AbstractC0419l.u(new C0424q(new P(new InterfaceC0415h[]{cVar3, hVar2.f23675e, hVar2.f23674d, presenter2.f13526e.a()}, new G5.d(5, cVar, i14)), new p037d6.c(this, cVar, i11), 2), dVarD);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC0405x.h(this.f13898y, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = size2 - (getPaddingBottom() + getPaddingTop());
        R3.a aVarF = this.f13897x.f(paddingRight, paddingBottom);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(aVarF.f7224c, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(aVarF.f7225d, 1073741824);
        this.f13895v.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f13894u.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f13893t.measure(View.MeasureSpec.makeMeasureSpec(aVarF.f7222a, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
    }

    public final void setAyahTextFormatter(a aVar) {
        j.e(aVar, "<set-?>");
        this.f13892C = aVar;
    }

    public final void setPage(int i10) {
        if (this.f13899z != i10) {
            f presenter = getPresenter();
            d dVar = presenter.f13534o;
            R9.e eVar = H.f5322a;
            AbstractC0405x.x(dVar, R9.d.f7436t, new F.u(i10, 4, presenter, null), 2);
            this.f13899z = i10;
        }
    }

    public final void setPresenter(f fVar) {
        j.e(fVar, "<set-?>");
        this.f13891B = fVar;
    }
}
