package com.ayah.feature.navigator;

import D.AbstractC0060c;
import D.AbstractC0071n;
import D.C0059b;
import D.M;
import D.Z;
import D.f0;
import D.h0;
import F2.t;
import G4.f;
import G4.m;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import N9.InterfaceC0415h;
import N9.k0;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.foundation.a;
import androidx.compose.ui.platform.ComposeView;
import com.ayah.R;
import com.ayah.feature.navigator.NavigationWrapper;
import java.text.NumberFormat;
import java.util.List;
import java.util.WeakHashMap;
import l0.c;
import l0.o;
import p005a4.e;
import p035d3.u;
import p035d3.v;
import p110k9.y;
import p120l9.r;
import p180s0.F;
import p180s0.q;
import p182s5.d;
import p251z9.h;
import p251z9.j;
import r5.b;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationWrapper extends Hilt_NavigationWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13816u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f13817t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationWrapper(Context context) {
        this(context, null, 0, 14);
        j.e(context, "context");
    }

    public final void a(InterfaceC0415h interfaceC0415h, NumberFormat numberFormat, C0698o c0698o, int i10) {
        final NavigationWrapper navigationWrapper;
        S s10;
        List list;
        C0698o c0698o2 = c0698o;
        j.e(interfaceC0415h, "readingPageInfoFlow");
        j.e(numberFormat, "numberFormatter");
        c0698o2.V(45332080);
        final int i11 = 2;
        int i12 = i10 | (c0698o2.i(interfaceC0415h) ? 4 : 2) | (c0698o2.i(numberFormat) ? 32 : 16) | (c0698o2.i(this) ? 256 : 128);
        final int i13 = 0;
        final int i14 = 1;
        if (c0698o2.K(i12 & 1, (i12 & 147) != 146)) {
            X xK = C0672b.k(interfaceC0415h, new b(1, -1, r.f19440r), null, c0698o2, i12 & 14, 2);
            l0.j jVar = c.f19320y;
            l0.r rVarA = a.a(androidx.compose.foundation.layout.c.d(o.f19333a, 56), ((q) ((p005a4.a) c0698o2.k(e.f11187a)).f11163b.getValue()).f21845a, F.f21774a);
            WeakHashMap weakHashMap = f0.f955u;
            l0.r rVarA2 = h0.a(rVarA, new M(new Z(C0059b.f(c0698o2).f957b, C0059b.f(c0698o2).f960e), AbstractC0060c.g));
            I iD = AbstractC0071n.d(jVar, false);
            int i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            l0.r rVarC = l0.a.c(c0698o2, rVarA2);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, iD, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !j.a(c0698o2.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o2, i15, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            b bVar = (b) xK.getValue();
            int i16 = bVar.f21571b;
            List list2 = bVar.f21572c;
            boolean zI = c0698o2.i(numberFormat);
            Object objH = c0698o2.H();
            S s11 = C0690k.f10683a;
            if (zI || objH == s11) {
                objH = new A4.e(numberFormat, 1);
                c0698o2.e0(objH);
            }
            p241y9.c cVar = (p241y9.c) objH;
            boolean zI2 = c0698o2.i(this) | c0698o2.i(bVar);
            Object objH2 = c0698o2.H();
            if (zI2 || objH2 == s11) {
                objH2 = new f(23, this, bVar);
                c0698o2.e0(objH2);
            }
            p241y9.a aVar = (p241y9.a) objH2;
            boolean zI3 = c0698o2.i(this);
            Object objH3 = c0698o2.H();
            if (zI3 || objH3 == s11) {
                objH3 = new p241y9.c(this) { // from class: q5.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ NavigationWrapper f21307s;

                    {
                        this.f21307s = this;
                    }

                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        int i17 = i13;
                        y yVar = y.f19095a;
                        NavigationWrapper navigationWrapper2 = this.f21307s;
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i18 = NavigationWrapper.f13816u;
                                navigationWrapper2.getNavigationPresenter().a(iIntValue);
                                break;
                            case 1:
                                float fFloatValue = ((Float) obj).floatValue();
                                int i19 = NavigationWrapper.f13816u;
                                int i20 = (int) fFloatValue;
                                k0 k0Var = navigationWrapper2.getNavigationPresenter().f22148c;
                                if (i20 <= 0) {
                                    k0Var.m(null);
                                } else {
                                    Integer numValueOf = Integer.valueOf(i20);
                                    k0Var.getClass();
                                    k0Var.n(null, numValueOf);
                                }
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj).floatValue();
                                int i21 = NavigationWrapper.f13816u;
                                navigationWrapper2.getNavigationPresenter().a((int) fFloatValue2);
                                break;
                        }
                        return yVar;
                    }
                };
                c0698o2.e0(objH3);
            }
            p241y9.c cVar2 = (p241y9.c) objH3;
            boolean zI4 = c0698o2.i(this);
            Object objH4 = c0698o2.H();
            if (zI4 || objH4 == s11) {
                s10 = s11;
                list = list2;
                t tVar = new t(0, this, NavigationWrapper.class, "onPageSettingsPressed", "onPageSettingsPressed()V", 0, 0, 21);
                navigationWrapper = this;
                c0698o2.e0(tVar);
                objH4 = tVar;
            } else {
                list = list2;
                navigationWrapper = this;
                s10 = s11;
            }
            p191t5.a.a(i16, list, cVar, aVar, cVar2, (p241y9.a) ((h) objH4), c0698o2, 0);
            c0698o2 = c0698o2;
            int i17 = bVar.f21570a;
            boolean zI5 = c0698o2.i(navigationWrapper);
            Object objH5 = c0698o2.H();
            if (zI5 || objH5 == s10) {
                objH5 = new p241y9.c(navigationWrapper) { // from class: q5.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ NavigationWrapper f21307s;

                    {
                        this.f21307s = navigationWrapper;
                    }

                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        int i18 = i14;
                        y yVar = y.f19095a;
                        NavigationWrapper navigationWrapper2 = this.f21307s;
                        switch (i18) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i19 = NavigationWrapper.f13816u;
                                navigationWrapper2.getNavigationPresenter().a(iIntValue);
                                break;
                            case 1:
                                float fFloatValue = ((Float) obj).floatValue();
                                int i110 = NavigationWrapper.f13816u;
                                int i20 = (int) fFloatValue;
                                k0 k0Var = navigationWrapper2.getNavigationPresenter().f22148c;
                                if (i20 <= 0) {
                                    k0Var.m(null);
                                } else {
                                    Integer numValueOf = Integer.valueOf(i20);
                                    k0Var.getClass();
                                    k0Var.n(null, numValueOf);
                                }
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj).floatValue();
                                int i21 = NavigationWrapper.f13816u;
                                navigationWrapper2.getNavigationPresenter().a((int) fFloatValue2);
                                break;
                        }
                        return yVar;
                    }
                };
                c0698o2.e0(objH5);
            }
            p241y9.c cVar3 = (p241y9.c) objH5;
            boolean zI6 = c0698o2.i(navigationWrapper);
            Object objH6 = c0698o2.H();
            if (zI6 || objH6 == s10) {
                objH6 = new p241y9.c(navigationWrapper) { // from class: q5.a

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ NavigationWrapper f21307s;

                    {
                        this.f21307s = navigationWrapper;
                    }

                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        int i18 = i11;
                        y yVar = y.f19095a;
                        NavigationWrapper navigationWrapper2 = this.f21307s;
                        switch (i18) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i19 = NavigationWrapper.f13816u;
                                navigationWrapper2.getNavigationPresenter().a(iIntValue);
                                break;
                            case 1:
                                float fFloatValue = ((Float) obj).floatValue();
                                int i110 = NavigationWrapper.f13816u;
                                int i20 = (int) fFloatValue;
                                k0 k0Var = navigationWrapper2.getNavigationPresenter().f22148c;
                                if (i20 <= 0) {
                                    k0Var.m(null);
                                } else {
                                    Integer numValueOf = Integer.valueOf(i20);
                                    k0Var.getClass();
                                    k0Var.n(null, numValueOf);
                                }
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj).floatValue();
                                int i21 = NavigationWrapper.f13816u;
                                navigationWrapper2.getNavigationPresenter().a((int) fFloatValue2);
                                break;
                        }
                        return yVar;
                    }
                };
                c0698o2.e0(objH6);
            }
            p191t5.a.f(i17, cVar3, (p241y9.c) objH6, c0698o2, 0);
            c0698o2.p(true);
        } else {
            navigationWrapper = this;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p167q5.b(navigationWrapper, interfaceC0415h, numberFormat, i10, 0);
        }
    }

    public final void b(InterfaceC0415h interfaceC0415h, NumberFormat numberFormat, C0698o c0698o, int i10) {
        j.e(interfaceC0415h, "previewDataFlow");
        j.e(numberFormat, "numberFormatter");
        c0698o.V(-822696224);
        int i11 = i10 | (c0698o.i(interfaceC0415h) ? 4 : 2) | (c0698o.i(numberFormat) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            p124m3.j jVar = (p124m3.j) C0672b.k(interfaceC0415h, null, null, c0698o, (i11 & 14) | 48, 2).getValue();
            if (jVar != null) {
                c0698o.T(-1859573988);
                boolean zI = c0698o.i(numberFormat);
                Object objH = c0698o.H();
                if (zI || objH == C0690k.f10683a) {
                    objH = new A4.e(numberFormat, 2);
                    c0698o.e0(objH);
                }
                p191t5.a.e(jVar, (p241y9.c) objH, c0698o, 0);
                c0698o.p(false);
            } else {
                c0698o.T(-1859497077);
                AbstractC0060c.a(c0698o, androidx.compose.foundation.layout.b.l(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.n(o.f19333a, 264), 72), 0.0f, 0.0f, 0.0f, 8, 7));
                c0698o.p(false);
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p167q5.b(this, interfaceC0415h, numberFormat, i10, 1);
        }
    }

    public final d getNavigationPresenter() {
        d dVar = this.f13817t;
        if (dVar != null) {
            return dVar;
        }
        j.k("navigationPresenter");
        throw null;
    }

    public final void setNavigationPresenter(d dVar) {
        j.e(dVar, "<set-?>");
        this.f13817t = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        j.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationWrapper(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        j.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationWrapper(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, 0);
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        if (!isInEditMode() && !this.f13815s) {
            this.f13815s = true;
            u uVar = ((v) ((p167q5.c) c())).f15683a;
            this.f13817t = new d((p218w3.f) uVar.f15680x.get(), (p198u3.d) uVar.f15678v.get(), (p218w3.a) uVar.f15644C.get(), (p218w3.c) uVar.f15642A.get());
        }
        ComposeView composeView = new ComposeView(context, attributeSet2, 6, i12);
        composeView.setContent(new p074h0.d(2080072107, new m(11, this), true));
        composeView.setTag(R.id.consume_window_insets_tag, Boolean.FALSE);
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }
}
