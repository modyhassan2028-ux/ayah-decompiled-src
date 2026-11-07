package com.ayah.feature.khatmah.ui.wrapper;

import D.AbstractC0071n;
import D.C0077u;
import H0.I;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.C0362p;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import N7.f;
import Q8.C0469p;
import U4.e;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.InterfaceC0687i0;
import Z.L0;
import Z.S;
import Z.X;
import Z4.h;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.ui.platform.ComposeView;
import com.ayah.R;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import j$.time.LocalTime;
import l0.r;
import p035d3.u;
import p035d3.v;
import p074h0.d;
import p110k9.o;
import p110k9.y;
import p173r2.A;
import p181s2.s;
import p189t3.b;
import p218w3.c;
import p227x3.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class KhatmahWrapper extends Hilt_KhatmahWrapper {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13794v = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f13795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e f13796u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KhatmahWrapper(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13793s) {
            this.f13793s = true;
            u uVar = ((v) ((h) c())).f15683a;
            this.f13796u = new e((p218w3.j) uVar.f15681y.get(), u.a(), (c) uVar.f15642A.get(), (b) uVar.f15657P.get(), (p208v3.c) uVar.f15663e.get(), (a) uVar.f15648G.get());
        }
        this.f13795t = p110k9.a.d(new C0469p(context, 2));
        int i10 = 0;
        ComposeView composeView = new ComposeView(context, null, 6, i10);
        composeView.setContent(new d(1301659015, new Z4.b(this, context, i10), true));
        addView(composeView, -1, -1);
    }

    public static void a(L0 l10, X x9, A a9, final InterfaceC0402u interfaceC0402u, KhatmahWrapper khatmahWrapper, final p241y9.c cVar, X x10, C0077u c0077u, C0698o c0698o, int i10) {
        p095j3.c cVar2;
        KhatmahWrapper khatmahWrapper2 = khatmahWrapper;
        j.e(c0077u, "$this$BottomSheetScaffold");
        if (!c0698o.K(i10 & 1, (i10 & 17) != 16)) {
            c0698o.N();
            return;
        }
        I iD = AbstractC0071n.d(l0.c.f19313r, false);
        int i11 = c0698o.f10721P;
        InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
        r rVarC = l0.a.c(c0698o, l0.o.f19333a);
        InterfaceC0288k.f4142a.getClass();
        C0286i c0286i = C0287j.f4115b;
        c0698o.X();
        if (c0698o.f10720O) {
            c0698o.l(c0286i);
        } else {
            c0698o.h0();
        }
        C0672b.v(c0698o, iD, C0287j.f4119f);
        C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
        C0285h c0285h = C0287j.g;
        if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i11))) {
            p123m2.c.y(i11, c0698o, i11, c0285h);
        }
        C0672b.v(c0698o, rVarC, C0287j.f4117d);
        T4.a aVar = (T4.a) l10.getValue();
        S s10 = C0690k.f10683a;
        if (aVar == null || ((Boolean) x9.getValue()).booleanValue()) {
            c0698o.T(2050502484);
            boolean zI = c0698o.i(interfaceC0402u) | c0698o.i(khatmahWrapper2) | c0698o.i(cVar);
            Object objH = c0698o.H();
            if (zI || objH == s10) {
                objH = new A4.a(interfaceC0402u, khatmahWrapper2, cVar, 7);
                c0698o.e0(objH);
            }
            p241y9.e eVar = (p241y9.e) objH;
            boolean zI2 = c0698o.i(khatmahWrapper2);
            Object objH2 = c0698o.H();
            if (zI2 || objH2 == s10) {
                C0362p c0362p = new C0362p(2, khatmahWrapper2, KhatmahWrapper.class, "fetchKhatmahInfo", "fetchKhatmahInfo(Lcom/ayah/common/data/dao/khatmah/KhatmahPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 9);
                c0698o.e0(c0362p);
                objH2 = c0362p;
            }
            p241y9.e eVar2 = (p241y9.e) ((p251z9.h) objH2);
            boolean zI3 = c0698o.i(interfaceC0402u) | c0698o.i(cVar);
            Object objH3 = c0698o.H();
            if (zI3 || objH3 == s10) {
                final int i12 = 0;
                objH3 = new p241y9.a() { // from class: Z4.d
                    @Override // p241y9.a
                    public final Object invoke() {
                        int i13 = i12;
                        y yVar = y.f19095a;
                        p241y9.c cVar3 = cVar;
                        InterfaceC0402u interfaceC0402u2 = interfaceC0402u;
                        switch (i13) {
                            case 0:
                                int i14 = KhatmahWrapper.f13794v;
                                AbstractC0405x.x(interfaceC0402u2, null, new e(0, null, cVar3), 3);
                                break;
                            default:
                                int i15 = KhatmahWrapper.f13794v;
                                AbstractC0405x.x(interfaceC0402u2, null, new e(1, null, cVar3), 3);
                                break;
                        }
                        return yVar;
                    }
                };
                c0698o.e0(objH3);
            }
            Y4.a.d(a9, eVar, eVar2, (p241y9.a) objH3, c0698o, 0);
            c0698o.p(false);
        } else {
            c0698o.T(2051006947);
            boolean zI4 = c0698o.i(interfaceC0402u) | c0698o.i(cVar);
            Object objH4 = c0698o.H();
            if (zI4 || objH4 == s10) {
                final int i13 = 1;
                objH4 = new p241y9.a() { // from class: Z4.d
                    @Override // p241y9.a
                    public final Object invoke() {
                        int i14 = i13;
                        y yVar = y.f19095a;
                        p241y9.c cVar3 = cVar;
                        InterfaceC0402u interfaceC0402u2 = interfaceC0402u;
                        switch (i14) {
                            case 0:
                                int i15 = KhatmahWrapper.f13794v;
                                AbstractC0405x.x(interfaceC0402u2, null, new e(0, null, cVar3), 3);
                                break;
                            default:
                                int i16 = KhatmahWrapper.f13794v;
                                AbstractC0405x.x(interfaceC0402u2, null, new e(1, null, cVar3), 3);
                                break;
                        }
                        return yVar;
                    }
                };
                c0698o.e0(objH4);
            }
            p241y9.a aVar2 = (p241y9.a) objH4;
            p095j3.c cVar3 = aVar.f7781a.f18751a;
            boolean zI5 = c0698o.i(khatmahWrapper2);
            Object objH5 = c0698o.H();
            if (zI5 || objH5 == s10) {
                cVar2 = cVar3;
                C0362p c0362p2 = new C0362p(2, khatmahWrapper2, KhatmahWrapper.class, "fetchKhatmahInfo", "fetchKhatmahInfo(Lcom/ayah/common/data/dao/khatmah/KhatmahPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 10);
                c0698o.e0(c0362p2);
                objH5 = c0362p2;
            } else {
                cVar2 = cVar3;
            }
            X4.a.f(aVar2, cVar2, (p241y9.e) ((p251z9.h) objH5), c0698o, 0);
            c0698o.p(false);
            khatmahWrapper2 = khatmahWrapper2;
        }
        LocalTime localTime = (LocalTime) x10.getValue();
        if (localTime != null) {
            c0698o.T(2051457904);
            if (f.a(khatmahWrapper2.getAlarmManager())) {
                c0698o.T(2051533327);
                Object objH6 = c0698o.H();
                if (objH6 == s10) {
                    objH6 = new A4.h(x10, 10);
                    c0698o.e0(objH6);
                }
                p241y9.a aVar3 = (p241y9.a) objH6;
                boolean zI6 = c0698o.i(interfaceC0402u) | c0698o.i(khatmahWrapper2);
                Object objH7 = c0698o.H();
                if (zI6 || objH7 == s10) {
                    objH7 = new Ca.h(interfaceC0402u, x10, khatmahWrapper2, 4);
                    c0698o.e0(objH7);
                }
                p015b4.f.l(null, localTime, aVar3, (p241y9.c) objH7, c0698o, 384);
                c0698o.p(false);
            } else {
                c0698o.T(2051974364);
                c0698o.p(false);
                x10.setValue(null);
                Context context = khatmahWrapper2.getContext();
                j.d(context, "getContext(...)");
                if (Build.VERSION.SDK_INT >= 31) {
                    context.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM"));
                }
            }
        } else {
            c0698o.T(2047416496);
        }
        c0698o.p(false);
        c0698o.p(true);
    }

    public static void b(KhatmahWrapper khatmahWrapper, Context context, X x9, X x10, InterfaceC0402u interfaceC0402u, boolean z10, LocalTime localTime) {
        j.e(localTime, "time");
        if (!z10) {
            AbstractC0405x.x(interfaceC0402u, null, new Z4.f(khatmahWrapper, localTime, null, 1), 3);
            return;
        }
        if (!f.a(khatmahWrapper.getAlarmManager())) {
            Context context2 = khatmahWrapper.getContext();
            j.d(context2, "getContext(...)");
            if (Build.VERSION.SDK_INT >= 31) {
                context2.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM"));
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 33 || s.c(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            x10.setValue(localTime);
            return;
        }
        x9.setValue(Boolean.TRUE);
        e khatmahPresenter = khatmahWrapper.getKhatmahPresenter();
        String string = khatmahWrapper.getResources().getString(R.string.notification_permissions_title);
        j.d(string, "getString(...)");
        String string2 = khatmahWrapper.getResources().getString(R.string.notification_permissions_reminders_description);
        j.d(string2, "getString(...)");
        khatmahPresenter.getClass();
        khatmahPresenter.f8190f.b(string, string2);
    }

    private final AlarmManager getAlarmManager() {
        return (AlarmManager) this.f13795t.getValue();
    }

    public final e getKhatmahPresenter() {
        e eVar = this.f13796u;
        if (eVar != null) {
            return eVar;
        }
        j.k("khatmahPresenter");
        throw null;
    }

    public final void setKhatmahPresenter(e eVar) {
        j.e(eVar, "<set-?>");
        this.f13796u = eVar;
    }
}
