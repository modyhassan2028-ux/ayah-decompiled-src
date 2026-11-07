package com.ayah.feature.reciterlist;

import G.V;
import I1.I;
import I1.S;
import K9.AbstractC0405x;
import L5.c;
import P9.d;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.WeakHashMap;
import p000a.a;
import p020c.l;
import p125m4.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RecitersActivity extends Hilt_RecitersActivity {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f13853Z = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final d f13854W = a.a();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public J5.a f13855X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public c f13856Y;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        j.e(context, "newBase");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // com.ayah.feature.reciterlist.Hilt_RecitersActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a(this);
        setContentView(R.layout.reciters);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        J5.a aVar = new J5.a(this, recyclerView, new I5.b(this, 0), new I5.b(this, 1));
        this.f13855X = aVar;
        recyclerView.setAdapter(aVar);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar);
        materialToolbar.setTitle(R.string.select_reciter);
        materialToolbar.setNavigationOnClickListener(new E5.b(1, this));
        A8.c cVar = new A8.c(18);
        WeakHashMap weakHashMap = S.f3689a;
        I.m(materialToolbar, cVar);
        I.m(recyclerView, new A8.c(19));
    }

    @Override // com.ayah.feature.reciterlist.Hilt_RecitersActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        AbstractC0405x.h(this.f13854W, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AbstractC0405x.x(this.f13854W, null, new V(getIntent().getIntExtra("EXTRA_PAGE_NUMBER", 1), 1, this, null), 3);
    }
}
