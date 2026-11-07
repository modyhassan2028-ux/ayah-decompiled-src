package com.ayah.feature.reciterlist.qari;

import E2.E;
import E2.F;
import E2.F0;
import E2.H;
import E2.I;
import E2.J;
import I1.S;
import I4.f;
import K0.C0362p;
import K9.AbstractC0405x;
import K9.C0401t;
import N5.c;
import P5.g;
import P9.d;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.a;
import p020c.l;
import p125m4.b;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QariAudioActivity extends Hilt_QariAudioActivity {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f13858a0 = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final d f13859W = a.a();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public c f13860X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MaterialToolbar f13861Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public g f13862Z;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        j.e(context, "newBase");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // com.ayah.feature.reciterlist.qari.Hilt_QariAudioActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a(this);
        setContentView(R.layout.qari_audio);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        c cVar = new c(this, new C0362p(2, this, QariAudioActivity.class, "downloadFile", "downloadFile(Lcom/ayah/common/data/dao/audio/ReciterDao;I)V", 0, 0, 1), new C0362p(2, this, QariAudioActivity.class, "cancelDownload", "cancelDownload(Lcom/ayah/common/data/dao/audio/ReciterDao;I)V", 0, 0, 2), new C0362p(2, this, QariAudioActivity.class, "canRemoveFile", "canRemoveFile(Lcom/ayah/common/data/dao/audio/ReciterDao;I)Z", 0, 0, 3), new C0362p(2, this, QariAudioActivity.class, "deleteFile", "deleteFile(Lcom/ayah/common/data/dao/audio/ReciterDao;I)V", 0, 0, 4));
        this.f13860X = cVar;
        recyclerView.setAdapter(cVar);
        int color = getColor(R.color.red_bookmark);
        c cVar2 = this.f13860X;
        if (cVar2 == null) {
            j.k("qariAudioAdapter");
            throw null;
        }
        E5.c cVar3 = new E5.c(1, cVar2, c.class, "swipeItem", "swipeItem(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", 0, 0, 6);
        if (cVar2 == null) {
            j.k("qariAudioAdapter");
            throw null;
        }
        J j = new J(new Q5.a(color, cVar3, new E5.c(1, cVar2, c.class, "canSwipe", "canSwipe(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", 0, 0, 7)));
        RecyclerView recyclerView2 = j.f1532r;
        if (recyclerView2 != recyclerView) {
            E e10 = j.f1540z;
            if (recyclerView2 != null) {
                recyclerView2.h0(j);
                RecyclerView recyclerView3 = j.f1532r;
                recyclerView3.f12869H.remove(e10);
                if (recyclerView3.f12871I == e10) {
                    recyclerView3.f12871I = null;
                }
                ArrayList arrayList = j.f1532r.T;
                if (arrayList != null) {
                    arrayList.remove(j);
                }
                ArrayList arrayList2 = j.f1530p;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    F f3 = (F) arrayList2.get(0);
                    f3.g.cancel();
                    F0 f7 = f3.f1475e;
                    j.f1527m.getClass();
                    H.a(f7);
                }
                arrayList2.clear();
                j.f1537w = null;
                VelocityTracker velocityTracker = j.f1534t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    j.f1534t = null;
                }
                I i10 = j.f1539y;
                if (i10 != null) {
                    i10.f1511a = false;
                    j.f1539y = null;
                }
                if (j.f1538x != null) {
                    j.f1538x = null;
                }
            }
            j.f1532r = recyclerView;
            Resources resources = recyclerView.getResources();
            j.f1522f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            j.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            j.f1531q = ViewConfiguration.get(j.f1532r.getContext()).getScaledTouchSlop();
            j.f1532r.i(j);
            j.f1532r.f12869H.add(e10);
            RecyclerView recyclerView4 = j.f1532r;
            if (recyclerView4.T == null) {
                recyclerView4.T = new ArrayList();
            }
            recyclerView4.T.add(j);
            j.f1539y = new I(j);
            j.f1538x = new GestureDetector(j.f1532r.getContext(), j.f1539y);
        }
        View viewFindViewById = findViewById(R.id.toolbar);
        j.d(viewFindViewById, "findViewById(...)");
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        this.f13861Y = materialToolbar;
        q(materialToolbar);
        p050e8.b bVarP = p();
        if (bVarP != null) {
            bVarP.V(true);
        }
        String stringExtra = getIntent().getStringExtra("reciterId");
        if (stringExtra != null) {
            AbstractC0405x.x(this.f13859W, null, new f(this, stringExtra, b.b(), (p150o9.c) null), 3);
        } else {
            finish();
        }
        MaterialToolbar materialToolbar2 = this.f13861Y;
        if (materialToolbar2 == null) {
            j.k("materialToolbar");
            throw null;
        }
        J1.c cVar4 = new J1.c(11);
        WeakHashMap weakHashMap = S.f3689a;
        I1.I.m(materialToolbar2, cVar4);
        I1.I.m(recyclerView, new J1.c(12));
    }

    @Override // com.ayah.feature.reciterlist.qari.Hilt_QariAudioActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        g gVarS = s();
        AbstractC0405x.h(gVarS.f6709h, null);
        gVarS.f6710i = u0.a(0, 7, null);
        gVarS.f6709h = AbstractC0405x.z(AbstractC0405x.d(), new C0401t("QariAudioDownloadScope"));
        AbstractC0405x.h(this.f13859W, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final g s() {
        g gVar = this.f13862Z;
        if (gVar != null) {
            return gVar;
        }
        j.k("qariAudioPresenter");
        throw null;
    }
}
