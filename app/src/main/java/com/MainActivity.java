package com.ayah;

import F2.t;
import G9.m;
import I1.G0;
import I1.I;
import I1.S;
import J3.x;
import K9.A;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.C0414g;
import N9.C0424q;
import N9.U;
import N9.k0;
import O9.y;
import P9.d;
import X.C0641m;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import com.ayah.common.data.dao.notification.ReminderDestination;
import com.ayah.feature.audio.service.AyahAudioService;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import com.ayah.ui.widget.DrawerViewPager2;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.moshi.C;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p020c.D;
import p035d3.B;
import p035d3.E;
import p035d3.G;
import p035d3.z;
import p053f.g;
import p056f2.F;
import p120l9.l;
import p144o3.e;
import p150o9.i;
import p151p.V;
import p165q3.f;
import p168q6.b;
import p181s2.s;
import p183s6.a;
import p218w3.c;
import p218w3.h;
import p218w3.n;
import p251z9.j;
import p251z9.w;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends Hilt_MainActivity implements a, U3.a {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ int f13622J0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public p218w3.a f13623A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public p025c4.a f13624B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public p236y3.a f13625C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public p144o3.a f13626D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public p227x3.a f13627E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public x f13628F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public p166q4.a f13629G0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Toolbar f13632W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public View f13633X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public DrawerLayout f13634Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public p176r6.a f13635Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ViewPager2 f13636a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public DrawerViewPager2 f13637b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public b f13638c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public p211v6.a f13639d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f13640e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ViewGroup f13641f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ViewGroup f13642g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f13643h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public E f13644i0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f13646k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f13647l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f13648m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f13649n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ReminderDestination f13650o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public A f13651p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f13652q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MenuItem f13653r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public J1 f13654s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f13655t0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public d f13657v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e f13658w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public c f13659x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public n f13660y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public h f13661z0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f13645j0 = -1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f13656u0 = -1;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final g f13630H0 = m(new F(2), new z(this));

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final p014b3.b f13631I0 = new p014b3.b(this);

    public final void A() {
        DrawerLayout drawerLayout = this.f13634Y;
        if (drawerLayout == null) {
            j.k("drawerLayout");
            throw null;
        }
        View viewE = drawerLayout.e(8388611);
        if (viewE != null ? DrawerLayout.k(viewE) : false) {
            return;
        }
        DrawerLayout drawerLayout2 = this.f13634Y;
        if (drawerLayout2 == null) {
            j.k("drawerLayout");
            throw null;
        }
        View viewE2 = drawerLayout2.e(8388611);
        if (viewE2 == null) {
            throw new IllegalArgumentException(p123m2.c.s("No drawer view found with gravity ", "LEFT"));
        }
        drawerLayout2.n(viewE2);
    }

    public final void B(p165q3.h hVar, boolean z10) {
        if (!z10 && Build.VERSION.SDK_INT >= 33 && s.c(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            if (hVar instanceof p165q3.g) {
                return;
            }
            p227x3.a aVarW = w();
            String string = getString(R.string.notification_permissions_title);
            j.d(string, "getString(...)");
            String string2 = getString(R.string.notification_permissions_audio_description);
            j.d(string2, "getString(...)");
            aVarW.b(string, string2);
            return;
        }
        boolean z11 = hVar instanceof p165q3.e;
        p165q3.g gVar = p165q3.g.f21293a;
        p150o9.c cVar = null;
        if (z11) {
            p165q3.e eVar = (p165q3.e) hVar;
            k kVar = eVar.f21290a;
            k kVar2 = eVar.f21291b;
            d dVar = this.f13657v0;
            if (dVar == null) {
                j.k("scope");
                throw null;
            }
            AbstractC0405x.x(dVar, null, new C0641m(this, kVar, kVar2, cVar, 5), 3);
            k0 k0Var = u().f20300b;
            k0Var.getClass();
            k0Var.n(null, gVar);
            return;
        }
        if (!j.a(hVar, f.f21292a)) {
            if (!j.a(hVar, gVar)) {
                throw new A6.a();
            }
            return;
        }
        d dVar2 = this.f13657v0;
        if (dVar2 == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0405x.x(dVar2, null, new y(this, cVar, 18), 3);
        k0 k0Var2 = u().f20300b;
        k0Var2.getClass();
        k0Var2.n(null, gVar);
    }

    public final void C() {
        ViewGroup viewGroup = this.f13641f0;
        if (viewGroup == null) {
            j.k("dialogViewArea");
            throw null;
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.f13641f0;
        if (viewGroup2 == null) {
            j.k("dialogViewArea");
            throw null;
        }
        viewGroup2.setVisibility(8);
        E e10 = this.f13644i0;
        if (e10 == null) {
            j.k("dialogDismissingBackCallback");
            throw null;
        }
        e10.e(false);
        p211v6.a aVar = this.f13639d0;
        if (aVar != null) {
            aVar.d();
        } else {
            j.k("systemUiHelper");
            throw null;
        }
    }

    public final void D() {
        ViewGroup viewGroup = this.f13641f0;
        if (viewGroup == null) {
            j.k("dialogViewArea");
            throw null;
        }
        int childCount = viewGroup.getChildCount();
        if (childCount > 1) {
            ViewGroup viewGroup2 = this.f13641f0;
            if (viewGroup2 != null) {
                viewGroup2.removeViewAt(childCount - 1);
            } else {
                j.k("dialogViewArea");
                throw null;
            }
        }
    }

    public final void E(int i10) {
        if (!this.f13655t0) {
            this.f13656u0 = i10;
            return;
        }
        LibraryComposePage libraryComposePage = new LibraryComposePage(this, i10);
        C();
        s(libraryComposePage);
        p211v6.a aVar = this.f13639d0;
        if (aVar != null) {
            aVar.d();
        } else {
            j.k("systemUiHelper");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        j.e(context, "newBase");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(p125m4.b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 2 && i11 == -1) {
            j.b(intent);
            if (intent.getBooleanExtra("THEME_CHANGED", false)) {
                b bVar = this.f13638c0;
                if (bVar != null) {
                    bVar.d();
                    return;
                } else {
                    j.k("rightAdapter");
                    throw null;
                }
            }
            return;
        }
        if (i10 != 3 || i11 != -1) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        j.b(intent);
        String stringExtra = intent.getStringExtra("EXTRA_RECITER_ID");
        Intent intent2 = new Intent(this, (Class<?>) AyahAudioService.class);
        intent2.setAction("com.ayah.action.SWITCH_RECITER");
        intent2.putExtra("RECITER_ID", stringExtra);
        p166q4.a aVar = this.f13629G0;
        if (aVar == null) {
            j.k("crashLogger");
            throw null;
        }
        aVar.a("starting audio service for switchReciter");
        startService(intent2);
    }

    @Override // com.ayah.Hilt_MainActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        p211v6.a iVar;
        int i10 = 0;
        B0.c.d0(getWindow(), false);
        super.onCreate(bundle);
        setContentView(R.layout.main);
        this.f13657v0 = AbstractC0405x.d();
        Realm.init(getApplicationContext());
        View viewFindViewById = findViewById(R.id.toolbar);
        j.d(viewFindViewById, "findViewById(...)");
        this.f13632W = (Toolbar) viewFindViewById;
        Resources resources = getResources();
        Resources.Theme theme = getTheme();
        ThreadLocal threadLocal = p244z1.j.f24770a;
        Drawable drawable = resources.getDrawable(R.drawable.ic_back, theme);
        p150o9.c cVar = null;
        if (drawable != null) {
            drawable.setTint(getResources().getColor(R.color.tint, getTheme()));
            Toolbar toolbar = this.f13632W;
            if (toolbar == null) {
                j.k("toolbar");
                throw null;
            }
            toolbar.setCollapseIcon(drawable);
        }
        View viewFindViewById2 = findViewById(R.id.toolbar_container);
        j.d(viewFindViewById2, "findViewById(...)");
        this.f13633X = viewFindViewById2;
        Toolbar toolbar2 = this.f13632W;
        if (toolbar2 == null) {
            j.k("toolbar");
            throw null;
        }
        q(toolbar2);
        int i11 = 1;
        int i12 = bundle != null ? bundle.getInt("SI_LAST_VIEW", 1) : 1;
        this.f13635Z = new p176r6.a(this, i12);
        View viewFindViewById3 = findViewById(R.id.dialog_view_area);
        j.d(viewFindViewById3, "findViewById(...)");
        this.f13641f0 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.search_results_area);
        j.d(viewFindViewById4, "findViewById(...)");
        this.f13642g0 = (ViewGroup) viewFindViewById4;
        this.f13652q0 = getResources().getColor(R.color.dialog_background, getTheme());
        View viewFindViewById5 = findViewById(R.id.bottom_bar);
        j.d(viewFindViewById5, "findViewById(...)");
        this.f13640e0 = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tafsir_selection);
        j.d(viewFindViewById6, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById6;
        this.f13643h0 = textView;
        textView.setOnClickListener(new p035d3.y(this, i10));
        n nVar = this.f13660y0;
        if (nVar == null) {
            j.k("tafsirModel");
            throw null;
        }
        int i13 = 15;
        int i14 = 2;
        C0424q c0424q = new C0424q(new C4.g(nVar.g, this, i13), new B(this, cVar, i10), 2);
        d dVar = this.f13657v0;
        if (dVar == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0419l.u(c0424q, dVar);
        E e10 = new E(this, i11);
        a().a(this, e10);
        this.f13644i0 = new E(this, i10);
        D dA = a();
        E e11 = this.f13644i0;
        if (e11 == null) {
            j.k("dialogDismissingBackCallback");
            throw null;
        }
        dA.a(this, e11);
        View viewFindViewById7 = findViewById(R.id.drawer_layout);
        j.d(viewFindViewById7, "findViewById(...)");
        DrawerLayout drawerLayout = (DrawerLayout) viewFindViewById7;
        this.f13634Y = drawerLayout;
        drawerLayout.setDrawerShadow(2131230879, 8388611);
        DrawerLayout drawerLayout2 = this.f13634Y;
        if (drawerLayout2 == null) {
            j.k("drawerLayout");
            throw null;
        }
        drawerLayout2.setDrawerLockMode(1);
        DrawerLayout drawerLayout3 = this.f13634Y;
        if (drawerLayout3 == null) {
            j.k("drawerLayout");
            throw null;
        }
        drawerLayout3.a(new p035d3.F(e10, this));
        View viewFindViewById8 = findViewById(R.id.right_pager);
        j.d(viewFindViewById8, "findViewById(...)");
        DrawerViewPager2 drawerViewPager2 = (DrawerViewPager2) viewFindViewById8;
        this.f13637b0 = drawerViewPager2;
        drawerViewPager2.setGravity(8388611);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        View viewFindViewById9 = findViewById(R.id.main_pager);
        j.d(viewFindViewById9, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById9;
        this.f13636a0 = viewPager2;
        viewPager2.setLayoutDirection(1);
        ViewPager2 viewPager3 = this.f13636a0;
        if (viewPager3 == null) {
            j.k("mainPager");
            throw null;
        }
        p176r6.a aVar = this.f13635Z;
        if (aVar == null) {
            j.k("mainAdapter");
            throw null;
        }
        viewPager3.setAdapter(aVar);
        ViewPager2 viewPager4 = this.f13636a0;
        if (viewPager4 == null) {
            j.k("mainPager");
            throw null;
        }
        ((ArrayList) viewPager4.f13051t.f13207b).add(this.f13631I0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.page_margin);
        ViewPager2 viewPager5 = this.f13636a0;
        if (viewPager5 == null) {
            j.k("mainPager");
            throw null;
        }
        viewPager5.setPageTransformer(new p014b3.c(dimensionPixelSize));
        p222w7.d dVar2 = new p222w7.d(1);
        dVar2.f23764c = new p230x6.a(dimensionPixelSize, getColor(R.color.separator), getColor(R.color.secondary_background));
        ViewPager2 viewPager6 = this.f13636a0;
        if (viewPager6 == null) {
            j.k("mainPager");
            throw null;
        }
        viewPager6.f13038A.i(dVar2);
        y(i12);
        int iIntValue = ((Number) AbstractC0405x.C(i.f20380r, new G(this, cVar, i10))).intValue();
        ViewPager2 viewPager7 = this.f13636a0;
        if (viewPager7 == null) {
            j.k("mainPager");
            throw null;
        }
        viewPager7.setCurrentItem(iIntValue - 1, false);
        if (Build.VERSION.SDK_INT >= 30) {
            ViewPager2 viewPager8 = this.f13636a0;
            if (viewPager8 == null) {
                j.k("mainPager");
                throw null;
            }
            z zVar = new z(this);
            j.e(viewPager8, "mainContainer");
            D0.y yVar = new D0.y();
            yVar.f1158s = zVar;
            Window window = getWindow();
            yVar.f1159t = new Handler(Looper.getMainLooper());
            yVar.f1160u = new G0(window, viewPager8);
            yVar.f1161v = new p211v6.b(i11, yVar);
            View decorView = window.getDecorView();
            C6.b bVar = new C6.b(27, yVar);
            WeakHashMap weakHashMap = S.f3689a;
            I.m(decorView, bVar);
            iVar = yVar;
        } else {
            z zVar2 = new z(this);
            ViewPager2 viewPager9 = this.f13636a0;
            if (viewPager9 == null) {
                j.k("mainPager");
                throw null;
            }
            iVar = new p074h0.i(this, zVar2, viewPager9);
        }
        this.f13639d0 = iVar;
        p050e8.b bVarP = p();
        if (bVarP != null) {
            bVarP.X();
            bVarP.V(true);
            bVarP.W();
        }
        this.f13648m0 = p125m4.b.b();
        this.f13638c0 = new b(this);
        DrawerViewPager2 drawerViewPager3 = this.f13637b0;
        if (drawerViewPager3 == null) {
            j.k("rightPager");
            throw null;
        }
        ViewPager2 pager = drawerViewPager3.getPager();
        b bVar2 = this.f13638c0;
        if (bVar2 == null) {
            j.k("rightAdapter");
            throw null;
        }
        pager.setAdapter(bVar2);
        pager.setOffscreenPageLimit(2);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(new z(this));
        DrawerViewPager2 drawerViewPager4 = this.f13637b0;
        if (drawerViewPager4 == null) {
            j.k("rightPager");
            throw null;
        }
        ((ArrayList) drawerViewPager4.getPager().f13051t.f13207b).add(new p014b3.d(bottomNavigationView, this));
        x xVar = this.f13628F0;
        if (xVar == null) {
            j.k("preferencesStore");
            throw null;
        }
        C0424q c0424q2 = new C0424q(xVar.f4313h, new R4.a(this, cVar, i14), 2);
        d dVar3 = this.f13657v0;
        if (dVar3 == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0419l.u(c0424q2, dVar3);
        p211v6.a aVar2 = this.f13639d0;
        if (aVar2 == null) {
            j.k("systemUiHelper");
            throw null;
        }
        aVar2.c(1000L);
        this.f13647l0 = true;
        View view = this.f13633X;
        if (view == null) {
            j.k("toolbarArea");
            throw null;
        }
        p017b7.g.J(view, new m(14));
        ViewGroup viewGroup = this.f13642g0;
        if (viewGroup == null) {
            j.k("searchResultsArea");
            throw null;
        }
        p017b7.g.J(viewGroup, new m(i13));
        View viewFindViewById10 = findViewById(R.id.right_drawer);
        j.d(viewFindViewById10, "findViewById(...)");
        int i15 = 16;
        p017b7.g.J(viewFindViewById10, new m(i15));
        View view2 = this.f13640e0;
        if (view2 == null) {
            j.k("bottomBar");
            throw null;
        }
        p017b7.g.J(view2, new m(17));
        c cVar2 = this.f13659x0;
        if (cVar2 == null) {
            j.k("jumpModel");
            throw null;
        }
        int i16 = 4;
        C0424q c0424q3 = new C0424q(new C0414g(AbstractC0419l.n(new U(cVar2.f23656e), 1), new p197u2.b(i16)), new B(this, cVar, i11), 2);
        d dVar4 = this.f13657v0;
        if (dVar4 == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0419l.u(c0424q3, dVar4);
        String stringExtra = getIntent().getStringExtra("EXTRA_REMINDER_DESTINATION");
        if (stringExtra != null) {
            this.f13650o0 = (ReminderDestination) AbstractC0813f2.l(new C(new com.squareup.moshi.z(0)), w.b(ReminderDestination.class)).b(stringExtra);
        }
        C0424q c0424q4 = new C0424q(u().f20301c, new B(this, cVar, i14), 2);
        d dVar5 = this.f13657v0;
        if (dVar5 == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0419l.u(c0424q4, dVar5);
        C0424q c0424q5 = new C0424q(new C4.c(u().f20302d, i13), new B(this, cVar, 3), 2);
        d dVar6 = this.f13657v0;
        if (dVar6 == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0419l.u(c0424q5, dVar6);
        C0424q c0424q6 = new C0424q(new C4.c(w().f24366d, i15), new B(this, cVar, i16), 2);
        d dVar7 = this.f13657v0;
        if (dVar7 == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0419l.u(c0424q6, dVar7);
        C0424q c0424q7 = new C0424q(w().f24367e, new B(this, cVar, 5), 2);
        d dVar8 = this.f13657v0;
        if (dVar8 != null) {
            AbstractC0419l.u(c0424q7, dVar8);
        } else {
            j.k("scope");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        j.e(menu, "menu");
        getMenuInflater().inflate(R.menu.main, menu);
        this.f13653r0 = menu.findItem(R.id.search);
        J1 j10 = this.f13654s0;
        int i10 = 1;
        if (j10 == null) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            j10 = new J1(new B3.f(12, this), new t(i12, this, MainActivity.class, "showSearch", "showSearch()V", i13, i11, 6), new t(i12, this, MainActivity.class, "hideSearch", "hideSearch()V", i13, i11, 7), this.f13648m0, new I4.e(this, i10));
        }
        this.f13654s0 = j10;
        boolean z10 = j10.f14055b;
        MenuItem menuItemFindItem = menu.findItem(R.id.search);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.action_today);
        j.d(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = menu.findItem(R.id.settings);
        j.d(menuItemFindItem3, "findItem(...)");
        p239y6.a aVar = (p239y6.a) j10.f14057d;
        List listS = l.S(new MenuItem[]{menuItemFindItem2, menuItemFindItem3});
        aVar.getClass();
        ArrayList arrayList = aVar.f24652d;
        arrayList.clear();
        arrayList.addAll(listS);
        menuItemFindItem.setOnActionExpandListener(aVar);
        View actionView = menuItemFindItem.getActionView();
        SearchView searchView = actionView instanceof SearchView ? (SearchView) actionView : null;
        if (searchView != null) {
            String string = searchView.getContext().getResources().getString(R.string.search_hint);
            j.d(string, "getString(...)");
            SpannableString spannableString = new SpannableString(string);
            if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, string.length(), 33);
            }
            searchView.setTextDirection(z10 ? 7 : 6);
            searchView.post(new F2.x(18, searchView, spannableString));
            searchView.setOnQueryTextListener(new V(j10));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.ayah.Hilt_MainActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ViewPager2 viewPager2 = this.f13636a0;
        if (viewPager2 == null) {
            j.k("mainPager");
            throw null;
        }
        viewPager2.setAdapter(null);
        DrawerViewPager2 drawerViewPager2 = this.f13637b0;
        if (drawerViewPager2 == null) {
            j.k("rightPager");
            throw null;
        }
        drawerViewPager2.getPager().setAdapter(null);
        d dVar = this.f13657v0;
        if (dVar == null) {
            j.k("scope");
            throw null;
        }
        AbstractC0405x.h(dVar, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A();
            return true;
        }
        if (itemId != R.id.action_today) {
            if (itemId != R.id.settings) {
                return super.onOptionsItemSelected(menuItem);
            }
            startActivityForResult(new Intent(this, (Class<?>) PreferencesActivity.class), 2);
            return true;
        }
        s(new TodayPage(this));
        p211v6.a aVar = this.f13639d0;
        if (aVar != null) {
            aVar.d();
            return true;
        }
        j.k("systemUiHelper");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.f13655t0 = false;
        A a9 = this.f13651p0;
        if (a9 != null) {
            a9.e(null);
        }
        this.f13651p0 = null;
        super.onPause();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        j.e(menu, "menu");
        int color = getColor(R.color.tint);
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            Drawable icon = menu.getItem(i10).getIcon();
            if (icon != null && (drawableMutate2 = icon.mutate()) != null) {
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
        }
        Toolbar toolbar = this.f13632W;
        if (toolbar == null) {
            j.k("toolbar");
            throw null;
        }
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null && (drawableMutate = navigationIcon.mutate()) != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        Toolbar toolbar2 = this.f13632W;
        if (toolbar2 != null) {
            toolbar2.setTitleTextColor(color);
            return super.onPrepareOptionsMenu(menu);
        }
        j.k("toolbar");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f13655t0 = true;
        p150o9.c cVar = null;
        if (AyahAudioService.f13735O) {
            d dVar = this.f13657v0;
            if (dVar == null) {
                j.k("scope");
                throw null;
            }
            this.f13651p0 = AbstractC0405x.x(dVar, null, new G(this, cVar, 1), 3);
        }
        this.f13646k0 = System.currentTimeMillis() + ((long) 500);
        if (!this.f13647l0 && !this.f13649n0) {
            p211v6.a aVar = this.f13639d0;
            if (aVar == null) {
                j.k("systemUiHelper");
                throw null;
            }
            aVar.c(250L);
            if (p125m4.b.b() != this.f13648m0) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        }
        int i10 = this.f13656u0;
        ReminderDestination reminderDestination = this.f13650o0;
        if (i10 > -1) {
            E(i10);
        } else if (this.f13647l0 && reminderDestination != null) {
            if (reminderDestination instanceof ReminderDestination.Sura) {
                ViewPager2 viewPager2 = this.f13636a0;
                if (viewPager2 == null) {
                    j.k("mainPager");
                    throw null;
                }
                viewPager2.post(new F2.x(4, this, reminderDestination));
            } else if (reminderDestination instanceof ReminderDestination.Bookmark) {
                c cVar2 = this.f13659x0;
                if (cVar2 == null) {
                    j.k("jumpModel");
                    throw null;
                }
                BookmarkType bookmarkType = ((ReminderDestination.Bookmark) reminderDestination).f13670a;
                j.e(bookmarkType, "bookmarkType");
                AbstractC0405x.x(cVar2.f23655d, null, new C0641m(cVar2, bookmarkType, cVar, 18), 3);
            } else if (reminderDestination.equals(k3.c.f18970a)) {
                A();
                DrawerViewPager2 drawerViewPager2 = this.f13637b0;
                if (drawerViewPager2 == null) {
                    j.k("rightPager");
                    throw null;
                }
                drawerViewPager2.getPager().setCurrentItem(1);
            } else if (reminderDestination.equals(k3.e.f18972a)) {
                s(new TodayPage(this));
                p211v6.a aVar2 = this.f13639d0;
                if (aVar2 == null) {
                    j.k("systemUiHelper");
                    throw null;
                }
                aVar2.d();
            } else if (!reminderDestination.equals(k3.d.f18971a)) {
                throw new A6.a();
            }
        }
        this.f13656u0 = -1;
        this.f13647l0 = false;
        this.f13649n0 = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        j.e(bundle, "outState");
        p176r6.a aVar = this.f13635Z;
        if (aVar == null) {
            j.k("mainAdapter");
            throw null;
        }
        bundle.putInt("SI_LAST_VIEW", aVar.f21574v);
        super.onSaveInstanceState(bundle);
    }

    public final void s(FrameLayout frameLayout) {
        ViewGroup viewGroup = this.f13641f0;
        if (viewGroup == null) {
            j.k("dialogViewArea");
            throw null;
        }
        viewGroup.setBackgroundColor(this.f13652q0);
        ViewGroup viewGroup2 = this.f13641f0;
        if (viewGroup2 == null) {
            j.k("dialogViewArea");
            throw null;
        }
        viewGroup2.addView(frameLayout, -1, -1);
        ViewGroup viewGroup3 = this.f13641f0;
        if (viewGroup3 == null) {
            j.k("dialogViewArea");
            throw null;
        }
        viewGroup3.setVisibility(0);
        E e10 = this.f13644i0;
        if (e10 != null) {
            e10.e(true);
        } else {
            j.k("dialogDismissingBackCallback");
            throw null;
        }
    }

    public final void t() {
        p211v6.a aVar = this.f13639d0;
        if (aVar == null) {
            j.k("systemUiHelper");
            throw null;
        }
        if (aVar.a()) {
            p211v6.a aVar2 = this.f13639d0;
            if (aVar2 != null) {
                aVar2.c(250L);
                return;
            } else {
                j.k("systemUiHelper");
                throw null;
            }
        }
        DrawerLayout drawerLayout = this.f13634Y;
        if (drawerLayout != null) {
            drawerLayout.d(false);
        } else {
            j.k("drawerLayout");
            throw null;
        }
    }

    public final p144o3.a u() {
        p144o3.a aVar = this.f13626D0;
        if (aVar != null) {
            return aVar;
        }
        j.k("audioPlaybackModel");
        throw null;
    }

    public final int v() {
        ViewPager2 viewPager2 = this.f13636a0;
        if (viewPager2 != null) {
            return viewPager2.getCurrentItem() + 1;
        }
        j.k("mainPager");
        throw null;
    }

    public final p227x3.a w() {
        p227x3.a aVar = this.f13627E0;
        if (aVar != null) {
            return aVar;
        }
        j.k("permissionsModel");
        throw null;
    }

    public final void x(int i10) {
        ViewPager2 viewPager2 = this.f13636a0;
        if (viewPager2 == null) {
            j.k("mainPager");
            throw null;
        }
        viewPager2.setCurrentItem(i10 - 1);
        ViewPager2 viewPager3 = this.f13636a0;
        if (viewPager3 != null) {
            viewPager3.post(new M.d(i10, 2, this));
        } else {
            j.k("mainPager");
            throw null;
        }
    }

    public final void y(int i10) {
        if (i10 == 1) {
            TextView textView = this.f13643h0;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                j.k("tafsirSelection");
                throw null;
            }
        }
        TextView textView2 = this.f13643h0;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            j.k("tafsirSelection");
            throw null;
        }
    }

    public final void z(boolean z10) {
        float f3;
        float height;
        p025c4.a aVar = this.f13624B0;
        if (aVar == null) {
            j.k("drawerVisibilityModel");
            throw null;
        }
        k0 k0Var = aVar.f13461b;
        Boolean boolValueOf = Boolean.valueOf(z10);
        k0Var.getClass();
        k0Var.n(null, boolValueOf);
        View view = this.f13633X;
        if (view == null) {
            j.k("toolbarArea");
            throw null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        if (z10) {
            f3 = 0.0f;
        } else {
            View view2 = this.f13633X;
            if (view2 == null) {
                j.k("toolbarArea");
                throw null;
            }
            f3 = -view2.getHeight();
        }
        viewPropertyAnimatorAnimate.translationY(f3).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).start();
        View view3 = this.f13640e0;
        if (view3 == null) {
            j.k("bottomBar");
            throw null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
        if (z10) {
            height = 0.0f;
        } else {
            float f7 = 2;
            View view4 = this.f13640e0;
            if (view4 == null) {
                j.k("bottomBar");
                throw null;
            }
            height = f7 * view4.getHeight();
        }
        viewPropertyAnimatorAnimate2.translationY(height).alpha(z10 ? 1.0f : 0.0f).setDuration(250L).start();
        if (z10) {
            DrawerLayout drawerLayout = this.f13634Y;
            if (drawerLayout != null) {
                drawerLayout.setDrawerLockMode(0);
                return;
            } else {
                j.k("drawerLayout");
                throw null;
            }
        }
        DrawerLayout drawerLayout2 = this.f13634Y;
        if (drawerLayout2 == null) {
            j.k("drawerLayout");
            throw null;
        }
        View viewE = drawerLayout2.e(8388611);
        if (!(viewE != null ? DrawerLayout.m(viewE) : false)) {
            DrawerLayout drawerLayout3 = this.f13634Y;
            if (drawerLayout3 == null) {
                j.k("drawerLayout");
                throw null;
            }
            View viewE2 = drawerLayout3.e(8388613);
            if (!(viewE2 != null ? DrawerLayout.m(viewE2) : false)) {
                DrawerLayout drawerLayout4 = this.f13634Y;
                if (drawerLayout4 == null) {
                    j.k("drawerLayout");
                    throw null;
                }
                drawerLayout4.setDrawerLockMode(1);
            }
        }
        MenuItem menuItem = this.f13653r0;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            return;
        }
        menuItem.collapseActionView();
    }
}
